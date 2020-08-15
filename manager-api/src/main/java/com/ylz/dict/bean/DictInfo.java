package com.ylz.dict.bean;


import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("dict_info")
public class DictInfo implements Serializable {
    private static final long serialVersionUID = -5362314634702634628L;

    private String itemName;

    private String itemCode;

    private String domainId;

    private String dictCode;

    private String dictName;

    private String dictVersion;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCode() {
        return itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictName() {
        return dictName;
    }

    public void setDictName(String dictName) {
        this.dictName = dictName;
    }

    public String getDictVersion() {
        return dictVersion;
    }

    public void setDictVersion(String dictVersion) {
        this.dictVersion = dictVersion;
    }
}