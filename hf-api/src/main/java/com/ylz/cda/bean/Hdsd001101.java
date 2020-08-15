package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.BaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_11_01")
public class Hdsd001101 extends BaseBean implements Serializable {
    private static final long serialVersionUID = -1526112361461568508L;
    private Date uploadTime;

    private String status;

    private Integer pk;

    private String empi;

    private String encounterId;

    private String domainId;

    private String workplaceZip;

    private String workplaceVillage;

    private String workplaceTownship;

    private String workplaceProvince;

    private String workplacePhone;

    private String workplaceDoor;

    private String workplaceCounty;

    private String workplaceCity;

    private String workplace;

    private String westernMedicineFee;

    private String westernAntibioticsFee;

    private String wardName;

    private String wardId;

    private String xdsVersion;

    private String transferCategory;

    private String traineeName;

    private String traineeCode;

    private String therapeuticTreatFee;

    private String therapeuticSurgicalFee;

    private String therapeuticNsurgicalFee;

    private String therapeuticClinicalFee;

    private String therapeuticAnesthesiaFee;

    private String telephone;

    private String tcmTreatmentFee;

    private String tcmPatentFee;

    private String tcmHerbalFee;

    private String tbiBeforMin;

    private String tbiBeforHour;

    private String tbiBeforDay;

    private String tbiAfterMin;

    private String tbiAfterHour;

    private String tbiAfterDay;

    private String rhGroup;

    private String rhCode;

    private String responsibleNursecode;

    private String responsibleNurse;

    private String residentName;

    private String residentCode;

    private String reportTitle;

    private String relationshipCode;

    private String redischargeSign;

    private String redischargeReason;

    private String recoveryFee;

    private String recordQualitycode;

    private String qualityNursecode;

    private String qualityNurse;

    private String qualityName;

    private String qualityDate;

    private String qualityCode;

    private String paymentCode;

    private String patientName;

    private String patientType;

    private String patientTypecode;

    private String visitTimes;

    private String visitId;

    private String visitDomain;

    private String patientId;

    private String patientDomain;

    private String otherOtherFees;

    private String originProvinces;

    private String originCity;

    private String neonatalWeight;

    private String neonatalAdmissionWeight;

    private String nationCode;

    private String nationalityCode;

    private String nationality;

    private String nation;

    private String medicalRecordId;

    private String marriageName;

    private String marriageCode;

    private String xdsType;

    private String inNum;

    private String intotalSelfpayment;

    private String intotalFee;

    private String internName;

    private String internCode;

    private String integratedOtherFee;

    private String integratedOperatingFee;

    private String integratedNursingFee;

    private String integratedGeneralFee;

    private String hospitalCode;

    private String hospitalName;

    private String inpatient;

    private String indiseaseStatuscode;

    private String idNum;

    private String hukouZip;

    private String hukouVillage;

    private String hukouTownship;

    private String hukouProvinces;

    private String hukouDoor;

    private String hukouCounty;

    private String hukouCity;

    private String healthCard;

    private String genderCode;

    private String externalCausesInjury;

    private String externalCausesDisease;

    private String draftOrganizaName;

    private String docTemplateOid;

    private String docRegistrModel;

    private String uniqueId;

    private String docEffectiveTime;

    private String docCustodiancode;

    private String docCustodian;

    private String docCryptographiccode;

    private String docCryptographic;

    private String docAuthorcode;

    private String docAuthor;

    private String dischargeWardcode;

    private String dischargeWard;

    private String dischargeModecode;

    private String dischargeDeptcode;

    private String dischargeDept;

    private String dischargeDate;

    private String directorName;

    private String directorCode;

    private String diagnosticPathologicalFee;

    private String diagnosticLaboratoryFee;

    private String diagnosticImagingFee;

    private String diagnosticClinicalFee;

    private String deptName;

    private String deptCode;

    private String dateofBirth;

    private String currentZip;

    private String currentVillage;

    private String currentTownship;

    private String currentProvince;

    private String currentDoorNumber;

    private String currentCounty;

    private String currentCity;

    private String contactVillage;

    private String contactTownship;

    private String contactProvinces;

    private String contactPostcode;

    private String contactNumber;

    private String contactName;

    private String contactDoor;

    private String contactCounty;

    private String contactCity;

    private String consumablesTreatment;

    private String consumablesSurgery;

    private String consumablesCheck;

    private String coderName;

    private String coderCode;

    private String chiefSectionCode;

    private String chiefSection;

    private String careerCategorycode;

    private String careerCategory;

    private String bloodGlobulinFee;

    private String bloodCytokineFee;

    private String bloodCoagulationFee;

    private String bloodBloodFee;

    private String bloodAlbuminFee;

    private String birthProvinces;

    private String birthNative;

    private String birthCity;

    private String birthplaceZip;

    private String autopsyMark;

    private String attendingName;

    private String attendingCode;

    private String allergen;

    private String ageUnit;

    private String age;

    private String outPatientId;

    private String visitDate;

    private String admissionRouteName;

    private String admissionRouteCode;

    private String admissionDate;

    private String actualHod;

    private String aboCode;

    private String abo;

    private String gender;

    private String relationshipName;

    private String indiseaseStatus;

    private String externalCausesDiseaseCode;

    private String paymentName;

    private String recordQuality;

    private String dischargeMode;

    private String docWritingTime;

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi == null ? null : empi.trim();
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId == null ? null : encounterId.trim();
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId == null ? null : domainId.trim();
    }

    public String getWorkplaceZip() {
        return workplaceZip;
    }

    public void setWorkplaceZip(String workplaceZip) {
        this.workplaceZip = workplaceZip == null ? null : workplaceZip.trim();
    }

    public String getWorkplaceVillage() {
        return workplaceVillage;
    }

    public void setWorkplaceVillage(String workplaceVillage) {
        this.workplaceVillage = workplaceVillage == null ? null : workplaceVillage.trim();
    }

    public String getWorkplaceTownship() {
        return workplaceTownship;
    }

    public void setWorkplaceTownship(String workplaceTownship) {
        this.workplaceTownship = workplaceTownship == null ? null : workplaceTownship.trim();
    }

    public String getWorkplaceProvince() {
        return workplaceProvince;
    }

    public void setWorkplaceProvince(String workplaceProvince) {
        this.workplaceProvince = workplaceProvince == null ? null : workplaceProvince.trim();
    }

    public String getWorkplacePhone() {
        return workplacePhone;
    }

    public void setWorkplacePhone(String workplacePhone) {
        this.workplacePhone = workplacePhone == null ? null : workplacePhone.trim();
    }

    public String getWorkplaceDoor() {
        return workplaceDoor;
    }

    public void setWorkplaceDoor(String workplaceDoor) {
        this.workplaceDoor = workplaceDoor == null ? null : workplaceDoor.trim();
    }

    public String getWorkplaceCounty() {
        return workplaceCounty;
    }

    public void setWorkplaceCounty(String workplaceCounty) {
        this.workplaceCounty = workplaceCounty == null ? null : workplaceCounty.trim();
    }

    public String getWorkplaceCity() {
        return workplaceCity;
    }

    public void setWorkplaceCity(String workplaceCity) {
        this.workplaceCity = workplaceCity == null ? null : workplaceCity.trim();
    }

    public String getWorkplace() {
        return workplace;
    }

    public void setWorkplace(String workplace) {
        this.workplace = workplace == null ? null : workplace.trim();
    }

    public String getWesternMedicineFee() {
        return westernMedicineFee;
    }

    public void setWesternMedicineFee(String westernMedicineFee) {
        this.westernMedicineFee = westernMedicineFee == null ? null : westernMedicineFee.trim();
    }

    public String getWesternAntibioticsFee() {
        return westernAntibioticsFee;
    }

    public void setWesternAntibioticsFee(String westernAntibioticsFee) {
        this.westernAntibioticsFee = westernAntibioticsFee == null ? null : westernAntibioticsFee.trim();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId == null ? null : wardId.trim();
    }

    public String getXdsVersion() {
        return xdsVersion;
    }

    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion == null ? null : xdsVersion.trim();
    }

    public String getTransferCategory() {
        return transferCategory;
    }

    public void setTransferCategory(String transferCategory) {
        this.transferCategory = transferCategory == null ? null : transferCategory.trim();
    }

    public String getTraineeName() {
        return traineeName;
    }

    public void setTraineeName(String traineeName) {
        this.traineeName = traineeName == null ? null : traineeName.trim();
    }

    public String getTraineeCode() {
        return traineeCode;
    }

    public void setTraineeCode(String traineeCode) {
        this.traineeCode = traineeCode == null ? null : traineeCode.trim();
    }

    public String getTherapeuticTreatFee() {
        return therapeuticTreatFee;
    }

    public void setTherapeuticTreatFee(String therapeuticTreatFee) {
        this.therapeuticTreatFee = therapeuticTreatFee == null ? null : therapeuticTreatFee.trim();
    }

    public String getTherapeuticSurgicalFee() {
        return therapeuticSurgicalFee;
    }

    public void setTherapeuticSurgicalFee(String therapeuticSurgicalFee) {
        this.therapeuticSurgicalFee = therapeuticSurgicalFee == null ? null : therapeuticSurgicalFee.trim();
    }

    public String getTherapeuticNsurgicalFee() {
        return therapeuticNsurgicalFee;
    }

    public void setTherapeuticNsurgicalFee(String therapeuticNsurgicalFee) {
        this.therapeuticNsurgicalFee = therapeuticNsurgicalFee == null ? null : therapeuticNsurgicalFee.trim();
    }

    public String getTherapeuticClinicalFee() {
        return therapeuticClinicalFee;
    }

    public void setTherapeuticClinicalFee(String therapeuticClinicalFee) {
        this.therapeuticClinicalFee = therapeuticClinicalFee == null ? null : therapeuticClinicalFee.trim();
    }

    public String getTherapeuticAnesthesiaFee() {
        return therapeuticAnesthesiaFee;
    }

    public void setTherapeuticAnesthesiaFee(String therapeuticAnesthesiaFee) {
        this.therapeuticAnesthesiaFee = therapeuticAnesthesiaFee == null ? null : therapeuticAnesthesiaFee.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getTcmTreatmentFee() {
        return tcmTreatmentFee;
    }

    public void setTcmTreatmentFee(String tcmTreatmentFee) {
        this.tcmTreatmentFee = tcmTreatmentFee == null ? null : tcmTreatmentFee.trim();
    }

    public String getTcmPatentFee() {
        return tcmPatentFee;
    }

    public void setTcmPatentFee(String tcmPatentFee) {
        this.tcmPatentFee = tcmPatentFee == null ? null : tcmPatentFee.trim();
    }

    public String getTcmHerbalFee() {
        return tcmHerbalFee;
    }

    public void setTcmHerbalFee(String tcmHerbalFee) {
        this.tcmHerbalFee = tcmHerbalFee == null ? null : tcmHerbalFee.trim();
    }

    public String getTbiBeforMin() {
        return tbiBeforMin;
    }

    public void setTbiBeforMin(String tbiBeforMin) {
        this.tbiBeforMin = tbiBeforMin == null ? null : tbiBeforMin.trim();
    }

    public String getTbiBeforHour() {
        return tbiBeforHour;
    }

    public void setTbiBeforHour(String tbiBeforHour) {
        this.tbiBeforHour = tbiBeforHour == null ? null : tbiBeforHour.trim();
    }

    public String getTbiBeforDay() {
        return tbiBeforDay;
    }

    public void setTbiBeforDay(String tbiBeforDay) {
        this.tbiBeforDay = tbiBeforDay == null ? null : tbiBeforDay.trim();
    }

    public String getTbiAfterMin() {
        return tbiAfterMin;
    }

    public void setTbiAfterMin(String tbiAfterMin) {
        this.tbiAfterMin = tbiAfterMin == null ? null : tbiAfterMin.trim();
    }

    public String getTbiAfterHour() {
        return tbiAfterHour;
    }

    public void setTbiAfterHour(String tbiAfterHour) {
        this.tbiAfterHour = tbiAfterHour == null ? null : tbiAfterHour.trim();
    }

    public String getTbiAfterDay() {
        return tbiAfterDay;
    }

    public void setTbiAfterDay(String tbiAfterDay) {
        this.tbiAfterDay = tbiAfterDay == null ? null : tbiAfterDay.trim();
    }

    public String getRhGroup() {
        return rhGroup;
    }

    public void setRhGroup(String rhGroup) {
        this.rhGroup = rhGroup == null ? null : rhGroup.trim();
    }

    public String getRhCode() {
        return rhCode;
    }

    public void setRhCode(String rhCode) {
        this.rhCode = rhCode == null ? null : rhCode.trim();
    }

    public String getResponsibleNursecode() {
        return responsibleNursecode;
    }

    public void setResponsibleNursecode(String responsibleNursecode) {
        this.responsibleNursecode = responsibleNursecode == null ? null : responsibleNursecode.trim();
    }

    public String getResponsibleNurse() {
        return responsibleNurse;
    }

    public void setResponsibleNurse(String responsibleNurse) {
        this.responsibleNurse = responsibleNurse == null ? null : responsibleNurse.trim();
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName == null ? null : residentName.trim();
    }

    public String getResidentCode() {
        return residentCode;
    }

    public void setResidentCode(String residentCode) {
        this.residentCode = residentCode == null ? null : residentCode.trim();
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode == null ? null : relationshipCode.trim();
    }

    public String getRedischargeSign() {
        return redischargeSign;
    }

    public void setRedischargeSign(String redischargeSign) {
        this.redischargeSign = redischargeSign == null ? null : redischargeSign.trim();
    }

    public String getRedischargeReason() {
        return redischargeReason;
    }

    public void setRedischargeReason(String redischargeReason) {
        this.redischargeReason = redischargeReason == null ? null : redischargeReason.trim();
    }

    public String getRecoveryFee() {
        return recoveryFee;
    }

    public void setRecoveryFee(String recoveryFee) {
        this.recoveryFee = recoveryFee == null ? null : recoveryFee.trim();
    }

    public String getRecordQualitycode() {
        return recordQualitycode;
    }

    public void setRecordQualitycode(String recordQualitycode) {
        this.recordQualitycode = recordQualitycode == null ? null : recordQualitycode.trim();
    }

    public String getQualityNursecode() {
        return qualityNursecode;
    }

    public void setQualityNursecode(String qualityNursecode) {
        this.qualityNursecode = qualityNursecode == null ? null : qualityNursecode.trim();
    }

    public String getQualityNurse() {
        return qualityNurse;
    }

    public void setQualityNurse(String qualityNurse) {
        this.qualityNurse = qualityNurse == null ? null : qualityNurse.trim();
    }

    public String getQualityName() {
        return qualityName;
    }

    public void setQualityName(String qualityName) {
        this.qualityName = qualityName == null ? null : qualityName.trim();
    }

    public String getQualityDate() {
        return qualityDate;
    }

    public void setQualityDate(String qualityDate) {
        this.qualityDate = qualityDate == null ? null : qualityDate.trim();
    }

    public String getQualityCode() {
        return qualityCode;
    }

    public void setQualityCode(String qualityCode) {
        this.qualityCode = qualityCode == null ? null : qualityCode.trim();
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode == null ? null : paymentCode.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType == null ? null : patientType.trim();
    }

    public String getPatientTypecode() {
        return patientTypecode;
    }

    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode == null ? null : patientTypecode.trim();
    }

    public String getVisitTimes() {
        return visitTimes;
    }

    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes == null ? null : visitTimes.trim();
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId == null ? null : visitId.trim();
    }

    public String getVisitDomain() {
        return visitDomain;
    }

    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain == null ? null : visitDomain.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getPatientDomain() {
        return patientDomain;
    }

    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain == null ? null : patientDomain.trim();
    }

    public String getOtherOtherFees() {
        return otherOtherFees;
    }

    public void setOtherOtherFees(String otherOtherFees) {
        this.otherOtherFees = otherOtherFees == null ? null : otherOtherFees.trim();
    }

    public String getOriginProvinces() {
        return originProvinces;
    }

    public void setOriginProvinces(String originProvinces) {
        this.originProvinces = originProvinces == null ? null : originProvinces.trim();
    }

    public String getOriginCity() {
        return originCity;
    }

    public void setOriginCity(String originCity) {
        this.originCity = originCity == null ? null : originCity.trim();
    }

    public String getNeonatalWeight() {
        return neonatalWeight;
    }

    public void setNeonatalWeight(String neonatalWeight) {
        this.neonatalWeight = neonatalWeight == null ? null : neonatalWeight.trim();
    }

    public String getNeonatalAdmissionWeight() {
        return neonatalAdmissionWeight;
    }

    public void setNeonatalAdmissionWeight(String neonatalAdmissionWeight) {
        this.neonatalAdmissionWeight = neonatalAdmissionWeight == null ? null : neonatalAdmissionWeight.trim();
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode == null ? null : nationCode.trim();
    }

    public String getNationalityCode() {
        return nationalityCode;
    }

    public void setNationalityCode(String nationalityCode) {
        this.nationalityCode = nationalityCode == null ? null : nationalityCode.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getMedicalRecordId() {
        return medicalRecordId;
    }

    public void setMedicalRecordId(String medicalRecordId) {
        this.medicalRecordId = medicalRecordId == null ? null : medicalRecordId.trim();
    }

    public String getMarriageName() {
        return marriageName;
    }

    public void setMarriageName(String marriageName) {
        this.marriageName = marriageName == null ? null : marriageName.trim();
    }

    public String getMarriageCode() {
        return marriageCode;
    }

    public void setMarriageCode(String marriageCode) {
        this.marriageCode = marriageCode == null ? null : marriageCode.trim();
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType == null ? null : xdsType.trim();
    }

    public String getInNum() {
        return inNum;
    }

    public void setInNum(String inNum) {
        this.inNum = inNum == null ? null : inNum.trim();
    }

    public String getIntotalSelfpayment() {
        return intotalSelfpayment;
    }

    public void setIntotalSelfpayment(String intotalSelfpayment) {
        this.intotalSelfpayment = intotalSelfpayment == null ? null : intotalSelfpayment.trim();
    }

    public String getIntotalFee() {
        return intotalFee;
    }

    public void setIntotalFee(String intotalFee) {
        this.intotalFee = intotalFee == null ? null : intotalFee.trim();
    }

    public String getInternName() {
        return internName;
    }

    public void setInternName(String internName) {
        this.internName = internName == null ? null : internName.trim();
    }

    public String getInternCode() {
        return internCode;
    }

    public void setInternCode(String internCode) {
        this.internCode = internCode == null ? null : internCode.trim();
    }

    public String getIntegratedOtherFee() {
        return integratedOtherFee;
    }

    public void setIntegratedOtherFee(String integratedOtherFee) {
        this.integratedOtherFee = integratedOtherFee == null ? null : integratedOtherFee.trim();
    }

    public String getIntegratedOperatingFee() {
        return integratedOperatingFee;
    }

    public void setIntegratedOperatingFee(String integratedOperatingFee) {
        this.integratedOperatingFee = integratedOperatingFee == null ? null : integratedOperatingFee.trim();
    }

    public String getIntegratedNursingFee() {
        return integratedNursingFee;
    }

    public void setIntegratedNursingFee(String integratedNursingFee) {
        this.integratedNursingFee = integratedNursingFee == null ? null : integratedNursingFee.trim();
    }

    public String getIntegratedGeneralFee() {
        return integratedGeneralFee;
    }

    public void setIntegratedGeneralFee(String integratedGeneralFee) {
        this.integratedGeneralFee = integratedGeneralFee == null ? null : integratedGeneralFee.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getInpatient() {
        return inpatient;
    }

    public void setInpatient(String inpatient) {
        this.inpatient = inpatient == null ? null : inpatient.trim();
    }

    public String getIndiseaseStatuscode() {
        return indiseaseStatuscode;
    }

    public void setIndiseaseStatuscode(String indiseaseStatuscode) {
        this.indiseaseStatuscode = indiseaseStatuscode == null ? null : indiseaseStatuscode.trim();
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
    }

    public String getHukouZip() {
        return hukouZip;
    }

    public void setHukouZip(String hukouZip) {
        this.hukouZip = hukouZip == null ? null : hukouZip.trim();
    }

    public String getHukouVillage() {
        return hukouVillage;
    }

    public void setHukouVillage(String hukouVillage) {
        this.hukouVillage = hukouVillage == null ? null : hukouVillage.trim();
    }

    public String getHukouTownship() {
        return hukouTownship;
    }

    public void setHukouTownship(String hukouTownship) {
        this.hukouTownship = hukouTownship == null ? null : hukouTownship.trim();
    }

    public String getHukouProvinces() {
        return hukouProvinces;
    }

    public void setHukouProvinces(String hukouProvinces) {
        this.hukouProvinces = hukouProvinces == null ? null : hukouProvinces.trim();
    }

    public String getHukouDoor() {
        return hukouDoor;
    }

    public void setHukouDoor(String hukouDoor) {
        this.hukouDoor = hukouDoor == null ? null : hukouDoor.trim();
    }

    public String getHukouCounty() {
        return hukouCounty;
    }

    public void setHukouCounty(String hukouCounty) {
        this.hukouCounty = hukouCounty == null ? null : hukouCounty.trim();
    }

    public String getHukouCity() {
        return hukouCity;
    }

    public void setHukouCity(String hukouCity) {
        this.hukouCity = hukouCity == null ? null : hukouCity.trim();
    }

    public String getHealthCard() {
        return healthCard;
    }

    public void setHealthCard(String healthCard) {
        this.healthCard = healthCard == null ? null : healthCard.trim();
    }

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    public String getExternalCausesInjury() {
        return externalCausesInjury;
    }

    public void setExternalCausesInjury(String externalCausesInjury) {
        this.externalCausesInjury = externalCausesInjury == null ? null : externalCausesInjury.trim();
    }

    public String getExternalCausesDisease() {
        return externalCausesDisease;
    }

    public void setExternalCausesDisease(String externalCausesDisease) {
        this.externalCausesDisease = externalCausesDisease == null ? null : externalCausesDisease.trim();
    }

    public String getDraftOrganizaName() {
        return draftOrganizaName;
    }

    public void setDraftOrganizaName(String draftOrganizaName) {
        this.draftOrganizaName = draftOrganizaName == null ? null : draftOrganizaName.trim();
    }

    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid == null ? null : docTemplateOid.trim();
    }

    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel == null ? null : docRegistrModel.trim();
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime == null ? null : docEffectiveTime.trim();
    }

    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode == null ? null : docCustodiancode.trim();
    }

    public String getDocCustodian() {
        return docCustodian;
    }

    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian == null ? null : docCustodian.trim();
    }

    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode == null ? null : docCryptographiccode.trim();
    }

    public String getDocCryptographic() {
        return docCryptographic;
    }

    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic == null ? null : docCryptographic.trim();
    }

    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode == null ? null : docAuthorcode.trim();
    }

    public String getDocAuthor() {
        return docAuthor;
    }

    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor == null ? null : docAuthor.trim();
    }

    public String getDischargeWardcode() {
        return dischargeWardcode;
    }

    public void setDischargeWardcode(String dischargeWardcode) {
        this.dischargeWardcode = dischargeWardcode == null ? null : dischargeWardcode.trim();
    }

    public String getDischargeWard() {
        return dischargeWard;
    }

    public void setDischargeWard(String dischargeWard) {
        this.dischargeWard = dischargeWard == null ? null : dischargeWard.trim();
    }

    public String getDischargeModecode() {
        return dischargeModecode;
    }

    public void setDischargeModecode(String dischargeModecode) {
        this.dischargeModecode = dischargeModecode == null ? null : dischargeModecode.trim();
    }

    public String getDischargeDeptcode() {
        return dischargeDeptcode;
    }

    public void setDischargeDeptcode(String dischargeDeptcode) {
        this.dischargeDeptcode = dischargeDeptcode == null ? null : dischargeDeptcode.trim();
    }

    public String getDischargeDept() {
        return dischargeDept;
    }

    public void setDischargeDept(String dischargeDept) {
        this.dischargeDept = dischargeDept == null ? null : dischargeDept.trim();
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName == null ? null : directorName.trim();
    }

    public String getDirectorCode() {
        return directorCode;
    }

    public void setDirectorCode(String directorCode) {
        this.directorCode = directorCode == null ? null : directorCode.trim();
    }

    public String getDiagnosticPathologicalFee() {
        return diagnosticPathologicalFee;
    }

    public void setDiagnosticPathologicalFee(String diagnosticPathologicalFee) {
        this.diagnosticPathologicalFee = diagnosticPathologicalFee == null ? null : diagnosticPathologicalFee.trim();
    }

    public String getDiagnosticLaboratoryFee() {
        return diagnosticLaboratoryFee;
    }

    public void setDiagnosticLaboratoryFee(String diagnosticLaboratoryFee) {
        this.diagnosticLaboratoryFee = diagnosticLaboratoryFee == null ? null : diagnosticLaboratoryFee.trim();
    }

    public String getDiagnosticImagingFee() {
        return diagnosticImagingFee;
    }

    public void setDiagnosticImagingFee(String diagnosticImagingFee) {
        this.diagnosticImagingFee = diagnosticImagingFee == null ? null : diagnosticImagingFee.trim();
    }

    public String getDiagnosticClinicalFee() {
        return diagnosticClinicalFee;
    }

    public void setDiagnosticClinicalFee(String diagnosticClinicalFee) {
        this.diagnosticClinicalFee = diagnosticClinicalFee == null ? null : diagnosticClinicalFee.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDateofBirth() {
        return dateofBirth;
    }

    public void setDateofBirth(String dateofBirth) {
        this.dateofBirth = dateofBirth == null ? null : dateofBirth.trim();
    }

    public String getCurrentZip() {
        return currentZip;
    }

    public void setCurrentZip(String currentZip) {
        this.currentZip = currentZip == null ? null : currentZip.trim();
    }

    public String getCurrentVillage() {
        return currentVillage;
    }

    public void setCurrentVillage(String currentVillage) {
        this.currentVillage = currentVillage == null ? null : currentVillage.trim();
    }

    public String getCurrentTownship() {
        return currentTownship;
    }

    public void setCurrentTownship(String currentTownship) {
        this.currentTownship = currentTownship == null ? null : currentTownship.trim();
    }

    public String getCurrentProvince() {
        return currentProvince;
    }

    public void setCurrentProvince(String currentProvince) {
        this.currentProvince = currentProvince == null ? null : currentProvince.trim();
    }

    public String getCurrentDoorNumber() {
        return currentDoorNumber;
    }

    public void setCurrentDoorNumber(String currentDoorNumber) {
        this.currentDoorNumber = currentDoorNumber == null ? null : currentDoorNumber.trim();
    }

    public String getCurrentCounty() {
        return currentCounty;
    }

    public void setCurrentCounty(String currentCounty) {
        this.currentCounty = currentCounty == null ? null : currentCounty.trim();
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity == null ? null : currentCity.trim();
    }

    public String getContactVillage() {
        return contactVillage;
    }

    public void setContactVillage(String contactVillage) {
        this.contactVillage = contactVillage == null ? null : contactVillage.trim();
    }

    public String getContactTownship() {
        return contactTownship;
    }

    public void setContactTownship(String contactTownship) {
        this.contactTownship = contactTownship == null ? null : contactTownship.trim();
    }

    public String getContactProvinces() {
        return contactProvinces;
    }

    public void setContactProvinces(String contactProvinces) {
        this.contactProvinces = contactProvinces == null ? null : contactProvinces.trim();
    }

    public String getContactPostcode() {
        return contactPostcode;
    }

    public void setContactPostcode(String contactPostcode) {
        this.contactPostcode = contactPostcode == null ? null : contactPostcode.trim();
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber == null ? null : contactNumber.trim();
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName == null ? null : contactName.trim();
    }

    public String getContactDoor() {
        return contactDoor;
    }

    public void setContactDoor(String contactDoor) {
        this.contactDoor = contactDoor == null ? null : contactDoor.trim();
    }

    public String getContactCounty() {
        return contactCounty;
    }

    public void setContactCounty(String contactCounty) {
        this.contactCounty = contactCounty == null ? null : contactCounty.trim();
    }

    public String getContactCity() {
        return contactCity;
    }

    public void setContactCity(String contactCity) {
        this.contactCity = contactCity == null ? null : contactCity.trim();
    }

    public String getConsumablesTreatment() {
        return consumablesTreatment;
    }

    public void setConsumablesTreatment(String consumablesTreatment) {
        this.consumablesTreatment = consumablesTreatment == null ? null : consumablesTreatment.trim();
    }

    public String getConsumablesSurgery() {
        return consumablesSurgery;
    }

    public void setConsumablesSurgery(String consumablesSurgery) {
        this.consumablesSurgery = consumablesSurgery == null ? null : consumablesSurgery.trim();
    }

    public String getConsumablesCheck() {
        return consumablesCheck;
    }

    public void setConsumablesCheck(String consumablesCheck) {
        this.consumablesCheck = consumablesCheck == null ? null : consumablesCheck.trim();
    }

    public String getCoderName() {
        return coderName;
    }

    public void setCoderName(String coderName) {
        this.coderName = coderName == null ? null : coderName.trim();
    }

    public String getCoderCode() {
        return coderCode;
    }

    public void setCoderCode(String coderCode) {
        this.coderCode = coderCode == null ? null : coderCode.trim();
    }

    public String getChiefSectionCode() {
        return chiefSectionCode;
    }

    public void setChiefSectionCode(String chiefSectionCode) {
        this.chiefSectionCode = chiefSectionCode == null ? null : chiefSectionCode.trim();
    }

    public String getChiefSection() {
        return chiefSection;
    }

    public void setChiefSection(String chiefSection) {
        this.chiefSection = chiefSection == null ? null : chiefSection.trim();
    }

    public String getCareerCategorycode() {
        return careerCategorycode;
    }

    public void setCareerCategorycode(String careerCategorycode) {
        this.careerCategorycode = careerCategorycode == null ? null : careerCategorycode.trim();
    }

    public String getCareerCategory() {
        return careerCategory;
    }

    public void setCareerCategory(String careerCategory) {
        this.careerCategory = careerCategory == null ? null : careerCategory.trim();
    }

    public String getBloodGlobulinFee() {
        return bloodGlobulinFee;
    }

    public void setBloodGlobulinFee(String bloodGlobulinFee) {
        this.bloodGlobulinFee = bloodGlobulinFee == null ? null : bloodGlobulinFee.trim();
    }

    public String getBloodCytokineFee() {
        return bloodCytokineFee;
    }

    public void setBloodCytokineFee(String bloodCytokineFee) {
        this.bloodCytokineFee = bloodCytokineFee == null ? null : bloodCytokineFee.trim();
    }

    public String getBloodCoagulationFee() {
        return bloodCoagulationFee;
    }

    public void setBloodCoagulationFee(String bloodCoagulationFee) {
        this.bloodCoagulationFee = bloodCoagulationFee == null ? null : bloodCoagulationFee.trim();
    }

    public String getBloodBloodFee() {
        return bloodBloodFee;
    }

    public void setBloodBloodFee(String bloodBloodFee) {
        this.bloodBloodFee = bloodBloodFee == null ? null : bloodBloodFee.trim();
    }

    public String getBloodAlbuminFee() {
        return bloodAlbuminFee;
    }

    public void setBloodAlbuminFee(String bloodAlbuminFee) {
        this.bloodAlbuminFee = bloodAlbuminFee == null ? null : bloodAlbuminFee.trim();
    }

    public String getBirthProvinces() {
        return birthProvinces;
    }

    public void setBirthProvinces(String birthProvinces) {
        this.birthProvinces = birthProvinces == null ? null : birthProvinces.trim();
    }

    public String getBirthNative() {
        return birthNative;
    }

    public void setBirthNative(String birthNative) {
        this.birthNative = birthNative == null ? null : birthNative.trim();
    }

    public String getBirthCity() {
        return birthCity;
    }

    public void setBirthCity(String birthCity) {
        this.birthCity = birthCity == null ? null : birthCity.trim();
    }

    public String getBirthplaceZip() {
        return birthplaceZip;
    }

    public void setBirthplaceZip(String birthplaceZip) {
        this.birthplaceZip = birthplaceZip == null ? null : birthplaceZip.trim();
    }

    public String getAutopsyMark() {
        return autopsyMark;
    }

    public void setAutopsyMark(String autopsyMark) {
        this.autopsyMark = autopsyMark == null ? null : autopsyMark.trim();
    }

    public String getAttendingName() {
        return attendingName;
    }

    public void setAttendingName(String attendingName) {
        this.attendingName = attendingName == null ? null : attendingName.trim();
    }

    public String getAttendingCode() {
        return attendingCode;
    }

    public void setAttendingCode(String attendingCode) {
        this.attendingCode = attendingCode == null ? null : attendingCode.trim();
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen == null ? null : allergen.trim();
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit == null ? null : ageUnit.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId == null ? null : outPatientId.trim();
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate == null ? null : visitDate.trim();
    }

    public String getAdmissionRouteName() {
        return admissionRouteName;
    }

    public void setAdmissionRouteName(String admissionRouteName) {
        this.admissionRouteName = admissionRouteName == null ? null : admissionRouteName.trim();
    }

    public String getAdmissionRouteCode() {
        return admissionRouteCode;
    }

    public void setAdmissionRouteCode(String admissionRouteCode) {
        this.admissionRouteCode = admissionRouteCode == null ? null : admissionRouteCode.trim();
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    public String getActualHod() {
        return actualHod;
    }

    public void setActualHod(String actualHod) {
        this.actualHod = actualHod == null ? null : actualHod.trim();
    }

    public String getAboCode() {
        return aboCode;
    }

    public void setAboCode(String aboCode) {
        this.aboCode = aboCode == null ? null : aboCode.trim();
    }

    public String getAbo() {
        return abo;
    }

    public void setAbo(String abo) {
        this.abo = abo == null ? null : abo.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName == null ? null : relationshipName.trim();
    }

    public String getIndiseaseStatus() {
        return indiseaseStatus;
    }

    public void setIndiseaseStatus(String indiseaseStatus) {
        this.indiseaseStatus = indiseaseStatus == null ? null : indiseaseStatus.trim();
    }

    public String getExternalCausesDiseaseCode() {
        return externalCausesDiseaseCode;
    }

    public void setExternalCausesDiseaseCode(String externalCausesDiseaseCode) {
        this.externalCausesDiseaseCode = externalCausesDiseaseCode == null ? null : externalCausesDiseaseCode.trim();
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName == null ? null : paymentName.trim();
    }

    public String getRecordQuality() {
        return recordQuality;
    }

    public void setRecordQuality(String recordQuality) {
        this.recordQuality = recordQuality == null ? null : recordQuality.trim();
    }

    public String getDischargeMode() {
        return dischargeMode;
    }

    public void setDischargeMode(String dischargeMode) {
        this.dischargeMode = dischargeMode == null ? null : dischargeMode.trim();
    }

    public String getDocWritingTime() {
        return docWritingTime;
    }

    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime == null ? null : docWritingTime.trim();
    }
}