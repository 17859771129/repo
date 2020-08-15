package com.ylz.hf.write.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://webservice.write.hf.ylz.com/")
public interface IHfService {
    @WebMethod
    String insertHlhtData(String xml);

    @WebMethod
    String updateHlhtData(String xml);

    @WebMethod
    String retrieveHlhtData(String xml);

    @WebMethod
    String accessPreHlhtData(String xml);

    @WebMethod
    String accessHlhtData(String xml);

}
