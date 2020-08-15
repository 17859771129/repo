package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import lombok.Data;

import java.util.Date;

@Data
@TableName("hf_doc_index")
public class DocIndex {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String globalId;

    private String encounterId;

    private String messageId;

    private String domainId;

    private String xdsType;

    private String xdsVersion;

    private String patientId;

    private String patientName;

    private String healthCard;

    private String identityId;

    private String agencyId;

    private String agencyName;

    private String agencyArea;

    private String agencyTel;

    private String agencyEmail;

    private String agencyCity;

    private String agencyCountry;

    private String agencyPostal;

    private String agencyState;

    private String agencyStreet;

    private String agencyNum;

    private String submitTime;

    private String uniqueId;

    private String sourceId;

    private String comments;

    private String title;

    private String createTime;

    private String serverName;

    private String episodeId;

    private String startTime;

    private String endTime;

    private String deptName;

    private String admissionName;

    private String admissionType;

    private String diagnosisResult;

    private String authorName;

    private String authorAgency;

    private String authorDept;

    private String authorLevel;

    private String docId;

    private String parentRelation;

    private String parentDocId;

    private String content;

    private String filePath;

    private String repositoryUniqueId;

    private String cdaPath;

    private String pdfPath;

    private String htmlPath;

    /*private String procStatus;*/

    private Date procTime;

    private String cdaStatus;

    private Date cdaTime;

    private String cdaErrorInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
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

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getHealthCard() {
        return healthCard;
    }

    public void setHealthCard(String healthCard) {
        this.healthCard = healthCard;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId;
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public String getAgencyArea() {
        return agencyArea;
    }

    public void setAgencyArea(String agencyArea) {
        this.agencyArea = agencyArea;
    }

    public String getAgencyTel() {
        return agencyTel;
    }

    public void setAgencyTel(String agencyTel) {
        this.agencyTel = agencyTel;
    }

    public String getAgencyEmail() {
        return agencyEmail;
    }

    public void setAgencyEmail(String agencyEmail) {
        this.agencyEmail = agencyEmail;
    }

    public String getAgencyCity() {
        return agencyCity;
    }

    public void setAgencyCity(String agencyCity) {
        this.agencyCity = agencyCity;
    }

    public String getAgencyCountry() {
        return agencyCountry;
    }

    public void setAgencyCountry(String agencyCountry) {
        this.agencyCountry = agencyCountry;
    }

    public String getAgencyPostal() {
        return agencyPostal;
    }

    public void setAgencyPostal(String agencyPostal) {
        this.agencyPostal = agencyPostal;
    }

    public String getAgencyState() {
        return agencyState;
    }

    public void setAgencyState(String agencyState) {
        this.agencyState = agencyState;
    }

    public String getAgencyStreet() {
        return agencyStreet;
    }

    public void setAgencyStreet(String agencyStreet) {
        this.agencyStreet = agencyStreet;
    }

    public String getAgencyNum() {
        return agencyNum;
    }

    public void setAgencyNum(String agencyNum) {
        this.agencyNum = agencyNum;
    }

    public String getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAdmissionName() {
        return admissionName;
    }

    public void setAdmissionName(String admissionName) {
        this.admissionName = admissionName;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public String getDiagnosisResult() {
        return diagnosisResult;
    }

    public void setDiagnosisResult(String diagnosisResult) {
        this.diagnosisResult = diagnosisResult;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getAuthorAgency() {
        return authorAgency;
    }

    public void setAuthorAgency(String authorAgency) {
        this.authorAgency = authorAgency;
    }

    public String getAuthorDept() {
        return authorDept;
    }

    public void setAuthorDept(String authorDept) {
        this.authorDept = authorDept;
    }

    public String getAuthorLevel() {
        return authorLevel;
    }

    public void setAuthorLevel(String authorLevel) {
        this.authorLevel = authorLevel;
    }

    public String getDocId() {
        return docId;
    }

    public void setDocId(String docId) {
        this.docId = docId;
    }

    public String getParentRelation() {
        return parentRelation;
    }

    public void setParentRelation(String parentRelation) {
        this.parentRelation = parentRelation;
    }

    public String getParentDocId() {
        return parentDocId;
    }

    public void setParentDocId(String parentDocId) {
        this.parentDocId = parentDocId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCdaPath() {
        return cdaPath;
    }

    public void setCdaPath(String cdaPath) {
        this.cdaPath = cdaPath;
    }

    public String getPdfPath() {
        return pdfPath;
    }

    public void setPdfPath(String pdfPath) {
        this.pdfPath = pdfPath;
    }

    public String getHtmlPath() {
        return htmlPath;
    }

    public void setHtmlPath(String htmlPath) {
        this.htmlPath = htmlPath;
    }

    public String getCdaStatus() {
        return cdaStatus;
    }

    public void setCdaStatus(String cdaStatus) {
        this.cdaStatus = cdaStatus;
    }

    public String getCdaErrorInfo() {
        return cdaErrorInfo;
    }

    public void setCdaErrorInfo(String cdaErrorInfo) {
        this.cdaErrorInfo = cdaErrorInfo;
    }

    public String getRepositoryUniqueId() {
        return repositoryUniqueId;
    }

    public void setRepositoryUniqueId(String repositoryUniqueId) {
        this.repositoryUniqueId = repositoryUniqueId;
    }

 /*   public String getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(String procStatus) {
        this.procStatus = procStatus;
    }*/

    public Date getProcTime() {
        return procTime;
    }

    public void setProcTime(Date procTime) {
        this.procTime = procTime;
    }

    public Date getCdaTime() {
        return cdaTime;
    }

    public void setCdaTime(Date cdaTime) {
        this.cdaTime = cdaTime;
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