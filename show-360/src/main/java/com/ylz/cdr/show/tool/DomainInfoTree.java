package com.ylz.cdr.show.tool;

import java.util.ArrayList;
import java.util.List;

public class DomainInfoTree {
    private String domainId;

    private String domainName;

    private String parentDomainId;

    private String domainType;

    private List<DomainInfoTree> children = new ArrayList<DomainInfoTree>();

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

    public List<DomainInfoTree> getChildren() {
        return children;
    }

    public void setChildren(List<DomainInfoTree> children) {
        this.children = children;
    }
}
