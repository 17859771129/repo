package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_03_01")
public class Hdsd000301 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_03_01
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_03_01.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_03_01.status
     */
    private String status;
    /**
     * HDSD00_03_01.pk
     */
    private Integer pk;
    /**
     * HDSD00_03_01.empi
     */
    private String empi;
    /**
     * HDSD00_03_01.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_03_01.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_03_01.VISIT_DOCTOR_CODE
     */
    private String visitDoctorCode;
    /**
     * HDSD00_03_01.VISIT_DOCTOR
     */
    private String visitDoctor;
    /**
     * HDSD00_03_01.VERSION
     */
    private String version;
    /**
     * HDSD00_03_01.TELEPHONE
     */
    private String telephone;
    /**
     * HDSD00_03_01.TCM_FOUR_DIAGNOSIS
     */
    private String tcmFourDiagnosis;
    /**
     * HDSD00_03_01.RULES_CODE
     */
    private String rulesCode;
    /**
     * HDSD00_03_01.RESPONSIBLE_NAME
     */
    private String responsibleName;
    /**
     * HDSD00_03_01.RESPONSIBLE_CODE
     */
    private String responsibleCode;
    /**
     * HDSD00_03_01.RESCUE_START_DATE
     */
    private String rescueStartDate;
    /**
     * HDSD00_03_01.RESCUE_END_DATE
     */
    private String rescueEndDate;
    /**
     * HDSD00_03_01.RESCUERS_LIST
     */
    private String rescuersList;
    /**
     * HDSD00_03_01.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_03_01.RECORD_DATE
     */
    private String recordDate;
    /**
     * HDSD00_03_01.PHYSICAL_EXAMINATION
     */
    private String physicalExamination;
    /**
     * HDSD00_03_01.PD_NAME
     */
    private String pdName;
    /**
     * HDSD00_03_01.PD_CODE
     */
    private String pdCode;
    /**
     * HDSD00_03_01.PAT_CATEGORY
     */
    private String patCategory;
    /**
     * HDSD00_03_01.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_03_01.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_03_01.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_03_01.PAST_HISTORY
     */
    private String pastHistory;
    /**
     * HDSD00_03_01.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_03_01.NEEDING_ATTENTION
     */
    private String needingAttention;
    /**
     * HDSD00_03_01.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_03_01.ITEM_RESULT
     */
    private String itemResult;
    /**
     * HDSD00_03_01.ITEM_NAME
     */
    private String itemName;
    /**
     * HDSD00_03_01.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_03_01.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_03_01.INCOME_OBSERVATORY_DATE
     */
    private String incomeObservatoryDate;
    /**
     * HDSD00_03_01.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_03_01.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_03_01.EMERGENCY_RECORD
     */
    private String emergencyRecord;
    /**
     * HDSD00_03_01.EMERGENCY_COURSE
     */
    private String emergencyCourse;
    /**
     * HDSD00_03_01.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_03_01.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_03_01.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_03_01.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_03_01.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_03_01.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_03_01.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_03_01.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_03_01.DISCRIMINATE_BASIS
     */
    private String discriminateBasis;
    /**
     * HDSD00_03_01.DESTINATION_CODE
     */
    private String destinationCode;
    /**
     * HDSD00_03_01.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_03_01.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_03_01.DATEOF_BIRTH
     */
    private String dateofBirth;
    /**
     * HDSD00_03_01.CURRENT_HISTORY
     */
    private String currentHistory;
    /**
     * HDSD00_03_01.CHIEF_COMPLAINT
     */
    private String chiefComplaint;
    /**
     * HDSD00_03_01.APPY_ID
     */
    private String appyId;
    /**
     * HDSD00_03_01.ALLERGY_HISTORY_MARK
     */
    private String allergyHistoryMark;
    /**
     * HDSD00_03_01.ALLERGY_HISTORY
     */
    private String allergyHistory;
    /**
     * HDSD00_03_01.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_03_01.AGE
     */
    private String age;
    /**
     * HDSD00_03_01.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_03_01.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_03_01.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_03_01.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_03_01.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_03_01.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_03_01.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_03_01.GENDER
     */
    private String gender;
    /**
     * HDSD00_03_01.PAT_CATEGORY_CODE
     */
    private String patCategoryCode;

    /**
     * HDSD00_03_01.upload_time
     *
     * @return the value of HDSD00_03_01.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_03_01.upload_time
     *
     * @param uploadTime the value for HDSD00_03_01.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_03_01.status
     *
     * @return the value of HDSD00_03_01.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_03_01.status
     *
     * @param status the value for HDSD00_03_01.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_03_01.pk
     *
     * @return the value of HDSD00_03_01.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_03_01.pk
     *
     * @param pk the value for HDSD00_03_01.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_03_01.empi
     *
     * @return the value of HDSD00_03_01.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_03_01.empi
     *
     * @param empi the value for HDSD00_03_01.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_03_01.ENCOUNTER_ID
     *
     * @return the value of HDSD00_03_01.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_03_01.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_03_01.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_03_01.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_03_01.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_03_01.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_03_01.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_03_01.VISIT_DOCTOR_CODE
     *
     * @return the value of HDSD00_03_01.VISIT_DOCTOR_CODE
     */
    public String getVisitDoctorCode() {
        return visitDoctorCode;
    }

    /**
     * HDSD00_03_01.VISIT_DOCTOR_CODE
     *
     * @param visitDoctorCode the value for HDSD00_03_01.VISIT_DOCTOR_CODE
     */
    public void setVisitDoctorCode(String visitDoctorCode) {
        this.visitDoctorCode = visitDoctorCode;
    }

    /**
     * HDSD00_03_01.VISIT_DOCTOR
     *
     * @return the value of HDSD00_03_01.VISIT_DOCTOR
     */
    public String getVisitDoctor() {
        return visitDoctor;
    }

    /**
     * HDSD00_03_01.VISIT_DOCTOR
     *
     * @param visitDoctor the value for HDSD00_03_01.VISIT_DOCTOR
     */
    public void setVisitDoctor(String visitDoctor) {
        this.visitDoctor = visitDoctor;
    }

    /**
     * HDSD00_03_01.VERSION
     *
     * @return the value of HDSD00_03_01.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_03_01.VERSION
     *
     * @param version the value for HDSD00_03_01.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_03_01.TELEPHONE
     *
     * @return the value of HDSD00_03_01.TELEPHONE
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * HDSD00_03_01.TELEPHONE
     *
     * @param telephone the value for HDSD00_03_01.TELEPHONE
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * HDSD00_03_01.TCM_FOUR_DIAGNOSIS
     *
     * @return the value of HDSD00_03_01.TCM_FOUR_DIAGNOSIS
     */
    public String getTcmFourDiagnosis() {
        return tcmFourDiagnosis;
    }

    /**
     * HDSD00_03_01.TCM_FOUR_DIAGNOSIS
     *
     * @param tcmFourDiagnosis the value for HDSD00_03_01.TCM_FOUR_DIAGNOSIS
     */
    public void setTcmFourDiagnosis(String tcmFourDiagnosis) {
        this.tcmFourDiagnosis = tcmFourDiagnosis;
    }

    /**
     * HDSD00_03_01.RULES_CODE
     *
     * @return the value of HDSD00_03_01.RULES_CODE
     */
    public String getRulesCode() {
        return rulesCode;
    }

    /**
     * HDSD00_03_01.RULES_CODE
     *
     * @param rulesCode the value for HDSD00_03_01.RULES_CODE
     */
    public void setRulesCode(String rulesCode) {
        this.rulesCode = rulesCode;
    }

    /**
     * HDSD00_03_01.RESPONSIBLE_NAME
     *
     * @return the value of HDSD00_03_01.RESPONSIBLE_NAME
     */
    public String getResponsibleName() {
        return responsibleName;
    }

    /**
     * HDSD00_03_01.RESPONSIBLE_NAME
     *
     * @param responsibleName the value for HDSD00_03_01.RESPONSIBLE_NAME
     */
    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    /**
     * HDSD00_03_01.RESPONSIBLE_CODE
     *
     * @return the value of HDSD00_03_01.RESPONSIBLE_CODE
     */
    public String getResponsibleCode() {
        return responsibleCode;
    }

    /**
     * HDSD00_03_01.RESPONSIBLE_CODE
     *
     * @param responsibleCode the value for HDSD00_03_01.RESPONSIBLE_CODE
     */
    public void setResponsibleCode(String responsibleCode) {
        this.responsibleCode = responsibleCode;
    }

    /**
     * HDSD00_03_01.RESCUE_START_DATE
     *
     * @return the value of HDSD00_03_01.RESCUE_START_DATE
     */
    public String getRescueStartDate() {
        return rescueStartDate;
    }

    /**
     * HDSD00_03_01.RESCUE_START_DATE
     *
     * @param rescueStartDate the value for HDSD00_03_01.RESCUE_START_DATE
     */
    public void setRescueStartDate(String rescueStartDate) {
        this.rescueStartDate = rescueStartDate;
    }

    /**
     * HDSD00_03_01.RESCUE_END_DATE
     *
     * @return the value of HDSD00_03_01.RESCUE_END_DATE
     */
    public String getRescueEndDate() {
        return rescueEndDate;
    }

    /**
     * HDSD00_03_01.RESCUE_END_DATE
     *
     * @param rescueEndDate the value for HDSD00_03_01.RESCUE_END_DATE
     */
    public void setRescueEndDate(String rescueEndDate) {
        this.rescueEndDate = rescueEndDate;
    }

    /**
     * HDSD00_03_01.RESCUERS_LIST
     *
     * @return the value of HDSD00_03_01.RESCUERS_LIST
     */
    public String getRescuersList() {
        return rescuersList;
    }

    /**
     * HDSD00_03_01.RESCUERS_LIST
     *
     * @param rescuersList the value for HDSD00_03_01.RESCUERS_LIST
     */
    public void setRescuersList(String rescuersList) {
        this.rescuersList = rescuersList;
    }

    /**
     * HDSD00_03_01.REPORT_TITLE
     *
     * @return the value of HDSD00_03_01.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_03_01.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_03_01.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_03_01.RECORD_DATE
     *
     * @return the value of HDSD00_03_01.RECORD_DATE
     */
    public String getRecordDate() {
        return recordDate;
    }

    /**
     * HDSD00_03_01.RECORD_DATE
     *
     * @param recordDate the value for HDSD00_03_01.RECORD_DATE
     */
    public void setRecordDate(String recordDate) {
        this.recordDate = recordDate;
    }

    /**
     * HDSD00_03_01.PHYSICAL_EXAMINATION
     *
     * @return the value of HDSD00_03_01.PHYSICAL_EXAMINATION
     */
    public String getPhysicalExamination() {
        return physicalExamination;
    }

    /**
     * HDSD00_03_01.PHYSICAL_EXAMINATION
     *
     * @param physicalExamination the value for HDSD00_03_01.PHYSICAL_EXAMINATION
     */
    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination;
    }

    /**
     * HDSD00_03_01.PD_NAME
     *
     * @return the value of HDSD00_03_01.PD_NAME
     */
    public String getPdName() {
        return pdName;
    }

    /**
     * HDSD00_03_01.PD_NAME
     *
     * @param pdName the value for HDSD00_03_01.PD_NAME
     */
    public void setPdName(String pdName) {
        this.pdName = pdName;
    }

    /**
     * HDSD00_03_01.PD_CODE
     *
     * @return the value of HDSD00_03_01.PD_CODE
     */
    public String getPdCode() {
        return pdCode;
    }

    /**
     * HDSD00_03_01.PD_CODE
     *
     * @param pdCode the value for HDSD00_03_01.PD_CODE
     */
    public void setPdCode(String pdCode) {
        this.pdCode = pdCode;
    }

    /**
     * HDSD00_03_01.PAT_CATEGORY
     *
     * @return the value of HDSD00_03_01.PAT_CATEGORY
     */
    public String getPatCategory() {
        return patCategory;
    }

    /**
     * HDSD00_03_01.PAT_CATEGORY
     *
     * @param patCategory the value for HDSD00_03_01.PAT_CATEGORY
     */
    public void setPatCategory(String patCategory) {
        this.patCategory = patCategory;
    }

    /**
     * HDSD00_03_01.PATIENT_NAME
     *
     * @return the value of HDSD00_03_01.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_03_01.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_03_01.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_03_01.PATIENT_ID
     *
     * @return the value of HDSD00_03_01.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_03_01.PATIENT_ID
     *
     * @param patientId the value for HDSD00_03_01.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_03_01.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_03_01.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_03_01.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_03_01.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_03_01.PAST_HISTORY
     *
     * @return the value of HDSD00_03_01.PAST_HISTORY
     */
    public String getPastHistory() {
        return pastHistory;
    }

    /**
     * HDSD00_03_01.PAST_HISTORY
     *
     * @param pastHistory the value for HDSD00_03_01.PAST_HISTORY
     */
    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory;
    }

    /**
     * HDSD00_03_01.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_03_01.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_03_01.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_03_01.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_03_01.NEEDING_ATTENTION
     *
     * @return the value of HDSD00_03_01.NEEDING_ATTENTION
     */
    public String getNeedingAttention() {
        return needingAttention;
    }

    /**
     * HDSD00_03_01.NEEDING_ATTENTION
     *
     * @param needingAttention the value for HDSD00_03_01.NEEDING_ATTENTION
     */
    public void setNeedingAttention(String needingAttention) {
        this.needingAttention = needingAttention;
    }

    /**
     * HDSD00_03_01.LOAD_TYPE
     *
     * @return the value of HDSD00_03_01.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_03_01.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_03_01.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_03_01.ITEM_RESULT
     *
     * @return the value of HDSD00_03_01.ITEM_RESULT
     */
    public String getItemResult() {
        return itemResult;
    }

    /**
     * HDSD00_03_01.ITEM_RESULT
     *
     * @param itemResult the value for HDSD00_03_01.ITEM_RESULT
     */
    public void setItemResult(String itemResult) {
        this.itemResult = itemResult;
    }

    /**
     * HDSD00_03_01.ITEM_NAME
     *
     * @return the value of HDSD00_03_01.ITEM_NAME
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * HDSD00_03_01.ITEM_NAME
     *
     * @param itemName the value for HDSD00_03_01.ITEM_NAME
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * HDSD00_03_01.HOSPITAL_CODE
     *
     * @return the value of HDSD00_03_01.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_03_01.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_03_01.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_03_01.HOSPITAL_NAME
     *
     * @return the value of HDSD00_03_01.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_03_01.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_03_01.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_03_01.INCOME_OBSERVATORY_DATE
     *
     * @return the value of HDSD00_03_01.INCOME_OBSERVATORY_DATE
     */
    public String getIncomeObservatoryDate() {
        return incomeObservatoryDate;
    }

    /**
     * HDSD00_03_01.INCOME_OBSERVATORY_DATE
     *
     * @param incomeObservatoryDate the value for HDSD00_03_01.INCOME_OBSERVATORY_DATE
     */
    public void setIncomeObservatoryDate(String incomeObservatoryDate) {
        this.incomeObservatoryDate = incomeObservatoryDate;
    }

    /**
     * HDSD00_03_01.ID_NUM
     *
     * @return the value of HDSD00_03_01.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_03_01.ID_NUM
     *
     * @param idNum the value for HDSD00_03_01.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_03_01.GENDER_CODE
     *
     * @return the value of HDSD00_03_01.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_03_01.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_03_01.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_03_01.EMERGENCY_RECORD
     *
     * @return the value of HDSD00_03_01.EMERGENCY_RECORD
     */
    public String getEmergencyRecord() {
        return emergencyRecord;
    }

    /**
     * HDSD00_03_01.EMERGENCY_RECORD
     *
     * @param emergencyRecord the value for HDSD00_03_01.EMERGENCY_RECORD
     */
    public void setEmergencyRecord(String emergencyRecord) {
        this.emergencyRecord = emergencyRecord;
    }

    /**
     * HDSD00_03_01.EMERGENCY_COURSE
     *
     * @return the value of HDSD00_03_01.EMERGENCY_COURSE
     */
    public String getEmergencyCourse() {
        return emergencyCourse;
    }

    /**
     * HDSD00_03_01.EMERGENCY_COURSE
     *
     * @param emergencyCourse the value for HDSD00_03_01.EMERGENCY_COURSE
     */
    public void setEmergencyCourse(String emergencyCourse) {
        this.emergencyCourse = emergencyCourse;
    }

    /**
     * HDSD00_03_01.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_03_01.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_03_01.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_03_01.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_03_01.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_03_01.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_03_01.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_03_01.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_03_01.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_03_01.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_03_01.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_03_01.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_03_01.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_03_01.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_03_01.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_03_01.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_03_01.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_03_01.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_03_01.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_03_01.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_03_01.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_03_01.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_03_01.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_03_01.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_03_01.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_03_01.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_03_01.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_03_01.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_03_01.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_03_01.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_03_01.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_03_01.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_03_01.DISCRIMINATE_BASIS
     *
     * @return the value of HDSD00_03_01.DISCRIMINATE_BASIS
     */
    public String getDiscriminateBasis() {
        return discriminateBasis;
    }

    /**
     * HDSD00_03_01.DISCRIMINATE_BASIS
     *
     * @param discriminateBasis the value for HDSD00_03_01.DISCRIMINATE_BASIS
     */
    public void setDiscriminateBasis(String discriminateBasis) {
        this.discriminateBasis = discriminateBasis;
    }

    /**
     * HDSD00_03_01.DESTINATION_CODE
     *
     * @return the value of HDSD00_03_01.DESTINATION_CODE
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * HDSD00_03_01.DESTINATION_CODE
     *
     * @param destinationCode the value for HDSD00_03_01.DESTINATION_CODE
     */
    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    /**
     * HDSD00_03_01.DEPT_NAME
     *
     * @return the value of HDSD00_03_01.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_03_01.DEPT_NAME
     *
     * @param deptName the value for HDSD00_03_01.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_03_01.DEPT_CODE
     *
     * @return the value of HDSD00_03_01.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_03_01.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_03_01.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_03_01.DATEOF_BIRTH
     *
     * @return the value of HDSD00_03_01.DATEOF_BIRTH
     */
    public String getDateofBirth() {
        return dateofBirth;
    }

    /**
     * HDSD00_03_01.DATEOF_BIRTH
     *
     * @param dateofBirth the value for HDSD00_03_01.DATEOF_BIRTH
     */
    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /**
     * HDSD00_03_01.CURRENT_HISTORY
     *
     * @return the value of HDSD00_03_01.CURRENT_HISTORY
     */
    public String getCurrentHistory() {
        return currentHistory;
    }

    /**
     * HDSD00_03_01.CURRENT_HISTORY
     *
     * @param currentHistory the value for HDSD00_03_01.CURRENT_HISTORY
     */
    public void setCurrentHistory(String currentHistory) {
        this.currentHistory = currentHistory;
    }

    /**
     * HDSD00_03_01.CHIEF_COMPLAINT
     *
     * @return the value of HDSD00_03_01.CHIEF_COMPLAINT
     */
    public String getChiefComplaint() {
        return chiefComplaint;
    }

    /**
     * HDSD00_03_01.CHIEF_COMPLAINT
     *
     * @param chiefComplaint the value for HDSD00_03_01.CHIEF_COMPLAINT
     */
    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    /**
     * HDSD00_03_01.APPY_ID
     *
     * @return the value of HDSD00_03_01.APPY_ID
     */
    public String getAppyId() {
        return appyId;
    }

    /**
     * HDSD00_03_01.APPY_ID
     *
     * @param appyId the value for HDSD00_03_01.APPY_ID
     */
    public void setAppyId(String appyId) {
        this.appyId = appyId;
    }

    /**
     * HDSD00_03_01.ALLERGY_HISTORY_MARK
     *
     * @return the value of HDSD00_03_01.ALLERGY_HISTORY_MARK
     */
    public String getAllergyHistoryMark() {
        return allergyHistoryMark;
    }

    /**
     * HDSD00_03_01.ALLERGY_HISTORY_MARK
     *
     * @param allergyHistoryMark the value for HDSD00_03_01.ALLERGY_HISTORY_MARK
     */
    public void setAllergyHistoryMark(String allergyHistoryMark) {
        this.allergyHistoryMark = allergyHistoryMark;
    }

    /**
     * HDSD00_03_01.ALLERGY_HISTORY
     *
     * @return the value of HDSD00_03_01.ALLERGY_HISTORY
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * HDSD00_03_01.ALLERGY_HISTORY
     *
     * @param allergyHistory the value for HDSD00_03_01.ALLERGY_HISTORY
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }

    /**
     * HDSD00_03_01.AGE_UNIT
     *
     * @return the value of HDSD00_03_01.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_03_01.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_03_01.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_03_01.AGE
     *
     * @return the value of HDSD00_03_01.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_03_01.AGE
     *
     * @param age the value for HDSD00_03_01.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_03_01.PATIENT_TYPE
     *
     * @return the value of HDSD00_03_01.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_03_01.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_03_01.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_03_01.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_03_01.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_03_01.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_03_01.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_03_01.VISIT_TIMES
     *
     * @return the value of HDSD00_03_01.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_03_01.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_03_01.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_03_01.VISIT_ID
     *
     * @return the value of HDSD00_03_01.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_03_01.VISIT_ID
     *
     * @param visitId the value for HDSD00_03_01.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_03_01.VISIT_DOMAIN
     *
     * @return the value of HDSD00_03_01.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_03_01.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_03_01.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_03_01.VISIT_DATE
     *
     * @return the value of HDSD00_03_01.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_03_01.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_03_01.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_03_01.INPATIENT
     *
     * @return the value of HDSD00_03_01.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_03_01.INPATIENT
     *
     * @param inpatient the value for HDSD00_03_01.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_03_01.GENDER
     *
     * @return the value of HDSD00_03_01.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_03_01.GENDER
     *
     * @param gender the value for HDSD00_03_01.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_03_01.PAT_CATEGORY_CODE
     *
     * @return the value of HDSD00_03_01.PAT_CATEGORY_CODE
     */
    public String getPatCategoryCode() {
        return patCategoryCode;
    }

    /**
     * HDSD00_03_01.PAT_CATEGORY_CODE
     *
     * @param patCategoryCode the value for HDSD00_03_01.PAT_CATEGORY_CODE
     */
    public void setPatCategoryCode(String patCategoryCode) {
        this.patCategoryCode = patCategoryCode;
    }
}