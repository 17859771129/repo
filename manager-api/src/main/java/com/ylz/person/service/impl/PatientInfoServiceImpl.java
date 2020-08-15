package com.ylz.person.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.common.tool.XmlUtil;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.dao.PatientInfoMapper;
import com.ylz.person.service.IPatientInfoService;
import com.ylz.person.vo.AddPatientBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("patientInfoService")
public class PatientInfoServiceImpl extends ServiceImpl<PatientInfoMapper, PatientInfo> implements IPatientInfoService {

    private static final Logger log = LoggerFactory.getLogger(PatientInfoServiceImpl.class);

    @Autowired
    private PatientInfoMapper patientInfoMapper;

    public boolean insertData(String xml) {
        AddPatientBean addPatientBean = new AddPatientBean();
        boolean isTrue = XmlUtil.setBeans(addPatientBean, xml);
        if (!isTrue) {
            return false;
        }
        PatientInfo patientInfo = setPatientInfo(addPatientBean);
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                //.eq(PatientInfo::getGlobalId, patientInfo.getGlobalId())
                .eq(PatientInfo::getPatientId, patientInfo.getPatientId())
                .eq(PatientInfo::getPatientDomainId, patientInfo.getPatientDomainId());
        PatientInfo hisPatient = this.getOne(queryWrapper, true);
        if (null == hisPatient) {
            patientInfoMapper.insert(patientInfo);
            return true;
        }
        patientInfoMapper.update(patientInfo, queryWrapper);
        return true;
    }

    private PatientInfo setPatientInfo(AddPatientBean addPatientBean) {
        PatientInfo patientInfo = new PatientInfo();
        BeanUtils.copyProperties(addPatientBean, patientInfo);
        patientInfo.setTelephone(addPatientBean.getPhoneNumber());
        return patientInfo;
    }


}
