package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_04_01")
public class Hdsd000401 extends BaseBean implements Serializable {

    private static final long serialVersionUID = 5190087120772455351L;
    /**
     * HDSD00_04_01.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_04_01.status
     */
    private String status;
    /**
     * HDSD00_04_01.pk
     */
    private Integer pk;
    /**
     * HDSD00_04_01.empi
     */
    private String empi;
    /**
     * HDSD00_04_01.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_04_01.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_04_01.VERSION
     */
    private String version;
    /**
     * HDSD00_04_01.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_04_01.RECIPEL_ID
     */
    private String recipelId;
    /**
     * HDSD00_04_01.PDRUGS_FEE
     */
    private String pdrugsFee;
    /**
     * HDSD00_04_01.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_04_01.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_04_01.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_04_01.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_04_01.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_04_01.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_04_01.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_04_01.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_04_01.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_04_01.OPEN_NAME
     */
    private String openName;
    /**
     * HDSD00_04_01.OPEN_DEPT_CODE
     */
    private String openDeptCode;
    /**
     * HDSD00_04_01.OPEN_DEPT
     */
    private String openDept;
    /**
     * HDSD00_04_01.OPEN_DATE
     */
    private String openDate;
    /**
     * HDSD00_04_01.OPEN_ORDER_CODE
     */
    private String openOrderCode;
    /**
     * HDSD00_04_01.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_04_01.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_04_01.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_04_01.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_04_01.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_04_01.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_04_01.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_04_01.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_04_01.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_04_01.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_04_01.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_04_01.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_04_01.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_04_01.DISPENSER_NAME
     */
    private String dispenserName;
    /**
     * HDSD00_04_01.DISPENSER_CODE
     */
    private String dispenserCode;
    /**
     * HDSD00_04_01.DEPLOY_NAME
     */
    private String deployName;
    /**
     * HDSD00_04_01.DEPLOY_CODE
     */
    private String deployCode;
    /**
     * HDSD00_04_01.CHECK_NAME
     */
    private String checkName;
    /**
     * HDSD00_04_01.CHECK_CODE
     */
    private String checkCode;
    /**
     * HDSD00_04_01.AUDIT_NAME
     */
    private String auditName;
    /**
     * HDSD00_04_01.AUDIT_CODE
     */
    private String auditCode;
    /**
     * HDSD00_04_01.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_04_01.AGE
     */
    private String age;
    /**
     * HDSD00_04_01.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_04_01.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_04_01.GENDER
     */
    private String gender;

    private String auditSigndate;

    private String checkSigndate;

    private String deploySigndate;

    private String dispenserSigndate;

    /**
     * HDSD00_04_01.upload_time
     *
     * @return the value of HDSD00_04_01.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_04_01.upload_time
     *
     * @param uploadTime the value for HDSD00_04_01.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_04_01.status
     *
     * @return the value of HDSD00_04_01.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_04_01.status
     *
     * @param status the value for HDSD00_04_01.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_04_01.pk
     *
     * @return the value of HDSD00_04_01.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_04_01.pk
     *
     * @param pk the value for HDSD00_04_01.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_04_01.empi
     *
     * @return the value of HDSD00_04_01.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_04_01.empi
     *
     * @param empi the value for HDSD00_04_01.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_04_01.ENCOUNTER_ID
     *
     * @return the value of HDSD00_04_01.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_04_01.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_04_01.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_04_01.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_04_01.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_04_01.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_04_01.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_04_01.VERSION
     *
     * @return the value of HDSD00_04_01.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_04_01.VERSION
     *
     * @param version the value for HDSD00_04_01.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_04_01.REPORT_TITLE
     *
     * @return the value of HDSD00_04_01.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_04_01.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_04_01.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_04_01.RECIPEL_ID
     *
     * @return the value of HDSD00_04_01.RECIPEL_ID
     */
    public String getRecipelId() {
        return recipelId;
    }

    /**
     * HDSD00_04_01.RECIPEL_ID
     *
     * @param recipelId the value for HDSD00_04_01.RECIPEL_ID
     */
    public void setRecipelId(String recipelId) {
        this.recipelId = recipelId;
    }

    /**
     * HDSD00_04_01.PDRUGS_FEE
     *
     * @return the value of HDSD00_04_01.PDRUGS_FEE
     */
    public String getPdrugsFee() {
        return pdrugsFee;
    }

    /**
     * HDSD00_04_01.PDRUGS_FEE
     *
     * @param pdrugsFee the value for HDSD00_04_01.PDRUGS_FEE
     */
    public void setPdrugsFee(String pdrugsFee) {
        this.pdrugsFee = pdrugsFee;
    }

    /**
     * HDSD00_04_01.PATIENT_NAME
     *
     * @return the value of HDSD00_04_01.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_04_01.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_04_01.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_04_01.PATIENT_TYPE
     *
     * @return the value of HDSD00_04_01.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_04_01.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_04_01.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_04_01.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_04_01.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_04_01.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_04_01.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_04_01.VISIT_TIMES
     *
     * @return the value of HDSD00_04_01.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_04_01.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_04_01.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_04_01.VISIT_ID
     *
     * @return the value of HDSD00_04_01.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_04_01.VISIT_ID
     *
     * @param visitId the value for HDSD00_04_01.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_04_01.VISIT_DOMAIN
     *
     * @return the value of HDSD00_04_01.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_04_01.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_04_01.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_04_01.PATIENT_ID
     *
     * @return the value of HDSD00_04_01.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_04_01.PATIENT_ID
     *
     * @param patientId the value for HDSD00_04_01.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_04_01.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_04_01.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_04_01.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_04_01.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_04_01.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_04_01.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_04_01.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_04_01.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_04_01.OPEN_NAME
     *
     * @return the value of HDSD00_04_01.OPEN_NAME
     */
    public String getOpenName() {
        return openName;
    }

    /**
     * HDSD00_04_01.OPEN_NAME
     *
     * @param openName the value for HDSD00_04_01.OPEN_NAME
     */
    public void setOpenName(String openName) {
        this.openName = openName;
    }

    /**
     * HDSD00_04_01.OPEN_DEPT_CODE
     *
     * @return the value of HDSD00_04_01.OPEN_DEPT_CODE
     */
    public String getOpenDeptCode() {
        return openDeptCode;
    }

    /**
     * HDSD00_04_01.OPEN_DEPT_CODE
     *
     * @param openDeptCode the value for HDSD00_04_01.OPEN_DEPT_CODE
     */
    public void setOpenDeptCode(String openDeptCode) {
        this.openDeptCode = openDeptCode;
    }

    /**
     * HDSD00_04_01.OPEN_DEPT
     *
     * @return the value of HDSD00_04_01.OPEN_DEPT
     */
    public String getOpenDept() {
        return openDept;
    }

    /**
     * HDSD00_04_01.OPEN_DEPT
     *
     * @param openDept the value for HDSD00_04_01.OPEN_DEPT
     */
    public void setOpenDept(String openDept) {
        this.openDept = openDept;
    }

    /**
     * HDSD00_04_01.OPEN_DATE
     *
     * @return the value of HDSD00_04_01.OPEN_DATE
     */
    public String getOpenDate() {
        return openDate;
    }

    /**
     * HDSD00_04_01.OPEN_DATE
     *
     * @param openDate the value for HDSD00_04_01.OPEN_DATE
     */
    public void setOpenDate(String openDate) {
        this.openDate = openDate;
    }

    /**
     * HDSD00_04_01.OPEN_ORDER_CODE
     *
     * @return the value of HDSD00_04_01.OPEN_ORDER_CODE
     */
    public String getOpenOrderCode() {
        return openOrderCode;
    }

    /**
     * HDSD00_04_01.OPEN_ORDER_CODE
     *
     * @param openOrderCode the value for HDSD00_04_01.OPEN_ORDER_CODE
     */
    public void setOpenOrderCode(String openOrderCode) {
        this.openOrderCode = openOrderCode;
    }

    /**
     * HDSD00_04_01.LOAD_TYPE
     *
     * @return the value of HDSD00_04_01.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_04_01.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_04_01.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_04_01.HOSPITAL_NAME
     *
     * @return the value of HDSD00_04_01.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_04_01.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_04_01.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_04_01.HOSPITAL_CODE
     *
     * @return the value of HDSD00_04_01.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_04_01.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_04_01.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_04_01.ID_NUM
     *
     * @return the value of HDSD00_04_01.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_04_01.ID_NUM
     *
     * @param idNum the value for HDSD00_04_01.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_04_01.GENDER_CODE
     *
     * @return the value of HDSD00_04_01.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_04_01.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_04_01.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_04_01.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_04_01.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_04_01.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_04_01.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_04_01.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_04_01.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_04_01.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_04_01.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_04_01.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_04_01.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_04_01.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_04_01.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_04_01.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_04_01.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_04_01.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_04_01.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_04_01.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_04_01.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_04_01.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_04_01.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_04_01.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_04_01.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_04_01.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_04_01.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_04_01.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_04_01.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_04_01.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_04_01.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_04_01.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_04_01.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_04_01.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_04_01.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_04_01.DISPENSER_NAME
     *
     * @return the value of HDSD00_04_01.DISPENSER_NAME
     */
    public String getDispenserName() {
        return dispenserName;
    }

    /**
     * HDSD00_04_01.DISPENSER_NAME
     *
     * @param dispenserName the value for HDSD00_04_01.DISPENSER_NAME
     */
    public void setDispenserName(String dispenserName) {
        this.dispenserName = dispenserName;
    }

    /**
     * HDSD00_04_01.DISPENSER_CODE
     *
     * @return the value of HDSD00_04_01.DISPENSER_CODE
     */
    public String getDispenserCode() {
        return dispenserCode;
    }

    /**
     * HDSD00_04_01.DISPENSER_CODE
     *
     * @param dispenserCode the value for HDSD00_04_01.DISPENSER_CODE
     */
    public void setDispenserCode(String dispenserCode) {
        this.dispenserCode = dispenserCode;
    }

    /**
     * HDSD00_04_01.DEPLOY_NAME
     *
     * @return the value of HDSD00_04_01.DEPLOY_NAME
     */
    public String getDeployName() {
        return deployName;
    }

    /**
     * HDSD00_04_01.DEPLOY_NAME
     *
     * @param deployName the value for HDSD00_04_01.DEPLOY_NAME
     */
    public void setDeployName(String deployName) {
        this.deployName = deployName;
    }

    /**
     * HDSD00_04_01.DEPLOY_CODE
     *
     * @return the value of HDSD00_04_01.DEPLOY_CODE
     */
    public String getDeployCode() {
        return deployCode;
    }

    /**
     * HDSD00_04_01.DEPLOY_CODE
     *
     * @param deployCode the value for HDSD00_04_01.DEPLOY_CODE
     */
    public void setDeployCode(String deployCode) {
        this.deployCode = deployCode;
    }

    /**
     * HDSD00_04_01.CHECK_NAME
     *
     * @return the value of HDSD00_04_01.CHECK_NAME
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * HDSD00_04_01.CHECK_NAME
     *
     * @param checkName the value for HDSD00_04_01.CHECK_NAME
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * HDSD00_04_01.CHECK_CODE
     *
     * @return the value of HDSD00_04_01.CHECK_CODE
     */
    public String getCheckCode() {
        return checkCode;
    }

    /**
     * HDSD00_04_01.CHECK_CODE
     *
     * @param checkCode the value for HDSD00_04_01.CHECK_CODE
     */
    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode;
    }

    /**
     * HDSD00_04_01.AUDIT_NAME
     *
     * @return the value of HDSD00_04_01.AUDIT_NAME
     */
    public String getAuditName() {
        return auditName;
    }

    /**
     * HDSD00_04_01.AUDIT_NAME
     *
     * @param auditName the value for HDSD00_04_01.AUDIT_NAME
     */
    public void setAuditName(String auditName) {
        this.auditName = auditName;
    }

    /**
     * HDSD00_04_01.AUDIT_CODE
     *
     * @return the value of HDSD00_04_01.AUDIT_CODE
     */
    public String getAuditCode() {
        return auditCode;
    }

    /**
     * HDSD00_04_01.AUDIT_CODE
     *
     * @param auditCode the value for HDSD00_04_01.AUDIT_CODE
     */
    public void setAuditCode(String auditCode) {
        this.auditCode = auditCode;
    }

    /**
     * HDSD00_04_01.AGE_UNIT
     *
     * @return the value of HDSD00_04_01.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_04_01.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_04_01.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_04_01.AGE
     *
     * @return the value of HDSD00_04_01.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_04_01.AGE
     *
     * @param age the value for HDSD00_04_01.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_04_01.VISIT_DATE
     *
     * @return the value of HDSD00_04_01.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_04_01.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_04_01.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_04_01.INPATIENT
     *
     * @return the value of HDSD00_04_01.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_04_01.INPATIENT
     *
     * @param inpatient the value for HDSD00_04_01.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_04_01.GENDER
     *
     * @return the value of HDSD00_04_01.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_04_01.GENDER
     *
     * @param gender the value for HDSD00_04_01.GENDER
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

    public String getDeploySigndate() {
        return deploySigndate;
    }

    public void setDeploySigndate(String deploySigndate) {
        this.deploySigndate = deploySigndate;
    }

    public String getDispenserSigndate() {
        return dispenserSigndate;
    }

    public void setDispenserSigndate(String dispenserSigndate) {
        this.dispenserSigndate = dispenserSigndate;
    }
}