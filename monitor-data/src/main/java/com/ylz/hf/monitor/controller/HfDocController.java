package com.ylz.hf.monitor.controller;

import com.alibaba.druid.util.StringUtils;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.service.HfLoginLogService;
import com.ylz.hf.monitor.service.IHfDocService;
import com.ylz.hf.monitor.vo.response.HfDocResponse;
import com.ylz.hf.monitor.vo.reuqest.HfDocRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/*
 *hf_doc 字典表 管理接口
 *
 */
@RestController
@RequestMapping(value = "/hfdoc")

public class HfDocController {
    private static final Logger log = LoggerFactory.getLogger(HfDocController.class);
    @Autowired
    private IHfDocService hfDocService;

    @Autowired
    private HfLoginLogService hfLoginLogService;


    //1.健康档案电子病历查询（本月）统计接口
    @RequestMapping(value = "/get/count/doccategories/by/interval", method = RequestMethod.GET)
    public @ResponseBody
    HfDocResponse getCountDocCategoriesByInterval(
            @RequestParam(value = "docCategory", required = true) String docCategory,
            @RequestParam(value = "startProcTime", required = false) String startProcTime,
            @RequestParam(value = "endProcTime", required = false) String endProcTime
    ) {
        log.info("查询统计健康电子病历入参docCategory=" + docCategory);
        HfDocRequest hfDocRequest = new HfDocRequest();
        hfDocRequest.setDocCategory(docCategory);
        if (!StringUtils.isEmpty(startProcTime) && !StringUtils.isEmpty(endProcTime)) {
            hfDocRequest.setStartProcTime(startProcTime);
            hfDocRequest.setEndProcTime(endProcTime);
        }
        HfDocResponse hfDocResponse = new HfDocResponse();
        try {
            hfDocResponse = hfDocService.getCountDocCategoriesByInterval(hfDocRequest);
        } catch (Exception e) {
            log.error("健康档案电子病历查询（本月）统计有误 "+e.getMessage());
            hfDocResponse.setMessage(e.getMessage());
        }
        log.info("查询统计健康电子病历出参hfDocResponse={}", hfDocResponse);
        return hfDocResponse;
    }


    //2.（本月）健康档案访问或者电子病历浏览器访问接口
    @RequestMapping(value = "/get/count/doccategories/by/type", method = RequestMethod.GET)
    public @ResponseBody
    HfDocResponse getCountDocCategoriesByType(
            @RequestParam(value = "type", required = true) String type,
            @RequestParam(value = "startProcTime", required = false) String startProcTime,
            @RequestParam(value = "endProcTime", required = false) String endProcTime
    ) {
        HfDocRequest hfDocRequest = new HfDocRequest();
        hfDocRequest.setDocCategory(type);
        if (!StringUtils.isEmpty(startProcTime) && !StringUtils.isEmpty(endProcTime)) {
            hfDocRequest.setStartProcTime(startProcTime);
            hfDocRequest.setEndProcTime(endProcTime);
        }
        log.info("健康档案访问或者电子病历浏览器访问查询入参hfDocRequest={}", hfDocRequest);
        HfDocResponse hfDocResponse = new HfDocResponse();
        try {
            hfDocResponse = hfLoginLogService.getCountDocCategoriesByType(hfDocRequest);
        } catch (Exception e) {
            log.error("健康档案访问或者电子病历浏览器访问查询有误 "+e.getMessage());
            hfDocResponse.setMessage(e.getMessage());
        }
        log.info("健康档案访问或者电子病历浏览器访问查询出参hfDocResponse={}", hfDocResponse);
        return hfDocResponse;
    }


    //3.档案服务器调阅(健康档案，电子病历)
    @RequestMapping(value = "/get/count/category/by/serve", method = RequestMethod.GET)
    public @ResponseBody
    HfDocResponse getCountCategoryByServe(
            @RequestParam(value = "docCategory", required = true) String docCategory
    ) {
        HfDocRequest hfDocRequest = new HfDocRequest();
        hfDocRequest.setDocCategory(docCategory);
        log.info("电子病历，健康档案服务器调阅查询入参 hfDocRequest={}", hfDocRequest);
        HfDocResponse hfDocResponse = new HfDocResponse();
        try {
            hfDocResponse = hfDocService.getCountCategoryByServe(hfDocRequest);
        } catch (Exception e) {
            log.error("电子病历，健康档案服务器调阅查询有误 "+e.getMessage());
            hfDocResponse.setMessage(e.getMessage());
        }
        log.info("电子病历，健康档案服务器调阅查询出参hfDocResponse={}", hfDocResponse);
        return hfDocResponse;
    }


    //4.本月健康档案调阅---电子病历共享文档 调阅TOP10
    @RequestMapping(value = "/get/count/doc/categories/tops", method = RequestMethod.GET)
    public @ResponseBody
    ResponseBean getCountDocCategoriesTops(
            @RequestParam(value = "docCategory", required = true) String docCategory,
            @RequestParam(value = "startProcTime", required = false) String startProcTime,
            @RequestParam(value = "endProcTime", required = false) String endProcTime
    ) {

        HfDocRequest hfDocRequest = new HfDocRequest();
        hfDocRequest.setDocCategory(docCategory);
        if (!StringUtils.isEmpty(startProcTime) && !StringUtils.isEmpty(endProcTime)) {
            hfDocRequest.setStartProcTime(startProcTime);
            hfDocRequest.setEndProcTime(endProcTime);
        }
        log.info("电子病历共享文档调阅统计入参hfDocRequest=[]", hfDocRequest);
        ResponseBean hfDocResponse;
        try {
            hfDocResponse = hfDocService.getCountDocCategoriesTops(hfDocRequest);
        } catch (Exception e) {
            log.error("电子病历共享文档调阅统计有误 "+e.getMessage());
            hfDocResponse = new ResponseBean();;
        }
        log.info("电子病历共享文档调阅统计出参hfDocResponse={}", hfDocResponse);
        return hfDocResponse;
    }



    /**
     * 字典表查询list
     */
    @RequestMapping(value = "/get/hfdocs/list", method = RequestMethod.GET)
    public @ResponseBody
    ResponseBean getHfDocLogPages() {

        log.info("查询字典全部数据");
        ResponseBean responseBean;
        try {
            responseBean = hfDocService.getHfDocs();
        } catch (Exception e) {
            log.error("文档注册分页查询错误信息："+e.getMessage());
            responseBean= new ResponseBean();
        }
        return responseBean;
    }


}
