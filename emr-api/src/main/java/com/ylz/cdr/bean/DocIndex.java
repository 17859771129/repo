package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.apache.commons.lang.StringUtils;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("doc_index")
public class DocIndex implements Serializable {

    private static final long serialVersionUID = 4967291634689329379L;

    private Integer pk;

    private String xdsNode;

    private String cdaPath;

    private String filePath;

    private String messageId;

    private String createTime;

    private String domainId;

    private String uniqueId;

    private String xdsType;

    private String xdsName;

    private String effectiveTime;

    private String securityLevel;

    private String securityLevelName;

    private String xdsVersion;

    private String patientId;

    private String inpatientId;

    private String clincId;

    private String visitTime;

    private String identifyNo;

    private String patientName;

    private String hospitalCode;

    private String hospitalName;

    private String deptCode;

    private String createrId;

    private String creater;

    private String custodianCode;

    private String custodianName;

    private String procStatus;

    private Date procTime;

    private String errorInfo;

    private Integer errorTimes;

    private String syncStatus;

    private Date syncTime;

    private String syncErrorInfo;

    private Integer syncErrorTimes;

    private String empi;

    private String encounterId;

    private String showType;

    private String showPath;

    private String visitId;

    private String visitFlowId;

    private String visitTimes;

    private String visitDomain;

    private String patientType;

    private String patientTypeCode;

    private String deptName;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getXdsNode() {
        return xdsNode;
    }

    public void setXdsNode(String xdsNode) {
        this.xdsNode = xdsNode;
    }

    public String getCdaPath() {
        return cdaPath;
    }

    public void setCdaPath(String cdaPath) {
        this.cdaPath = cdaPath;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    public String getXdsName() {
        return xdsName;
    }

    public void setXdsName(String xdsName) {
        this.xdsName = xdsName;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public String getSecurityLevelName() {
        return securityLevelName;
    }

    public void setSecurityLevelName(String securityLevelName) {
        this.securityLevelName = securityLevelName;
    }

    public String getXdsVersion() {
        return xdsVersion;
    }

    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getInpatientId() {
        return inpatientId;
    }

    public void setInpatientId(String inpatientId) {
        this.inpatientId = inpatientId;
    }

    public String getClincId() {
        return clincId;
    }

    public void setClincId(String clincId) {
        this.clincId = clincId;
    }

    public String getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(String visitTime) {
        this.visitTime = visitTime;
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getCreaterId() {
        return createrId;
    }

    public void setCreaterId(String createrId) {
        this.createrId = createrId;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }

    public String getCustodianCode() {
        return custodianCode;
    }

    public void setCustodianCode(String custodianCode) {
        this.custodianCode = custodianCode;
    }

    public String getCustodianName() {
        return custodianName;
    }

    public void setCustodianName(String custodianName) {
        this.custodianName = custodianName;
    }

    public String getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(String procStatus) {
        this.procStatus = procStatus;
    }

    public Date getProcTime() {
        return procTime;
    }

    public void setProcTime(Date procTime) {
        this.procTime = procTime;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public Integer getErrorTimes() {
        return errorTimes;
    }

    public void setErrorTimes(Integer errorTimes) {
        this.errorTimes = errorTimes;
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
    }

    public Date getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Date syncTime) {
        this.syncTime = syncTime;
    }

    public String getSyncErrorInfo() {
        return syncErrorInfo;
    }

    public void setSyncErrorInfo(String syncErrorInfo) {
        this.syncErrorInfo = syncErrorInfo;
    }

    public Integer getSyncErrorTimes() {
        return syncErrorTimes;
    }

    public void setSyncErrorTimes(Integer syncErrorTimes) {
        this.syncErrorTimes = syncErrorTimes;
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getShowPath() {
        return showPath;
    }

    public void setShowPath(String showPath) {
        this.showPath = showPath;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitFlowId() {
        return visitFlowId;
    }

    public void setVisitFlowId(String visitFlowId) {
        this.visitFlowId = visitFlowId;
    }

    public String getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    public String getVisitDomain() {
        return visitDomain;
    }

    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getPatientTypeCode() {
        return patientTypeCode;
    }

    public void setPatientTypeCode(String patientTypeCode) {
        this.patientTypeCode = patientTypeCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getUniquePk() {
        String version = this.xdsVersion;
        if (StringUtils.isEmpty(version)) {
            version = "";
        }
        String uniquePk = new StringBuffer().append(this.domainId).append("_").append(this.xdsType).append("_").append(version)
                .append("_").append(this.uniqueId).toString();
        return uniquePk;
    }
}