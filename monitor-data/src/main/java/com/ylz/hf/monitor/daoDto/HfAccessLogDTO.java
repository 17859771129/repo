package com.ylz.hf.monitor.daoDto;

import com.ylz.hf.monitor.bean.HfAccessLog;


public class HfAccessLogDTO extends HfAccessLog {


    private String serviceType = "文档调阅服务";

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = "文档调阅服务";
    }
    private String avgTime;
    private String timeToSec;
    private int countNumber;
    private String startReceiveTime;
    private String endReceiveTime;
    private String receiveDomainId;
    private String  sendDomainId;

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    private String xdsType;
    public String getReceiveDomainId() {
        return receiveDomainId;
    }

    public void setReceiveDomainId(String receiveDomainId) {
        this.receiveDomainId = receiveDomainId;
    }

    public String getSendDomainId() {
        return sendDomainId;
    }

    public void setSendDomainId(String sendDomainId) {
        this.sendDomainId = sendDomainId;
    }

    public String getAvgTime() {
        return avgTime;
    }

    public void setAvgTime(String avgTime) {
        this.avgTime = avgTime;
    }
    public String getTimeToSec() {
        return timeToSec;
    }

    public void setTimeToSec(String timeToSec) {
        this.timeToSec = timeToSec;
    }

    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    public String getStartReceiveTime() {
        return startReceiveTime;
    }

    public void setStartReceiveTime(String startReceiveTime) {
        this.startReceiveTime = startReceiveTime;
    }

    public String getEndReceiveTime() {
        return endReceiveTime;
    }

    public void setEndReceiveTime(String endReceiveTime) {
        this.endReceiveTime = endReceiveTime;
    }


    @Override
    public String toString() {
        return "HfAccessLogDTO{" +
                "serviceType='" + serviceType + '\'' +
                ", avgTime='" + avgTime + '\'' +
                ", timeToSec='" + timeToSec + '\'' +
                ", countNumber=" + countNumber +
                ", startReceiveTime='" + startReceiveTime + '\'' +
                ", endReceiveTime='" + endReceiveTime + '\'' +
                ", receiveDomainId='" + receiveDomainId + '\'' +
                ", sendDomainId='" + sendDomainId + '\'' +
                ", xdsType='" + xdsType + '\'' +
                '}';
    }
}
