package com.ylz.hf.write.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

@RootElement(path = "/RetrieveDocumentSetRequest")
public class HfAccess {

    @XMLObject(xpath = "./ID/@extension", ntype = XMLObject.ATTRIBUTE)
    private String messageId;
    @XMLObject(xpath = "./ID/@root", ntype = XMLObject.ATTRIBUTE)
    private String domainId;
    @XMLObject(xpath = "./DocumentRequest/RepositoryUniqueId", ntype = XMLObject.TEXT)
    private String repositoryUniqueId;
    @XMLObject(xpath = "./DocumentRequest/DocumentUniqueId", ntype = XMLObject.TEXT)
    private String uniqueId;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getRepositoryUniqueId() {
        return repositoryUniqueId;
    }

    public void setRepositoryUniqueId(String repositoryUniqueId) {
        this.repositoryUniqueId = repositoryUniqueId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }
}
