package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_14_15")
public class Hdsd001415 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_14_15
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_14_15.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_14_15.status
     */
    private String status;
    /**
     * HDSD00_14_15.pk
     */
    private Integer pk;
    /**
     * HDSD00_14_15.empi
     */
    private String empi;
    /**
     * HDSD00_14_15.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_14_15.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_14_15.WARD_ROUND_RECORD
     */
    private String wardRoundRecord;
    /**
     * HDSD00_14_15.WARD_ROUND_DATE
     */
    private String wardRoundDate;
    /**
     * HDSD00_14_15.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_14_15.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_14_15.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_14_15.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_14_15.VERSION
     */
    private String version;
    /**
     * HDSD00_14_15.TCM_FOUR_DIAGNOSIS
     */
    private String tcmFourDiagnosis;
    /**
     * HDSD00_14_15.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_14_15.RECORDER_SIGNDATE
     */
    private String recorderSigndate;
    /**
     * HDSD00_14_15.RECORDER_NAME
     */
    private String recorderName;
    /**
     * HDSD00_14_15.RECORDER_CODE
     */
    private String recorderCode;
    /**
     * HDSD00_14_15.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_14_15.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_14_15.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_14_15.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_14_15.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_14_15.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_14_15.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_14_15.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_14_15.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_14_15.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_14_15.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_14_15.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_14_15.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_14_15.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_14_15.GENDER
     */
    private String gender;
    /**
     * HDSD00_14_15.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_14_15.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_14_15.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_14_15.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_14_15.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_14_15.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_14_15.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_14_15.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_14_15.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_14_15.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_14_15.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_14_15.DISCRIMINATE_DETAIL
     */
    private String discriminateDetail;
    /**
     * HDSD00_14_15.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_14_15.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_14_15.DATEOF_BIRTH
     */
    private String dateofBirth;
    /**
     * HDSD00_14_15.CHIEF_SIGN_DATE
     */
    private String chiefSignDate;
    /**
     * HDSD00_14_15.CHIEF_NAME
     */
    private String chiefName;
    /**
     * HDSD00_14_15.CHIEF_CODE
     */
    private String chiefCode;
    /**
     * HDSD00_14_15.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_14_15.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_14_15.ATTENDING_SIGNDATE
     */
    private String attendingSigndate;
    /**
     * HDSD00_14_15.ATTENDING_NAME
     */
    private String attendingName;
    /**
     * HDSD00_14_15.ATTENDING_CODE
     */
    private String attendingCode;
    /**
     * HDSD00_14_15.ASSESSMENT_PLAN
     */
    private String assessmentPlan;
    /**
     * HDSD00_14_15.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_14_15.AGE
     */
    private String age;
    /**
     * HDSD00_14_15.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_14_15.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_14_15.DECOCT_METHOD
     */
    private String decoctMethod;
    /**
     * HDSD00_14_15.TCM_DRUG_USE
     */
    private String tcmDrugUse;
    /**
     * HDSD00_14_15.ORDER_CONTENT
     */
    private String orderContent;

    /**
     * HDSD00_14_15.upload_time
     *
     * @return the value of HDSD00_14_15.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_14_15.upload_time
     *
     * @param uploadTime the value for HDSD00_14_15.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_14_15.status
     *
     * @return the value of HDSD00_14_15.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_14_15.status
     *
     * @param status the value for HDSD00_14_15.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_14_15.pk
     *
     * @return the value of HDSD00_14_15.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_14_15.pk
     *
     * @param pk the value for HDSD00_14_15.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_14_15.empi
     *
     * @return the value of HDSD00_14_15.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_14_15.empi
     *
     * @param empi the value for HDSD00_14_15.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_14_15.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_14_15.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_14_15.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_14_15.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_14_15.ENCOUNTER_ID
     *
     * @return the value of HDSD00_14_15.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_14_15.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_14_15.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_14_15.WARD_ROUND_RECORD
     *
     * @return the value of HDSD00_14_15.WARD_ROUND_RECORD
     */
    public String getWardRoundRecord() {
        return wardRoundRecord;
    }

    /**
     * HDSD00_14_15.WARD_ROUND_RECORD
     *
     * @param wardRoundRecord the value for HDSD00_14_15.WARD_ROUND_RECORD
     */
    public void setWardRoundRecord(String wardRoundRecord) {
        this.wardRoundRecord = wardRoundRecord;
    }

    /**
     * HDSD00_14_15.WARD_ROUND_DATE
     *
     * @return the value of HDSD00_14_15.WARD_ROUND_DATE
     */
    public String getWardRoundDate() {
        return wardRoundDate;
    }

    /**
     * HDSD00_14_15.WARD_ROUND_DATE
     *
     * @param wardRoundDate the value for HDSD00_14_15.WARD_ROUND_DATE
     */
    public void setWardRoundDate(String wardRoundDate) {
        this.wardRoundDate = wardRoundDate;
    }

    /**
     * HDSD00_14_15.WARD_NAME
     *
     * @return the value of HDSD00_14_15.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_14_15.WARD_NAME
     *
     * @param wardName the value for HDSD00_14_15.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_14_15.WARD_ID
     *
     * @return the value of HDSD00_14_15.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_14_15.WARD_ID
     *
     * @param wardId the value for HDSD00_14_15.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_14_15.WARDS_NAME
     *
     * @return the value of HDSD00_14_15.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_14_15.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_14_15.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_14_15.WARDS_ID
     *
     * @return the value of HDSD00_14_15.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_14_15.WARDS_ID
     *
     * @param wardsId the value for HDSD00_14_15.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_14_15.VERSION
     *
     * @return the value of HDSD00_14_15.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_14_15.VERSION
     *
     * @param version the value for HDSD00_14_15.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_14_15.TCM_FOUR_DIAGNOSIS
     *
     * @return the value of HDSD00_14_15.TCM_FOUR_DIAGNOSIS
     */
    public String getTcmFourDiagnosis() {
        return tcmFourDiagnosis;
    }

    /**
     * HDSD00_14_15.TCM_FOUR_DIAGNOSIS
     *
     * @param tcmFourDiagnosis the value for HDSD00_14_15.TCM_FOUR_DIAGNOSIS
     */
    public void setTcmFourDiagnosis(String tcmFourDiagnosis) {
        this.tcmFourDiagnosis = tcmFourDiagnosis;
    }

    /**
     * HDSD00_14_15.REPORT_TITLE
     *
     * @return the value of HDSD00_14_15.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_14_15.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_14_15.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_14_15.RECORDER_SIGNDATE
     *
     * @return the value of HDSD00_14_15.RECORDER_SIGNDATE
     */
    public String getRecorderSigndate() {
        return recorderSigndate;
    }

    /**
     * HDSD00_14_15.RECORDER_SIGNDATE
     *
     * @param recorderSigndate the value for HDSD00_14_15.RECORDER_SIGNDATE
     */
    public void setRecorderSigndate(String recorderSigndate) {
        this.recorderSigndate = recorderSigndate;
    }

    /**
     * HDSD00_14_15.RECORDER_NAME
     *
     * @return the value of HDSD00_14_15.RECORDER_NAME
     */
    public String getRecorderName() {
        return recorderName;
    }

    /**
     * HDSD00_14_15.RECORDER_NAME
     *
     * @param recorderName the value for HDSD00_14_15.RECORDER_NAME
     */
    public void setRecorderName(String recorderName) {
        this.recorderName = recorderName;
    }

    /**
     * HDSD00_14_15.RECORDER_CODE
     *
     * @return the value of HDSD00_14_15.RECORDER_CODE
     */
    public String getRecorderCode() {
        return recorderCode;
    }

    /**
     * HDSD00_14_15.RECORDER_CODE
     *
     * @param recorderCode the value for HDSD00_14_15.RECORDER_CODE
     */
    public void setRecorderCode(String recorderCode) {
        this.recorderCode = recorderCode;
    }

    /**
     * HDSD00_14_15.PATIENT_NAME
     *
     * @return the value of HDSD00_14_15.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_14_15.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_14_15.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_14_15.PATIENT_TYPE
     *
     * @return the value of HDSD00_14_15.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_14_15.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_14_15.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_14_15.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_14_15.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_14_15.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_14_15.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_14_15.VISIT_TIMES
     *
     * @return the value of HDSD00_14_15.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_14_15.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_14_15.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_14_15.VISIT_ID
     *
     * @return the value of HDSD00_14_15.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_14_15.VISIT_ID
     *
     * @param visitId the value for HDSD00_14_15.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_14_15.VISIT_DOMAIN
     *
     * @return the value of HDSD00_14_15.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_14_15.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_14_15.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_14_15.PATIENT_ID
     *
     * @return the value of HDSD00_14_15.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_14_15.PATIENT_ID
     *
     * @param patientId the value for HDSD00_14_15.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_14_15.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_14_15.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_14_15.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_14_15.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_14_15.LOAD_TYPE
     *
     * @return the value of HDSD00_14_15.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_14_15.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_14_15.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_14_15.INPATIENT
     *
     * @return the value of HDSD00_14_15.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_14_15.INPATIENT
     *
     * @param inpatient the value for HDSD00_14_15.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_14_15.ID_NUM
     *
     * @return the value of HDSD00_14_15.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_14_15.ID_NUM
     *
     * @param idNum the value for HDSD00_14_15.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_14_15.HOSPITAL_NAME
     *
     * @return the value of HDSD00_14_15.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_14_15.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_14_15.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_14_15.HOSPITAL_CODE
     *
     * @return the value of HDSD00_14_15.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_14_15.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_14_15.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_14_15.GENDER_CODE
     *
     * @return the value of HDSD00_14_15.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_14_15.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_14_15.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_14_15.GENDER
     *
     * @return the value of HDSD00_14_15.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_14_15.GENDER
     *
     * @param gender the value for HDSD00_14_15.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_14_15.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_14_15.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_14_15.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_14_15.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_14_15.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_14_15.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_14_15.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_14_15.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_14_15.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_14_15.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_14_15.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_14_15.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_14_15.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_14_15.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_14_15.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_14_15.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_14_15.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_14_15.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_14_15.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_14_15.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_14_15.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_14_15.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_14_15.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_14_15.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_14_15.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_14_15.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_14_15.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_14_15.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_14_15.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_14_15.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_14_15.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_14_15.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_14_15.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_14_15.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_14_15.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_14_15.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_14_15.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_14_15.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_14_15.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_14_15.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_14_15.DOC_AUTHOR
     *
     * @return the value of HDSD00_14_15.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_14_15.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_14_15.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_14_15.DISCRIMINATE_DETAIL
     *
     * @return the value of HDSD00_14_15.DISCRIMINATE_DETAIL
     */
    public String getDiscriminateDetail() {
        return discriminateDetail;
    }

    /**
     * HDSD00_14_15.DISCRIMINATE_DETAIL
     *
     * @param discriminateDetail the value for HDSD00_14_15.DISCRIMINATE_DETAIL
     */
    public void setDiscriminateDetail(String discriminateDetail) {
        this.discriminateDetail = discriminateDetail;
    }

    /**
     * HDSD00_14_15.DEPT_NAME
     *
     * @return the value of HDSD00_14_15.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_14_15.DEPT_NAME
     *
     * @param deptName the value for HDSD00_14_15.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_14_15.DEPT_CODE
     *
     * @return the value of HDSD00_14_15.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_14_15.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_14_15.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_14_15.DATEOF_BIRTH
     *
     * @return the value of HDSD00_14_15.DATEOF_BIRTH
     */
    public String getDateofBirth() {
        return dateofBirth;
    }

    /**
     * HDSD00_14_15.DATEOF_BIRTH
     *
     * @param dateofBirth the value for HDSD00_14_15.DATEOF_BIRTH
     */
    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /**
     * HDSD00_14_15.CHIEF_SIGN_DATE
     *
     * @return the value of HDSD00_14_15.CHIEF_SIGN_DATE
     */
    public String getChiefSignDate() {
        return chiefSignDate;
    }

    /**
     * HDSD00_14_15.CHIEF_SIGN_DATE
     *
     * @param chiefSignDate the value for HDSD00_14_15.CHIEF_SIGN_DATE
     */
    public void setChiefSignDate(String chiefSignDate) {
        this.chiefSignDate = chiefSignDate;
    }

    /**
     * HDSD00_14_15.CHIEF_NAME
     *
     * @return the value of HDSD00_14_15.CHIEF_NAME
     */
    public String getChiefName() {
        return chiefName;
    }

    /**
     * HDSD00_14_15.CHIEF_NAME
     *
     * @param chiefName the value for HDSD00_14_15.CHIEF_NAME
     */
    public void setChiefName(String chiefName) {
        this.chiefName = chiefName;
    }

    /**
     * HDSD00_14_15.CHIEF_CODE
     *
     * @return the value of HDSD00_14_15.CHIEF_CODE
     */
    public String getChiefCode() {
        return chiefCode;
    }

    /**
     * HDSD00_14_15.CHIEF_CODE
     *
     * @param chiefCode the value for HDSD00_14_15.CHIEF_CODE
     */
    public void setChiefCode(String chiefCode) {
        this.chiefCode = chiefCode;
    }

    /**
     * HDSD00_14_15.BED_NO
     *
     * @return the value of HDSD00_14_15.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_14_15.BED_NO
     *
     * @param bedNo the value for HDSD00_14_15.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_14_15.BED_NAME
     *
     * @return the value of HDSD00_14_15.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_14_15.BED_NAME
     *
     * @param bedName the value for HDSD00_14_15.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_14_15.ATTENDING_SIGNDATE
     *
     * @return the value of HDSD00_14_15.ATTENDING_SIGNDATE
     */
    public String getAttendingSigndate() {
        return attendingSigndate;
    }

    /**
     * HDSD00_14_15.ATTENDING_SIGNDATE
     *
     * @param attendingSigndate the value for HDSD00_14_15.ATTENDING_SIGNDATE
     */
    public void setAttendingSigndate(String attendingSigndate) {
        this.attendingSigndate = attendingSigndate;
    }

    /**
     * HDSD00_14_15.ATTENDING_NAME
     *
     * @return the value of HDSD00_14_15.ATTENDING_NAME
     */
    public String getAttendingName() {
        return attendingName;
    }

    /**
     * HDSD00_14_15.ATTENDING_NAME
     *
     * @param attendingName the value for HDSD00_14_15.ATTENDING_NAME
     */
    public void setAttendingName(String attendingName) {
        this.attendingName = attendingName;
    }

    /**
     * HDSD00_14_15.ATTENDING_CODE
     *
     * @return the value of HDSD00_14_15.ATTENDING_CODE
     */
    public String getAttendingCode() {
        return attendingCode;
    }

    /**
     * HDSD00_14_15.ATTENDING_CODE
     *
     * @param attendingCode the value for HDSD00_14_15.ATTENDING_CODE
     */
    public void setAttendingCode(String attendingCode) {
        this.attendingCode = attendingCode;
    }

    /**
     * HDSD00_14_15.ASSESSMENT_PLAN
     *
     * @return the value of HDSD00_14_15.ASSESSMENT_PLAN
     */
    public String getAssessmentPlan() {
        return assessmentPlan;
    }

    /**
     * HDSD00_14_15.ASSESSMENT_PLAN
     *
     * @param assessmentPlan the value for HDSD00_14_15.ASSESSMENT_PLAN
     */
    public void setAssessmentPlan(String assessmentPlan) {
        this.assessmentPlan = assessmentPlan;
    }

    /**
     * HDSD00_14_15.AGE_UNIT
     *
     * @return the value of HDSD00_14_15.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_14_15.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_14_15.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_14_15.AGE
     *
     * @return the value of HDSD00_14_15.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_14_15.AGE
     *
     * @param age the value for HDSD00_14_15.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_14_15.VISIT_DATE
     *
     * @return the value of HDSD00_14_15.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_14_15.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_14_15.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_14_15.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_14_15.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_14_15.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_14_15.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_14_15.DECOCT_METHOD
     *
     * @return the value of HDSD00_14_15.DECOCT_METHOD
     */
    public String getDecoctMethod() {
        return decoctMethod;
    }

    /**
     * HDSD00_14_15.DECOCT_METHOD
     *
     * @param decoctMethod the value for HDSD00_14_15.DECOCT_METHOD
     */
    public void setDecoctMethod(String decoctMethod) {
        this.decoctMethod = decoctMethod;
    }

    /**
     * HDSD00_14_15.TCM_DRUG_USE
     *
     * @return the value of HDSD00_14_15.TCM_DRUG_USE
     */
    public String getTcmDrugUse() {
        return tcmDrugUse;
    }

    /**
     * HDSD00_14_15.TCM_DRUG_USE
     *
     * @param tcmDrugUse the value for HDSD00_14_15.TCM_DRUG_USE
     */
    public void setTcmDrugUse(String tcmDrugUse) {
        this.tcmDrugUse = tcmDrugUse;
    }

    /**
     * HDSD00_14_15.ORDER_CONTENT
     *
     * @return the value of HDSD00_14_15.ORDER_CONTENT
     */
    public String getOrderContent() {
        return orderContent;
    }

    /**
     * HDSD00_14_15.ORDER_CONTENT
     *
     * @param orderContent the value for HDSD00_14_15.ORDER_CONTENT
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }
}