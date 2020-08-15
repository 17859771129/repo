package com.ylz.cdr.write.vo;

import com.xmltool.RootElement;
import com.xmltool.XMLObject;

import java.io.Serializable;

@RootElement(path = "/MCCI_IN000002UV01")
public class XdsReturn implements Serializable {

    private static final long serialVersionUID = 7130780415815029895L;
    @XMLObject(xpath = "./id/@extension", ntype = XMLObject.ATTRIBUTE)
    private String messageId;
    @XMLObject(xpath = "./creationTime/@value", ntype = XMLObject.ATTRIBUTE)
    private String messageCreateTime;
    @XMLObject(xpath = "./acknowledgement/@typeCode", ntype = XMLObject.ATTRIBUTE)
    private String result;
    @XMLObject(xpath = "./acknowledgement/targetMessage/id/@extension", ntype = XMLObject.ATTRIBUTE)
    private String requestId;
    @XMLObject(xpath = "./acknowledgement/acknowledgementDetail/text/@value", ntype = XMLObject.ATTRIBUTE)
    private String resultDesc;

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getMessageCreateTime() {
        return messageCreateTime;
    }

    public void setMessageCreateTime(String messageCreateTime) {
        this.messageCreateTime = messageCreateTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }
}
