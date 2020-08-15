package com.ylz.cdr.write.pre.service.impl;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.write.conf.XdsConfig;
import com.ylz.cdr.write.pre.service.IPreConvDataService;
import com.ylz.cdr.write.service.IAnalyService;
import com.ylz.cdr.write.service.IDocIndexService;
import com.ylz.cdr.write.service.IPatientService;
import com.ylz.cdr.write.service.IVisitService;
import com.ylz.cdr.write.tool.TransElement;
import com.ylz.dict.bean.MetaConfigList;
import com.ylz.dict.service.IMetaConfigService;
import com.ylz.person.bean.PatientVisit;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service("preConvDataService")
public class PreConvDataServiceImpl implements IPreConvDataService {

    private static final Logger log = LoggerFactory.getLogger(PreConvDataServiceImpl.class);

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
    public ResponseBean procData(Document document, String type, String messageId) throws Exception {
        ResponseBean responseBean = new ResponseBean();
        Element rootElement = document.getRootElement();
        String xdsType = getType(type);
        if (StringUtils.isEmpty(xdsType)) {
            responseBean.setMessage("文档类型无法解析！");
            return responseBean;
        }
        List<MetaConfigList> metaConfigList = metaConfigService.getMetaConfigList(xdsType);
        Map<String, Object> map = null;
        try {
            map = TransElement.setMetaXml(rootElement, metaConfigList);
        } catch (DocumentException e) {
            log.error("解析xml出现错误,{},{}", e.getMessage(), e);
            responseBean.setMessage("解析xml出现错误！");
            return responseBean;
        }
        map.put("loadType", type);
        map.put("messageId", messageId);
        setCategory(map, type);
        if (null == map.get("visitDate")) {
            if (map.containsKey("admissionDate") && null != map.get("admissionDate")) {
                map.put("visitDate", map.get("admissionDate"));
            }
        }
        PatientVisit patientVisit = visitService.getPatientVisit(map);
        String empi = null;
        String encounterId = null;
        if (null != patientVisit) {
            map.put("visitId", patientVisit.getVisitId());
            map.put("visitDomainId", patientVisit.getVisitDomainId());
            if (!map.containsKey("patientType") && !map.containsKey("patientTypecode")) {
                map.put("patientType", patientVisit.getPatientCategory());
                map.put("patientTypecode", patientVisit.getPatientCategoryCode());
            }
            empi = patientService.getEmpi(patientVisit.getPatientId(), patientVisit.getPatientDomainId());
            encounterId = patientVisit.getEncounterId();
        }
        // 将数据保存到doc_index中，形成索引
        String procStatus = docIndexService.saveOrUpdate(map, empi, encounterId, document.asXML(), false);
        if (StringUtils.equals(procStatus, Constants.FAILED_STATUS)) {
            responseBean.setMessage("数据上传到doc_index出错");
            return responseBean;
        }
        map.put("status", procStatus);
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
