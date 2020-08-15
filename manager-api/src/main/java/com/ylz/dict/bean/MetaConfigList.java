package com.ylz.dict.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("meta_config_list")
public class MetaConfigList {
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

    private Integer isPdf;

    private Integer isImage;

    private String metaCode;

    private String inteMdname;

    private String inteMdcode;

    private String metaDict;

    private String isFill;

    private String parentFill;

    private String lenColumn;

    private String relationColumnNameAlias;

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

    public Integer getIsPdf() {
        return isPdf;
    }

    public void setIsPdf(Integer isPdf) {
        this.isPdf = isPdf;
    }

    public Integer getIsImage() {
        return isImage;
    }

    public void setIsImage(Integer isImage) {
        this.isImage = isImage;
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

    public String getIsFill() {
        return isFill;
    }

    public void setIsFill(String isFill) {
        this.isFill = isFill;
    }

    public String getParentFill() {
        return parentFill;
    }

    public void setParentFill(String parentFill) {
        this.parentFill = parentFill;
    }

    public String getLenColumn() {
        return lenColumn;
    }

    public void setLenColumn(String lenColumn) {
        this.lenColumn = lenColumn;
    }

    public String getRelationColumnNameAlias() {
        return relationColumnNameAlias;
    }

    public void setRelationColumnNameAlias(String relationColumnNameAlias) {
        this.relationColumnNameAlias = relationColumnNameAlias;
    }
}