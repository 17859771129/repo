package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.dao.DiagMapper;
import com.ylz.cdr.show.service.IDiagService;
import com.ylz.cdr.show.vo.DiagInfo;
import com.ylz.cdr.show.vo.IndexInfo;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/02.
 */
@Service
@Transactional
public class DiagServiceImpl implements IDiagService {
    private static final Logger log = LoggerFactory.getLogger(DiagServiceImpl.class);
    @Resource
    private DiagMapper diagMapper;

    public ResponseBean getListByPersonId(String personId, String encounterId, Integer page, Integer size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            Map map = new HashMap();
            map.put("personId", personId);
            map.put("encounterId", encounterId);
            int count = diagMapper.countByPersonId(map);
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
            List<DiagInfo> list = diagMapper.getListByPersonId(map);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("获取诊断数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取诊断数据出现错误！");
        }
        return responseBean;
    }

    public ResponseBean countByPersonId(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = diagMapper.countByPersonId(map);
            responseBean.setTotal(count);
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("统计诊断数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计诊断数据出现错误！");
        }
        return responseBean;
    }

    public ResponseBean selectVisitList(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            List<IndexInfo> list = diagMapper.selectVisitList(map);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
                responseBean.setTotal(list.size());
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("获取就诊数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取就诊数据出现错误！");
        }
        return responseBean;
    }
}
