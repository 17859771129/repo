package com.ylz.cdr.write.vo;

public class VisitVo {

    private String empi;
    private String encounterId;
    private String patientId;
    private String visitId;
    private String visitDomainId;
    private String visitFlowId;
    private String patCategory;
    private String patCategoryCode;
    private String procStatus;

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getVisitId() {
        return visitId;
    }

    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    public String getVisitDomainId() {
        return visitDomainId;
    }

    public void setVisitDomainId(String visitDomainId) {
        this.visitDomainId = visitDomainId;
    }

    public String getVisitFlowId() {
        return visitFlowId;
    }

    public void setVisitFlowId(String visitFlowId) {
        this.visitFlowId = visitFlowId;
    }

    public String getPatCategory() {
        return patCategory;
    }

    public void setPatCategory(String patCategory) {
        this.patCategory = patCategory;
    }

    public String getPatCategoryCode() {
        return patCategoryCode;
    }

    public void setPatCategoryCode(String patCategoryCode) {
        this.patCategoryCode = patCategoryCode;
    }

    public String getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(String procStatus) {
        this.procStatus = procStatus;
    }

    public VisitVo() {
    }

    public VisitVo(String procStatus) {
        this.procStatus = procStatus;
    }

    public VisitVo(String empi, String encounterId, String patientId, String visitId,
                   String visitDomainId, String visitFlowId, String patCategory, String patCategoryCode) {
        this.empi = empi;
        this.encounterId = encounterId;
        this.patientId = patientId;
        this.visitId = visitId;
        this.visitDomainId = visitDomainId;
        this.visitFlowId = visitFlowId;
        this.patCategory = patCategory;
        this.patCategoryCode = patCategoryCode;
    }
}
