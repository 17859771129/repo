package com.ylz.hf.monitor.vo.response;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ylz.hf.monitor.daoDto.HfDocLogDTO;

public class HfDocLogResponsePage extends BaseResponse {
    private IPage<HfDocLogDTO> hfDocLogDTOIPage;

    public IPage<HfDocLogDTO> getHfDocLogDTOIPage() {
        return hfDocLogDTOIPage;
    }

    public void setHfDocLogDTOIPage(IPage<HfDocLogDTO> hfDocLogDTOIPage) {
        this.hfDocLogDTOIPage = hfDocLogDTOIPage;
    }
}
