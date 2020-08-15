package com.ylz.cdr.write.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.common.HttpRequestUtils;
import com.ylz.cdr.write.service.IVisitService;
import com.ylz.cdr.write.vo.AddPatientVisitBean;
import com.ylz.person.bean.PatientVisit;
import com.ylz.person.service.impl.PatientVisitServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class VisitServiceImpl implements IVisitService {

    private static final Logger log = LoggerFactory.getLogger(PatientServiceImpl.class);


    @Autowired
    private PatientVisitServiceImpl patientVisitService;
    @Value("${query.adt.url}")
    private String queryAdtUrl;

    public PatientVisit insertData(AddPatientVisitBean addPatientVisitBean) {
        PatientVisit patientVisit = setPatientVisit(addPatientVisitBean);
        QueryWrapper<PatientVisit> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(PatientVisit::getVisitId, patientVisit.getVisitId())
                .eq(PatientVisit::getVisitDomainId, patientVisit.getVisitDomainId())
                .eq(PatientVisit::getPatientCategoryCode, patientVisit.getPatientCategory());
        PatientVisit hisPatient = patientVisitService.getOne(queryWrapper);
        if (null == hisPatient) {
            patientVisitService.save(patientVisit);
            return patientVisit;
        }
        patientVisit.setPk(hisPatient.getPk());
        patientVisitService.update(patientVisit, queryWrapper);
        return patientVisit;
    }

    public PatientVisit getPatientVisit(Map<String, Object> map) {
        String visitId = null;
        String patientCategoryCode = null;
        if (map.containsKey("outPatientId") && null != map.get("outPatientId")) {
            visitId = String.valueOf(map.get("outPatientId"));
            patientCategoryCode = "1";
        } else if (map.containsKey("inpatient") && null != map.get("inpatient")) {
            visitId = String.valueOf(map.get("inpatient"));
            patientCategoryCode = "3";
        }
        if (StringUtils.isEmpty(visitId)) {
            log.error("门诊号或者住院号为空！");
            return null;
        }
        if (map.containsKey("patientTypecode") && null != map.get("patientTypecode") && StringUtils.isNotEmpty(String.valueOf(map.get("patientTypecode")))) {
            patientCategoryCode = String.valueOf(map.get("patientTypecode"));
        }
        return queryData(visitId, String.valueOf(map.get("docDomainId")), patientCategoryCode);
    }

    public PatientVisit queryData(String visitId, String visitDomainId, String patientCategoryCode) {
        QueryWrapper<PatientVisit> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(PatientVisit::getVisitId, visitId)
                .eq(PatientVisit::getVisitDomainId, visitDomainId)
                .eq(PatientVisit::getPatientCategoryCode, patientCategoryCode);
        PatientVisit patientVisit = patientVisitService.getOne(queryWrapper);
        if (null != patientVisit) {
            return patientVisit;
        }
        JSONObject paramJson = new JSONObject();
        paramJson.put("visitId", visitId);
        paramJson.put("visitDomainId", visitDomainId);
        paramJson.put("patientCategory", patientCategoryCode);
        JSONArray jsonArray = query(paramJson, queryAdtUrl);
        if (null == jsonArray || jsonArray.size() == 0) {
            log.error("查询不到患者就诊信息，查询条件为：{}", paramJson);
            return null;
        }
        if (jsonArray.size() > 1) {
            log.error("患者就诊信息多条，查询条件为：{}", paramJson);
            return null;
        }
        AddPatientVisitBean addPatientVisitBean = (AddPatientVisitBean) JSONObject.toBean(jsonArray.getJSONObject(0), AddPatientVisitBean.class);
        return insertData(addPatientVisitBean);
    }

    /**
     * 注册病人信息
     *
     * @param queryJson
     * @return
     */
    public JSONArray query(JSONObject queryJson, String url) {
        String result = HttpRequestUtils.getHttpPostForString(url, queryJson);
        log.debug("url is {},param is {},the return message is {}", url, queryJson, result);
        if (null == result || result.isEmpty()) {
            log.error("远程调用出错,url为{}，参数为{}", url, queryJson);
            log.error("返回值是{}", result);
            return null;
        }
        JSONArray jsonArray = JSONArray.fromObject(result);
        return jsonArray;
    }


    private PatientVisit setPatientVisit(AddPatientVisitBean addPatientVisitBean) {
        PatientVisit patientVisit = new PatientVisit();
        BeanUtils.copyProperties(addPatientVisitBean, patientVisit);
        String patientType = null;
        patientVisit.setGlobalId(addPatientVisitBean.getPatientGlobaleId());
        String visitDate = null;
        String visitDept = null;
        String visitDeptCode = null;
        String visitDoctor = null;
        String visitDoctorCode = null;
        String diagName = null;
        String diagCode = null;
        switch (addPatientVisitBean.getPatientCategory()) {
            case "1":
                patientType = "门诊";
                visitDate = dateTrans(patientVisit.getAdmitDate());
                patientVisit.setAdmitDate(visitDate);
                visitDept = patientVisit.getAdmitDeptName();
                visitDeptCode = patientVisit.getAdmitDeptCode();
                visitDoctor = addPatientVisitBean.getAdmitDiagnoseDoctor();
                visitDoctorCode = addPatientVisitBean.getAdmitDiagnoseDoctorCode();
                diagName = addPatientVisitBean.getAdmitDiagnoseName();
                diagCode = addPatientVisitBean.getAdmitDiagnoseCode();
                break;
            case "3":
                patientType = "住院";
                visitDate = dateTrans(patientVisit.getAdmissionDate());
                patientVisit.setAdmissionDate(visitDate);
                visitDept = patientVisit.getAdmissionDeptName();
                visitDeptCode = patientVisit.getAdmissionDeptCode();
                visitDoctor = addPatientVisitBean.getAdmissionDiagnoseDoctor();
                visitDoctorCode = addPatientVisitBean.getAdmissionDiagnoseDoctorCode();
                diagName = addPatientVisitBean.getAdmissionDiagnoseName();
                diagCode = addPatientVisitBean.getAdmissionDiagnoseCode();
                if (StringUtils.isNotEmpty(patientVisit.getLeaveDate())) {
                    patientVisit.setEmergencyDate(dateTrans(patientVisit.getEmergencyDate()));
                }
                break;
            case "2":
                patientType = "急诊";
                visitDate = dateTrans(patientVisit.getEmergencyDate());
                patientVisit.setEmergencyDate(visitDate);
                visitDept = patientVisit.getEmergencyDeptName();
                visitDeptCode = patientVisit.getEmergencyDeptCode();
                visitDoctor = addPatientVisitBean.getEmergencyDiagnoseDoctor();
                visitDoctorCode = addPatientVisitBean.getEmergencyDiagnoseDoctorCode();
                diagName = addPatientVisitBean.getEmergencyDiagnoseName();
                diagCode = addPatientVisitBean.getEmergencyDiagnoseCode();
                break;
            case "9":
                patientType = "其他";
                /*visitDate=patientVisit.getAdmitDate();
                visitDept=patientVisit.getAdmitDeptName();
                visitDeptCode=patientVisit.getAdmitDeptCode();*/
                if (StringUtils.isNotEmpty(patientVisit.getInspectDate())) {
                    patientVisit.setInspectDate(dateTrans(patientVisit.getInspectDate()));
                }
                if (StringUtils.isNotEmpty(patientVisit.getExaminationDate())) {
                    patientVisit.setExaminationDate(dateTrans(patientVisit.getExaminationDate()));
                }
                break;
        }
        patientVisit.setVisitDate(visitDate);
        patientVisit.setVisitDept(visitDept);
        patientVisit.setVisitDeptCode(visitDeptCode);
        patientVisit.setPatientCategoryCode(addPatientVisitBean.getPatientCategory());
        patientVisit.setPatientCategory(patientType);
        patientVisit.setVisitDoctor(visitDoctor);
        patientVisit.setVisitDoctorCode(visitDoctorCode);
        patientVisit.setDiagCode(diagCode);
        patientVisit.setDiagName(diagName);
        String encounterId = patientVisit.getVisitDomainId() + "_" + patientVisit.getVisitId() + "_" + patientVisit.getPatientCategoryCode();
        patientVisit.setEncounterId(encounterId);
        patientVisit.setGlobalId(addPatientVisitBean.getPatientGlobaleId());
        return patientVisit;
    }

    private String dateTrans(String date) {
        if (StringUtils.isEmpty(date)) {
            return date;
        }
        date = date.replaceAll("-", "").replaceAll(":", "").replaceAll(" ", "");
        date = date.substring(0, 14);
        return date;
    }
}
