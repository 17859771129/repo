package com.ylz.cdr.show.controller;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IPatientService;
import com.ylz.person.bean.PatientInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patient")
public class PersonController {

    private static final Logger log = LoggerFactory.getLogger(SearchController.class);


    @Autowired
    private IPatientService patientService;


    /**
     * 门诊号、住院号、身份证号、医保卡号、病历号进行精确匹配，通过患者姓名
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getPatient", method = RequestMethod.POST)
    public String getPatient(@RequestParam(required = false) String globalId) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("globalId参数不能为空！");
            return responseBean.toString();
        }
        PatientInfo patient = patientService.getPatient(globalId);
        responseBean.setObject(patient);
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }
}
