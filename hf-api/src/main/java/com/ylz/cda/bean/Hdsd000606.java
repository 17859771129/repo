package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.BaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_06_06")
public class Hdsd000606 extends BaseBean implements Serializable {
    private static final long serialVersionUID = 2860354460127876780L;
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

    private String visitDate;

    private String xdsVersion;

    private String targetName;

    private String surgeryHistory;

    private String surgeonSigndate;

    private String surgeonCode;

    private String skinDisinfection;

    private String reportTitle;

    private String placementSite;

    private String patientName;

    private String patientType;

    private String patientTypecode;

    private String visitTimes;

    private String visitId;

    private String visitDomain;

    private String patientId;

    private String patientDomain;

    private String outPatientId;

    private String operPostCode;

    private String operPost;

    private String operationDesc;

    private String xdsType;

    private String intervention;

    private String inpatient;

    private String infusionVolume;

    private String incisionDesc;

    private String idNum;

    private String hospitalName;

    private String hospitalCode;

    private String genderCode;

    private String gender;

    private String drainageMaterialNum;

    private String drainageMaterial;

    private String drainageMark;

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

    private String deptName;

    private String deptCode;

    private String bloodVolume;

    private String bloodReactionMark;

    private String bleeding;

    private String bedNo;

    private String bedName;

    private String appyId;

    private String anesMethodName;

    private String anesMethodCode;

    private String anesthName;

    private String ageUnit;

    private String age;

    private String inoperMedical;

    private String preMedication;

    private String operLevel;

    private String operLevelCode;

    private String operRoom;

    private String operName;

    private String patrolName;

    private String patrolCode;

    private String instrumentName;

    private String instrumentCode;

    private String assistantIi;

    private String assistantIicode;

    private String assistantI;

    private String assistantIcode;

    private String surgeonName;

    private String operEndDate;

    private String operStartDate;

    private String operCode;

    private String bdiagCode;

    private String bdiagName;

    private String adiagCode;

    private String adiagName;

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

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate == null ? null : visitDate.trim();
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName == null ? null : targetName.trim();
    }

    public String getSurgeryHistory() {
        return surgeryHistory;
    }

    public void setSurgeryHistory(String surgeryHistory) {
        this.surgeryHistory = surgeryHistory == null ? null : surgeryHistory.trim();
    }

    public String getSurgeonSigndate() {
        return surgeonSigndate;
    }

    public void setSurgeonSigndate(String surgeonSigndate) {
        this.surgeonSigndate = surgeonSigndate == null ? null : surgeonSigndate.trim();
    }

    public String getSurgeonCode() {
        return surgeonCode;
    }

    public void setSurgeonCode(String surgeonCode) {
        this.surgeonCode = surgeonCode == null ? null : surgeonCode.trim();
    }

    public String getSkinDisinfection() {
        return skinDisinfection;
    }

    public void setSkinDisinfection(String skinDisinfection) {
        this.skinDisinfection = skinDisinfection == null ? null : skinDisinfection.trim();
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    public String getPlacementSite() {
        return placementSite;
    }

    public void setPlacementSite(String placementSite) {
        this.placementSite = placementSite == null ? null : placementSite.trim();
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

    public String getOutPatientId() {
        return outPatientId;
    }

    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId == null ? null : outPatientId.trim();
    }

    public String getOperPostCode() {
        return operPostCode;
    }

    public void setOperPostCode(String operPostCode) {
        this.operPostCode = operPostCode == null ? null : operPostCode.trim();
    }

    public String getOperPost() {
        return operPost;
    }

    public void setOperPost(String operPost) {
        this.operPost = operPost == null ? null : operPost.trim();
    }

    public String getOperationDesc() {
        return operationDesc;
    }

    public void setOperationDesc(String operationDesc) {
        this.operationDesc = operationDesc == null ? null : operationDesc.trim();
    }

    public String getIntervention() {
        return intervention;
    }

    public void setIntervention(String intervention) {
        this.intervention = intervention == null ? null : intervention.trim();
    }

    public String getInpatient() {
        return inpatient;
    }

    public void setInpatient(String inpatient) {
        this.inpatient = inpatient == null ? null : inpatient.trim();
    }

    public String getInfusionVolume() {
        return infusionVolume;
    }

    public void setInfusionVolume(String infusionVolume) {
        this.infusionVolume = infusionVolume == null ? null : infusionVolume.trim();
    }

    public String getIncisionDesc() {
        return incisionDesc;
    }

    public void setIncisionDesc(String incisionDesc) {
        this.incisionDesc = incisionDesc == null ? null : incisionDesc.trim();
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getDrainageMaterialNum() {
        return drainageMaterialNum;
    }

    public void setDrainageMaterialNum(String drainageMaterialNum) {
        this.drainageMaterialNum = drainageMaterialNum == null ? null : drainageMaterialNum.trim();
    }

    public String getDrainageMaterial() {
        return drainageMaterial;
    }

    public void setDrainageMaterial(String drainageMaterial) {
        this.drainageMaterial = drainageMaterial == null ? null : drainageMaterial.trim();
    }

    public String getDrainageMark() {
        return drainageMark;
    }

    public void setDrainageMark(String drainageMark) {
        this.drainageMark = drainageMark == null ? null : drainageMark.trim();
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

    public String getBloodVolume() {
        return bloodVolume;
    }

    public void setBloodVolume(String bloodVolume) {
        this.bloodVolume = bloodVolume == null ? null : bloodVolume.trim();
    }

    public String getBloodReactionMark() {
        return bloodReactionMark;
    }

    public void setBloodReactionMark(String bloodReactionMark) {
        this.bloodReactionMark = bloodReactionMark == null ? null : bloodReactionMark.trim();
    }

    public String getBleeding() {
        return bleeding;
    }

    public void setBleeding(String bleeding) {
        this.bleeding = bleeding == null ? null : bleeding.trim();
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

    public String getAppyId() {
        return appyId;
    }

    public void setAppyId(String appyId) {
        this.appyId = appyId == null ? null : appyId.trim();
    }

    public String getAnesMethodName() {
        return anesMethodName;
    }

    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName == null ? null : anesMethodName.trim();
    }

    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode == null ? null : anesMethodCode.trim();
    }

    public String getAnesthName() {
        return anesthName;
    }

    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName == null ? null : anesthName.trim();
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

    public String getInoperMedical() {
        return inoperMedical;
    }

    public void setInoperMedical(String inoperMedical) {
        this.inoperMedical = inoperMedical == null ? null : inoperMedical.trim();
    }

    public String getPreMedication() {
        return preMedication;
    }

    public void setPreMedication(String preMedication) {
        this.preMedication = preMedication == null ? null : preMedication.trim();
    }

    public String getOperLevel() {
        return operLevel;
    }

    public void setOperLevel(String operLevel) {
        this.operLevel = operLevel == null ? null : operLevel.trim();
    }

    public String getOperLevelCode() {
        return operLevelCode;
    }

    public void setOperLevelCode(String operLevelCode) {
        this.operLevelCode = operLevelCode == null ? null : operLevelCode.trim();
    }

    public String getOperRoom() {
        return operRoom;
    }

    public void setOperRoom(String operRoom) {
        this.operRoom = operRoom == null ? null : operRoom.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getPatrolName() {
        return patrolName;
    }

    public void setPatrolName(String patrolName) {
        this.patrolName = patrolName == null ? null : patrolName.trim();
    }

    public String getPatrolCode() {
        return patrolCode;
    }

    public void setPatrolCode(String patrolCode) {
        this.patrolCode = patrolCode == null ? null : patrolCode.trim();
    }

    public String getInstrumentName() {
        return instrumentName;
    }

    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName == null ? null : instrumentName.trim();
    }

    public String getInstrumentCode() {
        return instrumentCode;
    }

    public void setInstrumentCode(String instrumentCode) {
        this.instrumentCode = instrumentCode == null ? null : instrumentCode.trim();
    }

    public String getAssistantIi() {
        return assistantIi;
    }

    public void setAssistantIi(String assistantIi) {
        this.assistantIi = assistantIi == null ? null : assistantIi.trim();
    }

    public String getAssistantIicode() {
        return assistantIicode;
    }

    public void setAssistantIicode(String assistantIicode) {
        this.assistantIicode = assistantIicode == null ? null : assistantIicode.trim();
    }

    public String getAssistantI() {
        return assistantI;
    }

    public void setAssistantI(String assistantI) {
        this.assistantI = assistantI == null ? null : assistantI.trim();
    }

    public String getAssistantIcode() {
        return assistantIcode;
    }

    public void setAssistantIcode(String assistantIcode) {
        this.assistantIcode = assistantIcode == null ? null : assistantIcode.trim();
    }

    public String getSurgeonName() {
        return surgeonName;
    }

    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName == null ? null : surgeonName.trim();
    }

    public String getOperEndDate() {
        return operEndDate;
    }

    public void setOperEndDate(String operEndDate) {
        this.operEndDate = operEndDate == null ? null : operEndDate.trim();
    }

    public String getOperStartDate() {
        return operStartDate;
    }

    public void setOperStartDate(String operStartDate) {
        this.operStartDate = operStartDate == null ? null : operStartDate.trim();
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode == null ? null : operCode.trim();
    }

    public String getBdiagCode() {
        return bdiagCode;
    }

    public void setBdiagCode(String bdiagCode) {
        this.bdiagCode = bdiagCode;
    }

    public String getBdiagName() {
        return bdiagName;
    }

    public void setBdiagName(String bdiagName) {
        this.bdiagName = bdiagName;
    }

    public String getAdiagCode() {
        return adiagCode;
    }

    public void setAdiagCode(String adiagCode) {
        this.adiagCode = adiagCode;
    }

    public String getAdiagName() {
        return adiagName;
    }

    public void setAdiagName(String adiagName) {
        this.adiagName = adiagName;
    }
}