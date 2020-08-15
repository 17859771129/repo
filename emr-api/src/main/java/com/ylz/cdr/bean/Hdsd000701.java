package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_07_01")
public class Hdsd000701 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_07_01
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_07_01.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_07_01.status
     */
    private String status;
    /**
     * HDSD00_07_01.pk
     */
    private Integer pk;
    /**
     * HDSD00_07_01.empi
     */
    private String empi;
    /**
     * HDSD00_07_01.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_07_01.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_07_01.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_07_01.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_07_01.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_07_01.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_07_01.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_07_01.VERSION
     */
    private String version;
    /**
     * HDSD00_07_01.TUMOR_SIZE
     */
    private String tumorSize;
    /**
     * HDSD00_07_01.TUMORIGENIC_SITE
     */
    private String tumorigenicSite;
    /**
     * HDSD00_07_01.SYSTOLIC_BLOOD_PRESSURE
     */
    private String systolicBloodPressure;
    /**
     * HDSD00_07_01.SURGEON_NAME
     */
    private String surgeonName;
    /**
     * HDSD00_07_01.SURGEON_CODE
     */
    private String surgeonCode;
    /**
     * HDSD00_07_01.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_07_01.RECORDER_NAME
     */
    private String recorderName;
    /**
     * HDSD00_07_01.RECORDER_CODE
     */
    private String recorderCode;
    /**
     * HDSD00_07_01.PUTERINE_CONTRACTION
     */
    private String puterineContraction;
    /**
     * HDSD00_07_01.PULSE
     */
    private String pulse;
    /**
     * HDSD00_07_01.PPH
     */
    private String pph;
    /**
     * HDSD00_07_01.POSTPARTUM_DIAGNOSIS
     */
    private String postpartumDiagnosis;
    /**
     * HDSD00_07_01.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_07_01.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_07_01.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_07_01.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_07_01.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_07_01.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_07_01.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_07_01.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_07_01.OBSERVATION_DATE
     */
    private String observationDate;
    /**
     * HDSD00_07_01.NEONATAL_WEIGHT
     */
    private String neonatalWeight;
    /**
     * HDSD00_07_01.NEONATAL_SEX_CODE
     */
    private String neonatalSexCode;
    /**
     * HDSD00_07_01.NEONATAL_ABNORMALCODE
     */
    private String neonatalAbnormalcode;
    /**
     * HDSD00_07_01.NEONATAL_ABNORMAL
     */
    private String neonatalAbnormal;
    /**
     * HDSD00_07_01.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_07_01.INSTRUMENT_NAME
     */
    private String instrumentName;
    /**
     * HDSD00_07_01.INSTRUMENT_CODE
     */
    private String instrumentCode;
    /**
     * HDSD00_07_01.INSTRUCTOR_NAME
     */
    private String instructorName;
    /**
     * HDSD00_07_01.INSTRUCTOR_CODE
     */
    private String instructorCode;
    /**
     * HDSD00_07_01.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_07_01.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_07_01.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_07_01.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_07_01.HEART_RATE
     */
    private String heartRate;
    /**
     * HDSD00_07_01.FUNDUS_HEIGHT
     */
    private String fundusHeight;
    /**
     * HDSD00_07_01.EXAM_TIME
     */
    private String examTime;
    /**
     * HDSD00_07_01.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_07_01.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_07_01.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_07_01.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_07_01.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_07_01.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_07_01.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_07_01.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_07_01.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_07_01.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_07_01.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_07_01.DIASTOLIC_PRESSURE
     */
    private String diastolicPressure;
    /**
     * HDSD00_07_01.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_07_01.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_07_01.CONTACT_NUMBER
     */
    private String contactNumber;
    /**
     * HDSD00_07_01.CONTACT_NAME
     */
    private String contactName;
    /**
     * HDSD00_07_01.CHILDBIRTH_OUTCOMECODE
     */
    private String childbirthOutcomecode;
    /**
     * HDSD00_07_01.CHILDBIRTH_OUTCOME
     */
    private String childbirthOutcome;
    /**
     * HDSD00_07_01.BIRTH_LENGTH
     */
    private String birthLength;
    /**
     * HDSD00_07_01.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_07_01.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_07_01.BABY_CAREGIVERCODE
     */
    private String babyCaregivercode;
    /**
     * HDSD00_07_01.BABY_CAREGIVER
     */
    private String babyCaregiver;
    /**
     * HDSD00_07_01.ASSISTANT_NAME
     */
    private String assistantName;
    /**
     * HDSD00_07_01.ASSISTANT_CODE
     */
    private String assistantCode;
    /**
     * HDSD00_07_01.APGAR_SCORE_INTERVALCODE
     */
    private String apgarScoreIntervalcode;
    /**
     * HDSD00_07_01.APGAR_SCORE
     */
    private String apgarScore;
    /**
     * HDSD00_07_01.ANESTH_NAME
     */
    private String anesthName;
    /**
     * HDSD00_07_01.ANESTH_CODE
     */
    private String anesthCode;
    /**
     * HDSD00_07_01.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_07_01.AGE
     */
    private String age;
    /**
     * HDSD00_07_01.OPER_DURATION
     */
    private String operDuration;
    /**
     * HDSD00_07_01.OPER_END_DATE
     */
    private String operEndDate;
    /**
     * HDSD00_07_01.OTHER_SITUATION
     */
    private String otherSituation;
    /**
     * HDSD00_07_01.OTHER_MEDICAL
     */
    private String otherMedical;
    /**
     * HDSD00_07_01.OXYGEN_SUPPLY_TIME
     */
    private String oxygenSupplyTime;
    /**
     * HDSD00_07_01.INFUSION_VOLUME
     */
    private String infusionVolume;
    /**
     * HDSD00_07_01.BLOOD_VOLUME
     */
    private String bloodVolume;
    /**
     * HDSD00_07_01.BLOOD_COMPONENT
     */
    private String bloodComponent;
    /**
     * HDSD00_07_01.BLEEDING
     */
    private String bleeding;
    /**
     * HDSD00_07_01.OPER_MATERNAL_STATUS
     */
    private String operMaternalStatus;
    /**
     * HDSD00_07_01.IUI_SEARCH
     */
    private String iuiSearch;
    /**
     * HDSD00_07_01.IUI_SEARCH_MYOMA
     */
    private String iuiSearchMyoma;
    /**
     * HDSD00_07_01.IUI_SEARCH_UNUSUAL
     */
    private String iuiSearchUnusual;
    /**
     * HDSD00_07_01.CELIAC_ANNEX
     */
    private String celiacAnnex;
    /**
     * HDSD00_07_01.CELIAC_UTERUS
     */
    private String celiacUterus;
    /**
     * HDSD00_07_01.SURGICAL_DOSAGE
     */
    private String surgicalDosage;
    /**
     * HDSD00_07_01.OPER_MEDICATION
     */
    private String operMedication;
    /**
     * HDSD00_07_01.OXYTOCIN_USE
     */
    private String oxytocinUse;
    /**
     * HDSD00_07_01.OXYTOCIN_NAME
     */
    private String oxytocinName;
    /**
     * HDSD00_07_01.UTERINE_WALL_SUTURE
     */
    private String uterineWallSuture;
    /**
     * HDSD00_07_01.CORD_BLOOD_MARK
     */
    private String cordBloodMark;
    /**
     * HDSD00_07_01.UMBILICAL_TORSION
     */
    private String umbilicalTorsion;
    /**
     * HDSD00_07_01.UMBILICAL_ENTANGLEMENT
     */
    private String umbilicalEntanglement;
    /**
     * HDSD00_07_01.MEMBRANE_YELLOWING
     */
    private String membraneYellowing;
    /**
     * HDSD00_07_01.PLACENTAL_YELLOWING
     */
    private String placentalYellowing;
    /**
     * HDSD00_07_01.FETAL_DELIVERY_MODE
     */
    private String fetalDeliveryMode;
    /**
     * HDSD00_07_01.TIRE_CODE
     */
    private String tireCode;
    /**
     * HDSD00_07_01.UTERINE_CONDITION
     */
    private String uterineCondition;
    /**
     * HDSD00_07_01.CESAREAN_PROCEDURE
     */
    private String cesareanProcedure;
    /**
     * HDSD00_07_01.ANES_EFFECT
     */
    private String anesEffect;
    /**
     * HDSD00_07_01.ANESPOSTURE
     */
    private String anesposture;
    /**
     * HDSD00_07_01.ANES_METHOD_CODE
     */
    private String anesMethodCode;
    /**
     * HDSD00_07_01.OPER_START_DATE
     */
    private String operStartDate;
    /**
     * HDSD00_07_01.OPER_NAME
     */
    private String operName;
    /**
     * HDSD00_07_01.OPER_CODE
     */
    private String operCode;
    /**
     * HDSD00_07_01.OPER_SURGICAL
     */
    private String operSurgical;
    /**
     * HDSD00_07_01.PRENATAL_DIAG
     */
    private String prenatalDiag;
    /**
     * HDSD00_07_01.AROUND_NECK
     */
    private String aroundNeck;
    /**
     * HDSD00_07_01.UMBILICAL_LENGTH
     */
    private String umbilicalLength;
    /**
     * HDSD00_07_01.MEMBRANE_MARK
     */
    private String membraneMark;
    /**
     * HDSD00_07_01.WAITING_DATE
     */
    private String waitingDate;
    /**
     * HDSD00_07_01.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_07_01.ANES_METHOD_NAME
     */
    private String anesMethodName;
    /**
     * HDSD00_07_01.TIRE_NAME
     */
    private String tireName;
    /**
     * HDSD00_07_01.NEONATAL_SEX_NAME
     */
    private String neonatalSexName;
    /**
     * HDSD00_07_01.APGAR_SCORE_INTERVAL
     */
    private String apgarScoreInterval;

    /**
     * HDSD00_07_01.upload_time
     *
     * @return the value of HDSD00_07_01.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_07_01.upload_time
     *
     * @param uploadTime the value for HDSD00_07_01.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_07_01.status
     *
     * @return the value of HDSD00_07_01.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_07_01.status
     *
     * @param status the value for HDSD00_07_01.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_07_01.pk
     *
     * @return the value of HDSD00_07_01.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_07_01.pk
     *
     * @param pk the value for HDSD00_07_01.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_07_01.empi
     *
     * @return the value of HDSD00_07_01.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_07_01.empi
     *
     * @param empi the value for HDSD00_07_01.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_07_01.ENCOUNTER_ID
     *
     * @return the value of HDSD00_07_01.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_07_01.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_07_01.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_07_01.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_07_01.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_07_01.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_07_01.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_07_01.WARD_NAME
     *
     * @return the value of HDSD00_07_01.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_07_01.WARD_NAME
     *
     * @param wardName the value for HDSD00_07_01.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_07_01.WARD_ID
     *
     * @return the value of HDSD00_07_01.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_07_01.WARD_ID
     *
     * @param wardId the value for HDSD00_07_01.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_07_01.WARDS_NAME
     *
     * @return the value of HDSD00_07_01.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_07_01.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_07_01.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_07_01.WARDS_ID
     *
     * @return the value of HDSD00_07_01.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_07_01.WARDS_ID
     *
     * @param wardsId the value for HDSD00_07_01.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_07_01.VISIT_DATE
     *
     * @return the value of HDSD00_07_01.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_07_01.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_07_01.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_07_01.VERSION
     *
     * @return the value of HDSD00_07_01.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_07_01.VERSION
     *
     * @param version the value for HDSD00_07_01.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_07_01.TUMOR_SIZE
     *
     * @return the value of HDSD00_07_01.TUMOR_SIZE
     */
    public String getTumorSize() {
        return tumorSize;
    }

    /**
     * HDSD00_07_01.TUMOR_SIZE
     *
     * @param tumorSize the value for HDSD00_07_01.TUMOR_SIZE
     */
    public void setTumorSize(String tumorSize) {
        this.tumorSize = tumorSize;
    }

    /**
     * HDSD00_07_01.TUMORIGENIC_SITE
     *
     * @return the value of HDSD00_07_01.TUMORIGENIC_SITE
     */
    public String getTumorigenicSite() {
        return tumorigenicSite;
    }

    /**
     * HDSD00_07_01.TUMORIGENIC_SITE
     *
     * @param tumorigenicSite the value for HDSD00_07_01.TUMORIGENIC_SITE
     */
    public void setTumorigenicSite(String tumorigenicSite) {
        this.tumorigenicSite = tumorigenicSite;
    }

    /**
     * HDSD00_07_01.SYSTOLIC_BLOOD_PRESSURE
     *
     * @return the value of HDSD00_07_01.SYSTOLIC_BLOOD_PRESSURE
     */
    public String getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    /**
     * HDSD00_07_01.SYSTOLIC_BLOOD_PRESSURE
     *
     * @param systolicBloodPressure the value for HDSD00_07_01.SYSTOLIC_BLOOD_PRESSURE
     */
    public void setSystolicBloodPressure(String systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    /**
     * HDSD00_07_01.SURGEON_NAME
     *
     * @return the value of HDSD00_07_01.SURGEON_NAME
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * HDSD00_07_01.SURGEON_NAME
     *
     * @param surgeonName the value for HDSD00_07_01.SURGEON_NAME
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }

    /**
     * HDSD00_07_01.SURGEON_CODE
     *
     * @return the value of HDSD00_07_01.SURGEON_CODE
     */
    public String getSurgeonCode() {
        return surgeonCode;
    }

    /**
     * HDSD00_07_01.SURGEON_CODE
     *
     * @param surgeonCode the value for HDSD00_07_01.SURGEON_CODE
     */
    public void setSurgeonCode(String surgeonCode) {
        this.surgeonCode = surgeonCode;
    }

    /**
     * HDSD00_07_01.REPORT_TITLE
     *
     * @return the value of HDSD00_07_01.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_07_01.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_07_01.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_07_01.RECORDER_NAME
     *
     * @return the value of HDSD00_07_01.RECORDER_NAME
     */
    public String getRecorderName() {
        return recorderName;
    }

    /**
     * HDSD00_07_01.RECORDER_NAME
     *
     * @param recorderName the value for HDSD00_07_01.RECORDER_NAME
     */
    public void setRecorderName(String recorderName) {
        this.recorderName = recorderName;
    }

    /**
     * HDSD00_07_01.RECORDER_CODE
     *
     * @return the value of HDSD00_07_01.RECORDER_CODE
     */
    public String getRecorderCode() {
        return recorderCode;
    }

    /**
     * HDSD00_07_01.RECORDER_CODE
     *
     * @param recorderCode the value for HDSD00_07_01.RECORDER_CODE
     */
    public void setRecorderCode(String recorderCode) {
        this.recorderCode = recorderCode;
    }

    /**
     * HDSD00_07_01.PUTERINE_CONTRACTION
     *
     * @return the value of HDSD00_07_01.PUTERINE_CONTRACTION
     */
    public String getPuterineContraction() {
        return puterineContraction;
    }

    /**
     * HDSD00_07_01.PUTERINE_CONTRACTION
     *
     * @param puterineContraction the value for HDSD00_07_01.PUTERINE_CONTRACTION
     */
    public void setPuterineContraction(String puterineContraction) {
        this.puterineContraction = puterineContraction;
    }

    /**
     * HDSD00_07_01.PULSE
     *
     * @return the value of HDSD00_07_01.PULSE
     */
    public String getPulse() {
        return pulse;
    }

    /**
     * HDSD00_07_01.PULSE
     *
     * @param pulse the value for HDSD00_07_01.PULSE
     */
    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    /**
     * HDSD00_07_01.PPH
     *
     * @return the value of HDSD00_07_01.PPH
     */
    public String getPph() {
        return pph;
    }

    /**
     * HDSD00_07_01.PPH
     *
     * @param pph the value for HDSD00_07_01.PPH
     */
    public void setPph(String pph) {
        this.pph = pph;
    }

    /**
     * HDSD00_07_01.POSTPARTUM_DIAGNOSIS
     *
     * @return the value of HDSD00_07_01.POSTPARTUM_DIAGNOSIS
     */
    public String getPostpartumDiagnosis() {
        return postpartumDiagnosis;
    }

    /**
     * HDSD00_07_01.POSTPARTUM_DIAGNOSIS
     *
     * @param postpartumDiagnosis the value for HDSD00_07_01.POSTPARTUM_DIAGNOSIS
     */
    public void setPostpartumDiagnosis(String postpartumDiagnosis) {
        this.postpartumDiagnosis = postpartumDiagnosis;
    }

    /**
     * HDSD00_07_01.PATIENT_NAME
     *
     * @return the value of HDSD00_07_01.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_07_01.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_07_01.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_07_01.PATIENT_TYPE
     *
     * @return the value of HDSD00_07_01.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_07_01.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_07_01.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_07_01.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_07_01.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_07_01.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_07_01.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_07_01.VISIT_TIMES
     *
     * @return the value of HDSD00_07_01.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_07_01.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_07_01.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_07_01.VISIT_ID
     *
     * @return the value of HDSD00_07_01.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_07_01.VISIT_ID
     *
     * @param visitId the value for HDSD00_07_01.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_07_01.VISIT_DOMAIN
     *
     * @return the value of HDSD00_07_01.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_07_01.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_07_01.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_07_01.PATIENT_ID
     *
     * @return the value of HDSD00_07_01.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_07_01.PATIENT_ID
     *
     * @param patientId the value for HDSD00_07_01.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_07_01.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_07_01.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_07_01.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_07_01.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_07_01.OBSERVATION_DATE
     *
     * @return the value of HDSD00_07_01.OBSERVATION_DATE
     */
    public String getObservationDate() {
        return observationDate;
    }

    /**
     * HDSD00_07_01.OBSERVATION_DATE
     *
     * @param observationDate the value for HDSD00_07_01.OBSERVATION_DATE
     */
    public void setObservationDate(String observationDate) {
        this.observationDate = observationDate;
    }

    /**
     * HDSD00_07_01.NEONATAL_WEIGHT
     *
     * @return the value of HDSD00_07_01.NEONATAL_WEIGHT
     */
    public String getNeonatalWeight() {
        return neonatalWeight;
    }

    /**
     * HDSD00_07_01.NEONATAL_WEIGHT
     *
     * @param neonatalWeight the value for HDSD00_07_01.NEONATAL_WEIGHT
     */
    public void setNeonatalWeight(String neonatalWeight) {
        this.neonatalWeight = neonatalWeight;
    }

    /**
     * HDSD00_07_01.NEONATAL_SEX_CODE
     *
     * @return the value of HDSD00_07_01.NEONATAL_SEX_CODE
     */
    public String getNeonatalSexCode() {
        return neonatalSexCode;
    }

    /**
     * HDSD00_07_01.NEONATAL_SEX_CODE
     *
     * @param neonatalSexCode the value for HDSD00_07_01.NEONATAL_SEX_CODE
     */
    public void setNeonatalSexCode(String neonatalSexCode) {
        this.neonatalSexCode = neonatalSexCode;
    }

    /**
     * HDSD00_07_01.NEONATAL_ABNORMALCODE
     *
     * @return the value of HDSD00_07_01.NEONATAL_ABNORMALCODE
     */
    public String getNeonatalAbnormalcode() {
        return neonatalAbnormalcode;
    }

    /**
     * HDSD00_07_01.NEONATAL_ABNORMALCODE
     *
     * @param neonatalAbnormalcode the value for HDSD00_07_01.NEONATAL_ABNORMALCODE
     */
    public void setNeonatalAbnormalcode(String neonatalAbnormalcode) {
        this.neonatalAbnormalcode = neonatalAbnormalcode;
    }

    /**
     * HDSD00_07_01.NEONATAL_ABNORMAL
     *
     * @return the value of HDSD00_07_01.NEONATAL_ABNORMAL
     */
    public String getNeonatalAbnormal() {
        return neonatalAbnormal;
    }

    /**
     * HDSD00_07_01.NEONATAL_ABNORMAL
     *
     * @param neonatalAbnormal the value for HDSD00_07_01.NEONATAL_ABNORMAL
     */
    public void setNeonatalAbnormal(String neonatalAbnormal) {
        this.neonatalAbnormal = neonatalAbnormal;
    }

    /**
     * HDSD00_07_01.LOAD_TYPE
     *
     * @return the value of HDSD00_07_01.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_07_01.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_07_01.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_07_01.INSTRUMENT_NAME
     *
     * @return the value of HDSD00_07_01.INSTRUMENT_NAME
     */
    public String getInstrumentName() {
        return instrumentName;
    }

    /**
     * HDSD00_07_01.INSTRUMENT_NAME
     *
     * @param instrumentName the value for HDSD00_07_01.INSTRUMENT_NAME
     */
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    /**
     * HDSD00_07_01.INSTRUMENT_CODE
     *
     * @return the value of HDSD00_07_01.INSTRUMENT_CODE
     */
    public String getInstrumentCode() {
        return instrumentCode;
    }

    /**
     * HDSD00_07_01.INSTRUMENT_CODE
     *
     * @param instrumentCode the value for HDSD00_07_01.INSTRUMENT_CODE
     */
    public void setInstrumentCode(String instrumentCode) {
        this.instrumentCode = instrumentCode;
    }

    /**
     * HDSD00_07_01.INSTRUCTOR_NAME
     *
     * @return the value of HDSD00_07_01.INSTRUCTOR_NAME
     */
    public String getInstructorName() {
        return instructorName;
    }

    /**
     * HDSD00_07_01.INSTRUCTOR_NAME
     *
     * @param instructorName the value for HDSD00_07_01.INSTRUCTOR_NAME
     */
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    /**
     * HDSD00_07_01.INSTRUCTOR_CODE
     *
     * @return the value of HDSD00_07_01.INSTRUCTOR_CODE
     */
    public String getInstructorCode() {
        return instructorCode;
    }

    /**
     * HDSD00_07_01.INSTRUCTOR_CODE
     *
     * @param instructorCode the value for HDSD00_07_01.INSTRUCTOR_CODE
     */
    public void setInstructorCode(String instructorCode) {
        this.instructorCode = instructorCode;
    }

    /**
     * HDSD00_07_01.INPATIENT
     *
     * @return the value of HDSD00_07_01.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_07_01.INPATIENT
     *
     * @param inpatient the value for HDSD00_07_01.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_07_01.ID_NUM
     *
     * @return the value of HDSD00_07_01.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_07_01.ID_NUM
     *
     * @param idNum the value for HDSD00_07_01.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_07_01.HOSPITAL_NAME
     *
     * @return the value of HDSD00_07_01.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_07_01.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_07_01.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_07_01.HOSPITAL_CODE
     *
     * @return the value of HDSD00_07_01.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_07_01.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_07_01.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_07_01.HEART_RATE
     *
     * @return the value of HDSD00_07_01.HEART_RATE
     */
    public String getHeartRate() {
        return heartRate;
    }

    /**
     * HDSD00_07_01.HEART_RATE
     *
     * @param heartRate the value for HDSD00_07_01.HEART_RATE
     */
    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * HDSD00_07_01.FUNDUS_HEIGHT
     *
     * @return the value of HDSD00_07_01.FUNDUS_HEIGHT
     */
    public String getFundusHeight() {
        return fundusHeight;
    }

    /**
     * HDSD00_07_01.FUNDUS_HEIGHT
     *
     * @param fundusHeight the value for HDSD00_07_01.FUNDUS_HEIGHT
     */
    public void setFundusHeight(String fundusHeight) {
        this.fundusHeight = fundusHeight;
    }

    /**
     * HDSD00_07_01.EXAM_TIME
     *
     * @return the value of HDSD00_07_01.EXAM_TIME
     */
    public String getExamTime() {
        return examTime;
    }

    /**
     * HDSD00_07_01.EXAM_TIME
     *
     * @param examTime the value for HDSD00_07_01.EXAM_TIME
     */
    public void setExamTime(String examTime) {
        this.examTime = examTime;
    }

    /**
     * HDSD00_07_01.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_07_01.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_07_01.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_07_01.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_07_01.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_07_01.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_07_01.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_07_01.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_07_01.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_07_01.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_07_01.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_07_01.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_07_01.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_07_01.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_07_01.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_07_01.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_07_01.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_07_01.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_07_01.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_07_01.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_07_01.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_07_01.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_07_01.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_07_01.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_07_01.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_07_01.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_07_01.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_07_01.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_07_01.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_07_01.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_07_01.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_07_01.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_07_01.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_07_01.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_07_01.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_07_01.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_07_01.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_07_01.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_07_01.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_07_01.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_07_01.DOC_AUTHOR
     *
     * @return the value of HDSD00_07_01.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_07_01.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_07_01.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_07_01.DIASTOLIC_PRESSURE
     *
     * @return the value of HDSD00_07_01.DIASTOLIC_PRESSURE
     */
    public String getDiastolicPressure() {
        return diastolicPressure;
    }

    /**
     * HDSD00_07_01.DIASTOLIC_PRESSURE
     *
     * @param diastolicPressure the value for HDSD00_07_01.DIASTOLIC_PRESSURE
     */
    public void setDiastolicPressure(String diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    /**
     * HDSD00_07_01.DEPT_NAME
     *
     * @return the value of HDSD00_07_01.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_07_01.DEPT_NAME
     *
     * @param deptName the value for HDSD00_07_01.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_07_01.DEPT_CODE
     *
     * @return the value of HDSD00_07_01.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_07_01.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_07_01.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_07_01.CONTACT_NUMBER
     *
     * @return the value of HDSD00_07_01.CONTACT_NUMBER
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * HDSD00_07_01.CONTACT_NUMBER
     *
     * @param contactNumber the value for HDSD00_07_01.CONTACT_NUMBER
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * HDSD00_07_01.CONTACT_NAME
     *
     * @return the value of HDSD00_07_01.CONTACT_NAME
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * HDSD00_07_01.CONTACT_NAME
     *
     * @param contactName the value for HDSD00_07_01.CONTACT_NAME
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * HDSD00_07_01.CHILDBIRTH_OUTCOMECODE
     *
     * @return the value of HDSD00_07_01.CHILDBIRTH_OUTCOMECODE
     */
    public String getChildbirthOutcomecode() {
        return childbirthOutcomecode;
    }

    /**
     * HDSD00_07_01.CHILDBIRTH_OUTCOMECODE
     *
     * @param childbirthOutcomecode the value for HDSD00_07_01.CHILDBIRTH_OUTCOMECODE
     */
    public void setChildbirthOutcomecode(String childbirthOutcomecode) {
        this.childbirthOutcomecode = childbirthOutcomecode;
    }

    /**
     * HDSD00_07_01.CHILDBIRTH_OUTCOME
     *
     * @return the value of HDSD00_07_01.CHILDBIRTH_OUTCOME
     */
    public String getChildbirthOutcome() {
        return childbirthOutcome;
    }

    /**
     * HDSD00_07_01.CHILDBIRTH_OUTCOME
     *
     * @param childbirthOutcome the value for HDSD00_07_01.CHILDBIRTH_OUTCOME
     */
    public void setChildbirthOutcome(String childbirthOutcome) {
        this.childbirthOutcome = childbirthOutcome;
    }

    /**
     * HDSD00_07_01.BIRTH_LENGTH
     *
     * @return the value of HDSD00_07_01.BIRTH_LENGTH
     */
    public String getBirthLength() {
        return birthLength;
    }

    /**
     * HDSD00_07_01.BIRTH_LENGTH
     *
     * @param birthLength the value for HDSD00_07_01.BIRTH_LENGTH
     */
    public void setBirthLength(String birthLength) {
        this.birthLength = birthLength;
    }

    /**
     * HDSD00_07_01.BED_NO
     *
     * @return the value of HDSD00_07_01.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_07_01.BED_NO
     *
     * @param bedNo the value for HDSD00_07_01.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_07_01.BED_NAME
     *
     * @return the value of HDSD00_07_01.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_07_01.BED_NAME
     *
     * @param bedName the value for HDSD00_07_01.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_07_01.BABY_CAREGIVERCODE
     *
     * @return the value of HDSD00_07_01.BABY_CAREGIVERCODE
     */
    public String getBabyCaregivercode() {
        return babyCaregivercode;
    }

    /**
     * HDSD00_07_01.BABY_CAREGIVERCODE
     *
     * @param babyCaregivercode the value for HDSD00_07_01.BABY_CAREGIVERCODE
     */
    public void setBabyCaregivercode(String babyCaregivercode) {
        this.babyCaregivercode = babyCaregivercode;
    }

    /**
     * HDSD00_07_01.BABY_CAREGIVER
     *
     * @return the value of HDSD00_07_01.BABY_CAREGIVER
     */
    public String getBabyCaregiver() {
        return babyCaregiver;
    }

    /**
     * HDSD00_07_01.BABY_CAREGIVER
     *
     * @param babyCaregiver the value for HDSD00_07_01.BABY_CAREGIVER
     */
    public void setBabyCaregiver(String babyCaregiver) {
        this.babyCaregiver = babyCaregiver;
    }

    /**
     * HDSD00_07_01.ASSISTANT_NAME
     *
     * @return the value of HDSD00_07_01.ASSISTANT_NAME
     */
    public String getAssistantName() {
        return assistantName;
    }

    /**
     * HDSD00_07_01.ASSISTANT_NAME
     *
     * @param assistantName the value for HDSD00_07_01.ASSISTANT_NAME
     */
    public void setAssistantName(String assistantName) {
        this.assistantName = assistantName;
    }

    /**
     * HDSD00_07_01.ASSISTANT_CODE
     *
     * @return the value of HDSD00_07_01.ASSISTANT_CODE
     */
    public String getAssistantCode() {
        return assistantCode;
    }

    /**
     * HDSD00_07_01.ASSISTANT_CODE
     *
     * @param assistantCode the value for HDSD00_07_01.ASSISTANT_CODE
     */
    public void setAssistantCode(String assistantCode) {
        this.assistantCode = assistantCode;
    }

    /**
     * HDSD00_07_01.APGAR_SCORE_INTERVALCODE
     *
     * @return the value of HDSD00_07_01.APGAR_SCORE_INTERVALCODE
     */
    public String getApgarScoreIntervalcode() {
        return apgarScoreIntervalcode;
    }

    /**
     * HDSD00_07_01.APGAR_SCORE_INTERVALCODE
     *
     * @param apgarScoreIntervalcode the value for HDSD00_07_01.APGAR_SCORE_INTERVALCODE
     */
    public void setApgarScoreIntervalcode(String apgarScoreIntervalcode) {
        this.apgarScoreIntervalcode = apgarScoreIntervalcode;
    }

    /**
     * HDSD00_07_01.APGAR_SCORE
     *
     * @return the value of HDSD00_07_01.APGAR_SCORE
     */
    public String getApgarScore() {
        return apgarScore;
    }

    /**
     * HDSD00_07_01.APGAR_SCORE
     *
     * @param apgarScore the value for HDSD00_07_01.APGAR_SCORE
     */
    public void setApgarScore(String apgarScore) {
        this.apgarScore = apgarScore;
    }

    /**
     * HDSD00_07_01.ANESTH_NAME
     *
     * @return the value of HDSD00_07_01.ANESTH_NAME
     */
    public String getAnesthName() {
        return anesthName;
    }

    /**
     * HDSD00_07_01.ANESTH_NAME
     *
     * @param anesthName the value for HDSD00_07_01.ANESTH_NAME
     */
    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName;
    }

    /**
     * HDSD00_07_01.ANESTH_CODE
     *
     * @return the value of HDSD00_07_01.ANESTH_CODE
     */
    public String getAnesthCode() {
        return anesthCode;
    }

    /**
     * HDSD00_07_01.ANESTH_CODE
     *
     * @param anesthCode the value for HDSD00_07_01.ANESTH_CODE
     */
    public void setAnesthCode(String anesthCode) {
        this.anesthCode = anesthCode;
    }

    /**
     * HDSD00_07_01.AGE_UNIT
     *
     * @return the value of HDSD00_07_01.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_07_01.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_07_01.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_07_01.AGE
     *
     * @return the value of HDSD00_07_01.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_07_01.AGE
     *
     * @param age the value for HDSD00_07_01.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_07_01.OPER_DURATION
     *
     * @return the value of HDSD00_07_01.OPER_DURATION
     */
    public String getOperDuration() {
        return operDuration;
    }

    /**
     * HDSD00_07_01.OPER_DURATION
     *
     * @param operDuration the value for HDSD00_07_01.OPER_DURATION
     */
    public void setOperDuration(String operDuration) {
        this.operDuration = operDuration;
    }

    /**
     * HDSD00_07_01.OPER_END_DATE
     *
     * @return the value of HDSD00_07_01.OPER_END_DATE
     */
    public String getOperEndDate() {
        return operEndDate;
    }

    /**
     * HDSD00_07_01.OPER_END_DATE
     *
     * @param operEndDate the value for HDSD00_07_01.OPER_END_DATE
     */
    public void setOperEndDate(String operEndDate) {
        this.operEndDate = operEndDate;
    }

    /**
     * HDSD00_07_01.OTHER_SITUATION
     *
     * @return the value of HDSD00_07_01.OTHER_SITUATION
     */
    public String getOtherSituation() {
        return otherSituation;
    }

    /**
     * HDSD00_07_01.OTHER_SITUATION
     *
     * @param otherSituation the value for HDSD00_07_01.OTHER_SITUATION
     */
    public void setOtherSituation(String otherSituation) {
        this.otherSituation = otherSituation;
    }

    /**
     * HDSD00_07_01.OTHER_MEDICAL
     *
     * @return the value of HDSD00_07_01.OTHER_MEDICAL
     */
    public String getOtherMedical() {
        return otherMedical;
    }

    /**
     * HDSD00_07_01.OTHER_MEDICAL
     *
     * @param otherMedical the value for HDSD00_07_01.OTHER_MEDICAL
     */
    public void setOtherMedical(String otherMedical) {
        this.otherMedical = otherMedical;
    }

    /**
     * HDSD00_07_01.OXYGEN_SUPPLY_TIME
     *
     * @return the value of HDSD00_07_01.OXYGEN_SUPPLY_TIME
     */
    public String getOxygenSupplyTime() {
        return oxygenSupplyTime;
    }

    /**
     * HDSD00_07_01.OXYGEN_SUPPLY_TIME
     *
     * @param oxygenSupplyTime the value for HDSD00_07_01.OXYGEN_SUPPLY_TIME
     */
    public void setOxygenSupplyTime(String oxygenSupplyTime) {
        this.oxygenSupplyTime = oxygenSupplyTime;
    }

    /**
     * HDSD00_07_01.INFUSION_VOLUME
     *
     * @return the value of HDSD00_07_01.INFUSION_VOLUME
     */
    public String getInfusionVolume() {
        return infusionVolume;
    }

    /**
     * HDSD00_07_01.INFUSION_VOLUME
     *
     * @param infusionVolume the value for HDSD00_07_01.INFUSION_VOLUME
     */
    public void setInfusionVolume(String infusionVolume) {
        this.infusionVolume = infusionVolume;
    }

    /**
     * HDSD00_07_01.BLOOD_VOLUME
     *
     * @return the value of HDSD00_07_01.BLOOD_VOLUME
     */
    public String getBloodVolume() {
        return bloodVolume;
    }

    /**
     * HDSD00_07_01.BLOOD_VOLUME
     *
     * @param bloodVolume the value for HDSD00_07_01.BLOOD_VOLUME
     */
    public void setBloodVolume(String bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    /**
     * HDSD00_07_01.BLOOD_COMPONENT
     *
     * @return the value of HDSD00_07_01.BLOOD_COMPONENT
     */
    public String getBloodComponent() {
        return bloodComponent;
    }

    /**
     * HDSD00_07_01.BLOOD_COMPONENT
     *
     * @param bloodComponent the value for HDSD00_07_01.BLOOD_COMPONENT
     */
    public void setBloodComponent(String bloodComponent) {
        this.bloodComponent = bloodComponent;
    }

    /**
     * HDSD00_07_01.BLEEDING
     *
     * @return the value of HDSD00_07_01.BLEEDING
     */
    public String getBleeding() {
        return bleeding;
    }

    /**
     * HDSD00_07_01.BLEEDING
     *
     * @param bleeding the value for HDSD00_07_01.BLEEDING
     */
    public void setBleeding(String bleeding) {
        this.bleeding = bleeding;
    }

    /**
     * HDSD00_07_01.OPER_MATERNAL_STATUS
     *
     * @return the value of HDSD00_07_01.OPER_MATERNAL_STATUS
     */
    public String getOperMaternalStatus() {
        return operMaternalStatus;
    }

    /**
     * HDSD00_07_01.OPER_MATERNAL_STATUS
     *
     * @param operMaternalStatus the value for HDSD00_07_01.OPER_MATERNAL_STATUS
     */
    public void setOperMaternalStatus(String operMaternalStatus) {
        this.operMaternalStatus = operMaternalStatus;
    }

    /**
     * HDSD00_07_01.IUI_SEARCH
     *
     * @return the value of HDSD00_07_01.IUI_SEARCH
     */
    public String getIuiSearch() {
        return iuiSearch;
    }

    /**
     * HDSD00_07_01.IUI_SEARCH
     *
     * @param iuiSearch the value for HDSD00_07_01.IUI_SEARCH
     */
    public void setIuiSearch(String iuiSearch) {
        this.iuiSearch = iuiSearch;
    }

    /**
     * HDSD00_07_01.IUI_SEARCH_MYOMA
     *
     * @return the value of HDSD00_07_01.IUI_SEARCH_MYOMA
     */
    public String getIuiSearchMyoma() {
        return iuiSearchMyoma;
    }

    /**
     * HDSD00_07_01.IUI_SEARCH_MYOMA
     *
     * @param iuiSearchMyoma the value for HDSD00_07_01.IUI_SEARCH_MYOMA
     */
    public void setIuiSearchMyoma(String iuiSearchMyoma) {
        this.iuiSearchMyoma = iuiSearchMyoma;
    }

    /**
     * HDSD00_07_01.IUI_SEARCH_UNUSUAL
     *
     * @return the value of HDSD00_07_01.IUI_SEARCH_UNUSUAL
     */
    public String getIuiSearchUnusual() {
        return iuiSearchUnusual;
    }

    /**
     * HDSD00_07_01.IUI_SEARCH_UNUSUAL
     *
     * @param iuiSearchUnusual the value for HDSD00_07_01.IUI_SEARCH_UNUSUAL
     */
    public void setIuiSearchUnusual(String iuiSearchUnusual) {
        this.iuiSearchUnusual = iuiSearchUnusual;
    }

    /**
     * HDSD00_07_01.CELIAC_ANNEX
     *
     * @return the value of HDSD00_07_01.CELIAC_ANNEX
     */
    public String getCeliacAnnex() {
        return celiacAnnex;
    }

    /**
     * HDSD00_07_01.CELIAC_ANNEX
     *
     * @param celiacAnnex the value for HDSD00_07_01.CELIAC_ANNEX
     */
    public void setCeliacAnnex(String celiacAnnex) {
        this.celiacAnnex = celiacAnnex;
    }

    /**
     * HDSD00_07_01.CELIAC_UTERUS
     *
     * @return the value of HDSD00_07_01.CELIAC_UTERUS
     */
    public String getCeliacUterus() {
        return celiacUterus;
    }

    /**
     * HDSD00_07_01.CELIAC_UTERUS
     *
     * @param celiacUterus the value for HDSD00_07_01.CELIAC_UTERUS
     */
    public void setCeliacUterus(String celiacUterus) {
        this.celiacUterus = celiacUterus;
    }

    /**
     * HDSD00_07_01.SURGICAL_DOSAGE
     *
     * @return the value of HDSD00_07_01.SURGICAL_DOSAGE
     */
    public String getSurgicalDosage() {
        return surgicalDosage;
    }

    /**
     * HDSD00_07_01.SURGICAL_DOSAGE
     *
     * @param surgicalDosage the value for HDSD00_07_01.SURGICAL_DOSAGE
     */
    public void setSurgicalDosage(String surgicalDosage) {
        this.surgicalDosage = surgicalDosage;
    }

    /**
     * HDSD00_07_01.OPER_MEDICATION
     *
     * @return the value of HDSD00_07_01.OPER_MEDICATION
     */
    public String getOperMedication() {
        return operMedication;
    }

    /**
     * HDSD00_07_01.OPER_MEDICATION
     *
     * @param operMedication the value for HDSD00_07_01.OPER_MEDICATION
     */
    public void setOperMedication(String operMedication) {
        this.operMedication = operMedication;
    }

    /**
     * HDSD00_07_01.OXYTOCIN_USE
     *
     * @return the value of HDSD00_07_01.OXYTOCIN_USE
     */
    public String getOxytocinUse() {
        return oxytocinUse;
    }

    /**
     * HDSD00_07_01.OXYTOCIN_USE
     *
     * @param oxytocinUse the value for HDSD00_07_01.OXYTOCIN_USE
     */
    public void setOxytocinUse(String oxytocinUse) {
        this.oxytocinUse = oxytocinUse;
    }

    /**
     * HDSD00_07_01.OXYTOCIN_NAME
     *
     * @return the value of HDSD00_07_01.OXYTOCIN_NAME
     */
    public String getOxytocinName() {
        return oxytocinName;
    }

    /**
     * HDSD00_07_01.OXYTOCIN_NAME
     *
     * @param oxytocinName the value for HDSD00_07_01.OXYTOCIN_NAME
     */
    public void setOxytocinName(String oxytocinName) {
        this.oxytocinName = oxytocinName;
    }

    /**
     * HDSD00_07_01.UTERINE_WALL_SUTURE
     *
     * @return the value of HDSD00_07_01.UTERINE_WALL_SUTURE
     */
    public String getUterineWallSuture() {
        return uterineWallSuture;
    }

    /**
     * HDSD00_07_01.UTERINE_WALL_SUTURE
     *
     * @param uterineWallSuture the value for HDSD00_07_01.UTERINE_WALL_SUTURE
     */
    public void setUterineWallSuture(String uterineWallSuture) {
        this.uterineWallSuture = uterineWallSuture;
    }

    /**
     * HDSD00_07_01.CORD_BLOOD_MARK
     *
     * @return the value of HDSD00_07_01.CORD_BLOOD_MARK
     */
    public String getCordBloodMark() {
        return cordBloodMark;
    }

    /**
     * HDSD00_07_01.CORD_BLOOD_MARK
     *
     * @param cordBloodMark the value for HDSD00_07_01.CORD_BLOOD_MARK
     */
    public void setCordBloodMark(String cordBloodMark) {
        this.cordBloodMark = cordBloodMark;
    }

    /**
     * HDSD00_07_01.UMBILICAL_TORSION
     *
     * @return the value of HDSD00_07_01.UMBILICAL_TORSION
     */
    public String getUmbilicalTorsion() {
        return umbilicalTorsion;
    }

    /**
     * HDSD00_07_01.UMBILICAL_TORSION
     *
     * @param umbilicalTorsion the value for HDSD00_07_01.UMBILICAL_TORSION
     */
    public void setUmbilicalTorsion(String umbilicalTorsion) {
        this.umbilicalTorsion = umbilicalTorsion;
    }

    /**
     * HDSD00_07_01.UMBILICAL_ENTANGLEMENT
     *
     * @return the value of HDSD00_07_01.UMBILICAL_ENTANGLEMENT
     */
    public String getUmbilicalEntanglement() {
        return umbilicalEntanglement;
    }

    /**
     * HDSD00_07_01.UMBILICAL_ENTANGLEMENT
     *
     * @param umbilicalEntanglement the value for HDSD00_07_01.UMBILICAL_ENTANGLEMENT
     */
    public void setUmbilicalEntanglement(String umbilicalEntanglement) {
        this.umbilicalEntanglement = umbilicalEntanglement;
    }

    /**
     * HDSD00_07_01.MEMBRANE_YELLOWING
     *
     * @return the value of HDSD00_07_01.MEMBRANE_YELLOWING
     */
    public String getMembraneYellowing() {
        return membraneYellowing;
    }

    /**
     * HDSD00_07_01.MEMBRANE_YELLOWING
     *
     * @param membraneYellowing the value for HDSD00_07_01.MEMBRANE_YELLOWING
     */
    public void setMembraneYellowing(String membraneYellowing) {
        this.membraneYellowing = membraneYellowing;
    }

    /**
     * HDSD00_07_01.PLACENTAL_YELLOWING
     *
     * @return the value of HDSD00_07_01.PLACENTAL_YELLOWING
     */
    public String getPlacentalYellowing() {
        return placentalYellowing;
    }

    /**
     * HDSD00_07_01.PLACENTAL_YELLOWING
     *
     * @param placentalYellowing the value for HDSD00_07_01.PLACENTAL_YELLOWING
     */
    public void setPlacentalYellowing(String placentalYellowing) {
        this.placentalYellowing = placentalYellowing;
    }

    /**
     * HDSD00_07_01.FETAL_DELIVERY_MODE
     *
     * @return the value of HDSD00_07_01.FETAL_DELIVERY_MODE
     */
    public String getFetalDeliveryMode() {
        return fetalDeliveryMode;
    }

    /**
     * HDSD00_07_01.FETAL_DELIVERY_MODE
     *
     * @param fetalDeliveryMode the value for HDSD00_07_01.FETAL_DELIVERY_MODE
     */
    public void setFetalDeliveryMode(String fetalDeliveryMode) {
        this.fetalDeliveryMode = fetalDeliveryMode;
    }

    /**
     * HDSD00_07_01.TIRE_CODE
     *
     * @return the value of HDSD00_07_01.TIRE_CODE
     */
    public String getTireCode() {
        return tireCode;
    }

    /**
     * HDSD00_07_01.TIRE_CODE
     *
     * @param tireCode the value for HDSD00_07_01.TIRE_CODE
     */
    public void setTireCode(String tireCode) {
        this.tireCode = tireCode;
    }

    /**
     * HDSD00_07_01.UTERINE_CONDITION
     *
     * @return the value of HDSD00_07_01.UTERINE_CONDITION
     */
    public String getUterineCondition() {
        return uterineCondition;
    }

    /**
     * HDSD00_07_01.UTERINE_CONDITION
     *
     * @param uterineCondition the value for HDSD00_07_01.UTERINE_CONDITION
     */
    public void setUterineCondition(String uterineCondition) {
        this.uterineCondition = uterineCondition;
    }

    /**
     * HDSD00_07_01.CESAREAN_PROCEDURE
     *
     * @return the value of HDSD00_07_01.CESAREAN_PROCEDURE
     */
    public String getCesareanProcedure() {
        return cesareanProcedure;
    }

    /**
     * HDSD00_07_01.CESAREAN_PROCEDURE
     *
     * @param cesareanProcedure the value for HDSD00_07_01.CESAREAN_PROCEDURE
     */
    public void setCesareanProcedure(String cesareanProcedure) {
        this.cesareanProcedure = cesareanProcedure;
    }

    /**
     * HDSD00_07_01.ANES_EFFECT
     *
     * @return the value of HDSD00_07_01.ANES_EFFECT
     */
    public String getAnesEffect() {
        return anesEffect;
    }

    /**
     * HDSD00_07_01.ANES_EFFECT
     *
     * @param anesEffect the value for HDSD00_07_01.ANES_EFFECT
     */
    public void setAnesEffect(String anesEffect) {
        this.anesEffect = anesEffect;
    }

    /**
     * HDSD00_07_01.ANESPOSTURE
     *
     * @return the value of HDSD00_07_01.ANESPOSTURE
     */
    public String getAnesposture() {
        return anesposture;
    }

    /**
     * HDSD00_07_01.ANESPOSTURE
     *
     * @param anesposture the value for HDSD00_07_01.ANESPOSTURE
     */
    public void setAnesposture(String anesposture) {
        this.anesposture = anesposture;
    }

    /**
     * HDSD00_07_01.ANES_METHOD_CODE
     *
     * @return the value of HDSD00_07_01.ANES_METHOD_CODE
     */
    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    /**
     * HDSD00_07_01.ANES_METHOD_CODE
     *
     * @param anesMethodCode the value for HDSD00_07_01.ANES_METHOD_CODE
     */
    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode;
    }

    /**
     * HDSD00_07_01.OPER_START_DATE
     *
     * @return the value of HDSD00_07_01.OPER_START_DATE
     */
    public String getOperStartDate() {
        return operStartDate;
    }

    /**
     * HDSD00_07_01.OPER_START_DATE
     *
     * @param operStartDate the value for HDSD00_07_01.OPER_START_DATE
     */
    public void setOperStartDate(String operStartDate) {
        this.operStartDate = operStartDate;
    }

    /**
     * HDSD00_07_01.OPER_NAME
     *
     * @return the value of HDSD00_07_01.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * HDSD00_07_01.OPER_NAME
     *
     * @param operName the value for HDSD00_07_01.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }

    /**
     * HDSD00_07_01.OPER_CODE
     *
     * @return the value of HDSD00_07_01.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * HDSD00_07_01.OPER_CODE
     *
     * @param operCode the value for HDSD00_07_01.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * HDSD00_07_01.OPER_SURGICAL
     *
     * @return the value of HDSD00_07_01.OPER_SURGICAL
     */
    public String getOperSurgical() {
        return operSurgical;
    }

    /**
     * HDSD00_07_01.OPER_SURGICAL
     *
     * @param operSurgical the value for HDSD00_07_01.OPER_SURGICAL
     */
    public void setOperSurgical(String operSurgical) {
        this.operSurgical = operSurgical;
    }

    /**
     * HDSD00_07_01.PRENATAL_DIAG
     *
     * @return the value of HDSD00_07_01.PRENATAL_DIAG
     */
    public String getPrenatalDiag() {
        return prenatalDiag;
    }

    /**
     * HDSD00_07_01.PRENATAL_DIAG
     *
     * @param prenatalDiag the value for HDSD00_07_01.PRENATAL_DIAG
     */
    public void setPrenatalDiag(String prenatalDiag) {
        this.prenatalDiag = prenatalDiag;
    }

    /**
     * HDSD00_07_01.AROUND_NECK
     *
     * @return the value of HDSD00_07_01.AROUND_NECK
     */
    public String getAroundNeck() {
        return aroundNeck;
    }

    /**
     * HDSD00_07_01.AROUND_NECK
     *
     * @param aroundNeck the value for HDSD00_07_01.AROUND_NECK
     */
    public void setAroundNeck(String aroundNeck) {
        this.aroundNeck = aroundNeck;
    }

    /**
     * HDSD00_07_01.UMBILICAL_LENGTH
     *
     * @return the value of HDSD00_07_01.UMBILICAL_LENGTH
     */
    public String getUmbilicalLength() {
        return umbilicalLength;
    }

    /**
     * HDSD00_07_01.UMBILICAL_LENGTH
     *
     * @param umbilicalLength the value for HDSD00_07_01.UMBILICAL_LENGTH
     */
    public void setUmbilicalLength(String umbilicalLength) {
        this.umbilicalLength = umbilicalLength;
    }

    /**
     * HDSD00_07_01.MEMBRANE_MARK
     *
     * @return the value of HDSD00_07_01.MEMBRANE_MARK
     */
    public String getMembraneMark() {
        return membraneMark;
    }

    /**
     * HDSD00_07_01.MEMBRANE_MARK
     *
     * @param membraneMark the value for HDSD00_07_01.MEMBRANE_MARK
     */
    public void setMembraneMark(String membraneMark) {
        this.membraneMark = membraneMark;
    }

    /**
     * HDSD00_07_01.WAITING_DATE
     *
     * @return the value of HDSD00_07_01.WAITING_DATE
     */
    public String getWaitingDate() {
        return waitingDate;
    }

    /**
     * HDSD00_07_01.WAITING_DATE
     *
     * @param waitingDate the value for HDSD00_07_01.WAITING_DATE
     */
    public void setWaitingDate(String waitingDate) {
        this.waitingDate = waitingDate;
    }

    /**
     * HDSD00_07_01.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_07_01.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_07_01.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_07_01.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_07_01.ANES_METHOD_NAME
     *
     * @return the value of HDSD00_07_01.ANES_METHOD_NAME
     */
    public String getAnesMethodName() {
        return anesMethodName;
    }

    /**
     * HDSD00_07_01.ANES_METHOD_NAME
     *
     * @param anesMethodName the value for HDSD00_07_01.ANES_METHOD_NAME
     */
    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName;
    }

    /**
     * HDSD00_07_01.TIRE_NAME
     *
     * @return the value of HDSD00_07_01.TIRE_NAME
     */
    public String getTireName() {
        return tireName;
    }

    /**
     * HDSD00_07_01.TIRE_NAME
     *
     * @param tireName the value for HDSD00_07_01.TIRE_NAME
     */
    public void setTireName(String tireName) {
        this.tireName = tireName;
    }

    /**
     * HDSD00_07_01.NEONATAL_SEX_NAME
     *
     * @return the value of HDSD00_07_01.NEONATAL_SEX_NAME
     */
    public String getNeonatalSexName() {
        return neonatalSexName;
    }

    /**
     * HDSD00_07_01.NEONATAL_SEX_NAME
     *
     * @param neonatalSexName the value for HDSD00_07_01.NEONATAL_SEX_NAME
     */
    public void setNeonatalSexName(String neonatalSexName) {
        this.neonatalSexName = neonatalSexName;
    }

    /**
     * HDSD00_07_01.APGAR_SCORE_INTERVAL
     *
     * @return the value of HDSD00_07_01.APGAR_SCORE_INTERVAL
     */
    public String getApgarScoreInterval() {
        return apgarScoreInterval;
    }

    /**
     * HDSD00_07_01.APGAR_SCORE_INTERVAL
     *
     * @param apgarScoreInterval the value for HDSD00_07_01.APGAR_SCORE_INTERVAL
     */
    public void setApgarScoreInterval(String apgarScoreInterval) {
        this.apgarScoreInterval = apgarScoreInterval;
    }
}