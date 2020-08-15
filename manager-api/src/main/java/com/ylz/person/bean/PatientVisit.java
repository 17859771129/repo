package com.ylz.person.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("patient_visit")
public class PatientVisit {
    private Integer pk;

    private String globalId;

    private String encounterId;

    private String patientId;

    private String patientDomainId;

    private String patientName;

    private String visitId;

    private String visitTimes;

    private String visitDomainId;

    private String visitAge;

    private String patientCategory;

    private String admitDeptCode;

    private String admitDeptName;

    private String admitDiagnoseCode;

    private String admitDiagnoseName;

    private String admitDate;

    private String admissionDeptCode;

    private String admissionDeptName;

    private String admissionDiagnoseCode;

    private String admissionDiagnoseName;

    private String admissionDate;

    private String leaveDeptCode;

    private String leaveDeptName;

    private String leaveDiagnoseCode;

    private String leaveDiagnoseName;

    private String leaveDate;

    private String emergencyDeptCode;

    private String emergencyDeptName;

    private String emergencyDiagnoseCode;

    private String emergencyDiagnoseName;

    private String emergencyDate;

    private String inspectDeptCode;

    private String inspectDeptName;

    private String inspectResult;

    private String inspectQuantityResult;

    private String inspectDate;

    private String examinationDeptCode;

    private String examinationDeptName;

    private String examinationDate;

    private String visitDate;

    private String visitDept;

    private String visitDeptCode;

    private String visitDoctor;

    private String visitDoctorCode;

    private String hospitalCode;

    private String hospitalName;

    private String patientCategoryCode;

    private String diagName;

    private String diagCode;

    private String admitDiagnoseDoctor;

    private String admitDiagnoseDoctorCode;

    private String admissionDiagnoseDoctor;

    private String admissionDiagnoseDoctorCode;

    private String leaveDiagnoseDoctor;

    private String leaveDiagnoseDoctorCode;

    private String emergencyDiagnoseDoctor;

    private String emergencyDiagnoseDoctorCode;

    private String deathDiagnoseCode;

    private String deathDiagnoseName;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId == null ? null : globalId.trim();
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

    public String getPatientDomainId() {
        return patientDomainId;
    }

    public void setPatientDomainId(String patientDomainId) {
        this.patientDomainId = patientDomainId == null ? null : patientDomainId.trim();
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
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

    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    public String getVisitDomainId() {
        return visitDomainId;
    }

    public void setVisitDomainId(String visitDomainId) {
        this.visitDomainId = visitDomainId == null ? null : visitDomainId.trim();
    }

    public String getVisitAge() {
        return visitAge;
    }

    public void setVisitAge(String visitAge) {
        this.visitAge = visitAge == null ? null : visitAge.trim();
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public void setPatientCategory(String patientCategory) {
        this.patientCategory = patientCategory == null ? null : patientCategory.trim();
    }

    public String getAdmitDeptCode() {
        return admitDeptCode;
    }

    public void setAdmitDeptCode(String admitDeptCode) {
        this.admitDeptCode = admitDeptCode == null ? null : admitDeptCode.trim();
    }

    public String getAdmitDeptName() {
        return admitDeptName;
    }

    public void setAdmitDeptName(String admitDeptName) {
        this.admitDeptName = admitDeptName == null ? null : admitDeptName.trim();
    }

    public String getAdmitDiagnoseCode() {
        return admitDiagnoseCode;
    }

    public void setAdmitDiagnoseCode(String admitDiagnoseCode) {
        this.admitDiagnoseCode = admitDiagnoseCode == null ? null : admitDiagnoseCode.trim();
    }

    public String getAdmitDiagnoseName() {
        return admitDiagnoseName;
    }

    public void setAdmitDiagnoseName(String admitDiagnoseName) {
        this.admitDiagnoseName = admitDiagnoseName == null ? null : admitDiagnoseName.trim();
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate == null ? null : admitDate.trim();
    }

    public String getAdmissionDeptCode() {
        return admissionDeptCode;
    }

    public void setAdmissionDeptCode(String admissionDeptCode) {
        this.admissionDeptCode = admissionDeptCode == null ? null : admissionDeptCode.trim();
    }

    public String getAdmissionDeptName() {
        return admissionDeptName;
    }

    public void setAdmissionDeptName(String admissionDeptName) {
        this.admissionDeptName = admissionDeptName == null ? null : admissionDeptName.trim();
    }

    public String getAdmissionDiagnoseCode() {
        return admissionDiagnoseCode;
    }

    public void setAdmissionDiagnoseCode(String admissionDiagnoseCode) {
        this.admissionDiagnoseCode = admissionDiagnoseCode == null ? null : admissionDiagnoseCode.trim();
    }

    public String getAdmissionDiagnoseName() {
        return admissionDiagnoseName;
    }

    public void setAdmissionDiagnoseName(String admissionDiagnoseName) {
        this.admissionDiagnoseName = admissionDiagnoseName == null ? null : admissionDiagnoseName.trim();
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate == null ? null : admissionDate.trim();
    }

    public String getLeaveDeptCode() {
        return leaveDeptCode;
    }

    public void setLeaveDeptCode(String leaveDeptCode) {
        this.leaveDeptCode = leaveDeptCode == null ? null : leaveDeptCode.trim();
    }

    public String getLeaveDeptName() {
        return leaveDeptName;
    }

    public void setLeaveDeptName(String leaveDeptName) {
        this.leaveDeptName = leaveDeptName == null ? null : leaveDeptName.trim();
    }

    public String getLeaveDiagnoseCode() {
        return leaveDiagnoseCode;
    }

    public void setLeaveDiagnoseCode(String leaveDiagnoseCode) {
        this.leaveDiagnoseCode = leaveDiagnoseCode == null ? null : leaveDiagnoseCode.trim();
    }

    public String getLeaveDiagnoseName() {
        return leaveDiagnoseName;
    }

    public void setLeaveDiagnoseName(String leaveDiagnoseName) {
        this.leaveDiagnoseName = leaveDiagnoseName == null ? null : leaveDiagnoseName.trim();
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate == null ? null : leaveDate.trim();
    }

    public String getEmergencyDeptCode() {
        return emergencyDeptCode;
    }

    public void setEmergencyDeptCode(String emergencyDeptCode) {
        this.emergencyDeptCode = emergencyDeptCode == null ? null : emergencyDeptCode.trim();
    }

    public String getEmergencyDeptName() {
        return emergencyDeptName;
    }

    public void setEmergencyDeptName(String emergencyDeptName) {
        this.emergencyDeptName = emergencyDeptName == null ? null : emergencyDeptName.trim();
    }

    public String getEmergencyDiagnoseCode() {
        return emergencyDiagnoseCode;
    }

    public void setEmergencyDiagnoseCode(String emergencyDiagnoseCode) {
        this.emergencyDiagnoseCode = emergencyDiagnoseCode == null ? null : emergencyDiagnoseCode.trim();
    }

    public String getEmergencyDiagnoseName() {
        return emergencyDiagnoseName;
    }

    public void setEmergencyDiagnoseName(String emergencyDiagnoseName) {
        this.emergencyDiagnoseName = emergencyDiagnoseName == null ? null : emergencyDiagnoseName.trim();
    }

    public String getEmergencyDate() {
        return emergencyDate;
    }

    public void setEmergencyDate(String emergencyDate) {
        this.emergencyDate = emergencyDate == null ? null : emergencyDate.trim();
    }

    public String getInspectDeptCode() {
        return inspectDeptCode;
    }

    public void setInspectDeptCode(String inspectDeptCode) {
        this.inspectDeptCode = inspectDeptCode == null ? null : inspectDeptCode.trim();
    }

    public String getInspectDeptName() {
        return inspectDeptName;
    }

    public void setInspectDeptName(String inspectDeptName) {
        this.inspectDeptName = inspectDeptName == null ? null : inspectDeptName.trim();
    }

    public String getInspectResult() {
        return inspectResult;
    }

    public void setInspectResult(String inspectResult) {
        this.inspectResult = inspectResult == null ? null : inspectResult.trim();
    }

    public String getInspectQuantityResult() {
        return inspectQuantityResult;
    }

    public void setInspectQuantityResult(String inspectQuantityResult) {
        this.inspectQuantityResult = inspectQuantityResult == null ? null : inspectQuantityResult.trim();
    }

    public String getInspectDate() {
        return inspectDate;
    }

    public void setInspectDate(String inspectDate) {
        this.inspectDate = inspectDate == null ? null : inspectDate.trim();
    }

    public String getExaminationDeptCode() {
        return examinationDeptCode;
    }

    public void setExaminationDeptCode(String examinationDeptCode) {
        this.examinationDeptCode = examinationDeptCode == null ? null : examinationDeptCode.trim();
    }

    public String getExaminationDeptName() {
        return examinationDeptName;
    }

    public void setExaminationDeptName(String examinationDeptName) {
        this.examinationDeptName = examinationDeptName == null ? null : examinationDeptName.trim();
    }

    public String getExaminationDate() {
        return examinationDate;
    }

    public void setExaminationDate(String examinationDate) {
        this.examinationDate = examinationDate == null ? null : examinationDate.trim();
    }

    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate == null ? null : visitDate.trim();
    }

    public String getVisitDept() {
        return visitDept;
    }

    public void setVisitDept(String visitDept) {
        this.visitDept = visitDept == null ? null : visitDept.trim();
    }

    public String getVisitDeptCode() {
        return visitDeptCode;
    }

    public void setVisitDeptCode(String visitDeptCode) {
        this.visitDeptCode = visitDeptCode == null ? null : visitDeptCode.trim();
    }

    public String getVisitDoctor() {
        return visitDoctor;
    }

    public void setVisitDoctor(String visitDoctor) {
        this.visitDoctor = visitDoctor == null ? null : visitDoctor.trim();
    }

    public String getVisitDoctorCode() {
        return visitDoctorCode;
    }

    public void setVisitDoctorCode(String visitDoctorCode) {
        this.visitDoctorCode = visitDoctorCode == null ? null : visitDoctorCode.trim();
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

    public String getPatientCategoryCode() {
        return patientCategoryCode;
    }

    public void setPatientCategoryCode(String patientCategoryCode) {
        this.patientCategoryCode = patientCategoryCode == null ? null : patientCategoryCode.trim();
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName == null ? null : diagName.trim();
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode == null ? null : diagCode.trim();
    }

    public String getAdmitDiagnoseDoctor() {
        return admitDiagnoseDoctor;
    }

    public void setAdmitDiagnoseDoctor(String admitDiagnoseDoctor) {
        this.admitDiagnoseDoctor = admitDiagnoseDoctor == null ? null : admitDiagnoseDoctor.trim();
    }

    public String getAdmitDiagnoseDoctorCode() {
        return admitDiagnoseDoctorCode;
    }

    public void setAdmitDiagnoseDoctorCode(String admitDiagnoseDoctorCode) {
        this.admitDiagnoseDoctorCode = admitDiagnoseDoctorCode == null ? null : admitDiagnoseDoctorCode.trim();
    }

    public String getAdmissionDiagnoseDoctor() {
        return admissionDiagnoseDoctor;
    }

    public void setAdmissionDiagnoseDoctor(String admissionDiagnoseDoctor) {
        this.admissionDiagnoseDoctor = admissionDiagnoseDoctor == null ? null : admissionDiagnoseDoctor.trim();
    }

    public String getAdmissionDiagnoseDoctorCode() {
        return admissionDiagnoseDoctorCode;
    }

    public void setAdmissionDiagnoseDoctorCode(String admissionDiagnoseDoctorCode) {
        this.admissionDiagnoseDoctorCode = admissionDiagnoseDoctorCode == null ? null : admissionDiagnoseDoctorCode.trim();
    }

    public String getLeaveDiagnoseDoctor() {
        return leaveDiagnoseDoctor;
    }

    public void setLeaveDiagnoseDoctor(String leaveDiagnoseDoctor) {
        this.leaveDiagnoseDoctor = leaveDiagnoseDoctor == null ? null : leaveDiagnoseDoctor.trim();
    }

    public String getLeaveDiagnoseDoctorCode() {
        return leaveDiagnoseDoctorCode;
    }

    public void setLeaveDiagnoseDoctorCode(String leaveDiagnoseDoctorCode) {
        this.leaveDiagnoseDoctorCode = leaveDiagnoseDoctorCode == null ? null : leaveDiagnoseDoctorCode.trim();
    }

    public String getEmergencyDiagnoseDoctor() {
        return emergencyDiagnoseDoctor;
    }

    public void setEmergencyDiagnoseDoctor(String emergencyDiagnoseDoctor) {
        this.emergencyDiagnoseDoctor = emergencyDiagnoseDoctor == null ? null : emergencyDiagnoseDoctor.trim();
    }

    public String getEmergencyDiagnoseDoctorCode() {
        return emergencyDiagnoseDoctorCode;
    }

    public void setEmergencyDiagnoseDoctorCode(String emergencyDiagnoseDoctorCode) {
        this.emergencyDiagnoseDoctorCode = emergencyDiagnoseDoctorCode == null ? null : emergencyDiagnoseDoctorCode.trim();
    }

    public String getDeathDiagnoseCode() {
        return deathDiagnoseCode;
    }

    public void setDeathDiagnoseCode(String deathDiagnoseCode) {
        this.deathDiagnoseCode = deathDiagnoseCode == null ? null : deathDiagnoseCode.trim();
    }

    public String getDeathDiagnoseName() {
        return deathDiagnoseName;
    }

    public void setDeathDiagnoseName(String deathDiagnoseName) {
        this.deathDiagnoseName = deathDiagnoseName == null ? null : deathDiagnoseName.trim();
    }
}