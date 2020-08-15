package com.ylz.cdr.write.pre.service;

import com.ylz.cdr.common.ResponseBean;
import org.dom4j.Document;

public interface IPreConvDataService {
    ResponseBean procData(Document document, String type, String messageId) throws Exception;
}
