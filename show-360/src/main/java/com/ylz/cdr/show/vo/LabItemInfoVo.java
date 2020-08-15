package com.ylz.cdr.show.vo;

import com.ylz.cdr.lab.bean.LabItemInfo;

public class LabItemInfoVo extends LabItemInfo {
    private String isCompare;

    public LabItemInfoVo() {
        this.isCompare = "0";
    }

    public String getIsCompare() {
        return isCompare;
    }

    public void setIsCompare(String isCompare) {
        this.isCompare = isCompare;
    }
}
