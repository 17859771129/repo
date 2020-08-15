package com.ylz.hf.sync.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

@RootElement(path = "/DEPT")
public class DeptVo {
    @XMLObject(xpath = "./SEND_ID", ntype = XMLObject.TEXT)
    private String sendId;
    @XMLObject(xpath = "./DEPT_ID", ntype = XMLObject.TEXT)
    private String deptId;
    @XMLObject(xpath = "./DEPT_NAME", ntype = XMLObject.TEXT)
    private String deptName;
    @XMLObject(xpath = "./DEPT_TYPE_ID", ntype = XMLObject.TEXT)
    private String deptTypeId;
    @XMLObject(xpath = "./DEPT_TYPE_NAME", ntype = XMLObject.TEXT)
    private String deptTypeName;
    @XMLObject(xpath = "./DEPT_PHONE", ntype = XMLObject.TEXT)
    private String deptPhone;
    @XMLObject(xpath = "./DEPT_CONTACT_PERSON", ntype = XMLObject.TEXT)
    private String deptContactPerson;
    @XMLObject(xpath = "./PARENT_DEPT_ID", ntype = XMLObject.TEXT)
    private String parentDeptId;
    @XMLObject(xpath = "./PARENT_DEPT_NAME", ntype = XMLObject.TEXT)
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
