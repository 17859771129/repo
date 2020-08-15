package com.ylz.cdr.write.service;

import com.ylz.cdr.write.vo.AddPatientVisitBean;
import com.ylz.person.bean.PatientVisit;

import java.util.Map;

public interface IVisitService {

    PatientVisit insertData(AddPatientVisitBean addPatientVisitBean);

    PatientVisit getPatientVisit(Map<String, Object> map);

    PatientVisit queryData(String visitId, String visitDomainId, String patientCategoryCode);
}
