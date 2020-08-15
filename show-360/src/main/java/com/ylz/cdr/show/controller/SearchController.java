package com.ylz.cdr.show.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IPatientService;
import com.ylz.person.vo.PatientParam;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/search")
public class SearchController {

    private static final Logger log = LoggerFactory.getLogger(SearchController.class);


    @Autowired
    private IPatientService patientService;

    /**
     * 门诊号、住院号、身份证号、医保卡号、病历号进行精确匹配，通过患者姓名
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/searchData", method = RequestMethod.POST)
    public String searchData(@RequestParam(required = false) String patientId,
                             @RequestParam(required = false) String patientName,
                             @RequestParam(required = false) String idNo,
                             @RequestParam(required = false) String medRecordNo,
                             int page, int size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(patientId) && StringUtils.isEmpty(patientName) && StringUtils.isEmpty(idNo) && StringUtils.isEmpty(medRecordNo)) {
            responseBean.setMessage("参数不能为空！");
            return responseBean.toString();
        }
        PatientParam patientParam = new PatientParam(patientId, patientName, idNo, medRecordNo);
        responseBean = patientService.queryPatientInfo(patientParam, page, size);
        return responseBean.toString();
    }

    /**
     * 门诊号、住院号、身份证号、医保卡号、病历号进行精确匹配，通过患者姓名
     *
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/searchSeniorData")
    public String searchSeniorData(@RequestParam(required = false) String patientId,
                                   @RequestParam(required = false) String patientName,
                                   @RequestParam(required = false) String idNo,
                                   @RequestParam(required = false) String medRecordNo,
                                   @RequestParam(required = false) String sex,
                                   @RequestParam(required = false) String birthdayBegin,
                                   @RequestParam(required = false) String birthdayEnd,
                                   @RequestParam(required = false) String diagnosis,
                                   int page, int size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(patientId) && StringUtils.isEmpty(patientName) && StringUtils.isEmpty(idNo) && StringUtils.isEmpty(medRecordNo)
                && StringUtils.isEmpty(sex) && StringUtils.isEmpty(birthdayBegin) && StringUtils.isEmpty(birthdayEnd) && StringUtils.isEmpty(diagnosis)) {
            responseBean.setMessage("参数不能为空！");
            return responseBean.toString();
        }
        PatientParam patientParam = new PatientParam(patientId, patientName, idNo, medRecordNo, sex, birthdayBegin, birthdayEnd, diagnosis);
        responseBean = patientService.queryPatientInfo(patientParam, page, size);
        return responseBean.toString();
    }

}
