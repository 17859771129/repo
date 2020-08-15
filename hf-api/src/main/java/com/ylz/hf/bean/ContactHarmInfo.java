package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("contact_harm_info")
public class ContactHarmInfo extends SubBaseBean implements Serializable {

    private Integer pk;

    private String domainId;

    private String uniqueId;

    private String xdsType;

    private String xdsVersion;

    private String harmfulType;

    private String harmfulCode;

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

    public String getHarmfulType() {
        return harmfulType;
    }

    public void setHarmfulType(String harmfulType) {
        this.harmfulType = harmfulType;
    }

    public String getHarmfulCode() {
        return harmfulCode;
    }

    public void setHarmfulCode(String harmfulCode) {
        this.harmfulCode = harmfulCode;
    }
}