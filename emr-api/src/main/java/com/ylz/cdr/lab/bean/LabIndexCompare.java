package com.ylz.cdr.lab.bean;

import java.io.Serializable;

public class LabIndexCompare implements Serializable {
    private static final long serialVersionUID = 7610222777206996618L;
    private Integer pk;
    private String itemCode;
    private String itemName;
    private String empi;
    private String encounterId;
    private String isCompare;
    private String itemType;
    private String itemTypeCode;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

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

    public String getIsCompare() {
        return isCompare;
    }

    public void setIsCompare(String isCompare) {
        this.isCompare = isCompare;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemTypeCode() {
        return itemTypeCode;
    }

    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode;
    }
}
