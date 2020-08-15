package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_14_12")
public class Hdsd001412 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_14_12
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_14_12.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_14_12.status
     */
    private String status;
    /**
     * HDSD00_14_12.pk
     */
    private Integer pk;
    /**
     * HDSD00_14_12.empi
     */
    private String empi;
    /**
     * HDSD00_14_12.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_14_12.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_14_12.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_14_12.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_14_12.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_14_12.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_14_12.VERSION
     */
    private String version;
    /**
     * HDSD00_14_12.TPC_OPER_NAME
     */
    private String tpcOperName;
    /**
     * HDSD00_14_12.TPC_OPER_CODE
     */
    private String tpcOperCode;
    /**
     * HDSD00_14_12.TPC_ANES_NAME
     */
    private String tpcAnesName;
    /**
     * HDSD00_14_12.TPC_ANES_CODE
     */
    private String tpcAnesCode;
    /**
     * HDSD00_14_12.TARGET_NAME
     */
    private String targetName;
    /**
     * HDSD00_14_12.SURGEON_SIGNDATE
     */
    private String surgeonSigndate;
    /**
     * HDSD00_14_12.SURGEON_NAME
     */
    private String surgeonName;
    /**
     * HDSD00_14_12.SURGEON_CODE
     */
    private String surgeonCode;
    /**
     * HDSD00_14_12.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_14_12.PAT_CATEGORY_CODE
     */
    private String patCategoryCode;
    /**
     * HDSD00_14_12.PAT_CATEGORY
     */
    private String patCategory;
    /**
     * HDSD00_14_12.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_14_12.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_14_12.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_14_12.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_14_12.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_14_12.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_14_12.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_14_12.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_14_12.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_14_12.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_14_12.OPER_NAME
     */
    private String operName;
    /**
     * HDSD00_14_12.OPER_DATE
     */
    private String operDate;
    /**
     * HDSD00_14_12.OPER_CODE
     */
    private String operCode;
    /**
     * HDSD00_14_12.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_14_12.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_14_12.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_14_12.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_14_12.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_14_12.HOST_NAME
     */
    private String hostName;
    /**
     * HDSD00_14_12.HOST_CODE
     */
    private String hostCode;
    /**
     * HDSD00_14_12.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_14_12.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_14_12.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_14_12.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_14_12.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_14_12.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_14_12.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_14_12.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_14_12.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_14_12.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_14_12.DOCTOR_SIGNDATE
     */
    private String doctorSigndate;
    /**
     * HDSD00_14_12.DOCTOR_NAME
     */
    private String doctorName;
    /**
     * HDSD00_14_12.DOCTOR_CODE
     */
    private String doctorCode;
    /**
     * HDSD00_14_12.DISCUSSION_PLACE
     */
    private String discussionPlace;
    /**
     * HDSD00_14_12.DISCUSSION_OPINION
     */
    private String discussionOpinion;
    /**
     * HDSD00_14_12.DISCUSSION_LIST
     */
    private String discussionList;
    /**
     * HDSD00_14_12.DISCUSSION_CONCLUSION
     */
    private String discussionConclusion;
    /**
     * HDSD00_14_12.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_14_12.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_14_12.DATEOF_DISCUSSION
     */
    private String dateofDiscussion;
    /**
     * HDSD00_14_12.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_14_12.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_14_12.ANES_CODE
     */
    private String anesCode;
    /**
     * HDSD00_14_12.ANESTH_SIGNDATE
     */
    private String anesthSigndate;
    /**
     * HDSD00_14_12.ANESTH_NAME
     */
    private String anesthName;
    /**
     * HDSD00_14_12.ANESTH_CODE
     */
    private String anesthCode;
    /**
     * HDSD00_14_12.AGE
     */
    private String age;
    /**
     * HDSD00_14_12.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_14_12.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_14_12.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_14_12.ADMISSION_DATE
     */
    private String admissionDate;
    /**
     * HDSD00_14_12.GENDER
     */
    private String gender;
    /**
     * HDSD00_14_12.ANES_NAME
     */
    private String anesName;
    /**
     * HDSD00_14_12.OPER_KEY_POINT
     */
    private String operKeyPoint;
    /**
     * HDSD00_14_12.PRE_PREPARATION
     */
    private String prePreparation;
    /**
     * HDSD00_14_12.OPER_SURGICAL
     */
    private String operSurgical;
    /**
     * HDSD00_14_12.SURGICAL_PROGRAM
     */
    private String surgicalProgram;
    /**
     * HDSD00_14_12.NEEDING_ATTENTION
     */
    private String needingAttention;

    /**
     * HDSD00_14_12.upload_time
     *
     * @return the value of HDSD00_14_12.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_14_12.upload_time
     *
     * @param uploadTime the value for HDSD00_14_12.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_14_12.status
     *
     * @return the value of HDSD00_14_12.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_14_12.status
     *
     * @param status the value for HDSD00_14_12.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_14_12.pk
     *
     * @return the value of HDSD00_14_12.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_14_12.pk
     *
     * @param pk the value for HDSD00_14_12.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_14_12.empi
     *
     * @return the value of HDSD00_14_12.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_14_12.empi
     *
     * @param empi the value for HDSD00_14_12.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_14_12.ENCOUNTER_ID
     *
     * @return the value of HDSD00_14_12.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_14_12.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_14_12.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_14_12.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_14_12.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_14_12.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_14_12.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_14_12.WARD_NAME
     *
     * @return the value of HDSD00_14_12.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_14_12.WARD_NAME
     *
     * @param wardName the value for HDSD00_14_12.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_14_12.WARD_ID
     *
     * @return the value of HDSD00_14_12.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_14_12.WARD_ID
     *
     * @param wardId the value for HDSD00_14_12.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_14_12.WARDS_NAME
     *
     * @return the value of HDSD00_14_12.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_14_12.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_14_12.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_14_12.WARDS_ID
     *
     * @return the value of HDSD00_14_12.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_14_12.WARDS_ID
     *
     * @param wardsId the value for HDSD00_14_12.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_14_12.VERSION
     *
     * @return the value of HDSD00_14_12.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_14_12.VERSION
     *
     * @param version the value for HDSD00_14_12.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_14_12.TPC_OPER_NAME
     *
     * @return the value of HDSD00_14_12.TPC_OPER_NAME
     */
    public String getTpcOperName() {
        return tpcOperName;
    }

    /**
     * HDSD00_14_12.TPC_OPER_NAME
     *
     * @param tpcOperName the value for HDSD00_14_12.TPC_OPER_NAME
     */
    public void setTpcOperName(String tpcOperName) {
        this.tpcOperName = tpcOperName;
    }

    /**
     * HDSD00_14_12.TPC_OPER_CODE
     *
     * @return the value of HDSD00_14_12.TPC_OPER_CODE
     */
    public String getTpcOperCode() {
        return tpcOperCode;
    }

    /**
     * HDSD00_14_12.TPC_OPER_CODE
     *
     * @param tpcOperCode the value for HDSD00_14_12.TPC_OPER_CODE
     */
    public void setTpcOperCode(String tpcOperCode) {
        this.tpcOperCode = tpcOperCode;
    }

    /**
     * HDSD00_14_12.TPC_ANES_NAME
     *
     * @return the value of HDSD00_14_12.TPC_ANES_NAME
     */
    public String getTpcAnesName() {
        return tpcAnesName;
    }

    /**
     * HDSD00_14_12.TPC_ANES_NAME
     *
     * @param tpcAnesName the value for HDSD00_14_12.TPC_ANES_NAME
     */
    public void setTpcAnesName(String tpcAnesName) {
        this.tpcAnesName = tpcAnesName;
    }

    /**
     * HDSD00_14_12.TPC_ANES_CODE
     *
     * @return the value of HDSD00_14_12.TPC_ANES_CODE
     */
    public String getTpcAnesCode() {
        return tpcAnesCode;
    }

    /**
     * HDSD00_14_12.TPC_ANES_CODE
     *
     * @param tpcAnesCode the value for HDSD00_14_12.TPC_ANES_CODE
     */
    public void setTpcAnesCode(String tpcAnesCode) {
        this.tpcAnesCode = tpcAnesCode;
    }

    /**
     * HDSD00_14_12.TARGET_NAME
     *
     * @return the value of HDSD00_14_12.TARGET_NAME
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * HDSD00_14_12.TARGET_NAME
     *
     * @param targetName the value for HDSD00_14_12.TARGET_NAME
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * HDSD00_14_12.SURGEON_SIGNDATE
     *
     * @return the value of HDSD00_14_12.SURGEON_SIGNDATE
     */
    public String getSurgeonSigndate() {
        return surgeonSigndate;
    }

    /**
     * HDSD00_14_12.SURGEON_SIGNDATE
     *
     * @param surgeonSigndate the value for HDSD00_14_12.SURGEON_SIGNDATE
     */
    public void setSurgeonSigndate(String surgeonSigndate) {
        this.surgeonSigndate = surgeonSigndate;
    }

    /**
     * HDSD00_14_12.SURGEON_NAME
     *
     * @return the value of HDSD00_14_12.SURGEON_NAME
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * HDSD00_14_12.SURGEON_NAME
     *
     * @param surgeonName the value for HDSD00_14_12.SURGEON_NAME
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }

    /**
     * HDSD00_14_12.SURGEON_CODE
     *
     * @return the value of HDSD00_14_12.SURGEON_CODE
     */
    public String getSurgeonCode() {
        return surgeonCode;
    }

    /**
     * HDSD00_14_12.SURGEON_CODE
     *
     * @param surgeonCode the value for HDSD00_14_12.SURGEON_CODE
     */
    public void setSurgeonCode(String surgeonCode) {
        this.surgeonCode = surgeonCode;
    }

    /**
     * HDSD00_14_12.REPORT_TITLE
     *
     * @return the value of HDSD00_14_12.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_14_12.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_14_12.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_14_12.PAT_CATEGORY_CODE
     *
     * @return the value of HDSD00_14_12.PAT_CATEGORY_CODE
     */
    public String getPatCategoryCode() {
        return patCategoryCode;
    }

    /**
     * HDSD00_14_12.PAT_CATEGORY_CODE
     *
     * @param patCategoryCode the value for HDSD00_14_12.PAT_CATEGORY_CODE
     */
    public void setPatCategoryCode(String patCategoryCode) {
        this.patCategoryCode = patCategoryCode;
    }

    /**
     * HDSD00_14_12.PAT_CATEGORY
     *
     * @return the value of HDSD00_14_12.PAT_CATEGORY
     */
    public String getPatCategory() {
        return patCategory;
    }

    /**
     * HDSD00_14_12.PAT_CATEGORY
     *
     * @param patCategory the value for HDSD00_14_12.PAT_CATEGORY
     */
    public void setPatCategory(String patCategory) {
        this.patCategory = patCategory;
    }

    /**
     * HDSD00_14_12.PATIENT_NAME
     *
     * @return the value of HDSD00_14_12.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_14_12.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_14_12.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_14_12.PATIENT_TYPE
     *
     * @return the value of HDSD00_14_12.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_14_12.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_14_12.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_14_12.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_14_12.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_14_12.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_14_12.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_14_12.VISIT_TIMES
     *
     * @return the value of HDSD00_14_12.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_14_12.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_14_12.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_14_12.VISIT_ID
     *
     * @return the value of HDSD00_14_12.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_14_12.VISIT_ID
     *
     * @param visitId the value for HDSD00_14_12.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_14_12.VISIT_DOMAIN
     *
     * @return the value of HDSD00_14_12.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_14_12.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_14_12.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_14_12.PATIENT_ID
     *
     * @return the value of HDSD00_14_12.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_14_12.PATIENT_ID
     *
     * @param patientId the value for HDSD00_14_12.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_14_12.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_14_12.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_14_12.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_14_12.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_14_12.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_14_12.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_14_12.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_14_12.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_14_12.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_14_12.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_14_12.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_14_12.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_14_12.OPER_NAME
     *
     * @return the value of HDSD00_14_12.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * HDSD00_14_12.OPER_NAME
     *
     * @param operName the value for HDSD00_14_12.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }

    /**
     * HDSD00_14_12.OPER_DATE
     *
     * @return the value of HDSD00_14_12.OPER_DATE
     */
    public String getOperDate() {
        return operDate;
    }

    /**
     * HDSD00_14_12.OPER_DATE
     *
     * @param operDate the value for HDSD00_14_12.OPER_DATE
     */
    public void setOperDate(String operDate) {
        this.operDate = operDate;
    }

    /**
     * HDSD00_14_12.OPER_CODE
     *
     * @return the value of HDSD00_14_12.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * HDSD00_14_12.OPER_CODE
     *
     * @param operCode the value for HDSD00_14_12.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * HDSD00_14_12.LOAD_TYPE
     *
     * @return the value of HDSD00_14_12.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_14_12.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_14_12.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_14_12.HOSPITAL_NAME
     *
     * @return the value of HDSD00_14_12.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_14_12.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_14_12.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_14_12.HOSPITAL_CODE
     *
     * @return the value of HDSD00_14_12.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_14_12.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_14_12.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_14_12.INPATIENT
     *
     * @return the value of HDSD00_14_12.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_14_12.INPATIENT
     *
     * @param inpatient the value for HDSD00_14_12.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_14_12.ID_NUM
     *
     * @return the value of HDSD00_14_12.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_14_12.ID_NUM
     *
     * @param idNum the value for HDSD00_14_12.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_14_12.HOST_NAME
     *
     * @return the value of HDSD00_14_12.HOST_NAME
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * HDSD00_14_12.HOST_NAME
     *
     * @param hostName the value for HDSD00_14_12.HOST_NAME
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * HDSD00_14_12.HOST_CODE
     *
     * @return the value of HDSD00_14_12.HOST_CODE
     */
    public String getHostCode() {
        return hostCode;
    }

    /**
     * HDSD00_14_12.HOST_CODE
     *
     * @param hostCode the value for HDSD00_14_12.HOST_CODE
     */
    public void setHostCode(String hostCode) {
        this.hostCode = hostCode;
    }

    /**
     * HDSD00_14_12.GENDER_CODE
     *
     * @return the value of HDSD00_14_12.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_14_12.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_14_12.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_14_12.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_14_12.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_14_12.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_14_12.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_14_12.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_14_12.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_14_12.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_14_12.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_14_12.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_14_12.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_14_12.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_14_12.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_14_12.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_14_12.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_14_12.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_14_12.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_14_12.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_14_12.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_14_12.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_14_12.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_14_12.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_14_12.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_14_12.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_14_12.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_14_12.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_14_12.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_14_12.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_14_12.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_14_12.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_14_12.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_14_12.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_14_12.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_14_12.DOC_AUTHOR
     *
     * @return the value of HDSD00_14_12.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_14_12.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_14_12.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_14_12.DOCTOR_SIGNDATE
     *
     * @return the value of HDSD00_14_12.DOCTOR_SIGNDATE
     */
    public String getDoctorSigndate() {
        return doctorSigndate;
    }

    /**
     * HDSD00_14_12.DOCTOR_SIGNDATE
     *
     * @param doctorSigndate the value for HDSD00_14_12.DOCTOR_SIGNDATE
     */
    public void setDoctorSigndate(String doctorSigndate) {
        this.doctorSigndate = doctorSigndate;
    }

    /**
     * HDSD00_14_12.DOCTOR_NAME
     *
     * @return the value of HDSD00_14_12.DOCTOR_NAME
     */
    public String getDoctorName() {
        return doctorName;
    }

    /**
     * HDSD00_14_12.DOCTOR_NAME
     *
     * @param doctorName the value for HDSD00_14_12.DOCTOR_NAME
     */
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    /**
     * HDSD00_14_12.DOCTOR_CODE
     *
     * @return the value of HDSD00_14_12.DOCTOR_CODE
     */
    public String getDoctorCode() {
        return doctorCode;
    }

    /**
     * HDSD00_14_12.DOCTOR_CODE
     *
     * @param doctorCode the value for HDSD00_14_12.DOCTOR_CODE
     */
    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    /**
     * HDSD00_14_12.DISCUSSION_PLACE
     *
     * @return the value of HDSD00_14_12.DISCUSSION_PLACE
     */
    public String getDiscussionPlace() {
        return discussionPlace;
    }

    /**
     * HDSD00_14_12.DISCUSSION_PLACE
     *
     * @param discussionPlace the value for HDSD00_14_12.DISCUSSION_PLACE
     */
    public void setDiscussionPlace(String discussionPlace) {
        this.discussionPlace = discussionPlace;
    }

    /**
     * HDSD00_14_12.DISCUSSION_OPINION
     *
     * @return the value of HDSD00_14_12.DISCUSSION_OPINION
     */
    public String getDiscussionOpinion() {
        return discussionOpinion;
    }

    /**
     * HDSD00_14_12.DISCUSSION_OPINION
     *
     * @param discussionOpinion the value for HDSD00_14_12.DISCUSSION_OPINION
     */
    public void setDiscussionOpinion(String discussionOpinion) {
        this.discussionOpinion = discussionOpinion;
    }

    /**
     * HDSD00_14_12.DISCUSSION_LIST
     *
     * @return the value of HDSD00_14_12.DISCUSSION_LIST
     */
    public String getDiscussionList() {
        return discussionList;
    }

    /**
     * HDSD00_14_12.DISCUSSION_LIST
     *
     * @param discussionList the value for HDSD00_14_12.DISCUSSION_LIST
     */
    public void setDiscussionList(String discussionList) {
        this.discussionList = discussionList;
    }

    /**
     * HDSD00_14_12.DISCUSSION_CONCLUSION
     *
     * @return the value of HDSD00_14_12.DISCUSSION_CONCLUSION
     */
    public String getDiscussionConclusion() {
        return discussionConclusion;
    }

    /**
     * HDSD00_14_12.DISCUSSION_CONCLUSION
     *
     * @param discussionConclusion the value for HDSD00_14_12.DISCUSSION_CONCLUSION
     */
    public void setDiscussionConclusion(String discussionConclusion) {
        this.discussionConclusion = discussionConclusion;
    }

    /**
     * HDSD00_14_12.DEPT_NAME
     *
     * @return the value of HDSD00_14_12.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_14_12.DEPT_NAME
     *
     * @param deptName the value for HDSD00_14_12.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_14_12.DEPT_CODE
     *
     * @return the value of HDSD00_14_12.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_14_12.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_14_12.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_14_12.DATEOF_DISCUSSION
     *
     * @return the value of HDSD00_14_12.DATEOF_DISCUSSION
     */
    public String getDateofDiscussion() {
        return dateofDiscussion;
    }

    /**
     * HDSD00_14_12.DATEOF_DISCUSSION
     *
     * @param dateofDiscussion the value for HDSD00_14_12.DATEOF_DISCUSSION
     */
    public void setDateofDiscussion(String dateofDiscussion) {
        this.dateofDiscussion = dateofDiscussion;
    }

    /**
     * HDSD00_14_12.BED_NO
     *
     * @return the value of HDSD00_14_12.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_14_12.BED_NO
     *
     * @param bedNo the value for HDSD00_14_12.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_14_12.BED_NAME
     *
     * @return the value of HDSD00_14_12.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_14_12.BED_NAME
     *
     * @param bedName the value for HDSD00_14_12.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_14_12.ANES_CODE
     *
     * @return the value of HDSD00_14_12.ANES_CODE
     */
    public String getAnesCode() {
        return anesCode;
    }

    /**
     * HDSD00_14_12.ANES_CODE
     *
     * @param anesCode the value for HDSD00_14_12.ANES_CODE
     */
    public void setAnesCode(String anesCode) {
        this.anesCode = anesCode;
    }

    /**
     * HDSD00_14_12.ANESTH_SIGNDATE
     *
     * @return the value of HDSD00_14_12.ANESTH_SIGNDATE
     */
    public String getAnesthSigndate() {
        return anesthSigndate;
    }

    /**
     * HDSD00_14_12.ANESTH_SIGNDATE
     *
     * @param anesthSigndate the value for HDSD00_14_12.ANESTH_SIGNDATE
     */
    public void setAnesthSigndate(String anesthSigndate) {
        this.anesthSigndate = anesthSigndate;
    }

    /**
     * HDSD00_14_12.ANESTH_NAME
     *
     * @return the value of HDSD00_14_12.ANESTH_NAME
     */
    public String getAnesthName() {
        return anesthName;
    }

    /**
     * HDSD00_14_12.ANESTH_NAME
     *
     * @param anesthName the value for HDSD00_14_12.ANESTH_NAME
     */
    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName;
    }

    /**
     * HDSD00_14_12.ANESTH_CODE
     *
     * @return the value of HDSD00_14_12.ANESTH_CODE
     */
    public String getAnesthCode() {
        return anesthCode;
    }

    /**
     * HDSD00_14_12.ANESTH_CODE
     *
     * @param anesthCode the value for HDSD00_14_12.ANESTH_CODE
     */
    public void setAnesthCode(String anesthCode) {
        this.anesthCode = anesthCode;
    }

    /**
     * HDSD00_14_12.AGE
     *
     * @return the value of HDSD00_14_12.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_14_12.AGE
     *
     * @param age the value for HDSD00_14_12.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_14_12.AGE_UNIT
     *
     * @return the value of HDSD00_14_12.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_14_12.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_14_12.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_14_12.VISIT_DATE
     *
     * @return the value of HDSD00_14_12.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_14_12.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_14_12.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_14_12.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_14_12.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_14_12.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_14_12.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_14_12.ADMISSION_DATE
     *
     * @return the value of HDSD00_14_12.ADMISSION_DATE
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * HDSD00_14_12.ADMISSION_DATE
     *
     * @param admissionDate the value for HDSD00_14_12.ADMISSION_DATE
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    /**
     * HDSD00_14_12.GENDER
     *
     * @return the value of HDSD00_14_12.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_14_12.GENDER
     *
     * @param gender the value for HDSD00_14_12.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_14_12.ANES_NAME
     *
     * @return the value of HDSD00_14_12.ANES_NAME
     */
    public String getAnesName() {
        return anesName;
    }

    /**
     * HDSD00_14_12.ANES_NAME
     *
     * @param anesName the value for HDSD00_14_12.ANES_NAME
     */
    public void setAnesName(String anesName) {
        this.anesName = anesName;
    }

    /**
     * HDSD00_14_12.OPER_KEY_POINT
     *
     * @return the value of HDSD00_14_12.OPER_KEY_POINT
     */
    public String getOperKeyPoint() {
        return operKeyPoint;
    }

    /**
     * HDSD00_14_12.OPER_KEY_POINT
     *
     * @param operKeyPoint the value for HDSD00_14_12.OPER_KEY_POINT
     */
    public void setOperKeyPoint(String operKeyPoint) {
        this.operKeyPoint = operKeyPoint;
    }

    /**
     * HDSD00_14_12.PRE_PREPARATION
     *
     * @return the value of HDSD00_14_12.PRE_PREPARATION
     */
    public String getPrePreparation() {
        return prePreparation;
    }

    /**
     * HDSD00_14_12.PRE_PREPARATION
     *
     * @param prePreparation the value for HDSD00_14_12.PRE_PREPARATION
     */
    public void setPrePreparation(String prePreparation) {
        this.prePreparation = prePreparation;
    }

    /**
     * HDSD00_14_12.OPER_SURGICAL
     *
     * @return the value of HDSD00_14_12.OPER_SURGICAL
     */
    public String getOperSurgical() {
        return operSurgical;
    }

    /**
     * HDSD00_14_12.OPER_SURGICAL
     *
     * @param operSurgical the value for HDSD00_14_12.OPER_SURGICAL
     */
    public void setOperSurgical(String operSurgical) {
        this.operSurgical = operSurgical;
    }

    /**
     * HDSD00_14_12.SURGICAL_PROGRAM
     *
     * @return the value of HDSD00_14_12.SURGICAL_PROGRAM
     */
    public String getSurgicalProgram() {
        return surgicalProgram;
    }

    /**
     * HDSD00_14_12.SURGICAL_PROGRAM
     *
     * @param surgicalProgram the value for HDSD00_14_12.SURGICAL_PROGRAM
     */
    public void setSurgicalProgram(String surgicalProgram) {
        this.surgicalProgram = surgicalProgram;
    }

    /**
     * HDSD00_14_12.NEEDING_ATTENTION
     *
     * @return the value of HDSD00_14_12.NEEDING_ATTENTION
     */
    public String getNeedingAttention() {
        return needingAttention;
    }

    /**
     * HDSD00_14_12.NEEDING_ATTENTION
     *
     * @param needingAttention the value for HDSD00_14_12.NEEDING_ATTENTION
     */
    public void setNeedingAttention(String needingAttention) {
        this.needingAttention = needingAttention;
    }
}