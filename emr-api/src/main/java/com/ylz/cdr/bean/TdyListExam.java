package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_EXAM")
public class TdyListExam implements Serializable {
    /**
     * This field corresponds to the database table TDY_LIST_EXAM
     */
    private static final long serialVersionUID = 1L;
    /**
     * TDY_LIST_EXAM.pk
     */
    private Integer pk;
    /**
     * TDY_LIST_EXAM.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_EXAM.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_EXAM.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_EXAM.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_EXAM.empi
     */
    private String empi;
    /**
     * TDY_LIST_EXAM.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * TDY_LIST_EXAM.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_EXAM.SPECIMEN_STATUS
     */
    private String specimenStatus;
    /**
     * TDY_LIST_EXAM.SPECIMEN_FIXATIVE
     */
    private String specimenFixative;
    /**
     * TDY_LIST_EXAM.SPECIMEN_CATEGORY
     */
    private String specimenCategory;
    /**
     * TDY_LIST_EXAM.SAMPLE_DATE
     */
    private String sampleDate;
    /**
     * TDY_LIST_EXAM.RESULT_CODE
     */
    private String resultCode;
    /**
     * TDY_LIST_EXAM.RECEIPT_DATE
     */
    private String receiptDate;
    /**
     * TDY_LIST_EXAM.QUANTY_RESULT_UNIT
     */
    private String quantyResultUnit;
    /**
     * TDY_LIST_EXAM.QUANTY_RESULT
     */
    private String quantyResult;
    /**
     * TDY_LIST_EXAM.ITEM_CODE
     */
    private String itemCode;
    /**
     * TDY_LIST_EXAM.CHECK_DATE
     */
    private String checkDate;

    /**
     * TDY_LIST_EXAM.pk
     *
     * @return the value of TDY_LIST_EXAM.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * TDY_LIST_EXAM.pk
     *
     * @param pk the value for TDY_LIST_EXAM.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * TDY_LIST_EXAM.doc_unique
     *
     * @return the value of TDY_LIST_EXAM.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_EXAM.doc_unique
     *
     * @param docUnique the value for TDY_LIST_EXAM.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_EXAM.doc_domain_id
     *
     * @return the value of TDY_LIST_EXAM.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_EXAM.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_EXAM.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_EXAM.doc_version
     *
     * @return the value of TDY_LIST_EXAM.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_EXAM.doc_version
     *
     * @param docVersion the value for TDY_LIST_EXAM.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_EXAM.doc_type
     *
     * @return the value of TDY_LIST_EXAM.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_EXAM.doc_type
     *
     * @param docType the value for TDY_LIST_EXAM.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_EXAM.empi
     *
     * @return the value of TDY_LIST_EXAM.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_EXAM.empi
     *
     * @param empi the value for TDY_LIST_EXAM.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_EXAM.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_EXAM.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_EXAM.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_EXAM.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * TDY_LIST_EXAM.delete_flag
     *
     * @return the value of TDY_LIST_EXAM.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_EXAM.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_EXAM.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_EXAM.SPECIMEN_STATUS
     *
     * @return the value of TDY_LIST_EXAM.SPECIMEN_STATUS
     */
    public String getSpecimenStatus() {
        return specimenStatus;
    }

    /**
     * TDY_LIST_EXAM.SPECIMEN_STATUS
     *
     * @param specimenStatus the value for TDY_LIST_EXAM.SPECIMEN_STATUS
     */
    public void setSpecimenStatus(String specimenStatus) {
        this.specimenStatus = specimenStatus;
    }

    /**
     * TDY_LIST_EXAM.SPECIMEN_FIXATIVE
     *
     * @return the value of TDY_LIST_EXAM.SPECIMEN_FIXATIVE
     */
    public String getSpecimenFixative() {
        return specimenFixative;
    }

    /**
     * TDY_LIST_EXAM.SPECIMEN_FIXATIVE
     *
     * @param specimenFixative the value for TDY_LIST_EXAM.SPECIMEN_FIXATIVE
     */
    public void setSpecimenFixative(String specimenFixative) {
        this.specimenFixative = specimenFixative;
    }

    /**
     * TDY_LIST_EXAM.SPECIMEN_CATEGORY
     *
     * @return the value of TDY_LIST_EXAM.SPECIMEN_CATEGORY
     */
    public String getSpecimenCategory() {
        return specimenCategory;
    }

    /**
     * TDY_LIST_EXAM.SPECIMEN_CATEGORY
     *
     * @param specimenCategory the value for TDY_LIST_EXAM.SPECIMEN_CATEGORY
     */
    public void setSpecimenCategory(String specimenCategory) {
        this.specimenCategory = specimenCategory;
    }

    /**
     * TDY_LIST_EXAM.SAMPLE_DATE
     *
     * @return the value of TDY_LIST_EXAM.SAMPLE_DATE
     */
    public String getSampleDate() {
        return sampleDate;
    }

    /**
     * TDY_LIST_EXAM.SAMPLE_DATE
     *
     * @param sampleDate the value for TDY_LIST_EXAM.SAMPLE_DATE
     */
    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
    }

    /**
     * TDY_LIST_EXAM.RESULT_CODE
     *
     * @return the value of TDY_LIST_EXAM.RESULT_CODE
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * TDY_LIST_EXAM.RESULT_CODE
     *
     * @param resultCode the value for TDY_LIST_EXAM.RESULT_CODE
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * TDY_LIST_EXAM.RECEIPT_DATE
     *
     * @return the value of TDY_LIST_EXAM.RECEIPT_DATE
     */
    public String getReceiptDate() {
        return receiptDate;
    }

    /**
     * TDY_LIST_EXAM.RECEIPT_DATE
     *
     * @param receiptDate the value for TDY_LIST_EXAM.RECEIPT_DATE
     */
    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    /**
     * TDY_LIST_EXAM.QUANTY_RESULT_UNIT
     *
     * @return the value of TDY_LIST_EXAM.QUANTY_RESULT_UNIT
     */
    public String getQuantyResultUnit() {
        return quantyResultUnit;
    }

    /**
     * TDY_LIST_EXAM.QUANTY_RESULT_UNIT
     *
     * @param quantyResultUnit the value for TDY_LIST_EXAM.QUANTY_RESULT_UNIT
     */
    public void setQuantyResultUnit(String quantyResultUnit) {
        this.quantyResultUnit = quantyResultUnit;
    }

    /**
     * TDY_LIST_EXAM.QUANTY_RESULT
     *
     * @return the value of TDY_LIST_EXAM.QUANTY_RESULT
     */
    public String getQuantyResult() {
        return quantyResult;
    }

    /**
     * TDY_LIST_EXAM.QUANTY_RESULT
     *
     * @param quantyResult the value for TDY_LIST_EXAM.QUANTY_RESULT
     */
    public void setQuantyResult(String quantyResult) {
        this.quantyResult = quantyResult;
    }

    /**
     * TDY_LIST_EXAM.ITEM_CODE
     *
     * @return the value of TDY_LIST_EXAM.ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * TDY_LIST_EXAM.ITEM_CODE
     *
     * @param itemCode the value for TDY_LIST_EXAM.ITEM_CODE
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * TDY_LIST_EXAM.CHECK_DATE
     *
     * @return the value of TDY_LIST_EXAM.CHECK_DATE
     */
    public String getCheckDate() {
        return checkDate;
    }

    /**
     * TDY_LIST_EXAM.CHECK_DATE
     *
     * @param checkDate the value for TDY_LIST_EXAM.CHECK_DATE
     */
    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }
}