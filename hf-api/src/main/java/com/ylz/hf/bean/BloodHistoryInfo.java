package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("blood_history_info")
public class BloodHistoryInfo extends SubBaseBean implements Serializable {

    private Integer pk;

    private String domainId;

    private String uniqueId;

    private String xdsType;

    private String xdsVersion;

    private String bloodReason;

    private Boolean bloodMark;

    private Date bloodDate;

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

    public String getBloodReason() {
        return bloodReason;
    }

    public void setBloodReason(String bloodReason) {
        this.bloodReason = bloodReason;
    }

    public Boolean getBloodMark() {
        return bloodMark;
    }

    public void setBloodMark(Boolean bloodMark) {
        this.bloodMark = bloodMark;
    }

    public Date getBloodDate() {
        return bloodDate;
    }

    public void setBloodDate(Date bloodDate) {
        this.bloodDate = bloodDate;
    }
}