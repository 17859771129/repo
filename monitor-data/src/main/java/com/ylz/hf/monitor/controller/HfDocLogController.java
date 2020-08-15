package com.ylz.hf.monitor.controller;

import com.alibaba.druid.util.StringUtils;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.service.HfDocLogService;
import com.ylz.hf.monitor.vo.reuqest.HfDocLogRequestPage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * 共享文档
 */
@RestController
@RequestMapping(value = "/hfdoclog")
public class HfDocLogController {
    private static final Logger log = LoggerFactory.getLogger(HfDocLogController.class);
    @Autowired
    private HfDocLogService hfDocLogService;

    /**
     * 文档注册查询
     */
    @RequestMapping(value = "/get/hfdoclog/pagelist", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public @ResponseBody
    ResponseBean getHfDocLogPages(@RequestBody  HfDocLogRequestPage hfDocLogRequestPage) {
        if(StringUtils.isEmpty(hfDocLogRequestPage.getPageNum()) ||StringUtils.isEmpty(hfDocLogRequestPage.getPageSize())){
            log.error("文档注册分页查询入参数据hfDocLogRequestPage有吴");
            return  new ResponseBean();
        }
        log.info("文档注册分页查询入参数据hfDocLogRequestPage={}", hfDocLogRequestPage.toString());
        ResponseBean responseBean;
        try {
            responseBean = hfDocLogService.getHfDocLogPages(hfDocLogRequestPage);
        } catch (Exception e) {
            log.error("文档注册分页查询错误信息："+e.getMessage());
            responseBean= new ResponseBean();
        }
        return responseBean;
    }



}
