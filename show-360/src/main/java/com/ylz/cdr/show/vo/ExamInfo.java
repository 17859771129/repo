package com.ylz.cdr.show.vo;

import com.ylz.cdr.bean.Hdsd000502;
import lombok.Data;

public class ExamInfo extends Hdsd000502 {

    private String specimenStatus;

    private String specimenFixative;

    private String specimenCategory;

    private String sampleDate;

    private String resultCode;

    private String receiptDate;

    private String quantyResultUnit;

    private String quantyResult;

    private String itemCode;

    private String checkDate;

    public String getSpecimenStatus() {
        return specimenStatus;
    }

    public void setSpecimenStatus(String specimenStatus) {
        this.specimenStatus = specimenStatus;
    }

    public String getSpecimenFixative() {
        return specimenFixative;
    }

    public void setSpecimenFixative(String specimenFixative) {
        this.specimenFixative = specimenFixative;
    }

    public String getSpecimenCategory() {
        return specimenCategory;
    }

    public void setSpecimenCategory(String specimenCategory) {
        this.specimenCategory = specimenCategory;
    }

    public String getSampleDate() {
        return sampleDate;
    }

    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getReceiptDate() {
        return receiptDate;
    }

    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    public String getQuantyResultUnit() {
        return quantyResultUnit;
    }

    public void setQuantyResultUnit(String quantyResultUnit) {
        this.quantyResultUnit = quantyResultUnit;
    }

    public String getQuantyResult() {
        return quantyResult;
    }

    public void setQuantyResult(String quantyResult) {
        this.quantyResult = quantyResult;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }
}
