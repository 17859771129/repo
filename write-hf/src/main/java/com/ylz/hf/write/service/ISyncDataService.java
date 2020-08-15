package com.ylz.hf.write.service;

public interface ISyncDataService {
    void syncAppointDoc(String docCode) throws Exception;

    void syncAllDoc() throws Exception;

}
