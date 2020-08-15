package com.ylz.hf.monitor.daoDto;

import com.ylz.hf.monitor.bean.HfDoc;


import java.util.Date;

public class HfDocDTO extends HfDoc {
    private int countNumber;
    private String startProcTime;
    private String endProcTime;

    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
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
