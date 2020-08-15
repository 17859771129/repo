package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;
@Data
@TableName("family_history_info")
public class FamilyHistoryInfo extends SubBaseBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.category_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String categoryCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.category_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String categoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.disease_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String diseaseCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.disease_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String diseaseName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.domain_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String domainId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.pk
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private Integer pk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.relation_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String relationCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.relation_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String relationName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.sex
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.sex_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String sexCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.type_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String typeCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.type_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String typeName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.unique_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String uniqueId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.xds_type
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String xdsType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column family_history_info.xds_version
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String xdsVersion;


    public String getCategoryCode() {
        return categoryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.category_code
     *
     * @param categoryCode the value for family_history_info.category_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.category_name
     *
     * @return the value of family_history_info.category_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.category_name
     *
     * @param categoryName the value for family_history_info.category_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.disease_code
     *
     * @return the value of family_history_info.disease_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDiseaseCode() {
        return diseaseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.disease_code
     *
     * @param diseaseCode the value for family_history_info.disease_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDiseaseCode(String diseaseCode) {
        this.diseaseCode = diseaseCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.disease_name
     *
     * @return the value of family_history_info.disease_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDiseaseName() {
        return diseaseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.disease_name
     *
     * @param diseaseName the value for family_history_info.disease_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.domain_id
     *
     * @return the value of family_history_info.domain_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.domain_id
     *
     * @param domainId the value for family_history_info.domain_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.pk
     *
     * @return the value of family_history_info.pk
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.pk
     *
     * @param pk the value for family_history_info.pk
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.relation_code
     *
     * @return the value of family_history_info.relation_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getRelationCode() {
        return relationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.relation_code
     *
     * @param relationCode the value for family_history_info.relation_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setRelationCode(String relationCode) {
        this.relationCode = relationCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.relation_name
     *
     * @return the value of family_history_info.relation_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getRelationName() {
        return relationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.relation_name
     *
     * @param relationName the value for family_history_info.relation_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.sex
     *
     * @return the value of family_history_info.sex
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.sex
     *
     * @param sex the value for family_history_info.sex
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.sex_code
     *
     * @return the value of family_history_info.sex_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getSexCode() {
        return sexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.sex_code
     *
     * @param sexCode the value for family_history_info.sex_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setSexCode(String sexCode) {
        this.sexCode = sexCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.type_code
     *
     * @return the value of family_history_info.type_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getTypeCode() {
        return typeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.type_code
     *
     * @param typeCode the value for family_history_info.type_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.type_name
     *
     * @return the value of family_history_info.type_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.type_name
     *
     * @param typeName the value for family_history_info.type_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.unique_id
     *
     * @return the value of family_history_info.unique_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.unique_id
     *
     * @param uniqueId the value for family_history_info.unique_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.xds_type
     *
     * @return the value of family_history_info.xds_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getXdsType() {
        return xdsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.xds_type
     *
     * @param xdsType the value for family_history_info.xds_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column family_history_info.xds_version
     *
     * @return the value of family_history_info.xds_version
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getXdsVersion() {
        return xdsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column family_history_info.xds_version
     *
     * @param xdsVersion the value for family_history_info.xds_version
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }
}