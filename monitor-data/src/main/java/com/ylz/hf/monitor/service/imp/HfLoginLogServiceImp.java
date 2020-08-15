package com.ylz.hf.monitor.service.imp;

import com.ylz.cdr.common.Constants;
import com.ylz.hf.monitor.daoDto.HfLoginLogDTO;
import com.ylz.hf.monitor.mapper.HfLoginLogMapper;
import com.ylz.hf.monitor.service.HfLoginLogService;
import com.ylz.hf.monitor.vo.response.HfDocResponse;
import com.ylz.hf.monitor.vo.reuqest.HfDocRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "hfLoginLogService")
public class HfLoginLogServiceImp implements HfLoginLogService {
    private static final Logger log = LoggerFactory.getLogger(HfLoginLogServiceImp.class);
    @Autowired
    private HfLoginLogMapper hfLoginLogMapper;

    //电子病历健康档案 浏览人次
    @Override
    public HfDocResponse getCountDocCategoriesByType(HfDocRequest hfDocRequest) {
        HfDocResponse hfLoginLogResponse = new HfDocResponse();
        hfLoginLogResponse.setMessage("查询成功!!!");
        HfLoginLogDTO hfLoginLogDTO = new HfLoginLogDTO();
        try {
            hfLoginLogDTO.setType(hfDocRequest.getDocCategory());
            if (hfDocRequest.getStartProcTime() != null && hfDocRequest.getEndProcTime() != null) {
                hfLoginLogDTO.setStartProcTime(hfDocRequest.getStartProcTime());
                hfLoginLogDTO.setEndProcTime(hfDocRequest.getEndProcTime());
            }
            HfLoginLogDTO dto = hfLoginLogMapper.getCountDocCategoriesByType(hfLoginLogDTO);
            log.info("电子病历健康档案浏览人次查询结果hfDocDTO={}", dto);
            hfLoginLogResponse.setCode(Constants.SUCCESS_CODE);
            hfLoginLogResponse.setCountNumber(dto != null ? dto.getCountNumber() : 0);
        } catch (Exception e) {
            log.error("电子病历健康档案,浏览人次查询有误" + e.getMessage());
            hfLoginLogResponse.setMessage("查询失败!!!");
        }
        return hfLoginLogResponse;
    }
}
