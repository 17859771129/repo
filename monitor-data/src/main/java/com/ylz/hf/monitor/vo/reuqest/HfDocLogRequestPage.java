package com.ylz.hf.monitor.vo.reuqest;


public class HfDocLogRequestPage extends BaseRequestPage {
    private String endCreateTime;
    private String startCreateTime;
    private String startProcTime;
    private String endProcTime;
    private String domainId;
    private String xdsType;

    public String getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public String getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public String getStartProcTime() {
        return startProcTime;
    }

    public void setStartProcTime(String startProcTime) {
        this.startProcTime = startProcTime;
    }

    public String getEndProcTime() {
        return endProcTime;
    }

    public void setEndProcTime(String endProcTime) {
        this.endProcTime = endProcTime;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public String getXdsType() {
        return xdsType;
    }

    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    @Override
    public String toString() {
        return "HfDocLogRequestPage{" +
                "endCreateTime='" + endCreateTime + '\'' +
                ", startCreateTime='" + startCreateTime + '\'' +
                ", startProcTime='" + startProcTime + '\'' +
                ", endProcTime='" + endProcTime + '\'' +
                ", domainId='" + domainId + '\'' +
                ", xdsType='" + xdsType + '\'' +
                '}';
    }
}
