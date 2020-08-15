package com.ylz.dict.service;

import com.ylz.dict.bean.MetaConfigList;

import java.util.List;
import java.util.Map;

public interface IMetaConfigService {

    List<MetaConfigList> getMetaConfigList(String code);

    Map<String, String> getListList(String code);
}
