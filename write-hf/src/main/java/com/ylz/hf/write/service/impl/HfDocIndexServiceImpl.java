package com.ylz.hf.write.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.dict.bean.MetaConfigList;
import com.ylz.dict.service.IMetaConfigService;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.dao.DocIndexMapper;
import com.ylz.hf.write.service.IAnalyService;
import com.ylz.hf.write.service.IHfDocIndexService;
import com.ylz.hf.write.tool.TransElement;
import com.ylz.hf.write.vo.HfDocIndexVo;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.service.IDocService;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service("hfDocIndexService")
public class HfDocIndexServiceImpl extends ServiceImpl<DocIndexMapper, DocIndex> implements IHfDocIndexService {
    private static final Logger log = LoggerFactory.getLogger(HfDocIndexServiceImpl.class);

    @Autowired
    private DocIndexMapper hfDocIndexMapper;
    @Autowired
    private IDocService docService;
    @Autowired
    private IAnalyService analyService;
    @Autowired
    private IMetaConfigService metaConfigService;
    @Autowired
    private PersonInfoServiceImpl personInfoService;
    @Autowired
    private FileServiceImpl filService;

    @Value("${source.prefix}")
    private String sourcePrefix;
    @Value("${cda.prefix}")
    private String cdaPrefix;
    @Value("${pdf.prefix}")
    private String pdfPrefix;

    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public ResponseBean saveOrUpdateXds(HfDocIndexVo hfDocIndexVo, boolean isInsert, String sourceXml) {
        ResponseBean responseBean = new ResponseBean();
        List<ManagerDoc> hfDocList = docService.getHfDocMap().get(hfDocIndexVo.getTitle());
        if (CollectionUtils.isEmpty(hfDocList)) {
            responseBean.setMessage(hfDocIndexVo.getTitle() + ":类型不存在！");
            return responseBean;
        }
        ManagerDoc hfDoc = hfDocList.get(0);
        DocIndex hfDocIndex = setHfDocIndex(hfDocIndexVo);
        hfDocIndex.setXdsType(hfDoc.getDocCode());
        DocIndex hisInfo = getHisData(hfDocIndex);
        /*if (!procHisGate(hisInfo, isInsert)) {
            String errorMessage = "更新文档不存在!";
            if (isInsert) {
                errorMessage = "文档已经注册!";
            }
            responseBean.setMessage(errorMessage);
            return responseBean;
        }*/
        //PDF或者CDA上传
        if (!setDocFile(hfDocIndex, hfDocIndexVo, hisInfo)) {
            responseBean.setMessage("文档上传出错");
            return responseBean;
        }
        hfDocIndex.setContent(null);
        String xdsPath = new StringBuffer().append(sourcePrefix).append(hfDocIndex.getDomainId()).append("/").
                append(hfDocIndex.getXdsType()).append("/").
                append(hfDocIndex.getUniquePk()).append(Constants.XML_SUFFIX).toString();
        String returnPath = filService.uploadStringToFile(sourceXml, xdsPath);
        if (StringUtils.isEmpty(returnPath)) {
            responseBean.setMessage("源文件上传出错！");
            return responseBean;
        }
        hfDocIndex.setFilePath(xdsPath);
        hfDocIndex.setCdaStatus(Constants.START_STATUS);
        if (null != hisInfo) {
            hfDocIndex.setRepositoryUniqueId(hisInfo.getRepositoryUniqueId());
            hfDocIndex.setId(hisInfo.getId());
            this.updateById(hfDocIndex);
        } else {
            hfDocIndexMapper.insert(hfDocIndex);
        }
        responseBean.setCode(Constants.SUCCESS_CODE);
        responseBean.setObject(hfDocIndex.getRepositoryUniqueId());
        return responseBean;
    }

    /**
     * 获取已经存在的数据
     *
     * @param hfDocIndex
     * @return
     */
    public DocIndex getHisData(DocIndex hfDocIndex) {
        QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(DocIndex::getDocId, hfDocIndex.getDocId())
                .eq(DocIndex::getDomainId, hfDocIndex.getDomainId())
                .eq(DocIndex::getXdsType, hfDocIndex.getXdsType())
                .eq(DocIndex::getXdsVersion, hfDocIndex.getXdsVersion() == null ? "" : hfDocIndex.getXdsVersion())
                .ne(DocIndex::getCdaStatus, Constants.ABANDON_STATUS);
        DocIndex hisInfo = hfDocIndexMapper.selectOne(queryWrapper);
        return hisInfo;
    }

    /**
     * CDA或者PDF数据上传
     *
     * @param hfDocIndex
     * @param hfDocIndexVo
     * @param hisInfo
     * @return
     */
    private boolean setDocFile(DocIndex hfDocIndex, HfDocIndexVo hfDocIndexVo, DocIndex hisInfo) {
        String suffix = null;
        StringBuffer filePath = new StringBuffer();
        if (hfDocIndexVo.getDocType().equals("text/xml")) {
            suffix = Constants.XML_SUFFIX;
            filePath.append(cdaPrefix);
        } else if (hfDocIndexVo.getDocType().equals("application/pdf")) {
            suffix = Constants.PDF_SUFFIX;
            filePath.append(pdfPrefix);
        }
        filePath.append(hfDocIndex.getDomainId()).append("/").
                append(hfDocIndex.getXdsType()).append("/").
                append(hfDocIndex.getUniquePk()).append(suffix).toString();
        if (!filService.uploadFile(hfDocIndex, filePath.toString())) {
            log.error("标准文档上传出错！");
            return false;
        }
        if (hfDocIndexVo.getDocType().equals("text/xml")) {
            hfDocIndex.setCdaPath(filePath.toString());
            if (null != hisInfo) {
                hfDocIndex.setPdfPath(hisInfo.getPdfPath());
            }
        } else if (hfDocIndexVo.getDocType().equals("text/xml")) {
            hfDocIndex.setPdfPath(filePath.toString());
            if (null != hisInfo) {
                hfDocIndex.setCdaPath(hisInfo.getCdaPath());
            }
        }
        return true;
    }

    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public ResponseBean mergeCdaData(Document document, DocIndex hfDocIndex) throws Exception {
        ResponseBean responseBean = new ResponseBean();
        String xdsType = hfDocIndex.getXdsType();
        if (StringUtils.isEmpty(xdsType)) {
            responseBean.setMessage("文档类型无法解析！");
            return responseBean;
        }
        Map<String, Object> map = getData(document, xdsType);
        if (null == map) {
            responseBean.setMessage("XML解析出错！");
            return responseBean;
        }
        map.put("domainId", hfDocIndex.getDomainId());
        map.put("uniqueId", hfDocIndex.getUniqueId());
        map.put("xdsType", xdsType);
        map.put("xdsVersion", hfDocIndex.getXdsVersion() == null ? "" : hfDocIndex.getXdsVersion());
        getEmpi(hfDocIndex, map);
        analyService.insertData(map, hfDocIndex.getGlobalId(), hfDocIndex.getEncounterId());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }

    /**
     * 获取EMPI
     *
     * @param hfDocIndex
     * @param map
     */
    private void getEmpi(DocIndex hfDocIndex, Map<String, Object> map) {
        map.put("patientId", hfDocIndex.getPatientId());
        map.put("visitDomainId", hfDocIndex.getAgencyId());
        map.put("patientDomain", hfDocIndex.getAgencyId());
        String empi = personInfoService.getEmpi(map);
        String encounterId = personInfoService.getEncounterId(map, empi);
        String procStatus = Constants.EMPI_ERROR_STATUS;
        if (StringUtils.isEmpty(empi)) {
            //returnJson.put("errorMessage",map.get("errorMessage"));
            hfDocIndex.setCdaErrorInfo(map.get("errorMessage").toString());
        } else {
            if (StringUtils.equals(docService.getType(hfDocIndex.getXdsType()), "YN")) {
                if (StringUtils.isNotEmpty(encounterId)) {
                    procStatus = Constants.SUCCESS_STATUS;
                } else {
                    hfDocIndex.setCdaErrorInfo(map.get("errorMessage").toString());
                }
            } else {
                procStatus = Constants.SUCCESS_STATUS;
            }
        }
        map.put("status", procStatus);
        hfDocIndex.setGlobalId(empi);
        hfDocIndex.setEncounterId(encounterId);
        hfDocIndex.setCdaStatus(procStatus);
    }

    @Override
    public ResponseBean updateEmpi(DocIndex hfDocIndex) throws Exception {
        ResponseBean responseBean = new ResponseBean();
        String xdsType = hfDocIndex.getXdsType();
        if (StringUtils.isEmpty(xdsType)) {
            responseBean.setMessage("文档类型无法解析！");
            return responseBean;
        }
        Object object = analyService.getData(hfDocIndex.getUniqueId(), hfDocIndex.getXdsType(),
                hfDocIndex.getDomainId(), hfDocIndex.getXdsVersion());
        Map<String, Object> map = new HashMap<>();
        map.putAll(JSONObject.fromObject(object));
        getEmpi(hfDocIndex, map);
        analyService.updateEmpi(hfDocIndex, hfDocIndex.getGlobalId(), hfDocIndex.getEncounterId());
        hfDocIndex.setCdaTime(new Date());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }

    /**
     * 读取xml节点中的数据
     * @param document
     * @param xdsType
     * @return
     */
    private Map<String, Object> getData(Document document, String xdsType) {
        List<MetaConfigList> metaConfigList = metaConfigService.getMetaConfigList(xdsType);
        Map<String, Object> map = null;
        try {
            map = TransElement.setMetaXml(document.getRootElement(), metaConfigList);
        } catch (DocumentException e) {
            log.error("解析xml出现错误,{},{}", e.getMessage(), e);
        }
        return map;
    }

    /**
     * 设置DocIndex
     * @param hfDocIndexVo
     * @return
     */
    private DocIndex setHfDocIndex(HfDocIndexVo hfDocIndexVo) {
        DocIndex hfDocIndex = new DocIndex();
        BeanUtils.copyProperties(hfDocIndexVo, hfDocIndex);
        hfDocIndex.setRepositoryUniqueId(UUID.randomUUID().toString());
        hfDocIndex.setCdaStatus(Constants.START_STATUS);
        hfDocIndex.setProcTime(new Date());
        /*hfDocIndex.setXdsType();
        hfDocIndex.setXdsVersion();*/
        return hfDocIndex;
    }


    /**
     * 处理历史数据
     *
     * @param hfDocIndex
     */
    private boolean procHisGate(DocIndex hfDocIndex, boolean isInsert) {
        if (isInsert) {
            if (null == hfDocIndex) {
                return true;
            } else {
                return true;
            }
        } else {
            if (null == hfDocIndex) {
                return true;
            }
            //conv_path设置为空，proc_status,file_path
            DocIndex updateIndex = new DocIndex();
            updateIndex.setId(hfDocIndex.getId());
            updateIndex.setCdaStatus(Constants.ABANDON_STATUS);
            hfDocIndexMapper.updateById(updateIndex);
            return true;
        }
    }

    public void syncDocIndex(DocIndex docIndex, JSONObject jsonObject) throws Exception {
        DocIndex hisDoc = this.getHisData(docIndex);
        docIndex.setCdaStatus(Constants.SUCCESS_STATUS);
        getEmpi(docIndex, jsonObject);
        analyService.updateEmpi(docIndex, docIndex.getGlobalId(), docIndex.getEncounterId());
        if (null != hisDoc) {
            docIndex.setId(hisDoc.getId());
        }
        this.saveOrUpdate(docIndex);
    }
}
