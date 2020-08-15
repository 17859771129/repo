package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@TableName("contact_info")
public class ContactInfo extends SubBaseBean implements Serializable {

    private Integer pk;

    private String domainId;

    private String uniqueId;

    private String xdsType;

    private String xdsVersion;


    private Date contactBirth;

    private String contactName;

    private String relationCcode;

    private String relationCname;


    private String relationTelecom;

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

    public Date getContactBirth() {
        return contactBirth;
    }

    public void setContactBirth(Date contactBirth) {
        this.contactBirth = contactBirth;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getRelationCcode() {
        return relationCcode;
    }

    public void setRelationCcode(String relationCcode) {
        this.relationCcode = relationCcode;
    }

    public String getRelationCname() {
        return relationCname;
    }

    public void setRelationCname(String relationCname) {
        this.relationCname = relationCname;
    }

    public String getRelationTelecom() {
        return relationTelecom;
    }

    public void setRelationTelecom(String relationTelecom) {
        this.relationTelecom = relationTelecom;
    }
}