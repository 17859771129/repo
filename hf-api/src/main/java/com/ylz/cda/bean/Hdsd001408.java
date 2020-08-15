package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.BaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("hdsd00_14_08")
public class Hdsd001408 extends BaseBean implements Serializable {
    private static final long serialVersionUID = -3603110588778823652L;
    private Integer pk;

    private String status;

    private Date uploadTime;

    private String empi;

    private String encounterId;

    private String patientId;

    private String patientDomain;

    private String visitDomain;

    private String visitId;

    private String visitTimes;

    private String uniqueId;

    private String xdsType;

    private String xdsName;

    private Date effectiveTime;

    private String xdsVersion;

    private String domainId;

    private String patientType;

    private String patientTypecode;

    private String inpatient;

    private String identifyNo;

    private String patientName;

    private String sexCode;

    private String sex;

    private Date birth;

    private String age;

    private String ageUnit;

    private Date writeTime;

    private String authorCode;

    private String authorName;

    private String custodianName;

    private String custodianCode;

    private Date docAuditDate;

    private String docAuditorcode;

    private String docAuditor;

    private String patCategoryCode;

    private String patCategory;

    private Date recordDate;

    private String bedNo;

    private String bedName;

    private String wardId;

    private String wardName;

    private String wardsId;

    private String wardsName;

    private String hospitalCode;

    private String hospitalName;

    private String deptCode;

    private String deptName;

    private String inCourse;

    private String tcmFourDiagnosis;

    private String orderContent;

    private String discriminateDetail;

    private String tcmMethod;

    private String tcmDrugUse;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi == null ? null : empi.trim();
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId == null ? null : encounterId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientDomain() {
        return patientDomain;
    }

    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain == null ? null : patientDomain.trim();
    }

    public String getVisitDomain() {
        return visitDomain;
    }

    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain == null ? null : visitDomain.trim();
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId == null ? null : visitId.trim();
    }

    public String getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes == null ? null : visitTimes.trim();
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType == null ? null : xdsType.trim();
    }

    public String getXdsName() {
        return xdsName;
    }

    public void setXdsName(String xdsName) {
        this.xdsName = xdsName == null ? null : xdsName.trim();
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getXdsVersion() {
        return xdsVersion;
    }

    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion == null ? null : xdsVersion.trim();
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId == null ? null : domainId.trim();
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType == null ? null : patientType.trim();
    }

    public String getPatientTypecode() {
        return patientTypecode;
    }

    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode == null ? null : patientTypecode.trim();
    }

    public String getInpatient() {
        return inpatient;
    }

    public void setInpatient(String inpatient) {
        this.inpatient = inpatient == null ? null : inpatient.trim();
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo == null ? null : identifyNo.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit == null ? null : ageUnit.trim();
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public String getAuthorCode() {
        return authorCode;
    }

    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode == null ? null : authorCode.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getCustodianName() {
        return custodianName;
    }

    public void setCustodianName(String custodianName) {
        this.custodianName = custodianName == null ? null : custodianName.trim();
    }

    public String getCustodianCode() {
        return custodianCode;
    }

    public void setCustodianCode(String custodianCode) {
        this.custodianCode = custodianCode == null ? null : custodianCode.trim();
    }

    public Date getDocAuditDate() {
        return docAuditDate;
    }

    public void setDocAuditDate(Date docAuditDate) {
        this.docAuditDate = docAuditDate;
    }

    public String getDocAuditorcode() {
        return docAuditorcode;
    }

    public void setDocAuditorcode(String docAuditorcode) {
        this.docAuditorcode = docAuditorcode == null ? null : docAuditorcode.trim();
    }

    public String getDocAuditor() {
        return docAuditor;
    }

    public void setDocAuditor(String docAuditor) {
        this.docAuditor = docAuditor == null ? null : docAuditor.trim();
    }

    public String getPatCategoryCode() {
        return patCategoryCode;
    }

    public void setPatCategoryCode(String patCategoryCode) {
        this.patCategoryCode = patCategoryCode == null ? null : patCategoryCode.trim();
    }

    public String getPatCategory() {
        return patCategory;
    }

    public void setPatCategory(String patCategory) {
        this.patCategory = patCategory == null ? null : patCategory.trim();
    }

    public Date getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName == null ? null : bedName.trim();
    }

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId == null ? null : wardId.trim();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    public String getWardsId() {
        return wardsId;
    }

    public void setWardsId(String wardsId) {
        this.wardsId = wardsId == null ? null : wardsId.trim();
    }

    public String getWardsName() {
        return wardsName;
    }

    public void setWardsName(String wardsName) {
        this.wardsName = wardsName == null ? null : wardsName.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getInCourse() {
        return inCourse;
    }

    public void setInCourse(String inCourse) {
        this.inCourse = inCourse == null ? null : inCourse.trim();
    }

    public String getTcmFourDiagnosis() {
        return tcmFourDiagnosis;
    }

    public void setTcmFourDiagnosis(String tcmFourDiagnosis) {
        this.tcmFourDiagnosis = tcmFourDiagnosis == null ? null : tcmFourDiagnosis.trim();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    public String getDiscriminateDetail() {
        return discriminateDetail;
    }

    public void setDiscriminateDetail(String discriminateDetail) {
        this.discriminateDetail = discriminateDetail == null ? null : discriminateDetail.trim();
    }

    public String getTcmMethod() {
        return tcmMethod;
    }

    public void setTcmMethod(String tcmMethod) {
        this.tcmMethod = tcmMethod == null ? null : tcmMethod.trim();
    }

    public String getTcmDrugUse() {
        return tcmDrugUse;
    }

    public void setTcmDrugUse(String tcmDrugUse) {
        this.tcmDrugUse = tcmDrugUse == null ? null : tcmDrugUse.trim();
    }
}