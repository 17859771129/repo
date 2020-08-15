package com.ylz.cdr.write.service;

import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.common.ResponseBean;

import java.util.Map;

public interface IAnalyService {

    ResponseBean insertData(Map<String, Object> map, String empi, String encounterId) throws Exception;

    void updateEmpi(DocIndex docIndex, String empi, String encounterId) throws Exception;
}
