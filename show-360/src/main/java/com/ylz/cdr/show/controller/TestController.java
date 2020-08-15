package com.ylz.cdr.show.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.lab.bean.LabIndexCompare;
import com.ylz.cdr.show.service.ILabCompareService;
import com.ylz.cdr.show.service.ITestService;
import com.ylz.cdr.show.tool.ResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/07/08.
 */
@RestController
@RequestMapping("/labResult")
public class TestController {
    @Resource
    private ITestService dcLabResultMasterService;
    @Autowired
    private ILabCompareService labCompareService;

    @PostMapping("/list")
    public String list(String personId, String encounterId, String inspectionCategoryCode, Integer page, Integer size) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        ResponseBean responseBean = dcLabResultMasterService.getDCLabResultMasterListByPersonId(personId, encounterId, inspectionCategoryCode, page, size);
        return responseBean.toString();
    }


    @PostMapping("/getLabResultEncounterListByPersonId")
    public String getLabResultEncounterListByPersonId(String personId, String encounterId, String inspectionCategoryCode) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        ResponseBean responseBean = dcLabResultMasterService.getLabResultEncounterListByPersonId(personId, encounterId, inspectionCategoryCode);
        return responseBean.toString();
    }

    /**
     * @param personId
     * @param encounterId
     * @param inspectionCategoryCode
     * @return
     */
    @PostMapping("/count")
    public String count(String personId, String encounterId, String inspectionCategoryCode) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        ResponseBean responseBean = dcLabResultMasterService.count(personId, encounterId, inspectionCategoryCode);
        return responseBean.toString();
    }

    /**
     * 查询个人某个类型下的所有检验报告
     *
     * @param personId
     * @param inspectionCategoryCode
     * @param isCompare              0和null表示全部数据，1表示已添加对比数据
     * @return
     */
    @PostMapping("/listByCode")
    public String listByCode(String personId, String inspectionCategoryCode, String isCompare) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        ResponseBean responseBean = dcLabResultMasterService.getPersonData(personId, inspectionCategoryCode, isCompare);
        return responseBean.toString();
    }

    /**
     * 查询检验类型的检验项目信息
     *
     * @param itemTypeCode
     * @return
     */
    @PostMapping("/queryTestDict")
    public String queryTestDict(String personId, String itemTypeCode, String isCompare) {
        if (StringUtils.isEmpty(itemTypeCode)) {
            return ResponseUtil.genFailResult("检验类型不能为空").toString();
        }
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("personId不能为空").toString();
        }
        ResponseBean responseBean = labCompareService.queryDict(personId, itemTypeCode, isCompare);
        return responseBean.toString();
    }

    @PostMapping("/delCompareItem")
    public String delCompareItem(@RequestBody LabIndexCompare labIndexCompare) {
        return saveOrDelete(labIndexCompare, false).toString();
    }

    @PostMapping("/addCompareItem")
    public String addCompareItem(@RequestBody LabIndexCompare labIndexCompare) {
        /*LabIndexCompare labIndexCompare= (LabIndexCompare) JSONObject.toBean(jsObject,LabIndexCompare.class);*/
        return saveOrDelete(labIndexCompare, true).toString();
    }

    private ResponseBean saveOrDelete(LabIndexCompare labIndexCompare, boolean isAdd) {
        if (StringUtils.isEmpty(labIndexCompare.getEmpi())) {
            return ResponseUtil.genFailResult("患者Id不能为空");
        }
        if (StringUtils.isEmpty(labIndexCompare.getItemTypeCode())) {
            return ResponseUtil.genFailResult("患者检验类型编码不能为空");
        }
        if (StringUtils.isEmpty(labIndexCompare.getItemCode())) {
            return ResponseUtil.genFailResult("患者检验项目编码不能为空");
        }
        if (isAdd) {
            return labCompareService.insertLabIndex(labIndexCompare);
        } else {
            return labCompareService.deleteLabIndex(labIndexCompare);
        }
    }
}
