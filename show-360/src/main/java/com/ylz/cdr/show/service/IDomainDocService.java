package com.ylz.cdr.show.service;

import com.ylz.manager.bean.DomainDoc;

import java.util.List;
import java.util.Set;

public interface IDomainDocService {
    List<DomainDoc> queryList(String readDomainId);

    Set<String> getDocCodeList(String readDomainId);
}
