package com.ylz.hf.write.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

@RootElement(path = "/ProvideAndRegisterDocumentSetRequest")
public class HfDocIndexVo {

    @XMLObject(xpath = "./ID/@extension", ntype = XMLObject.ATTRIBUTE)
    private String messageId;
    @XMLObject(xpath = "./ID/@root", ntype = XMLObject.ATTRIBUTE)
    private String domainId;
    @XMLObject(xpath = "./SourcePatientID", ntype = XMLObject.TEXT)
    private String patientId;
    @XMLObject(xpath = "./SourcePatientName", ntype = XMLObject.TEXT)
    private String patientName;
    @XMLObject(xpath = "./HealthCardId", ntype = XMLObject.TEXT)
    private String healthCard;
    @XMLObject(xpath = "./IdentityId", ntype = XMLObject.TEXT)
    private String identityId;
    @XMLObject(xpath = "./Organization/@id", ntype = XMLObject.ATTRIBUTE)
    private String agencyId;
    @XMLObject(xpath = "./Organization/Name", ntype = XMLObject.TEXT)
    private String agencyName;
    @XMLObject(xpath = "./Organization/TelephoneNumber/@areaCode", ntype = XMLObject.ATTRIBUTE)
    private String agencyArea;
    @XMLObject(xpath = "./Organization/TelephoneNumber/@number", ntype = XMLObject.ATTRIBUTE)
    private String agencyTel;
    @XMLObject(xpath = "./Organization/EmailAddress/@address", ntype = XMLObject.ATTRIBUTE)
    private String agencyEmail;
    @XMLObject(xpath = "./Organization/Address/@city", ntype = XMLObject.ATTRIBUTE)
    private String agencyCity;
    @XMLObject(xpath = "./Organization/Address/@country", ntype = XMLObject.ATTRIBUTE)
    private String agencyCountry;
    @XMLObject(xpath = "./Organization/Address/@postalCode", ntype = XMLObject.ATTRIBUTE)
    private String agencyPostal;
    @XMLObject(xpath = "./Organization/Address/@stateOrProvince", ntype = XMLObject.ATTRIBUTE)
    private String agencyState;
    @XMLObject(xpath = "./Organization/Address/@street", ntype = XMLObject.ATTRIBUTE)
    private String agencyStreet;
    @XMLObject(xpath = "./Organization/Address/@streetNumber", ntype = XMLObject.ATTRIBUTE)
    private String agencyNum;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/SubmissionTime", ntype = XMLObject.TEXT)
    private String submitTime;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/UniqueId", ntype = XMLObject.TEXT)
    private String uniqueId;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/SourceId", ntype = XMLObject.TEXT)
    private String sourceId;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/Comments", ntype = XMLObject.TEXT)
    private String comments;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/Title", ntype = XMLObject.TEXT)
    private String title;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/CreateTime", ntype = XMLObject.TEXT)
    private String createTime;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/ServerOrganization", ntype = XMLObject.TEXT)
    private String serverName;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/EpisodeID", ntype = XMLObject.TEXT)
    private String episodeId;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/InTime", ntype = XMLObject.TEXT)
    private String startTime;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/OutTime", ntype = XMLObject.TEXT)
    private String endTime;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/AdmissionDepart", ntype = XMLObject.TEXT)
    private String deptName;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/AdmissionDoctor", ntype = XMLObject.TEXT)
    private String admissionName;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/AdmissionType", ntype = XMLObject.TEXT)
    private String admissionType;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/DiagnosisResult", ntype = XMLObject.TEXT)
    private String diagnosisResult;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/Author/AuthorName", ntype = XMLObject.TEXT)
    private String authorName;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/Author/AuthorInstitution", ntype = XMLObject.TEXT)
    private String authorAgency;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/Author/AuthorSpecialty", ntype = XMLObject.TEXT)
    private String authorDept;
    @XMLObject(xpath = "./RegistryPackage/SubmissionSet/Author/AuthorRole", ntype = XMLObject.TEXT)
    private String authorLevel;
    @XMLObject(xpath = "./Document/@id", ntype = XMLObject.ATTRIBUTE)
    private String docId;
    @XMLObject(xpath = "./Document/@parentDocumentRelationship", ntype = XMLObject.ATTRIBUTE)
    private String parentRelation;
    @XMLObject(xpath = "./Document/@parentDocumentId", ntype = XMLObject.ATTRIBUTE)
    private String parentDocId;
    @XMLObject(xpath = "./Document/@mimeType", ntype = XMLObject.ATTRIBUTE)
    private String docType;
    @XMLObject(xpath = "./Document/Content", ntype = XMLObject.TEXT)
    private String content;


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

    public String getAuthorLevel() {
        return authorLevel;
    }

    public void setAuthorLevel(String authorLevel) {
        this.authorLevel = authorLevel;
    }

    public String getAuthorDept() {
        return authorDept;
    }

    public void setAuthorDept(String authorDept) {
        this.authorDept = authorDept;
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

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}