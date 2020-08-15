package com.ylz.person.vo;


import com.xmltool.RootElement;
import com.xmltool.XMLObject;
import org.springframework.util.StringUtils;

import java.util.Date;

@RootElement(path = "/PATIENT_VISIT")
public class AddPatientVisitBean {

    /**
     * 患者唯一ID(empi号)
     */
    @XMLObject(xpath = "./PATIENT_GLOBAL_ID", ntype = XMLObject.TEXT)
    private String globalId;

    /**
     * 病人ID
     */
    @XMLObject(xpath = "./PATIENT_ID", ntype = XMLObject.TEXT)
    private String patientId;

    /**
     * 病人域ID
     */
    @XMLObject(xpath = "./PATIENT_DOMAIN_ID", ntype = XMLObject.TEXT)
    private String patientDomainId;

    /**
     * 就诊域ID
     */
    @XMLObject(xpath = "./VISIT_DOMAIN_ID", ntype = XMLObject.TEXT)
    private String visitDomainId;

    /**
     * 就诊号，有次数的下划线分隔
     */
    @XMLObject(xpath = "./VISIT_ID", ntype = XMLObject.TEXT)
    private String visitId;

    /**
     * 就诊时年龄
     */
    @XMLObject(xpath = "./VISIT_AGE", ntype = XMLObject.TEXT)
    private String visitAge;

    /**
     * 患者类型:1门诊，3住院，2急诊，9其它
     */
    @XMLObject(xpath = "./PATIENT_CATEGORY", ntype = XMLObject.TEXT)
    private String patientCategory;

    /**
     * 门诊科室编码
     */
    @XMLObject(xpath = "./ADMIT_DEPT_CODE", ntype = XMLObject.TEXT)
    private String admitDeptCode;

    /**
     * 门诊科室名称
     */
    @XMLObject(xpath = "./ADMIT_DEPT_NAME", ntype = XMLObject.TEXT)
    private String admitDeptName;

    /**
     * 门诊诊断代码
     */
    @XMLObject(xpath = "./ADMIT_DIAGNOSE_CODE", ntype = XMLObject.TEXT)
    private String admitDiagnoseCode;

    /**
     * 门诊诊断名称
     */
    @XMLObject(xpath = "./ADMIT_DIAGNOSE_NAME", ntype = XMLObject.TEXT)
    private String admitDiagnoseName;

    /**
     * 门诊日期时间
     */
    @XMLObject(xpath = "./ADMIT_DATE", ntype = XMLObject.TEXT)
    private String admitDate;

    /**
     * 入院科室代码
     */
    @XMLObject(xpath = "./ADMISSION_DEPT_CODE", ntype = XMLObject.TEXT)
    private String admissionDeptCode;

    /**
     * 入院科室名称
     */
    @XMLObject(xpath = "./ADMISSION_DEPT_NAME", ntype = XMLObject.TEXT)
    private String admissionDeptName;

    /**
     * 入院诊断编码
     */
    @XMLObject(xpath = "./ADMISSION_DIAGNOSE_CODE", ntype = XMLObject.TEXT)
    private String admissionDiagnoseCode;

    /**
     * 入院诊断名称
     */
    @XMLObject(xpath = "./ADMISSION_DIAGNOSE_NAME", ntype = XMLObject.TEXT)
    private String admissionDiagnoseName;

    /**
     * 入院日期
     */
    @XMLObject(xpath = "./ADMISSION_DATE", ntype = XMLObject.TEXT)
    private String admissionDate;

    /**
     * 出院科室代码
     */
    @XMLObject(xpath = "./LEAVE_DEPT_CODE", ntype = XMLObject.TEXT)
    private String leaveDeptCode;

    /**
     * 出院科室名称
     */
    @XMLObject(xpath = "./LEAVE_DEPT_NAME", ntype = XMLObject.TEXT)
    private String leaveDeptName;

    /**
     * 出院诊断编码
     */
    @XMLObject(xpath = "./LEAVE_DIAGNOSE_CODE", ntype = XMLObject.TEXT)
    private String leaveDiagnoseCode;

    /**
     * 出院诊断名称
     */
    @XMLObject(xpath = "./LEAVE_DIAGNOSE_NAME", ntype = XMLObject.TEXT)
    private String leaveDiagnoseName;

    /**
     * 出院日期时间
     */
    @XMLObject(xpath = "./LEAVE_DATE", ntype = XMLObject.TEXT)
    private String leaveDate;

    /**
     * 急诊科室编码
     */
    @XMLObject(xpath = "./EMERGENCY_DEPT_CODE", ntype = XMLObject.TEXT)
    private String emergencyDeptCode;

    /**
     * 急诊科室名称
     */
    @XMLObject(xpath = "./EMERGENCY_DEPT_NAME", ntype = XMLObject.TEXT)
    private String emergencyDeptName;

    /**
     * 急诊诊断编码
     */
    @XMLObject(xpath = "./EMERGENCY_DIAGNOSE_CODE", ntype = XMLObject.TEXT)
    private String emergencyDiagnoseCode;

    /**
     * 急诊诊断名称
     */
    @XMLObject(xpath = "./EMERGENCY_DIAGNOSE_NAME", ntype = XMLObject.TEXT)
    private String emergencyDiagnoseName;

    /**
     * 急诊日期时间
     */
    @XMLObject(xpath = "./EMERGENCY_DATE", ntype = XMLObject.TEXT)
    private String emergencyDate;

    /**
     * 门诊诊断医生
     */
    @XMLObject(xpath = "./ADMIT_DIAGNOSE_DOCTOR", ntype = XMLObject.TEXT)
    private String admitDiagnoseDoctor;

    /**
     * 门诊诊断医生代码
     */
    @XMLObject(xpath = "./ADMIT_DIAGNOSE_DOCTOR_CODE", ntype = XMLObject.TEXT)
    private String admitDiagnoseDoctorCode;

    /**
     * 入院诊断医生
     */
    @XMLObject(xpath = "./ADMISSION_DIAGNOSE_DOCTOR", ntype = XMLObject.TEXT)
    private String admissionDiagnoseDoctor;

    /**
     * 入院诊断医生代码
     */
    @XMLObject(xpath = "./ADMISSION_DIAGNOSE_DOCTOR_CODE", ntype = XMLObject.TEXT)
    private String admissionDiagnoseDoctorCode;

    /**
     * 出院诊断医生
     */
    @XMLObject(xpath = "./LEAVE_DIAGNOSE_DOCTOR", ntype = XMLObject.TEXT)
    private String leaveDiagnoseDoctor;

    /**
     * 出院诊断医生代码
     */
    @XMLObject(xpath = "./LEAVE_DIAGNOSE_DOCTOR_CODE", ntype = XMLObject.TEXT)
    private String leaveDiagnoseDoctorCode;

    /**
     * 急诊诊断医生
     */
    @XMLObject(xpath = "./EMERGENCY_DIAGNOSE_DOCTOR", ntype = XMLObject.TEXT)
    private String emergencyDiagnoseDoctor;

    /**
     * 急诊诊断医生代码
     */
    @XMLObject(xpath = "./EMERGENCY_DIAGNOSE_DOCTOR_CODE", ntype = XMLObject.TEXT)
    private String emergencyDiagnoseDoctorCode;

    /**
     * 死亡诊断代码
     */
    @XMLObject(xpath = "./DEATH_DIAGNOSE_CODE", ntype = XMLObject.TEXT)
    private String deathDiagnoseCode;

    /**
     * 死亡诊断名称
     */
    @XMLObject(xpath = "./DEATH_DIAGNOSE_NAME", ntype = XMLObject.TEXT)
    private String deathDiagnoseName;

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientDomainId() {
        return patientDomainId;
    }

    public void setPatientDomainId(String patientDomainId) {
        this.patientDomainId = patientDomainId;
    }

    public String getVisitDomainId() {
        return visitDomainId;
    }

    public void setVisitDomainId(String visitDomainId) {
        this.visitDomainId = visitDomainId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitAge() {
        return visitAge;
    }

    public void setVisitAge(String visitAge) {
        this.visitAge = visitAge;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public void setPatientCategory(String patientCategory) {
        this.patientCategory = patientCategory;
    }

    public String getAdmitDeptCode() {
        return admitDeptCode;
    }

    public void setAdmitDeptCode(String admitDeptCode) {
        this.admitDeptCode = admitDeptCode;
    }

    public String getAdmitDeptName() {
        return admitDeptName;
    }

    public void setAdmitDeptName(String admitDeptName) {
        this.admitDeptName = admitDeptName;
    }

    public String getAdmitDiagnoseCode() {
        return admitDiagnoseCode;
    }

    public void setAdmitDiagnoseCode(String admitDiagnoseCode) {
        this.admitDiagnoseCode = admitDiagnoseCode;
    }

    public String getAdmitDiagnoseName() {
        return admitDiagnoseName;
    }

    public void setAdmitDiagnoseName(String admitDiagnoseName) {
        this.admitDiagnoseName = admitDiagnoseName;
    }

    public String getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(String admitDate) {
        this.admitDate = admitDate;
    }

    public String getAdmissionDeptCode() {
        return admissionDeptCode;
    }

    public void setAdmissionDeptCode(String admissionDeptCode) {
        this.admissionDeptCode = admissionDeptCode;
    }

    public String getAdmissionDeptName() {
        return admissionDeptName;
    }

    public void setAdmissionDeptName(String admissionDeptName) {
        this.admissionDeptName = admissionDeptName;
    }

    public String getAdmissionDiagnoseCode() {
        return admissionDiagnoseCode;
    }

    public void setAdmissionDiagnoseCode(String admissionDiagnoseCode) {
        this.admissionDiagnoseCode = admissionDiagnoseCode;
    }

    public String getAdmissionDiagnoseName() {
        return admissionDiagnoseName;
    }

    public void setAdmissionDiagnoseName(String admissionDiagnoseName) {
        this.admissionDiagnoseName = admissionDiagnoseName;
    }

    public String getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(String admissionDate) {
        this.admissionDate = admissionDate;
    }

    public String getLeaveDeptCode() {
        return leaveDeptCode;
    }

    public void setLeaveDeptCode(String leaveDeptCode) {
        this.leaveDeptCode = leaveDeptCode;
    }

    public String getLeaveDeptName() {
        return leaveDeptName;
    }

    public void setLeaveDeptName(String leaveDeptName) {
        this.leaveDeptName = leaveDeptName;
    }

    public String getLeaveDiagnoseCode() {
        return leaveDiagnoseCode;
    }

    public void setLeaveDiagnoseCode(String leaveDiagnoseCode) {
        this.leaveDiagnoseCode = leaveDiagnoseCode;
    }

    public String getLeaveDiagnoseName() {
        return leaveDiagnoseName;
    }

    public void setLeaveDiagnoseName(String leaveDiagnoseName) {
        this.leaveDiagnoseName = leaveDiagnoseName;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public String getEmergencyDeptCode() {
        return emergencyDeptCode;
    }

    public void setEmergencyDeptCode(String emergencyDeptCode) {
        this.emergencyDeptCode = emergencyDeptCode;
    }

    public String getEmergencyDeptName() {
        return emergencyDeptName;
    }

    public void setEmergencyDeptName(String emergencyDeptName) {
        this.emergencyDeptName = emergencyDeptName;
    }

    public String getEmergencyDiagnoseCode() {
        return emergencyDiagnoseCode;
    }

    public void setEmergencyDiagnoseCode(String emergencyDiagnoseCode) {
        this.emergencyDiagnoseCode = emergencyDiagnoseCode;
    }

    public String getEmergencyDiagnoseName() {
        return emergencyDiagnoseName;
    }

    public void setEmergencyDiagnoseName(String emergencyDiagnoseName) {
        this.emergencyDiagnoseName = emergencyDiagnoseName;
    }

    public String getEmergencyDate() {
        return emergencyDate;
    }

    public void setEmergencyDate(String emergencyDate) {
        this.emergencyDate = emergencyDate;
    }

    public String getAdmitDiagnoseDoctor() {
        return admitDiagnoseDoctor;
    }

    public void setAdmitDiagnoseDoctor(String admitDiagnoseDoctor) {
        this.admitDiagnoseDoctor = admitDiagnoseDoctor;
    }

    public String getAdmitDiagnoseDoctorCode() {
        return admitDiagnoseDoctorCode;
    }

    public void setAdmitDiagnoseDoctorCode(String admitDiagnoseDoctorCode) {
        this.admitDiagnoseDoctorCode = admitDiagnoseDoctorCode;
    }

    public String getAdmissionDiagnoseDoctor() {
        return admissionDiagnoseDoctor;
    }

    public void setAdmissionDiagnoseDoctor(String admissionDiagnoseDoctor) {
        this.admissionDiagnoseDoctor = admissionDiagnoseDoctor;
    }

    public String getAdmissionDiagnoseDoctorCode() {
        return admissionDiagnoseDoctorCode;
    }

    public void setAdmissionDiagnoseDoctorCode(String admissionDiagnoseDoctorCode) {
        this.admissionDiagnoseDoctorCode = admissionDiagnoseDoctorCode;
    }

    public String getLeaveDiagnoseDoctor() {
        return leaveDiagnoseDoctor;
    }

    public void setLeaveDiagnoseDoctor(String leaveDiagnoseDoctor) {
        this.leaveDiagnoseDoctor = leaveDiagnoseDoctor;
    }

    public String getLeaveDiagnoseDoctorCode() {
        return leaveDiagnoseDoctorCode;
    }

    public void setLeaveDiagnoseDoctorCode(String leaveDiagnoseDoctorCode) {
        this.leaveDiagnoseDoctorCode = leaveDiagnoseDoctorCode;
    }

    public String getEmergencyDiagnoseDoctor() {
        return emergencyDiagnoseDoctor;
    }

    public void setEmergencyDiagnoseDoctor(String emergencyDiagnoseDoctor) {
        this.emergencyDiagnoseDoctor = emergencyDiagnoseDoctor;
    }

    public String getEmergencyDiagnoseDoctorCode() {
        return emergencyDiagnoseDoctorCode;
    }

    public void setEmergencyDiagnoseDoctorCode(String emergencyDiagnoseDoctorCode) {
        this.emergencyDiagnoseDoctorCode = emergencyDiagnoseDoctorCode;
    }

    public String getDeathDiagnoseCode() {
        return deathDiagnoseCode;
    }

    public void setDeathDiagnoseCode(String deathDiagnoseCode) {
        this.deathDiagnoseCode = deathDiagnoseCode;
    }

    public String getDeathDiagnoseName() {
        return deathDiagnoseName;
    }

    public void setDeathDiagnoseName(String deathDiagnoseName) {
        this.deathDiagnoseName = deathDiagnoseName;
    }

    public void checkNull() throws Exception {
        if (StringUtils.isEmpty(getPatientId()))
            throw new Exception("病人ID为空");

        if (StringUtils.isEmpty(getPatientDomainId()))
            throw new Exception("病人域ID为空");

        if (StringUtils.isEmpty(getPatientCategory()))
            throw new Exception("患者类型为空");

        if (StringUtils.isEmpty(getVisitId()))
            throw new Exception("就诊号为空");

        if (StringUtils.isEmpty(getVisitDomainId()))
            throw new Exception("就诊域ID为空");
    }

}
