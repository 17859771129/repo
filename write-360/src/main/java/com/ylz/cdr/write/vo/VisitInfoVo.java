package com.ylz.cdr.write.vo;

public class VisitInfoVo {
    private String visitId;
    private String visitiDomain;
    private String patientName;
    private String patientType;
    private String patientCategory;
    private String hospitalCode;
    private String hospitalName;

    public VisitInfoVo(String visitId, String visitiDomain, String patientName, String patientType,
                       String patientCategory, String hospitalCode, String hospitalName) {
        this.visitId = visitId;
        this.visitiDomain = visitiDomain;
        this.patientName = patientName;
        this.patientType = patientType;
        this.patientCategory = patientCategory;
        this.hospitalCode = hospitalCode;
        this.hospitalName = hospitalName;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitiDoamin() {
        return visitiDomain;
    }

    public void setVisitiDoamin(String visitiDoamin) {
        this.visitiDomain = visitiDoamin;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    public String getPatientCategory() {
        return patientCategory;
    }

    public void setPatientCategory(String patientCategory) {
        this.patientCategory = patientCategory;
    }

    public String getHospitalCode() {
        return hospitalCode;
    }

    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }
}
