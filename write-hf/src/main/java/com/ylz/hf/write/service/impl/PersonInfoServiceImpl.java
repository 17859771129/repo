package com.ylz.hf.write.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.bean.PatientVisit;
import com.ylz.person.service.impl.PatientInfoServiceImpl;
import com.ylz.person.service.impl.PatientVisitServiceImpl;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service("personInfoService")
public class PersonInfoServiceImpl {

    private static final Logger log = LoggerFactory.getLogger(PersonInfoServiceImpl.class);

    @Autowired
    private PatientInfoServiceImpl patientInfoService;

    @Autowired
    private PatientVisitServiceImpl patientVisitService;

    public String getEmpi(Map<String, Object> map) {
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();
       /* queryWrapper.lambda()
                .eq(PatientInfo::getPatientName, map.get("patientName"));*/
        /*if (null != map.get("healthNo") && StringUtils.isNotEmpty(String.valueOf(map.get("healthNo")))) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getHealthFileNumber, map.get("healthNo"));
        }*/
        /*if (null != map.get("identifyNo") && StringUtils.isNotEmpty(String.valueOf(map.get("identifyNo")))) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getIdentityNo, map.get("identifyNo"));
        }
        if (null != map.get("idNum") && StringUtils.isNotEmpty(String.valueOf(map.get("idNum")))) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getIdentityNo, map.get("idNum"));
        }*/
        if (null != map.get("patientId") && StringUtils.isNotEmpty(String.valueOf(map.get("patientId")))) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getPatientId, map.get("patientId"));
        }
        if (null != map.get("patientDomain") && StringUtils.isNotEmpty(String.valueOf(map.get("patientDomain")))) {
            queryWrapper.lambda()
                    .eq(PatientInfo::getPatientDomainId, map.get("patientDomain"));
        }
        PatientInfo patientInfo = patientInfoService.getOne(queryWrapper, true);
        if (null == patientInfo) {
            log.error("patient_id为为：{},patient_domain为：{}，患者数据获取失败！", map.get("patientId"), map.get("patientDomain"));
            map.put("errorMessage", "patient_id为：" + map.get("patientId") + ",patient_domain为：" + map.get("patientDomain"));
            return null;
        }
        return patientInfo.getGlobalId();
    }


    public String getEncounterId(Map<String, Object> map, String empi) {
        if (StringUtils.isEmpty(empi)) {
            return null;
        }
        String visitId = null;
        if (map.containsKey("outPatientId") && null != map.get("outPatientId")) {
            visitId = String.valueOf(map.get("outPatientId"));
        }
        if (StringUtils.isEmpty(visitId) && map.containsKey("inpatient") && null != map.get("inpatient")) {
            visitId = String.valueOf(map.get("inpatient"));
        }
        if (StringUtils.isEmpty(visitId)) {
            log.error("门诊号和住院号都为空！");
            map.put("errorMessage", "门诊号和住院号都为空！");
            return null;
        }
        QueryWrapper<PatientVisit> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(PatientVisit::getVisitId, visitId)
                .eq(PatientVisit::getGlobalId, empi)
                .eq(PatientVisit::getVisitDomainId, map.get("visitDomainId"));
        PatientVisit patientVisit = patientVisitService.getOne(queryWrapper, true);
        if (null == patientVisit) {
            log.error("就诊号为：{},就诊域为：{},global_id为：{},就诊数据获取失败！", visitId, map.get("visitDomainId"), empi);
            map.put("errorMessage", "就诊号为：" + visitId + ",就诊域为：" + map.get("visitDomainId") + ",global_id为：" + empi + ",就诊数据获取失败！");
            return null;
        }
        return patientVisit.getEncounterId();
    }
}
