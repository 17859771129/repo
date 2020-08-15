package com.ylz.manager.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("manager_app")
public class ManagerApp implements Serializable {
    private static final long serialVersionUID = -180943206185509306L;
    @TableId(value = "id")
    private Integer id;

    private String appCode;

    private String appEn;

    private String appCn;

    private String appCategory;

    private String enableFlag;

    private String empower;

    private String empowerCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode == null ? null : appCode.trim();
    }

    public String getAppEn() {
        return appEn;
    }

    public void setAppEn(String appEn) {
        this.appEn = appEn == null ? null : appEn.trim();
    }

    public String getAppCn() {
        return appCn;
    }

    public void setAppCn(String appCn) {
        this.appCn = appCn == null ? null : appCn.trim();
    }

    public String getAppCategory() {
        return appCategory;
    }

    public void setAppCategory(String appCategory) {
        this.appCategory = appCategory == null ? null : appCategory.trim();
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag == null ? null : enableFlag.trim();
    }

    public String getEmpower() {
        return empower;
    }

    public void setEmpower(String empower) {
        this.empower = empower;
    }

    public String getEmpowerCode() {
        return empowerCode;
    }

    public void setEmpowerCode(String empowerCode) {
        this.empowerCode = empowerCode;
    }
}