package com.ylz.cdr.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.show.service.IHdsdDataService;
import org.springframework.stereotype.Service;

@Service("hdsdDataService")
public class HdsdDataServiceImpl implements IHdsdDataService {

    public Object queryData(BaseMapper baseMapper, String uniqueId, String docType, String domainId,
                            String version) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("", uniqueId);
        queryWrapper.eq("", docType);
        queryWrapper.eq("", domainId);
        queryWrapper.eq("", version);
        queryWrapper.eq("", Constants.ABANDON_STATUS);
        return baseMapper.selectOne(queryWrapper);
    }
}
