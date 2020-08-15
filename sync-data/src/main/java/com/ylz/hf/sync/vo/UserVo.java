package com.ylz.hf.sync.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

/**
 * 机构人员信息
 */
@RootElement(path = "/PERSONNEL")
public class UserVo {

    @XMLObject(xpath = "./SEND_ID", ntype = XMLObject.TEXT)
    private String sendId;
    @XMLObject(xpath = "./USER_NAME", ntype = XMLObject.TEXT)
    private String userName;
    @XMLObject(xpath = "./PASS_WORD", ntype = XMLObject.TEXT)
    private String password;
    @XMLObject(xpath = "./NAME", ntype = XMLObject.TEXT)
    private String realName;
    @XMLObject(xpath = "./GENDER_DEPICT", ntype = XMLObject.TEXT)
    private String sex;
    @XMLObject(xpath = "./GENDER_ID", ntype = XMLObject.TEXT)
    private String sexCode;
    @XMLObject(xpath = "./DATE_OF_BIRTH", ntype = XMLObject.TEXT)
    private String birthday;
    @XMLObject(xpath = "./DEPT_ID", ntype = XMLObject.TEXT)
    private String deptCode;
    @XMLObject(xpath = "./DEPT_NAME", ntype = XMLObject.TEXT)
    private String deptName;
    @XMLObject(xpath = "./HEALTH_CARE_PROVIDER_ID", ntype = XMLObject.TEXT)
    private String jobNo;
    @XMLObject(xpath = "./JOB_TYPE", ntype = XMLObject.TEXT)
    private String jobType;
    @XMLObject(xpath = "./JOB_CATEGORY_ID", ntype = XMLObject.TEXT)
    private String positionCode;
    @XMLObject(xpath = "./JOB_CATEGORY_NAME", ntype = XMLObject.TEXT)
    private String positionName;
    @XMLObject(xpath = "./BIRTHPLACE", ntype = XMLObject.TEXT)
    private String birthPlace;
    @XMLObject(xpath = "./EMAIL", ntype = XMLObject.TEXT)
    private String email;
    @XMLObject(xpath = "./PHONE", ntype = XMLObject.TEXT)
    private String phone;
    @XMLObject(xpath = "./IDENTITY_NO", ntype = XMLObject.TEXT)
    private String identyId;
    @XMLObject(xpath = "./STATUS_CODE", ntype = XMLObject.TEXT)
    private String statusCode;

    public String getSendId() {
        return sendId;
    }

    public void setSendId(String sendId) {
        this.sendId = sendId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSexCode() {
        return sexCode;
    }

    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getJobNo() {
        return jobNo;
    }

    public void setJobNo(String jobNo) {
        this.jobNo = jobNo;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdentyId() {
        return identyId;
    }

    public void setIdentyId(String identyId) {
        this.identyId = identyId;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
