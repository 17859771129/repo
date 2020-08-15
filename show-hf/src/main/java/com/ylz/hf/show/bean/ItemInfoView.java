package com.ylz.hf.show.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("item_info_view")
public class ItemInfoView implements Serializable {

    private static final long serialVersionUID = 5087909303372823790L;
    private String itemCode;
    private String itemName;
    private String inspectDate;
    private String resultName;
    private String quantyResult;
    private String itemMaxValue;
    private String itemMinValue;
    private String itemUnit;
    private String hospitalName;
    private String empi;


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

    public String getInspectDate() {
        return inspectDate;
    }

    public void setInspectDate(String inspectDate) {
        this.inspectDate = inspectDate;
    }

    public String getResultName() {
        return resultName;
    }

    public void setResultName(String resultName) {
        this.resultName = resultName;
    }

    public String getQuantyResult() {
        return quantyResult;
    }

    public void setQuantyResult(String quantyResult) {
        this.quantyResult = quantyResult;
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

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi;
    }
}