package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_09_03")
public class Hdsd000903 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_09_03
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_09_03.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_09_03.status
     */
    private String status;
    /**
     * HDSD00_09_03.pk
     */
    private Integer pk;
    /**
     * HDSD00_09_03.empi
     */
    private String empi;
    /**
     * HDSD00_09_03.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_09_03.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_09_03.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_09_03.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_09_03.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_09_03.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_09_03.VISITING_NAME
     */
    private String visitingName;
    /**
     * HDSD00_09_03.VISITING_CODE
     */
    private String visitingCode;
    /**
     * HDSD00_09_03.VERSION
     */
    private String version;
    /**
     * HDSD00_09_03.TRACHEAL_NURSINGCODE
     */
    private String trachealNursingcode;
    /**
     * HDSD00_09_03.TRACHEAL_NURSING
     */
    private String trachealNursing;
    /**
     * HDSD00_09_03.SKIN_CARE
     */
    private String skinCare;
    /**
     * HDSD00_09_03.SAFETY_NURSINGCODE
     */
    private String safetyNursingcode;
    /**
     * HDSD00_09_03.SAFETY_NURSING
     */
    private String safetyNursing;
    /**
     * HDSD00_09_03.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_09_03.POSTURE_NURSING
     */
    private String postureNursing;
    /**
     * HDSD00_09_03.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_09_03.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_09_03.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_09_03.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_09_03.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_09_03.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_09_03.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_09_03.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_09_03.NURSING_TYPECODE
     */
    private String nursingTypecode;
    /**
     * HDSD00_09_03.NURSING_TYPE
     */
    private String nursingType;
    /**
     * HDSD00_09_03.NURSING_PROBLEM
     */
    private String nursingProblem;
    /**
     * HDSD00_09_03.NURSING_GRADECODE
     */
    private String nursingGradecode;
    /**
     * HDSD00_09_03.NURSING_GRADE
     */
    private String nursingGrade;
    /**
     * HDSD00_09_03.NURSE_OUTCOME
     */
    private String nurseOutcome;
    /**
     * HDSD00_09_03.NURSER_NAME
     */
    private String nurserName;
    /**
     * HDSD00_09_03.NURSE_CATEGORY_ITEM
     */
    private String nurseCategoryItem;
    /**
     * HDSD00_09_03.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_09_03.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_09_03.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_09_03.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_09_03.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_09_03.HEALTH_CARD
     */
    private String healthCard;
    /**
     * HDSD00_09_03.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_09_03.GENDER
     */
    private String gender;
    /**
     * HDSD00_09_03.FILL_DATE
     */
    private String fillDate;
    /**
     * HDSD00_09_03.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_09_03.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_09_03.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_09_03.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_09_03.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_09_03.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_09_03.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_09_03.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_09_03.DOC_AUDIT_DATE
     */
    private String docAuditDate;
    /**
     * HDSD00_09_03.DOC_AUDITORCODE
     */
    private String docAuditorcode;
    /**
     * HDSD00_09_03.DOC_AUDITOR
     */
    private String docAuditor;
    /**
     * HDSD00_09_03.DIETARY_GUIDANCECODE
     */
    private String dietaryGuidancecode;
    /**
     * HDSD00_09_03.DIETARY_GUIDANCE
     */
    private String dietaryGuidance;
    /**
     * HDSD00_09_03.DIAG_NAME
     */
    private String diagName;
    /**
     * HDSD00_09_03.DIAG_CODE
     */
    private String diagCode;
    /**
     * HDSD00_09_03.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_09_03.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_09_03.CATHETER_DESCRIPTION
     */
    private String catheterDescription;
    /**
     * HDSD00_09_03.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_09_03.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_09_03.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_09_03.AGE
     */
    private String age;
    /**
     * HDSD00_09_03.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_09_03.VISIT_DATE
     */
    private String visitDate;

    /**
     * HDSD00_09_03.upload_time
     *
     * @return the value of HDSD00_09_03.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_09_03.upload_time
     *
     * @param uploadTime the value for HDSD00_09_03.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_09_03.status
     *
     * @return the value of HDSD00_09_03.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_09_03.status
     *
     * @param status the value for HDSD00_09_03.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_09_03.pk
     *
     * @return the value of HDSD00_09_03.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_09_03.pk
     *
     * @param pk the value for HDSD00_09_03.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_09_03.empi
     *
     * @return the value of HDSD00_09_03.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_09_03.empi
     *
     * @param empi the value for HDSD00_09_03.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_09_03.ENCOUNTER_ID
     *
     * @return the value of HDSD00_09_03.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_09_03.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_09_03.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_09_03.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_09_03.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_09_03.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_09_03.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_09_03.WARD_NAME
     *
     * @return the value of HDSD00_09_03.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_09_03.WARD_NAME
     *
     * @param wardName the value for HDSD00_09_03.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_09_03.WARD_ID
     *
     * @return the value of HDSD00_09_03.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_09_03.WARD_ID
     *
     * @param wardId the value for HDSD00_09_03.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_09_03.WARDS_NAME
     *
     * @return the value of HDSD00_09_03.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_09_03.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_09_03.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_09_03.WARDS_ID
     *
     * @return the value of HDSD00_09_03.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_09_03.WARDS_ID
     *
     * @param wardsId the value for HDSD00_09_03.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_09_03.VISITING_NAME
     *
     * @return the value of HDSD00_09_03.VISITING_NAME
     */
    public String getVisitingName() {
        return visitingName;
    }

    /**
     * HDSD00_09_03.VISITING_NAME
     *
     * @param visitingName the value for HDSD00_09_03.VISITING_NAME
     */
    public void setVisitingName(String visitingName) {
        this.visitingName = visitingName;
    }

    /**
     * HDSD00_09_03.VISITING_CODE
     *
     * @return the value of HDSD00_09_03.VISITING_CODE
     */
    public String getVisitingCode() {
        return visitingCode;
    }

    /**
     * HDSD00_09_03.VISITING_CODE
     *
     * @param visitingCode the value for HDSD00_09_03.VISITING_CODE
     */
    public void setVisitingCode(String visitingCode) {
        this.visitingCode = visitingCode;
    }

    /**
     * HDSD00_09_03.VERSION
     *
     * @return the value of HDSD00_09_03.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_09_03.VERSION
     *
     * @param version the value for HDSD00_09_03.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_09_03.TRACHEAL_NURSINGCODE
     *
     * @return the value of HDSD00_09_03.TRACHEAL_NURSINGCODE
     */
    public String getTrachealNursingcode() {
        return trachealNursingcode;
    }

    /**
     * HDSD00_09_03.TRACHEAL_NURSINGCODE
     *
     * @param trachealNursingcode the value for HDSD00_09_03.TRACHEAL_NURSINGCODE
     */
    public void setTrachealNursingcode(String trachealNursingcode) {
        this.trachealNursingcode = trachealNursingcode;
    }

    /**
     * HDSD00_09_03.TRACHEAL_NURSING
     *
     * @return the value of HDSD00_09_03.TRACHEAL_NURSING
     */
    public String getTrachealNursing() {
        return trachealNursing;
    }

    /**
     * HDSD00_09_03.TRACHEAL_NURSING
     *
     * @param trachealNursing the value for HDSD00_09_03.TRACHEAL_NURSING
     */
    public void setTrachealNursing(String trachealNursing) {
        this.trachealNursing = trachealNursing;
    }

    /**
     * HDSD00_09_03.SKIN_CARE
     *
     * @return the value of HDSD00_09_03.SKIN_CARE
     */
    public String getSkinCare() {
        return skinCare;
    }

    /**
     * HDSD00_09_03.SKIN_CARE
     *
     * @param skinCare the value for HDSD00_09_03.SKIN_CARE
     */
    public void setSkinCare(String skinCare) {
        this.skinCare = skinCare;
    }

    /**
     * HDSD00_09_03.SAFETY_NURSINGCODE
     *
     * @return the value of HDSD00_09_03.SAFETY_NURSINGCODE
     */
    public String getSafetyNursingcode() {
        return safetyNursingcode;
    }

    /**
     * HDSD00_09_03.SAFETY_NURSINGCODE
     *
     * @param safetyNursingcode the value for HDSD00_09_03.SAFETY_NURSINGCODE
     */
    public void setSafetyNursingcode(String safetyNursingcode) {
        this.safetyNursingcode = safetyNursingcode;
    }

    /**
     * HDSD00_09_03.SAFETY_NURSING
     *
     * @return the value of HDSD00_09_03.SAFETY_NURSING
     */
    public String getSafetyNursing() {
        return safetyNursing;
    }

    /**
     * HDSD00_09_03.SAFETY_NURSING
     *
     * @param safetyNursing the value for HDSD00_09_03.SAFETY_NURSING
     */
    public void setSafetyNursing(String safetyNursing) {
        this.safetyNursing = safetyNursing;
    }

    /**
     * HDSD00_09_03.REPORT_TITLE
     *
     * @return the value of HDSD00_09_03.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_09_03.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_09_03.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_09_03.POSTURE_NURSING
     *
     * @return the value of HDSD00_09_03.POSTURE_NURSING
     */
    public String getPostureNursing() {
        return postureNursing;
    }

    /**
     * HDSD00_09_03.POSTURE_NURSING
     *
     * @param postureNursing the value for HDSD00_09_03.POSTURE_NURSING
     */
    public void setPostureNursing(String postureNursing) {
        this.postureNursing = postureNursing;
    }

    /**
     * HDSD00_09_03.PATIENT_NAME
     *
     * @return the value of HDSD00_09_03.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_09_03.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_09_03.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_09_03.PATIENT_TYPE
     *
     * @return the value of HDSD00_09_03.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_09_03.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_09_03.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_09_03.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_09_03.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_09_03.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_09_03.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_09_03.VISIT_TIMES
     *
     * @return the value of HDSD00_09_03.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_09_03.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_09_03.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_09_03.VISIT_ID
     *
     * @return the value of HDSD00_09_03.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_09_03.VISIT_ID
     *
     * @param visitId the value for HDSD00_09_03.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_09_03.VISIT_DOMAIN
     *
     * @return the value of HDSD00_09_03.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_09_03.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_09_03.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_09_03.PATIENT_ID
     *
     * @return the value of HDSD00_09_03.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_09_03.PATIENT_ID
     *
     * @param patientId the value for HDSD00_09_03.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_09_03.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_09_03.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_09_03.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_09_03.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_09_03.NURSING_TYPECODE
     *
     * @return the value of HDSD00_09_03.NURSING_TYPECODE
     */
    public String getNursingTypecode() {
        return nursingTypecode;
    }

    /**
     * HDSD00_09_03.NURSING_TYPECODE
     *
     * @param nursingTypecode the value for HDSD00_09_03.NURSING_TYPECODE
     */
    public void setNursingTypecode(String nursingTypecode) {
        this.nursingTypecode = nursingTypecode;
    }

    /**
     * HDSD00_09_03.NURSING_TYPE
     *
     * @return the value of HDSD00_09_03.NURSING_TYPE
     */
    public String getNursingType() {
        return nursingType;
    }

    /**
     * HDSD00_09_03.NURSING_TYPE
     *
     * @param nursingType the value for HDSD00_09_03.NURSING_TYPE
     */
    public void setNursingType(String nursingType) {
        this.nursingType = nursingType;
    }

    /**
     * HDSD00_09_03.NURSING_PROBLEM
     *
     * @return the value of HDSD00_09_03.NURSING_PROBLEM
     */
    public String getNursingProblem() {
        return nursingProblem;
    }

    /**
     * HDSD00_09_03.NURSING_PROBLEM
     *
     * @param nursingProblem the value for HDSD00_09_03.NURSING_PROBLEM
     */
    public void setNursingProblem(String nursingProblem) {
        this.nursingProblem = nursingProblem;
    }

    /**
     * HDSD00_09_03.NURSING_GRADECODE
     *
     * @return the value of HDSD00_09_03.NURSING_GRADECODE
     */
    public String getNursingGradecode() {
        return nursingGradecode;
    }

    /**
     * HDSD00_09_03.NURSING_GRADECODE
     *
     * @param nursingGradecode the value for HDSD00_09_03.NURSING_GRADECODE
     */
    public void setNursingGradecode(String nursingGradecode) {
        this.nursingGradecode = nursingGradecode;
    }

    /**
     * HDSD00_09_03.NURSING_GRADE
     *
     * @return the value of HDSD00_09_03.NURSING_GRADE
     */
    public String getNursingGrade() {
        return nursingGrade;
    }

    /**
     * HDSD00_09_03.NURSING_GRADE
     *
     * @param nursingGrade the value for HDSD00_09_03.NURSING_GRADE
     */
    public void setNursingGrade(String nursingGrade) {
        this.nursingGrade = nursingGrade;
    }

    /**
     * HDSD00_09_03.NURSE_OUTCOME
     *
     * @return the value of HDSD00_09_03.NURSE_OUTCOME
     */
    public String getNurseOutcome() {
        return nurseOutcome;
    }

    /**
     * HDSD00_09_03.NURSE_OUTCOME
     *
     * @param nurseOutcome the value for HDSD00_09_03.NURSE_OUTCOME
     */
    public void setNurseOutcome(String nurseOutcome) {
        this.nurseOutcome = nurseOutcome;
    }

    /**
     * HDSD00_09_03.NURSER_NAME
     *
     * @return the value of HDSD00_09_03.NURSER_NAME
     */
    public String getNurserName() {
        return nurserName;
    }

    /**
     * HDSD00_09_03.NURSER_NAME
     *
     * @param nurserName the value for HDSD00_09_03.NURSER_NAME
     */
    public void setNurserName(String nurserName) {
        this.nurserName = nurserName;
    }

    /**
     * HDSD00_09_03.NURSE_CATEGORY_ITEM
     *
     * @return the value of HDSD00_09_03.NURSE_CATEGORY_ITEM
     */
    public String getNurseCategoryItem() {
        return nurseCategoryItem;
    }

    /**
     * HDSD00_09_03.NURSE_CATEGORY_ITEM
     *
     * @param nurseCategoryItem the value for HDSD00_09_03.NURSE_CATEGORY_ITEM
     */
    public void setNurseCategoryItem(String nurseCategoryItem) {
        this.nurseCategoryItem = nurseCategoryItem;
    }

    /**
     * HDSD00_09_03.LOAD_TYPE
     *
     * @return the value of HDSD00_09_03.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_09_03.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_09_03.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_09_03.INPATIENT
     *
     * @return the value of HDSD00_09_03.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_09_03.INPATIENT
     *
     * @param inpatient the value for HDSD00_09_03.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_09_03.ID_NUM
     *
     * @return the value of HDSD00_09_03.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_09_03.ID_NUM
     *
     * @param idNum the value for HDSD00_09_03.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_09_03.HOSPITAL_NAME
     *
     * @return the value of HDSD00_09_03.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_09_03.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_09_03.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_09_03.HOSPITAL_CODE
     *
     * @return the value of HDSD00_09_03.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_09_03.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_09_03.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_09_03.HEALTH_CARD
     *
     * @return the value of HDSD00_09_03.HEALTH_CARD
     */
    public String getHealthCard() {
        return healthCard;
    }

    /**
     * HDSD00_09_03.HEALTH_CARD
     *
     * @param healthCard the value for HDSD00_09_03.HEALTH_CARD
     */
    public void setHealthCard(String healthCard) {
        this.healthCard = healthCard;
    }

    /**
     * HDSD00_09_03.GENDER_CODE
     *
     * @return the value of HDSD00_09_03.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_09_03.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_09_03.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_09_03.GENDER
     *
     * @return the value of HDSD00_09_03.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_09_03.GENDER
     *
     * @param gender the value for HDSD00_09_03.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_09_03.FILL_DATE
     *
     * @return the value of HDSD00_09_03.FILL_DATE
     */
    public String getFillDate() {
        return fillDate;
    }

    /**
     * HDSD00_09_03.FILL_DATE
     *
     * @param fillDate the value for HDSD00_09_03.FILL_DATE
     */
    public void setFillDate(String fillDate) {
        this.fillDate = fillDate;
    }

    /**
     * HDSD00_09_03.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_09_03.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_09_03.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_09_03.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_09_03.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_09_03.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_09_03.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_09_03.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_09_03.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_09_03.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_09_03.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_09_03.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_09_03.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_09_03.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_09_03.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_09_03.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_09_03.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_09_03.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_09_03.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_09_03.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_09_03.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_09_03.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_09_03.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_09_03.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_09_03.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_09_03.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_09_03.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_09_03.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_09_03.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_09_03.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_09_03.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_09_03.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_09_03.DOC_AUDIT_DATE
     *
     * @return the value of HDSD00_09_03.DOC_AUDIT_DATE
     */
    public String getDocAuditDate() {
        return docAuditDate;
    }

    /**
     * HDSD00_09_03.DOC_AUDIT_DATE
     *
     * @param docAuditDate the value for HDSD00_09_03.DOC_AUDIT_DATE
     */
    public void setDocAuditDate(String docAuditDate) {
        this.docAuditDate = docAuditDate;
    }

    /**
     * HDSD00_09_03.DOC_AUDITORCODE
     *
     * @return the value of HDSD00_09_03.DOC_AUDITORCODE
     */
    public String getDocAuditorcode() {
        return docAuditorcode;
    }

    /**
     * HDSD00_09_03.DOC_AUDITORCODE
     *
     * @param docAuditorcode the value for HDSD00_09_03.DOC_AUDITORCODE
     */
    public void setDocAuditorcode(String docAuditorcode) {
        this.docAuditorcode = docAuditorcode;
    }

    /**
     * HDSD00_09_03.DOC_AUDITOR
     *
     * @return the value of HDSD00_09_03.DOC_AUDITOR
     */
    public String getDocAuditor() {
        return docAuditor;
    }

    /**
     * HDSD00_09_03.DOC_AUDITOR
     *
     * @param docAuditor the value for HDSD00_09_03.DOC_AUDITOR
     */
    public void setDocAuditor(String docAuditor) {
        this.docAuditor = docAuditor;
    }

    /**
     * HDSD00_09_03.DIETARY_GUIDANCECODE
     *
     * @return the value of HDSD00_09_03.DIETARY_GUIDANCECODE
     */
    public String getDietaryGuidancecode() {
        return dietaryGuidancecode;
    }

    /**
     * HDSD00_09_03.DIETARY_GUIDANCECODE
     *
     * @param dietaryGuidancecode the value for HDSD00_09_03.DIETARY_GUIDANCECODE
     */
    public void setDietaryGuidancecode(String dietaryGuidancecode) {
        this.dietaryGuidancecode = dietaryGuidancecode;
    }

    /**
     * HDSD00_09_03.DIETARY_GUIDANCE
     *
     * @return the value of HDSD00_09_03.DIETARY_GUIDANCE
     */
    public String getDietaryGuidance() {
        return dietaryGuidance;
    }

    /**
     * HDSD00_09_03.DIETARY_GUIDANCE
     *
     * @param dietaryGuidance the value for HDSD00_09_03.DIETARY_GUIDANCE
     */
    public void setDietaryGuidance(String dietaryGuidance) {
        this.dietaryGuidance = dietaryGuidance;
    }

    /**
     * HDSD00_09_03.DIAG_NAME
     *
     * @return the value of HDSD00_09_03.DIAG_NAME
     */
    public String getDiagName() {
        return diagName;
    }

    /**
     * HDSD00_09_03.DIAG_NAME
     *
     * @param diagName the value for HDSD00_09_03.DIAG_NAME
     */
    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    /**
     * HDSD00_09_03.DIAG_CODE
     *
     * @return the value of HDSD00_09_03.DIAG_CODE
     */
    public String getDiagCode() {
        return diagCode;
    }

    /**
     * HDSD00_09_03.DIAG_CODE
     *
     * @param diagCode the value for HDSD00_09_03.DIAG_CODE
     */
    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    /**
     * HDSD00_09_03.DEPT_NAME
     *
     * @return the value of HDSD00_09_03.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_09_03.DEPT_NAME
     *
     * @param deptName the value for HDSD00_09_03.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_09_03.DEPT_CODE
     *
     * @return the value of HDSD00_09_03.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_09_03.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_09_03.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_09_03.CATHETER_DESCRIPTION
     *
     * @return the value of HDSD00_09_03.CATHETER_DESCRIPTION
     */
    public String getCatheterDescription() {
        return catheterDescription;
    }

    /**
     * HDSD00_09_03.CATHETER_DESCRIPTION
     *
     * @param catheterDescription the value for HDSD00_09_03.CATHETER_DESCRIPTION
     */
    public void setCatheterDescription(String catheterDescription) {
        this.catheterDescription = catheterDescription;
    }

    /**
     * HDSD00_09_03.BED_NO
     *
     * @return the value of HDSD00_09_03.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_09_03.BED_NO
     *
     * @param bedNo the value for HDSD00_09_03.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_09_03.BED_NAME
     *
     * @return the value of HDSD00_09_03.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_09_03.BED_NAME
     *
     * @param bedName the value for HDSD00_09_03.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_09_03.AGE_UNIT
     *
     * @return the value of HDSD00_09_03.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_09_03.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_09_03.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_09_03.AGE
     *
     * @return the value of HDSD00_09_03.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_09_03.AGE
     *
     * @param age the value for HDSD00_09_03.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_09_03.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_09_03.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_09_03.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_09_03.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_09_03.VISIT_DATE
     *
     * @return the value of HDSD00_09_03.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_09_03.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_09_03.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }
}