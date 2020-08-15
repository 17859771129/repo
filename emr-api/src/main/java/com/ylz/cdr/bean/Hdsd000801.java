package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_08_01")
public class Hdsd000801 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_08_01
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_08_01.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_08_01.status
     */
    private String status;
    /**
     * HDSD00_08_01.pk
     */
    private Integer pk;
    /**
     * HDSD00_08_01.empi
     */
    private String empi;
    /**
     * HDSD00_08_01.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_08_01.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_08_01.WEIGHT
     */
    private String weight;
    /**
     * HDSD00_08_01.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_08_01.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_08_01.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_08_01.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_08_01.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_08_01.VERSION
     */
    private String version;
    /**
     * HDSD00_08_01.TEMPERATURE
     */
    private String temperature;
    /**
     * HDSD00_08_01.SYSTOLIC_BLOOD_PRESSURE
     */
    private String systolicBloodPressure;
    /**
     * HDSD00_08_01.RESPIRATORY_FREQUENCY
     */
    private String respiratoryFrequency;
    /**
     * HDSD00_08_01.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_08_01.PULSE_RATE
     */
    private String pulseRate;
    /**
     * HDSD00_08_01.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_08_01.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_08_01.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_08_01.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_08_01.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_08_01.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_08_01.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_08_01.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_08_01.NURSING_TYPECODE
     */
    private String nursingTypecode;
    /**
     * HDSD00_08_01.NURSING_TYPE
     */
    private String nursingType;
    /**
     * HDSD00_08_01.NURSING_GRADECODE
     */
    private String nursingGradecode;
    /**
     * HDSD00_08_01.NURSING_GRADE
     */
    private String nursingGrade;
    /**
     * HDSD00_08_01.NURSE_SIGNDATE
     */
    private String nurseSigndate;
    /**
     * HDSD00_08_01.NURSER_NAME
     */
    private String nurserName;
    /**
     * HDSD00_08_01.NURSER_CODE
     */
    private String nurserCode;
    /**
     * HDSD00_08_01.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_08_01.INSTITUTIONAL_INCODE
     */
    private String institutionalIncode;
    /**
     * HDSD00_08_01.INSTITUTIONAL_IN
     */
    private String institutionalIn;
    /**
     * HDSD00_08_01.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_08_01.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_08_01.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_08_01.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_08_01.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_08_01.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_08_01.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_08_01.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_08_01.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_08_01.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_08_01.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_08_01.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_08_01.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_08_01.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_08_01.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_08_01.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_08_01.DIETARY_STATUS
     */
    private String dietaryStatus;
    /**
     * HDSD00_08_01.DIETARY_CODE
     */
    private String dietaryCode;
    /**
     * HDSD00_08_01.DIASTOLIC_PRESSURE
     */
    private String diastolicPressure;
    /**
     * HDSD00_08_01.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_08_01.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_08_01.BLOOD_GLUCOSE_LEVEL
     */
    private String bloodGlucoseLevel;
    /**
     * HDSD00_08_01.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_08_01.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_08_01.ALLERGY_HISTORY_MARK
     */
    private String allergyHistoryMark;
    /**
     * HDSD00_08_01.ALLERGY_HISTORY
     */
    private String allergyHistory;
    /**
     * HDSD00_08_01.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_08_01.AGE
     */
    private String age;
    /**
     * HDSD00_08_01.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_08_01.GENDER
     */
    private String gender;
    /**
     * HDSD00_08_01.VENTILATOR_MONITORING
     */
    private String ventilatorMonitoring;

    /**
     * HDSD00_08_01.upload_time
     *
     * @return the value of HDSD00_08_01.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_08_01.upload_time
     *
     * @param uploadTime the value for HDSD00_08_01.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_08_01.status
     *
     * @return the value of HDSD00_08_01.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_08_01.status
     *
     * @param status the value for HDSD00_08_01.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_08_01.pk
     *
     * @return the value of HDSD00_08_01.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_08_01.pk
     *
     * @param pk the value for HDSD00_08_01.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_08_01.empi
     *
     * @return the value of HDSD00_08_01.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_08_01.empi
     *
     * @param empi the value for HDSD00_08_01.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_08_01.ENCOUNTER_ID
     *
     * @return the value of HDSD00_08_01.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_08_01.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_08_01.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_08_01.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_08_01.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_08_01.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_08_01.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_08_01.WEIGHT
     *
     * @return the value of HDSD00_08_01.WEIGHT
     */
    public String getWeight() {
        return weight;
    }

    /**
     * HDSD00_08_01.WEIGHT
     *
     * @param weight the value for HDSD00_08_01.WEIGHT
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * HDSD00_08_01.WARD_NAME
     *
     * @return the value of HDSD00_08_01.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_08_01.WARD_NAME
     *
     * @param wardName the value for HDSD00_08_01.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_08_01.WARD_ID
     *
     * @return the value of HDSD00_08_01.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_08_01.WARD_ID
     *
     * @param wardId the value for HDSD00_08_01.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_08_01.WARDS_NAME
     *
     * @return the value of HDSD00_08_01.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_08_01.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_08_01.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_08_01.WARDS_ID
     *
     * @return the value of HDSD00_08_01.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_08_01.WARDS_ID
     *
     * @param wardsId the value for HDSD00_08_01.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_08_01.VISIT_DATE
     *
     * @return the value of HDSD00_08_01.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_08_01.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_08_01.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_08_01.VERSION
     *
     * @return the value of HDSD00_08_01.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_08_01.VERSION
     *
     * @param version the value for HDSD00_08_01.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_08_01.TEMPERATURE
     *
     * @return the value of HDSD00_08_01.TEMPERATURE
     */
    public String getTemperature() {
        return temperature;
    }

    /**
     * HDSD00_08_01.TEMPERATURE
     *
     * @param temperature the value for HDSD00_08_01.TEMPERATURE
     */
    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    /**
     * HDSD00_08_01.SYSTOLIC_BLOOD_PRESSURE
     *
     * @return the value of HDSD00_08_01.SYSTOLIC_BLOOD_PRESSURE
     */
    public String getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    /**
     * HDSD00_08_01.SYSTOLIC_BLOOD_PRESSURE
     *
     * @param systolicBloodPressure the value for HDSD00_08_01.SYSTOLIC_BLOOD_PRESSURE
     */
    public void setSystolicBloodPressure(String systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure;
    }

    /**
     * HDSD00_08_01.RESPIRATORY_FREQUENCY
     *
     * @return the value of HDSD00_08_01.RESPIRATORY_FREQUENCY
     */
    public String getRespiratoryFrequency() {
        return respiratoryFrequency;
    }

    /**
     * HDSD00_08_01.RESPIRATORY_FREQUENCY
     *
     * @param respiratoryFrequency the value for HDSD00_08_01.RESPIRATORY_FREQUENCY
     */
    public void setRespiratoryFrequency(String respiratoryFrequency) {
        this.respiratoryFrequency = respiratoryFrequency;
    }

    /**
     * HDSD00_08_01.REPORT_TITLE
     *
     * @return the value of HDSD00_08_01.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_08_01.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_08_01.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_08_01.PULSE_RATE
     *
     * @return the value of HDSD00_08_01.PULSE_RATE
     */
    public String getPulseRate() {
        return pulseRate;
    }

    /**
     * HDSD00_08_01.PULSE_RATE
     *
     * @param pulseRate the value for HDSD00_08_01.PULSE_RATE
     */
    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate;
    }

    /**
     * HDSD00_08_01.PATIENT_NAME
     *
     * @return the value of HDSD00_08_01.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_08_01.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_08_01.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_08_01.PATIENT_TYPE
     *
     * @return the value of HDSD00_08_01.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_08_01.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_08_01.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_08_01.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_08_01.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_08_01.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_08_01.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_08_01.VISIT_TIMES
     *
     * @return the value of HDSD00_08_01.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_08_01.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_08_01.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_08_01.VISIT_ID
     *
     * @return the value of HDSD00_08_01.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_08_01.VISIT_ID
     *
     * @param visitId the value for HDSD00_08_01.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_08_01.VISIT_DOMAIN
     *
     * @return the value of HDSD00_08_01.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_08_01.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_08_01.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_08_01.PATIENT_ID
     *
     * @return the value of HDSD00_08_01.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_08_01.PATIENT_ID
     *
     * @param patientId the value for HDSD00_08_01.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_08_01.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_08_01.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_08_01.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_08_01.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_08_01.NURSING_TYPECODE
     *
     * @return the value of HDSD00_08_01.NURSING_TYPECODE
     */
    public String getNursingTypecode() {
        return nursingTypecode;
    }

    /**
     * HDSD00_08_01.NURSING_TYPECODE
     *
     * @param nursingTypecode the value for HDSD00_08_01.NURSING_TYPECODE
     */
    public void setNursingTypecode(String nursingTypecode) {
        this.nursingTypecode = nursingTypecode;
    }

    /**
     * HDSD00_08_01.NURSING_TYPE
     *
     * @return the value of HDSD00_08_01.NURSING_TYPE
     */
    public String getNursingType() {
        return nursingType;
    }

    /**
     * HDSD00_08_01.NURSING_TYPE
     *
     * @param nursingType the value for HDSD00_08_01.NURSING_TYPE
     */
    public void setNursingType(String nursingType) {
        this.nursingType = nursingType;
    }

    /**
     * HDSD00_08_01.NURSING_GRADECODE
     *
     * @return the value of HDSD00_08_01.NURSING_GRADECODE
     */
    public String getNursingGradecode() {
        return nursingGradecode;
    }

    /**
     * HDSD00_08_01.NURSING_GRADECODE
     *
     * @param nursingGradecode the value for HDSD00_08_01.NURSING_GRADECODE
     */
    public void setNursingGradecode(String nursingGradecode) {
        this.nursingGradecode = nursingGradecode;
    }

    /**
     * HDSD00_08_01.NURSING_GRADE
     *
     * @return the value of HDSD00_08_01.NURSING_GRADE
     */
    public String getNursingGrade() {
        return nursingGrade;
    }

    /**
     * HDSD00_08_01.NURSING_GRADE
     *
     * @param nursingGrade the value for HDSD00_08_01.NURSING_GRADE
     */
    public void setNursingGrade(String nursingGrade) {
        this.nursingGrade = nursingGrade;
    }

    /**
     * HDSD00_08_01.NURSE_SIGNDATE
     *
     * @return the value of HDSD00_08_01.NURSE_SIGNDATE
     */
    public String getNurseSigndate() {
        return nurseSigndate;
    }

    /**
     * HDSD00_08_01.NURSE_SIGNDATE
     *
     * @param nurseSigndate the value for HDSD00_08_01.NURSE_SIGNDATE
     */
    public void setNurseSigndate(String nurseSigndate) {
        this.nurseSigndate = nurseSigndate;
    }

    /**
     * HDSD00_08_01.NURSER_NAME
     *
     * @return the value of HDSD00_08_01.NURSER_NAME
     */
    public String getNurserName() {
        return nurserName;
    }

    /**
     * HDSD00_08_01.NURSER_NAME
     *
     * @param nurserName the value for HDSD00_08_01.NURSER_NAME
     */
    public void setNurserName(String nurserName) {
        this.nurserName = nurserName;
    }

    /**
     * HDSD00_08_01.NURSER_CODE
     *
     * @return the value of HDSD00_08_01.NURSER_CODE
     */
    public String getNurserCode() {
        return nurserCode;
    }

    /**
     * HDSD00_08_01.NURSER_CODE
     *
     * @param nurserCode the value for HDSD00_08_01.NURSER_CODE
     */
    public void setNurserCode(String nurserCode) {
        this.nurserCode = nurserCode;
    }

    /**
     * HDSD00_08_01.LOAD_TYPE
     *
     * @return the value of HDSD00_08_01.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_08_01.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_08_01.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_08_01.INSTITUTIONAL_INCODE
     *
     * @return the value of HDSD00_08_01.INSTITUTIONAL_INCODE
     */
    public String getInstitutionalIncode() {
        return institutionalIncode;
    }

    /**
     * HDSD00_08_01.INSTITUTIONAL_INCODE
     *
     * @param institutionalIncode the value for HDSD00_08_01.INSTITUTIONAL_INCODE
     */
    public void setInstitutionalIncode(String institutionalIncode) {
        this.institutionalIncode = institutionalIncode;
    }

    /**
     * HDSD00_08_01.INSTITUTIONAL_IN
     *
     * @return the value of HDSD00_08_01.INSTITUTIONAL_IN
     */
    public String getInstitutionalIn() {
        return institutionalIn;
    }

    /**
     * HDSD00_08_01.INSTITUTIONAL_IN
     *
     * @param institutionalIn the value for HDSD00_08_01.INSTITUTIONAL_IN
     */
    public void setInstitutionalIn(String institutionalIn) {
        this.institutionalIn = institutionalIn;
    }

    /**
     * HDSD00_08_01.INPATIENT
     *
     * @return the value of HDSD00_08_01.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_08_01.INPATIENT
     *
     * @param inpatient the value for HDSD00_08_01.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_08_01.ID_NUM
     *
     * @return the value of HDSD00_08_01.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_08_01.ID_NUM
     *
     * @param idNum the value for HDSD00_08_01.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_08_01.HOSPITAL_NAME
     *
     * @return the value of HDSD00_08_01.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_08_01.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_08_01.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_08_01.HOSPITAL_CODE
     *
     * @return the value of HDSD00_08_01.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_08_01.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_08_01.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_08_01.GENDER_CODE
     *
     * @return the value of HDSD00_08_01.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_08_01.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_08_01.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_08_01.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_08_01.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_08_01.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_08_01.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_08_01.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_08_01.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_08_01.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_08_01.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_08_01.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_08_01.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_08_01.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_08_01.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_08_01.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_08_01.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_08_01.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_08_01.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_08_01.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_08_01.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_08_01.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_08_01.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_08_01.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_08_01.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_08_01.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_08_01.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_08_01.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_08_01.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_08_01.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_08_01.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_08_01.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_08_01.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_08_01.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_08_01.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_08_01.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_08_01.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_08_01.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_08_01.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_08_01.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_08_01.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_08_01.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_08_01.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_08_01.DOC_AUTHOR
     *
     * @return the value of HDSD00_08_01.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_08_01.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_08_01.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_08_01.DIETARY_STATUS
     *
     * @return the value of HDSD00_08_01.DIETARY_STATUS
     */
    public String getDietaryStatus() {
        return dietaryStatus;
    }

    /**
     * HDSD00_08_01.DIETARY_STATUS
     *
     * @param dietaryStatus the value for HDSD00_08_01.DIETARY_STATUS
     */
    public void setDietaryStatus(String dietaryStatus) {
        this.dietaryStatus = dietaryStatus;
    }

    /**
     * HDSD00_08_01.DIETARY_CODE
     *
     * @return the value of HDSD00_08_01.DIETARY_CODE
     */
    public String getDietaryCode() {
        return dietaryCode;
    }

    /**
     * HDSD00_08_01.DIETARY_CODE
     *
     * @param dietaryCode the value for HDSD00_08_01.DIETARY_CODE
     */
    public void setDietaryCode(String dietaryCode) {
        this.dietaryCode = dietaryCode;
    }

    /**
     * HDSD00_08_01.DIASTOLIC_PRESSURE
     *
     * @return the value of HDSD00_08_01.DIASTOLIC_PRESSURE
     */
    public String getDiastolicPressure() {
        return diastolicPressure;
    }

    /**
     * HDSD00_08_01.DIASTOLIC_PRESSURE
     *
     * @param diastolicPressure the value for HDSD00_08_01.DIASTOLIC_PRESSURE
     */
    public void setDiastolicPressure(String diastolicPressure) {
        this.diastolicPressure = diastolicPressure;
    }

    /**
     * HDSD00_08_01.DEPT_NAME
     *
     * @return the value of HDSD00_08_01.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_08_01.DEPT_NAME
     *
     * @param deptName the value for HDSD00_08_01.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_08_01.DEPT_CODE
     *
     * @return the value of HDSD00_08_01.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_08_01.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_08_01.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_08_01.BLOOD_GLUCOSE_LEVEL
     *
     * @return the value of HDSD00_08_01.BLOOD_GLUCOSE_LEVEL
     */
    public String getBloodGlucoseLevel() {
        return bloodGlucoseLevel;
    }

    /**
     * HDSD00_08_01.BLOOD_GLUCOSE_LEVEL
     *
     * @param bloodGlucoseLevel the value for HDSD00_08_01.BLOOD_GLUCOSE_LEVEL
     */
    public void setBloodGlucoseLevel(String bloodGlucoseLevel) {
        this.bloodGlucoseLevel = bloodGlucoseLevel;
    }

    /**
     * HDSD00_08_01.BED_NO
     *
     * @return the value of HDSD00_08_01.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_08_01.BED_NO
     *
     * @param bedNo the value for HDSD00_08_01.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_08_01.BED_NAME
     *
     * @return the value of HDSD00_08_01.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_08_01.BED_NAME
     *
     * @param bedName the value for HDSD00_08_01.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_08_01.ALLERGY_HISTORY_MARK
     *
     * @return the value of HDSD00_08_01.ALLERGY_HISTORY_MARK
     */
    public String getAllergyHistoryMark() {
        return allergyHistoryMark;
    }

    /**
     * HDSD00_08_01.ALLERGY_HISTORY_MARK
     *
     * @param allergyHistoryMark the value for HDSD00_08_01.ALLERGY_HISTORY_MARK
     */
    public void setAllergyHistoryMark(String allergyHistoryMark) {
        this.allergyHistoryMark = allergyHistoryMark;
    }

    /**
     * HDSD00_08_01.ALLERGY_HISTORY
     *
     * @return the value of HDSD00_08_01.ALLERGY_HISTORY
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * HDSD00_08_01.ALLERGY_HISTORY
     *
     * @param allergyHistory the value for HDSD00_08_01.ALLERGY_HISTORY
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }

    /**
     * HDSD00_08_01.AGE_UNIT
     *
     * @return the value of HDSD00_08_01.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_08_01.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_08_01.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_08_01.AGE
     *
     * @return the value of HDSD00_08_01.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_08_01.AGE
     *
     * @param age the value for HDSD00_08_01.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_08_01.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_08_01.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_08_01.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_08_01.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_08_01.GENDER
     *
     * @return the value of HDSD00_08_01.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_08_01.GENDER
     *
     * @param gender the value for HDSD00_08_01.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_08_01.VENTILATOR_MONITORING
     *
     * @return the value of HDSD00_08_01.VENTILATOR_MONITORING
     */
    public String getVentilatorMonitoring() {
        return ventilatorMonitoring;
    }

    /**
     * HDSD00_08_01.VENTILATOR_MONITORING
     *
     * @param ventilatorMonitoring the value for HDSD00_08_01.VENTILATOR_MONITORING
     */
    public void setVentilatorMonitoring(String ventilatorMonitoring) {
        this.ventilatorMonitoring = ventilatorMonitoring;
    }
}