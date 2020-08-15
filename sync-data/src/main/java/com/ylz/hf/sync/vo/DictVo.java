package com.ylz.hf.sync.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

@RootElement(path = "/DICT_ORGAN")
public class DictVo {

    @XMLObject(xpath = "./ITEM_VALUE", ntype = XMLObject.TEXT)
    private String itemName;
    @XMLObject(xpath = "./ITEM_CODE", ntype = XMLObject.TEXT)
    private String itemCode;
    @XMLObject(xpath = "./DOMAIN_ID", ntype = XMLObject.TEXT)
    private String domainId;
    @XMLObject(xpath = "./DICT_CODE", ntype = XMLObject.TEXT)
    private String dictCode;
    @XMLObject(xpath = "./DICT_NAME", ntype = XMLObject.TEXT)
    private String dictName;
    @XMLObject(xpath = "./DICT_VERSION", ntype = XMLObject.TEXT)
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
