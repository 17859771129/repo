package com.ylz.cdr.write.service;

public interface ISyncDataService {
    void syncAppointDoc(String docCode) throws Exception;

    void syncAllDoc() throws Exception;

}
