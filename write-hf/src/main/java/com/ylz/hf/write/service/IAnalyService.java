package com.ylz.hf.write.service;

import com.ylz.hf.bean.DocIndex;

import java.util.List;
import java.util.Map;

public interface IAnalyService {

    void insertData(Map<String, Object> map, String empi, String encounterId) throws Exception;

    void updateEmpi(DocIndex docIndex, String empi, String encounterId) throws Exception;

    Object getData(String uniqueId, String xdsType, String domainId, String version) throws Exception;

    List querySyncData(String xdsType, String syncStatus) throws Exception;
}
