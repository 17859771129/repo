package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_ORDER")
public class TdyListOrder extends SubBaseBean implements Serializable {
    private static final long serialVersionUID = -8660309835224929119L;
    private Integer pk;

    private String uniqueId;

    private String domainId;

    private String xdsVersion;

    private String xdsType;

    private String empi;

    private String deleteFlag;

    private String tcmDrugUse;

    private String stopOrderDate;

    private String stopOrderCode;

    private String stopOrder;

    private String pdrugGroup;

    private String orderType;

    private String orderStartDate;

    private String orderRemark;

    private String orderEndDate;

    private String orderContent;

    private String orderCode;

    private String orderCategoryCode;

    private String orderCategory;

    private String openOrderDept;

    private String openOrderDate;

    private String openOrder;

    private String openOrderCode;

    private String executorStatus;

    private String executorOrderCode;

    private String executorOrder;

    private String executorDept;

    private String executorDate;

    private String dischargeOrder;

    private String decoctMethod;

    private String checkOrderDate;

    private String checkOrderCode;

    private String checkOrder;

    private String cancelOrderDate;

    private String cancelOrderCode;

    private String cancelOrder;

    private String auditOrderDate;

    private String auditOrderCode;

    private String auditOrder;

    private String appyId;

    private String encounterId;


    public Integer getPk() {
        return pk;
    }

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

    public void setEmpi(String empi) {
        this.empi = empi == null ? null : empi.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getTcmDrugUse() {
        return tcmDrugUse;
    }

    public void setTcmDrugUse(String tcmDrugUse) {
        this.tcmDrugUse = tcmDrugUse == null ? null : tcmDrugUse.trim();
    }

    public String getStopOrderDate() {
        return stopOrderDate;
    }

    public void setStopOrderDate(String stopOrderDate) {
        this.stopOrderDate = stopOrderDate == null ? null : stopOrderDate.trim();
    }

    public String getStopOrderCode() {
        return stopOrderCode;
    }

    public void setStopOrderCode(String stopOrderCode) {
        this.stopOrderCode = stopOrderCode == null ? null : stopOrderCode.trim();
    }

    public String getStopOrder() {
        return stopOrder;
    }

    public void setStopOrder(String stopOrder) {
        this.stopOrder = stopOrder == null ? null : stopOrder.trim();
    }

    public String getPdrugGroup() {
        return pdrugGroup;
    }

    public void setPdrugGroup(String pdrugGroup) {
        this.pdrugGroup = pdrugGroup == null ? null : pdrugGroup.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getOrderStartDate() {
        return orderStartDate;
    }

    public void setOrderStartDate(String orderStartDate) {
        this.orderStartDate = orderStartDate == null ? null : orderStartDate.trim();
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public String getOrderEndDate() {
        return orderEndDate;
    }

    public void setOrderEndDate(String orderEndDate) {
        this.orderEndDate = orderEndDate == null ? null : orderEndDate.trim();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode == null ? null : orderCode.trim();
    }

    public String getOrderCategoryCode() {
        return orderCategoryCode;
    }

    public void setOrderCategoryCode(String orderCategoryCode) {
        this.orderCategoryCode = orderCategoryCode == null ? null : orderCategoryCode.trim();
    }

    public String getOrderCategory() {
        return orderCategory;
    }

    public void setOrderCategory(String orderCategory) {
        this.orderCategory = orderCategory == null ? null : orderCategory.trim();
    }

    public String getOpenOrderDept() {
        return openOrderDept;
    }

    public void setOpenOrderDept(String openOrderDept) {
        this.openOrderDept = openOrderDept == null ? null : openOrderDept.trim();
    }

    public String getOpenOrderDate() {
        return openOrderDate;
    }

    public void setOpenOrderDate(String openOrderDate) {
        this.openOrderDate = openOrderDate == null ? null : openOrderDate.trim();
    }

    public String getOpenOrder() {
        return openOrder;
    }

    public void setOpenOrder(String openOrder) {
        this.openOrder = openOrder == null ? null : openOrder.trim();
    }

    public String getOpenOrderCode() {
        return openOrderCode;
    }

    public void setOpenOrderCode(String openOrderCode) {
        this.openOrderCode = openOrderCode == null ? null : openOrderCode.trim();
    }

    public String getExecutorStatus() {
        return executorStatus;
    }

    public void setExecutorStatus(String executorStatus) {
        this.executorStatus = executorStatus == null ? null : executorStatus.trim();
    }

    public String getExecutorOrderCode() {
        return executorOrderCode;
    }

    public void setExecutorOrderCode(String executorOrderCode) {
        this.executorOrderCode = executorOrderCode == null ? null : executorOrderCode.trim();
    }

    public String getExecutorOrder() {
        return executorOrder;
    }

    public void setExecutorOrder(String executorOrder) {
        this.executorOrder = executorOrder == null ? null : executorOrder.trim();
    }

    public String getExecutorDept() {
        return executorDept;
    }

    public void setExecutorDept(String executorDept) {
        this.executorDept = executorDept == null ? null : executorDept.trim();
    }

    public String getExecutorDate() {
        return executorDate;
    }

    public void setExecutorDate(String executorDate) {
        this.executorDate = executorDate == null ? null : executorDate.trim();
    }

    public String getDischargeOrder() {
        return dischargeOrder;
    }

    public void setDischargeOrder(String dischargeOrder) {
        this.dischargeOrder = dischargeOrder == null ? null : dischargeOrder.trim();
    }

    public String getDecoctMethod() {
        return decoctMethod;
    }

    public void setDecoctMethod(String decoctMethod) {
        this.decoctMethod = decoctMethod == null ? null : decoctMethod.trim();
    }

    public String getCheckOrderDate() {
        return checkOrderDate;
    }

    public void setCheckOrderDate(String checkOrderDate) {
        this.checkOrderDate = checkOrderDate == null ? null : checkOrderDate.trim();
    }

    public String getCheckOrderCode() {
        return checkOrderCode;
    }

    public void setCheckOrderCode(String checkOrderCode) {
        this.checkOrderCode = checkOrderCode == null ? null : checkOrderCode.trim();
    }

    public String getCheckOrder() {
        return checkOrder;
    }

    public void setCheckOrder(String checkOrder) {
        this.checkOrder = checkOrder == null ? null : checkOrder.trim();
    }

    public String getCancelOrderDate() {
        return cancelOrderDate;
    }

    public void setCancelOrderDate(String cancelOrderDate) {
        this.cancelOrderDate = cancelOrderDate == null ? null : cancelOrderDate.trim();
    }

    public String getCancelOrderCode() {
        return cancelOrderCode;
    }

    public void setCancelOrderCode(String cancelOrderCode) {
        this.cancelOrderCode = cancelOrderCode == null ? null : cancelOrderCode.trim();
    }

    public String getCancelOrder() {
        return cancelOrder;
    }

    public void setCancelOrder(String cancelOrder) {
        this.cancelOrder = cancelOrder == null ? null : cancelOrder.trim();
    }

    public String getAuditOrderDate() {
        return auditOrderDate;
    }

    public void setAuditOrderDate(String auditOrderDate) {
        this.auditOrderDate = auditOrderDate == null ? null : auditOrderDate.trim();
    }

    public String getAuditOrderCode() {
        return auditOrderCode;
    }

    public void setAuditOrderCode(String auditOrderCode) {
        this.auditOrderCode = auditOrderCode == null ? null : auditOrderCode.trim();
    }

    public String getAuditOrder() {
        return auditOrder;
    }

    public void setAuditOrder(String auditOrder) {
        this.auditOrder = auditOrder == null ? null : auditOrder.trim();
    }

    public String getAppyId() {
        return appyId;
    }

    public void setAppyId(String appyId) {
        this.appyId = appyId == null ? null : appyId.trim();
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId == null ? null : encounterId.trim();
    }
}