package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_05_01")
public class Hdsd000501 extends BaseBean implements Serializable {

    private static final long serialVersionUID = -3546304027068310756L;
    /**
     * HDSD00_05_01.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_05_01.status
     */
    private String status;
    /**
     * HDSD00_05_01.pk
     */
    private Integer pk;
    /**
     * HDSD00_05_01.empi
     */
    private String empi;
    /**
     * HDSD00_05_01.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_05_01.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_05_01.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_05_01.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_05_01.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_05_01.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_05_01.VERSION
     */
    private String version;
    /**
     * HDSD00_05_01.TELEPHONE
     */
    private String telephone;
    /**
     * HDSD00_05_01.TECHNICIAN_NAME
     */
    private String technicianName;
    /**
     * HDSD00_05_01.TECHNICIAN_CODE
     */
    private String technicianCode;
    /**
     * HDSD00_05_01.SPECIMEN_NUMBER
     */
    private String specimenNumber;
    /**
     * HDSD00_05_01.REPOR_CODE
     */
    private String reporCode;
    /**
     * HDSD00_05_01.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_05_01.REPORT_RESULT
     */
    private String reportResult;
    /**
     * HDSD00_05_01.REPORT_REMARK
     */
    private String reportRemark;
    /**
     * HDSD00_05_01.REPORT_NAME
     */
    private String reportName;
    /**
     * HDSD00_05_01.REPORT_ID
     */
    private String reportId;
    /**
     * HDSD00_05_01.REPORT_DEPT
     */
    private String reportDept;
    /**
     * HDSD00_05_01.REPORT_DATE
     */
    private String reportDate;
    /**
     * HDSD00_05_01.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_05_01.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_05_01.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_05_01.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_05_01.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_05_01.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_05_01.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_05_01.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_05_01.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_05_01.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_05_01.INSPECTION_METHOD
     */
    private String inspectionMethod;
    /**
     * HDSD00_05_01.INSPECTION_CATEGORY
     */
    private String inspectionCategory;
    /**
     * HDSD00_05_01.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_05_01.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_05_01.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_05_01.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_05_01.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_05_01.EXAMINER_NAME
     */
    private String examinerName;
    /**
     * HDSD00_05_01.EXAMINER_CODE
     */
    private String examinerCode;
    /**
     * HDSD00_05_01.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_05_01.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_05_01.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_05_01.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_05_01.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_05_01.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_05_01.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_05_01.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_05_01.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_05_01.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_05_01.DEPOSITORY_ADDRESS
     */
    private String depositoryAddress;
    /**
     * HDSD00_05_01.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_05_01.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_05_01.AUDIT_NAME
     */
    private String auditName;
    /**
     * HDSD00_05_01.AUDIT_CODE
     */
    private String auditCode;
    /**
     * HDSD00_05_01.APPY_ID
     */
    private String appyId;
    /**
     * HDSD00_05_01.APPLY_ORGAN
     */
    private String applyOrgan;
    /**
     * HDSD00_05_01.APPLY_DEPT_CODE
     */
    private String applyDeptCode;
    /**
     * HDSD00_05_01.APPLY_DEPT
     */
    private String applyDept;
    /**
     * HDSD00_05_01.APPLY_AGENCYCODE
     */
    private String applyAgencycode;
    /**
     * HDSD00_05_01.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_05_01.AGENCY_NAME
     */
    private String agencyName;
    /**
     * HDSD00_05_01.AGE
     */
    private String age;
    /**
     * HDSD00_05_01.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_05_01.INSPECTION_CATEGORY_CODE
     */
    private String inspectionCategoryCode;
    /**
     * HDSD00_05_01.GENDER
     */
    private String gender;

    private String auditSigndate;

    private String checkSigndate;

    private String technicianSigndate;

    private String applyDate;

    private String inspectName;

    private String inspectCode;

    /**
     * HDSD00_05_01.upload_time
     *
     * @return the value of HDSD00_05_01.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_05_01.upload_time
     *
     * @param uploadTime the value for HDSD00_05_01.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_05_01.status
     *
     * @return the value of HDSD00_05_01.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_05_01.status
     *
     * @param status the value for HDSD00_05_01.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_05_01.pk
     *
     * @return the value of HDSD00_05_01.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_05_01.pk
     *
     * @param pk the value for HDSD00_05_01.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_05_01.empi
     *
     * @return the value of HDSD00_05_01.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_05_01.empi
     *
     * @param empi the value for HDSD00_05_01.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_05_01.ENCOUNTER_ID
     *
     * @return the value of HDSD00_05_01.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_05_01.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_05_01.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_05_01.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_05_01.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_05_01.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_05_01.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_05_01.WARD_NAME
     *
     * @return the value of HDSD00_05_01.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_05_01.WARD_NAME
     *
     * @param wardName the value for HDSD00_05_01.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_05_01.WARD_ID
     *
     * @return the value of HDSD00_05_01.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_05_01.WARD_ID
     *
     * @param wardId the value for HDSD00_05_01.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_05_01.WARDS_NAME
     *
     * @return the value of HDSD00_05_01.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_05_01.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_05_01.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_05_01.WARDS_ID
     *
     * @return the value of HDSD00_05_01.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_05_01.WARDS_ID
     *
     * @param wardsId the value for HDSD00_05_01.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_05_01.VERSION
     *
     * @return the value of HDSD00_05_01.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_05_01.VERSION
     *
     * @param version the value for HDSD00_05_01.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_05_01.TELEPHONE
     *
     * @return the value of HDSD00_05_01.TELEPHONE
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * HDSD00_05_01.TELEPHONE
     *
     * @param telephone the value for HDSD00_05_01.TELEPHONE
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * HDSD00_05_01.TECHNICIAN_NAME
     *
     * @return the value of HDSD00_05_01.TECHNICIAN_NAME
     */
    public String getTechnicianName() {
        return technicianName;
    }

    /**
     * HDSD00_05_01.TECHNICIAN_NAME
     *
     * @param technicianName the value for HDSD00_05_01.TECHNICIAN_NAME
     */
    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName;
    }

    /**
     * HDSD00_05_01.TECHNICIAN_CODE
     *
     * @return the value of HDSD00_05_01.TECHNICIAN_CODE
     */
    public String getTechnicianCode() {
        return technicianCode;
    }

    /**
     * HDSD00_05_01.TECHNICIAN_CODE
     *
     * @param technicianCode the value for HDSD00_05_01.TECHNICIAN_CODE
     */
    public void setTechnicianCode(String technicianCode) {
        this.technicianCode = technicianCode;
    }

    /**
     * HDSD00_05_01.SPECIMEN_NUMBER
     *
     * @return the value of HDSD00_05_01.SPECIMEN_NUMBER
     */
    public String getSpecimenNumber() {
        return specimenNumber;
    }

    /**
     * HDSD00_05_01.SPECIMEN_NUMBER
     *
     * @param specimenNumber the value for HDSD00_05_01.SPECIMEN_NUMBER
     */
    public void setSpecimenNumber(String specimenNumber) {
        this.specimenNumber = specimenNumber;
    }

    /**
     * HDSD00_05_01.REPOR_CODE
     *
     * @return the value of HDSD00_05_01.REPOR_CODE
     */
    public String getReporCode() {
        return reporCode;
    }

    /**
     * HDSD00_05_01.REPOR_CODE
     *
     * @param reporCode the value for HDSD00_05_01.REPOR_CODE
     */
    public void setReporCode(String reporCode) {
        this.reporCode = reporCode;
    }

    /**
     * HDSD00_05_01.REPORT_TITLE
     *
     * @return the value of HDSD00_05_01.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_05_01.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_05_01.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_05_01.REPORT_RESULT
     *
     * @return the value of HDSD00_05_01.REPORT_RESULT
     */
    public String getReportResult() {
        return reportResult;
    }

    /**
     * HDSD00_05_01.REPORT_RESULT
     *
     * @param reportResult the value for HDSD00_05_01.REPORT_RESULT
     */
    public void setReportResult(String reportResult) {
        this.reportResult = reportResult;
    }

    /**
     * HDSD00_05_01.REPORT_REMARK
     *
     * @return the value of HDSD00_05_01.REPORT_REMARK
     */
    public String getReportRemark() {
        return reportRemark;
    }

    /**
     * HDSD00_05_01.REPORT_REMARK
     *
     * @param reportRemark the value for HDSD00_05_01.REPORT_REMARK
     */
    public void setReportRemark(String reportRemark) {
        this.reportRemark = reportRemark;
    }

    /**
     * HDSD00_05_01.REPORT_NAME
     *
     * @return the value of HDSD00_05_01.REPORT_NAME
     */
    public String getReportName() {
        return reportName;
    }

    /**
     * HDSD00_05_01.REPORT_NAME
     *
     * @param reportName the value for HDSD00_05_01.REPORT_NAME
     */
    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    /**
     * HDSD00_05_01.REPORT_ID
     *
     * @return the value of HDSD00_05_01.REPORT_ID
     */
    public String getReportId() {
        return reportId;
    }

    /**
     * HDSD00_05_01.REPORT_ID
     *
     * @param reportId the value for HDSD00_05_01.REPORT_ID
     */
    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * HDSD00_05_01.REPORT_DEPT
     *
     * @return the value of HDSD00_05_01.REPORT_DEPT
     */
    public String getReportDept() {
        return reportDept;
    }

    /**
     * HDSD00_05_01.REPORT_DEPT
     *
     * @param reportDept the value for HDSD00_05_01.REPORT_DEPT
     */
    public void setReportDept(String reportDept) {
        this.reportDept = reportDept;
    }

    /**
     * HDSD00_05_01.REPORT_DATE
     *
     * @return the value of HDSD00_05_01.REPORT_DATE
     */
    public String getReportDate() {
        return reportDate;
    }

    /**
     * HDSD00_05_01.REPORT_DATE
     *
     * @param reportDate the value for HDSD00_05_01.REPORT_DATE
     */
    public void setReportDate(String reportDate) {
        this.reportDate = reportDate;
    }

    /**
     * HDSD00_05_01.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_05_01.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_05_01.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_05_01.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_05_01.VISIT_TIMES
     *
     * @return the value of HDSD00_05_01.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_05_01.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_05_01.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_05_01.VISIT_ID
     *
     * @return the value of HDSD00_05_01.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_05_01.VISIT_ID
     *
     * @param visitId the value for HDSD00_05_01.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_05_01.VISIT_DOMAIN
     *
     * @return the value of HDSD00_05_01.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_05_01.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_05_01.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_05_01.PATIENT_TYPE
     *
     * @return the value of HDSD00_05_01.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_05_01.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_05_01.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_05_01.PATIENT_NAME
     *
     * @return the value of HDSD00_05_01.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_05_01.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_05_01.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_05_01.PATIENT_ID
     *
     * @return the value of HDSD00_05_01.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_05_01.PATIENT_ID
     *
     * @param patientId the value for HDSD00_05_01.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_05_01.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_05_01.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_05_01.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_05_01.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_05_01.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_05_01.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_05_01.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_05_01.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_05_01.LOAD_TYPE
     *
     * @return the value of HDSD00_05_01.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_05_01.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_05_01.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_05_01.INSPECTION_METHOD
     *
     * @return the value of HDSD00_05_01.INSPECTION_METHOD
     */
    public String getInspectionMethod() {
        return inspectionMethod;
    }

    /**
     * HDSD00_05_01.INSPECTION_METHOD
     *
     * @param inspectionMethod the value for HDSD00_05_01.INSPECTION_METHOD
     */
    public void setInspectionMethod(String inspectionMethod) {
        this.inspectionMethod = inspectionMethod;
    }

    /**
     * HDSD00_05_01.INSPECTION_CATEGORY
     *
     * @return the value of HDSD00_05_01.INSPECTION_CATEGORY
     */
    public String getInspectionCategory() {
        return inspectionCategory;
    }

    /**
     * HDSD00_05_01.INSPECTION_CATEGORY
     *
     * @param inspectionCategory the value for HDSD00_05_01.INSPECTION_CATEGORY
     */
    public void setInspectionCategory(String inspectionCategory) {
        this.inspectionCategory = inspectionCategory;
    }

    /**
     * HDSD00_05_01.INPATIENT
     *
     * @return the value of HDSD00_05_01.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_05_01.INPATIENT
     *
     * @param inpatient the value for HDSD00_05_01.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_05_01.ID_NUM
     *
     * @return the value of HDSD00_05_01.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_05_01.ID_NUM
     *
     * @param idNum the value for HDSD00_05_01.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_05_01.HOSPITAL_NAME
     *
     * @return the value of HDSD00_05_01.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_05_01.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_05_01.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_05_01.HOSPITAL_CODE
     *
     * @return the value of HDSD00_05_01.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_05_01.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_05_01.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_05_01.GENDER_CODE
     *
     * @return the value of HDSD00_05_01.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_05_01.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_05_01.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_05_01.EXAMINER_NAME
     *
     * @return the value of HDSD00_05_01.EXAMINER_NAME
     */
    public String getExaminerName() {
        return examinerName;
    }

    /**
     * HDSD00_05_01.EXAMINER_NAME
     *
     * @param examinerName the value for HDSD00_05_01.EXAMINER_NAME
     */
    public void setExaminerName(String examinerName) {
        this.examinerName = examinerName;
    }

    /**
     * HDSD00_05_01.EXAMINER_CODE
     *
     * @return the value of HDSD00_05_01.EXAMINER_CODE
     */
    public String getExaminerCode() {
        return examinerCode;
    }

    /**
     * HDSD00_05_01.EXAMINER_CODE
     *
     * @param examinerCode the value for HDSD00_05_01.EXAMINER_CODE
     */
    public void setExaminerCode(String examinerCode) {
        this.examinerCode = examinerCode;
    }

    /**
     * HDSD00_05_01.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_05_01.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_05_01.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_05_01.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_05_01.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_05_01.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_05_01.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_05_01.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_05_01.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_05_01.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_05_01.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_05_01.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_05_01.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_05_01.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_05_01.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_05_01.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_05_01.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_05_01.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_05_01.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_05_01.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_05_01.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_05_01.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_05_01.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_05_01.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_05_01.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_05_01.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_05_01.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_05_01.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_05_01.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_05_01.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_05_01.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_05_01.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_05_01.DEPT_NAME
     *
     * @return the value of HDSD00_05_01.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_05_01.DEPT_NAME
     *
     * @param deptName the value for HDSD00_05_01.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_05_01.DEPT_CODE
     *
     * @return the value of HDSD00_05_01.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_05_01.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_05_01.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_05_01.DEPOSITORY_ADDRESS
     *
     * @return the value of HDSD00_05_01.DEPOSITORY_ADDRESS
     */
    public String getDepositoryAddress() {
        return depositoryAddress;
    }

    /**
     * HDSD00_05_01.DEPOSITORY_ADDRESS
     *
     * @param depositoryAddress the value for HDSD00_05_01.DEPOSITORY_ADDRESS
     */
    public void setDepositoryAddress(String depositoryAddress) {
        this.depositoryAddress = depositoryAddress;
    }

    /**
     * HDSD00_05_01.BED_NO
     *
     * @return the value of HDSD00_05_01.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_05_01.BED_NO
     *
     * @param bedNo the value for HDSD00_05_01.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_05_01.BED_NAME
     *
     * @return the value of HDSD00_05_01.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_05_01.BED_NAME
     *
     * @param bedName the value for HDSD00_05_01.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_05_01.AUDIT_NAME
     *
     * @return the value of HDSD00_05_01.AUDIT_NAME
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * HDSD00_05_01.AUDIT_NAME
     *
     * @param auditName the value for HDSD00_05_01.AUDIT_NAME
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    /**
     * HDSD00_05_01.AUDIT_CODE
     *
     * @return the value of HDSD00_05_01.AUDIT_CODE
     */
    public String getAuditCode() {
        return auditCode;
    }

    /**
     * HDSD00_05_01.AUDIT_CODE
     *
     * @param auditCode the value for HDSD00_05_01.AUDIT_CODE
     */
    public void setAuditCode(String auditCode) {
        this.auditCode = auditCode;
    }

    /**
     * HDSD00_05_01.APPY_ID
     *
     * @return the value of HDSD00_05_01.APPY_ID
     */
    public String getAppyId() {
        return appyId;
    }

    /**
     * HDSD00_05_01.APPY_ID
     *
     * @param appyId the value for HDSD00_05_01.APPY_ID
     */
    public void setAppyId(String appyId) {
        this.appyId = appyId;
    }

    /**
     * HDSD00_05_01.APPLY_ORGAN
     *
     * @return the value of HDSD00_05_01.APPLY_ORGAN
     */
    public String getApplyOrgan() {
        return applyOrgan;
    }

    /**
     * HDSD00_05_01.APPLY_ORGAN
     *
     * @param applyOrgan the value for HDSD00_05_01.APPLY_ORGAN
     */
    public void setApplyOrgan(String applyOrgan) {
        this.applyOrgan = applyOrgan;
    }

    /**
     * HDSD00_05_01.APPLY_DEPT_CODE
     *
     * @return the value of HDSD00_05_01.APPLY_DEPT_CODE
     */
    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    /**
     * HDSD00_05_01.APPLY_DEPT_CODE
     *
     * @param applyDeptCode the value for HDSD00_05_01.APPLY_DEPT_CODE
     */
    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode;
    }

    /**
     * HDSD00_05_01.APPLY_DEPT
     *
     * @return the value of HDSD00_05_01.APPLY_DEPT
     */
    public String getApplyDept() {
        return applyDept;
    }

    /**
     * HDSD00_05_01.APPLY_DEPT
     *
     * @param applyDept the value for HDSD00_05_01.APPLY_DEPT
     */
    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept;
    }

    /**
     * HDSD00_05_01.APPLY_AGENCYCODE
     *
     * @return the value of HDSD00_05_01.APPLY_AGENCYCODE
     */
    public String getApplyAgencycode() {
        return applyAgencycode;
    }

    /**
     * HDSD00_05_01.APPLY_AGENCYCODE
     *
     * @param applyAgencycode the value for HDSD00_05_01.APPLY_AGENCYCODE
     */
    public void setApplyAgencycode(String applyAgencycode) {
        this.applyAgencycode = applyAgencycode;
    }

    /**
     * HDSD00_05_01.AGE_UNIT
     *
     * @return the value of HDSD00_05_01.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_05_01.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_05_01.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_05_01.AGENCY_NAME
     *
     * @return the value of HDSD00_05_01.AGENCY_NAME
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * HDSD00_05_01.AGENCY_NAME
     *
     * @param agencyName the value for HDSD00_05_01.AGENCY_NAME
     */
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    /**
     * HDSD00_05_01.AGE
     *
     * @return the value of HDSD00_05_01.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_05_01.AGE
     *
     * @param age the value for HDSD00_05_01.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_05_01.VISIT_DATE
     *
     * @return the value of HDSD00_05_01.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_05_01.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_05_01.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_05_01.INSPECTION_CATEGORY_CODE
     *
     * @return the value of HDSD00_05_01.INSPECTION_CATEGORY_CODE
     */
    public String getInspectionCategoryCode() {
        return inspectionCategoryCode;
    }

    /**
     * HDSD00_05_01.INSPECTION_CATEGORY_CODE
     *
     * @param inspectionCategoryCode the value for HDSD00_05_01.INSPECTION_CATEGORY_CODE
     */
    public void setInspectionCategoryCode(String inspectionCategoryCode) {
        this.inspectionCategoryCode = inspectionCategoryCode;
    }

    /**
     * HDSD00_05_01.GENDER
     *
     * @return the value of HDSD00_05_01.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_05_01.GENDER
     *
     * @param gender the value for HDSD00_05_01.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
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

    public String getInspectName() {
        return inspectName;
    }

    public void setInspectName(String inspectName) {
        this.inspectName = inspectName;
    }

    public String getInspectCode() {
        return inspectCode;
    }

    public void setInspectCode(String inspectCode) {
        this.inspectCode = inspectCode;
    }
}