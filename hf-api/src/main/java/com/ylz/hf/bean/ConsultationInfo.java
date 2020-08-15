package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@TableName("consultation_info")
public class ConsultationInfo extends SubBaseBean implements Serializable {

    private Integer pk;

    private String domainId;

    private String uniqueId;

    private String xdsType;

    private String xdsVersion;

    private Date bloodDate;

    private String deptCode;

    private String doctorCode;

    private String consultationOpinion;

    private String cmiName;

    private String deptName;

    private String consultationName;

    private Date consultationDate;

    private String cmiCode;

    @Override
    public Integer getPk() {
        return pk;
    }

    @Override
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    @Override
    public String getDomainId() {
        return domainId;
    }

    @Override
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String getXdsType() {
        return xdsType;
    }

    @Override
    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    @Override
    public String getXdsVersion() {
        return xdsVersion;
    }

    @Override
    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    public Date getBloodDate() {
        return bloodDate;
    }

    public void setBloodDate(Date bloodDate) {
        this.bloodDate = bloodDate;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getConsultationOpinion() {
        return consultationOpinion;
    }

    public void setConsultationOpinion(String consultationOpinion) {
        this.consultationOpinion = consultationOpinion;
    }

    public String getCmiName() {
        return cmiName;
    }

    public void setCmiName(String cmiName) {
        this.cmiName = cmiName;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getConsultationName() {
        return consultationName;
    }

    public void setConsultationName(String consultationName) {
        this.consultationName = consultationName;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public String getCmiCode() {
        return cmiCode;
    }

    public void setCmiCode(String cmiCode) {
        this.cmiCode = cmiCode;
    }
}