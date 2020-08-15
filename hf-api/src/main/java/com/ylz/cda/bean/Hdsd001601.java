package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.BaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_16_01")
public class Hdsd001601 extends BaseBean implements Serializable {
    private static final long serialVersionUID = 1616439632860013201L;
    private Date uploadTime;

    private String status;

    private Integer pk;

    private String empi;

    private String encounterId;

    private String domainId;

    private String wardName;

    private String wardId;

    private String wardsName;

    private String wardsId;

    private String xdsVersion;

    private String treatmentProcess;

    private String therapeuticOutcomecode;

    private String telephone;

    private String tcmFourDiagnosis;

    private String superiorSigndate;

    private String superiorName;

    private String superiorCode;

    private String residentSigndate;

    private String residentName;

    private String residentCode;

    private String reportTitle;

    private String principleAndMethod;

    private String patientName;

    private String patientType;

    private String patientTypecode;

    private String visitTimes;

    private String visitId;

    private String visitDomain;

    private String patientId;

    private String patientDomain;

    private String docCustodian;

    private String docCustodiancode;

    private String marriageName;

    private String marriageCode;

    private String xdsType;

    private String hospitalName;

    private String hospitalCode;

    private String itemResult;

    private String inpatient;

    private String idNum;

    private String healthCard;

    private String genderCode;

    private String docWritingTime;

    private String docTemplateOid;

    private String docRegistrModel;

    private String uniqueId;

    private String docEffectiveTime;

    private String docCryptographiccode;

    private String docCryptographic;

    private String docAuthorcode;

    private String docAuthor;

    private String dischargeSymptoms;

    private String dischargeDate;

    private String discharge;

    private String deptName;

    private String deptCode;

    private String dateofBirth;

    private String contactNumber;

    private String contactName;

    private String careerCategorycode;

    private String careerCategory;

    private String bedNo;

    private String bedName;

    private String ageUnit;

    private String age;

    private String visitDate;

    private String outPatientId;

    private String admissionStatus;

    private String admissionDate;

    private String addressZip;

    private String addressVillage;

    private String addressTownship;

    private String addressProvince;

    private String addressDoor;

    private String addressCounty;

    private String addressCity;

    private String actualHod;

    private String gender;

    private String therapeuticOutcome;

    private String decoctMethod;

    private String tcmDrugUse;

    private String dischargeOrder;
    private String operCode;
    private String operStartDate;
    private String operCutCode;
    private String operIhgCode;
    private String operIhgName;
    private String anesMethodCode;
    private String proProcess;
    private String anesMethodName;
    private String operCutName;
    private String operName;

    @Override
    public String getDomainId() {
        return domainId;
    }

    @Override
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public String getXdsVersion() {
        return xdsVersion;
    }

    @Override
    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    @Override
    public String getXdsType() {
        return xdsType;
    }

    @Override
    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

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

    public String getWardsName() {
        return wardsName;
    }

    public void setWardsName(String wardsName) {
        this.wardsName = wardsName == null ? null : wardsName.trim();
    }

    public String getWardsId() {
        return wardsId;
    }

    public void setWardsId(String wardsId) {
        this.wardsId = wardsId == null ? null : wardsId.trim();
    }

    public String getTreatmentProcess() {
        return treatmentProcess;
    }

    public void setTreatmentProcess(String treatmentProcess) {
        this.treatmentProcess = treatmentProcess == null ? null : treatmentProcess.trim();
    }

    public String getTherapeuticOutcomecode() {
        return therapeuticOutcomecode;
    }

    public void setTherapeuticOutcomecode(String therapeuticOutcomecode) {
        this.therapeuticOutcomecode = therapeuticOutcomecode == null ? null : therapeuticOutcomecode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getTcmFourDiagnosis() {
        return tcmFourDiagnosis;
    }

    public void setTcmFourDiagnosis(String tcmFourDiagnosis) {
        this.tcmFourDiagnosis = tcmFourDiagnosis == null ? null : tcmFourDiagnosis.trim();
    }

    public String getSuperiorSigndate() {
        return superiorSigndate;
    }

    public void setSuperiorSigndate(String superiorSigndate) {
        this.superiorSigndate = superiorSigndate == null ? null : superiorSigndate.trim();
    }

    public String getSuperiorName() {
        return superiorName;
    }

    public void setSuperiorName(String superiorName) {
        this.superiorName = superiorName == null ? null : superiorName.trim();
    }

    public String getSuperiorCode() {
        return superiorCode;
    }

    public void setSuperiorCode(String superiorCode) {
        this.superiorCode = superiorCode == null ? null : superiorCode.trim();
    }

    public String getResidentSigndate() {
        return residentSigndate;
    }

    public void setResidentSigndate(String residentSigndate) {
        this.residentSigndate = residentSigndate == null ? null : residentSigndate.trim();
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

    public String getPrincipleAndMethod() {
        return principleAndMethod;
    }

    public void setPrincipleAndMethod(String principleAndMethod) {
        this.principleAndMethod = principleAndMethod == null ? null : principleAndMethod.trim();
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

    public String getDocCustodian() {
        return docCustodian;
    }

    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian == null ? null : docCustodian.trim();
    }

    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode == null ? null : docCustodiancode.trim();
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

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName == null ? null : hospitalName.trim();
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode == null ? null : hospitalCode.trim();
    }

    public String getItemResult() {
        return itemResult;
    }

    public void setItemResult(String itemResult) {
        this.itemResult = itemResult == null ? null : itemResult.trim();
    }

    public String getInpatient() {
        return inpatient;
    }

    public void setInpatient(String inpatient) {
        this.inpatient = inpatient == null ? null : inpatient.trim();
    }

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum == null ? null : idNum.trim();
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

    public String getDocWritingTime() {
        return docWritingTime;
    }

    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime == null ? null : docWritingTime.trim();
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

    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime == null ? null : docEffectiveTime.trim();
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

    public String getDischargeSymptoms() {
        return dischargeSymptoms;
    }

    public void setDischargeSymptoms(String dischargeSymptoms) {
        this.dischargeSymptoms = dischargeSymptoms == null ? null : dischargeSymptoms.trim();
    }

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
    }

    public String getDischarge() {
        return discharge;
    }

    public void setDischarge(String discharge) {
        this.discharge = discharge == null ? null : discharge.trim();
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

    public String getBedNo() {
        return bedNo;
    }

    public void setBedNo(String bedNo) {
        this.bedNo = bedNo == null ? null : bedNo.trim();
    }

    public String getBedName() {
        return bedName;
    }

    public void setBedName(String bedName) {
        this.bedName = bedName == null ? null : bedName.trim();
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

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate == null ? null : visitDate.trim();
    }

    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId == null ? null : outPatientId.trim();
    }

    public String getAdmissionStatus() {
        return admissionStatus;
    }

    public void setAdmissionStatus(String admissionStatus) {
        this.admissionStatus = admissionStatus == null ? null : admissionStatus.trim();
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    public String getAddressZip() {
        return addressZip;
    }

    public void setAddressZip(String addressZip) {
        this.addressZip = addressZip == null ? null : addressZip.trim();
    }

    public String getAddressVillage() {
        return addressVillage;
    }

    public void setAddressVillage(String addressVillage) {
        this.addressVillage = addressVillage == null ? null : addressVillage.trim();
    }

    public String getAddressTownship() {
        return addressTownship;
    }

    public void setAddressTownship(String addressTownship) {
        this.addressTownship = addressTownship == null ? null : addressTownship.trim();
    }

    public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince == null ? null : addressProvince.trim();
    }

    public String getAddressDoor() {
        return addressDoor;
    }

    public void setAddressDoor(String addressDoor) {
        this.addressDoor = addressDoor == null ? null : addressDoor.trim();
    }

    public String getAddressCounty() {
        return addressCounty;
    }

    public void setAddressCounty(String addressCounty) {
        this.addressCounty = addressCounty == null ? null : addressCounty.trim();
    }

    public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity == null ? null : addressCity.trim();
    }

    public String getActualHod() {
        return actualHod;
    }

    public void setActualHod(String actualHod) {
        this.actualHod = actualHod == null ? null : actualHod.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getTherapeuticOutcome() {
        return therapeuticOutcome;
    }

    public void setTherapeuticOutcome(String therapeuticOutcome) {
        this.therapeuticOutcome = therapeuticOutcome == null ? null : therapeuticOutcome.trim();
    }

    public String getDecoctMethod() {
        return decoctMethod;
    }

    public void setDecoctMethod(String decoctMethod) {
        this.decoctMethod = decoctMethod == null ? null : decoctMethod.trim();
    }

    public String getTcmDrugUse() {
        return tcmDrugUse;
    }

    public void setTcmDrugUse(String tcmDrugUse) {
        this.tcmDrugUse = tcmDrugUse == null ? null : tcmDrugUse.trim();
    }

    public String getDischargeOrder() {
        return dischargeOrder;
    }

    public void setDischargeOrder(String dischargeOrder) {
        this.dischargeOrder = dischargeOrder == null ? null : dischargeOrder.trim();
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    public String getOperStartDate() {
        return operStartDate;
    }

    public void setOperStartDate(String operStartDate) {
        this.operStartDate = operStartDate;
    }

    public String getOperCutCode() {
        return operCutCode;
    }

    public void setOperCutCode(String operCutCode) {
        this.operCutCode = operCutCode;
    }

    public String getOperIhgCode() {
        return operIhgCode;
    }

    public void setOperIhgCode(String operIhgCode) {
        this.operIhgCode = operIhgCode;
    }

    public String getOperIhgName() {
        return operIhgName;
    }

    public void setOperIhgName(String operIhgName) {
        this.operIhgName = operIhgName;
    }

    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode;
    }

    public String getProProcess() {
        return proProcess;
    }

    public void setProProcess(String proProcess) {
        this.proProcess = proProcess;
    }

    public String getAnesMethodName() {
        return anesMethodName;
    }

    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName;
    }

    public String getOperCutName() {
        return operCutName;
    }

    public void setOperCutName(String operCutName) {
        this.operCutName = operCutName;
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }
}