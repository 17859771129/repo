package com.ylz.hf.write.service;

import com.ylz.hf.bean.DocIndex;

import java.util.Map;

public interface IHdsdDataService {

    void procHdsdData(String uniqueId, String docType, String domainId,
                      String version, String empi, String encounterId, Map<String, Object> map) throws Exception;

    void updateEmpi(DocIndex docIndex, String empi, String encounterId) throws Exception;
}
