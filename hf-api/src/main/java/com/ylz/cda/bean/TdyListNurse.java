package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_NURSE")
public class TdyListNurse extends SubBaseBean implements Serializable {
    private static final long serialVersionUID = -8265270684992582810L;
    private Integer pk;

    private String uniqueId;

    private String domainId;

    private String xdsVersion;

    private String xdsType;

    private String empi;

    private String encounterId;

    private String deleteFlag;

    private String nurseResult;

    private String nurseName;

    private String nurseCategoryItem;

    private String nurseType;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId == null ? null : uniqueId.trim();
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId == null ? null : domainId.trim();
    }

    public String getXdsVersion() {
        return xdsVersion == null ? "" : xdsVersion.trim();
    }

    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion == null ? "" : xdsVersion.trim();
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType == null ? null : xdsType.trim();
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi == null ? null : empi.trim();
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId == null ? null : encounterId.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getNurseResult() {
        return nurseResult;
    }

    public void setNurseResult(String nurseResult) {
        this.nurseResult = nurseResult == null ? null : nurseResult.trim();
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName == null ? null : nurseName.trim();
    }

    public String getNurseCategoryItem() {
        return nurseCategoryItem;
    }

    public void setNurseCategoryItem(String nurseCategoryItem) {
        this.nurseCategoryItem = nurseCategoryItem == null ? null : nurseCategoryItem.trim();
    }

    public String getNurseType() {
        return nurseType;
    }

    public void setNurseType(String nurseType) {
        this.nurseType = nurseType == null ? null : nurseType.trim();
    }
}