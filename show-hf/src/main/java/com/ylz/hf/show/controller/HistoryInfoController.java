package com.ylz.hf.show.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.bean.*;
import com.ylz.hf.show.service.IOverviewService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/history")
public class HistoryInfoController {

    @Autowired
    private IOverviewService overviewService;

    /**
     * 输血史信息
     *
     * @param globalId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getBloodInfo", method = RequestMethod.POST)
    public ResponseBean getBloodInfo(String globalId, String startTime, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        IPage<BloodHistoryInfo> recordList = overviewService.getBloodInfo(globalId, startTime, page, size);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(recordList.getRecords());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }

    /**
     * 手术史信息
     *
     * @param globalId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getOperInfo", method = RequestMethod.POST)
    public ResponseBean getOperInfo(String globalId, String startTime, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        IPage<OperHistoryInfo> recordList = overviewService.getOperInfo(globalId, startTime, page, size);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(recordList.getRecords());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }


    /**
     * 家族遗传史信息
     *
     * @param globalId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getFamilyInfo", method = RequestMethod.POST)
    public ResponseBean getFamilyInfo(String globalId, String startTime, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        IPage<FamilyHistoryInfo> recordList = overviewService.getFamilyInfo(globalId, startTime, page, size);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(recordList.getRecords());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }


    /**
     * 疾病史信息
     *
     * @param globalId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getDiseaseInfo", method = RequestMethod.POST)
    public ResponseBean getDiseaseInfo(String globalId, String startTime, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        IPage<DiseaseHistoryInfo> recordList = overviewService.getDiseaseInfo(globalId, startTime, page, size);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(recordList.getRecords());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }

    /**
     * 过敏史信息
     *
     * @param globalId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getAllergyInfo", method = RequestMethod.POST)
    public ResponseBean getAllergyInfo(String globalId, String startTime, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        IPage<AllergyInfo> recordList = overviewService.getAllergyInfo(globalId, startTime, page, size);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(recordList.getRecords());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }

    /**
     * 预防接种信息
     *
     * @param globalId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getInoculationInfo", method = RequestMethod.POST)
    public ResponseBean getInoculationInfo(String globalId, String startTime, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        IPage<InoculationInfo> recordList = overviewService.getInoculationInfo(globalId, startTime, page, size);
        responseBean.setTotal((int) recordList.getTotal());
        responseBean.setRows(recordList.getRecords());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }

    /**
     * 用药史信息
     *
     * @param globalId
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getDrugInfo", method = RequestMethod.POST)
    public ResponseBean getDrugInfo(String globalId, String startTime, @RequestParam(defaultValue = "1")
            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        responseBean = overviewService.getDrugInfo(globalId, startTime, page, size);
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }
}
