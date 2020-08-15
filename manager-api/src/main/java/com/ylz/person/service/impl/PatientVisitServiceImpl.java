package com.ylz.person.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.common.tool.XmlUtil;
import com.ylz.person.bean.PatientVisit;
import com.ylz.person.dao.PatientVisitMapper;
import com.ylz.person.vo.AddPatientVisitBean;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class PatientVisitServiceImpl extends ServiceImpl<PatientVisitMapper, PatientVisit> {

    private static final Logger log = LoggerFactory.getLogger(PatientInfoServiceImpl.class);

    public boolean insertData(String xml) {
        AddPatientVisitBean addPatientVisitBean = new AddPatientVisitBean();
        boolean isTrue = XmlUtil.setBeans(addPatientVisitBean, xml);
        if (!isTrue) {
            return false;
        }
        PatientVisit patientVisit = setPatientVisit(addPatientVisitBean);
        QueryWrapper<PatientVisit> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                //.eq(PatientVisit::getGlobalId, patientVisit.getGlobalId())
                .eq(PatientVisit::getVisitId, patientVisit.getVisitId())
                .eq(PatientVisit::getPatientCategoryCode, patientVisit.getPatientCategory())
                .eq(PatientVisit::getVisitDomainId, patientVisit.getVisitDomainId());
        PatientVisit hisPatient = this.getOne(queryWrapper, true);
        if (null == hisPatient) {
            this.save(patientVisit);
            return true;
        }
        patientVisit.setPk(hisPatient.getPk());
        this.update(patientVisit, queryWrapper);
        return true;
    }

    private PatientVisit setPatientVisit(AddPatientVisitBean addPatientVisitBean) {
        PatientVisit patientVisit = new PatientVisit();
        BeanUtils.copyProperties(addPatientVisitBean, patientVisit);
        String patientType = null;

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
        return patientVisit;
    }

    private String dateTrans(String date) {
        date = date.replaceAll("-", "").replaceAll(":", "").replaceAll(" ", "");
        date = date.substring(0, 14);
        return date;
    }
}
