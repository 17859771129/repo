package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("symptom_info")
public class SymptomInfo extends SubBaseBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.pk
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private Integer pk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.domain_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String domainId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.unique_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String uniqueId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.xds_type
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String xdsType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.xds_version
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String xdsVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.onset_date
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private Date onsetDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.symptom_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String symptomCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.symptom_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String symptomName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column symptom_info.symptom_time
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String symptomTime;


    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.pk
     *
     * @param pk the value for symptom_info.pk
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom_info.domain_id
     *
     * @return the value of symptom_info.domain_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.domain_id
     *
     * @param domainId the value for symptom_info.domain_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom_info.unique_id
     *
     * @return the value of symptom_info.unique_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.unique_id
     *
     * @param uniqueId the value for symptom_info.unique_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom_info.xds_type
     *
     * @return the value of symptom_info.xds_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getXdsType() {
        return xdsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.xds_type
     *
     * @param xdsType the value for symptom_info.xds_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom_info.xds_version
     *
     * @return the value of symptom_info.xds_version
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getXdsVersion() {
        return xdsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.xds_version
     *
     * @param xdsVersion the value for symptom_info.xds_version
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom_info.onset_date
     *
     * @return the value of symptom_info.onset_date
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public Date getOnsetDate() {
        return onsetDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.onset_date
     *
     * @param onsetDate the value for symptom_info.onset_date
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setOnsetDate(Date onsetDate) {
        this.onsetDate = onsetDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom_info.symptom_code
     *
     * @return the value of symptom_info.symptom_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getSymptomCode() {
        return symptomCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.symptom_code
     *
     * @param symptomCode the value for symptom_info.symptom_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setSymptomCode(String symptomCode) {
        this.symptomCode = symptomCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom_info.symptom_name
     *
     * @return the value of symptom_info.symptom_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getSymptomName() {
        return symptomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.symptom_name
     *
     * @param symptomName the value for symptom_info.symptom_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setSymptomName(String symptomName) {
        this.symptomName = symptomName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column symptom_info.symptom_time
     *
     * @return the value of symptom_info.symptom_time
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getSymptomTime() {
        return symptomTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column symptom_info.symptom_time
     *
     * @param symptomTime the value for symptom_info.symptom_time
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setSymptomTime(String symptomTime) {
        this.symptomTime = symptomTime;
    }
}