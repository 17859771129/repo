package com.ylz.hf.monitor.controller;

import com.alibaba.druid.util.StringUtils;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.service.HfAccessLogService;
import com.ylz.hf.monitor.vo.reuqest.HfAccessLogRequest;
import com.ylz.hf.monitor.vo.reuqest.HfAccessLogRequestPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 *hf_access_log 调阅表
 *
 */
@RestController

@RequestMapping(value = "/hfaccesslog")

public class HfAccessLogController {
    private static final Logger log = LoggerFactory.getLogger(HfAccessLogController.class);
    @Autowired
    private HfAccessLogService hfAccessLogService;


    /**
     * 文档调阅
     */
        @RequestMapping(value = "/get/hfaccesslog/pagelist",  method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
        public @ResponseBody
        ResponseBean getHfDocLogPages(@RequestBody HfAccessLogRequestPage hfAccessLogRequestPage) {
            if(StringUtils.isEmpty(hfAccessLogRequestPage.getPageNum()) ||StringUtils.isEmpty(hfAccessLogRequestPage.getPageSize())){
                log.error("文档调阅分页查询入参数据hfDocLogRequestPage有误，请查看 pageNum或pageSize是否传值");
                return  new ResponseBean();
            }
            log.info("文档调阅服务分页查询入参数据hfAccessLogRequestPage={}", hfAccessLogRequestPage.toString());
            ResponseBean responseBean ;

            try {
                responseBean = hfAccessLogService.getHfAccessLogDTOListPage(hfAccessLogRequestPage);
            } catch (Exception e) {
                responseBean= new ResponseBean();
                log.error("文档调阅服务分页查询错误信息："+e.getMessage());
            }
            return responseBean;
        }




    //文档调阅平均时间
    @RequestMapping(value = "/get/hfaccesslog/avg/time", method = RequestMethod.GET)
    public @ResponseBody
    ResponseBean getHfDocLogAvgTimePages(
            @RequestParam(value = "procStatus", required = false) String procStatus,
            @RequestParam(value = "startReceiveTime", required = false) String startReceiveTime,
            @RequestParam(value = "endReceiveTime", required = false) String endReceiveTime) {
        HfAccessLogRequest hfAccessLogRequest = new HfAccessLogRequest();
        if (!StringUtils.isEmpty(procStatus) && !StringUtils.isEmpty(procStatus)) {
            hfAccessLogRequest.setProcStatus(procStatus);
        }
        if (!StringUtils.isEmpty(startReceiveTime) && !StringUtils.isEmpty(endReceiveTime)) {
            hfAccessLogRequest.setStartReceiveTime(startReceiveTime);
            hfAccessLogRequest.setEndReceiveTime(endReceiveTime);
        }

        log.info("文档调阅服务分页查询入参数据hfAccessLogRequestPage={}", hfAccessLogRequest.toString());
        ResponseBean responseBean;

        try {
            responseBean = hfAccessLogService.getHfDocLogAvgTime(hfAccessLogRequest);
        } catch (Exception e) {
            log.error("文档调阅平均时间分页查询有吴"+e.getMessage());
            responseBean=new ResponseBean();
        }
        return responseBean;
    }



}
