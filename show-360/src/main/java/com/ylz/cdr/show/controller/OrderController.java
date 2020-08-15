package com.ylz.cdr.show.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IOrderService;
import com.ylz.cdr.show.tool.ResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by CodeGenerator on 2019/07/02.
 */
@RestController
@RequestMapping("/orderInpat")
public class OrderController {
    @Resource
    private IOrderService dcOrderInpatService;

    /**
     * 查询住院入院记录列表
     */
    @PostMapping("/getInpatEncounterListByPersonId")
    public String getInpatEncounterListByPersonId(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("患者Id不能为空").toString();
        }
        ResponseBean responseBean = dcOrderInpatService.getInpatEncounterListByPersonId(personId, encounterId);
        return responseBean.toString();
    }

    @PostMapping("/list")
    public String getOrderInpatListByPersonId(String personId, String encounterId,
                                              @RequestParam(defaultValue = "0") Integer isDrug,
                                              @RequestParam(defaultValue = "0") Integer isMedicine,
                                              @RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("参数有误").toString();
        }
        ResponseBean responseBean = dcOrderInpatService.getOrderInpatListByPersonId(personId, encounterId, isDrug, isMedicine, page, size);
        return responseBean.toString();
    }

    @PostMapping("/count")
    public String count(String personId, String encounterId,
                        @RequestParam(defaultValue = "0") Integer isDrug) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("参数有误").toString();
        }
        ResponseBean responseBean = dcOrderInpatService.getOrderInpatListByPersonIdCount(personId, encounterId, isDrug, 0);
        return responseBean.toString();
    }

    /*@PostMapping("/getOrderCategoryByPersonIdOrEncounterId")*/
    public String getOrderCategoryByPersonIdOrEncounterId(String personId, String encounterId) {
        if (StringUtils.isEmpty(encounterId) && StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("就诊ID与患者Id不能均为空").toString();
        }
        ResponseBean responseBean = dcOrderInpatService.getOrderCategoryByPersonIdOrEncounterId(personId, encounterId);
        return responseBean.toString();
    }

}
