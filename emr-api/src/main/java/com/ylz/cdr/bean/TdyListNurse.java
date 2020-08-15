package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_NURSE")
public class TdyListNurse implements Serializable {
    /**
     * This field corresponds to the database table TDY_LIST_NURSE
     */
    private static final long serialVersionUID = 1L;
    /**
     * TDY_LIST_NURSE.pk
     */
    private Integer pk;
    /**
     * TDY_LIST_NURSE.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_NURSE.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_NURSE.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_NURSE.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_NURSE.empi
     */
    private String empi;
    /**
     * TDY_LIST_NURSE.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * TDY_LIST_NURSE.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_NURSE.VENTILATOR_MONITORING
     */
    private String ventilatorMonitoring;
    /**
     * TDY_LIST_NURSE.NURSE_RESULT
     */
    private String nurseResult;
    /**
     * TDY_LIST_NURSE.NURSE_NAME
     */
    private String nurseName;
    /**
     * TDY_LIST_NURSE.NURSE_CATEGORY_ITEM
     */
    private String nurseCategoryItem;
    /**
     * TDY_LIST_NURSE.NURSE_TYPE
     */
    private String nurseType;

    /**
     * TDY_LIST_NURSE.pk
     *
     * @return the value of TDY_LIST_NURSE.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * TDY_LIST_NURSE.pk
     *
     * @param pk the value for TDY_LIST_NURSE.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * TDY_LIST_NURSE.doc_unique
     *
     * @return the value of TDY_LIST_NURSE.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_NURSE.doc_unique
     *
     * @param docUnique the value for TDY_LIST_NURSE.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_NURSE.doc_domain_id
     *
     * @return the value of TDY_LIST_NURSE.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_NURSE.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_NURSE.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_NURSE.doc_version
     *
     * @return the value of TDY_LIST_NURSE.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_NURSE.doc_version
     *
     * @param docVersion the value for TDY_LIST_NURSE.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_NURSE.doc_type
     *
     * @return the value of TDY_LIST_NURSE.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_NURSE.doc_type
     *
     * @param docType the value for TDY_LIST_NURSE.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_NURSE.empi
     *
     * @return the value of TDY_LIST_NURSE.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_NURSE.empi
     *
     * @param empi the value for TDY_LIST_NURSE.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_NURSE.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_NURSE.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_NURSE.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_NURSE.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * TDY_LIST_NURSE.delete_flag
     *
     * @return the value of TDY_LIST_NURSE.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_NURSE.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_NURSE.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_NURSE.VENTILATOR_MONITORING
     *
     * @return the value of TDY_LIST_NURSE.VENTILATOR_MONITORING
     */
    public String getVentilatorMonitoring() {
        return ventilatorMonitoring;
    }

    /**
     * TDY_LIST_NURSE.VENTILATOR_MONITORING
     *
     * @param ventilatorMonitoring the value for TDY_LIST_NURSE.VENTILATOR_MONITORING
     */
    public void setVentilatorMonitoring(String ventilatorMonitoring) {
        this.ventilatorMonitoring = ventilatorMonitoring;
    }

    /**
     * TDY_LIST_NURSE.NURSE_RESULT
     *
     * @return the value of TDY_LIST_NURSE.NURSE_RESULT
     */
    public String getNurseResult() {
        return nurseResult;
    }

    /**
     * TDY_LIST_NURSE.NURSE_RESULT
     *
     * @param nurseResult the value for TDY_LIST_NURSE.NURSE_RESULT
     */
    public void setNurseResult(String nurseResult) {
        this.nurseResult = nurseResult;
    }

    /**
     * TDY_LIST_NURSE.NURSE_NAME
     *
     * @return the value of TDY_LIST_NURSE.NURSE_NAME
     */
    public String getNurseName() {
        return nurseName;
    }

    /**
     * TDY_LIST_NURSE.NURSE_NAME
     *
     * @param nurseName the value for TDY_LIST_NURSE.NURSE_NAME
     */
    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    /**
     * TDY_LIST_NURSE.NURSE_CATEGORY_ITEM
     *
     * @return the value of TDY_LIST_NURSE.NURSE_CATEGORY_ITEM
     */
    public String getNurseCategoryItem() {
        return nurseCategoryItem;
    }

    /**
     * TDY_LIST_NURSE.NURSE_CATEGORY_ITEM
     *
     * @param nurseCategoryItem the value for TDY_LIST_NURSE.NURSE_CATEGORY_ITEM
     */
    public void setNurseCategoryItem(String nurseCategoryItem) {
        this.nurseCategoryItem = nurseCategoryItem;
    }

    /**
     * TDY_LIST_NURSE.NURSE_TYPE
     *
     * @return the value of TDY_LIST_NURSE.NURSE_TYPE
     */
    public String getNurseType() {
        return nurseType;
    }

    /**
     * TDY_LIST_NURSE.NURSE_TYPE
     *
     * @param nurseType the value for TDY_LIST_NURSE.NURSE_TYPE
     */
    public void setNurseType(String nurseType) {
        this.nurseType = nurseType;
    }
}