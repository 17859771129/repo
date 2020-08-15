package com.ylz.hf.monitor.bean;


import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/*
 *  索引表
 */
@TableName("hf_doc_index")
public class HfDocIndex {
    private int id;
    private String messageId;//消息ID
    private String domainId;//上传域ID
    private String xdsVersion;
    private String xdsType;
    private String globalId;
    private String encounterId;
    private String patientId;//	患者ID
    private String patientName;//患者姓名
    private String healthCard;//健康卡号
    private String identityId;//	居民身份证号
    private String agencyId;//	机构组织机构代码
    private String agencyName;//机构名称
    private String agencyArea;//机构电话号码区号
    private String agencyTel;//	机构电话号码
    private String agencyEmail;//机构邮箱地址
    private String agencyCity;//工作地址-省（自治区、直辖市）
    private String agencyCountry;//工作地址-市（地区）
    private String agencyPostal;//工作地址-县（区）
    private String agencyState;//工作地址-乡（镇、街道办事处）
    private String agencyStreet;//工作地址-村（街、路、弄等）
    private String agencyNum;//工作地址-门牌号码
    private String submitTime;//	提交时间
    private String uniqueId;//共享文档注册唯一标识符(可以是提交时生成，也可以为空.)
    private String sourceId;//源文档 ID
    private String comments;//	备注
    private String title;//	标题
    private String createTime;//创建时间
    private String serverName;//服务机构名称
    private String episodeId;//活动服务编号(如住院号、就诊号、会诊号等)
    private String startTime;//	活动服务开始时间
    private String endTime;//	活动服务结束时间
    private String deptName;//负责人所属科室名称
    private String admissionName;//负责人姓名
    private String admissionType;//活动类型描述
    private String diagnosisResult;//活动服务结果类型描述
    private String authorName;//	数据记录者姓名
    private String authorAgency;//	数据记录者所属机构名称
    private String authorDept;//	数据记录者所属科室名称
    private String authorLevel;//数据记录者级别
    private String docId;//文档ID
    private String parentRelation;//与父文档关系
    private String parentDocId;//	父文档内容
    private String content;//	文档内容
    private String filePath;//	文档路径
    private String repositoryUniqueId;
    private String cdaPath;//		标准文档路径
    private String pdfPath;//	PDF文档路径
    private String htmlPath;//html文档路径
    private String procStatus;
    private String procTime;//数据插入时间
    private String errorInfo;//错误信息
    private String cdaStatus;//CDA拆分处理状态
    private Date cdaTime;//	CDA拆分处理时间
    private String cdaErrorInfo;//CDA拆分错误信息

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getXdsVersion() {
        return xdsVersion;
    }

    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
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

    public String getRepositoryUniqueId() {
        return repositoryUniqueId;
    }

    public void setRepositoryUniqueId(String repositoryUniqueId) {
        this.repositoryUniqueId = repositoryUniqueId;
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

    public String getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(String procStatus) {
        this.procStatus = procStatus;
    }

    public String getProcTime() {
        return procTime;
    }

    public void setProcTime(String procTime) {
        this.procTime = procTime;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getCdaStatus() {
        return cdaStatus;
    }

    public void setCdaStatus(String cdaStatus) {
        this.cdaStatus = cdaStatus;
    }

    public Date getCdaTime() {
        return cdaTime;
    }

    public void setCdaTime(Date cdaTime) {
        this.cdaTime = cdaTime;
    }

    public String getCdaErrorInfo() {
        return cdaErrorInfo;
    }

    public void setCdaErrorInfo(String cdaErrorInfo) {
        this.cdaErrorInfo = cdaErrorInfo;
    }
}
