package com.ylz.hf.monitor.service.imp;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.daoDto.HfDocLogDTO;
import com.ylz.hf.monitor.mapper.HfDocLogMapper;
import com.ylz.hf.monitor.mapper.HfDocMapper;
import com.ylz.hf.monitor.service.HfDocLogService;
import com.ylz.hf.monitor.vo.reuqest.HfDocLogRequestPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "hfDocLogService")
public class HfDocLogServiceImp implements HfDocLogService {
    private static final Logger log = LoggerFactory.getLogger(HfDocLogServiceImp.class);
    @Autowired
    private HfDocLogMapper hfDocLogMapper;

    @Autowired
    private HfDocMapper hfDocMapper;

    @Override
    public ResponseBean getHfDocLogPages(HfDocLogRequestPage hfDocLogRequestPage) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(hfDocLogRequestPage.getPageNum()) || StringUtils.isEmpty(hfDocLogRequestPage.getPageSize())) {
            log.error("共享文档分页查询参数有误");
            responseBean.setMessage("共享文档分页查询参数有误!");
            return responseBean;
        }
        try {
            HfDocLogDTO hfDocLogDTO = new HfDocLogDTO();
            if (!StringUtils.isEmpty(hfDocLogRequestPage.getEndCreateTime()) && !StringUtils.isEmpty(hfDocLogRequestPage.getStartCreateTime())) {
                hfDocLogDTO.setStartCreateTime(hfDocLogRequestPage.getStartCreateTime().replace("-","").replace(" ","").replace(":","").toString());
                hfDocLogDTO.setEndCreateTime(hfDocLogRequestPage.getEndCreateTime().replace("-","").replace(" ","").replace(":","").toString());
            }
            if (!StringUtils.isEmpty(hfDocLogRequestPage.getEndProcTime()) && !StringUtils.isEmpty(hfDocLogRequestPage.getStartProcTime())) {
                hfDocLogDTO.setStartProcTime(hfDocLogRequestPage.getStartProcTime());
                hfDocLogDTO.setEndProcTime(hfDocLogRequestPage.getEndProcTime());
            }
            if (!StringUtils.isEmpty(hfDocLogRequestPage.getDomainId())) {
                hfDocLogDTO.setDomainId(hfDocLogRequestPage.getDomainId());
            }
            if (!StringUtils.isEmpty(hfDocLogRequestPage.getXdsType())) {
                hfDocLogDTO.setXdsType(hfDocLogRequestPage.getXdsType());
            }
            Page page = new Page(Integer.valueOf(hfDocLogRequestPage.getPageNum()), Integer.valueOf(hfDocLogRequestPage.getPageSize()));
            log.info("共享文档分页查询 分页查询参数 hfDocLogDTO=[],page=[]", hfDocLogDTO, page);
            IPage<HfDocLogDTO> hfDocLogDTOIPage = hfDocLogMapper.getHfDocLogPages(page, hfDocLogDTO);
            int size=hfDocLogDTOIPage.getRecords().size();
            while(size>0 && hfDocLogDTOIPage.getRecords()!=null){
                size=size-1;
                hfDocLogDTOIPage.getRecords().get(size).setServiceType("文档服务注册");

            }
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setTotal((int) hfDocLogDTOIPage.getTotal());
            responseBean.setRows(hfDocLogDTOIPage.getRecords());
            log.info("共享文档分页查询结果 总数total["+responseBean.getTotal()+"]");
        } catch (Exception e) {
            log.error("共享文档查询失败" + e.getMessage());
            return new ResponseBean();
        }
        return responseBean;
    }




}
