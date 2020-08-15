package com.ylz.cdr.show.vo;


public class IndexInfo {

    private String encounterId;

    private String visitDateTime;

    private String dischargeDateTime;

    private String orgName;

    private String deptName;

    private String patientType;

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getVisitDateTime() {
        return visitDateTime;
    }

    public void setVisitDateTime(String visitDateTime) {
        this.visitDateTime = visitDateTime;
    }

    public String getDischargeDateTime() {
        return dischargeDateTime;
    }

    public void setDischargeDateTime(String dischargeDateTime) {
        this.dischargeDateTime = dischargeDateTime;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getPatientType() {
        return patientType;
    }

    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }
}
