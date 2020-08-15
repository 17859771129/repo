package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_06_04")
public class Hdsd000604 extends BaseBean implements Serializable {
    private static final long serialVersionUID = -7430941929394852815L;
    /**
     * This field corresponds to the database table HDSD00_06_04
     */
    /**
     * HDSD00_06_04.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_06_04.status
     */
    private String status;
    /**
     * HDSD00_06_04.pk
     */
    private Integer pk;
    /**
     * HDSD00_06_04.empi
     */
    private String empi;
    /**
     * HDSD00_06_04.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_06_04.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_06_04.WEIGHT
     */
    private String weight;
    /**
     * HDSD00_06_04.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_06_04.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_06_04.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_06_04.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_06_04.VERSION
     */
    private String version;
    /**
     * HDSD00_06_04.TEMPERATURE
     */
    private String temperature;
    /**
     * HDSD00_06_04.SYSTOLIC_BLOOD_PRESSURE
     */
    private String systolicBloodPressure;
    /**
     * HDSD00_06_04.SPECIAL_MONITORING_RESULT
     */
    private String specialMonitoringResult;
    /**
     * HDSD00_06_04.SPECIAL_MONITORING_NAME
     */
    private String specialMonitoringName;
    /**
     * HDSD00_06_04.RH_GROUP
     */
    private String rhGroup;
    /**
     * HDSD00_06_04.RH_CODE
     */
    private String rhCode;
    /**
     * HDSD00_06_04.RESPIRATORY_FREQUENCY
     */
    private String respiratoryFrequency;
    /**
     * HDSD00_06_04.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_06_04.PULSE_RATE
     */
    private String pulseRate;
    /**
     * HDSD00_06_04.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_06_04.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_06_04.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_06_04.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_06_04.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_06_04.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_06_04.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_06_04.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_06_04.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_06_04.OUT_OPER_DATE
     */
    private String outOperDate;
    /**
     * HDSD00_06_04.MONITOR_RESULT
     */
    private String monitorResult;
    /**
     * HDSD00_06_04.MONITOR_NAME
     */
    private String monitorName;
    /**
     * HDSD00_06_04.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_06_04.INTRAOPERATIVE_INFUSION_ITEM
     */
    private String intraoperativeInfusionItem;
    /**
     * HDSD00_06_04.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_06_04.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_06_04.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_06_04.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_06_04.HEART_RATE
     */
    private String heartRate;
    /**
     * HDSD00_06_04.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_06_04.GENDER
     */
    private String gender;
    /**
     * HDSD00_06_04.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_06_04.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_06_04.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_06_04.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_06_04.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_06_04.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_06_04.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_06_04.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_06_04.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_06_04.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_06_04.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_06_04.DIASTOLIC_PRESSURE
     */
    private String diastolicPressure;
    /**
     * HDSD00_06_04.DESTINATION_CODE
     */
    private String destinationCode;
    /**
     * HDSD00_06_04.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_06_04.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_06_04.BLOOD_VOLUME
     */
    private String bloodVolume;
    /**
     * HDSD00_06_04.BLOOD_VARIETIESCODE
     */
    private String bloodVarietiescode;
    /**
     * HDSD00_06_04.BLOOD_VARIETIES
     */
    private String bloodVarieties;
    /**
     * HDSD00_06_04.BLOOD_UNIT
     */
    private String bloodUnit;
    /**
     * HDSD00_06_04.BLOOD_REACTION_MARK
     */
    private String bloodReactionMark;
    /**
     * HDSD00_06_04.BLOOD_END_DATE
     */
    private String bloodEndDate;
    /**
     * HDSD00_06_04.BLEEDING
     */
    private String bleeding;
    /**
     * HDSD00_06_04.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_06_04.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_06_04.APPY_ID
     */
    private String appyId;
    /**
     * HDSD00_06_04.ANESTH_SIGNDATE
     */
    private String anesthSigndate;
    /**
     * HDSD00_06_04.ANESTH_NAME
     */
    private String anesthName;
    /**
     * HDSD00_06_04.ANESTH_CODE
     */
    private String anesthCode;
    /**
     * HDSD00_06_04.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_06_04.AGE
     */
    private String age;
    /**
     * HDSD00_06_04.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_06_04.TREATMENT_PROCESS
     */
    private String treatmentProcess;
    /**
     * HDSD00_06_04.OPER_POST
     */
    private String operPost;
    /**
     * HDSD00_06_04.OPER_POST_CODE
     */
    private String operPostCode;
    /**
     * HDSD00_06_04.OPER_ROOM
     */
    private String operRoom;
    /**
     * HDSD00_06_04.SURGEON_NAME
     */
    private String surgeonName;
    /**
     * HDSD00_06_04.SURGEON_CODE
     */
    private String surgeonCode;
    /**
     * HDSD00_06_04.OPER_END_DATE
     */
    private String operEndDate;
    /**
     * HDSD00_06_04.OPER_START_DATE
     */
    private String operStartDate;
    /**
     * HDSD00_06_04.OPER_CODE
     */
    private String operCode;
    /**
     * HDSD00_06_04.ADMISSION_DATE
     */
    private String admissionDate;
    /**
     * HDSD00_06_04.ABO_CODE
     */
    private String aboCode;
    /**
     * HDSD00_06_04.ABO
     */
    private String abo;
    /**
     * HDSD00_06_04.OPER_NAME
     */
    private String operName;

    /**
     * HDSD00_06_04.upload_time
     *
     * @return the value of HDSD00_06_04.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_06_04.upload_time
     *
     * @param uploadTime the value for HDSD00_06_04.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_06_04.status
     *
     * @return the value of HDSD00_06_04.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_06_04.status
     *
     * @param status the value for HDSD00_06_04.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_06_04.pk
     *
     * @return the value of HDSD00_06_04.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_06_04.pk
     *
     * @param pk the value for HDSD00_06_04.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_06_04.empi
     *
     * @return the value of HDSD00_06_04.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_06_04.empi
     *
     * @param empi the value for HDSD00_06_04.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_06_04.ENCOUNTER_ID
     *
     * @return the value of HDSD00_06_04.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_06_04.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_06_04.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_06_04.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_06_04.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_06_04.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_06_04.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_06_04.WEIGHT
     *
     * @return the value of HDSD00_06_04.WEIGHT
     */
    public String getWeight() {
        return weight;
    }

    /**
     * HDSD00_06_04.WEIGHT
     *
     * @param weight the value for HDSD00_06_04.WEIGHT
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * HDSD00_06_04.WARD_NAME
     *
     * @return the value of HDSD00_06_04.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_06_04.WARD_NAME
     *
     * @param wardName the value for HDSD00_06_04.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_06_04.WARD_ID
     *
     * @return the value of HDSD00_06_04.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_06_04.WARD_ID
     *
     * @param wardId the value for HDSD00_06_04.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_06_04.WARDS_NAME
     *
     * @return the value of HDSD00_06_04.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_06_04.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_06_04.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_06_04.WARDS_ID
     *
     * @return the value of HDSD00_06_04.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_06_04.WARDS_ID
     *
     * @param wardsId the value for HDSD00_06_04.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_06_04.VERSION
     *
     * @return the value of HDSD00_06_04.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_06_04.VERSION
     *
     * @param version the value for HDSD00_06_04.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_06_04.TEMPERATURE
     *
     * @return the value of HDSD00_06_04.TEMPERATURE
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * HDSD00_06_04.TEMPERATURE
     *
     * @param temperature the value for HDSD00_06_04.TEMPERATURE
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * HDSD00_06_04.SYSTOLIC_BLOOD_PRESSURE
     *
     * @return the value of HDSD00_06_04.SYSTOLIC_BLOOD_PRESSURE
     */
    public String getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    /**
     * HDSD00_06_04.SYSTOLIC_BLOOD_PRESSURE
     *
     * @param systolicBloodPressure the value for HDSD00_06_04.SYSTOLIC_BLOOD_PRESSURE
     */
    public void setSystolicBloodPressure(String systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    /**
     * HDSD00_06_04.SPECIAL_MONITORING_RESULT
     *
     * @return the value of HDSD00_06_04.SPECIAL_MONITORING_RESULT
     */
    public String getSpecialMonitoringResult() {
        return specialMonitoringResult;
    }

    /**
     * HDSD00_06_04.SPECIAL_MONITORING_RESULT
     *
     * @param specialMonitoringResult the value for HDSD00_06_04.SPECIAL_MONITORING_RESULT
     */
    public void setSpecialMonitoringResult(String specialMonitoringResult) {
        this.specialMonitoringResult = specialMonitoringResult;
    }

    /**
     * HDSD00_06_04.SPECIAL_MONITORING_NAME
     *
     * @return the value of HDSD00_06_04.SPECIAL_MONITORING_NAME
     */
    public String getSpecialMonitoringName() {
        return specialMonitoringName;
    }

    /**
     * HDSD00_06_04.SPECIAL_MONITORING_NAME
     *
     * @param specialMonitoringName the value for HDSD00_06_04.SPECIAL_MONITORING_NAME
     */
    public void setSpecialMonitoringName(String specialMonitoringName) {
        this.specialMonitoringName = specialMonitoringName;
    }

    /**
     * HDSD00_06_04.RH_GROUP
     *
     * @return the value of HDSD00_06_04.RH_GROUP
     */
    public String getRhGroup() {
        return rhGroup;
    }

    /**
     * HDSD00_06_04.RH_GROUP
     *
     * @param rhGroup the value for HDSD00_06_04.RH_GROUP
     */
    public void setRhGroup(String rhGroup) {
        this.rhGroup = rhGroup;
    }

    /**
     * HDSD00_06_04.RH_CODE
     *
     * @return the value of HDSD00_06_04.RH_CODE
     */
    public String getRhCode() {
        return rhCode;
    }

    /**
     * HDSD00_06_04.RH_CODE
     *
     * @param rhCode the value for HDSD00_06_04.RH_CODE
     */
    public void setRhCode(String rhCode) {
        this.rhCode = rhCode;
    }

    /**
     * HDSD00_06_04.RESPIRATORY_FREQUENCY
     *
     * @return the value of HDSD00_06_04.RESPIRATORY_FREQUENCY
     */
    public String getRespiratoryFrequency() {
        return respiratoryFrequency;
    }

    /**
     * HDSD00_06_04.RESPIRATORY_FREQUENCY
     *
     * @param respiratoryFrequency the value for HDSD00_06_04.RESPIRATORY_FREQUENCY
     */
    public void setRespiratoryFrequency(String respiratoryFrequency) {
        this.respiratoryFrequency = respiratoryFrequency;
    }

    /**
     * HDSD00_06_04.REPORT_TITLE
     *
     * @return the value of HDSD00_06_04.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_06_04.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_06_04.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_06_04.PULSE_RATE
     *
     * @return the value of HDSD00_06_04.PULSE_RATE
     */
    public String getPulseRate() {
        return pulseRate;
    }

    /**
     * HDSD00_06_04.PULSE_RATE
     *
     * @param pulseRate the value for HDSD00_06_04.PULSE_RATE
     */
    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate;
    }

    /**
     * HDSD00_06_04.PATIENT_NAME
     *
     * @return the value of HDSD00_06_04.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_06_04.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_06_04.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_06_04.PATIENT_TYPE
     *
     * @return the value of HDSD00_06_04.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_06_04.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_06_04.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_06_04.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_06_04.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_06_04.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_06_04.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_06_04.VISIT_TIMES
     *
     * @return the value of HDSD00_06_04.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_06_04.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_06_04.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_06_04.VISIT_ID
     *
     * @return the value of HDSD00_06_04.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_06_04.VISIT_ID
     *
     * @param visitId the value for HDSD00_06_04.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_06_04.VISIT_DOMAIN
     *
     * @return the value of HDSD00_06_04.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_06_04.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_06_04.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_06_04.PATIENT_ID
     *
     * @return the value of HDSD00_06_04.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_06_04.PATIENT_ID
     *
     * @param patientId the value for HDSD00_06_04.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_06_04.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_06_04.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_06_04.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_06_04.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_06_04.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_06_04.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_06_04.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_06_04.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_06_04.OUT_OPER_DATE
     *
     * @return the value of HDSD00_06_04.OUT_OPER_DATE
     */
    public String getOutOperDate() {
        return outOperDate;
    }

    /**
     * HDSD00_06_04.OUT_OPER_DATE
     *
     * @param outOperDate the value for HDSD00_06_04.OUT_OPER_DATE
     */
    public void setOutOperDate(String outOperDate) {
        this.outOperDate = outOperDate;
    }

    /**
     * HDSD00_06_04.MONITOR_RESULT
     *
     * @return the value of HDSD00_06_04.MONITOR_RESULT
     */
    public String getMonitorResult() {
        return monitorResult;
    }

    /**
     * HDSD00_06_04.MONITOR_RESULT
     *
     * @param monitorResult the value for HDSD00_06_04.MONITOR_RESULT
     */
    public void setMonitorResult(String monitorResult) {
        this.monitorResult = monitorResult;
    }

    /**
     * HDSD00_06_04.MONITOR_NAME
     *
     * @return the value of HDSD00_06_04.MONITOR_NAME
     */
    public String getMonitorName() {
        return monitorName;
    }

    /**
     * HDSD00_06_04.MONITOR_NAME
     *
     * @param monitorName the value for HDSD00_06_04.MONITOR_NAME
     */
    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * HDSD00_06_04.LOAD_TYPE
     *
     * @return the value of HDSD00_06_04.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_06_04.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_06_04.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_06_04.INTRAOPERATIVE_INFUSION_ITEM
     *
     * @return the value of HDSD00_06_04.INTRAOPERATIVE_INFUSION_ITEM
     */
    public String getIntraoperativeInfusionItem() {
        return intraoperativeInfusionItem;
    }

    /**
     * HDSD00_06_04.INTRAOPERATIVE_INFUSION_ITEM
     *
     * @param intraoperativeInfusionItem the value for HDSD00_06_04.INTRAOPERATIVE_INFUSION_ITEM
     */
    public void setIntraoperativeInfusionItem(String intraoperativeInfusionItem) {
        this.intraoperativeInfusionItem = intraoperativeInfusionItem;
    }

    /**
     * HDSD00_06_04.INPATIENT
     *
     * @return the value of HDSD00_06_04.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_06_04.INPATIENT
     *
     * @param inpatient the value for HDSD00_06_04.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_06_04.ID_NUM
     *
     * @return the value of HDSD00_06_04.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_06_04.ID_NUM
     *
     * @param idNum the value for HDSD00_06_04.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_06_04.HOSPITAL_NAME
     *
     * @return the value of HDSD00_06_04.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_06_04.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_06_04.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_06_04.HOSPITAL_CODE
     *
     * @return the value of HDSD00_06_04.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_06_04.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_06_04.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_06_04.HEART_RATE
     *
     * @return the value of HDSD00_06_04.HEART_RATE
     */
    public String getHeartRate() {
        return heartRate;
    }

    /**
     * HDSD00_06_04.HEART_RATE
     *
     * @param heartRate the value for HDSD00_06_04.HEART_RATE
     */
    public void setHeartRate(String heartRate) {
        this.heartRate = heartRate;
    }

    /**
     * HDSD00_06_04.GENDER_CODE
     *
     * @return the value of HDSD00_06_04.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_06_04.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_06_04.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_06_04.GENDER
     *
     * @return the value of HDSD00_06_04.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_06_04.GENDER
     *
     * @param gender the value for HDSD00_06_04.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_06_04.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_06_04.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_06_04.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_06_04.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_06_04.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_06_04.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_06_04.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_06_04.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_06_04.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_06_04.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_06_04.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_06_04.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_06_04.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_06_04.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_06_04.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_06_04.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_06_04.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_06_04.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_06_04.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_06_04.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_06_04.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_06_04.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_06_04.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_06_04.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_06_04.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_06_04.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_06_04.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_06_04.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_06_04.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_06_04.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_06_04.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_06_04.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_06_04.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_06_04.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_06_04.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_06_04.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_06_04.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_06_04.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_06_04.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_06_04.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_06_04.DOC_AUTHOR
     *
     * @return the value of HDSD00_06_04.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_06_04.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_06_04.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_06_04.DIASTOLIC_PRESSURE
     *
     * @return the value of HDSD00_06_04.DIASTOLIC_PRESSURE
     */
    public String getDiastolicPressure() {
        return diastolicPressure;
    }

    /**
     * HDSD00_06_04.DIASTOLIC_PRESSURE
     *
     * @param diastolicPressure the value for HDSD00_06_04.DIASTOLIC_PRESSURE
     */
    public void setDiastolicPressure(String diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    /**
     * HDSD00_06_04.DESTINATION_CODE
     *
     * @return the value of HDSD00_06_04.DESTINATION_CODE
     */
    public String getDestinationCode() {
        return destinationCode;
    }

    /**
     * HDSD00_06_04.DESTINATION_CODE
     *
     * @param destinationCode the value for HDSD00_06_04.DESTINATION_CODE
     */
    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    /**
     * HDSD00_06_04.DEPT_NAME
     *
     * @return the value of HDSD00_06_04.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_06_04.DEPT_NAME
     *
     * @param deptName the value for HDSD00_06_04.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_06_04.DEPT_CODE
     *
     * @return the value of HDSD00_06_04.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_06_04.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_06_04.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_06_04.BLOOD_VOLUME
     *
     * @return the value of HDSD00_06_04.BLOOD_VOLUME
     */
    public String getBloodVolume() {
        return bloodVolume;
    }

    /**
     * HDSD00_06_04.BLOOD_VOLUME
     *
     * @param bloodVolume the value for HDSD00_06_04.BLOOD_VOLUME
     */
    public void setBloodVolume(String bloodVolume) {
        this.bloodVolume = bloodVolume;
    }

    /**
     * HDSD00_06_04.BLOOD_VARIETIESCODE
     *
     * @return the value of HDSD00_06_04.BLOOD_VARIETIESCODE
     */
    public String getBloodVarietiescode() {
        return bloodVarietiescode;
    }

    /**
     * HDSD00_06_04.BLOOD_VARIETIESCODE
     *
     * @param bloodVarietiescode the value for HDSD00_06_04.BLOOD_VARIETIESCODE
     */
    public void setBloodVarietiescode(String bloodVarietiescode) {
        this.bloodVarietiescode = bloodVarietiescode;
    }

    /**
     * HDSD00_06_04.BLOOD_VARIETIES
     *
     * @return the value of HDSD00_06_04.BLOOD_VARIETIES
     */
    public String getBloodVarieties() {
        return bloodVarieties;
    }

    /**
     * HDSD00_06_04.BLOOD_VARIETIES
     *
     * @param bloodVarieties the value for HDSD00_06_04.BLOOD_VARIETIES
     */
    public void setBloodVarieties(String bloodVarieties) {
        this.bloodVarieties = bloodVarieties;
    }

    /**
     * HDSD00_06_04.BLOOD_UNIT
     *
     * @return the value of HDSD00_06_04.BLOOD_UNIT
     */
    public String getBloodUnit() {
        return bloodUnit;
    }

    /**
     * HDSD00_06_04.BLOOD_UNIT
     *
     * @param bloodUnit the value for HDSD00_06_04.BLOOD_UNIT
     */
    public void setBloodUnit(String bloodUnit) {
        this.bloodUnit = bloodUnit;
    }

    /**
     * HDSD00_06_04.BLOOD_REACTION_MARK
     *
     * @return the value of HDSD00_06_04.BLOOD_REACTION_MARK
     */
    public String getBloodReactionMark() {
        return bloodReactionMark;
    }

    /**
     * HDSD00_06_04.BLOOD_REACTION_MARK
     *
     * @param bloodReactionMark the value for HDSD00_06_04.BLOOD_REACTION_MARK
     */
    public void setBloodReactionMark(String bloodReactionMark) {
        this.bloodReactionMark = bloodReactionMark;
    }

    /**
     * HDSD00_06_04.BLOOD_END_DATE
     *
     * @return the value of HDSD00_06_04.BLOOD_END_DATE
     */
    public String getBloodEndDate() {
        return bloodEndDate;
    }

    /**
     * HDSD00_06_04.BLOOD_END_DATE
     *
     * @param bloodEndDate the value for HDSD00_06_04.BLOOD_END_DATE
     */
    public void setBloodEndDate(String bloodEndDate) {
        this.bloodEndDate = bloodEndDate;
    }

    /**
     * HDSD00_06_04.BLEEDING
     *
     * @return the value of HDSD00_06_04.BLEEDING
     */
    public String getBleeding() {
        return bleeding;
    }

    /**
     * HDSD00_06_04.BLEEDING
     *
     * @param bleeding the value for HDSD00_06_04.BLEEDING
     */
    public void setBleeding(String bleeding) {
        this.bleeding = bleeding;
    }

    /**
     * HDSD00_06_04.BED_NO
     *
     * @return the value of HDSD00_06_04.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_06_04.BED_NO
     *
     * @param bedNo the value for HDSD00_06_04.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_06_04.BED_NAME
     *
     * @return the value of HDSD00_06_04.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_06_04.BED_NAME
     *
     * @param bedName the value for HDSD00_06_04.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_06_04.APPY_ID
     *
     * @return the value of HDSD00_06_04.APPY_ID
     */
    public String getAppyId() {
        return appyId;
    }

    /**
     * HDSD00_06_04.APPY_ID
     *
     * @param appyId the value for HDSD00_06_04.APPY_ID
     */
    public void setAppyId(String appyId) {
        this.appyId = appyId;
    }

    /**
     * HDSD00_06_04.ANESTH_SIGNDATE
     *
     * @return the value of HDSD00_06_04.ANESTH_SIGNDATE
     */
    public String getAnesthSigndate() {
        return anesthSigndate;
    }

    /**
     * HDSD00_06_04.ANESTH_SIGNDATE
     *
     * @param anesthSigndate the value for HDSD00_06_04.ANESTH_SIGNDATE
     */
    public void setAnesthSigndate(String anesthSigndate) {
        this.anesthSigndate = anesthSigndate;
    }

    /**
     * HDSD00_06_04.ANESTH_NAME
     *
     * @return the value of HDSD00_06_04.ANESTH_NAME
     */
    public String getAnesthName() {
        return anesthName;
    }

    /**
     * HDSD00_06_04.ANESTH_NAME
     *
     * @param anesthName the value for HDSD00_06_04.ANESTH_NAME
     */
    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName;
    }

    /**
     * HDSD00_06_04.ANESTH_CODE
     *
     * @return the value of HDSD00_06_04.ANESTH_CODE
     */
    public String getAnesthCode() {
        return anesthCode;
    }

    /**
     * HDSD00_06_04.ANESTH_CODE
     *
     * @param anesthCode the value for HDSD00_06_04.ANESTH_CODE
     */
    public void setAnesthCode(String anesthCode) {
        this.anesthCode = anesthCode;
    }

    /**
     * HDSD00_06_04.AGE_UNIT
     *
     * @return the value of HDSD00_06_04.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_06_04.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_06_04.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_06_04.AGE
     *
     * @return the value of HDSD00_06_04.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_06_04.AGE
     *
     * @param age the value for HDSD00_06_04.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_06_04.VISIT_DATE
     *
     * @return the value of HDSD00_06_04.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_06_04.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_06_04.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_06_04.TREATMENT_PROCESS
     *
     * @return the value of HDSD00_06_04.TREATMENT_PROCESS
     */
    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    /**
     * HDSD00_06_04.TREATMENT_PROCESS
     *
     * @param treatmentProcess the value for HDSD00_06_04.TREATMENT_PROCESS
     */
    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess;
    }

    /**
     * HDSD00_06_04.OPER_POST
     *
     * @return the value of HDSD00_06_04.OPER_POST
     */
    public String getOperPost() {
        return operPost;
    }

    /**
     * HDSD00_06_04.OPER_POST
     *
     * @param operPost the value for HDSD00_06_04.OPER_POST
     */
    public void setOperPost(String operPost) {
        this.operPost = operPost;
    }

    /**
     * HDSD00_06_04.OPER_POST_CODE
     *
     * @return the value of HDSD00_06_04.OPER_POST_CODE
     */
    public String getOperPostCode() {
        return operPostCode;
    }

    /**
     * HDSD00_06_04.OPER_POST_CODE
     *
     * @param operPostCode the value for HDSD00_06_04.OPER_POST_CODE
     */
    public void setOperPostCode(String operPostCode) {
        this.operPostCode = operPostCode;
    }

    /**
     * HDSD00_06_04.OPER_ROOM
     *
     * @return the value of HDSD00_06_04.OPER_ROOM
     */
    public String getOperRoom() {
        return operRoom;
    }

    /**
     * HDSD00_06_04.OPER_ROOM
     *
     * @param operRoom the value for HDSD00_06_04.OPER_ROOM
     */
    public void setOperRoom(String operRoom) {
        this.operRoom = operRoom;
    }

    /**
     * HDSD00_06_04.SURGEON_NAME
     *
     * @return the value of HDSD00_06_04.SURGEON_NAME
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * HDSD00_06_04.SURGEON_NAME
     *
     * @param surgeonName the value for HDSD00_06_04.SURGEON_NAME
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }

    /**
     * HDSD00_06_04.SURGEON_CODE
     *
     * @return the value of HDSD00_06_04.SURGEON_CODE
     */
    public String getSurgeonCode() {
        return surgeonCode;
    }

    /**
     * HDSD00_06_04.SURGEON_CODE
     *
     * @param surgeonCode the value for HDSD00_06_04.SURGEON_CODE
     */
    public void setSurgeonCode(String surgeonCode) {
        this.surgeonCode = surgeonCode;
    }

    /**
     * HDSD00_06_04.OPER_END_DATE
     *
     * @return the value of HDSD00_06_04.OPER_END_DATE
     */
    public String getOperEndDate() {
        return operEndDate;
    }

    /**
     * HDSD00_06_04.OPER_END_DATE
     *
     * @param operEndDate the value for HDSD00_06_04.OPER_END_DATE
     */
    public void setOperEndDate(String operEndDate) {
        this.operEndDate = operEndDate;
    }

    /**
     * HDSD00_06_04.OPER_START_DATE
     *
     * @return the value of HDSD00_06_04.OPER_START_DATE
     */
    public String getOperStartDate() {
        return operStartDate;
    }

    /**
     * HDSD00_06_04.OPER_START_DATE
     *
     * @param operStartDate the value for HDSD00_06_04.OPER_START_DATE
     */
    public void setOperStartDate(String operStartDate) {
        this.operStartDate = operStartDate;
    }

    /**
     * HDSD00_06_04.OPER_CODE
     *
     * @return the value of HDSD00_06_04.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * HDSD00_06_04.OPER_CODE
     *
     * @param operCode the value for HDSD00_06_04.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * HDSD00_06_04.ADMISSION_DATE
     *
     * @return the value of HDSD00_06_04.ADMISSION_DATE
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * HDSD00_06_04.ADMISSION_DATE
     *
     * @param admissionDate the value for HDSD00_06_04.ADMISSION_DATE
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    /**
     * HDSD00_06_04.ABO_CODE
     *
     * @return the value of HDSD00_06_04.ABO_CODE
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * HDSD00_06_04.ABO_CODE
     *
     * @param aboCode the value for HDSD00_06_04.ABO_CODE
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode;
    }

    /**
     * HDSD00_06_04.ABO
     *
     * @return the value of HDSD00_06_04.ABO
     */
    public String getAbo() {
        return abo;
    }

    /**
     * HDSD00_06_04.ABO
     *
     * @param abo the value for HDSD00_06_04.ABO
     */
    public void setAbo(String abo) {
        this.abo = abo;
    }

    /**
     * HDSD00_06_04.OPER_NAME
     *
     * @return the value of HDSD00_06_04.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * HDSD00_06_04.OPER_NAME
     *
     * @param operName the value for HDSD00_06_04.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }
}