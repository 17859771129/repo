package com.ylz.cdr.write.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.write.vo.XdsInfoString;

public interface IXdsService {
    ResponseBean saveOrUpdateXds(XdsInfoString xdsInfoString, boolean isInsert, String sourceXml);

    String procData(String xml, boolean isInsert);
}
