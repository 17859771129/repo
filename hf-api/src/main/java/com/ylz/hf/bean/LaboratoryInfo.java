package com.ylz.hf.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("laboratory_info")
public class LaboratoryInfo extends SubBaseBean implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.pk
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private Integer pk;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.domain_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String domainId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.unique_id
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String uniqueId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.xds_type
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String xdsType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.xds_version
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String xdsVersion;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.inspect_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String inspectCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.inspect_fixed_result
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String inspectFixedResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.inspect_item_code
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String inspectItemCode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.inspect_item_name
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String inspectItemName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.inspect_result
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String inspectResult;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column laboratory_info.inspect_unit
     *
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    private String inspectUnit;


    public Integer getPk() {
        return pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.pk
     *
     * @param pk the value for laboratory_info.pk
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.domain_id
     *
     * @return the value of laboratory_info.domain_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getDomainId() {
        return domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.domain_id
     *
     * @param domainId the value for laboratory_info.domain_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.unique_id
     *
     * @return the value of laboratory_info.unique_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getUniqueId() {
        return uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.unique_id
     *
     * @param uniqueId the value for laboratory_info.unique_id
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.xds_type
     *
     * @return the value of laboratory_info.xds_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getXdsType() {
        return xdsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.xds_type
     *
     * @param xdsType the value for laboratory_info.xds_type
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.xds_version
     *
     * @return the value of laboratory_info.xds_version
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getXdsVersion() {
        return xdsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.xds_version
     *
     * @param xdsVersion the value for laboratory_info.xds_version
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.inspect_code
     *
     * @return the value of laboratory_info.inspect_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getInspectCode() {
        return inspectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.inspect_code
     *
     * @param inspectCode the value for laboratory_info.inspect_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setInspectCode(String inspectCode) {
        this.inspectCode = inspectCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.inspect_fixed_result
     *
     * @return the value of laboratory_info.inspect_fixed_result
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getInspectFixedResult() {
        return inspectFixedResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.inspect_fixed_result
     *
     * @param inspectFixedResult the value for laboratory_info.inspect_fixed_result
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setInspectFixedResult(String inspectFixedResult) {
        this.inspectFixedResult = inspectFixedResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.inspect_item_code
     *
     * @return the value of laboratory_info.inspect_item_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getInspectItemCode() {
        return inspectItemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.inspect_item_code
     *
     * @param inspectItemCode the value for laboratory_info.inspect_item_code
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setInspectItemCode(String inspectItemCode) {
        this.inspectItemCode = inspectItemCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.inspect_item_name
     *
     * @return the value of laboratory_info.inspect_item_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getInspectItemName() {
        return inspectItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.inspect_item_name
     *
     * @param inspectItemName the value for laboratory_info.inspect_item_name
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setInspectItemName(String inspectItemName) {
        this.inspectItemName = inspectItemName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.inspect_result
     *
     * @return the value of laboratory_info.inspect_result
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getInspectResult() {
        return inspectResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.inspect_result
     *
     * @param inspectResult the value for laboratory_info.inspect_result
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setInspectResult(String inspectResult) {
        this.inspectResult = inspectResult;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column laboratory_info.inspect_unit
     *
     * @return the value of laboratory_info.inspect_unit
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public String getInspectUnit() {
        return inspectUnit;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column laboratory_info.inspect_unit
     *
     * @param inspectUnit the value for laboratory_info.inspect_unit
     * @mbggenerated Fri Apr 24 19:51:42 CST 2020
     */
    public void setInspectUnit(String inspectUnit) {
        this.inspectUnit = inspectUnit;
    }
}