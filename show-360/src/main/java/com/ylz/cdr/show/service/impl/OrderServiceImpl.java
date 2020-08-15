package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.bean.Hdsd001501;
import com.ylz.cdr.bean.TdyListOrder;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.dao.OrderMapper;
import com.ylz.cdr.show.service.IOrderService;
import com.ylz.cdr.show.vo.TypeInfo;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/02.
 */
@Service
@Transactional
public class OrderServiceImpl implements IOrderService {

    private static final Logger log = LoggerFactory.getLogger(OrderServiceImpl.class);
    @Resource
    private OrderMapper orderMapper;

    @Override
    public ResponseBean getInpatEncounterListByPersonId(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            List<Hdsd001501> list = orderMapper.getInpatEncounterListByPersonId(map);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setTotal(list.size());
                responseBean.setRows(list);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("查询就诊数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("查询就诊数据出现错误！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean getOrderInpatListByPersonId(String personId, String encounterId, Integer isDrug, Integer isMedicine, Integer page, Integer size) {
        Map map = new HashMap();
        map.put("encounterId", encounterId);
        map.put("isDrug", isDrug);
        map.put("personId", personId);
        map.put("isMedicine", isMedicine);
        ResponseBean responseBean = new ResponseBean();
        try {
            if (page <= 0 || size <= 0) {
                responseBean.setMessage("page or size 传参错误！");
                return responseBean;
            }
            int count = orderMapper.getOrderInpatListByPersonIdCount(map);
            if (count == 0) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            int from = (page - 1) * size;
            if ((from >= count) && (count != 0)) {
                responseBean.setMessage("page or size 传参错误,大于数据存在最大数目！");
                return responseBean;
            }
            responseBean.setTotal(count);
            map.put("page", from);
            map.put("size", size);
            List<TdyListOrder> list = orderMapper.getOrderInpatListByPersonId(map);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("查询医嘱数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("查询医嘱数据出现错误！");
        }
        return responseBean;
    }


    @Override
    public ResponseBean getOrderInpatListByPersonIdCount(String personId, String encounterId, Integer isDrug, Integer isMedicine) {
        Map map = new HashMap();
        map.put("encounterId", encounterId);
        map.put("personId", personId);
        ResponseBean responseBean = new ResponseBean();
        try {
            List<TypeInfo> typeInfoList = new ArrayList<>();
            map.put("isDrug", 1);
            int countDrug = orderMapper.getOrderInpatListByPersonIdCount(map);
            TypeInfo typeInfoDrug = new TypeInfo("1", "药品", countDrug);
            typeInfoList.add(typeInfoDrug);
            map.put("isDrug", 2);
            int count = orderMapper.getOrderInpatListByPersonIdCount(map);
            TypeInfo typeInfo = new TypeInfo("2", "非药品", count);
            typeInfoList.add(typeInfo);
            if (CollectionUtils.isNotEmpty(typeInfoList)) {
                responseBean.setTotal(typeInfoList.size());
                responseBean.setRows(typeInfoList);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("统计医嘱数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计医嘱数据出现错误！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean getOrderCategoryByPersonIdOrEncounterId(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("encounterId", encounterId);
        map.put("personId", personId);
        ResponseBean responseBean = new ResponseBean();
        try {
            List<Hdsd001501> list = orderMapper.getOrderCategoryByPersonIdOrEncounterId(map);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setTotal(list.size());
                responseBean.setRows(list);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("查询医嘱类别数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("查询医嘱类别数据出现错误！");
        }
        return responseBean;
    }
}
