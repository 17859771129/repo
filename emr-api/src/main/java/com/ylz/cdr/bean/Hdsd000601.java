package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_06_01")
public class Hdsd000601 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_06_01
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_06_01.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_06_01.status
     */
    private String status;
    /**
     * HDSD00_06_01.pk
     */
    private Integer pk;
    /**
     * HDSD00_06_01.empi
     */
    private String empi;
    /**
     * HDSD00_06_01.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_06_01.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_06_01.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_06_01.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_06_01.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_06_01.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_06_01.VERSION
     */
    private String version;
    /**
     * HDSD00_06_01.TRANSFUSION_TRIGGER
     */
    private String transfusionTrigger;
    /**
     * HDSD00_06_01.TRANSFUSION_NUM
     */
    private String transfusionNum;
    /**
     * HDSD00_06_01.RH_GROUP
     */
    private String rhGroup;
    /**
     * HDSD00_06_01.RH_CODE
     */
    private String rhCode;
    /**
     * HDSD00_06_01.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_06_01.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_06_01.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_06_01.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_06_01.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_06_01.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_06_01.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_06_01.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_06_01.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_06_01.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_06_01.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_06_01.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_06_01.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_06_01.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_06_01.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_06_01.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_06_01.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_06_01.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_06_01.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_06_01.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_06_01.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_06_01.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_06_01.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_06_01.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_06_01.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_06_01.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_06_01.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_06_01.DOC_AUDIT_DATE
     */
    private String docAuditDate;
    /**
     * HDSD00_06_01.DOC_AUDITORCODE
     */
    private String docAuditorcode;
    /**
     * HDSD00_06_01.DOC_AUDITOR
     */
    private String docAuditor;
    /**
     * HDSD00_06_01.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_06_01.BLOOD_VOLUME
     */
    private String bloodVolume;
    /**
     * HDSD00_06_01.BLOOD_VARIETIESCODE
     */
    private String bloodVarietiescode;
    /**
     * HDSD00_06_01.BLOOD_VARIETIES
     */
    private String bloodVarieties;
    /**
     * HDSD00_06_01.BLOOD_UNIT
     */
    private String bloodUnit;
    /**
     * HDSD00_06_01.BLOOD_REACTION_TYPECODE
     */
    private String bloodReactionTypecode;
    /**
     * HDSD00_06_01.BLOOD_REACTION_TYPE
     */
    private String bloodReactionType;
    /**
     * HDSD00_06_01.BLOOD_REACTION_MARK
     */
    private String bloodReactionMark;
    /**
     * HDSD00_06_01.BLOOD_PROCESS
     */
    private String bloodProcess;
    /**
     * HDSD00_06_01.BLOOD_NATURECODE
     */
    private String bloodNaturecode;
    /**
     * HDSD00_06_01.BLOOD_NATURE
     */
    private String bloodNature;
    /**
     * HDSD00_06_01.BLOOD_HISTORY_MARK
     */
    private String bloodHistoryMark;
    /**
     * HDSD00_06_01.BLOOD_HISTORY
     */
    private String bloodHistory;
    /**
     * HDSD00_06_01.BLOOD_DATE
     */
    private String bloodDate;
    /**
     * HDSD00_06_01.BLOOD_CAUSES
     */
    private String bloodCauses;
    /**
     * HDSD00_06_01.BLOODBAG_CODE
     */
    private String bloodbagCode;
    /**
     * HDSD00_06_01.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_06_01.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_06_01.APPY_ID
     */
    private String appyId;
    /**
     * HDSD00_06_01.APPLIY_RHD_CODE
     */
    private String appliyRhdCode;
    /**
     * HDSD00_06_01.APPLIY_RHD
     */
    private String appliyRhd;
    /**
     * HDSD00_06_01.APPLIY_ABO_CODE
     */
    private String appliyAboCode;
    /**
     * HDSD00_06_01.APPLIY_ABO
     */
    private String appliyAbo;
    /**
     * HDSD00_06_01.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_06_01.AGE
     */
    private String age;
    /**
     * HDSD00_06_01.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_06_01.ABO_CODE
     */
    private String aboCode;
    /**
     * HDSD00_06_01.ABO
     */
    private String abo;
    /**
     * HDSD00_06_01.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_06_01.GENDER
     */
    private String gender;

    /**
     * HDSD00_06_01.upload_time
     *
     * @return the value of HDSD00_06_01.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_06_01.upload_time
     *
     * @param uploadTime the value for HDSD00_06_01.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_06_01.status
     *
     * @return the value of HDSD00_06_01.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_06_01.status
     *
     * @param status the value for HDSD00_06_01.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_06_01.pk
     *
     * @return the value of HDSD00_06_01.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_06_01.pk
     *
     * @param pk the value for HDSD00_06_01.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_06_01.empi
     *
     * @return the value of HDSD00_06_01.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_06_01.empi
     *
     * @param empi the value for HDSD00_06_01.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_06_01.ENCOUNTER_ID
     *
     * @return the value of HDSD00_06_01.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_06_01.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_06_01.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_06_01.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_06_01.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_06_01.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_06_01.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_06_01.WARD_NAME
     *
     * @return the value of HDSD00_06_01.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_06_01.WARD_NAME
     *
     * @param wardName the value for HDSD00_06_01.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_06_01.WARD_ID
     *
     * @return the value of HDSD00_06_01.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_06_01.WARD_ID
     *
     * @param wardId the value for HDSD00_06_01.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_06_01.WARDS_NAME
     *
     * @return the value of HDSD00_06_01.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_06_01.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_06_01.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_06_01.WARDS_ID
     *
     * @return the value of HDSD00_06_01.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_06_01.WARDS_ID
     *
     * @param wardsId the value for HDSD00_06_01.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_06_01.VERSION
     *
     * @return the value of HDSD00_06_01.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_06_01.VERSION
     *
     * @param version the value for HDSD00_06_01.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_06_01.TRANSFUSION_TRIGGER
     *
     * @return the value of HDSD00_06_01.TRANSFUSION_TRIGGER
     */
    public String getTransfusionTrigger() {
        return transfusionTrigger;
    }

    /**
     * HDSD00_06_01.TRANSFUSION_TRIGGER
     *
     * @param transfusionTrigger the value for HDSD00_06_01.TRANSFUSION_TRIGGER
     */
    public void setTransfusionTrigger(String transfusionTrigger) {
        this.transfusionTrigger = transfusionTrigger;
    }

    /**
     * HDSD00_06_01.TRANSFUSION_NUM
     *
     * @return the value of HDSD00_06_01.TRANSFUSION_NUM
     */
    public String getTransfusionNum() {
        return transfusionNum;
    }

    /**
     * HDSD00_06_01.TRANSFUSION_NUM
     *
     * @param transfusionNum the value for HDSD00_06_01.TRANSFUSION_NUM
     */
    public void setTransfusionNum(String transfusionNum) {
        this.transfusionNum = transfusionNum;
    }

    /**
     * HDSD00_06_01.RH_GROUP
     *
     * @return the value of HDSD00_06_01.RH_GROUP
     */
    public String getRhGroup() {
        return rhGroup;
    }

    /**
     * HDSD00_06_01.RH_GROUP
     *
     * @param rhGroup the value for HDSD00_06_01.RH_GROUP
     */
    public void setRhGroup(String rhGroup) {
        this.rhGroup = rhGroup;
    }

    /**
     * HDSD00_06_01.RH_CODE
     *
     * @return the value of HDSD00_06_01.RH_CODE
     */
    public String getRhCode() {
        return rhCode;
    }

    /**
     * HDSD00_06_01.RH_CODE
     *
     * @param rhCode the value for HDSD00_06_01.RH_CODE
     */
    public void setRhCode(String rhCode) {
        this.rhCode = rhCode;
    }

    /**
     * HDSD00_06_01.REPORT_TITLE
     *
     * @return the value of HDSD00_06_01.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_06_01.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_06_01.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_06_01.PATIENT_NAME
     *
     * @return the value of HDSD00_06_01.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_06_01.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_06_01.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_06_01.PATIENT_TYPE
     *
     * @return the value of HDSD00_06_01.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_06_01.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_06_01.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_06_01.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_06_01.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_06_01.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_06_01.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_06_01.VISIT_TIMES
     *
     * @return the value of HDSD00_06_01.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_06_01.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_06_01.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_06_01.VISIT_ID
     *
     * @return the value of HDSD00_06_01.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_06_01.VISIT_ID
     *
     * @param visitId the value for HDSD00_06_01.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_06_01.VISIT_DOMAIN
     *
     * @return the value of HDSD00_06_01.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_06_01.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_06_01.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_06_01.PATIENT_ID
     *
     * @return the value of HDSD00_06_01.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_06_01.PATIENT_ID
     *
     * @param patientId the value for HDSD00_06_01.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_06_01.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_06_01.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_06_01.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_06_01.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_06_01.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_06_01.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_06_01.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_06_01.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_06_01.LOAD_TYPE
     *
     * @return the value of HDSD00_06_01.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_06_01.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_06_01.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_06_01.INPATIENT
     *
     * @return the value of HDSD00_06_01.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_06_01.INPATIENT
     *
     * @param inpatient the value for HDSD00_06_01.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_06_01.ID_NUM
     *
     * @return the value of HDSD00_06_01.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_06_01.ID_NUM
     *
     * @param idNum the value for HDSD00_06_01.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_06_01.HOSPITAL_NAME
     *
     * @return the value of HDSD00_06_01.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_06_01.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_06_01.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_06_01.HOSPITAL_CODE
     *
     * @return the value of HDSD00_06_01.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_06_01.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_06_01.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_06_01.GENDER_CODE
     *
     * @return the value of HDSD00_06_01.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_06_01.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_06_01.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_06_01.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_06_01.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_06_01.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_06_01.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_06_01.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_06_01.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_06_01.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_06_01.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_06_01.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_06_01.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_06_01.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_06_01.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_06_01.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_06_01.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_06_01.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_06_01.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_06_01.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_06_01.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_06_01.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_06_01.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_06_01.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_06_01.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_06_01.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_06_01.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_06_01.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_06_01.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_06_01.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_06_01.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_06_01.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_06_01.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_06_01.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_06_01.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_06_01.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_06_01.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_06_01.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_06_01.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_06_01.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_06_01.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_06_01.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_06_01.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_06_01.DOC_AUTHOR
     *
     * @return the value of HDSD00_06_01.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_06_01.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_06_01.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_06_01.DOC_AUDIT_DATE
     *
     * @return the value of HDSD00_06_01.DOC_AUDIT_DATE
     */
    public String getDocAuditDate() {
        return docAuditDate;
    }

    /**
     * HDSD00_06_01.DOC_AUDIT_DATE
     *
     * @param docAuditDate the value for HDSD00_06_01.DOC_AUDIT_DATE
     */
    public void setDocAuditDate(String docAuditDate) {
        this.docAuditDate = docAuditDate;
    }

    /**
     * HDSD00_06_01.DOC_AUDITORCODE
     *
     * @return the value of HDSD00_06_01.DOC_AUDITORCODE
     */
    public String getDocAuditorcode() {
        return docAuditorcode;
    }

    /**
     * HDSD00_06_01.DOC_AUDITORCODE
     *
     * @param docAuditorcode the value for HDSD00_06_01.DOC_AUDITORCODE
     */
    public void setDocAuditorcode(String docAuditorcode) {
        this.docAuditorcode = docAuditorcode;
    }

    /**
     * HDSD00_06_01.DOC_AUDITOR
     *
     * @return the value of HDSD00_06_01.DOC_AUDITOR
     */
    public String getDocAuditor() {
        return docAuditor;
    }

    /**
     * HDSD00_06_01.DOC_AUDITOR
     *
     * @param docAuditor the value for HDSD00_06_01.DOC_AUDITOR
     */
    public void setDocAuditor(String docAuditor) {
        this.docAuditor = docAuditor;
    }

    /**
     * HDSD00_06_01.DEPT_NAME
     *
     * @return the value of HDSD00_06_01.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_06_01.DEPT_NAME
     *
     * @param deptName the value for HDSD00_06_01.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_06_01.BLOOD_VOLUME
     *
     * @return the value of HDSD00_06_01.BLOOD_VOLUME
     */
    public String getBloodVolume() {
        return bloodVolume;
    }

    /**
     * HDSD00_06_01.BLOOD_VOLUME
     *
     * @param bloodVolume the value for HDSD00_06_01.BLOOD_VOLUME
     */
    public void setBloodVolume(String bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    /**
     * HDSD00_06_01.BLOOD_VARIETIESCODE
     *
     * @return the value of HDSD00_06_01.BLOOD_VARIETIESCODE
     */
    public String getBloodVarietiescode() {
        return bloodVarietiescode;
    }

    /**
     * HDSD00_06_01.BLOOD_VARIETIESCODE
     *
     * @param bloodVarietiescode the value for HDSD00_06_01.BLOOD_VARIETIESCODE
     */
    public void setBloodVarietiescode(String bloodVarietiescode) {
        this.bloodVarietiescode = bloodVarietiescode;
    }

    /**
     * HDSD00_06_01.BLOOD_VARIETIES
     *
     * @return the value of HDSD00_06_01.BLOOD_VARIETIES
     */
    public String getBloodVarieties() {
        return bloodVarieties;
    }

    /**
     * HDSD00_06_01.BLOOD_VARIETIES
     *
     * @param bloodVarieties the value for HDSD00_06_01.BLOOD_VARIETIES
     */
    public void setBloodVarieties(String bloodVarieties) {
        this.bloodVarieties = bloodVarieties;
    }

    /**
     * HDSD00_06_01.BLOOD_UNIT
     *
     * @return the value of HDSD00_06_01.BLOOD_UNIT
     */
    public String getBloodUnit() {
        return bloodUnit;
    }

    /**
     * HDSD00_06_01.BLOOD_UNIT
     *
     * @param bloodUnit the value for HDSD00_06_01.BLOOD_UNIT
     */
    public void setBloodUnit(String bloodUnit) {
        this.bloodUnit = bloodUnit;
    }

    /**
     * HDSD00_06_01.BLOOD_REACTION_TYPECODE
     *
     * @return the value of HDSD00_06_01.BLOOD_REACTION_TYPECODE
     */
    public String getBloodReactionTypecode() {
        return bloodReactionTypecode;
    }

    /**
     * HDSD00_06_01.BLOOD_REACTION_TYPECODE
     *
     * @param bloodReactionTypecode the value for HDSD00_06_01.BLOOD_REACTION_TYPECODE
     */
    public void setBloodReactionTypecode(String bloodReactionTypecode) {
        this.bloodReactionTypecode = bloodReactionTypecode;
    }

    /**
     * HDSD00_06_01.BLOOD_REACTION_TYPE
     *
     * @return the value of HDSD00_06_01.BLOOD_REACTION_TYPE
     */
    public String getBloodReactionType() {
        return bloodReactionType;
    }

    /**
     * HDSD00_06_01.BLOOD_REACTION_TYPE
     *
     * @param bloodReactionType the value for HDSD00_06_01.BLOOD_REACTION_TYPE
     */
    public void setBloodReactionType(String bloodReactionType) {
        this.bloodReactionType = bloodReactionType;
    }

    /**
     * HDSD00_06_01.BLOOD_REACTION_MARK
     *
     * @return the value of HDSD00_06_01.BLOOD_REACTION_MARK
     */
    public String getBloodReactionMark() {
        return bloodReactionMark;
    }

    /**
     * HDSD00_06_01.BLOOD_REACTION_MARK
     *
     * @param bloodReactionMark the value for HDSD00_06_01.BLOOD_REACTION_MARK
     */
    public void setBloodReactionMark(String bloodReactionMark) {
        this.bloodReactionMark = bloodReactionMark;
    }

    /**
     * HDSD00_06_01.BLOOD_PROCESS
     *
     * @return the value of HDSD00_06_01.BLOOD_PROCESS
     */
    public String getBloodProcess() {
        return bloodProcess;
    }

    /**
     * HDSD00_06_01.BLOOD_PROCESS
     *
     * @param bloodProcess the value for HDSD00_06_01.BLOOD_PROCESS
     */
    public void setBloodProcess(String bloodProcess) {
        this.bloodProcess = bloodProcess;
    }

    /**
     * HDSD00_06_01.BLOOD_NATURECODE
     *
     * @return the value of HDSD00_06_01.BLOOD_NATURECODE
     */
    public String getBloodNaturecode() {
        return bloodNaturecode;
    }

    /**
     * HDSD00_06_01.BLOOD_NATURECODE
     *
     * @param bloodNaturecode the value for HDSD00_06_01.BLOOD_NATURECODE
     */
    public void setBloodNaturecode(String bloodNaturecode) {
        this.bloodNaturecode = bloodNaturecode;
    }

    /**
     * HDSD00_06_01.BLOOD_NATURE
     *
     * @return the value of HDSD00_06_01.BLOOD_NATURE
     */
    public String getBloodNature() {
        return bloodNature;
    }

    /**
     * HDSD00_06_01.BLOOD_NATURE
     *
     * @param bloodNature the value for HDSD00_06_01.BLOOD_NATURE
     */
    public void setBloodNature(String bloodNature) {
        this.bloodNature = bloodNature;
    }

    /**
     * HDSD00_06_01.BLOOD_HISTORY_MARK
     *
     * @return the value of HDSD00_06_01.BLOOD_HISTORY_MARK
     */
    public String getBloodHistoryMark() {
        return bloodHistoryMark;
    }

    /**
     * HDSD00_06_01.BLOOD_HISTORY_MARK
     *
     * @param bloodHistoryMark the value for HDSD00_06_01.BLOOD_HISTORY_MARK
     */
    public void setBloodHistoryMark(String bloodHistoryMark) {
        this.bloodHistoryMark = bloodHistoryMark;
    }

    /**
     * HDSD00_06_01.BLOOD_HISTORY
     *
     * @return the value of HDSD00_06_01.BLOOD_HISTORY
     */
    public String getBloodHistory() {
        return bloodHistory;
    }

    /**
     * HDSD00_06_01.BLOOD_HISTORY
     *
     * @param bloodHistory the value for HDSD00_06_01.BLOOD_HISTORY
     */
    public void setBloodHistory(String bloodHistory) {
        this.bloodHistory = bloodHistory;
    }

    /**
     * HDSD00_06_01.BLOOD_DATE
     *
     * @return the value of HDSD00_06_01.BLOOD_DATE
     */
    public String getBloodDate() {
        return bloodDate;
    }

    /**
     * HDSD00_06_01.BLOOD_DATE
     *
     * @param bloodDate the value for HDSD00_06_01.BLOOD_DATE
     */
    public void setBloodDate(String bloodDate) {
        this.bloodDate = bloodDate;
    }

    /**
     * HDSD00_06_01.BLOOD_CAUSES
     *
     * @return the value of HDSD00_06_01.BLOOD_CAUSES
     */
    public String getBloodCauses() {
        return bloodCauses;
    }

    /**
     * HDSD00_06_01.BLOOD_CAUSES
     *
     * @param bloodCauses the value for HDSD00_06_01.BLOOD_CAUSES
     */
    public void setBloodCauses(String bloodCauses) {
        this.bloodCauses = bloodCauses;
    }

    /**
     * HDSD00_06_01.BLOODBAG_CODE
     *
     * @return the value of HDSD00_06_01.BLOODBAG_CODE
     */
    public String getBloodbagCode() {
        return bloodbagCode;
    }

    /**
     * HDSD00_06_01.BLOODBAG_CODE
     *
     * @param bloodbagCode the value for HDSD00_06_01.BLOODBAG_CODE
     */
    public void setBloodbagCode(String bloodbagCode) {
        this.bloodbagCode = bloodbagCode;
    }

    /**
     * HDSD00_06_01.BED_NO
     *
     * @return the value of HDSD00_06_01.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_06_01.BED_NO
     *
     * @param bedNo the value for HDSD00_06_01.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_06_01.BED_NAME
     *
     * @return the value of HDSD00_06_01.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_06_01.BED_NAME
     *
     * @param bedName the value for HDSD00_06_01.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_06_01.APPY_ID
     *
     * @return the value of HDSD00_06_01.APPY_ID
     */
    public String getAppyId() {
        return appyId;
    }

    /**
     * HDSD00_06_01.APPY_ID
     *
     * @param appyId the value for HDSD00_06_01.APPY_ID
     */
    public void setAppyId(String appyId) {
        this.appyId = appyId;
    }

    /**
     * HDSD00_06_01.APPLIY_RHD_CODE
     *
     * @return the value of HDSD00_06_01.APPLIY_RHD_CODE
     */
    public String getAppliyRhdCode() {
        return appliyRhdCode;
    }

    /**
     * HDSD00_06_01.APPLIY_RHD_CODE
     *
     * @param appliyRhdCode the value for HDSD00_06_01.APPLIY_RHD_CODE
     */
    public void setAppliyRhdCode(String appliyRhdCode) {
        this.appliyRhdCode = appliyRhdCode;
    }

    /**
     * HDSD00_06_01.APPLIY_RHD
     *
     * @return the value of HDSD00_06_01.APPLIY_RHD
     */
    public String getAppliyRhd() {
        return appliyRhd;
    }

    /**
     * HDSD00_06_01.APPLIY_RHD
     *
     * @param appliyRhd the value for HDSD00_06_01.APPLIY_RHD
     */
    public void setAppliyRhd(String appliyRhd) {
        this.appliyRhd = appliyRhd;
    }

    /**
     * HDSD00_06_01.APPLIY_ABO_CODE
     *
     * @return the value of HDSD00_06_01.APPLIY_ABO_CODE
     */
    public String getAppliyAboCode() {
        return appliyAboCode;
    }

    /**
     * HDSD00_06_01.APPLIY_ABO_CODE
     *
     * @param appliyAboCode the value for HDSD00_06_01.APPLIY_ABO_CODE
     */
    public void setAppliyAboCode(String appliyAboCode) {
        this.appliyAboCode = appliyAboCode;
    }

    /**
     * HDSD00_06_01.APPLIY_ABO
     *
     * @return the value of HDSD00_06_01.APPLIY_ABO
     */
    public String getAppliyAbo() {
        return appliyAbo;
    }

    /**
     * HDSD00_06_01.APPLIY_ABO
     *
     * @param appliyAbo the value for HDSD00_06_01.APPLIY_ABO
     */
    public void setAppliyAbo(String appliyAbo) {
        this.appliyAbo = appliyAbo;
    }

    /**
     * HDSD00_06_01.AGE_UNIT
     *
     * @return the value of HDSD00_06_01.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_06_01.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_06_01.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_06_01.AGE
     *
     * @return the value of HDSD00_06_01.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_06_01.AGE
     *
     * @param age the value for HDSD00_06_01.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_06_01.VISIT_DATE
     *
     * @return the value of HDSD00_06_01.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_06_01.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_06_01.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_06_01.ABO_CODE
     *
     * @return the value of HDSD00_06_01.ABO_CODE
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * HDSD00_06_01.ABO_CODE
     *
     * @param aboCode the value for HDSD00_06_01.ABO_CODE
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode;
    }

    /**
     * HDSD00_06_01.ABO
     *
     * @return the value of HDSD00_06_01.ABO
     */
    public String getAbo() {
        return abo;
    }

    /**
     * HDSD00_06_01.ABO
     *
     * @param abo the value for HDSD00_06_01.ABO
     */
    public void setAbo(String abo) {
        this.abo = abo;
    }

    /**
     * HDSD00_06_01.DEPT_CODE
     *
     * @return the value of HDSD00_06_01.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_06_01.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_06_01.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_06_01.GENDER
     *
     * @return the value of HDSD00_06_01.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_06_01.GENDER
     *
     * @param gender the value for HDSD00_06_01.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}