package com.ylz.dict.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.dict.bean.DictInfo;
import com.ylz.dict.dao.DictInfoMapper;
import com.ylz.dict.service.IDictInfoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DictInfoServiceImpl extends ServiceImpl<DictInfoMapper, DictInfo> implements IDictInfoService {

    private static final Logger log = LoggerFactory.getLogger(DictInfoServiceImpl.class);
    private Map<String, Map<String, String>> rangeDataMap = new HashMap<>();
    Map<String, List<DictInfo>> listMap;
    @Autowired
    private DictInfoMapper dictInfoMapper;

    public List<DictInfo> getList(String code) {
        if (null != listMap && listMap.size() > 0) {
            return listMap.get(code);
        }
        selectByData();
        if (null == listMap || listMap.isEmpty()) {
            return null;
        }
        return listMap.get(code);
    }

    @Override
    public boolean mergeData(DictInfo dictInfo) {
        try {
            QueryWrapper<DictInfo> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda()
                    .eq(DictInfo::getDictCode, dictInfo.getDictCode())
                    .eq(DictInfo::getItemCode, dictInfo.getItemCode())
                    .eq(DictInfo::getDomainId, dictInfo.getDomainId());
            DictInfo hisData = this.getOne(queryWrapper);
            if (null != hisData) {
                this.update(dictInfo, queryWrapper);
            } else {
                this.save(dictInfo);
            }
            return true;
        } catch (Exception e) {
            log.error("新增或者修改字典出错，{}，{}", e.getMessage(), e);
        }
        return false;
    }

    public String getValue(String dictCode, String code) {
        if (null != rangeDataMap && rangeDataMap.size() > 0) {
            return rangeDataMap.get(dictCode).get(code);
        }
        selectListByData();
        if (null == rangeDataMap || rangeDataMap.isEmpty()) {
            return null;
        }
        return rangeDataMap.get(dictCode).get(code);
    }

    private void selectListByData() {
        listMap.forEach((key, value) -> {
            Map<String, String> stringMap = new HashMap<>();
            value.forEach(item -> {
                stringMap.put(item.getItemCode(), item.getItemName());
            });
            rangeDataMap.put(key, stringMap);
        });
    }


    private void selectByData() {
        List<DictInfo> metaConfigList = dictInfoMapper.selectList(new QueryWrapper<>());
        listMap = metaConfigList.stream().collect(Collectors.groupingBy(DictInfo::getDictCode));
    }
}