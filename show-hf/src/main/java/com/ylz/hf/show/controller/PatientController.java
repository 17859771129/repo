package com.ylz.hf.show.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.common.json.JsonUtils;
import com.ylz.hf.bean.Hsda0001;
import com.ylz.hf.dao.Hsda0001Mapper;
import com.ylz.hf.show.bean.BsInfo;
import com.ylz.hf.show.bean.GxyInfo;
import com.ylz.hf.show.bean.ItemInfoView;
import com.ylz.hf.show.bean.MassIndexInfo;
import com.ylz.hf.show.service.IOverviewService;
import com.ylz.hf.show.tool.DateUtil;
import com.ylz.hf.show.vo.HistoryInfo;
import com.ylz.hf.show.vo.RelationVo;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.service.impl.PatientInfoServiceImpl;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/patient")
public class PatientController {
    private static final Logger log = LoggerFactory.getLogger(SearchController.class);

    @Autowired
    private Hsda0001Mapper hsda0001Mapper;

    @Autowired
    private PatientInfoServiceImpl patientInfoService;

    @Autowired
    private IOverviewService overviewService;


    /**
     * 查询档案索引信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/patientInfo", method = RequestMethod.POST)
    public String patientInfo(String globalId) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean.toString();
        }
        QueryWrapper<Hsda0001> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(Hsda0001::getEmpi, globalId)
                .eq(Hsda0001::getStatus, Constants.SUCCESS_STATUS);
        Hsda0001 hsda0001 = hsda0001Mapper.selectOne(queryWrapper);
        JSONObject jsonObject = overviewService.getBodyInfo(globalId);
        jsonObject.putAll(JsonUtils.toJson(hsda0001));
        QueryWrapper<PatientInfo> queryWrapperPatient = new QueryWrapper<>();
        queryWrapperPatient.lambda()
                .eq(PatientInfo::getGlobalId, globalId);
        PatientInfo patientInfo1 = patientInfoService.getOne(queryWrapperPatient);
        jsonObject.put("email", patientInfo1.getEmail());
        jsonObject.put("healthCardNumber", patientInfo1.getHealthCardNumber());
        jsonObject.put("medicalInsuranceNumber", patientInfo1.getMedicalInsuranceNumber());
        jsonObject.put("homePlace", patientInfo1.getHomePlace());
        jsonObject.put("age", getAge(patientInfo1.getDateOfBirth(), new Date()));
        if (null == hsda0001) {
            //民族
            jsonObject.put("ethnic", patientInfo1.getEthnic());
            //出生日期
            jsonObject.put("birth", patientInfo1.getDateOfBirth());
            //血型
            //婚姻状况
            jsonObject.put("maritalName", patientInfo1.getMarital());
            //文化程度
            jsonObject.put("eduName", patientInfo1.getDegree());
            //身份证号
            jsonObject.put("identifyNo", patientInfo1.getIdentityNo());
            //联系电话
            jsonObject.put("telecom", patientInfo1.getTelephone());
            //邮箱
            jsonObject.put("email", patientInfo1.getEmail());
            //健康卡号
            jsonObject.put("healthCardNumber", patientInfo1.getHealthCardNumber());
        }
        responseBean.setObject(jsonObject);
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
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
     * 查询家庭信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/familyInfo", method = RequestMethod.POST)
    public String familyInfo(String globalId, String identifyNo) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean.toString();
        }
        List<RelationVo> voList = overviewService.getGuardianData(globalId, identifyNo);
        responseBean.setCode(Constants.SUCCESS_CODE);
        if (CollectionUtils.isNotEmpty(voList)) {
            responseBean.setTotal(voList.size());
            responseBean.setRows(voList);
            return responseBean.toString();
        }
        return responseBean.toString();
    }


    /**
     * 查询BMI信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/bmiInfo", method = RequestMethod.POST)
    public String bmiInfo(String globalId, String startTime) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean.toString();
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        List<MassIndexInfo> massIndexInfoList = overviewService.getBmiInfo(globalId, startTime);
        if (CollectionUtils.isNotEmpty(massIndexInfoList)) {
            responseBean.setRows(massIndexInfoList);
            responseBean.setTotal(massIndexInfoList.size());
        }
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }

    /**
     * 查询高血压信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/gxyInfo", method = RequestMethod.POST)
    public ResponseBean gxyInfo(String globalId, String startTime) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean;
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        List<GxyInfo> massIndexInfoList = overviewService.getGxyInfo(globalId, startTime);
        if (CollectionUtils.isNotEmpty(massIndexInfoList)) {
            responseBean.setRows(massIndexInfoList);
            responseBean.setTotal(massIndexInfoList.size());
        }
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }

    /**
     * 查询糖尿病信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/tnbInfo", method = RequestMethod.POST)
    public String tnbInfo(String globalId, String startTime) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean.toString();
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        List<BsInfo> massIndexInfoList = overviewService.getTnbInfo(globalId, startTime);
        if (CollectionUtils.isNotEmpty(massIndexInfoList)) {
            responseBean.setRows(massIndexInfoList);
            responseBean.setTotal(massIndexInfoList.size());
        }
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }

    /**
     * 查询检验异常信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/inspectInfo", method = RequestMethod.POST)
    public String inspectInfo(String globalId, String startTime,
                              @RequestParam(defaultValue = "1") Integer page,
                              @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean.toString();
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        IPage<ItemInfoView> hfDocIndex = overviewService.inspectInfo(globalId, startTime, page, size);
        responseBean.setTotal((int) hfDocIndex.getTotal());
        responseBean.setRows(hfDocIndex.getRecords());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }


    /**
     * 查询既往史信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/historyInfo", method = RequestMethod.POST)
    public String historyInfo(String globalId) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean.toString();
        }
        HistoryInfo jsonObject = overviewService.getHistoryInfo(globalId);
        responseBean.setObject(jsonObject);
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }
}
