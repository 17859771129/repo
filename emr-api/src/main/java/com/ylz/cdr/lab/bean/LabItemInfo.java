package com.ylz.cdr.lab.bean;

import java.io.Serializable;

public class LabItemInfo implements Serializable {
    private static final long serialVersionUID = -5798414240822186005L;
    private Integer pk;
    private String itemCode;
    private String itemName;
    private String itemMaxValue;
    private String itemMinValue;
    private String itemUnit;
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

    public String getItemMaxValue() {
        return itemMaxValue;
    }

    public void setItemMaxValue(String itemMaxValue) {
        this.itemMaxValue = itemMaxValue;
    }

    public String getItemMinValue() {
        return itemMinValue;
    }

    public void setItemMinValue(String itemMinValue) {
        this.itemMinValue = itemMinValue;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
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
