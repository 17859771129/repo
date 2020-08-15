package com.ylz.hf.write.webservice.impl;

import com.ylz.hf.write.webservice.IHfAccessService;
import com.ylz.hf.write.webservice.IHfMergeService;
import com.ylz.hf.write.webservice.IHfRetrieveService;
import com.ylz.hf.write.webservice.IHfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import javax.xml.ws.BindingType;
import javax.xml.ws.soap.SOAPBinding;


@WebService(serviceName = "WebServiceService",//对外发布的服务名
        targetNamespace = "http://webservice.write.hf.ylz.com",//指定你想要的名称空间，通常使用使用包名反转
        endpointInterface = "com.ylz.hf.write.webservice.IHfService")
//服务接口全路径, 指定做SEI（Service EndPoint Interface）服务端点接口
@BindingType(SOAPBinding.SOAP12HTTP_BINDING)
@Component
public class HfServiceImpl implements IHfService {
    private static final Logger log = LoggerFactory.getLogger(HfServiceImpl.class);
    @Autowired
    private IHfMergeService hfMergeService;

    @Autowired
    private IHfRetrieveService hfRetrieveService;

    @Autowired
    private IHfAccessService hfAccessService;

    @Override
    public String insertHlhtData(String xml) {
        log.debug("insertHlht start");
        return hfMergeService.procData(xml, true);
    }

    @Override
    public String updateHlhtData(String xml) {
        log.debug("updateHlht start");
        return hfMergeService.procData(xml, false);
    }

    //检索接口
    @Override
    public String retrieveHlhtData(String xml) {
        log.debug("retrieveHlhtData start");
        return hfRetrieveService.retrieveData(xml, "hf-retrieve-return.xml");
    }


    //预判
    @Override
    public String accessPreHlhtData(String xml) {
        log.debug("accessPreHlhtData start");
        return hfRetrieveService.retrieveData(xml, "hf-accessPre-return.xml");
    }

    //调阅接口
    @Override
    public String accessHlhtData(String xml) {
        log.debug("accessHlhtData start");
        return hfAccessService.accessData(xml, "hf-access-return.xml");
    }


}
