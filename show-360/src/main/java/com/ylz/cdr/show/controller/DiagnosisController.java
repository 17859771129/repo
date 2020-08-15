package com.ylz.cdr.show.controller;


import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IDiagService;
import com.ylz.cdr.show.tool.ResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/07/02.
 */
@RestController
@RequestMapping("/diagnosis")
public class DiagnosisController {
    @Resource
    private IDiagService diagService;


    @PostMapping("/list")
    public String list(String personId, String encounterId, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = diagService.getListByPersonId(personId, encounterId, page, size);
        return responseBean.toString();
    }

    @PostMapping("/getVisitInfo")
    public String getVisitInfo(String personId, String encounterId) {
        ResponseBean responseBean = diagService.selectVisitList(personId, encounterId);
        return responseBean.toString();
    }

    @PostMapping("/count")
    public String count(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = diagService.countByPersonId(personId, encounterId);
        return responseBean.toString();
    }

}
