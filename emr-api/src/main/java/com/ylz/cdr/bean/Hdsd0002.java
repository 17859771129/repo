package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_02")
public class Hdsd0002 extends BaseBean implements Serializable {
    private static final long serialVersionUID = -6090233686440565518L;
    /**
     * HDSD00_02.upload_time
     */
    private Date uploadTime;

    /**
     * HDSD00_02.status
     */
    private String status;

    /**
     * HDSD00_02.pk
     */
    private Integer pk;

    /**
     * HDSD00_02.empi
     */
    private String empi;

    /**
     * HDSD00_02.ENCOUNTER_ID
     */
    private String encounterId;

    /**
     * HDSD00_02.DOC_DOMAIN_ID
     */
    private String docDomainId;

    /**
     * HDSD00_02.WORKPLACE_PHONE
     */
    private String workplacePhone;

    /**
     * HDSD00_02.WORKPLACE
     */
    private String workplace;

    /**
     * HDSD00_02.VISIT_REASON
     */
    private String visitReason;

    /**
     * HDSD00_02.VISIT_DATE
     */
    private String visitDate;

    /**
     * HDSD00_02.VERSION
     */
    private String version;

    /**
     * HDSD00_02.VACCINATION_HISTORY
     */
    private String vaccinationHistory;

    /**
     * HDSD00_02.TELEPHONE
     */
    private String telephone;

    /**
     * HDSD00_02.SURGERY_HISTORY
     */
    private String surgeryHistory;

    /**
     * HDSD00_02.RH_GROUP
     */
    private String rhGroup;

    /**
     * HDSD00_02.RH_CODE
     */
    private String rhCode;

    /**
     * HDSD00_02.RESPONSIBLE_NAME
     */
    private String responsibleName;

    /**
     * HDSD00_02.REPORT_TITLE
     */
    private String reportTitle;

    /**
     * HDSD00_02.RELATIONSHIP_CODE
     */
    private String relationshipCode;

    /**
     * HDSD00_02.RELATIONSHIP
     */
    private String relationship;

    /**
     * HDSD00_02.PERSONAL_HISTORY
     */
    private String personalHistory;

    /**
     * HDSD00_02.PERSONAL_FEE
     */
    private String personalFee;

    /**
     * HDSD00_02.PAYMENT_NAME
     */
    private String paymentName;

    /**
     * HDSD00_02.PAYMENT_CODE
     */
    private String paymentCode;

    /**
     * HDSD00_02.PATIENT_TYPECODE
     */
    private String patientTypecode;

    /**
     * HDSD00_02.PATIENT_NAME
     */
    private String patientName;

    /**
     * HDSD00_02.PATIENT_ID
     */
    private String patientId;

    /**
     * HDSD00_02.PATIENT_DOMAIN
     */
    private String patientDomain;

    /**
     * HDSD00_02.OUT_PATIENT_ID
     */
    private String outPatientId;

    /**
     * HDSD00_02.OUT_FEE
     */
    private String outFee;

    /**
     * HDSD00_02.OTHER_WM_DIAGNOSTICCODE
     */
    private String otherWmDiagnosticcode;

    /**
     * HDSD00_02.OTHER_MEDICAL_DISPOSAL
     */
    private String otherMedicalDisposal;

    /**
     * HDSD00_02.NATION_CODE
     */
    private String nationCode;

    /**
     * HDSD00_02.NATION
     */
    private String nation;

    /**
     * HDSD00_02.MENSTRUAL_HISTORY
     */
    private String menstrualHistory;

    /**
     * HDSD00_02.MARRIAGE_NAME
     */
    private String marriageName;

    /**
     * HDSD00_02.MARRIAGE_HISTORY
     */
    private String marriageHistory;

    /**
     * HDSD00_02.MARRIAGE_CODE
     */
    private String marriageCode;

    /**
     * HDSD00_02.LOAD_TYPE
     */
    private String loadType;

    /**
     * HDSD00_02.INTOTAL_FEE
     */
    private String intotalFee;

    /**
     * HDSD00_02.DEPT_NAME
     */
    private String deptName;

    /**
     * HDSD00_02.DEPT_CODE
     */
    private String deptCode;

    /**
     * HDSD00_02.INPATIENT
     */
    private String inpatient;

    /**
     * HDSD00_02.INFECTIOUS_DISEASE_HISTORY
     */
    private String infectiousDiseaseHistory;

    /**
     * HDSD00_02.ID_NUM
     */
    private String idNum;

    /**
     * HDSD00_02.HEALTH_RECORD_ID
     */
    private String healthRecordId;

    /**
     * HDSD00_02.HEALTH_CARD
     */
    private String healthCard;

    /**
     * HDSD00_02.GENDER_CODE
     */
    private String genderCode;

    /**
     * HDSD00_02.GENDER
     */
    private String gender;

    /**
     * HDSD00_02.FAMILY_HISTORY
     */
    private String familyHistory;

    /**
     * HDSD00_02.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;

    /**
     * HDSD00_02.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;

    /**
     * HDSD00_02.DOC_PIPELINE_ID
     */
    private String docPipelineId;

    /**
     * HDSD00_02.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;

    /**
     * HDSD00_02.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;

    /**
     * HDSD00_02.DOC_CUSTODIAN
     */
    private String docCustodian;

    /**
     * HDSD00_02.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;

    /**
     * HDSD00_02.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;

    /**
     * HDSD00_02.DISEASE_HISTORY
     */
    private String diseaseHistory;

    /**
     * HDSD00_02.DISCHARGE_DATE
     */
    private String dischargeDate;

    /**
     * HDSD00_02.DEATH_CAUSE_CODE
     */
    private String deathCauseCode;

    /**
     * HDSD00_02.DATEOF_ONSET
     */
    private String dateofOnset;

    /**
     * HDSD00_02.DATEOF_BIRTH
     */
    private String dateofBirth;

    /**
     * HDSD00_02.CURRENT_ZIP
     */
    private String currentZip;

    /**
     * HDSD00_02.CURRENT_VILLAGE
     */
    private String currentVillage;

    /**
     * HDSD00_02.CURRENT_TOWNSHIP
     */
    private String currentTownship;

    /**
     * HDSD00_02.CURRENT_PROVINCE
     */
    private String currentProvince;

    /**
     * HDSD00_02.CURRENT_DOOR_NUMBER
     */
    private String currentDoorNumber;

    /**
     * HDSD00_02.CURRENT_COUNTY
     */
    private String currentCounty;

    /**
     * HDSD00_02.CURRENT_CITY
     */
    private String currentCity;

    /**
     * HDSD00_02.CONTACT_VILLAGE
     */
    private String contactVillage;

    /**
     * HDSD00_02.CONTACT_TOWNSHIP
     */
    private String contactTownship;

    /**
     * HDSD00_02.CONTACT_PROVINCES
     */
    private String contactProvinces;

    /**
     * HDSD00_02.CONTACT_POSTCODE
     */
    private String contactPostcode;

    /**
     * HDSD00_02.CONTACT_NUMBER
     */
    private String contactNumber;

    /**
     * HDSD00_02.CONTACT_NAME
     */
    private String contactName;

    /**
     * HDSD00_02.CONTACT_DOOR
     */
    private String contactDoor;

    /**
     * HDSD00_02.CONTACT_COUNTY
     */
    private String contactCounty;

    /**
     * HDSD00_02.CONTACT_CITY
     */
    private String contactCity;

    /**
     * HDSD00_02.CATEGORY_CODE
     */
    private String categoryCode;

    /**
     * HDSD00_02.CAREER_CATEGORYCODE
     */
    private String careerCategorycode;

    /**
     * HDSD00_02.CAREER_CATEGORY
     */
    private String careerCategory;

    /**
     * HDSD00_02.BLOOD_HISTORY
     */
    private String bloodHistory;

    /**
     * HDSD00_02.ARCHIVIST_NAME
     */
    private String archivistName;

    /**
     * HDSD00_02.HOSPITAL_CODE
     */
    private String hospitalCode;

    /**
     * HDSD00_02.HOSPITAL_NAME
     */
    private String hospitalName;

    /**
     * HDSD00_02.ARCHIVIST_DATE
     */
    private String archivistDate;

    /**
     * HDSD00_02.ARCHIVIST_CODE
     */
    private String archivistCode;

    /**
     * HDSD00_02.ALLERGY_HISTORY
     */
    private String allergyHistory;

    /**
     * HDSD00_02.ADMISSION_DATE
     */
    private String admissionDate;

    /**
     * HDSD00_02.ABO_CODE
     */
    private String aboCode;

    /**
     * HDSD00_02.ABO
     */
    private String abo;

    /**
     * HDSD00_02.OPER_CODE
     */
    private String operCode;

    /**
     * HDSD00_02.DRUG_NAME
     */
    private String drugName;

    /**
     * HDSD00_02.DRUG_USAGE
     */
    private String drugUsage;

    /**
     * HDSD00_02.DRUG_ADRS
     */
    private String drugAdrs;

    /**
     * HDSD00_02.DRUG_CM_TYPE
     */
    private String drugCmType;

    /**
     * HDSD00_02.OPER_NAME
     */
    private String operName;

    /**
     * HDSD00_02.DRUG_CM_TYPE_CODE
     */
    private String drugCmTypeCode;

    /**
     * HDSD00_02.DEATH_CAUSE
     */
    private String deathCause;

    /**
     * HDSD00_02.CATEGORY_NAME
     */
    private String categoryName;

    private String visitTimes;
    private String visitId;
    private String visitDomain;
    private String patientType;

    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_02.upload_time
     *
     * @param uploadTime the value for HDSD00_02.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_02.status
     *
     * @return the value of HDSD00_02.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_02.status
     *
     * @param status the value for HDSD00_02.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_02.pk
     *
     * @return the value of HDSD00_02.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_02.pk
     *
     * @param pk the value for HDSD00_02.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_02.empi
     *
     * @return the value of HDSD00_02.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_02.empi
     *
     * @param empi the value for HDSD00_02.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_02.ENCOUNTER_ID
     *
     * @return the value of HDSD00_02.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_02.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_02.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_02.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_02.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_02.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_02.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_02.WORKPLACE_PHONE
     *
     * @return the value of HDSD00_02.WORKPLACE_PHONE
     */
    public String getWorkplacePhone() {
        return workplacePhone;
    }

    /**
     * HDSD00_02.WORKPLACE_PHONE
     *
     * @param workplacePhone the value for HDSD00_02.WORKPLACE_PHONE
     */
    public void setWorkplacePhone(String workplacePhone) {
        this.workplacePhone = workplacePhone;
    }

    /**
     * HDSD00_02.WORKPLACE
     *
     * @return the value of HDSD00_02.WORKPLACE
     */
    public String getWorkplace() {
        return workplace;
    }

    /**
     * HDSD00_02.WORKPLACE
     *
     * @param workplace the value for HDSD00_02.WORKPLACE
     */
    public void setWorkplace(String workplace) {
        this.workplace = workplace;
    }

    /**
     * HDSD00_02.VISIT_REASON
     *
     * @return the value of HDSD00_02.VISIT_REASON
     */
    public String getVisitReason() {
        return visitReason;
    }

    /**
     * HDSD00_02.VISIT_REASON
     *
     * @param visitReason the value for HDSD00_02.VISIT_REASON
     */
    public void setVisitReason(String visitReason) {
        this.visitReason = visitReason;
    }

    /**
     * HDSD00_02.VISIT_DATE
     *
     * @return the value of HDSD00_02.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_02.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_02.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_02.VERSION
     *
     * @return the value of HDSD00_02.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_02.VERSION
     *
     * @param version the value for HDSD00_02.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_02.VACCINATION_HISTORY
     *
     * @return the value of HDSD00_02.VACCINATION_HISTORY
     */
    public String getVaccinationHistory() {
        return vaccinationHistory;
    }

    /**
     * HDSD00_02.VACCINATION_HISTORY
     *
     * @param vaccinationHistory the value for HDSD00_02.VACCINATION_HISTORY
     */
    public void setVaccinationHistory(String vaccinationHistory) {
        this.vaccinationHistory = vaccinationHistory;
    }

    /**
     * HDSD00_02.TELEPHONE
     *
     * @return the value of HDSD00_02.TELEPHONE
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * HDSD00_02.TELEPHONE
     *
     * @param telephone the value for HDSD00_02.TELEPHONE
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * HDSD00_02.SURGERY_HISTORY
     *
     * @return the value of HDSD00_02.SURGERY_HISTORY
     */
    public String getSurgeryHistory() {
        return surgeryHistory;
    }

    /**
     * HDSD00_02.SURGERY_HISTORY
     *
     * @param surgeryHistory the value for HDSD00_02.SURGERY_HISTORY
     */
    public void setSurgeryHistory(String surgeryHistory) {
        this.surgeryHistory = surgeryHistory;
    }

    /**
     * HDSD00_02.RH_GROUP
     *
     * @return the value of HDSD00_02.RH_GROUP
     */
    public String getRhGroup() {
        return rhGroup;
    }

    /**
     * HDSD00_02.RH_GROUP
     *
     * @param rhGroup the value for HDSD00_02.RH_GROUP
     */
    public void setRhGroup(String rhGroup) {
        this.rhGroup = rhGroup;
    }

    /**
     * HDSD00_02.RH_CODE
     *
     * @return the value of HDSD00_02.RH_CODE
     */
    public String getRhCode() {
        return rhCode;
    }

    /**
     * HDSD00_02.RH_CODE
     *
     * @param rhCode the value for HDSD00_02.RH_CODE
     */
    public void setRhCode(String rhCode) {
        this.rhCode = rhCode;
    }

    /**
     * HDSD00_02.RESPONSIBLE_NAME
     *
     * @return the value of HDSD00_02.RESPONSIBLE_NAME
     */
    public String getResponsibleName() {
        return responsibleName;
    }

    /**
     * HDSD00_02.RESPONSIBLE_NAME
     *
     * @param responsibleName the value for HDSD00_02.RESPONSIBLE_NAME
     */
    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    /**
     * HDSD00_02.REPORT_TITLE
     *
     * @return the value of HDSD00_02.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_02.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_02.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_02.RELATIONSHIP_CODE
     *
     * @return the value of HDSD00_02.RELATIONSHIP_CODE
     */
    public String getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * HDSD00_02.RELATIONSHIP_CODE
     *
     * @param relationshipCode the value for HDSD00_02.RELATIONSHIP_CODE
     */
    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode;
    }

    /**
     * HDSD00_02.RELATIONSHIP
     *
     * @return the value of HDSD00_02.RELATIONSHIP
     */
    public String getRelationship() {
        return relationship;
    }

    /**
     * HDSD00_02.RELATIONSHIP
     *
     * @param relationship the value for HDSD00_02.RELATIONSHIP
     */
    public void setRelationship(String relationship) {
        this.relationship = relationship;
    }

    /**
     * HDSD00_02.PERSONAL_HISTORY
     *
     * @return the value of HDSD00_02.PERSONAL_HISTORY
     */
    public String getPersonalHistory() {
        return personalHistory;
    }

    /**
     * HDSD00_02.PERSONAL_HISTORY
     *
     * @param personalHistory the value for HDSD00_02.PERSONAL_HISTORY
     */
    public void setPersonalHistory(String personalHistory) {
        this.personalHistory = personalHistory;
    }

    /**
     * HDSD00_02.PERSONAL_FEE
     *
     * @return the value of HDSD00_02.PERSONAL_FEE
     */
    public String getPersonalFee() {
        return personalFee;
    }

    /**
     * HDSD00_02.PERSONAL_FEE
     *
     * @param personalFee the value for HDSD00_02.PERSONAL_FEE
     */
    public void setPersonalFee(String personalFee) {
        this.personalFee = personalFee;
    }

    /**
     * HDSD00_02.PAYMENT_NAME
     *
     * @return the value of HDSD00_02.PAYMENT_NAME
     */
    public String getPaymentName() {
        return paymentName;
    }

    /**
     * HDSD00_02.PAYMENT_NAME
     *
     * @param paymentName the value for HDSD00_02.PAYMENT_NAME
     */
    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    /**
     * HDSD00_02.PAYMENT_CODE
     *
     * @return the value of HDSD00_02.PAYMENT_CODE
     */
    public String getPaymentCode() {
        return paymentCode;
    }

    /**
     * HDSD00_02.PAYMENT_CODE
     *
     * @param paymentCode the value for HDSD00_02.PAYMENT_CODE
     */
    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    /**
     * HDSD00_02.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_02.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_02.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_02.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_02.PATIENT_NAME
     *
     * @return the value of HDSD00_02.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_02.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_02.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_02.PATIENT_ID
     *
     * @return the value of HDSD00_02.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_02.PATIENT_ID
     *
     * @param patientId the value for HDSD00_02.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_02.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_02.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_02.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_02.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_02.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_02.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_02.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_02.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_02.OUT_FEE
     *
     * @return the value of HDSD00_02.OUT_FEE
     */
    public String getOutFee() {
        return outFee;
    }

    /**
     * HDSD00_02.OUT_FEE
     *
     * @param outFee the value for HDSD00_02.OUT_FEE
     */
    public void setOutFee(String outFee) {
        this.outFee = outFee;
    }

    /**
     * HDSD00_02.OTHER_WM_DIAGNOSTICCODE
     *
     * @return the value of HDSD00_02.OTHER_WM_DIAGNOSTICCODE
     */
    public String getOtherWmDiagnosticcode() {
        return otherWmDiagnosticcode;
    }

    /**
     * HDSD00_02.OTHER_WM_DIAGNOSTICCODE
     *
     * @param otherWmDiagnosticcode the value for HDSD00_02.OTHER_WM_DIAGNOSTICCODE
     */
    public void setOtherWmDiagnosticcode(String otherWmDiagnosticcode) {
        this.otherWmDiagnosticcode = otherWmDiagnosticcode;
    }

    /**
     * HDSD00_02.OTHER_MEDICAL_DISPOSAL
     *
     * @return the value of HDSD00_02.OTHER_MEDICAL_DISPOSAL
     */
    public String getOtherMedicalDisposal() {
        return otherMedicalDisposal;
    }

    /**
     * HDSD00_02.OTHER_MEDICAL_DISPOSAL
     *
     * @param otherMedicalDisposal the value for HDSD00_02.OTHER_MEDICAL_DISPOSAL
     */
    public void setOtherMedicalDisposal(String otherMedicalDisposal) {
        this.otherMedicalDisposal = otherMedicalDisposal;
    }

    /**
     * HDSD00_02.NATION_CODE
     *
     * @return the value of HDSD00_02.NATION_CODE
     */
    public String getNationCode() {
        return nationCode;
    }

    /**
     * HDSD00_02.NATION_CODE
     *
     * @param nationCode the value for HDSD00_02.NATION_CODE
     */
    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }

    /**
     * HDSD00_02.NATION
     *
     * @return the value of HDSD00_02.NATION
     */
    public String getNation() {
        return nation;
    }

    /**
     * HDSD00_02.NATION
     *
     * @param nation the value for HDSD00_02.NATION
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * HDSD00_02.MENSTRUAL_HISTORY
     *
     * @return the value of HDSD00_02.MENSTRUAL_HISTORY
     */
    public String getMenstrualHistory() {
        return menstrualHistory;
    }

    /**
     * HDSD00_02.MENSTRUAL_HISTORY
     *
     * @param menstrualHistory the value for HDSD00_02.MENSTRUAL_HISTORY
     */
    public void setMenstrualHistory(String menstrualHistory) {
        this.menstrualHistory = menstrualHistory;
    }

    /**
     * HDSD00_02.MARRIAGE_NAME
     *
     * @return the value of HDSD00_02.MARRIAGE_NAME
     */
    public String getMarriageName() {
        return marriageName;
    }

    /**
     * HDSD00_02.MARRIAGE_NAME
     *
     * @param marriageName the value for HDSD00_02.MARRIAGE_NAME
     */
    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName;
    }

    /**
     * HDSD00_02.MARRIAGE_HISTORY
     *
     * @return the value of HDSD00_02.MARRIAGE_HISTORY
     */
    public String getMarriageHistory() {
        return marriageHistory;
    }

    /**
     * HDSD00_02.MARRIAGE_HISTORY
     *
     * @param marriageHistory the value for HDSD00_02.MARRIAGE_HISTORY
     */
    public void setMarriageHistory(String marriageHistory) {
        this.marriageHistory = marriageHistory;
    }

    /**
     * HDSD00_02.MARRIAGE_CODE
     *
     * @return the value of HDSD00_02.MARRIAGE_CODE
     */
    public String getMarriageCode() {
        return marriageCode;
    }

    /**
     * HDSD00_02.MARRIAGE_CODE
     *
     * @param marriageCode the value for HDSD00_02.MARRIAGE_CODE
     */
    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode;
    }

    /**
     * HDSD00_02.LOAD_TYPE
     *
     * @return the value of HDSD00_02.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_02.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_02.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_02.INTOTAL_FEE
     *
     * @return the value of HDSD00_02.INTOTAL_FEE
     */
    public String getIntotalFee() {
        return intotalFee;
    }

    /**
     * HDSD00_02.INTOTAL_FEE
     *
     * @param intotalFee the value for HDSD00_02.INTOTAL_FEE
     */
    public void setIntotalFee(String intotalFee) {
        this.intotalFee = intotalFee;
    }

    /**
     * HDSD00_02.DEPT_NAME
     *
     * @return the value of HDSD00_02.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_02.DEPT_NAME
     *
     * @param deptName the value for HDSD00_02.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_02.DEPT_CODE
     *
     * @return the value of HDSD00_02.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_02.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_02.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_02.INPATIENT
     *
     * @return the value of HDSD00_02.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_02.INPATIENT
     *
     * @param inpatient the value for HDSD00_02.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_02.INFECTIOUS_DISEASE_HISTORY
     *
     * @return the value of HDSD00_02.INFECTIOUS_DISEASE_HISTORY
     */
    public String getInfectiousDiseaseHistory() {
        return infectiousDiseaseHistory;
    }

    /**
     * HDSD00_02.INFECTIOUS_DISEASE_HISTORY
     *
     * @param infectiousDiseaseHistory the value for HDSD00_02.INFECTIOUS_DISEASE_HISTORY
     */
    public void setInfectiousDiseaseHistory(String infectiousDiseaseHistory) {
        this.infectiousDiseaseHistory = infectiousDiseaseHistory;
    }

    /**
     * HDSD00_02.ID_NUM
     *
     * @return the value of HDSD00_02.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_02.ID_NUM
     *
     * @param idNum the value for HDSD00_02.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_02.HEALTH_RECORD_ID
     *
     * @return the value of HDSD00_02.HEALTH_RECORD_ID
     */
    public String getHealthRecordId() {
        return healthRecordId;
    }

    /**
     * HDSD00_02.HEALTH_RECORD_ID
     *
     * @param healthRecordId the value for HDSD00_02.HEALTH_RECORD_ID
     */
    public void setHealthRecordId(String healthRecordId) {
        this.healthRecordId = healthRecordId;
    }

    /**
     * HDSD00_02.HEALTH_CARD
     *
     * @return the value of HDSD00_02.HEALTH_CARD
     */
    public String getHealthCard() {
        return healthCard;
    }

    /**
     * HDSD00_02.HEALTH_CARD
     *
     * @param healthCard the value for HDSD00_02.HEALTH_CARD
     */
    public void setHealthCard(String healthCard) {
        this.healthCard = healthCard;
    }

    /**
     * HDSD00_02.GENDER_CODE
     *
     * @return the value of HDSD00_02.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_02.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_02.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_02.GENDER
     *
     * @return the value of HDSD00_02.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_02.GENDER
     *
     * @param gender the value for HDSD00_02.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * HDSD00_02.FAMILY_HISTORY
     *
     * @return the value of HDSD00_02.FAMILY_HISTORY
     */
    public String getFamilyHistory() {
        return familyHistory;
    }

    /**
     * HDSD00_02.FAMILY_HISTORY
     *
     * @param familyHistory the value for HDSD00_02.FAMILY_HISTORY
     */
    public void setFamilyHistory(String familyHistory) {
        this.familyHistory = familyHistory;
    }

    /**
     * HDSD00_02.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_02.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_02.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_02.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_02.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_02.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_02.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_02.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_02.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_02.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_02.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_02.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_02.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_02.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_02.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_02.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_02.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_02.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_02.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_02.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_02.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_02.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_02.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_02.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_02.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_02.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_02.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_02.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_02.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_02.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_02.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_02.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_02.DISEASE_HISTORY
     *
     * @return the value of HDSD00_02.DISEASE_HISTORY
     */
    public String getDiseaseHistory() {
        return diseaseHistory;
    }

    /**
     * HDSD00_02.DISEASE_HISTORY
     *
     * @param diseaseHistory the value for HDSD00_02.DISEASE_HISTORY
     */
    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory;
    }

    /**
     * HDSD00_02.DISCHARGE_DATE
     *
     * @return the value of HDSD00_02.DISCHARGE_DATE
     */
    public String getDischargeDate() {
        return dischargeDate;
    }

    /**
     * HDSD00_02.DISCHARGE_DATE
     *
     * @param dischargeDate the value for HDSD00_02.DISCHARGE_DATE
     */
    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate;
    }

    /**
     * HDSD00_02.DEATH_CAUSE_CODE
     *
     * @return the value of HDSD00_02.DEATH_CAUSE_CODE
     */
    public String getDeathCauseCode() {
        return deathCauseCode;
    }

    /**
     * HDSD00_02.DEATH_CAUSE_CODE
     *
     * @param deathCauseCode the value for HDSD00_02.DEATH_CAUSE_CODE
     */
    public void setDeathCauseCode(String deathCauseCode) {
        this.deathCauseCode = deathCauseCode;
    }

    /**
     * HDSD00_02.DATEOF_ONSET
     *
     * @return the value of HDSD00_02.DATEOF_ONSET
     */
    public String getDateofOnset() {
        return dateofOnset;
    }

    /**
     * HDSD00_02.DATEOF_ONSET
     *
     * @param dateofOnset the value for HDSD00_02.DATEOF_ONSET
     */
    public void setDateofOnset(String dateofOnset) {
        this.dateofOnset = dateofOnset;
    }

    /**
     * HDSD00_02.DATEOF_BIRTH
     *
     * @return the value of HDSD00_02.DATEOF_BIRTH
     */
    public String getDateofBirth() {
        return dateofBirth;
    }

    /**
     * HDSD00_02.DATEOF_BIRTH
     *
     * @param dateofBirth the value for HDSD00_02.DATEOF_BIRTH
     */
    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth;
    }

    /**
     * HDSD00_02.CURRENT_ZIP
     *
     * @return the value of HDSD00_02.CURRENT_ZIP
     */
    public String getCurrentZip() {
        return currentZip;
    }

    /**
     * HDSD00_02.CURRENT_ZIP
     *
     * @param currentZip the value for HDSD00_02.CURRENT_ZIP
     */
    public void setCurrentZip(String currentZip) {
        this.currentZip = currentZip;
    }

    /**
     * HDSD00_02.CURRENT_VILLAGE
     *
     * @return the value of HDSD00_02.CURRENT_VILLAGE
     */
    public String getCurrentVillage() {
        return currentVillage;
    }

    /**
     * HDSD00_02.CURRENT_VILLAGE
     *
     * @param currentVillage the value for HDSD00_02.CURRENT_VILLAGE
     */
    public void setCurrentVillage(String currentVillage) {
        this.currentVillage = currentVillage;
    }

    /**
     * HDSD00_02.CURRENT_TOWNSHIP
     *
     * @return the value of HDSD00_02.CURRENT_TOWNSHIP
     */
    public String getCurrentTownship() {
        return currentTownship;
    }

    /**
     * HDSD00_02.CURRENT_TOWNSHIP
     *
     * @param currentTownship the value for HDSD00_02.CURRENT_TOWNSHIP
     */
    public void setCurrentTownship(String currentTownship) {
        this.currentTownship = currentTownship;
    }

    /**
     * HDSD00_02.CURRENT_PROVINCE
     *
     * @return the value of HDSD00_02.CURRENT_PROVINCE
     */
    public String getCurrentProvince() {
        return currentProvince;
    }

    /**
     * HDSD00_02.CURRENT_PROVINCE
     *
     * @param currentProvince the value for HDSD00_02.CURRENT_PROVINCE
     */
    public void setCurrentProvince(String currentProvince) {
        this.currentProvince = currentProvince;
    }

    /**
     * HDSD00_02.CURRENT_DOOR_NUMBER
     *
     * @return the value of HDSD00_02.CURRENT_DOOR_NUMBER
     */
    public String getCurrentDoorNumber() {
        return currentDoorNumber;
    }

    /**
     * HDSD00_02.CURRENT_DOOR_NUMBER
     *
     * @param currentDoorNumber the value for HDSD00_02.CURRENT_DOOR_NUMBER
     */
    public void setCurrentDoorNumber(String currentDoorNumber) {
        this.currentDoorNumber = currentDoorNumber;
    }

    /**
     * HDSD00_02.CURRENT_COUNTY
     *
     * @return the value of HDSD00_02.CURRENT_COUNTY
     */
    public String getCurrentCounty() {
        return currentCounty;
    }

    /**
     * HDSD00_02.CURRENT_COUNTY
     *
     * @param currentCounty the value for HDSD00_02.CURRENT_COUNTY
     */
    public void setCurrentCounty(String currentCounty) {
        this.currentCounty = currentCounty;
    }

    /**
     * HDSD00_02.CURRENT_CITY
     *
     * @return the value of HDSD00_02.CURRENT_CITY
     */
    public String getCurrentCity() {
        return currentCity;
    }

    /**
     * HDSD00_02.CURRENT_CITY
     *
     * @param currentCity the value for HDSD00_02.CURRENT_CITY
     */
    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    /**
     * HDSD00_02.CONTACT_VILLAGE
     *
     * @return the value of HDSD00_02.CONTACT_VILLAGE
     */
    public String getContactVillage() {
        return contactVillage;
    }

    /**
     * HDSD00_02.CONTACT_VILLAGE
     *
     * @param contactVillage the value for HDSD00_02.CONTACT_VILLAGE
     */
    public void setContactVillage(String contactVillage) {
        this.contactVillage = contactVillage;
    }

    /**
     * HDSD00_02.CONTACT_TOWNSHIP
     *
     * @return the value of HDSD00_02.CONTACT_TOWNSHIP
     */
    public String getContactTownship() {
        return contactTownship;
    }

    /**
     * HDSD00_02.CONTACT_TOWNSHIP
     *
     * @param contactTownship the value for HDSD00_02.CONTACT_TOWNSHIP
     */
    public void setContactTownship(String contactTownship) {
        this.contactTownship = contactTownship;
    }

    /**
     * HDSD00_02.CONTACT_PROVINCES
     *
     * @return the value of HDSD00_02.CONTACT_PROVINCES
     */
    public String getContactProvinces() {
        return contactProvinces;
    }

    /**
     * HDSD00_02.CONTACT_PROVINCES
     *
     * @param contactProvinces the value for HDSD00_02.CONTACT_PROVINCES
     */
    public void setContactProvinces(String contactProvinces) {
        this.contactProvinces = contactProvinces;
    }

    /**
     * HDSD00_02.CONTACT_POSTCODE
     *
     * @return the value of HDSD00_02.CONTACT_POSTCODE
     */
    public String getContactPostcode() {
        return contactPostcode;
    }

    /**
     * HDSD00_02.CONTACT_POSTCODE
     *
     * @param contactPostcode the value for HDSD00_02.CONTACT_POSTCODE
     */
    public void setContactPostcode(String contactPostcode) {
        this.contactPostcode = contactPostcode;
    }

    /**
     * HDSD00_02.CONTACT_NUMBER
     *
     * @return the value of HDSD00_02.CONTACT_NUMBER
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * HDSD00_02.CONTACT_NUMBER
     *
     * @param contactNumber the value for HDSD00_02.CONTACT_NUMBER
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * HDSD00_02.CONTACT_NAME
     *
     * @return the value of HDSD00_02.CONTACT_NAME
     */
    public String getContactName() {
        return contactName;
    }

    /**
     * HDSD00_02.CONTACT_NAME
     *
     * @param contactName the value for HDSD00_02.CONTACT_NAME
     */
    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    /**
     * HDSD00_02.CONTACT_DOOR
     *
     * @return the value of HDSD00_02.CONTACT_DOOR
     */
    public String getContactDoor() {
        return contactDoor;
    }

    /**
     * HDSD00_02.CONTACT_DOOR
     *
     * @param contactDoor the value for HDSD00_02.CONTACT_DOOR
     */
    public void setContactDoor(String contactDoor) {
        this.contactDoor = contactDoor;
    }

    /**
     * HDSD00_02.CONTACT_COUNTY
     *
     * @return the value of HDSD00_02.CONTACT_COUNTY
     */
    public String getContactCounty() {
        return contactCounty;
    }

    /**
     * HDSD00_02.CONTACT_COUNTY
     *
     * @param contactCounty the value for HDSD00_02.CONTACT_COUNTY
     */
    public void setContactCounty(String contactCounty) {
        this.contactCounty = contactCounty;
    }

    /**
     * HDSD00_02.CONTACT_CITY
     *
     * @return the value of HDSD00_02.CONTACT_CITY
     */
    public String getContactCity() {
        return contactCity;
    }

    /**
     * HDSD00_02.CONTACT_CITY
     *
     * @param contactCity the value for HDSD00_02.CONTACT_CITY
     */
    public void setContactCity(String contactCity) {
        this.contactCity = contactCity;
    }

    /**
     * HDSD00_02.CATEGORY_CODE
     *
     * @return the value of HDSD00_02.CATEGORY_CODE
     */
    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * HDSD00_02.CATEGORY_CODE
     *
     * @param categoryCode the value for HDSD00_02.CATEGORY_CODE
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * HDSD00_02.CAREER_CATEGORYCODE
     *
     * @return the value of HDSD00_02.CAREER_CATEGORYCODE
     */
    public String getCareerCategorycode() {
        return careerCategorycode;
    }

    /**
     * HDSD00_02.CAREER_CATEGORYCODE
     *
     * @param careerCategorycode the value for HDSD00_02.CAREER_CATEGORYCODE
     */
    public void setCareerCategorycode(String careerCategorycode) {
        this.careerCategorycode = careerCategorycode;
    }

    /**
     * HDSD00_02.CAREER_CATEGORY
     *
     * @return the value of HDSD00_02.CAREER_CATEGORY
     */
    public String getCareerCategory() {
        return careerCategory;
    }

    /**
     * HDSD00_02.CAREER_CATEGORY
     *
     * @param careerCategory the value for HDSD00_02.CAREER_CATEGORY
     */
    public void setCareerCategory(String careerCategory) {
        this.careerCategory = careerCategory;
    }

    /**
     * HDSD00_02.BLOOD_HISTORY
     *
     * @return the value of HDSD00_02.BLOOD_HISTORY
     */
    public String getBloodHistory() {
        return bloodHistory;
    }

    /**
     * HDSD00_02.BLOOD_HISTORY
     *
     * @param bloodHistory the value for HDSD00_02.BLOOD_HISTORY
     */
    public void setBloodHistory(String bloodHistory) {
        this.bloodHistory = bloodHistory;
    }

    /**
     * HDSD00_02.ARCHIVIST_NAME
     *
     * @return the value of HDSD00_02.ARCHIVIST_NAME
     */
    public String getArchivistName() {
        return archivistName;
    }

    /**
     * HDSD00_02.ARCHIVIST_NAME
     *
     * @param archivistName the value for HDSD00_02.ARCHIVIST_NAME
     */
    public void setArchivistName(String archivistName) {
        this.archivistName = archivistName;
    }

    /**
     * HDSD00_02.HOSPITAL_CODE
     *
     * @return the value of HDSD00_02.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_02.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_02.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_02.HOSPITAL_NAME
     *
     * @return the value of HDSD00_02.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_02.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_02.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_02.ARCHIVIST_DATE
     *
     * @return the value of HDSD00_02.ARCHIVIST_DATE
     */
    public String getArchivistDate() {
        return archivistDate;
    }

    /**
     * HDSD00_02.ARCHIVIST_DATE
     *
     * @param archivistDate the value for HDSD00_02.ARCHIVIST_DATE
     */
    public void setArchivistDate(String archivistDate) {
        this.archivistDate = archivistDate;
    }

    /**
     * HDSD00_02.ARCHIVIST_CODE
     *
     * @return the value of HDSD00_02.ARCHIVIST_CODE
     */
    public String getArchivistCode() {
        return archivistCode;
    }

    /**
     * HDSD00_02.ARCHIVIST_CODE
     *
     * @param archivistCode the value for HDSD00_02.ARCHIVIST_CODE
     */
    public void setArchivistCode(String archivistCode) {
        this.archivistCode = archivistCode;
    }

    /**
     * HDSD00_02.ALLERGY_HISTORY
     *
     * @return the value of HDSD00_02.ALLERGY_HISTORY
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * HDSD00_02.ALLERGY_HISTORY
     *
     * @param allergyHistory the value for HDSD00_02.ALLERGY_HISTORY
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }

    /**
     * HDSD00_02.ADMISSION_DATE
     *
     * @return the value of HDSD00_02.ADMISSION_DATE
     */
    public String getAdmissionDate() {
        return admissionDate;
    }

    /**
     * HDSD00_02.ADMISSION_DATE
     *
     * @param admissionDate the value for HDSD00_02.ADMISSION_DATE
     */
    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    /**
     * HDSD00_02.ABO_CODE
     *
     * @return the value of HDSD00_02.ABO_CODE
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * HDSD00_02.ABO_CODE
     *
     * @param aboCode the value for HDSD00_02.ABO_CODE
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode;
    }

    /**
     * HDSD00_02.ABO
     *
     * @return the value of HDSD00_02.ABO
     */
    public String getAbo() {
        return abo;
    }

    /**
     * HDSD00_02.ABO
     *
     * @param abo the value for HDSD00_02.ABO
     */
    public void setAbo(String abo) {
        this.abo = abo;
    }

    /**
     * HDSD00_02.OPER_CODE
     *
     * @return the value of HDSD00_02.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * HDSD00_02.OPER_CODE
     *
     * @param operCode the value for HDSD00_02.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * HDSD00_02.DRUG_NAME
     *
     * @return the value of HDSD00_02.DRUG_NAME
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * HDSD00_02.DRUG_NAME
     *
     * @param drugName the value for HDSD00_02.DRUG_NAME
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * HDSD00_02.DRUG_USAGE
     *
     * @return the value of HDSD00_02.DRUG_USAGE
     */
    public String getDrugUsage() {
        return drugUsage;
    }

    /**
     * HDSD00_02.DRUG_USAGE
     *
     * @param drugUsage the value for HDSD00_02.DRUG_USAGE
     */
    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage;
    }

    /**
     * HDSD00_02.DRUG_ADRS
     *
     * @return the value of HDSD00_02.DRUG_ADRS
     */
    public String getDrugAdrs() {
        return drugAdrs;
    }

    /**
     * HDSD00_02.DRUG_ADRS
     *
     * @param drugAdrs the value for HDSD00_02.DRUG_ADRS
     */
    public void setDrugAdrs(String drugAdrs) {
        this.drugAdrs = drugAdrs;
    }

    /**
     * HDSD00_02.DRUG_CM_TYPE
     *
     * @return the value of HDSD00_02.DRUG_CM_TYPE
     */
    public String getDrugCmType() {
        return drugCmType;
    }

    /**
     * HDSD00_02.DRUG_CM_TYPE
     *
     * @param drugCmType the value for HDSD00_02.DRUG_CM_TYPE
     */
    public void setDrugCmType(String drugCmType) {
        this.drugCmType = drugCmType;
    }

    /**
     * HDSD00_02.OPER_NAME
     *
     * @return the value of HDSD00_02.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * HDSD00_02.OPER_NAME
     *
     * @param operName the value for HDSD00_02.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }

    /**
     * HDSD00_02.DRUG_CM_TYPE_CODE
     *
     * @return the value of HDSD00_02.DRUG_CM_TYPE_CODE
     */
    public String getDrugCmTypeCode() {
        return drugCmTypeCode;
    }

    /**
     * HDSD00_02.DRUG_CM_TYPE_CODE
     *
     * @param drugCmTypeCode the value for HDSD00_02.DRUG_CM_TYPE_CODE
     */
    public void setDrugCmTypeCode(String drugCmTypeCode) {
        this.drugCmTypeCode = drugCmTypeCode;
    }

    /**
     * HDSD00_02.DEATH_CAUSE
     *
     * @return the value of HDSD00_02.DEATH_CAUSE
     */
    public String getDeathCause() {
        return deathCause;
    }

    /**
     * HDSD00_02.DEATH_CAUSE
     *
     * @param deathCause the value for HDSD00_02.DEATH_CAUSE
     */
    public void setDeathCause(String deathCause) {
        this.deathCause = deathCause;
    }

    /**
     * HDSD00_02.CATEGORY_NAME
     *
     * @return the value of HDSD00_02.CATEGORY_NAME
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * HDSD00_02.CATEGORY_NAME
     *
     * @param categoryName the value for HDSD00_02.CATEGORY_NAME
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitDomain() {
        return visitDomain;
    }

    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }
}