package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("TDY_LIST_TEST")
public class TdyListTest implements Serializable {
    /**
     * This field corresponds to the database table TDY_LIST_TEST
     */
    private static final long serialVersionUID = 1L;
    /**
     * TDY_LIST_TEST.pk
     */
    private Integer pk;
    /**
     * TDY_LIST_TEST.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_TEST.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_TEST.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_TEST.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_TEST.empi
     */
    private String empi;
    /**
     * TDY_LIST_TEST.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * TDY_LIST_TEST.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_TEST.SPECIMEN_STATUS
     */
    private String specimenStatus;
    /**
     * TDY_LIST_TEST.SPECIMEN_CATEGORY
     */
    private String specimenCategory;
    /**
     * TDY_LIST_TEST.SAMPLE_DATE
     */
    private String sampleDate;
    /**
     * TDY_LIST_TEST.RESULT_CODE
     */
    private String resultCode;
    /**
     * TDY_LIST_TEST.RECEIPT_DATE
     */
    private String receiptDate;
    /**
     * TDY_LIST_TEST.QUANTY_RESULT_UNIT
     */
    private String quantyResultUnit;
    /**
     * TDY_LIST_TEST.QUANTY_RESULT
     */
    private String quantyResult;
    /**
     * TDY_LIST_TEST.ITEM_CODE
     */
    private String itemCode;
    /**
     * TDY_LIST_TEST.INSPECT_DATE
     */
    private String inspectDate;
    /**
     * TDY_LIST_TEST.ITEM_NAME
     */
    private String itemName;
    /**
     * TDY_LIST_TEST.RESULT_NAME
     */
    private String resultName;

    /**
     * TDY_LIST_TEST.INSPECTION_METHOD
     */
    private String inspectionMethod;
    /**
     * TDY_LIST_TEST.INSPECTION_CATEGORY
     */
    private String inspectionCategory;

    private String refHighValue;

    private String refLowValue;

    private String refUnit;

    /**
     * TDY_LIST_TEST.pk
     *
     * @return the value of TDY_LIST_TEST.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * TDY_LIST_TEST.pk
     *
     * @param pk the value for TDY_LIST_TEST.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * TDY_LIST_TEST.doc_unique
     *
     * @return the value of TDY_LIST_TEST.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_TEST.doc_unique
     *
     * @param docUnique the value for TDY_LIST_TEST.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_TEST.doc_domain_id
     *
     * @return the value of TDY_LIST_TEST.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_TEST.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_TEST.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_TEST.doc_version
     *
     * @return the value of TDY_LIST_TEST.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_TEST.doc_version
     *
     * @param docVersion the value for TDY_LIST_TEST.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_TEST.doc_type
     *
     * @return the value of TDY_LIST_TEST.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_TEST.doc_type
     *
     * @param docType the value for TDY_LIST_TEST.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_TEST.empi
     *
     * @return the value of TDY_LIST_TEST.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_TEST.empi
     *
     * @param empi the value for TDY_LIST_TEST.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_TEST.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_TEST.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_TEST.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_TEST.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * TDY_LIST_TEST.delete_flag
     *
     * @return the value of TDY_LIST_TEST.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_TEST.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_TEST.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_TEST.SPECIMEN_STATUS
     *
     * @return the value of TDY_LIST_TEST.SPECIMEN_STATUS
     */
    public String getSpecimenStatus() {
        return specimenStatus;
    }

    /**
     * TDY_LIST_TEST.SPECIMEN_STATUS
     *
     * @param specimenStatus the value for TDY_LIST_TEST.SPECIMEN_STATUS
     */
    public void setSpecimenStatus(String specimenStatus) {
        this.specimenStatus = specimenStatus;
    }

    /**
     * TDY_LIST_TEST.SPECIMEN_CATEGORY
     *
     * @return the value of TDY_LIST_TEST.SPECIMEN_CATEGORY
     */
    public String getSpecimenCategory() {
        return specimenCategory;
    }

    /**
     * TDY_LIST_TEST.SPECIMEN_CATEGORY
     *
     * @param specimenCategory the value for TDY_LIST_TEST.SPECIMEN_CATEGORY
     */
    public void setSpecimenCategory(String specimenCategory) {
        this.specimenCategory = specimenCategory;
    }

    /**
     * TDY_LIST_TEST.SAMPLE_DATE
     *
     * @return the value of TDY_LIST_TEST.SAMPLE_DATE
     */
    public String getSampleDate() {
        return sampleDate;
    }

    /**
     * TDY_LIST_TEST.SAMPLE_DATE
     *
     * @param sampleDate the value for TDY_LIST_TEST.SAMPLE_DATE
     */
    public void setSampleDate(String sampleDate) {
        this.sampleDate = sampleDate;
    }

    /**
     * TDY_LIST_TEST.RESULT_CODE
     *
     * @return the value of TDY_LIST_TEST.RESULT_CODE
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * TDY_LIST_TEST.RESULT_CODE
     *
     * @param resultCode the value for TDY_LIST_TEST.RESULT_CODE
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * TDY_LIST_TEST.RECEIPT_DATE
     *
     * @return the value of TDY_LIST_TEST.RECEIPT_DATE
     */
    public String getReceiptDate() {
        return receiptDate;
    }

    /**
     * TDY_LIST_TEST.RECEIPT_DATE
     *
     * @param receiptDate the value for TDY_LIST_TEST.RECEIPT_DATE
     */
    public void setReceiptDate(String receiptDate) {
        this.receiptDate = receiptDate;
    }

    /**
     * TDY_LIST_TEST.QUANTY_RESULT_UNIT
     *
     * @return the value of TDY_LIST_TEST.QUANTY_RESULT_UNIT
     */
    public String getQuantyResultUnit() {
        return quantyResultUnit;
    }

    /**
     * TDY_LIST_TEST.QUANTY_RESULT_UNIT
     *
     * @param quantyResultUnit the value for TDY_LIST_TEST.QUANTY_RESULT_UNIT
     */
    public void setQuantyResultUnit(String quantyResultUnit) {
        this.quantyResultUnit = quantyResultUnit;
    }

    /**
     * TDY_LIST_TEST.QUANTY_RESULT
     *
     * @return the value of TDY_LIST_TEST.QUANTY_RESULT
     */
    public String getQuantyResult() {
        return quantyResult;
    }

    /**
     * TDY_LIST_TEST.QUANTY_RESULT
     *
     * @param quantyResult the value for TDY_LIST_TEST.QUANTY_RESULT
     */
    public void setQuantyResult(String quantyResult) {
        this.quantyResult = quantyResult;
    }

    /**
     * TDY_LIST_TEST.ITEM_CODE
     *
     * @return the value of TDY_LIST_TEST.ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * TDY_LIST_TEST.ITEM_CODE
     *
     * @param itemCode the value for TDY_LIST_TEST.ITEM_CODE
     */
    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    /**
     * TDY_LIST_TEST.INSPECT_DATE
     *
     * @return the value of TDY_LIST_TEST.INSPECT_DATE
     */
    public String getInspectDate() {
        return inspectDate;
    }

    /**
     * TDY_LIST_TEST.INSPECT_DATE
     *
     * @param inspectDate the value for TDY_LIST_TEST.INSPECT_DATE
     */
    public void setInspectDate(String inspectDate) {
        this.inspectDate = inspectDate;
    }

    /**
     * TDY_LIST_TEST.ITEM_NAME
     *
     * @return the value of TDY_LIST_TEST.ITEM_NAME
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * TDY_LIST_TEST.ITEM_NAME
     *
     * @param itemName the value for TDY_LIST_TEST.ITEM_NAME
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    /**
     * TDY_LIST_TEST.RESULT_NAME
     *
     * @return the value of TDY_LIST_TEST.RESULT_NAME
     */
    public String getResultName() {
        return resultName;
    }

    /**
     * TDY_LIST_TEST.RESULT_NAME
     *
     * @param resultName the value for TDY_LIST_TEST.RESULT_NAME
     */
    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getInspectionMethod() {
        return inspectionMethod;
    }

    public void setInspectionMethod(String inspectionMethod) {
        this.inspectionMethod = inspectionMethod;
    }

    public String getInspectionCategory() {
        return inspectionCategory;
    }

    public void setInspectionCategory(String inspectionCategory) {
        this.inspectionCategory = inspectionCategory;
    }

    public String getRefHighValue() {
        return refHighValue;
    }

    public void setRefHighValue(String refHighValue) {
        this.refHighValue = refHighValue;
    }

    public String getRefLowValue() {
        return refLowValue;
    }

    public void setRefLowValue(String refLowValue) {
        this.refLowValue = refLowValue;
    }

    public String getRefUnit() {
        return refUnit;
    }

    public void setRefUnit(String refUnit) {
        this.refUnit = refUnit;
    }
}