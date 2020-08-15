package com.ylz.hf.write.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

@RootElement(path = "/GetDocumentStroedInfoRequest")
public class HfRetrieve {

    @XMLObject(xpath = "./Id/@extension", ntype = XMLObject.ATTRIBUTE)
    private String messageId;
    @XMLObject(xpath = "./Id/@root", ntype = XMLObject.ATTRIBUTE)
    private String domainId;
    @XMLObject(xpath = "./HealthCardId", ntype = XMLObject.TEXT)
    private String healthCard;
    @XMLObject(xpath = "./IdentityId", ntype = XMLObject.TEXT)
    private String identityId;
    @XMLObject(xpath = "./DocumentTitle", ntype = XMLObject.TEXT)
    private String title;

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

    public String getHealthCard() {
        return healthCard;
    }

    public void setHealthCard(String healthCard) {
        this.healthCard = healthCard;
    }

    public String getIdentityId() {
        return identityId;
    }

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
