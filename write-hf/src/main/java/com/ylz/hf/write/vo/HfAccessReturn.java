package com.ylz.hf.write.vo;

public class HfAccessReturn {

    private String status;
    private String senderId;
    private String senderDomainId;
    private String receiveId;
    private String receiveDomainId;
    private String repositoryUniqueId;
    private String uniqueId;
    private String content;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSenderId() {
        return senderId;
    }

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    public String getSenderDomainId() {
        return senderDomainId;
    }

    public void setSenderDomainId(String senderDomainId) {
        this.senderDomainId = senderDomainId;
    }

    public String getReceiveId() {
        return receiveId;
    }

    public void setReceiveId(String receiveId) {
        this.receiveId = receiveId;
    }

    public String getReceiveDomainId() {
        return receiveDomainId;
    }

    public void setReceiveDomainId(String receiveDomainId) {
        this.receiveDomainId = receiveDomainId;
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
