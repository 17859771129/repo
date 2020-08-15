package com.ylz.cdr.show.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.ISurgeryRecordService;
import com.ylz.cdr.show.tool.ResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/07/03.
 */
@RestController
@RequestMapping("/surgeryRecord")
public class SurgeryRecordController {
    @Resource
    private ISurgeryRecordService surgeryRecordService;

    @PostMapping("/getSurgeryEncounterListByPersonId")
    public String getSurgeryEncounterListByPersonId(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        ResponseBean responseBean = surgeryRecordService.getVisitListByPersonId(personId, encounterId);
        return responseBean.toString();
    }

    @PostMapping("/list")
    public String list(String personId, String encounterId,
                       @RequestParam(required = false) int page, @RequestParam(required = false) int size) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        ResponseBean responseBean = surgeryRecordService.getSurgeryRecordsByPersonId(personId, encounterId, page, size);
        return responseBean.toString();
    }

    @PostMapping("/count")
    public String count(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        ResponseBean responseBean = surgeryRecordService.countByPersonId(personId, encounterId);
        return responseBean.toString();
    }
}
