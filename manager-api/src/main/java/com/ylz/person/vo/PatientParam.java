package com.ylz.person.vo;


import com.ylz.common.tool.PageParam;

public class PatientParam extends PageParam {

    private String patientId;
    private String patientName;
    private String idNo;
    private String medRecordNo;
    private String sex;
    private String birthdayBegin;
    private String birthdayEnd;
    private String diagnosis;

    public PatientParam(String patientId, String patientName, String idNo, String medRecordNo) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.idNo = idNo;
        this.medRecordNo = medRecordNo;
        setFrom(0);
        setSize(10);
    }

    public PatientParam(String patientId, String patientName, String idNo, String medRecordNo,
                        String sex, String birthdayBegin, String birthdayEnd, String diagnosis) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.idNo = idNo;
        this.medRecordNo = medRecordNo;
        this.sex = sex;
        this.birthdayBegin = birthdayBegin;
        this.birthdayEnd = birthdayEnd;
        this.diagnosis = diagnosis;
        setFrom(0);
        setSize(10);
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getMedRecordNo() {
        return medRecordNo;
    }

    public void setMedRecordNo(String medRecordNo) {
        this.medRecordNo = medRecordNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthdayBegin() {
        return birthdayBegin;
    }

    public void setBirthdayBegin(String birthdayBegin) {
        this.birthdayBegin = birthdayBegin;
    }

    public String getBirthdayEnd() {
        return birthdayEnd;
    }

    public void setBirthdayEnd(String birthdayEnd) {
        this.birthdayEnd = birthdayEnd;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
