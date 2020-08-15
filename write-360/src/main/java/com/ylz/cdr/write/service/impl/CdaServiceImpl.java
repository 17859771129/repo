package com.ylz.cdr.write.service.impl;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.write.conf.XdsConfig;
import com.ylz.cdr.write.service.*;
import com.ylz.cdr.write.tool.TransElement;
import com.ylz.dict.bean.MetaConfigList;
import com.ylz.dict.service.IMetaConfigService;
import com.ylz.person.bean.PatientVisit;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("cdaService")
public class CdaServiceImpl implements ICdaService {

    private static final Logger log = LoggerFactory.getLogger(CdaServiceImpl.class);

    @Autowired
    private IAnalyService analyService;
    @Autowired
    private IMetaConfigService metaConfigService;
    @Autowired
    private IPatientService patientService;
    @Autowired
    private IVisitService visitService;
    @Autowired
    private IDocIndexService docIndexService;
    @Autowired
    private XdsConfig xdsConfig;

    @Override
    @Transactional(rollbackFor = {RuntimeException.class, Exception.class})
    public ResponseBean mergeCdaData(Document document, String domainId, String xdsType,
                                     String uniqueId, String version, String patientId, boolean isSaveDocIndex) throws Exception {
        ResponseBean responseBean = new ResponseBean();
        String type = getType(xdsType);
        if (StringUtils.isEmpty(xdsType)) {
            responseBean.setMessage("文档类型无法解析！");
            return responseBean;
        }
        List<MetaConfigList> metaConfigList = metaConfigService.getMetaConfigList(type);
        Map<String, Object> map = null;
        try {
            map = TransElement.setMetaXml(document.getRootElement(), metaConfigList);
        } catch (DocumentException e) {
            log.error("解析xml出现错误,{},{}", e.getMessage(), e);
            responseBean.setMessage("解析xml出现错误！");
            return responseBean;
        }
        map.put("docDomainId", domainId);
        map.put("docPipelineId", uniqueId);
        map.put("loadType", xdsType);
        map.put("version", version);
        map.put("patientId", patientId);
        if (null == map.get("visitDate")) {
            if (map.containsKey("admissionDate") && null != map.get("admissionDate")) {
                map.put("visitDate", map.get("admissionDate"));
            }
        }
        PatientVisit patientVisit = visitService.getPatientVisit(map);
        String empi = null;
        String encounterId = null;
        String procStatus = Constants.EMPI_ERROR_STATUS;
        if (null != patientVisit) {
            procStatus = Constants.SUCCESS_STATUS;
            map.put("visitId", patientVisit.getVisitId());
            map.put("visitDomainId", patientVisit.getVisitDomainId());
            if (!map.containsKey("patientType") && !map.containsKey("patientTypecode")) {
                map.put("patientType", patientVisit.getPatientCategory());
                map.put("patientTypecode", patientVisit.getPatientCategoryCode());
            }
            encounterId = patientVisit.getEncounterId();
            empi = patientService.getEmpi(patientVisit.getPatientId(), patientVisit.getPatientDomainId());
        }

        if (isSaveDocIndex) {
            // 将数据保存到doc_index中，形成索引
            procStatus = docIndexService.saveOrUpdate(map, empi, encounterId, document.asXML(), true);
            if (StringUtils.equals(procStatus, Constants.FAILED_STATUS)) {
                responseBean.setMessage("数据上传到doc_index出错");
                return responseBean;
            }
        }
        map.put("status", procStatus);
        setCategory(map, xdsType);
        responseBean = analyService.insertData(map, empi, encounterId);
        JSONObject returnJson = new JSONObject();
        returnJson.put("empi", empi);
        returnJson.put("encounterId", encounterId);
        responseBean.setObject(returnJson);
        return responseBean;
    }

    private String getType(String xdsType) {
        if (xdsConfig.getTypeJson().containsKey(xdsType)) {
            return xdsConfig.getTypeJson().getString(xdsType);
        }
        return xdsType;
    }

    private void setCategory(Map<String, Object> map, String type) {
        if (xdsConfig.getCategoryJson().containsKey(type)) {
            JSONObject jsonObject = xdsConfig.getCategoryJson().getJSONObject(type);
            for (Object key : jsonObject.keySet()) {
                map.put(String.valueOf(key), jsonObject.get(key));
            }
        }
    }
}
