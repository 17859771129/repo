package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("drug_info")
public class DrugInfo extends SubBaseBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.pk
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private Integer pk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.domain_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String domainId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.unique_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String uniqueId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.xds_type
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String xdsType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.xds_version
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String xdsVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.dosage_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String dosageCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.dosage_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String dosageName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.dose_unit
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String doseUnit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String drugCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_days
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String drugDays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_desc
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String drugDesc;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_dose
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private Float drugDose;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_mark
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private Boolean drugMark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String drugName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_total
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String drugTotal;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_type
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String drugType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.drug_ways
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String drugWays;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.frequency_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String frequencyCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.frequency_unit
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String frequencyUnit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.obey_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String obeyCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.obey_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String obeyName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.stop_date
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private Date stopDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.total_unit
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String totalUnit;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column drug_info.ways_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String waysCode;


    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.pk
     *
     * @param pk the value for drug_info.pk
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.domain_id
     *
     * @return the value of drug_info.domain_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.domain_id
     *
     * @param domainId the value for drug_info.domain_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.unique_id
     *
     * @return the value of drug_info.unique_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.unique_id
     *
     * @param uniqueId the value for drug_info.unique_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.xds_type
     *
     * @return the value of drug_info.xds_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getXdsType() {
        return xdsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.xds_type
     *
     * @param xdsType the value for drug_info.xds_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.xds_version
     *
     * @return the value of drug_info.xds_version
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getXdsVersion() {
        return xdsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.xds_version
     *
     * @param xdsVersion the value for drug_info.xds_version
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.dosage_code
     *
     * @return the value of drug_info.dosage_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDosageCode() {
        return dosageCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.dosage_code
     *
     * @param dosageCode the value for drug_info.dosage_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDosageCode(String dosageCode) {
        this.dosageCode = dosageCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.dosage_name
     *
     * @return the value of drug_info.dosage_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDosageName() {
        return dosageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.dosage_name
     *
     * @param dosageName the value for drug_info.dosage_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDosageName(String dosageName) {
        this.dosageName = dosageName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.dose_unit
     *
     * @return the value of drug_info.dose_unit
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDoseUnit() {
        return doseUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.dose_unit
     *
     * @param doseUnit the value for drug_info.dose_unit
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDoseUnit(String doseUnit) {
        this.doseUnit = doseUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_code
     *
     * @return the value of drug_info.drug_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_code
     *
     * @param drugCode the value for drug_info.drug_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_days
     *
     * @return the value of drug_info.drug_days
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDrugDays() {
        return drugDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_days
     *
     * @param drugDays the value for drug_info.drug_days
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugDays(String drugDays) {
        this.drugDays = drugDays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_desc
     *
     * @return the value of drug_info.drug_desc
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDrugDesc() {
        return drugDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_desc
     *
     * @param drugDesc the value for drug_info.drug_desc
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugDesc(String drugDesc) {
        this.drugDesc = drugDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_dose
     *
     * @return the value of drug_info.drug_dose
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public Float getDrugDose() {
        return drugDose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_dose
     *
     * @param drugDose the value for drug_info.drug_dose
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugDose(Float drugDose) {
        this.drugDose = drugDose;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_mark
     *
     * @return the value of drug_info.drug_mark
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public Boolean getDrugMark() {
        return drugMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_mark
     *
     * @param drugMark the value for drug_info.drug_mark
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugMark(Boolean drugMark) {
        this.drugMark = drugMark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_name
     *
     * @return the value of drug_info.drug_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_name
     *
     * @param drugName the value for drug_info.drug_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_total
     *
     * @return the value of drug_info.drug_total
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDrugTotal() {
        return drugTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_total
     *
     * @param drugTotal the value for drug_info.drug_total
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugTotal(String drugTotal) {
        this.drugTotal = drugTotal;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_type
     *
     * @return the value of drug_info.drug_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDrugType() {
        return drugType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_type
     *
     * @param drugType the value for drug_info.drug_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugType(String drugType) {
        this.drugType = drugType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.drug_ways
     *
     * @return the value of drug_info.drug_ways
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDrugWays() {
        return drugWays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.drug_ways
     *
     * @param drugWays the value for drug_info.drug_ways
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDrugWays(String drugWays) {
        this.drugWays = drugWays;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.frequency_code
     *
     * @return the value of drug_info.frequency_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getFrequencyCode() {
        return frequencyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.frequency_code
     *
     * @param frequencyCode the value for drug_info.frequency_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setFrequencyCode(String frequencyCode) {
        this.frequencyCode = frequencyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.frequency_unit
     *
     * @return the value of drug_info.frequency_unit
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getFrequencyUnit() {
        return frequencyUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.frequency_unit
     *
     * @param frequencyUnit the value for drug_info.frequency_unit
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setFrequencyUnit(String frequencyUnit) {
        this.frequencyUnit = frequencyUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.obey_code
     *
     * @return the value of drug_info.obey_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getObeyCode() {
        return obeyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.obey_code
     *
     * @param obeyCode the value for drug_info.obey_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setObeyCode(String obeyCode) {
        this.obeyCode = obeyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.obey_name
     *
     * @return the value of drug_info.obey_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getObeyName() {
        return obeyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.obey_name
     *
     * @param obeyName the value for drug_info.obey_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setObeyName(String obeyName) {
        this.obeyName = obeyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.stop_date
     *
     * @return the value of drug_info.stop_date
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public Date getStopDate() {
        return stopDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.stop_date
     *
     * @param stopDate the value for drug_info.stop_date
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setStopDate(Date stopDate) {
        this.stopDate = stopDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.total_unit
     *
     * @return the value of drug_info.total_unit
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getTotalUnit() {
        return totalUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.total_unit
     *
     * @param totalUnit the value for drug_info.total_unit
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setTotalUnit(String totalUnit) {
        this.totalUnit = totalUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column drug_info.ways_code
     *
     * @return the value of drug_info.ways_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getWaysCode() {
        return waysCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column drug_info.ways_code
     *
     * @param waysCode the value for drug_info.ways_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setWaysCode(String waysCode) {
        this.waysCode = waysCode;
    }
}