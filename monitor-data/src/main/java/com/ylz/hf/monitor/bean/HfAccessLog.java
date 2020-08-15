package com.ylz.hf.monitor.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/*
 *  调阅表
 */
@TableName("hf_access_log")
public class HfAccessLog {
    private int id;
    private String messageId;//消息ID
    private String domainId;//上传域ID
    private String uniqueId;//文档ID
    private String repositoryUniqueUd;//唯一ID
    private String procStatus;//	状态
    private Date procTime;// datetime数据插入时间
    private String errorInfo;//	错误信息
    private String filePath;//	文档路径
    private Date   receiveTime;//发送时间
    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getRepositoryUniqueUd() {
        return repositoryUniqueUd;
    }

    public void setRepositoryUniqueUd(String repositoryUniqueUd) {
        this.repositoryUniqueUd = repositoryUniqueUd;
    }

    public String getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(String procStatus) {
        this.procStatus = procStatus;
    }

    public Date getProcTime() {
        return procTime;
    }

    public void setProcTime(Date procTime) {
        this.procTime = procTime;
    }

    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
