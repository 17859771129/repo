package com.ylz.verify.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.verify.bean.VerifyConfigList;
import com.ylz.verify.dao.VerifyConfigListMapper;
import com.ylz.verify.service.IVerifyConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service("verifyConfigService")
public class VerifyConfigServiceImpl implements IVerifyConfigService {

    private Map<String, List<VerifyConfigList>> verifyConfigMap;
    @Autowired
    private VerifyConfigListMapper verifyConfigListMapper;

    public List<VerifyConfigList> getVerifyConfigList(String code) {
        if (null != verifyConfigMap && verifyConfigMap.size() > 0) {
            return verifyConfigMap.get(code);
        }
        selectByData();
        if (null == verifyConfigMap || verifyConfigMap.isEmpty()) {
            return null;
        }
        return verifyConfigMap.get(code);
    }


    public void selectByData() {
        List<VerifyConfigList> configList = verifyConfigListMapper.selectList(new QueryWrapper<>());
        verifyConfigMap = configList.stream().collect(Collectors.groupingBy(VerifyConfigList::getCdaType));
    }
}
