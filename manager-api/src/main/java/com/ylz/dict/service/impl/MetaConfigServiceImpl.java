package com.ylz.dict.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.dict.bean.MetaConfigList;
import com.ylz.dict.dao.MetaConfigListMapper;
import com.ylz.dict.service.IMetaConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service("metaConfigService")
public class MetaConfigServiceImpl implements IMetaConfigService {

    private Map<String, List<MetaConfigList>> metaConfigMap;
    private Map<String, Map<String, String>> metaConfigMapMap;
    @Autowired
    private MetaConfigListMapper metaConfigMapper;

    public List<MetaConfigList> getMetaConfigList(String code) {
        if (null != metaConfigMap && metaConfigMap.size() > 0) {
            return metaConfigMap.get(code);
        }
        selectByData();
        if (null == metaConfigMap || metaConfigMap.isEmpty()) {
            return null;
        }
        return metaConfigMap.get(code);
    }

    public Map<String, String> getListList(String code) {
        if (null != metaConfigMapMap && metaConfigMapMap.size() > 0) {
            return metaConfigMapMap.get(code);
        }
        selectListByData();
        if (null == metaConfigMapMap || metaConfigMapMap.isEmpty()) {
            return null;
        }
        return metaConfigMapMap.get(code);
    }


    public void selectByData() {
        List<MetaConfigList> metaConfigList = metaConfigMapper.selectList(new QueryWrapper<>());
        metaConfigMap = metaConfigList.stream().collect(Collectors.groupingBy(MetaConfigList::getCdaType));
    }

    public void selectListByData() {
        QueryWrapper<MetaConfigList> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(MetaConfigList::getIsList, "1");
        List<MetaConfigList> metaConfigList = metaConfigMapper.selectList(queryWrapper);
        Map<String, List<MetaConfigList>> metaConfigListMap = metaConfigList.stream().collect(Collectors.groupingBy(MetaConfigList::getCdaType));
        metaConfigMapMap = new HashMap<>();
        for (String cdaType : metaConfigListMap.keySet()) {
            List<MetaConfigList> list = metaConfigListMap.get(cdaType);
            Map<String, String> isFillList = new HashMap<>();
            for (MetaConfigList metaConfig : list) {
                isFillList.put(metaConfig.getColumnNameAlias(), metaConfig.getIsFill());
            }
            metaConfigMapMap.put(cdaType, isFillList);
        }
    }
}
