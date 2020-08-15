package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.bean.Hdsd000502;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.dao.ExamMapper;
import com.ylz.cdr.show.service.IExamService;
import com.ylz.cdr.show.vo.ExamInfo;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.TypeInfo;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator on 2019/07/05.
 */
@Service
@Transactional
public class ExamServiceImpl implements IExamService {
    private static final Logger log = LoggerFactory.getLogger(ExamServiceImpl.class);
    @Resource
    private ExamMapper examMapper;

    @Override
    public List<TypeInfo> getExamCategorysByPersonIdAndEncounterId(String personId, String encounterId) {
        try {
            return examMapper.getExamCategorysByPersonIdAndEncounterId(encounterId, personId);
        } catch (Exception e) {
            log.error("查询检查类型出错，{}，{}", e.getMessage(), e);
        }
        return null;
    }

    @Override
    public ResponseBean getExamResultsByPersonId(String personId, String encounterId, String categoryCode, int page, int size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = examMapper.countByPersonId(personId, encounterId, categoryCode);
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
            List<ExamInfo> datas = examMapper.getExamResultsByPersonId(encounterId, personId, categoryCode, from, size);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isNotEmpty(datas)) {
                responseBean.setRows(datas);
            }
        } catch (Exception e) {
            log.error("获取检查结果出错，{}，{}", e.getMessage(), e);
        }

        return responseBean;
    }

    @Override
    public ResponseBean countByPersonId(String personId, String encounterId, String categoryCode) {
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = examMapper.countByPersonId(personId, encounterId, categoryCode);
            responseBean.setTotal(count);
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("统计检查数目出错，{}，{}", e.getMessage(), e);
        }

        return responseBean;
    }

    @Override
    public List<Hdsd000502> getExamResultComparisonByPersonIdAndcategoryCode(String personId, String categoryCode, Integer row) {
        try {
            return examMapper.getExamResultComparisonByPersonIdAndcategoryCode(categoryCode, personId, row);
        } catch (Exception e) {
            log.error("查询检查对比数据出错，{}，{}", e.getMessage(), e);
        }
        return null;
    }

    @Override
    public List<IndexInfo> getExamEncountersByPersonId(String personId, String encounterId) {
        try {
            return examMapper.getExamEncountersByPersonId(encounterId, personId);
        } catch (Exception e) {
            log.error("查询检查就诊数据出错，{}，{}", e.getMessage(), e);
        }
        return null;
    }
}
