package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.lab.bean.LabIndexCompare;
import com.ylz.cdr.show.dao.LabCompareMapper;
import com.ylz.cdr.show.dao.TestMapper;
import com.ylz.cdr.show.service.ITestService;
import com.ylz.cdr.show.vo.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * Created by CodeGenerator on 2019/07/08.
 */
@Service
@Transactional
public class TestServiceImpl implements ITestService {

    private static final Logger log = LoggerFactory.getLogger(TestServiceImpl.class);
    @Resource
    private TestMapper testMapper;
    @Resource
    private LabCompareMapper labCompareMapper;

    @Override
    public ResponseBean getDCLabResultMasterListByPersonId(String personId, String encounterId, String inspectionCategoryCode, int page, int size) {
        ResponseBean responseBean = new ResponseBean();
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        try {
            int count = testMapper.countByPersonId(personId, encounterId, inspectionCategoryCode);
            responseBean.setTotal(count);
            if (count == 0) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            int from = 0;
            if (page > 0) {
                from = (page - 1) * size;
                if ((from >= count) && (count != 0)) {
                    responseBean.setMessage("page or size 传参错误,大于数据存在最大数目！");
                    return responseBean;
                }
            }
            map.put("from", from);
            map.put("size", size);
            List<Hdsd000501Vo> datas = testMapper.getDCLabResultMasterListByPersonId(map);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isNotEmpty(datas)) {
                responseBean.setRows(datas);
            }
        } catch (Exception e) {
            log.error("获取检验数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取检验数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean getPersonData(String personId, String inspectionCategoryCode, String isCompare) {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<TestCompareVo> datas = testMapper.getListByPersonIdAndCode(personId, inspectionCategoryCode);
            if (CollectionUtils.isEmpty(datas)) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            List<LabIndexCompare> labIndexCompareList = labCompareMapper.queryData(personId, inspectionCategoryCode, null);
            if (CollectionUtils.isEmpty(labIndexCompareList)) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                if (StringUtils.equals("1", isCompare)) {
                    return responseBean;
                }
                responseBean.setTotal(datas.size());
                responseBean.setRows(datas);
                return responseBean;
            }
            Map<String, List<LabIndexCompare>> compareMap = labIndexCompareList.stream().collect(Collectors.groupingBy(LabIndexCompare::getItemCode));
            datas.forEach(testCompareVo -> {
                List<TestInfoVo> testInfoVoList = new ArrayList<>();
                testCompareVo.getInfoList().forEach(info -> {
                    if (compareMap.containsKey(info.getItemCode())) {
                        info.setIsCompare("1");
                        testInfoVoList.add(info);
                    }
                });
                if (StringUtils.equals("1", isCompare)) {
                    testCompareVo.setInfoList(testInfoVoList);
                }
            });
            responseBean.setTotal(datas.size());
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setRows(datas);
        } catch (Exception e) {
            log.error("获取检验数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取检验数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean getLabResultEncounterListByPersonId(String personId, String encounterId, String inspectionCategoryCode) {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<IndexInfo> list = testMapper.getLabResultEncounterListByPersonId(personId, encounterId, inspectionCategoryCode);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
                responseBean.setTotal(list.size());
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
            return responseBean;
        } catch (Exception e) {
            log.error("获取检验索引数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取检验索引数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean count(String personId, String encounterId, String inspectionCategoryCode) {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<TypeInfo> list = testMapper.countCategory(personId, encounterId, inspectionCategoryCode);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
                responseBean.setTotal(list.size());
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
            return responseBean;
        } catch (Exception e) {
            log.error("统计检验数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计检验数据出错！");
        }
        return responseBean;
    }
}
