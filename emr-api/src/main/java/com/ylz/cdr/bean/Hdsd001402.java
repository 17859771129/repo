package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_14_02")
public class Hdsd001402 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_14_02
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_14_02.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_14_02.status
     */
    private String status;
    /**
     * HDSD00_14_02.pk
     */
    private Integer pk;
    /**
     * HDSD00_14_02.empi
     */
    private String empi;
    /**
     * HDSD00_14_02.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_14_02.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_14_02.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_14_02.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_14_02.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_14_02.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_14_02.VERSION
     */
    private String version;
    /**
     * HDSD00_14_02.TREATMENT_PROCESS
     */
    private String treatmentProcess;
    /**
     * HDSD00_14_02.TREATMENT_PROCESS_DESC
     */
    private String treatmentProcessDesc;
    /**
     * HDSD00_14_02.TCM_FOUR_DIAGNOSIS
     */
    private String tcmFourDiagnosis;
    /**
     * HDSD00_14_02.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_14_02.RECORD_SUMMARY
     */
    private String recordSummary;
    /**
     * HDSD00_14_02.PRINCIPLE_AND_METHOD
     */
    private String principleAndMethod;
    /**
     * HDSD00_14_02.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_14_02.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_14_02.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_14_02.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_14_02.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_14_02.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_14_02.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_14_02.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_14_02.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_14_02.MEDICAL_INSTITUTION_NAME
     */
    private String medicalInstitutionName;
    /**
     * HDSD00_14_02.MEDICAL_INSTITUTION
     */
    private String medicalInstitution;
    /**
     * HDSD00_14_02.MEDICAL_CODE
     */
    private String medicalCode;
    /**
     * HDSD00_14_02.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_14_02.ITEM_RESULT
     */
    private String itemResult;
    /**
     * HDSD00_14_02.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_14_02.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_14_02.INSTITUTION_APPLY
     */
    private String institutionApply;
    /**
     * HDSD00_14_02.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_14_02.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_14_02.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_14_02.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_14_02.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_14_02.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_14_02.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_14_02.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_14_02.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_14_02.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_14_02.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_14_02.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_14_02.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_14_02.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_14_02.CONSULTATION_DEPT_CODE
     */
    private String consultationDeptCode;
    /**
     * HDSD00_14_02.DATEOF_BIRTH
     */
    private String dateofBirth;
    /**
     * HDSD00_14_02.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_14_02.CONSULTATION_TYPE
     */
    private String consultationType;
    /**
     * HDSD00_14_02.CONSULTATION_REASON
     */
    private String consultationReason;
    /**
     * HDSD00_14_02.CONSULTATION_PURPOSE
     */
    private String consultationPurpose;
    /**
     * HDSD00_14_02.CONSULTATION_OPINION
     */
    private String consultationOpinion;
    /**
     * HDSD00_14_02.CONSULTATION_DEPT
     */
    private String consultationDept;
    /**
     * HDSD00_14_02.CONSULTATION_DATE
     */
    private String consultationDate;
    /**
     * HDSD00_14_02.CONSULTATION_APPLY_DEPT
     */
    private String consultationApplyDept;
    /**
     * HDSD00_14_02.CONSULTATION_APPLYCODE
     */
    private String consultationApplycode;
    /**
     * HDSD00_14_02.CONSULTATION_APPLY
     */
    private String consultationApply;
    /**
     * HDSD00_14_02.CONSULTANT_NAME
     */
    private String consultantName;
    /**
     * HDSD00_14_02.CONSULTANT_CODE
     */
    private String consultantCode;
    /**
     * HDSD00_14_02.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_14_02.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_14_02.APPY_ID
     */
    private String appyId;
    /**
     * HDSD00_14_02.APPLY_MEDICAL_CODE
     */
    private String applyMedicalCode;
    /**
     * HDSD00_14_02.APPLY_DEPT_CODE
     */
    private String applyDeptCode;
    /**
     * HDSD00_14_02.AGE
     */
    private String age;
    /**
     * HDSD00_14_02.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_14_02.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_14_02.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_14_02.ADMISSION_DATE
     */
    private String admissionDate;
    /**
     * HDSD00_14_02.GENDER
     */
    private String gender;
    /**
     * HDSD00_14_02.CONSULTATION_APPLY_DATE
     */
    private String consultationApplyDate;

    /**
     * HDSD00_14_02.upload_time
     *
     * @return the value of HDSD00_14_02.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_14_02.upload_time
     *
     * @param uploadTime the value for HDSD00_14_02.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_14_02.status
     *
     * @return the value of HDSD00_14_02.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_14_02.status
     *
     * @param status the value for HDSD00_14_02.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_14_02.pk
     *
     * @return the value of HDSD00_14_02.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_14_02.pk
     *
     * @param pk the value for HDSD00_14_02.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_14_02.empi
     *
     * @return the value of HDSD00_14_02.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_14_02.empi
     *
     * @param empi the value for HDSD00_14_02.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_14_02.ENCOUNTER_ID
     *
     * @return the value of HDSD00_14_02.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_14_02.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_14_02.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_14_02.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_14_02.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_14_02.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_14_02.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_14_02.WARD_NAME
     *
     * @return the value of HDSD00_14_02.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_14_02.WARD_NAME
     *
     * @param wardName the value for HDSD00_14_02.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_14_02.WARD_ID
     *
     * @return the value of HDSD00_14_02.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_14_02.WARD_ID
     *
     * @param wardId the value for HDSD00_14_02.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_14_02.WARDS_NAME
     *
     * @return the value of HDSD00_14_02.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_14_02.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_14_02.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_14_02.WARDS_ID
     *
     * @return the value of HDSD00_14_02.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_14_02.WARDS_ID
     *
     * @param wardsId the value for HDSD00_14_02.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_14_02.VERSION
     *
     * @return the value of HDSD00_14_02.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_14_02.VERSION
     *
     * @param version the value for HDSD00_14_02.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_14_02.TREATMENT_PROCESS
     *
     * @return the value of HDSD00_14_02.TREATMENT_PROCESS
     */
    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    /**
     * HDSD00_14_02.TREATMENT_PROCESS
     *
     * @param treatmentProcess the value for HDSD00_14_02.TREATMENT_PROCESS
     */
    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess;
    }

    /**
     * HDSD00_14_02.TREATMENT_PROCESS_DESC
     *
     * @return the value of HDSD00_14_02.TREATMENT_PROCESS_DESC
     */
    public String getTreatmentProcessDesc() {
        return treatmentProcessDesc;
    }

    /**
     * HDSD00_14_02.TREATMENT_PROCESS_DESC
     *
     * @param treatmentProcessDesc the value for HDSD00_14_02.TREATMENT_PROCESS_DESC
     */
    public void setTreatmentProcessDesc(String treatmentProcessDesc) {
        this.treatmentProcessDesc = treatmentProcessDesc;
    }

    /**
     * HDSD00_14_02.TCM_FOUR_DIAGNOSIS
     *
     * @return the value of HDSD00_14_02.TCM_FOUR_DIAGNOSIS
     */
    public String getTcmFourDiagnosis() {
        return tcmFourDiagnosis;
    }

    /**
     * HDSD00_14_02.TCM_FOUR_DIAGNOSIS
     *
     * @param tcmFourDiagnosis the value for HDSD00_14_02.TCM_FOUR_DIAGNOSIS
     */
    public void setTcmFourDiagnosis(String tcmFourDiagnosis) {
        this.tcmFourDiagnosis = tcmFourDiagnosis;
    }

    /**
     * HDSD00_14_02.REPORT_TITLE
     *
     * @return the value of HDSD00_14_02.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_14_02.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_14_02.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_14_02.RECORD_SUMMARY
     *
     * @return the value of HDSD00_14_02.RECORD_SUMMARY
     */
    public String getRecordSummary() {
        return recordSummary;
    }

    /**
     * HDSD00_14_02.RECORD_SUMMARY
     *
     * @param recordSummary the value for HDSD00_14_02.RECORD_SUMMARY
     */
    public void setRecordSummary(String recordSummary) {
        this.recordSummary = recordSummary;
    }

    /**
     * HDSD00_14_02.PRINCIPLE_AND_METHOD
     *
     * @return the value of HDSD00_14_02.PRINCIPLE_AND_METHOD
     */
    public String getPrincipleAndMethod() {
        return principleAndMethod;
    }

    /**
     * HDSD00_14_02.PRINCIPLE_AND_METHOD
     *
     * @param principleAndMethod the value for HDSD00_14_02.PRINCIPLE_AND_METHOD
     */
    public void setPrincipleAndMethod(String principleAndMethod) {
        this.principleAndMethod = principleAndMethod;
    }

    /**
     * HDSD00_14_02.PATIENT_NAME
     *
     * @return the value of HDSD00_14_02.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_14_02.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_14_02.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_14_02.PATIENT_TYPE
     *
     * @return the value of HDSD00_14_02.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_14_02.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_14_02.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_14_02.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_14_02.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_14_02.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_14_02.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_14_02.VISIT_TIMES
     *
     * @return the value of HDSD00_14_02.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_14_02.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_14_02.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_14_02.VISIT_ID
     *
     * @return the value of HDSD00_14_02.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_14_02.VISIT_ID
     *
     * @param visitId the value for HDSD00_14_02.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_14_02.VISIT_DOMAIN
     *
     * @return the value of HDSD00_14_02.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_14_02.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_14_02.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_14_02.PATIENT_ID
     *
     * @return the value of HDSD00_14_02.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_14_02.PATIENT_ID
     *
     * @param patientId the value for HDSD00_14_02.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_14_02.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_14_02.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_14_02.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_14_02.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_14_02.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_14_02.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_14_02.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_14_02.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_14_02.MEDICAL_INSTITUTION_NAME
     *
     * @return the value of HDSD00_14_02.MEDICAL_INSTITUTION_NAME
     */
    public String getMedicalInstitutionName() {
        return medicalInstitutionName;
    }

    /**
     * HDSD00_14_02.MEDICAL_INSTITUTION_NAME
     *
     * @param medicalInstitutionName the value for HDSD00_14_02.MEDICAL_INSTITUTION_NAME
     */
    public void setMedicalInstitutionName(String medicalInstitutionName) {
        this.medicalInstitutionName = medicalInstitutionName;
    }

    /**
     * HDSD00_14_02.MEDICAL_INSTITUTION
     *
     * @return the value of HDSD00_14_02.MEDICAL_INSTITUTION
     */
    public String getMedicalInstitution() {
        return medicalInstitution;
    }

    /**
     * HDSD00_14_02.MEDICAL_INSTITUTION
     *
     * @param medicalInstitution the value for HDSD00_14_02.MEDICAL_INSTITUTION
     */
    public void setMedicalInstitution(String medicalInstitution) {
        this.medicalInstitution = medicalInstitution;
    }

    /**
     * HDSD00_14_02.MEDICAL_CODE
     *
     * @return the value of HDSD00_14_02.MEDICAL_CODE
     */
    public String getMedicalCode() {
        return medicalCode;
    }

    /**
     * HDSD00_14_02.MEDICAL_CODE
     *
     * @param medicalCode the value for HDSD00_14_02.MEDICAL_CODE
     */
    public void setMedicalCode(String medicalCode) {
        this.medicalCode = medicalCode;
    }

    /**
     * HDSD00_14_02.LOAD_TYPE
     *
     * @return the value of HDSD00_14_02.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_14_02.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_14_02.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_14_02.ITEM_RESULT
     *
     * @return the value of HDSD00_14_02.ITEM_RESULT
     */
    public String getItemResult() {
        return itemResult;
    }

    /**
     * HDSD00_14_02.ITEM_RESULT
     *
     * @param itemResult the value for HDSD00_14_02.ITEM_RESULT
     */
    public void setItemResult(String itemResult) {
        this.itemResult = itemResult;
    }

    /**
     * HDSD00_14_02.HOSPITAL_NAME
     *
     * @return the value of HDSD00_14_02.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_14_02.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_14_02.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_14_02.HOSPITAL_CODE
     *
     * @return the value of HDSD00_14_02.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_14_02.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_14_02.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_14_02.INSTITUTION_APPLY
     *
     * @return the value of HDSD00_14_02.INSTITUTION_APPLY
     */
    public String getInstitutionApply() {
        return institutionApply;
    }

    /**
     * HDSD00_14_02.INSTITUTION_APPLY
     *
     * @param institutionApply the value for HDSD00_14_02.INSTITUTION_APPLY
     */
    public void setInstitutionApply(String institutionApply) {
        this.institutionApply = institutionApply;
    }

    /**
     * HDSD00_14_02.INPATIENT
     *
     * @return the value of HDSD00_14_02.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_14_02.INPATIENT
     *
     * @param inpatient the value for HDSD00_14_02.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_14_02.ID_NUM
     *
     * @return the value of HDSD00_14_02.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_14_02.ID_NUM
     *
     * @param idNum the value for HDSD00_14_02.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_14_02.GENDER_CODE
     *
     * @return the value of HDSD00_14_02.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_14_02.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_14_02.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_14_02.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_14_02.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_14_02.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_14_02.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_14_02.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_14_02.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_14_02.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_14_02.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_14_02.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_14_02.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_14_02.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_14_02.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_14_02.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_14_02.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_14_02.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_14_02.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_14_02.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_14_02.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_14_02.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_14_02.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_14_02.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_14_02.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_14_02.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_14_02.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_14_02.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_14_02.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_14_02.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_14_02.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_14_02.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_14_02.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_14_02.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_14_02.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_14_02.DOC_AUTHOR
     *
     * @return the value of HDSD00_14_02.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_14_02.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_14_02.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_14_02.DEPT_NAME
     *
     * @return the value of HDSD00_14_02.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_14_02.DEPT_NAME
     *
     * @param deptName the value for HDSD00_14_02.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_14_02.DEPT_CODE
     *
     * @return the value of HDSD00_14_02.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_14_02.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_14_02.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_14_02.CONSULTATION_DEPT_CODE
     *
     * @return the value of HDSD00_14_02.CONSULTATION_DEPT_CODE
     */
    public String getConsultationDeptCode() {
        return consultationDeptCode;
    }

    /**
     * HDSD00_14_02.CONSULTATION_DEPT_CODE
     *
     * @param consultationDeptCode the value for HDSD00_14_02.CONSULTATION_DEPT_CODE
     */
    public void setConsultationDeptCode(String consultationDeptCode) {
        this.consultationDeptCode = consultationDeptCode;
    }

    /**
     * HDSD00_14_02.DATEOF_BIRTH
     *
     * @return the value of HDSD00_14_02.DATEOF_BIRTH
     */
    public String getDateofBirth() {
        return dateofBirth;
    }

    /**
     * HDSD00_14_02.DATEOF_BIRTH
     *
     * @param dateofBirth the value for HDSD00_14_02.DATEOF_BIRTH
     */
    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /**
     * HDSD00_14_02.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_14_02.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_14_02.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_14_02.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_14_02.CONSULTATION_TYPE
     *
     * @return the value of HDSD00_14_02.CONSULTATION_TYPE
     */
    public String getConsultationType() {
        return consultationType;
    }

    /**
     * HDSD00_14_02.CONSULTATION_TYPE
     *
     * @param consultationType the value for HDSD00_14_02.CONSULTATION_TYPE
     */
    public void setConsultationType(String consultationType) {
        this.consultationType = consultationType;
    }

    /**
     * HDSD00_14_02.CONSULTATION_REASON
     *
     * @return the value of HDSD00_14_02.CONSULTATION_REASON
     */
    public String getConsultationReason() {
        return consultationReason;
    }

    /**
     * HDSD00_14_02.CONSULTATION_REASON
     *
     * @param consultationReason the value for HDSD00_14_02.CONSULTATION_REASON
     */
    public void setConsultationReason(String consultationReason) {
        this.consultationReason = consultationReason;
    }

    /**
     * HDSD00_14_02.CONSULTATION_PURPOSE
     *
     * @return the value of HDSD00_14_02.CONSULTATION_PURPOSE
     */
    public String getConsultationPurpose() {
        return consultationPurpose;
    }

    /**
     * HDSD00_14_02.CONSULTATION_PURPOSE
     *
     * @param consultationPurpose the value for HDSD00_14_02.CONSULTATION_PURPOSE
     */
    public void setConsultationPurpose(String consultationPurpose) {
        this.consultationPurpose = consultationPurpose;
    }

    /**
     * HDSD00_14_02.CONSULTATION_OPINION
     *
     * @return the value of HDSD00_14_02.CONSULTATION_OPINION
     */
    public String getConsultationOpinion() {
        return consultationOpinion;
    }

    /**
     * HDSD00_14_02.CONSULTATION_OPINION
     *
     * @param consultationOpinion the value for HDSD00_14_02.CONSULTATION_OPINION
     */
    public void setConsultationOpinion(String consultationOpinion) {
        this.consultationOpinion = consultationOpinion;
    }

    /**
     * HDSD00_14_02.CONSULTATION_DEPT
     *
     * @return the value of HDSD00_14_02.CONSULTATION_DEPT
     */
    public String getConsultationDept() {
        return consultationDept;
    }

    /**
     * HDSD00_14_02.CONSULTATION_DEPT
     *
     * @param consultationDept the value for HDSD00_14_02.CONSULTATION_DEPT
     */
    public void setConsultationDept(String consultationDept) {
        this.consultationDept = consultationDept;
    }

    /**
     * HDSD00_14_02.CONSULTATION_DATE
     *
     * @return the value of HDSD00_14_02.CONSULTATION_DATE
     */
    public String getConsultationDate() {
        return consultationDate;
    }

    /**
     * HDSD00_14_02.CONSULTATION_DATE
     *
     * @param consultationDate the value for HDSD00_14_02.CONSULTATION_DATE
     */
    public void setConsultationDate(String consultationDate) {
        this.consultationDate = consultationDate;
    }

    /**
     * HDSD00_14_02.CONSULTATION_APPLY_DEPT
     *
     * @return the value of HDSD00_14_02.CONSULTATION_APPLY_DEPT
     */
    public String getConsultationApplyDept() {
        return consultationApplyDept;
    }

    /**
     * HDSD00_14_02.CONSULTATION_APPLY_DEPT
     *
     * @param consultationApplyDept the value for HDSD00_14_02.CONSULTATION_APPLY_DEPT
     */
    public void setConsultationApplyDept(String consultationApplyDept) {
        this.consultationApplyDept = consultationApplyDept;
    }

    /**
     * HDSD00_14_02.CONSULTATION_APPLYCODE
     *
     * @return the value of HDSD00_14_02.CONSULTATION_APPLYCODE
     */
    public String getConsultationApplycode() {
        return consultationApplycode;
    }

    /**
     * HDSD00_14_02.CONSULTATION_APPLYCODE
     *
     * @param consultationApplycode the value for HDSD00_14_02.CONSULTATION_APPLYCODE
     */
    public void setConsultationApplycode(String consultationApplycode) {
        this.consultationApplycode = consultationApplycode;
    }

    /**
     * HDSD00_14_02.CONSULTATION_APPLY
     *
     * @return the value of HDSD00_14_02.CONSULTATION_APPLY
     */
    public String getConsultationApply() {
        return consultationApply;
    }

    /**
     * HDSD00_14_02.CONSULTATION_APPLY
     *
     * @param consultationApply the value for HDSD00_14_02.CONSULTATION_APPLY
     */
    public void setConsultationApply(String consultationApply) {
        this.consultationApply = consultationApply;
    }

    /**
     * HDSD00_14_02.CONSULTANT_NAME
     *
     * @return the value of HDSD00_14_02.CONSULTANT_NAME
     */
    public String getConsultantName() {
        return consultantName;
    }

    /**
     * HDSD00_14_02.CONSULTANT_NAME
     *
     * @param consultantName the value for HDSD00_14_02.CONSULTANT_NAME
     */
    public void setConsultantName(String consultantName) {
        this.consultantName = consultantName;
    }

    /**
     * HDSD00_14_02.CONSULTANT_CODE
     *
     * @return the value of HDSD00_14_02.CONSULTANT_CODE
     */
    public String getConsultantCode() {
        return consultantCode;
    }

    /**
     * HDSD00_14_02.CONSULTANT_CODE
     *
     * @param consultantCode the value for HDSD00_14_02.CONSULTANT_CODE
     */
    public void setConsultantCode(String consultantCode) {
        this.consultantCode = consultantCode;
    }

    /**
     * HDSD00_14_02.BED_NO
     *
     * @return the value of HDSD00_14_02.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_14_02.BED_NO
     *
     * @param bedNo the value for HDSD00_14_02.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_14_02.BED_NAME
     *
     * @return the value of HDSD00_14_02.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_14_02.BED_NAME
     *
     * @param bedName the value for HDSD00_14_02.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_14_02.APPY_ID
     *
     * @return the value of HDSD00_14_02.APPY_ID
     */
    public String getAppyId() {
        return appyId;
    }

    /**
     * HDSD00_14_02.APPY_ID
     *
     * @param appyId the value for HDSD00_14_02.APPY_ID
     */
    public void setAppyId(String appyId) {
        this.appyId = appyId;
    }

    /**
     * HDSD00_14_02.APPLY_MEDICAL_CODE
     *
     * @return the value of HDSD00_14_02.APPLY_MEDICAL_CODE
     */
    public String getApplyMedicalCode() {
        return applyMedicalCode;
    }

    /**
     * HDSD00_14_02.APPLY_MEDICAL_CODE
     *
     * @param applyMedicalCode the value for HDSD00_14_02.APPLY_MEDICAL_CODE
     */
    public void setApplyMedicalCode(String applyMedicalCode) {
        this.applyMedicalCode = applyMedicalCode;
    }

    /**
     * HDSD00_14_02.APPLY_DEPT_CODE
     *
     * @return the value of HDSD00_14_02.APPLY_DEPT_CODE
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
     * HDSD00_14_02.APPLY_DEPT_CODE
     *
     * @param applyDeptCode the value for HDSD00_14_02.APPLY_DEPT_CODE
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    /**
     * HDSD00_14_02.AGE
     *
     * @return the value of HDSD00_14_02.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_14_02.AGE
     *
     * @param age the value for HDSD00_14_02.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_14_02.AGE_UNIT
     *
     * @return the value of HDSD00_14_02.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_14_02.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_14_02.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_14_02.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_14_02.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_14_02.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_14_02.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_14_02.VISIT_DATE
     *
     * @return the value of HDSD00_14_02.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_14_02.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_14_02.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_14_02.ADMISSION_DATE
     *
     * @return the value of HDSD00_14_02.ADMISSION_DATE
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * HDSD00_14_02.ADMISSION_DATE
     *
     * @param admissionDate the value for HDSD00_14_02.ADMISSION_DATE
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    /**
     * HDSD00_14_02.GENDER
     *
     * @return the value of HDSD00_14_02.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_14_02.GENDER
     *
     * @param gender the value for HDSD00_14_02.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_14_02.CONSULTATION_APPLY_DATE
     *
     * @return the value of HDSD00_14_02.CONSULTATION_APPLY_DATE
     */
    public String getConsultationApplyDate() {
        return consultationApplyDate;
    }

    /**
     * HDSD00_14_02.CONSULTATION_APPLY_DATE
     *
     * @param consultationApplyDate the value for HDSD00_14_02.CONSULTATION_APPLY_DATE
     */
    public void setConsultationApplyDate(String consultationApplyDate) {
        this.consultationApplyDate = consultationApplyDate;
    }
}