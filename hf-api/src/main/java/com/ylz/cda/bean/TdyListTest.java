package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_TEST")
public class TdyListTest extends SubBaseBean implements Serializable {

    private static final long serialVersionUID = -3356934075814174361L;
    private Integer pk;
    private String uniqueId;

    private String domainId;

    private String xdsVersion;

    private String xdsType;

    private String empi;

    private String encounterId;

    private String deleteFlag;

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

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

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