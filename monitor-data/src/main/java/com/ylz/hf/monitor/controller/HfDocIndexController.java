package com.ylz.hf.monitor.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.service.HfDocIndexService;
import com.ylz.hf.monitor.vo.response.HfDocIndexResponse;
import com.ylz.hf.monitor.vo.reuqest.HfDocIndexRequest;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/*
 *hf_doc_index 索引表管理接口
 *
 */
@RestController
@RequestMapping(value = "/hfdocindex")
public class HfDocIndexController {

    @Autowired
    private HfDocIndexService hfDocIndexService;

    private static final Logger log = LoggerFactory.getLogger(HfDocIndexController.class);
    /**
     * cda 获取
     */
    @RequestMapping(value = "/get/hfdocindex/by/request", method = RequestMethod.GET)
    public @ResponseBody
    String getHfDocIndexByRequest(
            @RequestParam(value = "repositoryUniqueId", required = true) String repositoryUniqueId) {
        HfDocIndexRequest hfDocIndexRequest = new HfDocIndexRequest();
        hfDocIndexRequest.setRepositoryUniqueId(repositoryUniqueId);
        log.info("共享文档cda查看索引表入参hfDocIndexRequest={}", hfDocIndexRequest);
        HfDocIndexResponse hfDocIndexResponse = new HfDocIndexResponse();
        try {
            hfDocIndexResponse = hfDocIndexService.getHfDocIndexDTOByEntity(hfDocIndexRequest);
            if (null == hfDocIndexResponse.getDate()) {
                return "<xml>" + repositoryUniqueId + "的数据不存在，请检查参数！</xml>";
            }
            File file = new File("D:/xds/"+hfDocIndexResponse.getDate().getCdaPath());
            return FileUtils.readFileToString(file, "UTF-8");
        } catch (Exception e) {
            log.error("共享文档cda查看有误返回有误e"+e.getMessage());
        }

        return "<xml>文件读取错误！</xml>";
    }

    /**
     * 查询全部数据总量
     */
    @ResponseBody
    @RequestMapping(value = "/get/doc/total", method = RequestMethod.GET)
    public ResponseBean getTotalData(String docCategory) {

        log.info("全部数据总量");
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(docCategory)) {
            responseBean.setMessage("文档类型为空！");
            return responseBean;
        }
        return hfDocIndexService.getTotal(docCategory, null);
    }


    /**
     * 查询全部数据总量
     */
    @ResponseBody
    @RequestMapping(value = "/get/doc/total/today", method = RequestMethod.GET)
    public ResponseBean getTodayTotalData(String docCategory) {
        log.info("全部当天数据总量");
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(docCategory)) {
            responseBean.setMessage("文档类型为空！");
            return responseBean;
        }
        return hfDocIndexService.getTotal(docCategory, initDateByDay());
    }

    public String initDateByDay() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        return new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
    }


    /**
     * 查询全部数据总量
     */
    @ResponseBody
    @RequestMapping(value = "/get/doc/group", method = RequestMethod.GET)
    public ResponseBean getGroupData(String docCategory) {

        log.info("全部分组数据总量");
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(docCategory)) {
            responseBean.setMessage("文档类型为空！");
            return responseBean;
        }
        return hfDocIndexService.getGroupTotal(docCategory, null);
    }

    /**
     * 查询全部数据总量
     */
    @ResponseBody
    @RequestMapping(value = "/get/doc/group/today", method = RequestMethod.GET)
    public ResponseBean getGroupTodayData(String docCategory) {

        log.info("全部当天分组数据总量");
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(docCategory)) {
            responseBean.setMessage("文档类型为空！");
            return responseBean;
        }
        return hfDocIndexService.getGroupTotal(docCategory, initDateByDay());
    }

}
