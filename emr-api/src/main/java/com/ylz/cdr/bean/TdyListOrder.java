package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_ORDER")
public class TdyListOrder implements Serializable {
    /**
     * This field corresponds to the database table TDY_LIST_ORDER
     */
    private static final long serialVersionUID = 1L;
    /**
     * TDY_LIST_ORDER.pk
     */
    private Integer pk;
    /**
     * TDY_LIST_ORDER.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_ORDER.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_ORDER.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_ORDER.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_ORDER.empi
     */
    private String empi;
    /**
     * TDY_LIST_ORDER.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_ORDER.TCM_DRUG_USE
     */
    private String tcmDrugUse;
    /**
     * TDY_LIST_ORDER.STOP_ORDER_DATE
     */
    private String stopOrderDate;
    /**
     * TDY_LIST_ORDER.STOP_ORDER_CODE
     */
    private String stopOrderCode;
    /**
     * TDY_LIST_ORDER.STOP_ORDER
     */
    private String stopOrder;
    /**
     * TDY_LIST_ORDER.PDRUG_GROUP
     */
    private String pdrugGroup;
    /**
     * TDY_LIST_ORDER.ORDER_TYPE
     */
    private String orderType;
    /**
     * TDY_LIST_ORDER.ORDER_START_DATE
     */
    private String orderStartDate;
    /**
     * TDY_LIST_ORDER.ORDER_REMARK
     */
    private String orderRemark;
    /**
     * TDY_LIST_ORDER.ORDER_END_DATE
     */
    private String orderEndDate;
    /**
     * TDY_LIST_ORDER.ORDER_CONTENT
     */
    private String orderContent;
    /**
     * TDY_LIST_ORDER.ORDER_CODE
     */
    private String orderCode;
    /**
     * TDY_LIST_ORDER.ORDER_CATEGORY_CODE
     */
    private String orderCategoryCode;
    /**
     * TDY_LIST_ORDER.ORDER_CATEGORY
     */
    private String orderCategory;
    /**
     * TDY_LIST_ORDER.OPEN_ORDER_DEPT
     */
    private String openOrderDept;
    /**
     * TDY_LIST_ORDER.OPEN_ORDER_DATE
     */
    private String openOrderDate;
    /**
     * TDY_LIST_ORDER.OPEN_ORDER
     */
    private String openOrder;
    /**
     * TDY_LIST_ORDER.OPEN_ORDER_CODE
     */
    private String openOrderCode;
    /**
     * TDY_LIST_ORDER.EXECUTOR_STATUS
     */
    private String executorStatus;
    /**
     * TDY_LIST_ORDER.EXECUTOR_ORDER_CODE
     */
    private String executorOrderCode;
    /**
     * TDY_LIST_ORDER.EXECUTOR_ORDER
     */
    private String executorOrder;
    /**
     * TDY_LIST_ORDER.EXECUTOR_DEPT
     */
    private String executorDept;
    /**
     * TDY_LIST_ORDER.EXECUTOR_DATE
     */
    private String executorDate;
    /**
     * TDY_LIST_ORDER.DISCHARGE_ORDER
     */
    private String dischargeOrder;
    /**
     * TDY_LIST_ORDER.DECOCT_METHOD
     */
    private String decoctMethod;
    /**
     * TDY_LIST_ORDER.CHECK_ORDER_DATE
     */
    private String checkOrderDate;
    /**
     * TDY_LIST_ORDER.CHECK_ORDER_CODE
     */
    private String checkOrderCode;
    /**
     * TDY_LIST_ORDER.CHECK_ORDER
     */
    private String checkOrder;
    /**
     * TDY_LIST_ORDER.CANCEL_ORDER_DATE
     */
    private String cancelOrderDate;
    /**
     * TDY_LIST_ORDER.CANCEL_ORDER_CODE
     */
    private String cancelOrderCode;
    /**
     * TDY_LIST_ORDER.CANCEL_ORDER
     */
    private String cancelOrder;
    /**
     * TDY_LIST_ORDER.AUDIT_ORDER_DATE
     */
    private String auditOrderDate;
    /**
     * TDY_LIST_ORDER.AUDIT_ORDER_CODE
     */
    private String auditOrderCode;
    /**
     * TDY_LIST_ORDER.AUDIT_ORDER
     */
    private String auditOrder;
    /**
     * TDY_LIST_ORDER.APPY_ID
     */
    private String appyId;
    /**
     * TDY_LIST_ORDER.ENCOUNTER_ID
     */
    private String encounterId;

    /**
     * TDY_LIST_ORDER.pk
     *
     * @return the value of TDY_LIST_ORDER.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * TDY_LIST_ORDER.pk
     *
     * @param pk the value for TDY_LIST_ORDER.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * TDY_LIST_ORDER.doc_unique
     *
     * @return the value of TDY_LIST_ORDER.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_ORDER.doc_unique
     *
     * @param docUnique the value for TDY_LIST_ORDER.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_ORDER.doc_domain_id
     *
     * @return the value of TDY_LIST_ORDER.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_ORDER.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_ORDER.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_ORDER.doc_version
     *
     * @return the value of TDY_LIST_ORDER.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_ORDER.doc_version
     *
     * @param docVersion the value for TDY_LIST_ORDER.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_ORDER.doc_type
     *
     * @return the value of TDY_LIST_ORDER.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_ORDER.doc_type
     *
     * @param docType the value for TDY_LIST_ORDER.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_ORDER.empi
     *
     * @return the value of TDY_LIST_ORDER.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_ORDER.empi
     *
     * @param empi the value for TDY_LIST_ORDER.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_ORDER.delete_flag
     *
     * @return the value of TDY_LIST_ORDER.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_ORDER.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_ORDER.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_ORDER.TCM_DRUG_USE
     *
     * @return the value of TDY_LIST_ORDER.TCM_DRUG_USE
     */
    public String getTcmDrugUse() {
        return tcmDrugUse;
    }

    /**
     * TDY_LIST_ORDER.TCM_DRUG_USE
     *
     * @param tcmDrugUse the value for TDY_LIST_ORDER.TCM_DRUG_USE
     */
    public void setTcmDrugUse(String tcmDrugUse) {
        this.tcmDrugUse = tcmDrugUse;
    }

    /**
     * TDY_LIST_ORDER.STOP_ORDER_DATE
     *
     * @return the value of TDY_LIST_ORDER.STOP_ORDER_DATE
     */
    public String getStopOrderDate() {
        return stopOrderDate;
    }

    /**
     * TDY_LIST_ORDER.STOP_ORDER_DATE
     *
     * @param stopOrderDate the value for TDY_LIST_ORDER.STOP_ORDER_DATE
     */
    public void setStopOrderDate(String stopOrderDate) {
        this.stopOrderDate = stopOrderDate;
    }

    /**
     * TDY_LIST_ORDER.STOP_ORDER_CODE
     *
     * @return the value of TDY_LIST_ORDER.STOP_ORDER_CODE
     */
    public String getStopOrderCode() {
        return stopOrderCode;
    }

    /**
     * TDY_LIST_ORDER.STOP_ORDER_CODE
     *
     * @param stopOrderCode the value for TDY_LIST_ORDER.STOP_ORDER_CODE
     */
    public void setStopOrderCode(String stopOrderCode) {
        this.stopOrderCode = stopOrderCode;
    }

    /**
     * TDY_LIST_ORDER.STOP_ORDER
     *
     * @return the value of TDY_LIST_ORDER.STOP_ORDER
     */
    public String getStopOrder() {
        return stopOrder;
    }

    /**
     * TDY_LIST_ORDER.STOP_ORDER
     *
     * @param stopOrder the value for TDY_LIST_ORDER.STOP_ORDER
     */
    public void setStopOrder(String stopOrder) {
        this.stopOrder = stopOrder;
    }

    /**
     * TDY_LIST_ORDER.PDRUG_GROUP
     *
     * @return the value of TDY_LIST_ORDER.PDRUG_GROUP
     */
    public String getPdrugGroup() {
        return pdrugGroup;
    }

    /**
     * TDY_LIST_ORDER.PDRUG_GROUP
     *
     * @param pdrugGroup the value for TDY_LIST_ORDER.PDRUG_GROUP
     */
    public void setPdrugGroup(String pdrugGroup) {
        this.pdrugGroup = pdrugGroup;
    }

    /**
     * TDY_LIST_ORDER.ORDER_TYPE
     *
     * @return the value of TDY_LIST_ORDER.ORDER_TYPE
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * TDY_LIST_ORDER.ORDER_TYPE
     *
     * @param orderType the value for TDY_LIST_ORDER.ORDER_TYPE
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * TDY_LIST_ORDER.ORDER_START_DATE
     *
     * @return the value of TDY_LIST_ORDER.ORDER_START_DATE
     */
    public String getOrderStartDate() {
        return orderStartDate;
    }

    /**
     * TDY_LIST_ORDER.ORDER_START_DATE
     *
     * @param orderStartDate the value for TDY_LIST_ORDER.ORDER_START_DATE
     */
    public void setOrderStartDate(String orderStartDate) {
        this.orderStartDate = orderStartDate;
    }

    /**
     * TDY_LIST_ORDER.ORDER_REMARK
     *
     * @return the value of TDY_LIST_ORDER.ORDER_REMARK
     */
    public String getOrderRemark() {
        return orderRemark;
    }

    /**
     * TDY_LIST_ORDER.ORDER_REMARK
     *
     * @param orderRemark the value for TDY_LIST_ORDER.ORDER_REMARK
     */
    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    /**
     * TDY_LIST_ORDER.ORDER_END_DATE
     *
     * @return the value of TDY_LIST_ORDER.ORDER_END_DATE
     */
    public String getOrderEndDate() {
        return orderEndDate;
    }

    /**
     * TDY_LIST_ORDER.ORDER_END_DATE
     *
     * @param orderEndDate the value for TDY_LIST_ORDER.ORDER_END_DATE
     */
    public void setOrderEndDate(String orderEndDate) {
        this.orderEndDate = orderEndDate;
    }

    /**
     * TDY_LIST_ORDER.ORDER_CONTENT
     *
     * @return the value of TDY_LIST_ORDER.ORDER_CONTENT
     */
    public String getOrderContent() {
        return orderContent;
    }

    /**
     * TDY_LIST_ORDER.ORDER_CONTENT
     *
     * @param orderContent the value for TDY_LIST_ORDER.ORDER_CONTENT
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    /**
     * TDY_LIST_ORDER.ORDER_CODE
     *
     * @return the value of TDY_LIST_ORDER.ORDER_CODE
     */
    public String getOrderCode() {
        return orderCode;
    }

    /**
     * TDY_LIST_ORDER.ORDER_CODE
     *
     * @param orderCode the value for TDY_LIST_ORDER.ORDER_CODE
     */
    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    /**
     * TDY_LIST_ORDER.ORDER_CATEGORY_CODE
     *
     * @return the value of TDY_LIST_ORDER.ORDER_CATEGORY_CODE
     */
    public String getOrderCategoryCode() {
        return orderCategoryCode;
    }

    /**
     * TDY_LIST_ORDER.ORDER_CATEGORY_CODE
     *
     * @param orderCategoryCode the value for TDY_LIST_ORDER.ORDER_CATEGORY_CODE
     */
    public void setOrderCategoryCode(String orderCategoryCode) {
        this.orderCategoryCode = orderCategoryCode;
    }

    /**
     * TDY_LIST_ORDER.ORDER_CATEGORY
     *
     * @return the value of TDY_LIST_ORDER.ORDER_CATEGORY
     */
    public String getOrderCategory() {
        return orderCategory;
    }

    /**
     * TDY_LIST_ORDER.ORDER_CATEGORY
     *
     * @param orderCategory the value for TDY_LIST_ORDER.ORDER_CATEGORY
     */
    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory;
    }

    /**
     * TDY_LIST_ORDER.OPEN_ORDER_DEPT
     *
     * @return the value of TDY_LIST_ORDER.OPEN_ORDER_DEPT
     */
    public String getOpenOrderDept() {
        return openOrderDept;
    }

    /**
     * TDY_LIST_ORDER.OPEN_ORDER_DEPT
     *
     * @param openOrderDept the value for TDY_LIST_ORDER.OPEN_ORDER_DEPT
     */
    public void setOpenOrderDept(String openOrderDept) {
        this.openOrderDept = openOrderDept;
    }

    /**
     * TDY_LIST_ORDER.OPEN_ORDER_DATE
     *
     * @return the value of TDY_LIST_ORDER.OPEN_ORDER_DATE
     */
    public String getOpenOrderDate() {
        return openOrderDate;
    }

    /**
     * TDY_LIST_ORDER.OPEN_ORDER_DATE
     *
     * @param openOrderDate the value for TDY_LIST_ORDER.OPEN_ORDER_DATE
     */
    public void setOpenOrderDate(String openOrderDate) {
        this.openOrderDate = openOrderDate;
    }

    /**
     * TDY_LIST_ORDER.OPEN_ORDER
     *
     * @return the value of TDY_LIST_ORDER.OPEN_ORDER
     */
    public String getOpenOrder() {
        return openOrder;
    }

    /**
     * TDY_LIST_ORDER.OPEN_ORDER
     *
     * @param openOrder the value for TDY_LIST_ORDER.OPEN_ORDER
     */
    public void setOpenOrder(String openOrder) {
        this.openOrder = openOrder;
    }

    /**
     * TDY_LIST_ORDER.OPEN_ORDER_CODE
     *
     * @return the value of TDY_LIST_ORDER.OPEN_ORDER_CODE
     */
    public String getOpenOrderCode() {
        return openOrderCode;
    }

    /**
     * TDY_LIST_ORDER.OPEN_ORDER_CODE
     *
     * @param openOrderCode the value for TDY_LIST_ORDER.OPEN_ORDER_CODE
     */
    public void setOpenOrderCode(String openOrderCode) {
        this.openOrderCode = openOrderCode;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_STATUS
     *
     * @return the value of TDY_LIST_ORDER.EXECUTOR_STATUS
     */
    public String getExecutorStatus() {
        return executorStatus;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_STATUS
     *
     * @param executorStatus the value for TDY_LIST_ORDER.EXECUTOR_STATUS
     */
    public void setExecutorStatus(String executorStatus) {
        this.executorStatus = executorStatus;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_ORDER_CODE
     *
     * @return the value of TDY_LIST_ORDER.EXECUTOR_ORDER_CODE
     */
    public String getExecutorOrderCode() {
        return executorOrderCode;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_ORDER_CODE
     *
     * @param executorOrderCode the value for TDY_LIST_ORDER.EXECUTOR_ORDER_CODE
     */
    public void setExecutorOrderCode(String executorOrderCode) {
        this.executorOrderCode = executorOrderCode;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_ORDER
     *
     * @return the value of TDY_LIST_ORDER.EXECUTOR_ORDER
     */
    public String getExecutorOrder() {
        return executorOrder;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_ORDER
     *
     * @param executorOrder the value for TDY_LIST_ORDER.EXECUTOR_ORDER
     */
    public void setExecutorOrder(String executorOrder) {
        this.executorOrder = executorOrder;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_DEPT
     *
     * @return the value of TDY_LIST_ORDER.EXECUTOR_DEPT
     */
    public String getExecutorDept() {
        return executorDept;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_DEPT
     *
     * @param executorDept the value for TDY_LIST_ORDER.EXECUTOR_DEPT
     */
    public void setExecutorDept(String executorDept) {
        this.executorDept = executorDept;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_DATE
     *
     * @return the value of TDY_LIST_ORDER.EXECUTOR_DATE
     */
    public String getExecutorDate() {
        return executorDate;
    }

    /**
     * TDY_LIST_ORDER.EXECUTOR_DATE
     *
     * @param executorDate the value for TDY_LIST_ORDER.EXECUTOR_DATE
     */
    public void setExecutorDate(String executorDate) {
        this.executorDate = executorDate;
    }

    /**
     * TDY_LIST_ORDER.DISCHARGE_ORDER
     *
     * @return the value of TDY_LIST_ORDER.DISCHARGE_ORDER
     */
    public String getDischargeOrder() {
        return dischargeOrder;
    }

    /**
     * TDY_LIST_ORDER.DISCHARGE_ORDER
     *
     * @param dischargeOrder the value for TDY_LIST_ORDER.DISCHARGE_ORDER
     */
    public void setDischargeOrder(String dischargeOrder) {
        this.dischargeOrder = dischargeOrder;
    }

    /**
     * TDY_LIST_ORDER.DECOCT_METHOD
     *
     * @return the value of TDY_LIST_ORDER.DECOCT_METHOD
     */
    public String getDecoctMethod() {
        return decoctMethod;
    }

    /**
     * TDY_LIST_ORDER.DECOCT_METHOD
     *
     * @param decoctMethod the value for TDY_LIST_ORDER.DECOCT_METHOD
     */
    public void setDecoctMethod(String decoctMethod) {
        this.decoctMethod = decoctMethod;
    }

    /**
     * TDY_LIST_ORDER.CHECK_ORDER_DATE
     *
     * @return the value of TDY_LIST_ORDER.CHECK_ORDER_DATE
     */
    public String getCheckOrderDate() {
        return checkOrderDate;
    }

    /**
     * TDY_LIST_ORDER.CHECK_ORDER_DATE
     *
     * @param checkOrderDate the value for TDY_LIST_ORDER.CHECK_ORDER_DATE
     */
    public void setCheckOrderDate(String checkOrderDate) {
        this.checkOrderDate = checkOrderDate;
    }

    /**
     * TDY_LIST_ORDER.CHECK_ORDER_CODE
     *
     * @return the value of TDY_LIST_ORDER.CHECK_ORDER_CODE
     */
    public String getCheckOrderCode() {
        return checkOrderCode;
    }

    /**
     * TDY_LIST_ORDER.CHECK_ORDER_CODE
     *
     * @param checkOrderCode the value for TDY_LIST_ORDER.CHECK_ORDER_CODE
     */
    public void setCheckOrderCode(String checkOrderCode) {
        this.checkOrderCode = checkOrderCode;
    }

    /**
     * TDY_LIST_ORDER.CHECK_ORDER
     *
     * @return the value of TDY_LIST_ORDER.CHECK_ORDER
     */
    public String getCheckOrder() {
        return checkOrder;
    }

    /**
     * TDY_LIST_ORDER.CHECK_ORDER
     *
     * @param checkOrder the value for TDY_LIST_ORDER.CHECK_ORDER
     */
    public void setCheckOrder(String checkOrder) {
        this.checkOrder = checkOrder;
    }

    /**
     * TDY_LIST_ORDER.CANCEL_ORDER_DATE
     *
     * @return the value of TDY_LIST_ORDER.CANCEL_ORDER_DATE
     */
    public String getCancelOrderDate() {
        return cancelOrderDate;
    }

    /**
     * TDY_LIST_ORDER.CANCEL_ORDER_DATE
     *
     * @param cancelOrderDate the value for TDY_LIST_ORDER.CANCEL_ORDER_DATE
     */
    public void setCancelOrderDate(String cancelOrderDate) {
        this.cancelOrderDate = cancelOrderDate;
    }

    /**
     * TDY_LIST_ORDER.CANCEL_ORDER_CODE
     *
     * @return the value of TDY_LIST_ORDER.CANCEL_ORDER_CODE
     */
    public String getCancelOrderCode() {
        return cancelOrderCode;
    }

    /**
     * TDY_LIST_ORDER.CANCEL_ORDER_CODE
     *
     * @param cancelOrderCode the value for TDY_LIST_ORDER.CANCEL_ORDER_CODE
     */
    public void setCancelOrderCode(String cancelOrderCode) {
        this.cancelOrderCode = cancelOrderCode;
    }

    /**
     * TDY_LIST_ORDER.CANCEL_ORDER
     *
     * @return the value of TDY_LIST_ORDER.CANCEL_ORDER
     */
    public String getCancelOrder() {
        return cancelOrder;
    }

    /**
     * TDY_LIST_ORDER.CANCEL_ORDER
     *
     * @param cancelOrder the value for TDY_LIST_ORDER.CANCEL_ORDER
     */
    public void setCancelOrder(String cancelOrder) {
        this.cancelOrder = cancelOrder;
    }

    /**
     * TDY_LIST_ORDER.AUDIT_ORDER_DATE
     *
     * @return the value of TDY_LIST_ORDER.AUDIT_ORDER_DATE
     */
    public String getAuditOrderDate() {
        return auditOrderDate;
    }

    /**
     * TDY_LIST_ORDER.AUDIT_ORDER_DATE
     *
     * @param auditOrderDate the value for TDY_LIST_ORDER.AUDIT_ORDER_DATE
     */
    public void setAuditOrderDate(String auditOrderDate) {
        this.auditOrderDate = auditOrderDate;
    }

    /**
     * TDY_LIST_ORDER.AUDIT_ORDER_CODE
     *
     * @return the value of TDY_LIST_ORDER.AUDIT_ORDER_CODE
     */
    public String getAuditOrderCode() {
        return auditOrderCode;
    }

    /**
     * TDY_LIST_ORDER.AUDIT_ORDER_CODE
     *
     * @param auditOrderCode the value for TDY_LIST_ORDER.AUDIT_ORDER_CODE
     */
    public void setAuditOrderCode(String auditOrderCode) {
        this.auditOrderCode = auditOrderCode;
    }

    /**
     * TDY_LIST_ORDER.AUDIT_ORDER
     *
     * @return the value of TDY_LIST_ORDER.AUDIT_ORDER
     */
    public String getAuditOrder() {
        return auditOrder;
    }

    /**
     * TDY_LIST_ORDER.AUDIT_ORDER
     *
     * @param auditOrder the value for TDY_LIST_ORDER.AUDIT_ORDER
     */
    public void setAuditOrder(String auditOrder) {
        this.auditOrder = auditOrder;
    }

    /**
     * TDY_LIST_ORDER.APPY_ID
     *
     * @return the value of TDY_LIST_ORDER.APPY_ID
     */
    public String getAppyId() {
        return appyId;
    }

    /**
     * TDY_LIST_ORDER.APPY_ID
     *
     * @param appyId the value for TDY_LIST_ORDER.APPY_ID
     */
    public void setAppyId(String appyId) {
        this.appyId = appyId;
    }

    /**
     * TDY_LIST_ORDER.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_ORDER.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_ORDER.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_ORDER.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }
}