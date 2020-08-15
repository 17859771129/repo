package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.BaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_08_03")
public class Hdsd000803 extends BaseBean implements Serializable {
    private static final long serialVersionUID = -8373445248797579434L;
    private Date uploadTime;

    private String status;

    private Integer pk;

    private String empi;

    private String encounterId;

    private String domainId;

    private String weight;

    private String wardName;

    private String wardId;

    private String wardsName;

    private String wardsId;

    private String xdsVersion;

    private String ventilatorMark;

    private String temperature;

    private String systolicBloodPressure;

    private String respiratoryFrequency;

    private String reportTitle;

    private String pulseRate;

    private String patientName;

    private String patientType;

    private String patientTypecode;

    private String visitTimes;

    private String visitId;

    private String visitDomain;

    private String patientId;

    private String patientDomain;

    private String pacemakerHeartRate;

    private String nurseSigndate;

    private String nurserName;

    private String nurserCode;

    private String xdsType;

    private String institutionalIncode;

    private String institutionalIn;

    private String inpatient;

    private String idNum;

    private String hospitalName;

    private String hospitalCode;

    private String genderCode;

    private String docWritingTime;

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

    private String dischargeDate;

    private String diastolicPressure;

    private String deptName;

    private String deptCode;

    private String depositoryTelephone;

    private String depositoryAddress;

    private String bedNo;

    private String bedName;

    private String ageUnit;

    private String age;

    private String visitDate;

    private String outPatientId;

    private String afterOperationDaye;

    private String admissionDate;

    private String actualHod;

    private String abdominalGirth;

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

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId == null ? null : domainId.trim();
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

    public String getXdsVersion() {
        return xdsVersion;
    }

    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion == null ? null : xdsVersion.trim();
    }

    public String getVentilatorMark() {
        return ventilatorMark;
    }

    public void setVentilatorMark(String ventilatorMark) {
        this.ventilatorMark = ventilatorMark == null ? null : ventilatorMark.trim();
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

    public String getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate == null ? null : pulseRate.trim();
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

    public String getPacemakerHeartRate() {
        return pacemakerHeartRate;
    }

    public void setPacemakerHeartRate(String pacemakerHeartRate) {
        this.pacemakerHeartRate = pacemakerHeartRate == null ? null : pacemakerHeartRate.trim();
    }

    public String getNurseSigndate() {
        return nurseSigndate;
    }

    public void setNurseSigndate(String nurseSigndate) {
        this.nurseSigndate = nurseSigndate == null ? null : nurseSigndate.trim();
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

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType == null ? null : xdsType.trim();
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

    public String getDischargeDate() {
        return dischargeDate;
    }

    public void setDischargeDate(String dischargeDate) {
        this.dischargeDate = dischargeDate == null ? null : dischargeDate.trim();
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

    public String getDepositoryTelephone() {
        return depositoryTelephone;
    }

    public void setDepositoryTelephone(String depositoryTelephone) {
        this.depositoryTelephone = depositoryTelephone == null ? null : depositoryTelephone.trim();
    }

    public String getDepositoryAddress() {
        return depositoryAddress;
    }

    public void setDepositoryAddress(String depositoryAddress) {
        this.depositoryAddress = depositoryAddress == null ? null : depositoryAddress.trim();
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

    public String getAfterOperationDaye() {
        return afterOperationDaye;
    }

    public void setAfterOperationDaye(String afterOperationDaye) {
        this.afterOperationDaye = afterOperationDaye == null ? null : afterOperationDaye.trim();
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

    public String getAbdominalGirth() {
        return abdominalGirth;
    }

    public void setAbdominalGirth(String abdominalGirth) {
        this.abdominalGirth = abdominalGirth == null ? null : abdominalGirth.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }
}