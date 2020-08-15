package com.ylz.cdr.write.service;

import com.ylz.cdr.common.ResponseBean;
import org.dom4j.Document;

public interface ICdaService {
    ResponseBean mergeCdaData(Document document, String domainId, String code, String uniqueId, String version, String patientId, boolean isSaveDocIndex) throws Exception;
}
