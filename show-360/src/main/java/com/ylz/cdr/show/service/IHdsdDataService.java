package com.ylz.cdr.show.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

public interface IHdsdDataService {

    Object queryData(BaseMapper baseDao, String uniqueId, String docType, String domainId, String version);
}
