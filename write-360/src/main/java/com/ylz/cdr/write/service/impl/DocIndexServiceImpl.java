package com.ylz.cdr.write.service.impl;

import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.common.CdrUtil;
import com.ylz.cdr.common.ConstantUtil;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.write.dao.DocIndexCdrMapper;
import com.ylz.cdr.write.service.IAnalyService;
import com.ylz.cdr.write.service.IDocIndexService;
import com.ylz.cdr.write.service.IPatientService;
import com.ylz.cdr.write.service.IVisitService;
import com.ylz.cdr.write.vo.VisitVo;
import com.ylz.file.factory.FileFactory;
import com.ylz.file.service.IFileSystemService;
import com.ylz.person.bean.PatientVisit;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service("docIndexService")
public class DocIndexServiceImpl implements IDocIndexService {

    private static final Logger log = LoggerFactory.getLogger(DocIndexServiceImpl.class);

    @Autowired
    private DocIndexCdrMapper docIndexCdrMapper;
    @Autowired
    private IAnalyService analyService;
    @Autowired
    private IPatientService patientService;
    @Autowired
    private IVisitService visitService;
    @Autowired
    private FileFactory fileFactory;
    @Value("${storage.code}")
    private String storageCode;
    @Value("${cda.prefix}")
    private String cdaPrefix;
    @Value("${source.prefix}")
    private String sourcePrefix;

    @Override
    public String saveOrUpdate(Map<String, Object> map, String empi, String encounterId, String xml, boolean isCda) {
        try {
            DocIndex docIndex = setDocIndex(map, empi, encounterId);
            docIndex.setSyncStatus(Constants.CDA_SYNC_STATUS);
            if (CdrUtil.isNull(docIndex.getCreateTime(), docIndex.getDomainId(), docIndex.getUniqueId(),
                    docIndex.getXdsType(), docIndex.getXdsName(),
                    docIndex.getEffectiveTime(), docIndex.getCustodianCode(), docIndex.getCustodianName(),
                    docIndex.getPatientName()
                   /* ,docIndex.getHospitalName(),docIndex.getHospitalCode(),docIndex.getPatientId(),
                   docIndex.getVisitTime(),docIndex.getXdsCreater(),
                   docIndex.getXdsCreaterSign(),docIndex.getDeptCode(),docIndex.getIdentifyNo() */
            )) {
                log.error("必填字段为空");
                return Constants.FAILED_STATUS;
            }
            DocIndex hisData = docIndexCdrMapper.queryByUniqueId(docIndex.getUniqueId(), docIndex.getDomainId(), docIndex.getXdsType(), docIndex.getXdsVersion());
            if (null != hisData) {
                if (hisData.getEffectiveTime().compareTo(docIndex.getEffectiveTime()) >= 0) {
                    return Constants.ABANDON_STATUS;
                }
                docIndex.setPk(hisData.getPk());
                String procStatus = getStatus(empi);
                docIndex.setProcStatus(procStatus);
                docIndexCdrMapper.update(docIndex);
                return procStatus;
            }
            String filePath = getPath(isCda, docIndex, Constants.XML_SUFFIX);
            IFileSystemService fileSystemService = fileFactory.getFileSystemService(storageCode);
            String returnPath = fileSystemService.uploadStringToFile(xml, filePath);
            if (StringUtils.isEmpty(returnPath)) {
                log.error("文档上传出错！");
                return Constants.FAILED_STATUS;
            }
            setPath(docIndex, isCda, filePath);
            String procStatus = getStatus(empi);
            docIndex.setProcStatus(procStatus);
            docIndexCdrMapper.insert(docIndex);
            return procStatus;
        } catch (Exception e) {
            log.error("文档保存到DOC_INDEX出错，{}，{}", e.getMessage(), e);
            return Constants.FAILED_STATUS;
        }
    }

    /**
     * 根据empi获取状态
     *
     * @param empi
     * @return
     */
    private String getStatus(String empi) {
        if (StringUtils.isEmpty(empi)) {
            return Constants.EMPI_ERROR_STATUS;
        } else {
            return Constants.SUCCESS_STATUS;
        }
    }

    /**
     * 文档路径写入
     *
     * @param docIndex
     * @param isCda
     * @param filePath
     */
    private void setPath(DocIndex docIndex, boolean isCda, String filePath) {
        if (isCda) {
            docIndex.setCdaPath(filePath);
        } else {
            docIndex.setFilePath(filePath);
        }
    }

    /**
     * 获取文件路径
     *
     * @param isCda
     * @param docIndex
     * @param suffix
     * @return
     */
    private String getPath(boolean isCda, DocIndex docIndex, String suffix) {
        String prefix = sourcePrefix;
        if (isCda) {
            prefix = cdaPrefix;
        }
        return new StringBuffer().append(prefix).append(docIndex.getDomainId()).append("/").append(docIndex.getXdsType()).append("/").
                append(docIndex.getUniquePk()).append(suffix).toString();
    }

    @Override
    public VisitVo syncDocIndex(String tableName, String docCode, DocIndex docIndex) throws Exception {
        VisitVo visitVo = new VisitVo(Constants.EMPI_ERROR_STATUS);
        DocIndex hisDoc = docIndexCdrMapper.queryByUniqueId(docIndex.getUniqueId(), docIndex.getDomainId(), docIndex.getXdsType(), docIndex.getXdsVersion());
        docIndex.setSyncStatus(Constants.CDA_BEGIN_STATUS);
        if (null == hisDoc) {
            visitVo = getVisitVo(docIndex);
            if (null != visitVo) {
                docIndexCdrMapper.insert(docIndex);
                return visitVo;
            }
            docIndex.setProcStatus(Constants.EMPI_ERROR_STATUS);
            docIndexCdrMapper.insert(docIndex);
            visitVo = new VisitVo(Constants.EMPI_ERROR_STATUS);
            return visitVo;

        }
        if (hisDoc.getEffectiveTime().compareTo(docIndex.getEffectiveTime()) >= 0) {
            visitVo.setProcStatus(Constants.ABANDON_STATUS);
            docIndex.setProcStatus(Constants.ABANDON_STATUS);
            return visitVo;
        }
        docIndex.setPk(hisDoc.getPk());
        visitVo = getVisitVo(docIndex);
        if (null != visitVo) {
            docIndexCdrMapper.update(docIndex);
            return visitVo;
        }
        docIndex.setProcStatus(Constants.EMPI_ERROR_STATUS);
        docIndexCdrMapper.update(docIndex);
        visitVo = new VisitVo(Constants.EMPI_ERROR_STATUS);
        return visitVo;
    }

    @Override
    public VisitVo queryEmpi(DocIndex docIndex) {
        VisitVo visitVo = getVisitVo(docIndex);
        if (null == visitVo) {
            docIndex.setProcStatus(Constants.EMPI_ERROR_STATUS);
            visitVo = new VisitVo(Constants.EMPI_ERROR_STATUS);
        }
        return visitVo;
    }

    @Override
    public List<DocIndex> queryByStatus(List<String> status) throws Exception {
        return docIndexCdrMapper.queryByStatus(status);
    }

    @Override
    public void updateStatus(DocIndex docIndex) throws Exception {
        docIndexCdrMapper.updateStatus(docIndex);
    }

    @Override
    public List<DocIndex> querySyncData(String tableName, String syncStatus) throws Exception {
        return docIndexCdrMapper.querySyncData(tableName, syncStatus);
    }

    @Override
    public void updateProcInfoByPk(VisitVo visitVo, DocIndex docIndex) throws Exception {
        analyService.updateEmpi(docIndex, visitVo.getEmpi(), visitVo.getEncounterId());
    }

    private VisitVo getVisitVo(DocIndex docIndex) {
        String visitId = docIndex.getVisitId() + docIndex.getVisitTimes();
        PatientVisit patientVisit = visitService.queryData(visitId, "1.2.156.112747.001.001.1.4", docIndex.getPatientTypeCode());
        if (null == patientVisit) {
            return null;
        }
        String empi = patientService.getEmpi(patientVisit.getPatientId(), patientVisit.getPatientDomainId());
        if (StringUtils.isEmpty(empi)) {
            return null;
        }
        VisitVo visitVo = new VisitVo(patientVisit.getGlobalId(), patientVisit.getEncounterId(), patientVisit.getPatientId(),
                patientVisit.getVisitId(), patientVisit.getVisitDomainId(),
                null, patientVisit.getPatientCategory(), patientVisit.getPatientCategoryCode());
        docIndex.setEncounterId(visitVo.getEncounterId());
        docIndex.setEmpi(empi);
        docIndex.setPatientId(visitVo.getPatientId());
        visitVo.setProcStatus(Constants.SUCCESS_STATUS);
        docIndex.setProcStatus(Constants.SUCCESS_STATUS);
        return visitVo;
    }

    private DocIndex setDocIndex(Map<String, Object> map, String empi, String encounterId) {
        DocIndex docIndex = new DocIndex();
        docIndex.setEncounterId(encounterId);
        docIndex.setEmpi(empi);
        docIndex.setMessageId(getValue(map, "messageId"));
        docIndex.setCreateTime(ConstantUtil.FORMAT.format(new Date()));
        docIndex.setDomainId(getValue(map, "docDomainId"));
        docIndex.setUniqueId(getValue(map, "docPipelineId"));
        docIndex.setXdsType(getValue(map, "loadType"));
        docIndex.setXdsName(getValue(map, "reportTitle"));
        docIndex.setXdsNode(getValue(map, "reportTitle"));
        docIndex.setEffectiveTime(getValue(map, "docEffectiveTime"));
        docIndex.setSecurityLevel(getValue(map, "docCryptographiccode"));
        docIndex.setSecurityLevelName(getValue(map, "docCryptographic"));
        docIndex.setXdsVersion(getValue(map, "version"));
        docIndex.setPatientId(getValue(map, "patientId"));
        docIndex.setInpatientId(getValue(map, "inpatient"));
        docIndex.setClincId(getValue(map, "outPatientId"));
        docIndex.setVisitTime(getValue(map, "visitDate"));
        docIndex.setIdentifyNo(getValue(map, "idNum"));
        docIndex.setPatientName(getValue(map, "patientName"));
        docIndex.setHospitalCode(getValue(map, "hospitalCode"));
        docIndex.setHospitalName(getValue(map, "hospitalName"));
        docIndex.setDeptCode(getValue(map, "deptCode"));
        switch (docIndex.getXdsType()) {
            case "C0001":
                docIndex.setCreaterId(getValue(map, "archivistCode"));
                docIndex.setCreater(getValue(map, "archivistName"));
                break;
            case "C0002":
                docIndex.setCreaterId(getValue(map, "visitDoctorCode"));
                docIndex.setCreater(getValue(map, "visitDoctor"));
                break;
            case "C0003":
                docIndex.setCreaterId(getValue(map, "visitDoctorCode"));
                docIndex.setCreater(getValue(map, "visitDoctor"));
                break;
            case "C0004":
                docIndex.setCreaterId(getValue(map, "openOrderCode"));
                docIndex.setCreater(getValue(map, "openName"));
                break;
            case "C0005":
                docIndex.setCreaterId(getValue(map, "openOrderCode"));
                docIndex.setCreater(getValue(map, "docAuthor"));
                break;
            case "C0006":
                docIndex.setCreaterId(getValue(map, "reporCode"));
                docIndex.setCreater(getValue(map, "openName"));
                break;
            case "C0007":
                docIndex.setCreaterId(getValue(map, "reporCode"));
                docIndex.setCreater(getValue(map, "reportName"));
                break;
            case "C0023":
                docIndex.setCreaterId(getValue(map, "visitingCode"));
                docIndex.setCreater(getValue(map, "visitingName"));
                break;
            case "C0024":
                docIndex.setCreaterId(getValue(map, "visitingCode"));
                docIndex.setCreater(getValue(map, "visitingName"));
                break;
            case "C0025":
                docIndex.setCreaterId(getValue(map, "visitingCode"));
                docIndex.setCreater(getValue(map, "visitingName"));
                break;
            default:
                docIndex.setCreaterId(getValue(map, "docAuthorcode"));
                docIndex.setCreater(getValue(map, "docAuthor"));
                break;
        }

        docIndex.setCustodianCode(getValue(map, "docCustodiancode"));
        docIndex.setCustodianName(getValue(map, "docCustodian"));
        docIndex.setVisitDomain(getValue(map, "visitDomain"));
        docIndex.setVisitId(getValue(map, "visitId"));
        docIndex.setVisitTimes(getValue(map, "visitTimes"));
        docIndex.setPatientType(getValue(map, "patientType"));
        docIndex.setPatientTypeCode(getValue(map, "patientTypeCode"));
        return docIndex;
    }

    private String getValue(Map<String, Object> map, String key) {
        if (map.containsKey(key)) {
            Object object = map.get(key);
            if (null == object) {
                return null;
            }
            return String.valueOf(object);
        }
        return null;
    }
}
