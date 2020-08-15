package com.ylz.manager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.dao.ManagerDocMapper;
import com.ylz.manager.service.IDocService;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DocServiceImpl extends ServiceImpl<ManagerDocMapper, ManagerDoc> implements IDocService {
    private static final Logger log = LoggerFactory.getLogger(DocServiceImpl.class);

    @Override
    public ResponseBean pageDoc(String enableFlag, Integer pageSize, Integer size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            Page<ManagerDoc> page = new Page<>(pageSize, size);
            QueryWrapper<ManagerDoc> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda().eq(ManagerDoc::getEnableFlag, enableFlag);
            IPage<ManagerDoc> iPage = this.page(page, queryWrapper);
            responseBean.setTotal((int) iPage.getTotal());
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setRows(iPage.getRecords());
        } catch (Exception e) {
            log.error("分页查询文书类型信息出错！", e.getMessage(), e);
            responseBean.setMessage("分页查询文书类型信息出错！");
        }
        return responseBean;
    }

    public List<ManagerDoc> selectByDomainId(String domainId) {
        return this.baseMapper.selectByDomainId(domainId);
    }

    @Override
    public ResponseBean listDoc(String enableFlag) {
        ResponseBean responseBean = new ResponseBean();
        try {
            QueryWrapper<ManagerDoc> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda().eq(ManagerDoc::getEnableFlag, enableFlag);
            List<ManagerDoc> managerDocList = this.list(queryWrapper);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(managerDocList)) {
                return responseBean;
            }
            responseBean.setTotal(managerDocList.size());
            responseBean.setRows(managerDocList);
        } catch (Exception e) {
            log.error("查询文书类型信息出错！", e.getMessage(), e);
            responseBean.setMessage("查询文书类型信息出错！");
        }
        return responseBean;
    }

    @Override
    public void updateDoc(ManagerDoc managerDoc) {
        this.updateById(managerDoc);
    }

    @Override
    public void addDoc(ManagerDoc managerDoc) {
        this.save(managerDoc);
    }


    private List<ManagerDoc> managerDocList;
    private Map<String, List<ManagerDoc>> managerDocMap;
    private Map<String, String> codeTypeMap;
    private Map<String, List<ManagerDoc>> typeMap;

    @PostConstruct
    public void init() {
        QueryWrapper<ManagerDoc> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(ManagerDoc::getEnableFlag, "1");
        managerDocList = this.list(queryWrapper);
        managerDocMap = new HashMap<>();
        typeMap = new HashMap<>();
        codeTypeMap = new HashMap<>();
        if (CollectionUtils.isNotEmpty(managerDocList)) {
            managerDocMap = managerDocList.stream().collect(Collectors.groupingBy(ManagerDoc::getDocCn));
            typeMap = managerDocList.stream().collect(Collectors.groupingBy(ManagerDoc::getDocCode));
            managerDocList.forEach(item -> {
                codeTypeMap.put(item.getDocCode(), item.getDocCategory());
            });
        }
    }

    public List<ManagerDoc> getDocList() {
        return managerDocList;
    }

    public String getType(String docCode) {
        return codeTypeMap.get(docCode);
    }


    public Map<String, List<ManagerDoc>> getHfDocMap() {
        return managerDocMap;
    }

    public Map<String, List<ManagerDoc>> getTypeMap() {
        return typeMap;
    }

    public void reset() {
        init();
    }
}
