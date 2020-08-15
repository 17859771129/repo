package com.ylz.cdr.write.webservice.impl;

import com.ylz.cdr.write.service.IXdsService;
import com.ylz.cdr.write.webservice.IWebService;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;


@WebService(serviceName = "WebServiceService",//对外发布的服务名
        targetNamespace = "http://webservice.write.cdr.ylz.com",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface = "com.ylz.cdr.write.webservice.IWebService")
//服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@Component
public class WebServiceImpl implements IWebService {
    private static final Logger log = LoggerFactory.getLogger(WebServiceImpl.class);
    @Autowired
    private IXdsService xdsService;

    @Override
    public String insertHlhtData(String xml) {
        log.debug("insertHlht start");
        return procData(xml, true);
    }

    @Override
    public String updateHlhtData(String xml) {
        log.debug("updateHlht start");
        return procData(xml, false);
    }

    private String procData(String xml, boolean isInsert) {
        log.debug("接收参数是：{}", xml);
        if (StringUtils.isEmpty(xml)) {
            return "传入参数为空!";
        }
        return xdsService.procData(xml, isInsert);
    }

}
