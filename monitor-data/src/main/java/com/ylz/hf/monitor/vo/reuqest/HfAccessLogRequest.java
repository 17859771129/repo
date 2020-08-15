package com.ylz.hf.monitor.vo.reuqest;


public class HfAccessLogRequest extends BaseRequest {
    private static final long serialVersionUID = -3518052268701541168L;
    private String procStatus;
    private String startReceiveTime;
    private String endReceiveTime;

    public String getProcStatus() {
        return procStatus;
    }

    public void setProcStatus(String procStatus) {
        this.procStatus = procStatus;
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

}
