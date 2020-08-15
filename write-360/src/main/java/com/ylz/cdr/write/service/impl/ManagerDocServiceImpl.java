package com.ylz.cdr.write.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.write.service.IManagerDocService;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.dao.ManagerDocMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service("managerDocService")
public class ManagerDocServiceImpl implements IManagerDocService {

    private List<ManagerDoc> managerDocList;
    private Map<String, List<ManagerDoc>> managerDocMap;
    @Autowired
    private ManagerDocMapper managerDocMapper;

    @PostConstruct
    public void init() {
        QueryWrapper<ManagerDoc> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ManagerDoc::getEnableFlag, "1");
        managerDocList = managerDocMapper.selectList(queryWrapper);
        if (CollectionUtils.isEmpty(managerDocList)) {
            managerDocMap = new HashMap<>();
        } else {
            managerDocMap = managerDocList.stream().collect(Collectors.groupingBy(ManagerDoc::getDocCode));
        }
    }

    public List<ManagerDoc> getManagerDocList() {
        return managerDocList;
    }

    public Map<String, List<ManagerDoc>> getManagerDocMap() {
        return managerDocMap;
    }

}
