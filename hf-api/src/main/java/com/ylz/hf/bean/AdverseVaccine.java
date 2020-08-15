package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("adverse_vaccine")
public class AdverseVaccine extends SubBaseBean implements Serializable {

    private String dubiousVaccineName;


    private String xdsVersion;


    private String domainId;


    private String uniqueId;

    private String dubiousVaccineCode;


    private String xdsType;


    private Integer pk;


    public String getDubiousVaccineName() {
        return dubiousVaccineName;
    }

    public void setDubiousVaccineName(String dubiousVaccineName) {
        this.dubiousVaccineName = dubiousVaccineName;
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

    public String getDubiousVaccineCode() {
        return dubiousVaccineCode;
    }

    public void setDubiousVaccineCode(String dubiousVaccineCode) {
        this.dubiousVaccineCode = dubiousVaccineCode;
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
    public Integer getPk() {
        return pk;
    }

    @Override
    public void setPk(Integer pk) {
        this.pk = pk;
    }
}