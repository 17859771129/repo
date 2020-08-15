package com.ylz.dict.service;

import com.ylz.dict.bean.DomainInfo;

import java.util.List;

public interface IDomainInfoService {

    List<DomainInfo> getList(String code);

    DomainInfo getValue(String domainId);

    List<DomainInfo> getAllData();
}
