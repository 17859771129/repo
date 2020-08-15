package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_06_02")
public class Hdsd000602 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_06_02
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_06_02.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_06_02.status
     */
    private String status;
    /**
     * HDSD00_06_02.pk
     */
    private Integer pk;
    /**
     * HDSD00_06_02.empi
     */
    private String empi;
    /**
     * HDSD00_06_02.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_06_02.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_06_02.WEIGHT
     */
    private String weight;
    /**
     * HDSD00_06_02.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_06_02.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_06_02.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_06_02.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_06_02.VERSION
     */
    private String version;
    /**
     * HDSD00_06_02.RHD_CODE
     */
    private String rhdCode;
    /**
     * HDSD00_06_02.RHD
     */
    private String rhd;
    /**
     * HDSD00_06_02.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_06_02.REMOVAL_TRACHEAL_MARK
     */
    private String removalTrachealMark;
    /**
     * HDSD00_06_02.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_06_02.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_06_02.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_06_02.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_06_02.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_06_02.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_06_02.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_06_02.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_06_02.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_06_02.NEONATAL_WEIGHT
     */
    private String neonatalWeight;
    /**
     * HDSD00_06_02.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_06_02.INSTITUTIONAL_INCODE
     */
    private String institutionalIncode;
    /**
     * HDSD00_06_02.INSTITUTIONAL_IN
     */
    private String institutionalIn;
    /**
     * HDSD00_06_02.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_06_02.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_06_02.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_06_02.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_06_02.GENERAL_EXAM
     */
    private String generalExam;
    /**
     * HDSD00_06_02.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_06_02.GENDER
     */
    private String gender;
    /**
     * HDSD00_06_02.EXCEPTIONAL_CASE
     */
    private String exceptionalCase;
    /**
     * HDSD00_06_02.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_06_02.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_06_02.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_06_02.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_06_02.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_06_02.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_06_02.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_06_02.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_06_02.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_06_02.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_06_02.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_06_02.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_06_02.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_06_02.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_06_02.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_06_02.AWAKENING_DATE
     */
    private String awakeningDate;
    /**
     * HDSD00_06_02.APPY_ID
     */
    private String appyId;
    /**
     * HDSD00_06_02.ANESTH_SIGNDATE
     */
    private String anesthSigndate;
    /**
     * HDSD00_06_02.ANESTH_NAME
     */
    private String anesthName;
    /**
     * HDSD00_06_02.ANESTH_CODE
     */
    private String anesthCode;
    /**
     * HDSD00_06_02.ANESTHESIA_RECOVERY
     */
    private String anesthesiaRecovery;
    /**
     * HDSD00_06_02.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_06_02.AGE
     */
    private String age;
    /**
     * HDSD00_06_02.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_06_02.APPROPRIATE_ANES
     */
    private String appropriateAnes;
    /**
     * HDSD00_06_02.ANES_METHOD_CODE
     */
    private String anesMethodCode;
    /**
     * HDSD00_06_02.OPER_NAME
     */
    private String operName;
    /**
     * HDSD00_06_02.OPER_CODE
     */
    private String operCode;
    /**
     * HDSD00_06_02.ADMISSION_DATE
     */
    private String admissionDate;
    /**
     * HDSD00_06_02.ABO_CODE
     */
    private String aboCode;
    /**
     * HDSD00_06_02.ABO
     */
    private String abo;
    /**
     * HDSD00_06_02.ANES_METHOD_NAME
     */
    private String anesMethodName;

    /**
     * HDSD00_06_02.upload_time
     *
     * @return the value of HDSD00_06_02.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_06_02.upload_time
     *
     * @param uploadTime the value for HDSD00_06_02.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_06_02.status
     *
     * @return the value of HDSD00_06_02.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_06_02.status
     *
     * @param status the value for HDSD00_06_02.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_06_02.pk
     *
     * @return the value of HDSD00_06_02.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_06_02.pk
     *
     * @param pk the value for HDSD00_06_02.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_06_02.empi
     *
     * @return the value of HDSD00_06_02.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_06_02.empi
     *
     * @param empi the value for HDSD00_06_02.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_06_02.ENCOUNTER_ID
     *
     * @return the value of HDSD00_06_02.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_06_02.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_06_02.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_06_02.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_06_02.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_06_02.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_06_02.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_06_02.WEIGHT
     *
     * @return the value of HDSD00_06_02.WEIGHT
     */
    public String getWeight() {
        return weight;
    }

    /**
     * HDSD00_06_02.WEIGHT
     *
     * @param weight the value for HDSD00_06_02.WEIGHT
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * HDSD00_06_02.WARD_NAME
     *
     * @return the value of HDSD00_06_02.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_06_02.WARD_NAME
     *
     * @param wardName the value for HDSD00_06_02.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_06_02.WARD_ID
     *
     * @return the value of HDSD00_06_02.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_06_02.WARD_ID
     *
     * @param wardId the value for HDSD00_06_02.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_06_02.WARDS_NAME
     *
     * @return the value of HDSD00_06_02.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_06_02.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_06_02.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_06_02.WARDS_ID
     *
     * @return the value of HDSD00_06_02.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_06_02.WARDS_ID
     *
     * @param wardsId the value for HDSD00_06_02.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_06_02.VERSION
     *
     * @return the value of HDSD00_06_02.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_06_02.VERSION
     *
     * @param version the value for HDSD00_06_02.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_06_02.RHD_CODE
     *
     * @return the value of HDSD00_06_02.RHD_CODE
     */
    public String getRhdCode() {
        return rhdCode;
    }

    /**
     * HDSD00_06_02.RHD_CODE
     *
     * @param rhdCode the value for HDSD00_06_02.RHD_CODE
     */
    public void setRhdCode(String rhdCode) {
        this.rhdCode = rhdCode;
    }

    /**
     * HDSD00_06_02.RHD
     *
     * @return the value of HDSD00_06_02.RHD
     */
    public String getRhd() {
        return rhd;
    }

    /**
     * HDSD00_06_02.RHD
     *
     * @param rhd the value for HDSD00_06_02.RHD
     */
    public void setRhd(String rhd) {
        this.rhd = rhd;
    }

    /**
     * HDSD00_06_02.REPORT_TITLE
     *
     * @return the value of HDSD00_06_02.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_06_02.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_06_02.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_06_02.REMOVAL_TRACHEAL_MARK
     *
     * @return the value of HDSD00_06_02.REMOVAL_TRACHEAL_MARK
     */
    public String getRemovalTrachealMark() {
        return removalTrachealMark;
    }

    /**
     * HDSD00_06_02.REMOVAL_TRACHEAL_MARK
     *
     * @param removalTrachealMark the value for HDSD00_06_02.REMOVAL_TRACHEAL_MARK
     */
    public void setRemovalTrachealMark(String removalTrachealMark) {
        this.removalTrachealMark = removalTrachealMark;
    }

    /**
     * HDSD00_06_02.PATIENT_NAME
     *
     * @return the value of HDSD00_06_02.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_06_02.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_06_02.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_06_02.PATIENT_TYPE
     *
     * @return the value of HDSD00_06_02.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_06_02.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_06_02.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_06_02.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_06_02.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_06_02.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_06_02.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_06_02.VISIT_TIMES
     *
     * @return the value of HDSD00_06_02.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_06_02.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_06_02.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_06_02.VISIT_ID
     *
     * @return the value of HDSD00_06_02.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_06_02.VISIT_ID
     *
     * @param visitId the value for HDSD00_06_02.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_06_02.VISIT_DOMAIN
     *
     * @return the value of HDSD00_06_02.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_06_02.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_06_02.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_06_02.PATIENT_ID
     *
     * @return the value of HDSD00_06_02.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_06_02.PATIENT_ID
     *
     * @param patientId the value for HDSD00_06_02.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_06_02.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_06_02.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_06_02.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_06_02.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_06_02.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_06_02.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_06_02.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_06_02.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_06_02.NEONATAL_WEIGHT
     *
     * @return the value of HDSD00_06_02.NEONATAL_WEIGHT
     */
    public String getNeonatalWeight() {
        return neonatalWeight;
    }

    /**
     * HDSD00_06_02.NEONATAL_WEIGHT
     *
     * @param neonatalWeight the value for HDSD00_06_02.NEONATAL_WEIGHT
     */
    public void setNeonatalWeight(String neonatalWeight) {
        this.neonatalWeight = neonatalWeight;
    }

    /**
     * HDSD00_06_02.LOAD_TYPE
     *
     * @return the value of HDSD00_06_02.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_06_02.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_06_02.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_06_02.INSTITUTIONAL_INCODE
     *
     * @return the value of HDSD00_06_02.INSTITUTIONAL_INCODE
     */
    public String getInstitutionalIncode() {
        return institutionalIncode;
    }

    /**
     * HDSD00_06_02.INSTITUTIONAL_INCODE
     *
     * @param institutionalIncode the value for HDSD00_06_02.INSTITUTIONAL_INCODE
     */
    public void setInstitutionalIncode(String institutionalIncode) {
        this.institutionalIncode = institutionalIncode;
    }

    /**
     * HDSD00_06_02.INSTITUTIONAL_IN
     *
     * @return the value of HDSD00_06_02.INSTITUTIONAL_IN
     */
    public String getInstitutionalIn() {
        return institutionalIn;
    }

    /**
     * HDSD00_06_02.INSTITUTIONAL_IN
     *
     * @param institutionalIn the value for HDSD00_06_02.INSTITUTIONAL_IN
     */
    public void setInstitutionalIn(String institutionalIn) {
        this.institutionalIn = institutionalIn;
    }

    /**
     * HDSD00_06_02.INPATIENT
     *
     * @return the value of HDSD00_06_02.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_06_02.INPATIENT
     *
     * @param inpatient the value for HDSD00_06_02.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_06_02.ID_NUM
     *
     * @return the value of HDSD00_06_02.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_06_02.ID_NUM
     *
     * @param idNum the value for HDSD00_06_02.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_06_02.HOSPITAL_NAME
     *
     * @return the value of HDSD00_06_02.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_06_02.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_06_02.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_06_02.HOSPITAL_CODE
     *
     * @return the value of HDSD00_06_02.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_06_02.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_06_02.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_06_02.GENERAL_EXAM
     *
     * @return the value of HDSD00_06_02.GENERAL_EXAM
     */
    public String getGeneralExam() {
        return generalExam;
    }

    /**
     * HDSD00_06_02.GENERAL_EXAM
     *
     * @param generalExam the value for HDSD00_06_02.GENERAL_EXAM
     */
    public void setGeneralExam(String generalExam) {
        this.generalExam = generalExam;
    }

    /**
     * HDSD00_06_02.GENDER_CODE
     *
     * @return the value of HDSD00_06_02.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_06_02.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_06_02.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_06_02.GENDER
     *
     * @return the value of HDSD00_06_02.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_06_02.GENDER
     *
     * @param gender the value for HDSD00_06_02.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_06_02.EXCEPTIONAL_CASE
     *
     * @return the value of HDSD00_06_02.EXCEPTIONAL_CASE
     */
    public String getExceptionalCase() {
        return exceptionalCase;
    }

    /**
     * HDSD00_06_02.EXCEPTIONAL_CASE
     *
     * @param exceptionalCase the value for HDSD00_06_02.EXCEPTIONAL_CASE
     */
    public void setExceptionalCase(String exceptionalCase) {
        this.exceptionalCase = exceptionalCase;
    }

    /**
     * HDSD00_06_02.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_06_02.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_06_02.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_06_02.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_06_02.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_06_02.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_06_02.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_06_02.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_06_02.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_06_02.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_06_02.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_06_02.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_06_02.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_06_02.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_06_02.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_06_02.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_06_02.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_06_02.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_06_02.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_06_02.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_06_02.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_06_02.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_06_02.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_06_02.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_06_02.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_06_02.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_06_02.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_06_02.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_06_02.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_06_02.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_06_02.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_06_02.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_06_02.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_06_02.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_06_02.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_06_02.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_06_02.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_06_02.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_06_02.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_06_02.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_06_02.DOC_AUTHOR
     *
     * @return the value of HDSD00_06_02.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_06_02.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_06_02.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_06_02.DEPT_NAME
     *
     * @return the value of HDSD00_06_02.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_06_02.DEPT_NAME
     *
     * @param deptName the value for HDSD00_06_02.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_06_02.DEPT_CODE
     *
     * @return the value of HDSD00_06_02.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_06_02.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_06_02.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_06_02.BED_NO
     *
     * @return the value of HDSD00_06_02.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_06_02.BED_NO
     *
     * @param bedNo the value for HDSD00_06_02.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_06_02.BED_NAME
     *
     * @return the value of HDSD00_06_02.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_06_02.BED_NAME
     *
     * @param bedName the value for HDSD00_06_02.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_06_02.AWAKENING_DATE
     *
     * @return the value of HDSD00_06_02.AWAKENING_DATE
     */
    public String getAwakeningDate() {
        return awakeningDate;
    }

    /**
     * HDSD00_06_02.AWAKENING_DATE
     *
     * @param awakeningDate the value for HDSD00_06_02.AWAKENING_DATE
     */
    public void setAwakeningDate(String awakeningDate) {
        this.awakeningDate = awakeningDate;
    }

    /**
     * HDSD00_06_02.APPY_ID
     *
     * @return the value of HDSD00_06_02.APPY_ID
     */
    public String getAppyId() {
        return appyId;
    }

    /**
     * HDSD00_06_02.APPY_ID
     *
     * @param appyId the value for HDSD00_06_02.APPY_ID
     */
    public void setAppyId(String appyId) {
        this.appyId = appyId;
    }

    /**
     * HDSD00_06_02.ANESTH_SIGNDATE
     *
     * @return the value of HDSD00_06_02.ANESTH_SIGNDATE
     */
    public String getAnesthSigndate() {
        return anesthSigndate;
    }

    /**
     * HDSD00_06_02.ANESTH_SIGNDATE
     *
     * @param anesthSigndate the value for HDSD00_06_02.ANESTH_SIGNDATE
     */
    public void setAnesthSigndate(String anesthSigndate) {
        this.anesthSigndate = anesthSigndate;
    }

    /**
     * HDSD00_06_02.ANESTH_NAME
     *
     * @return the value of HDSD00_06_02.ANESTH_NAME
     */
    public String getAnesthName() {
        return anesthName;
    }

    /**
     * HDSD00_06_02.ANESTH_NAME
     *
     * @param anesthName the value for HDSD00_06_02.ANESTH_NAME
     */
    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName;
    }

    /**
     * HDSD00_06_02.ANESTH_CODE
     *
     * @return the value of HDSD00_06_02.ANESTH_CODE
     */
    public String getAnesthCode() {
        return anesthCode;
    }

    /**
     * HDSD00_06_02.ANESTH_CODE
     *
     * @param anesthCode the value for HDSD00_06_02.ANESTH_CODE
     */
    public void setAnesthCode(String anesthCode) {
        this.anesthCode = anesthCode;
    }

    /**
     * HDSD00_06_02.ANESTHESIA_RECOVERY
     *
     * @return the value of HDSD00_06_02.ANESTHESIA_RECOVERY
     */
    public String getAnesthesiaRecovery() {
        return anesthesiaRecovery;
    }

    /**
     * HDSD00_06_02.ANESTHESIA_RECOVERY
     *
     * @param anesthesiaRecovery the value for HDSD00_06_02.ANESTHESIA_RECOVERY
     */
    public void setAnesthesiaRecovery(String anesthesiaRecovery) {
        this.anesthesiaRecovery = anesthesiaRecovery;
    }

    /**
     * HDSD00_06_02.AGE_UNIT
     *
     * @return the value of HDSD00_06_02.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_06_02.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_06_02.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_06_02.AGE
     *
     * @return the value of HDSD00_06_02.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_06_02.AGE
     *
     * @param age the value for HDSD00_06_02.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_06_02.VISIT_DATE
     *
     * @return the value of HDSD00_06_02.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_06_02.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_06_02.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_06_02.APPROPRIATE_ANES
     *
     * @return the value of HDSD00_06_02.APPROPRIATE_ANES
     */
    public String getAppropriateAnes() {
        return appropriateAnes;
    }

    /**
     * HDSD00_06_02.APPROPRIATE_ANES
     *
     * @param appropriateAnes the value for HDSD00_06_02.APPROPRIATE_ANES
     */
    public void setAppropriateAnes(String appropriateAnes) {
        this.appropriateAnes = appropriateAnes;
    }

    /**
     * HDSD00_06_02.ANES_METHOD_CODE
     *
     * @return the value of HDSD00_06_02.ANES_METHOD_CODE
     */
    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    /**
     * HDSD00_06_02.ANES_METHOD_CODE
     *
     * @param anesMethodCode the value for HDSD00_06_02.ANES_METHOD_CODE
     */
    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode;
    }

    /**
     * HDSD00_06_02.OPER_NAME
     *
     * @return the value of HDSD00_06_02.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * HDSD00_06_02.OPER_NAME
     *
     * @param operName the value for HDSD00_06_02.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }

    /**
     * HDSD00_06_02.OPER_CODE
     *
     * @return the value of HDSD00_06_02.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * HDSD00_06_02.OPER_CODE
     *
     * @param operCode the value for HDSD00_06_02.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * HDSD00_06_02.ADMISSION_DATE
     *
     * @return the value of HDSD00_06_02.ADMISSION_DATE
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * HDSD00_06_02.ADMISSION_DATE
     *
     * @param admissionDate the value for HDSD00_06_02.ADMISSION_DATE
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    /**
     * HDSD00_06_02.ABO_CODE
     *
     * @return the value of HDSD00_06_02.ABO_CODE
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * HDSD00_06_02.ABO_CODE
     *
     * @param aboCode the value for HDSD00_06_02.ABO_CODE
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode;
    }

    /**
     * HDSD00_06_02.ABO
     *
     * @return the value of HDSD00_06_02.ABO
     */
    public String getAbo() {
        return abo;
    }

    /**
     * HDSD00_06_02.ABO
     *
     * @param abo the value for HDSD00_06_02.ABO
     */
    public void setAbo(String abo) {
        this.abo = abo;
    }

    /**
     * HDSD00_06_02.ANES_METHOD_NAME
     *
     * @return the value of HDSD00_06_02.ANES_METHOD_NAME
     */
    public String getAnesMethodName() {
        return anesMethodName;
    }

    /**
     * HDSD00_06_02.ANES_METHOD_NAME
     *
     * @param anesMethodName the value for HDSD00_06_02.ANES_METHOD_NAME
     */
    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName;
    }
}