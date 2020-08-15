package com.ylz.hf.sync.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

@RootElement(path = "/DOMAIN_ID")
public class DomainVo {

    @XMLObject(xpath = "./DOMAIN_ID", ntype = XMLObject.TEXT)
    private String domainId;

    @XMLObject(xpath = "./DOMAIN_DESC", ntype = XMLObject.TEXT)
    private String domainName;


    @XMLObject(xpath = "./PARENT_DOMAIN_ID", ntype = XMLObject.TEXT)
    private String parentDomainId;

    @XMLObject(xpath = "./DOMAIN_TYPE", ntype = XMLObject.TEXT)
    private String domainType;

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getParentDomainId() {
        return parentDomainId;
    }

    public void setParentDomainId(String parentDomainId) {
        this.parentDomainId = parentDomainId;
    }

    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }
}
