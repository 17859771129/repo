package com.ylz.hf.show.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.show.tool.DateUtil;
import com.ylz.hf.show.vo.PatientVo;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.service.impl.PatientInfoServiceImpl;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/search")
public class SearchController {

    private static final Logger log = LoggerFactory.getLogger(SearchController.class);


    @Autowired
    private PatientInfoServiceImpl patientInfoService;

    /**
     * 身份证号、健康档案号、健康卡号、医保卡号进行精确匹配
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/searchData", method = RequestMethod.POST)
    public String searchData(String identityNo,
                             String healthFileNumber,
                             String healthCardNumber,
                             String medicalInsuranceNumber,
                             @RequestParam(defaultValue = "1")
                                     Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(identityNo) && StringUtils.isEmpty(healthFileNumber) && StringUtils.isEmpty(healthCardNumber) && StringUtils.isEmpty(medicalInsuranceNumber)) {
            responseBean.setMessage("参数不能为空！");
            return responseBean.toString();
        }
        Page<PatientInfo> pageInfo = new Page<>(page, size);
        QueryWrapper<PatientInfo> queryWrapper = getQueryMapper(identityNo, healthFileNumber,
                healthCardNumber, medicalInsuranceNumber,
                null, null, null, null, null, null);
        IPage<PatientInfo> recordList = patientInfoService.page(pageInfo, queryWrapper);
        List<PatientInfo> list = recordList.getRecords();
        List<PatientVo> patientVoList = getPatientVo(list);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(patientVoList);
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }

    private List<PatientVo> getPatientVo(List<PatientInfo> list) {
        List<PatientVo> patientVoList = new ArrayList<>();
        if (CollectionUtils.isNotEmpty(list)) {
            list.forEach(patientInfo -> {
                PatientVo patientVo = new PatientVo();
                BeanUtils.copyProperties(patientInfo, patientVo);
                patientVo.setAge(getAge(patientInfo.getDateOfBirth(), new Date()));
                patientVoList.add(patientVo);
            });
        }
        return patientVoList;
    }

    //日期差
    private String getAge(String beginDateStr, Date endDate) {
        String returnDays = "";
        Date beginDate = DateUtil.strToDate(beginDateStr);
        if (beginDate != null && endDate != null) {
            long timeBegin = beginDate.getTime();
            long timeEnd = endDate.getTime();
            long diff = timeEnd - timeBegin;
            long days = diff / (1000 * 60 * 60 * 24);
            if (days > 365)
                returnDays = String.valueOf(days / 365) + "岁";
            else
                returnDays = String.valueOf(days) + "天";
        }
        return returnDays;
    }

    /**
     * 身份证号、健康档案号、健康卡号、医保卡号、性别、年龄、出生日期进行精确匹配，通过患者姓名、地址模糊匹配
     *
     * @return
     */
    @ResponseBody
    @PostMapping(value = "/searchSeniorData")
    public String searchSeniorData(String identityNo,
                                   String healthFileNumber,
                                   String healthCardNumber,
                                   String medicalInsuranceNumber,
                                   String patientName,
                                   String age,
                                   String sex,
                                   String birthdayBegin,
                                   String birthdayEnd,
                                   String homePlace,
                                   @RequestParam(defaultValue = "1")
                                           Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(identityNo) && StringUtils.isEmpty(healthFileNumber)
                && StringUtils.isEmpty(healthCardNumber) && StringUtils.isEmpty(medicalInsuranceNumber)
                && StringUtils.isEmpty(patientName) && StringUtils.isEmpty(age)
                && StringUtils.isEmpty(sex) && StringUtils.isEmpty(birthdayBegin)
                && StringUtils.isEmpty(birthdayEnd) && StringUtils.isEmpty(homePlace)) {
            responseBean.setMessage("参数不能为空！");
            return responseBean.toString();
        }
        Page<PatientInfo> pageInfo = new Page<>(page, size);
        QueryWrapper<PatientInfo> queryWrapper = getQueryMapper(identityNo, healthFileNumber, healthCardNumber, medicalInsuranceNumber, patientName, age, sex, birthdayBegin, birthdayEnd, homePlace);
        IPage<PatientInfo> recordList = patientInfoService.page(pageInfo, queryWrapper);
        List<PatientInfo> list = recordList.getRecords();
        List<PatientVo> patientVoList = getPatientVo(list);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(patientVoList);
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }

    private QueryWrapper<PatientInfo> getQueryMapper(String identityNo,
                                                     String healthFileNumber,
                                                     String healthCardNumber,
                                                     String medicalInsuranceNumber,
                                                     String patientName,
                                                     String age,
                                                     String sex,
                                                     String birthdayBegin,
                                                     String birthdayEnd,
                                                     String homePlace) {
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(identityNo)) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getIdentityNo, identityNo);
        }
        if (StringUtils.isNotEmpty(healthFileNumber)) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getHealthFileNumber, healthFileNumber);
        }
        if (StringUtils.isNotEmpty(healthCardNumber)) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getHealthCardNumber, healthCardNumber);
        }
        if (StringUtils.isNotEmpty(medicalInsuranceNumber)) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getMedicalInsuranceNumber, medicalInsuranceNumber);
        }
        if (StringUtils.isNotEmpty(patientName)) {
            queryWrapper.lambda()
                    .like(PatientInfo::getPatientName, patientName);
        }
        if (StringUtils.isNotEmpty(age)) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getAge, age);
        }
        if (StringUtils.isNotEmpty(sex)) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getSex, sex);
        }
        if (StringUtils.isNotEmpty(birthdayBegin)) {
            queryWrapper.lambda()
                    .gt(PatientInfo::getDateOfBirth, birthdayBegin);
        }
        if (StringUtils.isNotEmpty(birthdayEnd)) {
            queryWrapper.lambda()
                    .le(PatientInfo::getDateOfBirth, birthdayEnd);
        }
        if (StringUtils.isNotEmpty(homePlace)) {
            queryWrapper.lambda()
                    .like(PatientInfo::getHomePlace, homePlace);
        }
        return queryWrapper;

    }

}
