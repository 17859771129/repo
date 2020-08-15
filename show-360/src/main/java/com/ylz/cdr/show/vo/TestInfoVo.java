package com.ylz.cdr.show.vo;

import com.ylz.cdr.bean.TdyListTest;

public class TestInfoVo extends TdyListTest {

    private static final long serialVersionUID = 7404349365387333540L;
    private String itemName;
    private String itemTypeCode;
    private String itemMinValue;
    private String itemMaxValue;
    private String itemUnit;
    private String isCompare;

    public TestInfoVo() {
        this.isCompare = "0";
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemTypeCode() {
        return itemTypeCode;
    }

    public void setItemTypeCode(String itemTypeCode) {
        this.itemTypeCode = itemTypeCode;
    }

    public String getItemMinValue() {
        return itemMinValue;
    }

    public void setItemMinValue(String itemMinValue) {
        this.itemMinValue = itemMinValue;
    }

    public String getItemMaxValue() {
        return itemMaxValue;
    }

    public void setItemMaxValue(String itemMaxValue) {
        this.itemMaxValue = itemMaxValue;
    }

    public String getItemUnit() {
        return itemUnit;
    }

    public void setItemUnit(String itemUnit) {
        this.itemUnit = itemUnit;
    }

    public String getIsCompare() {
        return isCompare;
    }

    public void setIsCompare(String isCompare) {
        this.isCompare = isCompare;
    }
}
