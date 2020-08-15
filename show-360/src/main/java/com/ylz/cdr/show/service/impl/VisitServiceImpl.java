package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.dao.DiagMapper;
import com.ylz.cdr.show.service.IVisitService;
import com.ylz.person.dao.PatientVisitMapper;
import com.ylz.person.vo.VisitView;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("visitService")
public class VisitServiceImpl implements IVisitService {

    private static final Logger log = LoggerFactory.getLogger(VisitServiceImpl.class);

    @Autowired
    private PatientVisitMapper patientVisitMapper;
    @Autowired
    private DiagMapper diagMapper;

    @Override
    public ResponseBean queryByData(String personId, int page, int size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = patientVisitMapper.countByPersonId(personId, null, null);
            if (count == 0) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            responseBean.setTotal(count);
            if (page <= 0 || size <= 0) {
                responseBean.setMessage("page or size 传参错误！");
                return responseBean;
            }
            int from = (page - 1) * size;
            if ((from >= count) && (count != 0)) {
                responseBean.setMessage("page or size 传参错误,大于数据存在最大数目！");
                return responseBean;
            }
            List<VisitView> visitViews = patientVisitMapper.pageByPersonId(personId, from, size, null, null);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(visitViews)) {
                return responseBean;
            }
            responseBean.setRows(visitViews);
            return responseBean;
        } catch (Exception e) {
            log.error("查询患者personID为：{}，就诊信息出错！", personId, e.getMessage(), e);
            responseBean.setMessage("查询患者就诊信息出错！");
            return responseBean;
        }
    }

    @Override
    public ResponseBean queryAllByData(String personId, String encounterId) {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<VisitView> visitViews = patientVisitMapper.pageByPersonId(personId, 0, 0, null, encounterId);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(visitViews)) {
                return responseBean;
            }
            responseBean.setTotal(visitViews.size());
            responseBean.setRows(visitViews);
            return responseBean;
        } catch (Exception e) {
            log.error("查询患者personID为：{}，就诊信息出错！", personId, e.getMessage(), e);
            responseBean.setMessage("查询患者就诊信息出错！");
            return responseBean;
        }
    }

    @Override
    public ResponseBean queryByData(String personId, int page, int size, String startTime, String encounterId) {
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = patientVisitMapper.countByPersonId(personId, startTime, encounterId);
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
            List<VisitView> visitViews = patientVisitMapper.pageByPersonId(personId, from, size, startTime, encounterId);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(visitViews)) {
                return responseBean;
            }
            /*for (VisitView visitView : visitViews) {
                String encounterIdView = visitView.getEncounterId();
                String encounterType = visitView.getEncounterType();
                List<String> list = diagMapper.selectByPatient(personId, encounterIdView, encounterType);
                if(CollectionUtils.isNotEmpty(list)){
                    List<String> diaglist=new ArrayList<>();
                    for(String diag:list){
                        if(StringUtils.isNotEmpty(diag)){
                            diaglist.add(diag);
                        }
                    }
                    String join = String.join(",", diaglist);
                    visitView.setDiagnosis(join);
                }
            }*/
            responseBean.setRows(visitViews);
            return responseBean;
        } catch (Exception e) {
            log.error("查询患者personID为：{}，就诊信息出错！", personId, e.getMessage(), e);
            responseBean.setMessage("查询患者就诊信息出错！");
            return responseBean;
        }
    }
}
