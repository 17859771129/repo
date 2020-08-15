package com.ylz.cdr.write.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

import java.io.Serializable;

@RootElement(path = "/RCMR_IN000002UV02")
public class XdsInfoString implements Serializable {

    private static final long serialVersionUID = -2223568219843557039L;

    @XMLObject(xpath = "./id/@extension", ntype = XMLObject.ATTRIBUTE)
    private String messageId;
    @XMLObject(xpath = "./creationTime/@value", ntype = XMLObject.ATTRIBUTE)
    private String createTime;
    //发送ID，必填
    @XMLObject(xpath = "./sender/device/id/item/@extension", ntype = XMLObject.ATTRIBUTE)
    private String domainId;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/id/item/@extension", ntype = XMLObject.ATTRIBUTE)
    private String uniqueId;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/code/@code", ntype = XMLObject.ATTRIBUTE)
    private String xdsType;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/code/displayName/@value", ntype = XMLObject.ATTRIBUTE)
    private String xdsNode;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/effectiveTime/@value", ntype = XMLObject.ATTRIBUTE)
    private String effectiveTime;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/confidentialityCode/@code", ntype = XMLObject.ATTRIBUTE)
    private String securityLevel;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/confidentialityCode/displayName/@value", ntype = XMLObject.ATTRIBUTE)
    private String securityLevelName;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/versionNumber/@value", ntype = XMLObject.ATTRIBUTE)
    private String xdsVersion;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/storageCode/originalText/@value", ntype = XMLObject.ATTRIBUTE)
    private String xdsContent;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/id/item[@root='2.16.156.10011.2.5.1.4']/@extension", ntype = XMLObject.ATTRIBUTE)
    private String patientId;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/id/item[@root='2.16.156.10011.1.12']/@extension", ntype = XMLObject.ATTRIBUTE)
    private String inpatientId;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/id/item[@root='2.16.156.10011.1.11']/@extension", ntype = XMLObject.ATTRIBUTE)
    private String clincId;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/effectiveTime/low/@value", ntype = XMLObject.ATTRIBUTE)
    private String visitTime;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/patientPerson/id/item/@extension", ntype = XMLObject.ATTRIBUTE)
    private String identifyNo;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/patientPerson/name/item/part/@value", ntype = XMLObject.ATTRIBUTE)
    private String patientName;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/providerOrganization/id/item/@extension", ntype = XMLObject.ATTRIBUTE)
    private String hospitalCode;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/providerOrganization/name/item/part/@value", ntype = XMLObject.ATTRIBUTE)
    private String hospitalName;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/recordTarget/patient/providerOrganization/organizationContains/id/item/@extension", ntype = XMLObject.ATTRIBUTE)
    private String deptCode;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/author/assignedAuthor/id/item/@extension", ntype = XMLObject.ATTRIBUTE)
    private String createrId;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/author/assignedAuthor/assignedPerson/name/item/part/@value", ntype = XMLObject.ATTRIBUTE)
    private String creater;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/custodian/assignedCustodian/representedOrganization/id/item/@extension", ntype = XMLObject.ATTRIBUTE)
    private String custodianCode;
    @XMLObject(xpath = "./controlActProcess/subject/clinicalDocument/custodian/assignedCustodian/representedOrganization/name/item/part/@value", ntype = XMLObject.ATTRIBUTE)
    private String custodianName;

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

    public String getXdsNode() {
        return xdsNode;
    }

    public void setXdsNode(String xdsNode) {
        this.xdsNode = xdsNode;
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

    public String getXdsContent() {
        return xdsContent;
    }

    public void setXdsContent(String xdsContent) {
        this.xdsContent = xdsContent;
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
}