package com.ylz.cdr.write.service;

import com.ylz.manager.bean.ManagerDoc;

import java.util.List;
import java.util.Map;

public interface IManagerDocService {

    List<ManagerDoc> getManagerDocList();

    Map<String, List<ManagerDoc>> getManagerDocMap();
}
