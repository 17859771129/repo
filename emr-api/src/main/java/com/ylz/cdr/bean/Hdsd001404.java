package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_14_04")
public class Hdsd001404 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_14_04
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_14_04.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_14_04.status
     */
    private String status;
    /**
     * HDSD00_14_04.pk
     */
    private Integer pk;
    /**
     * HDSD00_14_04.empi
     */
    private String empi;
    /**
     * HDSD00_14_04.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_14_04.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_14_04.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_14_04.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_14_04.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_14_04.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_14_04.VERSION
     */
    private String version;
    /**
     * HDSD00_14_04.TARGET_NAME
     */
    private String targetName;
    /**
     * HDSD00_14_04.SURGEON_SIGNDATE
     */
    private String surgeonSigndate;
    /**
     * HDSD00_14_04.SURGEON_NAME
     */
    private String surgeonName;
    /**
     * HDSD00_14_04.SURGEON_CODE
     */
    private String surgeonCode;
    /**
     * HDSD00_14_04.SUMMARY_DATE
     */
    private String summaryDate;
    /**
     * HDSD00_14_04.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_14_04.RECORD_SUMMARY
     */
    private String recordSummary;
    /**
     * HDSD00_14_04.PRE_PREPARATION
     */
    private String prePreparation;
    /**
     * HDSD00_14_04.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_14_04.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_14_04.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_14_04.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_14_04.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_14_04.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_14_04.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_14_04.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_14_04.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_14_04.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_14_04.OPER_NAME
     */
    private String operName;
    /**
     * HDSD00_14_04.OPER_KEY_POINT
     */
    private String operKeyPoint;
    /**
     * HDSD00_14_04.OPER_DATE
     */
    private String operDate;
    /**
     * HDSD00_14_04.OPER_CODE
     */
    private String operCode;
    /**
     * HDSD00_14_04.NEEDING_ATTENTION
     */
    private String needingAttention;
    /**
     * HDSD00_14_04.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_14_04.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_14_04.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_14_04.ITEM_RESULT
     */
    private String itemResult;
    /**
     * HDSD00_14_04.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_14_04.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_14_04.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_14_04.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_14_04.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_14_04.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_14_04.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_14_04.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_14_04.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_14_04.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_14_04.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_14_04.DOCTOR_SIGNDATE
     */
    private String doctorSigndate;
    /**
     * HDSD00_14_04.DOCTOR_NAME
     */
    private String doctorName;
    /**
     * HDSD00_14_04.DOCTOR_CODE
     */
    private String doctorCode;
    /**
     * HDSD00_14_04.DIAGNOSTIC_BASIS
     */
    private String diagnosticBasis;
    /**
     * HDSD00_14_04.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_14_04.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_14_04.CONTACT_NUMBER
     */
    private String contactNumber;
    /**
     * HDSD00_14_04.CONTACT_NAME
     */
    private String contactName;
    /**
     * HDSD00_14_04.CONSULTATION_OPINION
     */
    private String consultationOpinion;
    /**
     * HDSD00_14_04.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_14_04.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_14_04.ANES_CODE
     */
    private String anesCode;
    /**
     * HDSD00_14_04.ALLERGY_HISTORY_MARK
     */
    private String allergyHistoryMark;
    /**
     * HDSD00_14_04.ALLERGY_HISTORY
     */
    private String allergyHistory;
    /**
     * HDSD00_14_04.AGE
     */
    private String age;
    /**
     * HDSD00_14_04.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_14_04.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_14_04.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_14_04.GENDER
     */
    private String gender;
    /**
     * HDSD00_14_04.ANES_NAME
     */
    private String anesName;
    /**
     * HDSD00_14_04.OPER_INDICATION
     */
    private String operIndication;
    /**
     * HDSD00_14_04.CONTRAINDICATION
     */
    private String contraindication;
    /**
     * HDSD00_14_04.OPER_SURGICAL
     */
    private String operSurgical;

    /**
     * HDSD00_14_04.upload_time
     *
     * @return the value of HDSD00_14_04.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_14_04.upload_time
     *
     * @param uploadTime the value for HDSD00_14_04.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_14_04.status
     *
     * @return the value of HDSD00_14_04.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_14_04.status
     *
     * @param status the value for HDSD00_14_04.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_14_04.pk
     *
     * @return the value of HDSD00_14_04.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_14_04.pk
     *
     * @param pk the value for HDSD00_14_04.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_14_04.empi
     *
     * @return the value of HDSD00_14_04.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_14_04.empi
     *
     * @param empi the value for HDSD00_14_04.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_14_04.ENCOUNTER_ID
     *
     * @return the value of HDSD00_14_04.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_14_04.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_14_04.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_14_04.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_14_04.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_14_04.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_14_04.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_14_04.WARD_NAME
     *
     * @return the value of HDSD00_14_04.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_14_04.WARD_NAME
     *
     * @param wardName the value for HDSD00_14_04.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_14_04.WARD_ID
     *
     * @return the value of HDSD00_14_04.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_14_04.WARD_ID
     *
     * @param wardId the value for HDSD00_14_04.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_14_04.WARDS_NAME
     *
     * @return the value of HDSD00_14_04.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_14_04.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_14_04.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_14_04.WARDS_ID
     *
     * @return the value of HDSD00_14_04.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_14_04.WARDS_ID
     *
     * @param wardsId the value for HDSD00_14_04.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_14_04.VERSION
     *
     * @return the value of HDSD00_14_04.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_14_04.VERSION
     *
     * @param version the value for HDSD00_14_04.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_14_04.TARGET_NAME
     *
     * @return the value of HDSD00_14_04.TARGET_NAME
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * HDSD00_14_04.TARGET_NAME
     *
     * @param targetName the value for HDSD00_14_04.TARGET_NAME
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * HDSD00_14_04.SURGEON_SIGNDATE
     *
     * @return the value of HDSD00_14_04.SURGEON_SIGNDATE
     */
    public String getSurgeonSigndate() {
        return surgeonSigndate;
    }

    /**
     * HDSD00_14_04.SURGEON_SIGNDATE
     *
     * @param surgeonSigndate the value for HDSD00_14_04.SURGEON_SIGNDATE
     */
    public void setSurgeonSigndate(String surgeonSigndate) {
        this.surgeonSigndate = surgeonSigndate;
    }

    /**
     * HDSD00_14_04.SURGEON_NAME
     *
     * @return the value of HDSD00_14_04.SURGEON_NAME
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * HDSD00_14_04.SURGEON_NAME
     *
     * @param surgeonName the value for HDSD00_14_04.SURGEON_NAME
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }

    /**
     * HDSD00_14_04.SURGEON_CODE
     *
     * @return the value of HDSD00_14_04.SURGEON_CODE
     */
    public String getSurgeonCode() {
        return surgeonCode;
    }

    /**
     * HDSD00_14_04.SURGEON_CODE
     *
     * @param surgeonCode the value for HDSD00_14_04.SURGEON_CODE
     */
    public void setSurgeonCode(String surgeonCode) {
        this.surgeonCode = surgeonCode;
    }

    /**
     * HDSD00_14_04.SUMMARY_DATE
     *
     * @return the value of HDSD00_14_04.SUMMARY_DATE
     */
    public String getSummaryDate() {
        return summaryDate;
    }

    /**
     * HDSD00_14_04.SUMMARY_DATE
     *
     * @param summaryDate the value for HDSD00_14_04.SUMMARY_DATE
     */
    public void setSummaryDate(String summaryDate) {
        this.summaryDate = summaryDate;
    }

    /**
     * HDSD00_14_04.REPORT_TITLE
     *
     * @return the value of HDSD00_14_04.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_14_04.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_14_04.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_14_04.RECORD_SUMMARY
     *
     * @return the value of HDSD00_14_04.RECORD_SUMMARY
     */
    public String getRecordSummary() {
        return recordSummary;
    }

    /**
     * HDSD00_14_04.RECORD_SUMMARY
     *
     * @param recordSummary the value for HDSD00_14_04.RECORD_SUMMARY
     */
    public void setRecordSummary(String recordSummary) {
        this.recordSummary = recordSummary;
    }

    /**
     * HDSD00_14_04.PRE_PREPARATION
     *
     * @return the value of HDSD00_14_04.PRE_PREPARATION
     */
    public String getPrePreparation() {
        return prePreparation;
    }

    /**
     * HDSD00_14_04.PRE_PREPARATION
     *
     * @param prePreparation the value for HDSD00_14_04.PRE_PREPARATION
     */
    public void setPrePreparation(String prePreparation) {
        this.prePreparation = prePreparation;
    }

    /**
     * HDSD00_14_04.PATIENT_NAME
     *
     * @return the value of HDSD00_14_04.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_14_04.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_14_04.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_14_04.PATIENT_TYPE
     *
     * @return the value of HDSD00_14_04.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_14_04.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_14_04.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_14_04.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_14_04.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_14_04.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_14_04.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_14_04.VISIT_TIMES
     *
     * @return the value of HDSD00_14_04.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_14_04.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_14_04.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_14_04.VISIT_ID
     *
     * @return the value of HDSD00_14_04.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_14_04.VISIT_ID
     *
     * @param visitId the value for HDSD00_14_04.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_14_04.VISIT_DOMAIN
     *
     * @return the value of HDSD00_14_04.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_14_04.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_14_04.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_14_04.PATIENT_ID
     *
     * @return the value of HDSD00_14_04.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_14_04.PATIENT_ID
     *
     * @param patientId the value for HDSD00_14_04.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_14_04.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_14_04.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_14_04.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_14_04.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_14_04.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_14_04.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_14_04.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_14_04.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_14_04.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_14_04.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_14_04.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_14_04.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_14_04.OPER_NAME
     *
     * @return the value of HDSD00_14_04.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * HDSD00_14_04.OPER_NAME
     *
     * @param operName the value for HDSD00_14_04.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }

    /**
     * HDSD00_14_04.OPER_KEY_POINT
     *
     * @return the value of HDSD00_14_04.OPER_KEY_POINT
     */
    public String getOperKeyPoint() {
        return operKeyPoint;
    }

    /**
     * HDSD00_14_04.OPER_KEY_POINT
     *
     * @param operKeyPoint the value for HDSD00_14_04.OPER_KEY_POINT
     */
    public void setOperKeyPoint(String operKeyPoint) {
        this.operKeyPoint = operKeyPoint;
    }

    /**
     * HDSD00_14_04.OPER_DATE
     *
     * @return the value of HDSD00_14_04.OPER_DATE
     */
    public String getOperDate() {
        return operDate;
    }

    /**
     * HDSD00_14_04.OPER_DATE
     *
     * @param operDate the value for HDSD00_14_04.OPER_DATE
     */
    public void setOperDate(String operDate) {
        this.operDate = operDate;
    }

    /**
     * HDSD00_14_04.OPER_CODE
     *
     * @return the value of HDSD00_14_04.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * HDSD00_14_04.OPER_CODE
     *
     * @param operCode the value for HDSD00_14_04.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * HDSD00_14_04.NEEDING_ATTENTION
     *
     * @return the value of HDSD00_14_04.NEEDING_ATTENTION
     */
    public String getNeedingAttention() {
        return needingAttention;
    }

    /**
     * HDSD00_14_04.NEEDING_ATTENTION
     *
     * @param needingAttention the value for HDSD00_14_04.NEEDING_ATTENTION
     */
    public void setNeedingAttention(String needingAttention) {
        this.needingAttention = needingAttention;
    }

    /**
     * HDSD00_14_04.LOAD_TYPE
     *
     * @return the value of HDSD00_14_04.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_14_04.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_14_04.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_14_04.HOSPITAL_NAME
     *
     * @return the value of HDSD00_14_04.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_14_04.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_14_04.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_14_04.HOSPITAL_CODE
     *
     * @return the value of HDSD00_14_04.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_14_04.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_14_04.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_14_04.ITEM_RESULT
     *
     * @return the value of HDSD00_14_04.ITEM_RESULT
     */
    public String getItemResult() {
        return itemResult;
    }

    /**
     * HDSD00_14_04.ITEM_RESULT
     *
     * @param itemResult the value for HDSD00_14_04.ITEM_RESULT
     */
    public void setItemResult(String itemResult) {
        this.itemResult = itemResult;
    }

    /**
     * HDSD00_14_04.INPATIENT
     *
     * @return the value of HDSD00_14_04.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_14_04.INPATIENT
     *
     * @param inpatient the value for HDSD00_14_04.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_14_04.ID_NUM
     *
     * @return the value of HDSD00_14_04.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_14_04.ID_NUM
     *
     * @param idNum the value for HDSD00_14_04.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_14_04.GENDER_CODE
     *
     * @return the value of HDSD00_14_04.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_14_04.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_14_04.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_14_04.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_14_04.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_14_04.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_14_04.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_14_04.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_14_04.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_14_04.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_14_04.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_14_04.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_14_04.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_14_04.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_14_04.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_14_04.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_14_04.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_14_04.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_14_04.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_14_04.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_14_04.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_14_04.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_14_04.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_14_04.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_14_04.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_14_04.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_14_04.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_14_04.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_14_04.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_14_04.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_14_04.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_14_04.DOC_AUTHOR
     *
     * @return the value of HDSD00_14_04.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_14_04.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_14_04.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_14_04.DOCTOR_SIGNDATE
     *
     * @return the value of HDSD00_14_04.DOCTOR_SIGNDATE
     */
    public String getDoctorSigndate() {
        return doctorSigndate;
    }

    /**
     * HDSD00_14_04.DOCTOR_SIGNDATE
     *
     * @param doctorSigndate the value for HDSD00_14_04.DOCTOR_SIGNDATE
     */
    public void setDoctorSigndate(String doctorSigndate) {
        this.doctorSigndate = doctorSigndate;
    }

    /**
     * HDSD00_14_04.DOCTOR_NAME
     *
     * @return the value of HDSD00_14_04.DOCTOR_NAME
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * HDSD00_14_04.DOCTOR_NAME
     *
     * @param doctorName the value for HDSD00_14_04.DOCTOR_NAME
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * HDSD00_14_04.DOCTOR_CODE
     *
     * @return the value of HDSD00_14_04.DOCTOR_CODE
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * HDSD00_14_04.DOCTOR_CODE
     *
     * @param doctorCode the value for HDSD00_14_04.DOCTOR_CODE
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    /**
     * HDSD00_14_04.DIAGNOSTIC_BASIS
     *
     * @return the value of HDSD00_14_04.DIAGNOSTIC_BASIS
     */
    public String getDiagnosticBasis() {
        return diagnosticBasis;
    }

    /**
     * HDSD00_14_04.DIAGNOSTIC_BASIS
     *
     * @param diagnosticBasis the value for HDSD00_14_04.DIAGNOSTIC_BASIS
     */
    public void setDiagnosticBasis(String diagnosticBasis) {
        this.diagnosticBasis = diagnosticBasis;
    }

    /**
     * HDSD00_14_04.DEPT_NAME
     *
     * @return the value of HDSD00_14_04.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_14_04.DEPT_NAME
     *
     * @param deptName the value for HDSD00_14_04.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_14_04.DEPT_CODE
     *
     * @return the value of HDSD00_14_04.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_14_04.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_14_04.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_14_04.CONTACT_NUMBER
     *
     * @return the value of HDSD00_14_04.CONTACT_NUMBER
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * HDSD00_14_04.CONTACT_NUMBER
     *
     * @param contactNumber the value for HDSD00_14_04.CONTACT_NUMBER
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * HDSD00_14_04.CONTACT_NAME
     *
     * @return the value of HDSD00_14_04.CONTACT_NAME
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * HDSD00_14_04.CONTACT_NAME
     *
     * @param contactName the value for HDSD00_14_04.CONTACT_NAME
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * HDSD00_14_04.CONSULTATION_OPINION
     *
     * @return the value of HDSD00_14_04.CONSULTATION_OPINION
     */
    public String getConsultationOpinion() {
        return consultationOpinion;
    }

    /**
     * HDSD00_14_04.CONSULTATION_OPINION
     *
     * @param consultationOpinion the value for HDSD00_14_04.CONSULTATION_OPINION
     */
    public void setConsultationOpinion(String consultationOpinion) {
        this.consultationOpinion = consultationOpinion;
    }

    /**
     * HDSD00_14_04.BED_NO
     *
     * @return the value of HDSD00_14_04.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_14_04.BED_NO
     *
     * @param bedNo the value for HDSD00_14_04.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_14_04.BED_NAME
     *
     * @return the value of HDSD00_14_04.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_14_04.BED_NAME
     *
     * @param bedName the value for HDSD00_14_04.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_14_04.ANES_CODE
     *
     * @return the value of HDSD00_14_04.ANES_CODE
     */
    public String getAnesCode() {
        return anesCode;
    }

    /**
     * HDSD00_14_04.ANES_CODE
     *
     * @param anesCode the value for HDSD00_14_04.ANES_CODE
     */
    public void setAnesCode(String anesCode) {
        this.anesCode = anesCode;
    }

    /**
     * HDSD00_14_04.ALLERGY_HISTORY_MARK
     *
     * @return the value of HDSD00_14_04.ALLERGY_HISTORY_MARK
     */
    public String getAllergyHistoryMark() {
        return allergyHistoryMark;
    }

    /**
     * HDSD00_14_04.ALLERGY_HISTORY_MARK
     *
     * @param allergyHistoryMark the value for HDSD00_14_04.ALLERGY_HISTORY_MARK
     */
    public void setAllergyHistoryMark(String allergyHistoryMark) {
        this.allergyHistoryMark = allergyHistoryMark;
    }

    /**
     * HDSD00_14_04.ALLERGY_HISTORY
     *
     * @return the value of HDSD00_14_04.ALLERGY_HISTORY
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * HDSD00_14_04.ALLERGY_HISTORY
     *
     * @param allergyHistory the value for HDSD00_14_04.ALLERGY_HISTORY
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }

    /**
     * HDSD00_14_04.AGE
     *
     * @return the value of HDSD00_14_04.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_14_04.AGE
     *
     * @param age the value for HDSD00_14_04.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_14_04.AGE_UNIT
     *
     * @return the value of HDSD00_14_04.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_14_04.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_14_04.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_14_04.VISIT_DATE
     *
     * @return the value of HDSD00_14_04.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_14_04.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_14_04.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_14_04.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_14_04.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_14_04.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_14_04.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_14_04.GENDER
     *
     * @return the value of HDSD00_14_04.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_14_04.GENDER
     *
     * @param gender the value for HDSD00_14_04.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_14_04.ANES_NAME
     *
     * @return the value of HDSD00_14_04.ANES_NAME
     */
    public String getAnesName() {
        return anesName;
    }

    /**
     * HDSD00_14_04.ANES_NAME
     *
     * @param anesName the value for HDSD00_14_04.ANES_NAME
     */
    public void setAnesName(String anesName) {
        this.anesName = anesName;
    }

    /**
     * HDSD00_14_04.OPER_INDICATION
     *
     * @return the value of HDSD00_14_04.OPER_INDICATION
     */
    public String getOperIndication() {
        return operIndication;
    }

    /**
     * HDSD00_14_04.OPER_INDICATION
     *
     * @param operIndication the value for HDSD00_14_04.OPER_INDICATION
     */
    public void setOperIndication(String operIndication) {
        this.operIndication = operIndication;
    }

    /**
     * HDSD00_14_04.CONTRAINDICATION
     *
     * @return the value of HDSD00_14_04.CONTRAINDICATION
     */
    public String getContraindication() {
        return contraindication;
    }

    /**
     * HDSD00_14_04.CONTRAINDICATION
     *
     * @param contraindication the value for HDSD00_14_04.CONTRAINDICATION
     */
    public void setContraindication(String contraindication) {
        this.contraindication = contraindication;
    }

    /**
     * HDSD00_14_04.OPER_SURGICAL
     *
     * @return the value of HDSD00_14_04.OPER_SURGICAL
     */
    public String getOperSurgical() {
        return operSurgical;
    }

    /**
     * HDSD00_14_04.OPER_SURGICAL
     *
     * @param operSurgical the value for HDSD00_14_04.OPER_SURGICAL
     */
    public void setOperSurgical(String operSurgical) {
        this.operSurgical = operSurgical;
    }
}