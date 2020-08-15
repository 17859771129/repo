package com.ylz.dict.service;

import com.ylz.dict.bean.DictInfo;

import java.util.List;

public interface IDictInfoService {

    String getValue(String dictCode, String code);


    List<DictInfo> getList(String dictCode);

    boolean mergeData(DictInfo dictInfo);
}
