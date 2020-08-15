package com.ylz.hf.show.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.person.bean.PatientVisit;
import com.ylz.person.service.impl.PatientVisitServiceImpl;
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
    private PatientVisitServiceImpl patientVisitService;

    /**
     * 就诊视图
     *
     * @param globalId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/visitList", method = RequestMethod.POST)
    public String visitList(String globalId, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size,
                            @RequestParam(required = false) String startTime) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean.toString();
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        Page<PatientVisit> pageInfo = new Page<>(page, size);
        QueryWrapper<PatientVisit> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(PatientVisit::getGlobalId, globalId)
                .gt(PatientVisit::getVisitDate, startTime)
                .isNotNull(PatientVisit::getVisitDate)
                .isNotNull(PatientVisit::getDiagName);
        // .apply("visit_date is not null and diag_name is not null");
        IPage<PatientVisit> recordList = patientVisitService.page(pageInfo, queryWrapper);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(recordList.getRecords());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }
}
