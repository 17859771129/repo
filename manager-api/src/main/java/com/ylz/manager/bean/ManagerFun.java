package com.ylz.manager.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("manager_fun")
public class ManagerFun implements Serializable {
    private static final long serialVersionUID = -4468096133671430053L;
    @TableId(value = "id")
    private Integer id;

    private String funCode;

    private String funEn;

    private String funCn;

    private String funCategory;

    private String enableFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFunCode() {
        return funCode;
    }

    public void setFunCode(String funCode) {
        this.funCode = funCode == null ? null : funCode.trim();
    }

    public String getFunEn() {
        return funEn;
    }

    public void setFunEn(String funEn) {
        this.funEn = funEn == null ? null : funEn.trim();
    }

    public String getFunCn() {
        return funCn;
    }

    public void setFunCn(String funCn) {
        this.funCn = funCn == null ? null : funCn.trim();
    }

    public String getFunCategory() {
        return funCategory;
    }

    public void setFunCategory(String funCategory) {
        this.funCategory = funCategory == null ? null : funCategory.trim();
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag == null ? null : enableFlag.trim();
    }
}