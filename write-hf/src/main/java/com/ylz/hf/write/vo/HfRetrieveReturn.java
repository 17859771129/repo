package com.ylz.hf.write.vo;

import java.util.ArrayList;
import java.util.List;

public class HfRetrieveReturn {

    private String status;
    private String senderId;
    private String senderDomainId;
    private String receiveId;
    private String receiveDomainId;
    private String detail;
    private List<HfDocIndexRetrun> list = new ArrayList<>();

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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public List<HfDocIndexRetrun> getList() {
        return list;
    }

    public void setList(List<HfDocIndexRetrun> list) {
        this.list = list;
    }
}
