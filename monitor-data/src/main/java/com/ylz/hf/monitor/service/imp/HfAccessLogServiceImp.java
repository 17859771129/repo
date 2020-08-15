package com.ylz.hf.monitor.service.imp;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.daoDto.HfAccessLogDTO;
import com.ylz.hf.monitor.mapper.HfAccessLogMapper;
import com.ylz.hf.monitor.service.HfAccessLogService;
import com.ylz.hf.monitor.vo.reuqest.HfAccessLogRequest;
import com.ylz.hf.monitor.vo.reuqest.HfAccessLogRequestPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "hfAccessLogService")
public class HfAccessLogServiceImp implements HfAccessLogService {
    private static final Logger log = LoggerFactory.getLogger(HfAccessLogServiceImp.class);
    @Autowired
    private HfAccessLogMapper hfAccessLogMapper;

    private final String servicePro = "文档调阅服务查询";

    @Override
    public ResponseBean getHfAccessLogDTOListPage(HfAccessLogRequestPage hfAccessLogRequestPage) {
        ResponseBean responseBean = new ResponseBean();
        try {
            HfAccessLogDTO hfAccessLogDTO = getHfAccessLogDTO(hfAccessLogRequestPage);
            Page page = new Page(Integer.valueOf(hfAccessLogRequestPage.getPageNum()), Integer.valueOf(hfAccessLogRequestPage.getPageSize()));

            IPage<HfAccessLogDTO> hfAccessLogDTOIPage = hfAccessLogMapper.getHfAccessLogDTOListPage(page, hfAccessLogDTO);
            HfAccessLogDTO dts=hfAccessLogMapper.getHfDocLogAvgTime(hfAccessLogDTO);
            if(dts==null){
                log.error("文档调阅服务查询平均耗时查询失败;");
                return new ResponseBean();
                //return responseBean;
            }

            int size=hfAccessLogDTOIPage.getRecords().size();
            while(size>0 && hfAccessLogDTOIPage.getRecords()!=null){
                size=size-1;
                hfAccessLogDTOIPage.getRecords().get(size).setServiceType("文档服务注册");
                hfAccessLogDTOIPage.getRecords().get(size).setAvgTime(dts.getAvgTime()!=null?dts.getAvgTime():"");
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setRows(hfAccessLogDTOIPage.getRecords());
            responseBean.setTotal((int)hfAccessLogDTOIPage.getTotal());
            log.info("文档调阅分页查询结果 总数total["+responseBean.getTotal()+"]Records=["+responseBean.getRows()+"]]Records=["+responseBean.getRows()+"]");
        } catch (Exception e) {
            log.error("文档调阅查询失败" + e.getMessage());
            responseBean.setMessage("文档调阅查询失败！！！！");
        }

        return responseBean;
    }


    private HfAccessLogDTO getHfAccessLogDTO(HfAccessLogRequestPage hfAccessLogRequestPage) {
        HfAccessLogDTO hfAccessLogDTO = new HfAccessLogDTO();
        if (!StringUtils.isEmpty(hfAccessLogRequestPage.getProcStatus())) {
            hfAccessLogDTO.setProcStatus(hfAccessLogRequestPage.getProcStatus());
        }
        if (!StringUtils.isEmpty(hfAccessLogRequestPage.getStartReceiveTime()) && !StringUtils.isEmpty(hfAccessLogRequestPage.getEndReceiveTime())) {
            hfAccessLogDTO.setStartReceiveTime(hfAccessLogRequestPage.getStartReceiveTime());
            hfAccessLogDTO.setEndReceiveTime(hfAccessLogRequestPage.getEndReceiveTime());
        }
        return hfAccessLogDTO;
    }


    private HfAccessLogDTO getHfAccessLogDTORequest(HfAccessLogRequest HfAccessLogRequest) {
        HfAccessLogDTO hfAccessLogDTO = new HfAccessLogDTO();
        if (!StringUtils.isEmpty(HfAccessLogRequest.getProcStatus())) {
            hfAccessLogDTO.setProcStatus(HfAccessLogRequest.getProcStatus());
        }
        if (!StringUtils.isEmpty(HfAccessLogRequest.getStartReceiveTime()) && !StringUtils.isEmpty(HfAccessLogRequest.getEndReceiveTime())) {
            hfAccessLogDTO.setStartReceiveTime(HfAccessLogRequest.getStartReceiveTime());
            hfAccessLogDTO.setEndReceiveTime(HfAccessLogRequest.getEndReceiveTime());
        }
        return hfAccessLogDTO;
    }


    //共享文档平均时间
    public ResponseBean getHfDocLogAvgTime(HfAccessLogRequest HfAccessLogRequest) {

        ResponseBean responseBean = new ResponseBean();
        try {
            HfAccessLogDTO hfAccessLogDTO = getHfAccessLogDTORequest(HfAccessLogRequest);
            HfAccessLogDTO dto= hfAccessLogMapper.getHfDocLogAvgTime(hfAccessLogDTO);
            log.info(servicePro + "分页查询结果 dto=[]", dto);
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setObject(dto);
        } catch (Exception e) {
            log.error("共享文档查询失败" + e.getMessage());
            responseBean.setMessage("共享文档查询失败!");
        }
        return responseBean;
    }

}
