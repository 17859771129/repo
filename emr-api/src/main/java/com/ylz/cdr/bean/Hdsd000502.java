package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_05_02")
public class Hdsd000502 extends BaseBean implements Serializable {

    private static final long serialVersionUID = 2736405610543384447L;
    /**
     * HDSD00_05_02.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_05_02.status
     */
    private String status;
    /**
     * HDSD00_05_02.pk
     */
    private Integer pk;
    /**
     * HDSD00_05_02.empi
     */
    private String empi;
    /**
     * HDSD00_05_02.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_05_02.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_05_02.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_05_02.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_05_02.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_05_02.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_05_02.VERSION
     */
    private String version;
    /**
     * HDSD00_05_02.TREATMENT_PROCESS
     */
    private String treatmentProcess;
    /**
     * HDSD00_05_02.TELEPHONE
     */
    private String telephone;
    /**
     * HDSD00_05_02.TECHNICIAN_NAME
     */
    private String technicianName;
    /**
     * HDSD00_05_02.TECHNICIAN_CODE
     */
    private String technicianCode;
    /**
     * HDSD00_05_02.SYMPTOM_STOPPING_DATE
     */
    private String symptomStoppingDate;
    /**
     * HDSD00_05_02.SYMPTOM_START_DATE
     */
    private String symptomStartDate;
    /**
     * HDSD00_05_02.SYMPTOM_DESCRIPTION
     */
    private String symptomDescription;
    /**
     * HDSD00_05_02.SUBJECTIVE_TIP
     */
    private String subjectiveTip;
    /**
     * HDSD00_05_02.SPECIMEN_NUMBER
     */
    private String specimenNumber;
    /**
     * HDSD00_05_02.SPECIAL_EXAM_MARK
     */
    private String specialExamMark;
    /**
     * HDSD00_05_02.REPOR_CODE
     */
    private String reporCode;
    /**
     * HDSD00_05_02.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_05_02.REPORT_REMARK
     */
    private String reportRemark;
    /**
     * HDSD00_05_02.REPORT_NAME
     */
    private String reportName;
    /**
     * HDSD00_05_02.REPORT_ID
     */
    private String reportId;
    /**
     * HDSD00_05_02.REPORT_DEPT
     */
    private String reportDept;
    /**
     * HDSD00_05_02.REPORT_DATE
     */
    private String reportDate;
    /**
     * HDSD00_05_02.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_05_02.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_05_02.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_05_02.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_05_02.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_05_02.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_05_02.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_05_02.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_05_02.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_05_02.OBJECTIVE_OBSERVATION
     */
    private String objectiveObservation;
    /**
     * HDSD00_05_02.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_05_02.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_05_02.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_05_02.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_05_02.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_05_02.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_05_02.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_05_02.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_05_02.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_05_02.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_05_02.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_05_02.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_05_02.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_05_02.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_05_02.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_05_02.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_05_02.DEPOSITORY_ADDRESS
     */
    private String depositoryAddress;
    /**
     * HDSD00_05_02.CHIEF_COMPLAINT
     */
    private String chiefComplaint;
    /**
     * HDSD00_05_02.CHECK_NAME
     */
    private String checkName;
    /**
     * HDSD00_05_02.CHECK_METHOD
     */
    private String checkMethod;
    /**
     * HDSD00_05_02.CHECK_CODE
     */
    private String checkCode;
    /**
     * HDSD00_05_02.CHECK_CATEGORY
     */
    private String checkCategory;
    /**
     * HDSD00_05_02.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_05_02.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_05_02.AUDIT_NAME
     */
    private String auditName;
    /**
     * HDSD00_05_02.AUDIT_CODE
     */
    private String auditCode;
    /**
     * HDSD00_05_02.APPY_ID
     */
    private String appyId;
    /**
     * HDSD00_05_02.APPLY_ORGAN
     */
    private String applyOrgan;
    /**
     * HDSD00_05_02.APPLY_DEPT_CODE
     */
    private String applyDeptCode;
    /**
     * HDSD00_05_02.APPLY_DEPT
     */
    private String applyDept;
    /**
     * HDSD00_05_02.APPLY_AGENCYCODE
     */
    private String applyAgencycode;
    /**
     * HDSD00_05_02.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_05_02.AGENCY_NAME
     */
    private String agencyName;
    /**
     * HDSD00_05_02.AGE
     */
    private String age;
    /**
     * HDSD00_05_02.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_05_02.INTERVENTION
     */
    private String intervention;
    /**
     * HDSD00_05_02.OPER_NAME
     */
    private String operName;
    /**
     * HDSD00_05_02.OPER_PART_CODE
     */
    private String operPartCode;
    /**
     * HDSD00_05_02.OPER_DATE
     */
    private String operDate;
    /**
     * HDSD00_05_02.OPER_CODE
     */
    private String operCode;
    /**
     * HDSD00_05_02.QUANTY_RESULT_UNIT
     */
    private String quantyResultUnit;
    /**
     * HDSD00_05_02.QUANTY_RESULT
     */
    private String quantyResult;
    /**
     * HDSD00_05_02.RESULT_CODE
     */
    private String resultCode;
    /**
     * HDSD00_05_02.SPECIMEN_FIXATIVE
     */
    private String specimenFixative;
    /**
     * HDSD00_05_02.SPECIMEN_STATUS
     */
    private String specimenStatus;
    /**
     * HDSD00_05_02.SPECIMEN_CATEGORY
     */
    private String specimenCategory;
    /**
     * HDSD00_05_02.RECEIPT_DATE
     */
    private String receiptDate;
    /**
     * HDSD00_05_02.SAMPLE_DATE
     */
    private String sampleDate;
    /**
     * HDSD00_05_02.ITEM_CODE
     */
    private String itemCode;
    /**
     * HDSD00_05_02.CHECK_DATE
     */
    private String checkDate;
    /**
     * HDSD00_05_02.ANESTH_WESTERN_SIGN
     */
    private String anesthWesternSign;
    /**
     * HDSD00_05_02.ANES_OBS
     */
    private String anesObs;
    /**
     * HDSD00_05_02.ANESTH_NAME
     */
    private String anesthName;
    /**
     * HDSD00_05_02.ANES_METHOD_CODE
     */
    private String anesMethodCode;
    /**
     * HDSD00_05_02.OPER_NUM
     */
    private String operNum;
    /**
     * HDSD00_05_02.OPER_METHOD
     */
    private String operMethod;
    /**
     * HDSD00_05_02.ITEM_NAME
     */
    private String itemName;
    /**
     * HDSD00_05_02.CHECK_CATEGORY_CODE
     */
    private String checkCategoryCode;
    /**
     * HDSD00_05_02.GENDER
     */
    private String gender;
    /**
     * HDSD00_05_02.OPER_PART_NAME
     */
    private String operPartName;
    /**
     * HDSD00_05_02.ANES_METHOD_NAME
     */
    private String anesMethodName;
    /**
     * HDSD00_05_02.ANESTH_WESTERN
     */
    private String anesthWestern;
    /**
     * HDSD00_05_02.RESULT_NAME
     */
    private String resultName;

    private String auditSigndate;

    private String checkSigndate;

    private String technicianSigndate;

    private String applyDate;

    /**
     * HDSD00_05_02.upload_time
     *
     * @return the value of HDSD00_05_02.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_05_02.upload_time
     *
     * @param uploadTime the value for HDSD00_05_02.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_05_02.status
     *
     * @return the value of HDSD00_05_02.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_05_02.status
     *
     * @param status the value for HDSD00_05_02.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_05_02.pk
     *
     * @return the value of HDSD00_05_02.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_05_02.pk
     *
     * @param pk the value for HDSD00_05_02.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_05_02.empi
     *
     * @return the value of HDSD00_05_02.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_05_02.empi
     *
     * @param empi the value for HDSD00_05_02.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_05_02.ENCOUNTER_ID
     *
     * @return the value of HDSD00_05_02.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_05_02.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_05_02.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_05_02.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_05_02.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_05_02.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_05_02.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_05_02.WARD_NAME
     *
     * @return the value of HDSD00_05_02.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_05_02.WARD_NAME
     *
     * @param wardName the value for HDSD00_05_02.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_05_02.WARD_ID
     *
     * @return the value of HDSD00_05_02.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_05_02.WARD_ID
     *
     * @param wardId the value for HDSD00_05_02.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_05_02.WARDS_NAME
     *
     * @return the value of HDSD00_05_02.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_05_02.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_05_02.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_05_02.WARDS_ID
     *
     * @return the value of HDSD00_05_02.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_05_02.WARDS_ID
     *
     * @param wardsId the value for HDSD00_05_02.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_05_02.VERSION
     *
     * @return the value of HDSD00_05_02.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_05_02.VERSION
     *
     * @param version the value for HDSD00_05_02.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_05_02.TREATMENT_PROCESS
     *
     * @return the value of HDSD00_05_02.TREATMENT_PROCESS
     */
    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    /**
     * HDSD00_05_02.TREATMENT_PROCESS
     *
     * @param treatmentProcess the value for HDSD00_05_02.TREATMENT_PROCESS
     */
    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess;
    }

    /**
     * HDSD00_05_02.TELEPHONE
     *
     * @return the value of HDSD00_05_02.TELEPHONE
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * HDSD00_05_02.TELEPHONE
     *
     * @param telephone the value for HDSD00_05_02.TELEPHONE
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * HDSD00_05_02.TECHNICIAN_NAME
     *
     * @return the value of HDSD00_05_02.TECHNICIAN_NAME
     */
    public String getTechnicianName() {
        return technicianName;
    }

    /**
     * HDSD00_05_02.TECHNICIAN_NAME
     *
     * @param technicianName the value for HDSD00_05_02.TECHNICIAN_NAME
     */
    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    /**
     * HDSD00_05_02.TECHNICIAN_CODE
     *
     * @return the value of HDSD00_05_02.TECHNICIAN_CODE
     */
    public String getTechnicianCode() {
        return technicianCode;
    }

    /**
     * HDSD00_05_02.TECHNICIAN_CODE
     *
     * @param technicianCode the value for HDSD00_05_02.TECHNICIAN_CODE
     */
    public void setTechnicianCode(String technicianCode) {
        this.technicianCode = technicianCode;
    }

    /**
     * HDSD00_05_02.SYMPTOM_STOPPING_DATE
     *
     * @return the value of HDSD00_05_02.SYMPTOM_STOPPING_DATE
     */
    public String getSymptomStoppingDate() {
        return symptomStoppingDate;
    }

    /**
     * HDSD00_05_02.SYMPTOM_STOPPING_DATE
     *
     * @param symptomStoppingDate the value for HDSD00_05_02.SYMPTOM_STOPPING_DATE
     */
    public void setSymptomStoppingDate(String symptomStoppingDate) {
        this.symptomStoppingDate = symptomStoppingDate;
    }

    /**
     * HDSD00_05_02.SYMPTOM_START_DATE
     *
     * @return the value of HDSD00_05_02.SYMPTOM_START_DATE
     */
    public String getSymptomStartDate() {
        return symptomStartDate;
    }

    /**
     * HDSD00_05_02.SYMPTOM_START_DATE
     *
     * @param symptomStartDate the value for HDSD00_05_02.SYMPTOM_START_DATE
     */
    public void setSymptomStartDate(String symptomStartDate) {
        this.symptomStartDate = symptomStartDate;
    }

    /**
     * HDSD00_05_02.SYMPTOM_DESCRIPTION
     *
     * @return the value of HDSD00_05_02.SYMPTOM_DESCRIPTION
     */
    public String getSymptomDescription() {
        return symptomDescription;
    }

    /**
     * HDSD00_05_02.SYMPTOM_DESCRIPTION
     *
     * @param symptomDescription the value for HDSD00_05_02.SYMPTOM_DESCRIPTION
     */
    public void setSymptomDescription(String symptomDescription) {
        this.symptomDescription = symptomDescription;
    }

    /**
     * HDSD00_05_02.SUBJECTIVE_TIP
     *
     * @return the value of HDSD00_05_02.SUBJECTIVE_TIP
     */
    public String getSubjectiveTip() {
        return subjectiveTip;
    }

    /**
     * HDSD00_05_02.SUBJECTIVE_TIP
     *
     * @param subjectiveTip the value for HDSD00_05_02.SUBJECTIVE_TIP
     */
    public void setSubjectiveTip(String subjectiveTip) {
        this.subjectiveTip = subjectiveTip;
    }

    /**
     * HDSD00_05_02.SPECIMEN_NUMBER
     *
     * @return the value of HDSD00_05_02.SPECIMEN_NUMBER
     */
    public String getSpecimenNumber() {
        return specimenNumber;
    }

    /**
     * HDSD00_05_02.SPECIMEN_NUMBER
     *
     * @param specimenNumber the value for HDSD00_05_02.SPECIMEN_NUMBER
     */
    public void setSpecimenNumber(String specimenNumber) {
        this.specimenNumber = specimenNumber;
    }

    /**
     * HDSD00_05_02.SPECIAL_EXAM_MARK
     *
     * @return the value of HDSD00_05_02.SPECIAL_EXAM_MARK
     */
    public String getSpecialExamMark() {
        return specialExamMark;
    }

    /**
     * HDSD00_05_02.SPECIAL_EXAM_MARK
     *
     * @param specialExamMark the value for HDSD00_05_02.SPECIAL_EXAM_MARK
     */
    public void setSpecialExamMark(String specialExamMark) {
        this.specialExamMark = specialExamMark;
    }

    /**
     * HDSD00_05_02.REPOR_CODE
     *
     * @return the value of HDSD00_05_02.REPOR_CODE
     */
    public String getReporCode() {
        return reporCode;
    }

    /**
     * HDSD00_05_02.REPOR_CODE
     *
     * @param reporCode the value for HDSD00_05_02.REPOR_CODE
     */
    public void setReporCode(String reporCode) {
        this.reporCode = reporCode;
    }

    /**
     * HDSD00_05_02.REPORT_TITLE
     *
     * @return the value of HDSD00_05_02.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_05_02.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_05_02.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_05_02.REPORT_REMARK
     *
     * @return the value of HDSD00_05_02.REPORT_REMARK
     */
    public String getReportRemark() {
        return reportRemark;
    }

    /**
     * HDSD00_05_02.REPORT_REMARK
     *
     * @param reportRemark the value for HDSD00_05_02.REPORT_REMARK
     */
    public void setReportRemark(String reportRemark) {
        this.reportRemark = reportRemark;
    }

    /**
     * HDSD00_05_02.REPORT_NAME
     *
     * @return the value of HDSD00_05_02.REPORT_NAME
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * HDSD00_05_02.REPORT_NAME
     *
     * @param reportName the value for HDSD00_05_02.REPORT_NAME
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * HDSD00_05_02.REPORT_ID
     *
     * @return the value of HDSD00_05_02.REPORT_ID
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * HDSD00_05_02.REPORT_ID
     *
     * @param reportId the value for HDSD00_05_02.REPORT_ID
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * HDSD00_05_02.REPORT_DEPT
     *
     * @return the value of HDSD00_05_02.REPORT_DEPT
     */
    public String getReportDept() {
        return reportDept;
    }

    /**
     * HDSD00_05_02.REPORT_DEPT
     *
     * @param reportDept the value for HDSD00_05_02.REPORT_DEPT
     */
    public void setReportDept(String reportDept) {
        this.reportDept = reportDept;
    }

    /**
     * HDSD00_05_02.REPORT_DATE
     *
     * @return the value of HDSD00_05_02.REPORT_DATE
     */
    public String getReportDate() {
        return reportDate;
    }

    /**
     * HDSD00_05_02.REPORT_DATE
     *
     * @param reportDate the value for HDSD00_05_02.REPORT_DATE
     */
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * HDSD00_05_02.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_05_02.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_05_02.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_05_02.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_05_02.VISIT_TIMES
     *
     * @return the value of HDSD00_05_02.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_05_02.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_05_02.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_05_02.VISIT_ID
     *
     * @return the value of HDSD00_05_02.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_05_02.VISIT_ID
     *
     * @param visitId the value for HDSD00_05_02.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_05_02.VISIT_DOMAIN
     *
     * @return the value of HDSD00_05_02.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_05_02.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_05_02.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_05_02.PATIENT_TYPE
     *
     * @return the value of HDSD00_05_02.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_05_02.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_05_02.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_05_02.PATIENT_NAME
     *
     * @return the value of HDSD00_05_02.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_05_02.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_05_02.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_05_02.PATIENT_ID
     *
     * @return the value of HDSD00_05_02.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_05_02.PATIENT_ID
     *
     * @param patientId the value for HDSD00_05_02.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_05_02.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_05_02.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_05_02.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_05_02.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_05_02.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_05_02.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_05_02.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_05_02.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_05_02.OBJECTIVE_OBSERVATION
     *
     * @return the value of HDSD00_05_02.OBJECTIVE_OBSERVATION
     */
    public String getObjectiveObservation() {
        return objectiveObservation;
    }

    /**
     * HDSD00_05_02.OBJECTIVE_OBSERVATION
     *
     * @param objectiveObservation the value for HDSD00_05_02.OBJECTIVE_OBSERVATION
     */
    public void setObjectiveObservation(String objectiveObservation) {
        this.objectiveObservation = objectiveObservation;
    }

    /**
     * HDSD00_05_02.LOAD_TYPE
     *
     * @return the value of HDSD00_05_02.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_05_02.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_05_02.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_05_02.INPATIENT
     *
     * @return the value of HDSD00_05_02.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_05_02.INPATIENT
     *
     * @param inpatient the value for HDSD00_05_02.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_05_02.ID_NUM
     *
     * @return the value of HDSD00_05_02.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_05_02.ID_NUM
     *
     * @param idNum the value for HDSD00_05_02.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_05_02.HOSPITAL_NAME
     *
     * @return the value of HDSD00_05_02.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_05_02.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_05_02.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_05_02.HOSPITAL_CODE
     *
     * @return the value of HDSD00_05_02.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_05_02.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_05_02.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_05_02.GENDER_CODE
     *
     * @return the value of HDSD00_05_02.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_05_02.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_05_02.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_05_02.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_05_02.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_05_02.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_05_02.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_05_02.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_05_02.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_05_02.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_05_02.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_05_02.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_05_02.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_05_02.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_05_02.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_05_02.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_05_02.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_05_02.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_05_02.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_05_02.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_05_02.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_05_02.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_05_02.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_05_02.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_05_02.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_05_02.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_05_02.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_05_02.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_05_02.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_05_02.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_05_02.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_05_02.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_05_02.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_05_02.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_05_02.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_05_02.DEPT_NAME
     *
     * @return the value of HDSD00_05_02.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_05_02.DEPT_NAME
     *
     * @param deptName the value for HDSD00_05_02.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_05_02.DEPT_CODE
     *
     * @return the value of HDSD00_05_02.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_05_02.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_05_02.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_05_02.DEPOSITORY_ADDRESS
     *
     * @return the value of HDSD00_05_02.DEPOSITORY_ADDRESS
     */
    public String getDepositoryAddress() {
        return depositoryAddress;
    }

    /**
     * HDSD00_05_02.DEPOSITORY_ADDRESS
     *
     * @param depositoryAddress the value for HDSD00_05_02.DEPOSITORY_ADDRESS
     */
    public void setDepositoryAddress(String depositoryAddress) {
        this.depositoryAddress = depositoryAddress;
    }

    /**
     * HDSD00_05_02.CHIEF_COMPLAINT
     *
     * @return the value of HDSD00_05_02.CHIEF_COMPLAINT
     */
    public String getChiefComplaint() {
        return chiefComplaint;
    }

    /**
     * HDSD00_05_02.CHIEF_COMPLAINT
     *
     * @param chiefComplaint the value for HDSD00_05_02.CHIEF_COMPLAINT
     */
    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    /**
     * HDSD00_05_02.CHECK_NAME
     *
     * @return the value of HDSD00_05_02.CHECK_NAME
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * HDSD00_05_02.CHECK_NAME
     *
     * @param checkName the value for HDSD00_05_02.CHECK_NAME
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * HDSD00_05_02.CHECK_METHOD
     *
     * @return the value of HDSD00_05_02.CHECK_METHOD
     */
    public String getCheckMethod() {
        return checkMethod;
    }

    /**
     * HDSD00_05_02.CHECK_METHOD
     *
     * @param checkMethod the value for HDSD00_05_02.CHECK_METHOD
     */
    public void setCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod;
    }

    /**
     * HDSD00_05_02.CHECK_CODE
     *
     * @return the value of HDSD00_05_02.CHECK_CODE
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * HDSD00_05_02.CHECK_CODE
     *
     * @param checkCode the value for HDSD00_05_02.CHECK_CODE
     */
    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    /**
     * HDSD00_05_02.CHECK_CATEGORY
     *
     * @return the value of HDSD00_05_02.CHECK_CATEGORY
     */
    public String getCheckCategory() {
        return checkCategory;
    }

    /**
     * HDSD00_05_02.CHECK_CATEGORY
     *
     * @param checkCategory the value for HDSD00_05_02.CHECK_CATEGORY
     */
    public void setCheckCategory(String checkCategory) {
        this.checkCategory = checkCategory;
    }

    /**
     * HDSD00_05_02.BED_NO
     *
     * @return the value of HDSD00_05_02.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_05_02.BED_NO
     *
     * @param bedNo the value for HDSD00_05_02.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_05_02.BED_NAME
     *
     * @return the value of HDSD00_05_02.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_05_02.BED_NAME
     *
     * @param bedName the value for HDSD00_05_02.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_05_02.AUDIT_NAME
     *
     * @return the value of HDSD00_05_02.AUDIT_NAME
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * HDSD00_05_02.AUDIT_NAME
     *
     * @param auditName the value for HDSD00_05_02.AUDIT_NAME
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    /**
     * HDSD00_05_02.AUDIT_CODE
     *
     * @return the value of HDSD00_05_02.AUDIT_CODE
     */
    public String getAuditCode() {
        return auditCode;
    }

    /**
     * HDSD00_05_02.AUDIT_CODE
     *
     * @param auditCode the value for HDSD00_05_02.AUDIT_CODE
     */
    public void setAuditCode(String auditCode) {
        this.auditCode = auditCode;
    }

    /**
     * HDSD00_05_02.APPY_ID
     *
     * @return the value of HDSD00_05_02.APPY_ID
     */
    public String getAppyId() {
        return appyId;
    }

    /**
     * HDSD00_05_02.APPY_ID
     *
     * @param appyId the value for HDSD00_05_02.APPY_ID
     */
    public void setAppyId(String appyId) {
        this.appyId = appyId;
    }

    /**
     * HDSD00_05_02.APPLY_ORGAN
     *
     * @return the value of HDSD00_05_02.APPLY_ORGAN
     */
    public String getApplyOrgan() {
        return applyOrgan;
    }

    /**
     * HDSD00_05_02.APPLY_ORGAN
     *
     * @param applyOrgan the value for HDSD00_05_02.APPLY_ORGAN
     */
    public void setApplyOrgan(String applyOrgan) {
        this.applyOrgan = applyOrgan;
    }

    /**
     * HDSD00_05_02.APPLY_DEPT_CODE
     *
     * @return the value of HDSD00_05_02.APPLY_DEPT_CODE
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
     * HDSD00_05_02.APPLY_DEPT_CODE
     *
     * @param applyDeptCode the value for HDSD00_05_02.APPLY_DEPT_CODE
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    /**
     * HDSD00_05_02.APPLY_DEPT
     *
     * @return the value of HDSD00_05_02.APPLY_DEPT
     */
    public String getApplyDept() {
        return applyDept;
    }

    /**
     * HDSD00_05_02.APPLY_DEPT
     *
     * @param applyDept the value for HDSD00_05_02.APPLY_DEPT
     */
    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept;
    }

    /**
     * HDSD00_05_02.APPLY_AGENCYCODE
     *
     * @return the value of HDSD00_05_02.APPLY_AGENCYCODE
     */
    public String getApplyAgencycode() {
        return applyAgencycode;
    }

    /**
     * HDSD00_05_02.APPLY_AGENCYCODE
     *
     * @param applyAgencycode the value for HDSD00_05_02.APPLY_AGENCYCODE
     */
    public void setApplyAgencycode(String applyAgencycode) {
        this.applyAgencycode = applyAgencycode;
    }

    /**
     * HDSD00_05_02.AGE_UNIT
     *
     * @return the value of HDSD00_05_02.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_05_02.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_05_02.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_05_02.AGENCY_NAME
     *
     * @return the value of HDSD00_05_02.AGENCY_NAME
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * HDSD00_05_02.AGENCY_NAME
     *
     * @param agencyName the value for HDSD00_05_02.AGENCY_NAME
     */
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    /**
     * HDSD00_05_02.AGE
     *
     * @return the value of HDSD00_05_02.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_05_02.AGE
     *
     * @param age the value for HDSD00_05_02.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_05_02.VISIT_DATE
     *
     * @return the value of HDSD00_05_02.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_05_02.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_05_02.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_05_02.INTERVENTION
     *
     * @return the value of HDSD00_05_02.INTERVENTION
     */
    public String getIntervention() {
        return intervention;
    }

    /**
     * HDSD00_05_02.INTERVENTION
     *
     * @param intervention the value for HDSD00_05_02.INTERVENTION
     */
    public void setIntervention(String intervention) {
        this.intervention = intervention;
    }

    /**
     * HDSD00_05_02.OPER_NAME
     *
     * @return the value of HDSD00_05_02.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * HDSD00_05_02.OPER_NAME
     *
     * @param operName the value for HDSD00_05_02.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }

    /**
     * HDSD00_05_02.OPER_PART_CODE
     *
     * @return the value of HDSD00_05_02.OPER_PART_CODE
     */
    public String getOperPartCode() {
        return operPartCode;
    }

    /**
     * HDSD00_05_02.OPER_PART_CODE
     *
     * @param operPartCode the value for HDSD00_05_02.OPER_PART_CODE
     */
    public void setOperPartCode(String operPartCode) {
        this.operPartCode = operPartCode;
    }

    /**
     * HDSD00_05_02.OPER_DATE
     *
     * @return the value of HDSD00_05_02.OPER_DATE
     */
    public String getOperDate() {
        return operDate;
    }

    /**
     * HDSD00_05_02.OPER_DATE
     *
     * @param operDate the value for HDSD00_05_02.OPER_DATE
     */
    public void setOperDate(String operDate) {
        this.operDate = operDate;
    }

    /**
     * HDSD00_05_02.OPER_CODE
     *
     * @return the value of HDSD00_05_02.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * HDSD00_05_02.OPER_CODE
     *
     * @param operCode the value for HDSD00_05_02.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * HDSD00_05_02.QUANTY_RESULT_UNIT
     *
     * @return the value of HDSD00_05_02.QUANTY_RESULT_UNIT
     */
    public String getQuantyResultUnit() {
        return quantyResultUnit;
    }

    /**
     * HDSD00_05_02.QUANTY_RESULT_UNIT
     *
     * @param quantyResultUnit the value for HDSD00_05_02.QUANTY_RESULT_UNIT
     */
    public void setQuantyResultUnit(String quantyResultUnit) {
        this.quantyResultUnit = quantyResultUnit;
    }

    /**
     * HDSD00_05_02.QUANTY_RESULT
     *
     * @return the value of HDSD00_05_02.QUANTY_RESULT
     */
    public String getQuantyResult() {
        return quantyResult;
    }

    /**
     * HDSD00_05_02.QUANTY_RESULT
     *
     * @param quantyResult the value for HDSD00_05_02.QUANTY_RESULT
     */
    public void setQuantyResult(String quantyResult) {
        this.quantyResult = quantyResult;
    }

    /**
     * HDSD00_05_02.RESULT_CODE
     *
     * @return the value of HDSD00_05_02.RESULT_CODE
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * HDSD00_05_02.RESULT_CODE
     *
     * @param resultCode the value for HDSD00_05_02.RESULT_CODE
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * HDSD00_05_02.SPECIMEN_FIXATIVE
     *
     * @return the value of HDSD00_05_02.SPECIMEN_FIXATIVE
     */
    public String getSpecimenFixative() {
        return specimenFixative;
    }

    /**
     * HDSD00_05_02.SPECIMEN_FIXATIVE
     *
     * @param specimenFixative the value for HDSD00_05_02.SPECIMEN_FIXATIVE
     */
    public void setSpecimenFixative(String specimenFixative) {
        this.specimenFixative = specimenFixative;
    }

    /**
     * HDSD00_05_02.SPECIMEN_STATUS
     *
     * @return the value of HDSD00_05_02.SPECIMEN_STATUS
     */
    public String getSpecimenStatus() {
        return specimenStatus;
    }

    /**
     * HDSD00_05_02.SPECIMEN_STATUS
     *
     * @param specimenStatus the value for HDSD00_05_02.SPECIMEN_STATUS
     */
    public void setSpecimenStatus(String specimenStatus) {
        this.specimenStatus = specimenStatus;
    }

    /**
     * HDSD00_05_02.SPECIMEN_CATEGORY
     *
     * @return the value of HDSD00_05_02.SPECIMEN_CATEGORY
     */
    public String getSpecimenCategory() {
        return specimenCategory;
    }

    /**
     * HDSD00_05_02.SPECIMEN_CATEGORY
     *
     * @param specimenCategory the value for HDSD00_05_02.SPECIMEN_CATEGORY
     */
    public void setSpecimenCategory(String specimenCategory) {
        this.specimenCategory = specimenCategory;
    }

    /**
     * HDSD00_05_02.RECEIPT_DATE
     *
     * @return the value of HDSD00_05_02.RECEIPT_DATE
     */
    public String getReceiptDate() {
        return receiptDate;
    }

    /**
     * HDSD00_05_02.RECEIPT_DATE
     *
     * @param receiptDate the value for HDSD00_05_02.RECEIPT_DATE
     */
    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    /**
     * HDSD00_05_02.SAMPLE_DATE
     *
     * @return the value of HDSD00_05_02.SAMPLE_DATE
     */
    public String getSampleDate() {
        return sampleDate;
    }

    /**
     * HDSD00_05_02.SAMPLE_DATE
     *
     * @param sampleDate the value for HDSD00_05_02.SAMPLE_DATE
     */
    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
    }

    /**
     * HDSD00_05_02.ITEM_CODE
     *
     * @return the value of HDSD00_05_02.ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * HDSD00_05_02.ITEM_CODE
     *
     * @param itemCode the value for HDSD00_05_02.ITEM_CODE
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * HDSD00_05_02.CHECK_DATE
     *
     * @return the value of HDSD00_05_02.CHECK_DATE
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * HDSD00_05_02.CHECK_DATE
     *
     * @param checkDate the value for HDSD00_05_02.CHECK_DATE
     */
    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * HDSD00_05_02.ANESTH_WESTERN_SIGN
     *
     * @return the value of HDSD00_05_02.ANESTH_WESTERN_SIGN
     */
    public String getAnesthWesternSign() {
        return anesthWesternSign;
    }

    /**
     * HDSD00_05_02.ANESTH_WESTERN_SIGN
     *
     * @param anesthWesternSign the value for HDSD00_05_02.ANESTH_WESTERN_SIGN
     */
    public void setAnesthWesternSign(String anesthWesternSign) {
        this.anesthWesternSign = anesthWesternSign;
    }

    /**
     * HDSD00_05_02.ANES_OBS
     *
     * @return the value of HDSD00_05_02.ANES_OBS
     */
    public String getAnesObs() {
        return anesObs;
    }

    /**
     * HDSD00_05_02.ANES_OBS
     *
     * @param anesObs the value for HDSD00_05_02.ANES_OBS
     */
    public void setAnesObs(String anesObs) {
        this.anesObs = anesObs;
    }

    /**
     * HDSD00_05_02.ANESTH_NAME
     *
     * @return the value of HDSD00_05_02.ANESTH_NAME
     */
    public String getAnesthName() {
        return anesthName;
    }

    /**
     * HDSD00_05_02.ANESTH_NAME
     *
     * @param anesthName the value for HDSD00_05_02.ANESTH_NAME
     */
    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName;
    }

    /**
     * HDSD00_05_02.ANES_METHOD_CODE
     *
     * @return the value of HDSD00_05_02.ANES_METHOD_CODE
     */
    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    /**
     * HDSD00_05_02.ANES_METHOD_CODE
     *
     * @param anesMethodCode the value for HDSD00_05_02.ANES_METHOD_CODE
     */
    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode;
    }

    /**
     * HDSD00_05_02.OPER_NUM
     *
     * @return the value of HDSD00_05_02.OPER_NUM
     */
    public String getOperNum() {
        return operNum;
    }

    /**
     * HDSD00_05_02.OPER_NUM
     *
     * @param operNum the value for HDSD00_05_02.OPER_NUM
     */
    public void setOperNum(String operNum) {
        this.operNum = operNum;
    }

    /**
     * HDSD00_05_02.OPER_METHOD
     *
     * @return the value of HDSD00_05_02.OPER_METHOD
     */
    public String getOperMethod() {
        return operMethod;
    }

    /**
     * HDSD00_05_02.OPER_METHOD
     *
     * @param operMethod the value for HDSD00_05_02.OPER_METHOD
     */
    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod;
    }

    /**
     * HDSD00_05_02.ITEM_NAME
     *
     * @return the value of HDSD00_05_02.ITEM_NAME
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * HDSD00_05_02.ITEM_NAME
     *
     * @param itemName the value for HDSD00_05_02.ITEM_NAME
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * HDSD00_05_02.CHECK_CATEGORY_CODE
     *
     * @return the value of HDSD00_05_02.CHECK_CATEGORY_CODE
     */
    public String getCheckCategoryCode() {
        return checkCategoryCode;
    }

    /**
     * HDSD00_05_02.CHECK_CATEGORY_CODE
     *
     * @param checkCategoryCode the value for HDSD00_05_02.CHECK_CATEGORY_CODE
     */
    public void setCheckCategoryCode(String checkCategoryCode) {
        this.checkCategoryCode = checkCategoryCode;
    }

    /**
     * HDSD00_05_02.GENDER
     *
     * @return the value of HDSD00_05_02.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_05_02.GENDER
     *
     * @param gender the value for HDSD00_05_02.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_05_02.OPER_PART_NAME
     *
     * @return the value of HDSD00_05_02.OPER_PART_NAME
     */
    public String getOperPartName() {
        return operPartName;
    }

    /**
     * HDSD00_05_02.OPER_PART_NAME
     *
     * @param operPartName the value for HDSD00_05_02.OPER_PART_NAME
     */
    public void setOperPartName(String operPartName) {
        this.operPartName = operPartName;
    }

    /**
     * HDSD00_05_02.ANES_METHOD_NAME
     *
     * @return the value of HDSD00_05_02.ANES_METHOD_NAME
     */
    public String getAnesMethodName() {
        return anesMethodName;
    }

    /**
     * HDSD00_05_02.ANES_METHOD_NAME
     *
     * @param anesMethodName the value for HDSD00_05_02.ANES_METHOD_NAME
     */
    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName;
    }

    /**
     * HDSD00_05_02.ANESTH_WESTERN
     *
     * @return the value of HDSD00_05_02.ANESTH_WESTERN
     */
    public String getAnesthWestern() {
        return anesthWestern;
    }

    /**
     * HDSD00_05_02.ANESTH_WESTERN
     *
     * @param anesthWestern the value for HDSD00_05_02.ANESTH_WESTERN
     */
    public void setAnesthWestern(String anesthWestern) {
        this.anesthWestern = anesthWestern;
    }

    /**
     * HDSD00_05_02.RESULT_NAME
     *
     * @return the value of HDSD00_05_02.RESULT_NAME
     */
    public String getResultName() {
        return resultName;
    }

    /**
     * HDSD00_05_02.RESULT_NAME
     *
     * @param resultName the value for HDSD00_05_02.RESULT_NAME
     */
    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getAuditSigndate() {
        return auditSigndate;
    }

    public void setAuditSigndate(String auditSigndate) {
        this.auditSigndate = auditSigndate;
    }

    public String getCheckSigndate() {
        return checkSigndate;
    }

    public void setCheckSigndate(String checkSigndate) {
        this.checkSigndate = checkSigndate;
    }

    public String getTechnicianSigndate() {
        return technicianSigndate;
    }

    public void setTechnicianSigndate(String technicianSigndate) {
        this.technicianSigndate = technicianSigndate;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }
}