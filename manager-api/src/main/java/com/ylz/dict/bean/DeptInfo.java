package com.ylz.dict.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("dept_info")
public class DeptInfo {

    private String sendId;

    private String deptId;

    private String deptName;

    private String deptTypeId;

    private String deptTypeName;

    private String deptPhone;

    private String deptContactPerson;

    private String parentDeptId;

    private String parentDeptName;

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptTypeId() {
        return deptTypeId;
    }

    public void setDeptTypeId(String deptTypeId) {
        this.deptTypeId = deptTypeId;
    }

    public String getDeptTypeName() {
        return deptTypeName;
    }

    public void setDeptTypeName(String deptTypeName) {
        this.deptTypeName = deptTypeName;
    }

    public String getDeptPhone() {
        return deptPhone;
    }

    public void setDeptPhone(String deptPhone) {
        this.deptPhone = deptPhone;
    }

    public String getDeptContactPerson() {
        return deptContactPerson;
    }

    public void setDeptContactPerson(String deptContactPerson) {
        this.deptContactPerson = deptContactPerson;
    }

    public String getParentDeptId() {
        return parentDeptId;
    }

    public void setParentDeptId(String parentDeptId) {
        this.parentDeptId = parentDeptId;
    }

    public String getParentDeptName() {
        return parentDeptName;
    }

    public void setParentDeptName(String parentDeptName) {
        this.parentDeptName = parentDeptName;
    }
}
