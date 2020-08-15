package com.ylz.verify.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("verify_config_list")
public class VerifyConfigList {
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String mdhcCode;

    private String cdaType;

    private String tableName;

    private String columnName;

    private String columnNameAlias;

    private String cdaXpath;

    private String parentPath;

    private Integer isList;

    private String metaCode;

    private String inteMdname;

    private String inteMdcode;

    private String metaDict;

    private String mdhcName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMdhcCode() {
        return mdhcCode;
    }

    public void setMdhcCode(String mdhcCode) {
        this.mdhcCode = mdhcCode;
    }

    public String getCdaType() {
        return cdaType;
    }

    public void setCdaType(String cdaType) {
        this.cdaType = cdaType;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getColumnNameAlias() {
        return columnNameAlias;
    }

    public void setColumnNameAlias(String columnNameAlias) {
        this.columnNameAlias = columnNameAlias;
    }

    public String getCdaXpath() {
        return cdaXpath;
    }

    public void setCdaXpath(String cdaXpath) {
        this.cdaXpath = cdaXpath;
    }

    public String getParentPath() {
        return parentPath;
    }

    public void setParentPath(String parentPath) {
        this.parentPath = parentPath;
    }

    public Integer getIsList() {
        return isList;
    }

    public void setIsList(Integer isList) {
        this.isList = isList;
    }

    public String getMetaCode() {
        return metaCode;
    }

    public void setMetaCode(String metaCode) {
        this.metaCode = metaCode;
    }

    public String getInteMdname() {
        return inteMdname;
    }

    public void setInteMdname(String inteMdname) {
        this.inteMdname = inteMdname;
    }

    public String getInteMdcode() {
        return inteMdcode;
    }

    public void setInteMdcode(String inteMdcode) {
        this.inteMdcode = inteMdcode;
    }

    public String getMetaDict() {
        return metaDict;
    }

    public void setMetaDict(String metaDict) {
        this.metaDict = metaDict;
    }

    public String getMdhcName() {
        return mdhcName;
    }

    public void setMdhcName(String mdhcName) {
        this.mdhcName = mdhcName;
    }
}