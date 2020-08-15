package com.ylz.hf.write.service.impl;

import com.ylz.cdr.common.ConstantUtil;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.write.service.IAnalyService;
import com.ylz.hf.write.service.ISyncDataService;
import com.ylz.hf.write.tool.DateJsonValueProcessor;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.service.IDocService;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Service("syncDataService")
public class SyncDataServiceImpl implements ISyncDataService {

    private static final Logger log = LoggerFactory.getLogger(SyncDataServiceImpl.class);
    @Autowired
    private IDocService docService;
    @Autowired
    private IAnalyService mergerDataService;

    @Autowired
    public HfDocIndexServiceImpl hfDocIndexService;

    @Value("${sync.status}")
    private String syncStatus;

    public void syncAllDoc() throws Exception {
        //HDSD插入数据到DOC_INDEX,状态为AS/AE
        if (CollectionUtils.isEmpty(docService.getDocList())) {
            log.info("文档类型为空，请检查文档类型配置！");
            return;
        }
        for (ManagerDoc managerDoc : docService.getDocList()) {
            String tableName = managerDoc.getDocTable();
            String docCode = managerDoc.getDocCode();
            syncData(docCode, tableName);
        }
    }

    public void syncAppointDoc(String docCode) throws Exception {
        List<ManagerDoc> managerDocList = docService.getHfDocMap().get(docCode);
        if (CollectionUtils.isEmpty(managerDocList)) {
            log.error("文件类型为：{},不存在！", docCode);
            return;
        }
        String tableName = docService.getHfDocMap().get(docCode).get(0).getDocTable();
        syncData(docCode, tableName);
    }

    private void syncData(String docCode, String tableName) throws Exception {
        List list = mergerDataService.querySyncData(docCode, syncStatus);
        if (CollectionUtils.isEmpty(list)) {
            return;
        }
        for (Object item : list) {
            JsonConfig config = new JsonConfig();
            config.registerJsonValueProcessor(Timestamp.class, new DateJsonValueProcessor("yyyyMMddHHmmss"));
            config.registerJsonValueProcessor(Date.class, new DateJsonValueProcessor("yyyyMMddHHmmss"));
            JSONObject jsonObject = JSONObject.fromObject(item, config);
            DocIndex docIndex = setDocIndex(jsonObject);
            hfDocIndexService.syncDocIndex(docIndex, jsonObject);
        }
    }

    private DocIndex setDocIndex(JSONObject jsonObject) {
        DocIndex docIndex = new DocIndex();
        docIndex.setMessageId(UUID.randomUUID().toString());
        docIndex.setDomainId(getValue(jsonObject, "domainId"));
        docIndex.setXdsVersion(getValue(jsonObject, "xdsVersion"));
        docIndex.setXdsType(getValue(jsonObject, "xdsType"));
        docIndex.setGlobalId(getValue(jsonObject, "globalId"));
        docIndex.setEncounterId(getValue(jsonObject, "encounterId"));
        docIndex.setPatientId(getValue(jsonObject, "patientId"));
        docIndex.setPatientName(getValue(jsonObject, "patientName"));
        docIndex.setHealthCard(getValue(jsonObject, "healthCard"));
        docIndex.setIdentityId(getValue(jsonObject, "identityId"));
        docIndex.setAgencyId(getValue(jsonObject, "custodianCode"));
        docIndex.setAgencyName(getValue(jsonObject, "custodianName"));
        docIndex.setAgencyArea(getValue(jsonObject, "agencyArea"));
        docIndex.setAgencyTel(getValue(jsonObject, "agencyTel"));
        docIndex.setAgencyEmail(getValue(jsonObject, "agencyEmail"));
        docIndex.setAgencyCity(getValue(jsonObject, "agencyCity"));
        docIndex.setAgencyCountry(getValue(jsonObject, "agencyCountry"));
        docIndex.setAgencyPostal(getValue(jsonObject, "agencyPostal"));
        docIndex.setAgencyState(getValue(jsonObject, "agencyState"));
        docIndex.setAgencyStreet(getValue(jsonObject, "agencyStreet"));
        docIndex.setAgencyNum(getValue(jsonObject, "agencyNum"));
        docIndex.setSubmitTime(getValue(jsonObject, "submitTime"));
        docIndex.setUniqueId(getValue(jsonObject, "uniqueId"));
        docIndex.setSourceId(getValue(jsonObject, "uniqueId"));
        docIndex.setTitle(getValue(jsonObject, "xdsName"));
        docIndex.setCreateTime(ConstantUtil.FORMAT.format(new Date()));
        docIndex.setServerName(getValue(jsonObject, "setServerName"));
        docIndex.setEpisodeId(getValue(jsonObject, "uniqueId"));
        docIndex.setStartTime(getValue(jsonObject, "visitTime"));
        docIndex.setEndTime(getValue(jsonObject, "endTime"));
        docIndex.setDeptName(getValue(jsonObject, "deptName"));
        docIndex.setAdmissionName(getValue(jsonObject, "admissionName"));
        docIndex.setAdmissionType(getValue(jsonObject, "admissionType"));
        docIndex.setDiagnosisResult(getValue(jsonObject, "diagnosisResult"));
        docIndex.setAuthorName(getValue(jsonObject, "authorName"));
        docIndex.setAuthorAgency(getValue(jsonObject, "authorAgency"));
        docIndex.setAuthorDept(getValue(jsonObject, "authorDept"));
        docIndex.setAuthorLevel(getValue(jsonObject, "authorLevel"));
        docIndex.setDocId(getValue(jsonObject, "uniqueId"));
        /*docIndex.setParentRelation(getValue(jsonObject,"uniqueId"));
        docIndex.setParentDocId(getValue(jsonObject,"uniqueId"));*/
        /*docIndex.setContent(getValue(jsonObject,"uniqueId"));*/
        /*docIndex.setFilePath(getValue(jsonObject,"uniqueId"));*/
        docIndex.setRepositoryUniqueId(UUID.randomUUID().toString());
        /*docIndex.setCdaPath(getValue(jsonObject,"uniqueId"));*/
        /*docIndex.setProcStatus(getValue(jsonObject,"uniqueId"));*/
        return docIndex;
    }


    private String getValue(Map<String, Object> map, String key) {
        if (map.containsKey(key)) {
            Object object = map.get(key);
            if (null == object) {
                return null;
            }
            if (object instanceof Date) {

            } else {
                return String.valueOf(object);
            }
        }
        return null;
    }
}
