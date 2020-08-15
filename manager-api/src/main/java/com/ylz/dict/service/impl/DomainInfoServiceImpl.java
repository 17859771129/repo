package com.ylz.dict.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.dict.bean.DomainInfo;
import com.ylz.dict.dao.DomainInfoMapper;
import com.ylz.dict.service.IDomainInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DomainInfoServiceImpl extends ServiceImpl<DomainInfoMapper, DomainInfo> implements IDomainInfoService {


    Map<String, List<DomainInfo>> listMap;

    Map<String, DomainInfo> mapInfo;
    @Autowired
    private DomainInfoMapper domainInfoMapper;

    public boolean mergeData(DomainInfo domainInfo) {
        QueryWrapper<DomainInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(DomainInfo::getDomainId, domainInfo.getDomainId());
        DomainInfo hisPatient = this.getOne(queryWrapper, true);
        if (null == hisPatient) {
            this.save(domainInfo);
            return true;
        }
        this.update(domainInfo, queryWrapper);
        return true;
    }

    public List<DomainInfo> getList(String code) {
        if (null != listMap && listMap.size() > 0) {
            return listMap.get(code);
        }
        getAllData();
        if (null == listMap || listMap.isEmpty()) {
            return null;
        }
        return listMap.get(code);
    }

    public DomainInfo getValue(String domainId) {
        if (null != mapInfo && (!mapInfo.isEmpty())) {
            return mapInfo.get(domainId);
        }
        getAllData();
        if (null == mapInfo || mapInfo.isEmpty()) {
            return null;
        }
        return mapInfo.get(domainId);
    }

    public List<DomainInfo> getAllData() {
        List<DomainInfo> domainInfoList = domainInfoMapper.selectList(new QueryWrapper<>());
        domainInfoList.forEach(domainInfo -> {
            mapInfo.put(domainInfo.getDomainId(), domainInfo);
        });
        listMap = domainInfoList.stream().collect(Collectors.groupingBy(DomainInfo::getParentDomainId));
        return domainInfoList;
    }
}