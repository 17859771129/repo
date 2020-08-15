package com.ylz.cdr.write.service;

import com.ylz.cdr.bean.DocIndex;

import java.util.Map;

public interface IHdsdDataService {

    void procHdsdData(String uniqueId, String docType, String domainId,
                      String version, String empi, String encounterId, Map<String, Object> map) throws Exception;

    void updateEmpi(DocIndex docIndex, String empi, String encounterId) throws Exception;
}
