package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
@TableName("allergy_info")
public class AllergyInfo extends SubBaseBean implements Serializable {

    private Integer pk;


    private String domainId;


    private String uniqueId;


    private String xdsType;


    private String xdsVersion;


    private Date allergenDate;


    private String allergenCode;

    private String allergen;


    private Boolean allergyMark;


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

    public Date getAllergenDate() {
        return allergenDate;
    }

    public void setAllergenDate(Date allergenDate) {
        this.allergenDate = allergenDate;
    }

    public String getAllergenCode() {
        return allergenCode;
    }

    public void setAllergenCode(String allergenCode) {
        this.allergenCode = allergenCode;
    }

    public String getAllergen() {
        return allergen;
    }

    public void setAllergen(String allergen) {
        this.allergen = allergen;
    }

    public Boolean getAllergyMark() {
        return allergyMark;
    }

    public void setAllergyMark(Boolean allergyMark) {
        this.allergyMark = allergyMark;
    }
}