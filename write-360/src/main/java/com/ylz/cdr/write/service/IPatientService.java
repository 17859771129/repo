package com.ylz.cdr.write.service;

import com.ylz.cdr.write.vo.AddPatientBean;

public interface IPatientService {

    String getEmpi(String patientId, String patientDomainId);

    boolean insertData(AddPatientBean patientBean);
}
