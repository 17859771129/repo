package com.ylz.manager.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerDoc;

import java.util.List;
import java.util.Map;

public interface IDocService {
    ResponseBean pageDoc(String enableFlag, Integer page, Integer size);

    ResponseBean listDoc(String enableFlag);

    void updateDoc(ManagerDoc managerDoc);

    void addDoc(ManagerDoc managerDoc);

    List<ManagerDoc> getDocList();

    String getType(String docCode);

    Map<String, List<ManagerDoc>> getHfDocMap();

    Map<String, List<ManagerDoc>> getTypeMap();

    void reset();

}
