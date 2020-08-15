package com.ylz.cdr.show.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IVisitService;
import com.ylz.cdr.show.tool.ResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/visit")
public class VisitController {

    private static final Logger log = LoggerFactory.getLogger(VisitController.class);


    @Autowired
    private IVisitService visitService;

    /**
     * 时间轴
     *
     * @param personId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/dateView", method = RequestMethod.POST)
    public String dateView(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = visitService.queryAllByData(personId, encounterId);
        return responseBean.toString();
    }


    /**
     * 就诊视图
     *
     * @param personId
     * @return
     */
    /*@ResponseBody
    @RequestMapping(value = "/visitList", method = RequestMethod.POST)
    public String visitList(String personId, int page, int size) {
        ResponseBean responseBean = visitService.queryByData(personId, page, size);
        return responseBean.toString();
    }*/

    /**
     * 就诊视图
     *
     * @param personId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/visitList", method = RequestMethod.POST)
    public String visitList(String personId, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size,
                            @RequestParam(required = false) String startTime, @RequestParam(required = false) String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = visitService.queryByData(personId, page, size, startTime, encounterId);
        return responseBean.toString();
    }
}
