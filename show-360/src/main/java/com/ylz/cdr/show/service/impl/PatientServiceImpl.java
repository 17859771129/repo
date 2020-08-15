package com.ylz.cdr.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IPatientService;
import com.ylz.common.tool.PageUtil;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.dao.PatientInfoMapper;
import com.ylz.person.vo.PatientParam;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("patientService")
public class PatientServiceImpl implements IPatientService {

    private static final Logger log = LoggerFactory.getLogger(PatientServiceImpl.class);

    @Autowired
    private PatientInfoMapper patientInfoMapper;

    @Override
    public ResponseBean queryPatientInfo(PatientParam patientParam, int page, int size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = patientInfoMapper.countByInfo(patientParam);
            if (count == 0) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            responseBean.setTotal(count);
            if (!PageUtil.setFromAndTo(page, size, count, patientParam)) {
                responseBean.setMessage("page or size 传参错误,大于数据存在最大数目！");
                return responseBean;
            }
            List<PatientInfo> patientInfoList = patientInfoMapper.queryByInfo(patientParam);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(patientInfoList)) {
                return responseBean;
            }
            responseBean.setRows(patientInfoList);
            return responseBean;
        } catch (Exception e) {
            log.error("查询患者信息出错！", e.getMessage(), e);
            responseBean.setMessage("查询患者信息出错！");
            return responseBean;
        }
    }

    @Override
    public PatientInfo getPatient(String globalId) {
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(PatientInfo::getGlobalId, globalId);
        PatientInfo patientInfo = patientInfoMapper.selectOne(queryWrapper);
        return patientInfo;
    }
}
