package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("death_info")
public class DeathInfo extends SubBaseBean implements Serializable {

    private Integer pk;


    private String domainId;

    private String uniqueId;

    private String xdsType;

    private String xdsVersion;

    private String deathName;

    private String deathCode;

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

    public String getDeathName() {
        return deathName;
    }

    public void setDeathName(String deathName) {
        this.deathName = deathName;
    }

    public String getDeathCode() {
        return deathCode;
    }

    public void setDeathCode(String deathCode) {
        this.deathCode = deathCode;
    }
}