package com.ylz.hf.monitor.vo.response;

import com.ylz.hf.monitor.daoDto.HfDocIndexDTO;

public class HfDocIndexResponse extends BaseResponse {
    private HfDocIndexDTO date;

    public HfDocIndexDTO getDate() {
        return date;
    }

    public void setDate(HfDocIndexDTO date) {
        this.date = date;
    }
}
