package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_DIAG")
public class TdyListDiag extends SubBaseBean implements Serializable {
    private Integer pk;

    private String uniqueId;

    private String domainId;

    private String xdsVersion;

    private String xdsType;

    private String empi;

    private String encounterId;

    private String diagCode;

    private String diagName;

    private String diagType;

    @Override
    public Integer getPk() {
        return pk;
    }

    @Override
    public void setPk(Integer pk) {
        this.pk = pk;
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
    public String getDomainId() {
        return domainId;
    }

    @Override
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public String getXdsVersion() {
        return xdsVersion;
    }

    @Override
    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    @Override
    public String getXdsType() {
        return xdsType;
    }

    @Override
    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi;
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    public String getDiagCode() {
        return diagCode;
    }

    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    public String getDiagName() {
        return diagName;
    }

    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    public String getDiagType() {
        return diagType;
    }

    public void setDiagType(String diagType) {
        this.diagType = diagType;
    }
}
