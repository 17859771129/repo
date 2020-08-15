package com.ylz.cdr.show.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.vo.PatientParam;

public interface IPatientService {

    ResponseBean queryPatientInfo(PatientParam patientParam, int page, int size);

    PatientInfo getPatient(String globalId);
}
