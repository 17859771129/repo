package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.BaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_05_02")
public class Hdsd000502 extends BaseBean implements Serializable {
    private static final long serialVersionUID = -8980337188570361346L;
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

    private String telephone;

    private String technicianName;

    private String technicianCode;

    private String symptomStoppingDate;

    private String symptomStartDate;

    private String symptomDescription;

    private String subjectiveTip;

    private String specimenNumber;

    private String specialExamMark;

    private String reporCode;

    private String reportTitle;

    private String reportRemark;

    private String reportName;

    private String reportId;

    private String reportDept;

    private String reportDate;

    private String patientTypecode;

    private String visitTimes;

    private String visitId;

    private String visitDomain;

    private String patientType;

    private String patientName;

    private String patientId;

    private String patientDomain;

    private String outPatientId;

    private String objectiveObservation;

    private String xdsType;

    private String inpatient;

    private String idNum;

    private String hospitalName;

    private String hospitalCode;

    private String genderCode;

    private String docTemplateOid;

    private String docRegistrModel;

    private String uniqueId;

    private String docEffectiveTime;

    private String docCustodiancode;

    private String docCustodian;

    private String docCryptographiccode;

    private String docCryptographic;

    private String deptName;

    private String deptCode;

    private String depositoryAddress;

    private String chiefComplaint;

    private String checkName;

    private String checkMethod;

    private String checkCode;

    private String checkCategory;

    private String bedNo;

    private String bedName;

    private String auditName;

    private String auditCode;

    private String appyId;

    private String applyOrgan;

    private String applyDeptCode;

    private String applyDept;

    private String applyAgencycode;

    private String ageUnit;

    private String agencyName;

    private String age;

    private String visitDate;

    private String intervention;

    private String operName;

    private String operPartCode;

    private String operDate;

    private String operCode;

    private String quantyResultUnit;

    private String quantyResult;

    private String resultCode;

    private String specimenFixative;

    private String specimenStatus;

    private String specimenCategory;

    private String receiptDate;

    private String sampleDate;

    private String itemCode;

    private String checkDate;

    private String anesthWesternSign;

    private String anesObs;

    private String anesthName;

    private String anesMethodCode;

    private String operNum;

    private String operMethod;

    private String itemName;

    private String checkCategoryCode;

    private String gender;

    private String operPartName;

    private String anesMethodName;

    private String anesthWestern;

    private String resultName;

    private String applyDate;

    private String technicianSigndate;

    private String checkSigndate;

    private String auditSigndate;

    private Date diagDate;

    private String diagCode;

    private String diagName;

    private String diagInstitution;

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

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getTechnicianName() {
        return technicianName;
    }

    public void setTechnicianName(String technicianName) {
        this.technicianName = technicianName == null ? null : technicianName.trim();
    }

    public String getTechnicianCode() {
        return technicianCode;
    }

    public void setTechnicianCode(String technicianCode) {
        this.technicianCode = technicianCode == null ? null : technicianCode.trim();
    }

    public String getSymptomStoppingDate() {
        return symptomStoppingDate;
    }

    public void setSymptomStoppingDate(String symptomStoppingDate) {
        this.symptomStoppingDate = symptomStoppingDate == null ? null : symptomStoppingDate.trim();
    }

    public String getSymptomStartDate() {
        return symptomStartDate;
    }

    public void setSymptomStartDate(String symptomStartDate) {
        this.symptomStartDate = symptomStartDate == null ? null : symptomStartDate.trim();
    }

    public String getSymptomDescription() {
        return symptomDescription;
    }

    public void setSymptomDescription(String symptomDescription) {
        this.symptomDescription = symptomDescription == null ? null : symptomDescription.trim();
    }

    public String getSubjectiveTip() {
        return subjectiveTip;
    }

    public void setSubjectiveTip(String subjectiveTip) {
        this.subjectiveTip = subjectiveTip == null ? null : subjectiveTip.trim();
    }

    public String getSpecimenNumber() {
        return specimenNumber;
    }

    public void setSpecimenNumber(String specimenNumber) {
        this.specimenNumber = specimenNumber == null ? null : specimenNumber.trim();
    }

    public String getSpecialExamMark() {
        return specialExamMark;
    }

    public void setSpecialExamMark(String specialExamMark) {
        this.specialExamMark = specialExamMark == null ? null : specialExamMark.trim();
    }

    public String getReporCode() {
        return reporCode;
    }

    public void setReporCode(String reporCode) {
        this.reporCode = reporCode == null ? null : reporCode.trim();
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle == null ? null : reportTitle.trim();
    }

    public String getReportRemark() {
        return reportRemark;
    }

    public void setReportRemark(String reportRemark) {
        this.reportRemark = reportRemark == null ? null : reportRemark.trim();
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName == null ? null : reportName.trim();
    }

    public String getReportId() {
        return reportId;
    }

    public void setReportId(String reportId) {
        this.reportId = reportId == null ? null : reportId.trim();
    }

    public String getReportDept() {
        return reportDept;
    }

    public void setReportDept(String reportDept) {
        this.reportDept = reportDept == null ? null : reportDept.trim();
    }

    public String getReportDate() {
        return reportDate;
    }

    public void setReportDate(String reportDate) {
        this.reportDate = reportDate == null ? null : reportDate.trim();
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

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType == null ? null : patientType.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
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

    public String getObjectiveObservation() {
        return objectiveObservation;
    }

    public void setObjectiveObservation(String objectiveObservation) {
        this.objectiveObservation = objectiveObservation == null ? null : objectiveObservation.trim();
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

    public String getDepositoryAddress() {
        return depositoryAddress;
    }

    public void setDepositoryAddress(String depositoryAddress) {
        this.depositoryAddress = depositoryAddress == null ? null : depositoryAddress.trim();
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint == null ? null : chiefComplaint.trim();
    }

    public String getCheckName() {
        return checkName;
    }

    public void setCheckName(String checkName) {
        this.checkName = checkName == null ? null : checkName.trim();
    }

    public String getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod == null ? null : checkMethod.trim();
    }

    public String getCheckCode() {
        return checkCode;
    }

    public void setCheckCode(String checkCode) {
        this.checkCode = checkCode == null ? null : checkCode.trim();
    }

    public String getCheckCategory() {
        return checkCategory;
    }

    public void setCheckCategory(String checkCategory) {
        this.checkCategory = checkCategory == null ? null : checkCategory.trim();
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

    public String getAuditName() {
        return auditName;
    }

    public void setAuditName(String auditName) {
        this.auditName = auditName == null ? null : auditName.trim();
    }

    public String getAuditCode() {
        return auditCode;
    }

    public void setAuditCode(String auditCode) {
        this.auditCode = auditCode == null ? null : auditCode.trim();
    }

    public String getAppyId() {
        return appyId;
    }

    public void setAppyId(String appyId) {
        this.appyId = appyId == null ? null : appyId.trim();
    }

    public String getApplyOrgan() {
        return applyOrgan;
    }

    public void setApplyOrgan(String applyOrgan) {
        this.applyOrgan = applyOrgan == null ? null : applyOrgan.trim();
    }

    public String getApplyDeptCode() {
        return applyDeptCode;
    }

    public void setApplyDeptCode(String applyDeptCode) {
        this.applyDeptCode = applyDeptCode == null ? null : applyDeptCode.trim();
    }

    public String getApplyDept() {
        return applyDept;
    }

    public void setApplyDept(String applyDept) {
        this.applyDept = applyDept == null ? null : applyDept.trim();
    }

    public String getApplyAgencycode() {
        return applyAgencycode;
    }

    public void setApplyAgencycode(String applyAgencycode) {
        this.applyAgencycode = applyAgencycode == null ? null : applyAgencycode.trim();
    }

    public String getAgeUnit() {
        return ageUnit;
    }

    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit == null ? null : ageUnit.trim();
    }

    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName == null ? null : agencyName.trim();
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

    public String getIntervention() {
        return intervention;
    }

    public void setIntervention(String intervention) {
        this.intervention = intervention == null ? null : intervention.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getOperPartCode() {
        return operPartCode;
    }

    public void setOperPartCode(String operPartCode) {
        this.operPartCode = operPartCode == null ? null : operPartCode.trim();
    }

    public String getOperDate() {
        return operDate;
    }

    public void setOperDate(String operDate) {
        this.operDate = operDate == null ? null : operDate.trim();
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode == null ? null : operCode.trim();
    }

    public String getQuantyResultUnit() {
        return quantyResultUnit;
    }

    public void setQuantyResultUnit(String quantyResultUnit) {
        this.quantyResultUnit = quantyResultUnit == null ? null : quantyResultUnit.trim();
    }

    public String getQuantyResult() {
        return quantyResult;
    }

    public void setQuantyResult(String quantyResult) {
        this.quantyResult = quantyResult == null ? null : quantyResult.trim();
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode == null ? null : resultCode.trim();
    }

    public String getSpecimenFixative() {
        return specimenFixative;
    }

    public void setSpecimenFixative(String specimenFixative) {
        this.specimenFixative = specimenFixative == null ? null : specimenFixative.trim();
    }

    public String getSpecimenStatus() {
        return specimenStatus;
    }

    public void setSpecimenStatus(String specimenStatus) {
        this.specimenStatus = specimenStatus == null ? null : specimenStatus.trim();
    }

    public String getSpecimenCategory() {
        return specimenCategory;
    }

    public void setSpecimenCategory(String specimenCategory) {
        this.specimenCategory = specimenCategory == null ? null : specimenCategory.trim();
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate == null ? null : receiptDate.trim();
    }

    public String getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate == null ? null : sampleDate.trim();
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode == null ? null : itemCode.trim();
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate == null ? null : checkDate.trim();
    }

    public String getAnesthWesternSign() {
        return anesthWesternSign;
    }

    public void setAnesthWesternSign(String anesthWesternSign) {
        this.anesthWesternSign = anesthWesternSign == null ? null : anesthWesternSign.trim();
    }

    public String getAnesObs() {
        return anesObs;
    }

    public void setAnesObs(String anesObs) {
        this.anesObs = anesObs == null ? null : anesObs.trim();
    }

    public String getAnesthName() {
        return anesthName;
    }

    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName == null ? null : anesthName.trim();
    }

    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode == null ? null : anesMethodCode.trim();
    }

    public String getOperNum() {
        return operNum;
    }

    public void setOperNum(String operNum) {
        this.operNum = operNum == null ? null : operNum.trim();
    }

    public String getOperMethod() {
        return operMethod;
    }

    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod == null ? null : operMethod.trim();
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getCheckCategoryCode() {
        return checkCategoryCode;
    }

    public void setCheckCategoryCode(String checkCategoryCode) {
        this.checkCategoryCode = checkCategoryCode == null ? null : checkCategoryCode.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getOperPartName() {
        return operPartName;
    }

    public void setOperPartName(String operPartName) {
        this.operPartName = operPartName == null ? null : operPartName.trim();
    }

    public String getAnesMethodName() {
        return anesMethodName;
    }

    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName == null ? null : anesMethodName.trim();
    }

    public String getAnesthWestern() {
        return anesthWestern;
    }

    public void setAnesthWestern(String anesthWestern) {
        this.anesthWestern = anesthWestern == null ? null : anesthWestern.trim();
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName == null ? null : resultName.trim();
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate == null ? null : applyDate.trim();
    }

    public String getTechnicianSigndate() {
        return technicianSigndate;
    }

    public void setTechnicianSigndate(String technicianSigndate) {
        this.technicianSigndate = technicianSigndate == null ? null : technicianSigndate.trim();
    }

    public String getCheckSigndate() {
        return checkSigndate;
    }

    public void setCheckSigndate(String checkSigndate) {
        this.checkSigndate = checkSigndate == null ? null : checkSigndate.trim();
    }

    public String getAuditSigndate() {
        return auditSigndate;
    }

    public void setAuditSigndate(String auditSigndate) {
        this.auditSigndate = auditSigndate == null ? null : auditSigndate.trim();
    }

    public Date getDiagDate() {
        return diagDate;
    }

    public void setDiagDate(Date diagDate) {
        this.diagDate = diagDate;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public String getDiagInstitution() {
        return diagInstitution;
    }

    public void setDiagInstitution(String diagInstitution) {
        this.diagInstitution = diagInstitution;
    }
}