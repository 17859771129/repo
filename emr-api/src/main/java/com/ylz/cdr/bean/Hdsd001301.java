package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_13_01")
public class Hdsd001301 extends BaseBean implements Serializable {

    private static final long serialVersionUID = 5229164343538754063L;
    /**
     * HDSD00_13_01.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_13_01.status
     */
    private String status;
    /**
     * HDSD00_13_01.pk
     */
    private Integer pk;
    /**
     * HDSD00_13_01.empi
     */
    private String empi;
    /**
     * HDSD00_13_01.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_13_01.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_13_01.VERSION
     */
    private String version;
    /**
     * HDSD00_13_01.TREATMENT_PROCESS
     */
    private String treatmentProcess;
    /**
     * HDSD00_13_01.TCM_FOUR_DIAGNOSIS
     */
    private String tcmFourDiagnosis;
    /**
     * HDSD00_13_01.SYMPTOM_NAME
     */
    private String symptomName;
    /**
     * HDSD00_13_01.SYMPTOM_DESCRIPTION
     */
    private String symptomDescription;
    /**
     * HDSD00_13_01.STATEMENT_RELIABILITY_MARK
     */
    private String statementReliabilityMark;
    /**
     * HDSD00_13_01.RESIDENT_SIGNDATE
     */
    private String residentSigndate;
    /**
     * HDSD00_13_01.RESIDENT_NAME
     */
    private String residentName;
    /**
     * HDSD00_13_01.RESIDENT_CODE
     */
    private String residentCode;
    /**
     * HDSD00_13_01.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_13_01.RELATIONSHIP_NAME
     */
    private String relationshipName;
    /**
     * HDSD00_13_01.RELATIONSHIP_CODE
     */
    private String relationshipCode;
    /**
     * HDSD00_13_01.PRINCIPLE_AND_METHOD
     */
    private String principleAndMethod;
    /**
     * HDSD00_13_01.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_13_01.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_13_01.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_13_01.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_13_01.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_13_01.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_13_01.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_13_01.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_13_01.NATION_CODE
     */
    private String nationCode;
    /**
     * HDSD00_13_01.NATION
     */
    private String nation;
    /**
     * HDSD00_13_01.MARRIAGE_NAME
     */
    private String marriageName;
    /**
     * HDSD00_13_01.MARRIAGE_CODE
     */
    private String marriageCode;
    /**
     * HDSD00_13_01.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_13_01.MI_CODE
     */
    private String miCode;
    /**
     * HDSD00_13_01.MI_NAME
     */
    private String miName;
    /**
     * HDSD00_13_01.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_13_01.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_13_01.HISTORY_NARRATOR
     */
    private String historyNarrator;
    /**
     * HDSD00_13_01.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_13_01.GENDER
     */
    private String gender;
    /**
     * HDSD00_13_01.FINAL_AUDITOR_SIGNDATE
     */
    private String finalAuditorSigndate;
    /**
     * HDSD00_13_01.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_13_01.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_13_01.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_13_01.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_13_01.DOC_FINAL_AUDITORCODE
     */
    private String docFinalAuditorcode;
    /**
     * HDSD00_13_01.DOC_FINAL_AUDITOR
     */
    private String docFinalAuditor;
    /**
     * HDSD00_13_01.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_13_01.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_13_01.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_13_01.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_13_01.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_13_01.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_13_01.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_13_01.DISCHARGE_ORDER_DATE
     */
    private String dischargeOrderDate;
    /**
     * HDSD00_13_01.DISCHARGE_ORDER
     */
    private String dischargeOrder;
    /**
     * HDSD00_13_01.DISCHARGE_DATE
     */
    private String dischargeDate;
    /**
     * HDSD00_13_01.DISCHARGE
     */
    private String discharge;
    /**
     * HDSD00_13_01.CURRENT_VILLAGE
     */
    private String currentVillage;
    /**
     * HDSD00_13_01.CURRENT_TOWNSHIP
     */
    private String currentTownship;
    /**
     * HDSD00_13_01.CURRENT_PROVINCE
     */
    private String currentProvince;
    /**
     * HDSD00_13_01.CURRENT_HISTORY
     */
    private String currentHistory;
    /**
     * HDSD00_13_01.CURRENT_DOOR_NUMBER
     */
    private String currentDoorNumber;
    /**
     * HDSD00_13_01.CURRENT_COUNTY
     */
    private String currentCounty;
    /**
     * HDSD00_13_01.CURRENT_CITY
     */
    private String currentCity;
    /**
     * HDSD00_13_01.CHIEF_COMPLAINT
     */
    private String chiefComplaint;
    /**
     * HDSD00_13_01.CAREER_CATEGORYCODE
     */
    private String careerCategorycode;
    /**
     * HDSD00_13_01.CAREER_CATEGORY
     */
    private String careerCategory;
    /**
     * HDSD00_13_01.ATTEND_SIGNDATE
     */
    private String attendSigndate;
    /**
     * HDSD00_13_01.ATTEND_NAME
     */
    private String attendName;
    /**
     * HDSD00_13_01.ATTEND_CODE
     */
    private String attendCode;
    /**
     * HDSD00_13_01.ATTENDING_SIGNDATE
     */
    private String attendingSigndate;
    /**
     * HDSD00_13_01.ATTENDING_NAME
     */
    private String attendingName;
    /**
     * HDSD00_13_01.ATTENDING_CODE
     */
    private String attendingCode;
    /**
     * HDSD00_13_01.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_13_01.AGE
     */
    private String age;
    /**
     * HDSD00_13_01.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_13_01.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_13_01.ADMISSION_STATUS
     */
    private String admissionStatus;
    /**
     * HDSD00_13_01.ADMISSION_DATE
     */
    private String admissionDate;
    /**
     * HDSD00_13_01.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_13_01.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_13_01.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_13_01.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_13_01.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_13_01.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_13_01.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_13_01.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_13_01.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_13_01.BED_NAME
     */
    private String bedName;

    private String openCode;

    private String openName;

    private String openSigndate;

    /**
     * HDSD00_13_01.upload_time
     *
     * @return the value of HDSD00_13_01.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_13_01.upload_time
     *
     * @param uploadTime the value for HDSD00_13_01.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_13_01.status
     *
     * @return the value of HDSD00_13_01.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_13_01.status
     *
     * @param status the value for HDSD00_13_01.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_13_01.pk
     *
     * @return the value of HDSD00_13_01.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_13_01.pk
     *
     * @param pk the value for HDSD00_13_01.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_13_01.empi
     *
     * @return the value of HDSD00_13_01.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_13_01.empi
     *
     * @param empi the value for HDSD00_13_01.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_13_01.ENCOUNTER_ID
     *
     * @return the value of HDSD00_13_01.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_13_01.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_13_01.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_13_01.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_13_01.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_13_01.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_13_01.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_13_01.VERSION
     *
     * @return the value of HDSD00_13_01.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_13_01.VERSION
     *
     * @param version the value for HDSD00_13_01.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_13_01.TREATMENT_PROCESS
     *
     * @return the value of HDSD00_13_01.TREATMENT_PROCESS
     */
    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    /**
     * HDSD00_13_01.TREATMENT_PROCESS
     *
     * @param treatmentProcess the value for HDSD00_13_01.TREATMENT_PROCESS
     */
    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess;
    }

    /**
     * HDSD00_13_01.TCM_FOUR_DIAGNOSIS
     *
     * @return the value of HDSD00_13_01.TCM_FOUR_DIAGNOSIS
     */
    public String getTcmFourDiagnosis() {
        return tcmFourDiagnosis;
    }

    /**
     * HDSD00_13_01.TCM_FOUR_DIAGNOSIS
     *
     * @param tcmFourDiagnosis the value for HDSD00_13_01.TCM_FOUR_DIAGNOSIS
     */
    public void setTcmFourDiagnosis(String tcmFourDiagnosis) {
        this.tcmFourDiagnosis = tcmFourDiagnosis;
    }

    /**
     * HDSD00_13_01.SYMPTOM_NAME
     *
     * @return the value of HDSD00_13_01.SYMPTOM_NAME
     */
    public String getSymptomName() {
        return symptomName;
    }

    /**
     * HDSD00_13_01.SYMPTOM_NAME
     *
     * @param symptomName the value for HDSD00_13_01.SYMPTOM_NAME
     */
    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    /**
     * HDSD00_13_01.SYMPTOM_DESCRIPTION
     *
     * @return the value of HDSD00_13_01.SYMPTOM_DESCRIPTION
     */
    public String getSymptomDescription() {
        return symptomDescription;
    }

    /**
     * HDSD00_13_01.SYMPTOM_DESCRIPTION
     *
     * @param symptomDescription the value for HDSD00_13_01.SYMPTOM_DESCRIPTION
     */
    public void setSymptomDescription(String symptomDescription) {
        this.symptomDescription = symptomDescription;
    }

    /**
     * HDSD00_13_01.STATEMENT_RELIABILITY_MARK
     *
     * @return the value of HDSD00_13_01.STATEMENT_RELIABILITY_MARK
     */
    public String getStatementReliabilityMark() {
        return statementReliabilityMark;
    }

    /**
     * HDSD00_13_01.STATEMENT_RELIABILITY_MARK
     *
     * @param statementReliabilityMark the value for HDSD00_13_01.STATEMENT_RELIABILITY_MARK
     */
    public void setStatementReliabilityMark(String statementReliabilityMark) {
        this.statementReliabilityMark = statementReliabilityMark;
    }

    /**
     * HDSD00_13_01.RESIDENT_SIGNDATE
     *
     * @return the value of HDSD00_13_01.RESIDENT_SIGNDATE
     */
    public String getResidentSigndate() {
        return residentSigndate;
    }

    /**
     * HDSD00_13_01.RESIDENT_SIGNDATE
     *
     * @param residentSigndate the value for HDSD00_13_01.RESIDENT_SIGNDATE
     */
    public void setResidentSigndate(String residentSigndate) {
        this.residentSigndate = residentSigndate;
    }

    /**
     * HDSD00_13_01.RESIDENT_NAME
     *
     * @return the value of HDSD00_13_01.RESIDENT_NAME
     */
    public String getResidentName() {
        return residentName;
    }

    /**
     * HDSD00_13_01.RESIDENT_NAME
     *
     * @param residentName the value for HDSD00_13_01.RESIDENT_NAME
     */
    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    /**
     * HDSD00_13_01.RESIDENT_CODE
     *
     * @return the value of HDSD00_13_01.RESIDENT_CODE
     */
    public String getResidentCode() {
        return residentCode;
    }

    /**
     * HDSD00_13_01.RESIDENT_CODE
     *
     * @param residentCode the value for HDSD00_13_01.RESIDENT_CODE
     */
    public void setResidentCode(String residentCode) {
        this.residentCode = residentCode;
    }

    /**
     * HDSD00_13_01.REPORT_TITLE
     *
     * @return the value of HDSD00_13_01.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_13_01.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_13_01.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_13_01.RELATIONSHIP_NAME
     *
     * @return the value of HDSD00_13_01.RELATIONSHIP_NAME
     */
    public String getRelationshipName() {
        return relationshipName;
    }

    /**
     * HDSD00_13_01.RELATIONSHIP_NAME
     *
     * @param relationshipName the value for HDSD00_13_01.RELATIONSHIP_NAME
     */
    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName;
    }

    /**
     * HDSD00_13_01.RELATIONSHIP_CODE
     *
     * @return the value of HDSD00_13_01.RELATIONSHIP_CODE
     */
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * HDSD00_13_01.RELATIONSHIP_CODE
     *
     * @param relationshipCode the value for HDSD00_13_01.RELATIONSHIP_CODE
     */
    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    /**
     * HDSD00_13_01.PRINCIPLE_AND_METHOD
     *
     * @return the value of HDSD00_13_01.PRINCIPLE_AND_METHOD
     */
    public String getPrincipleAndMethod() {
        return principleAndMethod;
    }

    /**
     * HDSD00_13_01.PRINCIPLE_AND_METHOD
     *
     * @param principleAndMethod the value for HDSD00_13_01.PRINCIPLE_AND_METHOD
     */
    public void setPrincipleAndMethod(String principleAndMethod) {
        this.principleAndMethod = principleAndMethod;
    }

    /**
     * HDSD00_13_01.PATIENT_NAME
     *
     * @return the value of HDSD00_13_01.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_13_01.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_13_01.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_13_01.PATIENT_TYPE
     *
     * @return the value of HDSD00_13_01.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_13_01.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_13_01.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_13_01.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_13_01.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_13_01.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_13_01.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_13_01.VISIT_TIMES
     *
     * @return the value of HDSD00_13_01.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_13_01.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_13_01.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_13_01.VISIT_ID
     *
     * @return the value of HDSD00_13_01.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_13_01.VISIT_ID
     *
     * @param visitId the value for HDSD00_13_01.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_13_01.VISIT_DOMAIN
     *
     * @return the value of HDSD00_13_01.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_13_01.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_13_01.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_13_01.PATIENT_ID
     *
     * @return the value of HDSD00_13_01.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_13_01.PATIENT_ID
     *
     * @param patientId the value for HDSD00_13_01.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_13_01.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_13_01.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_13_01.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_13_01.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_13_01.NATION_CODE
     *
     * @return the value of HDSD00_13_01.NATION_CODE
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * HDSD00_13_01.NATION_CODE
     *
     * @param nationCode the value for HDSD00_13_01.NATION_CODE
     */
    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    /**
     * HDSD00_13_01.NATION
     *
     * @return the value of HDSD00_13_01.NATION
     */
    public String getNation() {
        return nation;
    }

    /**
     * HDSD00_13_01.NATION
     *
     * @param nation the value for HDSD00_13_01.NATION
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * HDSD00_13_01.MARRIAGE_NAME
     *
     * @return the value of HDSD00_13_01.MARRIAGE_NAME
     */
    public String getMarriageName() {
        return marriageName;
    }

    /**
     * HDSD00_13_01.MARRIAGE_NAME
     *
     * @param marriageName the value for HDSD00_13_01.MARRIAGE_NAME
     */
    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName;
    }

    /**
     * HDSD00_13_01.MARRIAGE_CODE
     *
     * @return the value of HDSD00_13_01.MARRIAGE_CODE
     */
    public String getMarriageCode() {
        return marriageCode;
    }

    /**
     * HDSD00_13_01.MARRIAGE_CODE
     *
     * @param marriageCode the value for HDSD00_13_01.MARRIAGE_CODE
     */
    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode;
    }

    /**
     * HDSD00_13_01.LOAD_TYPE
     *
     * @return the value of HDSD00_13_01.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_13_01.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_13_01.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_13_01.MI_CODE
     *
     * @return the value of HDSD00_13_01.MI_CODE
     */
    public String getMiCode() {
        return miCode;
    }

    /**
     * HDSD00_13_01.MI_CODE
     *
     * @param miCode the value for HDSD00_13_01.MI_CODE
     */
    public void setMiCode(String miCode) {
        this.miCode = miCode;
    }

    /**
     * HDSD00_13_01.MI_NAME
     *
     * @return the value of HDSD00_13_01.MI_NAME
     */
    public String getMiName() {
        return miName;
    }

    /**
     * HDSD00_13_01.MI_NAME
     *
     * @param miName the value for HDSD00_13_01.MI_NAME
     */
    public void setMiName(String miName) {
        this.miName = miName;
    }

    /**
     * HDSD00_13_01.INPATIENT
     *
     * @return the value of HDSD00_13_01.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_13_01.INPATIENT
     *
     * @param inpatient the value for HDSD00_13_01.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_13_01.ID_NUM
     *
     * @return the value of HDSD00_13_01.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_13_01.ID_NUM
     *
     * @param idNum the value for HDSD00_13_01.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_13_01.HISTORY_NARRATOR
     *
     * @return the value of HDSD00_13_01.HISTORY_NARRATOR
     */
    public String getHistoryNarrator() {
        return historyNarrator;
    }

    /**
     * HDSD00_13_01.HISTORY_NARRATOR
     *
     * @param historyNarrator the value for HDSD00_13_01.HISTORY_NARRATOR
     */
    public void setHistoryNarrator(String historyNarrator) {
        this.historyNarrator = historyNarrator;
    }

    /**
     * HDSD00_13_01.GENDER_CODE
     *
     * @return the value of HDSD00_13_01.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_13_01.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_13_01.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_13_01.GENDER
     *
     * @return the value of HDSD00_13_01.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_13_01.GENDER
     *
     * @param gender the value for HDSD00_13_01.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_13_01.FINAL_AUDITOR_SIGNDATE
     *
     * @return the value of HDSD00_13_01.FINAL_AUDITOR_SIGNDATE
     */
    public String getFinalAuditorSigndate() {
        return finalAuditorSigndate;
    }

    /**
     * HDSD00_13_01.FINAL_AUDITOR_SIGNDATE
     *
     * @param finalAuditorSigndate the value for HDSD00_13_01.FINAL_AUDITOR_SIGNDATE
     */
    public void setFinalAuditorSigndate(String finalAuditorSigndate) {
        this.finalAuditorSigndate = finalAuditorSigndate;
    }

    /**
     * HDSD00_13_01.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_13_01.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_13_01.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_13_01.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_13_01.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_13_01.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_13_01.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_13_01.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_13_01.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_13_01.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_13_01.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_13_01.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_13_01.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_13_01.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_13_01.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_13_01.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_13_01.DOC_FINAL_AUDITORCODE
     *
     * @return the value of HDSD00_13_01.DOC_FINAL_AUDITORCODE
     */
    public String getDocFinalAuditorcode() {
        return docFinalAuditorcode;
    }

    /**
     * HDSD00_13_01.DOC_FINAL_AUDITORCODE
     *
     * @param docFinalAuditorcode the value for HDSD00_13_01.DOC_FINAL_AUDITORCODE
     */
    public void setDocFinalAuditorcode(String docFinalAuditorcode) {
        this.docFinalAuditorcode = docFinalAuditorcode;
    }

    /**
     * HDSD00_13_01.DOC_FINAL_AUDITOR
     *
     * @return the value of HDSD00_13_01.DOC_FINAL_AUDITOR
     */
    public String getDocFinalAuditor() {
        return docFinalAuditor;
    }

    /**
     * HDSD00_13_01.DOC_FINAL_AUDITOR
     *
     * @param docFinalAuditor the value for HDSD00_13_01.DOC_FINAL_AUDITOR
     */
    public void setDocFinalAuditor(String docFinalAuditor) {
        this.docFinalAuditor = docFinalAuditor;
    }

    /**
     * HDSD00_13_01.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_13_01.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_13_01.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_13_01.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_13_01.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_13_01.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_13_01.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_13_01.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_13_01.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_13_01.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_13_01.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_13_01.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_13_01.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_13_01.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_13_01.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_13_01.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_13_01.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_13_01.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_13_01.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_13_01.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_13_01.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_13_01.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_13_01.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_13_01.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_13_01.DOC_AUTHOR
     *
     * @return the value of HDSD00_13_01.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_13_01.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_13_01.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_13_01.DISCHARGE_ORDER_DATE
     *
     * @return the value of HDSD00_13_01.DISCHARGE_ORDER_DATE
     */
    public String getDischargeOrderDate() {
        return dischargeOrderDate;
    }

    /**
     * HDSD00_13_01.DISCHARGE_ORDER_DATE
     *
     * @param dischargeOrderDate the value for HDSD00_13_01.DISCHARGE_ORDER_DATE
     */
    public void setDischargeOrderDate(String dischargeOrderDate) {
        this.dischargeOrderDate = dischargeOrderDate;
    }

    /**
     * HDSD00_13_01.DISCHARGE_ORDER
     *
     * @return the value of HDSD00_13_01.DISCHARGE_ORDER
     */
    public String getDischargeOrder() {
        return dischargeOrder;
    }

    /**
     * HDSD00_13_01.DISCHARGE_ORDER
     *
     * @param dischargeOrder the value for HDSD00_13_01.DISCHARGE_ORDER
     */
    public void setDischargeOrder(String dischargeOrder) {
        this.dischargeOrder = dischargeOrder;
    }

    /**
     * HDSD00_13_01.DISCHARGE_DATE
     *
     * @return the value of HDSD00_13_01.DISCHARGE_DATE
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * HDSD00_13_01.DISCHARGE_DATE
     *
     * @param dischargeDate the value for HDSD00_13_01.DISCHARGE_DATE
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    /**
     * HDSD00_13_01.DISCHARGE
     *
     * @return the value of HDSD00_13_01.DISCHARGE
     */
    public String getDischarge() {
        return discharge;
    }

    /**
     * HDSD00_13_01.DISCHARGE
     *
     * @param discharge the value for HDSD00_13_01.DISCHARGE
     */
    public void setDischarge(String discharge) {
        this.discharge = discharge;
    }

    /**
     * HDSD00_13_01.CURRENT_VILLAGE
     *
     * @return the value of HDSD00_13_01.CURRENT_VILLAGE
     */
    public String getCurrentVillage() {
        return currentVillage;
    }

    /**
     * HDSD00_13_01.CURRENT_VILLAGE
     *
     * @param currentVillage the value for HDSD00_13_01.CURRENT_VILLAGE
     */
    public void setCurrentVillage(String currentVillage) {
        this.currentVillage = currentVillage;
    }

    /**
     * HDSD00_13_01.CURRENT_TOWNSHIP
     *
     * @return the value of HDSD00_13_01.CURRENT_TOWNSHIP
     */
    public String getCurrentTownship() {
        return currentTownship;
    }

    /**
     * HDSD00_13_01.CURRENT_TOWNSHIP
     *
     * @param currentTownship the value for HDSD00_13_01.CURRENT_TOWNSHIP
     */
    public void setCurrentTownship(String currentTownship) {
        this.currentTownship = currentTownship;
    }

    /**
     * HDSD00_13_01.CURRENT_PROVINCE
     *
     * @return the value of HDSD00_13_01.CURRENT_PROVINCE
     */
    public String getCurrentProvince() {
        return currentProvince;
    }

    /**
     * HDSD00_13_01.CURRENT_PROVINCE
     *
     * @param currentProvince the value for HDSD00_13_01.CURRENT_PROVINCE
     */
    public void setCurrentProvince(String currentProvince) {
        this.currentProvince = currentProvince;
    }

    /**
     * HDSD00_13_01.CURRENT_HISTORY
     *
     * @return the value of HDSD00_13_01.CURRENT_HISTORY
     */
    public String getCurrentHistory() {
        return currentHistory;
    }

    /**
     * HDSD00_13_01.CURRENT_HISTORY
     *
     * @param currentHistory the value for HDSD00_13_01.CURRENT_HISTORY
     */
    public void setCurrentHistory(String currentHistory) {
        this.currentHistory = currentHistory;
    }

    /**
     * HDSD00_13_01.CURRENT_DOOR_NUMBER
     *
     * @return the value of HDSD00_13_01.CURRENT_DOOR_NUMBER
     */
    public String getCurrentDoorNumber() {
        return currentDoorNumber;
    }

    /**
     * HDSD00_13_01.CURRENT_DOOR_NUMBER
     *
     * @param currentDoorNumber the value for HDSD00_13_01.CURRENT_DOOR_NUMBER
     */
    public void setCurrentDoorNumber(String currentDoorNumber) {
        this.currentDoorNumber = currentDoorNumber;
    }

    /**
     * HDSD00_13_01.CURRENT_COUNTY
     *
     * @return the value of HDSD00_13_01.CURRENT_COUNTY
     */
    public String getCurrentCounty() {
        return currentCounty;
    }

    /**
     * HDSD00_13_01.CURRENT_COUNTY
     *
     * @param currentCounty the value for HDSD00_13_01.CURRENT_COUNTY
     */
    public void setCurrentCounty(String currentCounty) {
        this.currentCounty = currentCounty;
    }

    /**
     * HDSD00_13_01.CURRENT_CITY
     *
     * @return the value of HDSD00_13_01.CURRENT_CITY
     */
    public String getCurrentCity() {
        return currentCity;
    }

    /**
     * HDSD00_13_01.CURRENT_CITY
     *
     * @param currentCity the value for HDSD00_13_01.CURRENT_CITY
     */
    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    /**
     * HDSD00_13_01.CHIEF_COMPLAINT
     *
     * @return the value of HDSD00_13_01.CHIEF_COMPLAINT
     */
    public String getChiefComplaint() {
        return chiefComplaint;
    }

    /**
     * HDSD00_13_01.CHIEF_COMPLAINT
     *
     * @param chiefComplaint the value for HDSD00_13_01.CHIEF_COMPLAINT
     */
    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint;
    }

    /**
     * HDSD00_13_01.CAREER_CATEGORYCODE
     *
     * @return the value of HDSD00_13_01.CAREER_CATEGORYCODE
     */
    public String getCareerCategorycode() {
        return careerCategorycode;
    }

    /**
     * HDSD00_13_01.CAREER_CATEGORYCODE
     *
     * @param careerCategorycode the value for HDSD00_13_01.CAREER_CATEGORYCODE
     */
    public void setCareerCategorycode(String careerCategorycode) {
        this.careerCategorycode = careerCategorycode;
    }

    /**
     * HDSD00_13_01.CAREER_CATEGORY
     *
     * @return the value of HDSD00_13_01.CAREER_CATEGORY
     */
    public String getCareerCategory() {
        return careerCategory;
    }

    /**
     * HDSD00_13_01.CAREER_CATEGORY
     *
     * @param careerCategory the value for HDSD00_13_01.CAREER_CATEGORY
     */
    public void setCareerCategory(String careerCategory) {
        this.careerCategory = careerCategory;
    }

    /**
     * HDSD00_13_01.ATTEND_SIGNDATE
     *
     * @return the value of HDSD00_13_01.ATTEND_SIGNDATE
     */
    public String getAttendSigndate() {
        return attendSigndate;
    }

    /**
     * HDSD00_13_01.ATTEND_SIGNDATE
     *
     * @param attendSigndate the value for HDSD00_13_01.ATTEND_SIGNDATE
     */
    public void setAttendSigndate(String attendSigndate) {
        this.attendSigndate = attendSigndate;
    }

    /**
     * HDSD00_13_01.ATTEND_NAME
     *
     * @return the value of HDSD00_13_01.ATTEND_NAME
     */
    public String getAttendName() {
        return attendName;
    }

    /**
     * HDSD00_13_01.ATTEND_NAME
     *
     * @param attendName the value for HDSD00_13_01.ATTEND_NAME
     */
    public void setAttendName(String attendName) {
        this.attendName = attendName;
    }

    /**
     * HDSD00_13_01.ATTEND_CODE
     *
     * @return the value of HDSD00_13_01.ATTEND_CODE
     */
    public String getAttendCode() {
        return attendCode;
    }

    /**
     * HDSD00_13_01.ATTEND_CODE
     *
     * @param attendCode the value for HDSD00_13_01.ATTEND_CODE
     */
    public void setAttendCode(String attendCode) {
        this.attendCode = attendCode;
    }

    /**
     * HDSD00_13_01.ATTENDING_SIGNDATE
     *
     * @return the value of HDSD00_13_01.ATTENDING_SIGNDATE
     */
    public String getAttendingSigndate() {
        return attendingSigndate;
    }

    /**
     * HDSD00_13_01.ATTENDING_SIGNDATE
     *
     * @param attendingSigndate the value for HDSD00_13_01.ATTENDING_SIGNDATE
     */
    public void setAttendingSigndate(String attendingSigndate) {
        this.attendingSigndate = attendingSigndate;
    }

    /**
     * HDSD00_13_01.ATTENDING_NAME
     *
     * @return the value of HDSD00_13_01.ATTENDING_NAME
     */
    public String getAttendingName() {
        return attendingName;
    }

    /**
     * HDSD00_13_01.ATTENDING_NAME
     *
     * @param attendingName the value for HDSD00_13_01.ATTENDING_NAME
     */
    public void setAttendingName(String attendingName) {
        this.attendingName = attendingName;
    }

    /**
     * HDSD00_13_01.ATTENDING_CODE
     *
     * @return the value of HDSD00_13_01.ATTENDING_CODE
     */
    public String getAttendingCode() {
        return attendingCode;
    }

    /**
     * HDSD00_13_01.ATTENDING_CODE
     *
     * @param attendingCode the value for HDSD00_13_01.ATTENDING_CODE
     */
    public void setAttendingCode(String attendingCode) {
        this.attendingCode = attendingCode;
    }

    /**
     * HDSD00_13_01.AGE_UNIT
     *
     * @return the value of HDSD00_13_01.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_13_01.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_13_01.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_13_01.AGE
     *
     * @return the value of HDSD00_13_01.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_13_01.AGE
     *
     * @param age the value for HDSD00_13_01.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_13_01.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_13_01.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_13_01.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_13_01.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_13_01.VISIT_DATE
     *
     * @return the value of HDSD00_13_01.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_13_01.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_13_01.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_13_01.ADMISSION_STATUS
     *
     * @return the value of HDSD00_13_01.ADMISSION_STATUS
     */
    public String getAdmissionStatus() {
        return admissionStatus;
    }

    /**
     * HDSD00_13_01.ADMISSION_STATUS
     *
     * @param admissionStatus the value for HDSD00_13_01.ADMISSION_STATUS
     */
    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus;
    }

    /**
     * HDSD00_13_01.ADMISSION_DATE
     *
     * @return the value of HDSD00_13_01.ADMISSION_DATE
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * HDSD00_13_01.ADMISSION_DATE
     *
     * @param admissionDate the value for HDSD00_13_01.ADMISSION_DATE
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    /**
     * HDSD00_13_01.WARD_NAME
     *
     * @return the value of HDSD00_13_01.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_13_01.WARD_NAME
     *
     * @param wardName the value for HDSD00_13_01.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_13_01.WARD_ID
     *
     * @return the value of HDSD00_13_01.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_13_01.WARD_ID
     *
     * @param wardId the value for HDSD00_13_01.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_13_01.WARDS_NAME
     *
     * @return the value of HDSD00_13_01.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_13_01.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_13_01.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_13_01.WARDS_ID
     *
     * @return the value of HDSD00_13_01.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_13_01.WARDS_ID
     *
     * @param wardsId the value for HDSD00_13_01.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_13_01.HOSPITAL_NAME
     *
     * @return the value of HDSD00_13_01.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_13_01.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_13_01.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_13_01.HOSPITAL_CODE
     *
     * @return the value of HDSD00_13_01.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_13_01.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_13_01.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_13_01.DEPT_NAME
     *
     * @return the value of HDSD00_13_01.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_13_01.DEPT_NAME
     *
     * @param deptName the value for HDSD00_13_01.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_13_01.DEPT_CODE
     *
     * @return the value of HDSD00_13_01.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_13_01.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_13_01.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_13_01.BED_NO
     *
     * @return the value of HDSD00_13_01.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_13_01.BED_NO
     *
     * @param bedNo the value for HDSD00_13_01.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_13_01.BED_NAME
     *
     * @return the value of HDSD00_13_01.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_13_01.BED_NAME
     *
     * @param bedName the value for HDSD00_13_01.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    public String getOpenCode() {
        return openCode;
    }

    public void setOpenCode(String openCode) {
        this.openCode = openCode;
    }

    public String getOpenName() {
        return openName;
    }

    public void setOpenName(String openName) {
        this.openName = openName;
    }

    public String getOpenSigndate() {
        return openSigndate;
    }

    public void setOpenSigndate(String openSigndate) {
        this.openSigndate = openSigndate;
    }
}