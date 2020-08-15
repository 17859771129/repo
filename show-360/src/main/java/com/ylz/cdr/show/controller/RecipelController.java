package com.ylz.cdr.show.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IRecipelService;
import com.ylz.cdr.show.tool.ResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/07/04.
 */
@RestController
@RequestMapping("/orderOutpat")
public class RecipelController {
    @Resource
    private IRecipelService recipelService;

    @PostMapping("/listChinese")
    public String getOrderOutpatListByPersonId(String personId, String encounterId,
                                               @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = recipelService.getChineseList(personId, encounterId, page, size);
        return responseBean.toString();
    }

    @PostMapping("/listWest")
    public String listWest(String personId, String encounterId,
                           @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = recipelService.getWestList(personId, encounterId, page, size);
        return responseBean.toString();
    }

    @PostMapping("/countChinese")
    public String countChinese(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = recipelService.countChineseList(personId, encounterId);
        return responseBean.toString();
    }

    @PostMapping("/countWest")
    public String countWest(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = recipelService.countWestList(personId, encounterId);
        return responseBean.toString();
    }

    @PostMapping("/count")
    public String count(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = recipelService.countAll(personId, encounterId);
        return responseBean.toString();
    }

    /**
     * 查询关联就诊记录列表
     */
    @PostMapping("/getOutpatEncounterListByPersonId")
    public String getOutpatEncounterListByPersonId(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("参数有误").toString();
        }
        ResponseBean responseBean = recipelService.getVisitList(personId, encounterId);
        return responseBean.toString();
    }


    /**
     * 查询关联就诊记录列表
     */
    @PostMapping("/getVisitListByPat")
    public String getVisitListByPat(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("参数有误").toString();
        }
        ResponseBean responseBean = recipelService.getVisitList(personId, encounterId);
        return responseBean.toString();
    }
}
