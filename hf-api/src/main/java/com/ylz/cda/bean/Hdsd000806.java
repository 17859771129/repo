package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.BaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_08_06")
public class Hdsd000806 extends BaseBean implements Serializable {
    private static final long serialVersionUID = 8871172742342412083L;
    private Date uploadTime;

    private String status;

    private Integer pk;

    private String empi;

    private String encounterId;

    private String docDomainId;

    private String weight;

    private String wardName;

    private String wardId;

    private String wardsName;

    private String wardsId;

    private String visitDate;

    private String version;

    private String trachealNursingcode;

    private String trachealNursing;

    private String temperature;

    private String systolicBloodPressure;

    private String skinCare;

    private String safetyNursingcode;

    private String safetyNursing;

    private String safetyCheckSign;

    private String safetyChecklistSign;

    private String riskAssessmentSign;

    private String respiratoryFrequency;

    private String reportTitle;

    private String rbiSign;

    private String pulseRate;

    private String postureNursing;

    private String patientName;

    private String patientType;

    private String patientTypecode;

    private String visitTimes;

    private String visitId;

    private String visitDomain;

    private String patientId;

    private String patientDomain;

    private String nutritionNursing;

    private String nursingTypecode;

    private String nursingType;

    private String nursingGradecode;

    private String nursingGrade;

    private String nurseSigndate;

    private String nurseObserResult;

    private String nurseObserName;

    private String nurserName;

    private String nurserCode;

    private String mentalNursingcode;

    private String mentalNursing;

    private String loadType;

    private String isolationMark;

    private String isolatedSpecies;

    private String isolatedCategorycode;

    private String institutionalIncode;

    private String institutionalIn;

    private String inpatient;

    private String idNum;

    private String hospitalName;

    private String hospitalCode;

    private String genderCode;

    private String dorsalPedalMark;

    private String docWritingTime;

    private String docTemplateOid;

    private String docRegistrModel;

    private String docPipelineId;

    private String docEffectiveTime;

    private String docCustodiancode;

    private String docCustodian;

    private String docCryptographiccode;

    private String docCryptographic;

    private String docAuthorcode;

    private String docAuthor;

    private String dietaryStatus;

    private String dietaryGuidancecode;

    private String dietaryGuidance;

    private String dietaryCode;

    private String diastolicPressure;

    private String deptName;

    private String deptCode;

    private String catheterDescription;

    private String briefIllness;

    private String bloodOxygenSaturation;

    private String bedNo;

    private String bedName;

    private String allergyHistory;

    private String ageUnit;

    private String age;

    private String outPatientId;

    private String gender;

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

    public String getDocDomainId() {
        return docDomainId;
    }

    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId == null ? null : docDomainId.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
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

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate == null ? null : visitDate.trim();
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    public String getTrachealNursingcode() {
        return trachealNursingcode;
    }

    public void setTrachealNursingcode(String trachealNursingcode) {
        this.trachealNursingcode = trachealNursingcode == null ? null : trachealNursingcode.trim();
    }

    public String getTrachealNursing() {
        return trachealNursing;
    }

    public void setTrachealNursing(String trachealNursing) {
        this.trachealNursing = trachealNursing == null ? null : trachealNursing.trim();
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature == null ? null : temperature.trim();
    }

    public String getSystolicBloodPressure() {
        return systolicBloodPressure;
    }

    public void setSystolicBloodPressure(String systolicBloodPressure) {
        this.systolicBloodPressure = systolicBloodPressure == null ? null : systolicBloodPressure.trim();
    }

    public String getSkinCare() {
        return skinCare;
    }

    public void setSkinCare(String skinCare) {
        this.skinCare = skinCare == null ? null : skinCare.trim();
    }

    public String getSafetyNursingcode() {
        return safetyNursingcode;
    }

    public void setSafetyNursingcode(String safetyNursingcode) {
        this.safetyNursingcode = safetyNursingcode == null ? null : safetyNursingcode.trim();
    }

    public String getSafetyNursing() {
        return safetyNursing;
    }

    public void setSafetyNursing(String safetyNursing) {
        this.safetyNursing = safetyNursing == null ? null : safetyNursing.trim();
    }

    public String getSafetyCheckSign() {
        return safetyCheckSign;
    }

    public void setSafetyCheckSign(String safetyCheckSign) {
        this.safetyCheckSign = safetyCheckSign == null ? null : safetyCheckSign.trim();
    }

    public String getSafetyChecklistSign() {
        return safetyChecklistSign;
    }

    public void setSafetyChecklistSign(String safetyChecklistSign) {
        this.safetyChecklistSign = safetyChecklistSign == null ? null : safetyChecklistSign.trim();
    }

    public String getRiskAssessmentSign() {
        return riskAssessmentSign;
    }

    public void setRiskAssessmentSign(String riskAssessmentSign) {
        this.riskAssessmentSign = riskAssessmentSign == null ? null : riskAssessmentSign.trim();
    }

    public String getRespiratoryFrequency() {
        return respiratoryFrequency;
    }

    public void setRespiratoryFrequency(String respiratoryFrequency) {
        this.respiratoryFrequency = respiratoryFrequency == null ? null : respiratoryFrequency.trim();
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    public String getRbiSign() {
        return rbiSign;
    }

    public void setRbiSign(String rbiSign) {
        this.rbiSign = rbiSign == null ? null : rbiSign.trim();
    }

    public String getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate == null ? null : pulseRate.trim();
    }

    public String getPostureNursing() {
        return postureNursing;
    }

    public void setPostureNursing(String postureNursing) {
        this.postureNursing = postureNursing == null ? null : postureNursing.trim();
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

    public String getNutritionNursing() {
        return nutritionNursing;
    }

    public void setNutritionNursing(String nutritionNursing) {
        this.nutritionNursing = nutritionNursing == null ? null : nutritionNursing.trim();
    }

    public String getNursingTypecode() {
        return nursingTypecode;
    }

    public void setNursingTypecode(String nursingTypecode) {
        this.nursingTypecode = nursingTypecode == null ? null : nursingTypecode.trim();
    }

    public String getNursingType() {
        return nursingType;
    }

    public void setNursingType(String nursingType) {
        this.nursingType = nursingType == null ? null : nursingType.trim();
    }

    public String getNursingGradecode() {
        return nursingGradecode;
    }

    public void setNursingGradecode(String nursingGradecode) {
        this.nursingGradecode = nursingGradecode == null ? null : nursingGradecode.trim();
    }

    public String getNursingGrade() {
        return nursingGrade;
    }

    public void setNursingGrade(String nursingGrade) {
        this.nursingGrade = nursingGrade == null ? null : nursingGrade.trim();
    }

    public String getNurseSigndate() {
        return nurseSigndate;
    }

    public void setNurseSigndate(String nurseSigndate) {
        this.nurseSigndate = nurseSigndate == null ? null : nurseSigndate.trim();
    }

    public String getNurseObserResult() {
        return nurseObserResult;
    }

    public void setNurseObserResult(String nurseObserResult) {
        this.nurseObserResult = nurseObserResult == null ? null : nurseObserResult.trim();
    }

    public String getNurseObserName() {
        return nurseObserName;
    }

    public void setNurseObserName(String nurseObserName) {
        this.nurseObserName = nurseObserName == null ? null : nurseObserName.trim();
    }

    public String getNurserName() {
        return nurserName;
    }

    public void setNurserName(String nurserName) {
        this.nurserName = nurserName == null ? null : nurserName.trim();
    }

    public String getNurserCode() {
        return nurserCode;
    }

    public void setNurserCode(String nurserCode) {
        this.nurserCode = nurserCode == null ? null : nurserCode.trim();
    }

    public String getMentalNursingcode() {
        return mentalNursingcode;
    }

    public void setMentalNursingcode(String mentalNursingcode) {
        this.mentalNursingcode = mentalNursingcode == null ? null : mentalNursingcode.trim();
    }

    public String getMentalNursing() {
        return mentalNursing;
    }

    public void setMentalNursing(String mentalNursing) {
        this.mentalNursing = mentalNursing == null ? null : mentalNursing.trim();
    }

    public String getLoadType() {
        return loadType;
    }

    public void setLoadType(String loadType) {
        this.loadType = loadType == null ? null : loadType.trim();
    }

    public String getIsolationMark() {
        return isolationMark;
    }

    public void setIsolationMark(String isolationMark) {
        this.isolationMark = isolationMark == null ? null : isolationMark.trim();
    }

    public String getIsolatedSpecies() {
        return isolatedSpecies;
    }

    public void setIsolatedSpecies(String isolatedSpecies) {
        this.isolatedSpecies = isolatedSpecies == null ? null : isolatedSpecies.trim();
    }

    public String getIsolatedCategorycode() {
        return isolatedCategorycode;
    }

    public void setIsolatedCategorycode(String isolatedCategorycode) {
        this.isolatedCategorycode = isolatedCategorycode == null ? null : isolatedCategorycode.trim();
    }

    public String getInstitutionalIncode() {
        return institutionalIncode;
    }

    public void setInstitutionalIncode(String institutionalIncode) {
        this.institutionalIncode = institutionalIncode == null ? null : institutionalIncode.trim();
    }

    public String getInstitutionalIn() {
        return institutionalIn;
    }

    public void setInstitutionalIn(String institutionalIn) {
        this.institutionalIn = institutionalIn == null ? null : institutionalIn.trim();
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

    public String getGenderCode() {
        return genderCode;
    }

    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode == null ? null : genderCode.trim();
    }

    public String getDorsalPedalMark() {
        return dorsalPedalMark;
    }

    public void setDorsalPedalMark(String dorsalPedalMark) {
        this.dorsalPedalMark = dorsalPedalMark == null ? null : dorsalPedalMark.trim();
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

    public String getDocPipelineId() {
        return docPipelineId;
    }

    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId == null ? null : docPipelineId.trim();
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

    public String getDietaryStatus() {
        return dietaryStatus;
    }

    public void setDietaryStatus(String dietaryStatus) {
        this.dietaryStatus = dietaryStatus == null ? null : dietaryStatus.trim();
    }

    public String getDietaryGuidancecode() {
        return dietaryGuidancecode;
    }

    public void setDietaryGuidancecode(String dietaryGuidancecode) {
        this.dietaryGuidancecode = dietaryGuidancecode == null ? null : dietaryGuidancecode.trim();
    }

    public String getDietaryGuidance() {
        return dietaryGuidance;
    }

    public void setDietaryGuidance(String dietaryGuidance) {
        this.dietaryGuidance = dietaryGuidance == null ? null : dietaryGuidance.trim();
    }

    public String getDietaryCode() {
        return dietaryCode;
    }

    public void setDietaryCode(String dietaryCode) {
        this.dietaryCode = dietaryCode == null ? null : dietaryCode.trim();
    }

    public String getDiastolicPressure() {
        return diastolicPressure;
    }

    public void setDiastolicPressure(String diastolicPressure) {
        this.diastolicPressure = diastolicPressure == null ? null : diastolicPressure.trim();
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

    public String getCatheterDescription() {
        return catheterDescription;
    }

    public void setCatheterDescription(String catheterDescription) {
        this.catheterDescription = catheterDescription == null ? null : catheterDescription.trim();
    }

    public String getBriefIllness() {
        return briefIllness;
    }

    public void setBriefIllness(String briefIllness) {
        this.briefIllness = briefIllness == null ? null : briefIllness.trim();
    }

    public String getBloodOxygenSaturation() {
        return bloodOxygenSaturation;
    }

    public void setBloodOxygenSaturation(String bloodOxygenSaturation) {
        this.bloodOxygenSaturation = bloodOxygenSaturation == null ? null : bloodOxygenSaturation.trim();
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

    public String getAllergyHistory() {
        return allergyHistory;
    }

    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory == null ? null : allergyHistory.trim();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}