package com.ylz.hf.monitor.daoDto;

import com.ylz.hf.monitor.bean.HfDocLog;

import java.util.Date;

public class HfDocLogDTO extends HfDocLog {


    private String serviceType = "文档服务注册";
    private String startCreateTime;
    private String endCreateTime;
    //    private Date startProcTime;
//    private Date endProcTime;
    private String startProcTime;
    private String endProcTime;
    private String docCn;

    public String getDocCn() {
        return docCn;
    }

    public void setDocCn(String docCn) {
        this.docCn = docCn;
    }


    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public String getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
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
}
