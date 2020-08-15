package com.ylz.common.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

public class SubBaseBean {
    @TableId(value = "pk", type = IdType.AUTO)
    private Integer pk;

    private String domainId;

    private String uniqueId;

    private String xdsType;

    private String xdsVersion;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    public String getXdsVersion() {
        return xdsVersion;
    }

    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }
}
