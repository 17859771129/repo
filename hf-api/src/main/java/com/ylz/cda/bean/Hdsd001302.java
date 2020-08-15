package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.BaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("hdsd00_13_02")
public class Hdsd001302 extends BaseBean implements Serializable {
    private static final long serialVersionUID = 5345439554862549842L;
    private Integer pk;

    private String status;

    private Date uploadTime;

    private String empi;

    private String encounterId;

    private String patientId;

    private String patientDomain;

    private String visitDomain;

    private String visitId;

    private String visitTimes;

    private Date visitTime;

    private String uniqueId;

    private String xdsType;

    private String xdsName;

    private Date effectiveTime;

    private String xdsVersion;

    private String domainId;

    private String patientType;

    private String patientTypecode;

    private String inpatient;

    private String currentDoorNumber;

    private String currentVillage;

    private String currentTownship;

    private String currentCounty;

    private String currentCity;

    private String currentProvince;

    private String identifyNo;

    private String patientName;

    private String sexCode;

    private String sex;

    private String maritalCode;

    private String maritalName;

    private String ethnicCode;

    private String ethnic;

    private String age;

    private String ageUnit;

    private String occupationCode;

    private String occupation;

    private Date writeTime;

    private String authorCode;

    private String authorName;

    private String relationshipCode;

    private String presenterIdNum;

    private String relationshipName;

    private String historyNarrator;

    private String custodianName;

    private String custodianCode;

    private Date finalAuditorSigndate;

    private String docFinalAuditorcode;

    private String docFinalAuditor;

    private Date attendSigndate;

    private String admissionCode;

    private String admissionName;

    private Date residentSigndate;

    private String residentCode;

    private String residentName;

    private Date attendingSigndate;

    private String attendingCode;

    private String attendingName;

    private Date admissionDate;

    private String bedNo;

    private String bedName;

    private String wardId;

    private String wardName;

    private String deptCode;

    private String deptName;

    private String wardsId;

    private String wardsName;

    private String hospitalCode;

    private String hospitalName;

    private String chiefComplaint;

    private Boolean generalHealthMark;

    private Boolean infectiousMark;

    private Float temperature;

    private String pulseRate;

    private String breathe;

    private String systolic;

    private String diastolic;

    private Float length;

    private Double weight;

    private String skinMucosalExam;

    private String fingerprintExam;

    private String genitalsResult;

    private Boolean statementReliabilityMark;

    private Date diagDatePdw;

    private String diagNamePdw;

    private String diagCodePdw;

    private String diagOrderPdw;

    private Date diagDatePdc;

    private String diagNamePdc;

    private String diagCodePdc;

    private String diagSnamePdc;

    private String diagScodePdc;

    private String diagOrderPdc;

    private Date diagDateCdw;

    private String diagNameCdw;

    private String diagCodeCdw;

    private String diagOrderCdw;

    private Date diagDateCdc;

    private String diagNameCdc;

    private String diagCodeCdc;

    private String diagSnameCdc;

    private String diagScodeCdc;

    private String diagOrderCdc;

    private Date diagDateSdw;

    private String diagNameSdw;

    private String diagCodeSdw;

    private String diagOrderSdw;

    private String principleAndMethod;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
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

    public String getVisitDomain() {
        return visitDomain;
    }

    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain == null ? null : visitDomain.trim();
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId == null ? null : visitId.trim();
    }

    public String getVisitTimes() {
        return visitTimes;
    }

    public Date getVisitTime() {
        return visitTime;
    }

    public void setVisitTime(Date visitTime) {
        this.visitTime = visitTime;
    }

    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes == null ? null : visitTimes.trim();
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType == null ? null : xdsType.trim();
    }

    public String getXdsName() {
        return xdsName;
    }

    public void setXdsName(String xdsName) {
        this.xdsName = xdsName == null ? null : xdsName.trim();
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public String getXdsVersion() {
        return xdsVersion;
    }

    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion == null ? null : xdsVersion.trim();
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId == null ? null : domainId.trim();
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

    public String getInpatient() {
        return inpatient;
    }

    public void setInpatient(String inpatient) {
        this.inpatient = inpatient == null ? null : inpatient.trim();
    }

    public String getCurrentDoorNumber() {
        return currentDoorNumber;
    }

    public void setCurrentDoorNumber(String currentDoorNumber) {
        this.currentDoorNumber = currentDoorNumber == null ? null : currentDoorNumber.trim();
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

    public String getCurrentProvince() {
        return currentProvince;
    }

    public void setCurrentProvince(String currentProvince) {
        this.currentProvince = currentProvince == null ? null : currentProvince.trim();
    }

    public String getIdentifyNo() {
        return identifyNo;
    }

    public void setIdentifyNo(String identifyNo) {
        this.identifyNo = identifyNo == null ? null : identifyNo.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode == null ? null : sexCode.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getMaritalCode() {
        return maritalCode;
    }

    public void setMaritalCode(String maritalCode) {
        this.maritalCode = maritalCode == null ? null : maritalCode.trim();
    }

    public String getMaritalName() {
        return maritalName;
    }

    public void setMaritalName(String maritalName) {
        this.maritalName = maritalName == null ? null : maritalName.trim();
    }

    public String getEthnicCode() {
        return ethnicCode;
    }

    public void setEthnicCode(String ethnicCode) {
        this.ethnicCode = ethnicCode == null ? null : ethnicCode.trim();
    }

    public String getEthnic() {
        return ethnic;
    }

    public void setEthnic(String ethnic) {
        this.ethnic = ethnic == null ? null : ethnic.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit == null ? null : ageUnit.trim();
    }

    public String getOccupationCode() {
        return occupationCode;
    }

    public void setOccupationCode(String occupationCode) {
        this.occupationCode = occupationCode == null ? null : occupationCode.trim();
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation == null ? null : occupation.trim();
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public String getAuthorCode() {
        return authorCode;
    }

    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode == null ? null : authorCode.trim();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName == null ? null : authorName.trim();
    }

    public String getRelationshipCode() {
        return relationshipCode;
    }

    public void setRelationshipCode(String relationshipCode) {
        this.relationshipCode = relationshipCode == null ? null : relationshipCode.trim();
    }

    public String getPresenterIdNum() {
        return presenterIdNum;
    }

    public void setPresenterIdNum(String presenterIdNum) {
        this.presenterIdNum = presenterIdNum == null ? null : presenterIdNum.trim();
    }

    public String getRelationshipName() {
        return relationshipName;
    }

    public void setRelationshipName(String relationshipName) {
        this.relationshipName = relationshipName == null ? null : relationshipName.trim();
    }

    public String getHistoryNarrator() {
        return historyNarrator;
    }

    public void setHistoryNarrator(String historyNarrator) {
        this.historyNarrator = historyNarrator == null ? null : historyNarrator.trim();
    }

    public String getCustodianName() {
        return custodianName;
    }

    public void setCustodianName(String custodianName) {
        this.custodianName = custodianName;
    }

    public String getCustodianCode() {
        return custodianCode;
    }

    public void setCustodianCode(String custodianCode) {
        this.custodianCode = custodianCode == null ? null : custodianCode.trim();
    }

    public Date getFinalAuditorSigndate() {
        return finalAuditorSigndate;
    }

    public void setFinalAuditorSigndate(Date finalAuditorSigndate) {
        this.finalAuditorSigndate = finalAuditorSigndate;
    }

    public String getDocFinalAuditorcode() {
        return docFinalAuditorcode;
    }

    public void setDocFinalAuditorcode(String docFinalAuditorcode) {
        this.docFinalAuditorcode = docFinalAuditorcode == null ? null : docFinalAuditorcode.trim();
    }

    public String getDocFinalAuditor() {
        return docFinalAuditor;
    }

    public void setDocFinalAuditor(String docFinalAuditor) {
        this.docFinalAuditor = docFinalAuditor == null ? null : docFinalAuditor.trim();
    }

    public Date getAttendSigndate() {
        return attendSigndate;
    }

    public void setAttendSigndate(Date attendSigndate) {
        this.attendSigndate = attendSigndate;
    }

    public String getAdmissionCode() {
        return admissionCode;
    }

    public void setAdmissionCode(String admissionCode) {
        this.admissionCode = admissionCode == null ? null : admissionCode.trim();
    }

    public String getAdmissionName() {
        return admissionName;
    }

    public void setAdmissionName(String admissionName) {
        this.admissionName = admissionName == null ? null : admissionName.trim();
    }

    public Date getResidentSigndate() {
        return residentSigndate;
    }

    public void setResidentSigndate(Date residentSigndate) {
        this.residentSigndate = residentSigndate;
    }

    public String getResidentCode() {
        return residentCode;
    }

    public void setResidentCode(String residentCode) {
        this.residentCode = residentCode == null ? null : residentCode.trim();
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName == null ? null : residentName.trim();
    }

    public Date getAttendingSigndate() {
        return attendingSigndate;
    }

    public void setAttendingSigndate(Date attendingSigndate) {
        this.attendingSigndate = attendingSigndate;
    }

    public String getAttendingCode() {
        return attendingCode;
    }

    public void setAttendingCode(String attendingCode) {
        this.attendingCode = attendingCode == null ? null : attendingCode.trim();
    }

    public String getAttendingName() {
        return attendingName;
    }

    public void setAttendingName(String attendingName) {
        this.attendingName = attendingName == null ? null : attendingName.trim();
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
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

    public String getWardId() {
        return wardId;
    }

    public void setWardId(String wardId) {
        this.wardId = wardId == null ? null : wardId.trim();
    }

    public String getWardName() {
        return wardName;
    }

    public void setWardName(String wardName) {
        this.wardName = wardName == null ? null : wardName.trim();
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getWardsId() {
        return wardsId;
    }

    public void setWardsId(String wardsId) {
        this.wardsId = wardsId == null ? null : wardsId.trim();
    }

    public String getWardsName() {
        return wardsName;
    }

    public void setWardsName(String wardsName) {
        this.wardsName = wardsName == null ? null : wardsName.trim();
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

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint == null ? null : chiefComplaint.trim();
    }

    public Boolean getGeneralHealthMark() {
        return generalHealthMark;
    }

    public void setGeneralHealthMark(Boolean generalHealthMark) {
        this.generalHealthMark = generalHealthMark;
    }

    public Boolean getInfectiousMark() {
        return infectiousMark;
    }

    public void setInfectiousMark(Boolean infectiousMark) {
        this.infectiousMark = infectiousMark;
    }

    public Float getTemperature() {
        return temperature;
    }

    public void setTemperature(Float temperature) {
        this.temperature = temperature;
    }

    public String getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(String pulseRate) {
        this.pulseRate = pulseRate == null ? null : pulseRate.trim();
    }

    public String getBreathe() {
        return breathe;
    }

    public void setBreathe(String breathe) {
        this.breathe = breathe == null ? null : breathe.trim();
    }

    public String getSystolic() {
        return systolic;
    }

    public void setSystolic(String systolic) {
        this.systolic = systolic == null ? null : systolic.trim();
    }

    public String getDiastolic() {
        return diastolic;
    }

    public void setDiastolic(String diastolic) {
        this.diastolic = diastolic == null ? null : diastolic.trim();
    }

    public Float getLength() {
        return length;
    }

    public void setLength(Float length) {
        this.length = length;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSkinMucosalExam() {
        return skinMucosalExam;
    }

    public void setSkinMucosalExam(String skinMucosalExam) {
        this.skinMucosalExam = skinMucosalExam == null ? null : skinMucosalExam.trim();
    }

    public String getFingerprintExam() {
        return fingerprintExam;
    }

    public void setFingerprintExam(String fingerprintExam) {
        this.fingerprintExam = fingerprintExam == null ? null : fingerprintExam.trim();
    }

    public String getGenitalsResult() {
        return genitalsResult;
    }

    public void setGenitalsResult(String genitalsResult) {
        this.genitalsResult = genitalsResult == null ? null : genitalsResult.trim();
    }

    public Boolean getStatementReliabilityMark() {
        return statementReliabilityMark;
    }

    public void setStatementReliabilityMark(Boolean statementReliabilityMark) {
        this.statementReliabilityMark = statementReliabilityMark;
    }

    public Date getDiagDatePdw() {
        return diagDatePdw;
    }

    public void setDiagDatePdw(Date diagDatePdw) {
        this.diagDatePdw = diagDatePdw;
    }

    public String getDiagNamePdw() {
        return diagNamePdw;
    }

    public void setDiagNamePdw(String diagNamePdw) {
        this.diagNamePdw = diagNamePdw == null ? null : diagNamePdw.trim();
    }

    public String getDiagCodePdw() {
        return diagCodePdw;
    }

    public void setDiagCodePdw(String diagCodePdw) {
        this.diagCodePdw = diagCodePdw == null ? null : diagCodePdw.trim();
    }

    public String getDiagOrderPdw() {
        return diagOrderPdw;
    }

    public void setDiagOrderPdw(String diagOrderPdw) {
        this.diagOrderPdw = diagOrderPdw == null ? null : diagOrderPdw.trim();
    }

    public Date getDiagDatePdc() {
        return diagDatePdc;
    }

    public void setDiagDatePdc(Date diagDatePdc) {
        this.diagDatePdc = diagDatePdc;
    }

    public String getDiagNamePdc() {
        return diagNamePdc;
    }

    public void setDiagNamePdc(String diagNamePdc) {
        this.diagNamePdc = diagNamePdc == null ? null : diagNamePdc.trim();
    }

    public String getDiagCodePdc() {
        return diagCodePdc;
    }

    public void setDiagCodePdc(String diagCodePdc) {
        this.diagCodePdc = diagCodePdc == null ? null : diagCodePdc.trim();
    }

    public String getDiagSnamePdc() {
        return diagSnamePdc;
    }

    public void setDiagSnamePdc(String diagSnamePdc) {
        this.diagSnamePdc = diagSnamePdc == null ? null : diagSnamePdc.trim();
    }

    public String getDiagScodePdc() {
        return diagScodePdc;
    }

    public void setDiagScodePdc(String diagScodePdc) {
        this.diagScodePdc = diagScodePdc == null ? null : diagScodePdc.trim();
    }

    public String getDiagOrderPdc() {
        return diagOrderPdc;
    }

    public void setDiagOrderPdc(String diagOrderPdc) {
        this.diagOrderPdc = diagOrderPdc == null ? null : diagOrderPdc.trim();
    }

    public Date getDiagDateCdw() {
        return diagDateCdw;
    }

    public void setDiagDateCdw(Date diagDateCdw) {
        this.diagDateCdw = diagDateCdw;
    }

    public String getDiagNameCdw() {
        return diagNameCdw;
    }

    public void setDiagNameCdw(String diagNameCdw) {
        this.diagNameCdw = diagNameCdw == null ? null : diagNameCdw.trim();
    }

    public String getDiagCodeCdw() {
        return diagCodeCdw;
    }

    public void setDiagCodeCdw(String diagCodeCdw) {
        this.diagCodeCdw = diagCodeCdw == null ? null : diagCodeCdw.trim();
    }

    public String getDiagOrderCdw() {
        return diagOrderCdw;
    }

    public void setDiagOrderCdw(String diagOrderCdw) {
        this.diagOrderCdw = diagOrderCdw == null ? null : diagOrderCdw.trim();
    }

    public Date getDiagDateCdc() {
        return diagDateCdc;
    }

    public void setDiagDateCdc(Date diagDateCdc) {
        this.diagDateCdc = diagDateCdc;
    }

    public String getDiagNameCdc() {
        return diagNameCdc;
    }

    public void setDiagNameCdc(String diagNameCdc) {
        this.diagNameCdc = diagNameCdc == null ? null : diagNameCdc.trim();
    }

    public String getDiagCodeCdc() {
        return diagCodeCdc;
    }

    public void setDiagCodeCdc(String diagCodeCdc) {
        this.diagCodeCdc = diagCodeCdc == null ? null : diagCodeCdc.trim();
    }

    public String getDiagSnameCdc() {
        return diagSnameCdc;
    }

    public void setDiagSnameCdc(String diagSnameCdc) {
        this.diagSnameCdc = diagSnameCdc == null ? null : diagSnameCdc.trim();
    }

    public String getDiagScodeCdc() {
        return diagScodeCdc;
    }

    public void setDiagScodeCdc(String diagScodeCdc) {
        this.diagScodeCdc = diagScodeCdc == null ? null : diagScodeCdc.trim();
    }

    public String getDiagOrderCdc() {
        return diagOrderCdc;
    }

    public void setDiagOrderCdc(String diagOrderCdc) {
        this.diagOrderCdc = diagOrderCdc == null ? null : diagOrderCdc.trim();
    }

    public Date getDiagDateSdw() {
        return diagDateSdw;
    }

    public void setDiagDateSdw(Date diagDateSdw) {
        this.diagDateSdw = diagDateSdw;
    }

    public String getDiagNameSdw() {
        return diagNameSdw;
    }

    public void setDiagNameSdw(String diagNameSdw) {
        this.diagNameSdw = diagNameSdw == null ? null : diagNameSdw.trim();
    }

    public String getDiagCodeSdw() {
        return diagCodeSdw;
    }

    public void setDiagCodeSdw(String diagCodeSdw) {
        this.diagCodeSdw = diagCodeSdw == null ? null : diagCodeSdw.trim();
    }

    public String getDiagOrderSdw() {
        return diagOrderSdw;
    }

    public void setDiagOrderSdw(String diagOrderSdw) {
        this.diagOrderSdw = diagOrderSdw == null ? null : diagOrderSdw.trim();
    }

    public String getPrincipleAndMethod() {
        return principleAndMethod;
    }

    public void setPrincipleAndMethod(String principleAndMethod) {
        this.principleAndMethod = principleAndMethod == null ? null : principleAndMethod.trim();
    }
}