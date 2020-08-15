package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_LEXAM")
public class TdyListLexam implements Serializable {
    /**
     * This field corresponds to the database table TDY_LIST_LEXAM
     */
    private static final long serialVersionUID = 1L;
    /**
     * TDY_LIST_LEXAM.pk
     */
    private Integer pk;
    /**
     * TDY_LIST_LEXAM.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_LEXAM.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_LEXAM.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_LEXAM.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_LEXAM.empi
     */
    private String empi;
    /**
     * TDY_LIST_LEXAM.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * TDY_LIST_LEXAM.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_LEXAM.UNIT
     */
    private String unit;
    /**
     * TDY_LIST_LEXAM.RESULT_CODE
     */
    private String resultCode;
    /**
     * TDY_LIST_LEXAM.QUANTY_RESULT
     */
    private String quantyResult;
    /**
     * TDY_LIST_LEXAM.ABNORMAL_SIGN
     */
    private String abnormalSign;
    /**
     * TDY_LIST_LEXAM.ITEM_RESULT
     */
    private String itemResult;
    /**
     * TDY_LIST_LEXAM.ITEM_NAME
     */
    private String itemName;

    /**
     * TDY_LIST_LEXAM.pk
     *
     * @return the value of TDY_LIST_LEXAM.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * TDY_LIST_LEXAM.pk
     *
     * @param pk the value for TDY_LIST_LEXAM.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * TDY_LIST_LEXAM.doc_unique
     *
     * @return the value of TDY_LIST_LEXAM.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_LEXAM.doc_unique
     *
     * @param docUnique the value for TDY_LIST_LEXAM.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_LEXAM.doc_domain_id
     *
     * @return the value of TDY_LIST_LEXAM.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_LEXAM.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_LEXAM.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_LEXAM.doc_version
     *
     * @return the value of TDY_LIST_LEXAM.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_LEXAM.doc_version
     *
     * @param docVersion the value for TDY_LIST_LEXAM.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_LEXAM.doc_type
     *
     * @return the value of TDY_LIST_LEXAM.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_LEXAM.doc_type
     *
     * @param docType the value for TDY_LIST_LEXAM.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_LEXAM.empi
     *
     * @return the value of TDY_LIST_LEXAM.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_LEXAM.empi
     *
     * @param empi the value for TDY_LIST_LEXAM.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_LEXAM.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_LEXAM.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_LEXAM.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_LEXAM.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * TDY_LIST_LEXAM.delete_flag
     *
     * @return the value of TDY_LIST_LEXAM.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_LEXAM.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_LEXAM.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_LEXAM.UNIT
     *
     * @return the value of TDY_LIST_LEXAM.UNIT
     */
    public String getUnit() {
        return unit;
    }

    /**
     * TDY_LIST_LEXAM.UNIT
     *
     * @param unit the value for TDY_LIST_LEXAM.UNIT
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * TDY_LIST_LEXAM.RESULT_CODE
     *
     * @return the value of TDY_LIST_LEXAM.RESULT_CODE
     */
    public String getResultCode() {
        return resultCode;
    }

    /**
     * TDY_LIST_LEXAM.RESULT_CODE
     *
     * @param resultCode the value for TDY_LIST_LEXAM.RESULT_CODE
     */
    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    /**
     * TDY_LIST_LEXAM.QUANTY_RESULT
     *
     * @return the value of TDY_LIST_LEXAM.QUANTY_RESULT
     */
    public String getQuantyResult() {
        return quantyResult;
    }

    /**
     * TDY_LIST_LEXAM.QUANTY_RESULT
     *
     * @param quantyResult the value for TDY_LIST_LEXAM.QUANTY_RESULT
     */
    public void setQuantyResult(String quantyResult) {
        this.quantyResult = quantyResult;
    }

    /**
     * TDY_LIST_LEXAM.ABNORMAL_SIGN
     *
     * @return the value of TDY_LIST_LEXAM.ABNORMAL_SIGN
     */
    public String getAbnormalSign() {
        return abnormalSign;
    }

    /**
     * TDY_LIST_LEXAM.ABNORMAL_SIGN
     *
     * @param abnormalSign the value for TDY_LIST_LEXAM.ABNORMAL_SIGN
     */
    public void setAbnormalSign(String abnormalSign) {
        this.abnormalSign = abnormalSign;
    }

    /**
     * TDY_LIST_LEXAM.ITEM_RESULT
     *
     * @return the value of TDY_LIST_LEXAM.ITEM_RESULT
     */
    public String getItemResult() {
        return itemResult;
    }

    /**
     * TDY_LIST_LEXAM.ITEM_RESULT
     *
     * @param itemResult the value for TDY_LIST_LEXAM.ITEM_RESULT
     */
    public void setItemResult(String itemResult) {
        this.itemResult = itemResult;
    }

    /**
     * TDY_LIST_LEXAM.ITEM_NAME
     *
     * @return the value of TDY_LIST_LEXAM.ITEM_NAME
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * TDY_LIST_LEXAM.ITEM_NAME
     *
     * @param itemName the value for TDY_LIST_LEXAM.ITEM_NAME
     */
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}