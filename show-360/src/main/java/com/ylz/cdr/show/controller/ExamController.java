package com.ylz.cdr.show.controller;

import com.ylz.cdr.bean.Hdsd000502;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IExamService;
import com.ylz.cdr.show.tool.ResponseUtil;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.TypeInfo;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by CodeGenerator on 2019/07/05.
 */
@RestController
@RequestMapping("/exam")
public class ExamController {
    @Resource
    private IExamService dcExamResultService;


    @PostMapping("/resultList")
    public String getExamResultsByPersonId(String personId, String encounterId, String categoryCode,
                                           @RequestParam(required = false) int page, @RequestParam(required = false) int size) {
        if (StringUtils.isEmpty(encounterId) && StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("就诊ID与患者Id不能均为空").toString();
        }
        ResponseBean responseBean = dcExamResultService.getExamResultsByPersonId(personId, encounterId, categoryCode, page, size);
        return responseBean.toString();
    }

    /**
     * 病人检查类型列表
     *
     * @param personId
     * @param encounterId
     * @return
     */
    @PostMapping("/count")
    public String count(String personId, String encounterId) {
        if (StringUtils.isEmpty(encounterId) && StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("就诊ID与患者Id不能均为空").toString();
        }
        List<TypeInfo> datas = dcExamResultService.getExamCategorysByPersonIdAndEncounterId(personId, encounterId);
        return ResponseUtil.genSuccessListResult(datas.size(), datas).toString();
    }

    /**
     * 病人 检查就诊记录列表
     *
     * @param personId
     * @return
     */
    @PostMapping("/getExamEncountersByPersonId")
    public String getExamEncountersByPersonId(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        List<IndexInfo> datas = dcExamResultService.getExamEncountersByPersonId(personId, encounterId);
        return ResponseUtil.genSuccessListResult(datas.size(), datas).toString();
    }

    /**
     * 比较
     *
     * @param personId
     * @param categoryCode
     * @param row
     * @return
     */
    @PostMapping("/queryCompare")
    public String queryCompare(String personId, String categoryCode, @RequestParam(defaultValue = "5") Integer row) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        if (StringUtils.isEmpty(categoryCode)) {
            return ResponseUtil.genFailResult("检查类型不能为空").toString();
        }
        List<Hdsd000502> datas = dcExamResultService.getExamResultComparisonByPersonIdAndcategoryCode(personId, categoryCode, row);
        return ResponseUtil.genSuccessListResult(datas.size(), datas).toString();
    }

    /*@PostMapping("/count")
    public String count(String personId, String encounterId, String categoryCode) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = dcExamResultService.countByPersonId(personId, encounterId, categoryCode);
        return responseBean.toString();
    }*/

}
