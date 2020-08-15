package com.ylz.cdr.write.webservice;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://webservice.write.cdr.ylz.com/")
public interface IWebService {
    @WebMethod
    String insertHlhtData(String xml);

    @WebMethod
    String updateHlhtData(String xml);
}
