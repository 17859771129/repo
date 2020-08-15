package com.ylz.cdr.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.show.service.IDomainDocService;
import com.ylz.manager.bean.DomainDoc;
import com.ylz.manager.dao.DomainDocMapper;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service("docmainDocService")
public class DocmainDocServiceImpl extends ServiceImpl<DomainDocMapper, DomainDoc> implements IDomainDocService {
    @Override
    public List<DomainDoc> queryList(String domainId) {
        QueryWrapper<DomainDoc> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DomainDoc::getDomainId, domainId);
        return this.list(queryWrapper);
    }

    @Override
    public Set<String> getDocCodeList(String readDomainId) {
        Set<String> codeList = new HashSet<>();
        List<DomainDoc> domainDocList = this.queryList(readDomainId);
        if (CollectionUtils.isEmpty(domainDocList)) {
            return codeList;
        }
        domainDocList.forEach(domainDoc -> {
            codeList.add(domainDoc.getDocCode());
        });
        return codeList;
    }
}
