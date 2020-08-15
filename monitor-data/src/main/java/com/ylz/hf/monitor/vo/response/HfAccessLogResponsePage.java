package com.ylz.hf.monitor.vo.response;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ylz.hf.monitor.daoDto.HfAccessLogDTO;


public class HfAccessLogResponsePage extends BaseResponse {
    private IPage<HfAccessLogDTO> hfAccessLogDTOIPage;

    public IPage<HfAccessLogDTO> getHfAccessLogDTOIPage() {
        return hfAccessLogDTOIPage;
    }

    public void setHfAccessLogDTOIPage(IPage<HfAccessLogDTO> hfAccessLogDTOIPage) {
        this.hfAccessLogDTOIPage = hfAccessLogDTOIPage;
    }
}
