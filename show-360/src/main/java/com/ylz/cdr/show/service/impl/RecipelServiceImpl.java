package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.dao.DrugMapper;
import com.ylz.cdr.show.service.IRecipelService;
import com.ylz.cdr.show.vo.ChineseDrug;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.TypeInfo;
import com.ylz.cdr.show.vo.WestDrug;
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
 * Created by CodeGenerator on 2019/07/04.
 */
@Service
@Transactional
public class RecipelServiceImpl implements IRecipelService {

    private static final Logger log = LoggerFactory.getLogger(RecipelServiceImpl.class);
    @Resource
    private DrugMapper drugMapper;

    @Override
    public ResponseBean getChineseList(String personId, String encounterId, Integer page, Integer size) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            if (page <= 0 || size <= 0) {
                responseBean.setMessage("page or size 传参错误！");
                return responseBean;
            }
            int count = drugMapper.countChinese(map);
            int from = (page - 1) * size;
            if ((from >= count) && (count != 0)) {
                responseBean.setMessage("page or size 传参错误,大于数据存在最大数目！");
                return responseBean;
            }
            responseBean.setTotal(count);
            map.put("page", from);
            map.put("size", size);
            List<ChineseDrug> list = drugMapper.getChineseListByPersonId(map);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
            }
        } catch (Exception e) {
            log.error("查询中医处方数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("查询中医处方数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean getWestList(String personId, String encounterId, Integer page, Integer size) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = drugMapper.countWest(map);
            if (count == 0) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            if (page <= 0 || size <= 0) {
                responseBean.setMessage("page or size 传参错误！");
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
            List<WestDrug> list = drugMapper.getWestListByPersonId(map);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
            }
        } catch (Exception e) {
            log.error("统计西医处方数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计西医处方数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean countChineseList(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = drugMapper.countChinese(map);
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setTotal(count);
        } catch (Exception e) {
            log.error("统计中医处方数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计中医处方数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean countWestList(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = drugMapper.countWest(map);
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setTotal(count);
        } catch (Exception e) {
            log.error("统计西医处方数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计西医处方数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean countAll(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            List<TypeInfo> typeInfoList = new ArrayList<>();
            int count = drugMapper.countWest(map);
            TypeInfo typeInfoDrug = new TypeInfo("XY", "西医", count);
            typeInfoList.add(typeInfoDrug);
            int countChinese = drugMapper.countChinese(map);
            TypeInfo typeInfo = new TypeInfo("ZY", "中医", countChinese);
            typeInfoList.add(typeInfo);
            if (CollectionUtils.isNotEmpty(typeInfoList)) {
                responseBean.setTotal(typeInfoList.size());
                responseBean.setRows(typeInfoList);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("统计处方数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计处方数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean getVisitList(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            List<IndexInfo> list = drugMapper.getVisitByPersonId(map);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setTotal(list.size());
                responseBean.setRows(list);
            }
        } catch (Exception e) {
            log.error("查询就诊数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("查询就诊数据出错！");
        }
        return responseBean;
    }
}