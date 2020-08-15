package com.ylz.cdr.show.controller.manager;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.show.tool.BuildTree;
import com.ylz.cdr.show.tool.DomainInfoTree;
import com.ylz.cdr.show.tool.ResponseUtil;
import com.ylz.dict.bean.DomainInfo;
import com.ylz.dict.service.impl.DomainInfoServiceImpl;
import com.ylz.manager.bean.DomainDoc;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.dao.DomainDocMapper;
import com.ylz.manager.service.impl.DocServiceImpl;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/domain")
public class DomainIdController {

    @Autowired
    private DomainInfoServiceImpl domainInfoService;

    @Autowired
    private DocServiceImpl docService;

    @Autowired
    DomainDocMapper domainDocMapper;

    @PostMapping("/getList")
    public String getList(String domainName) {
        QueryWrapper<DomainInfo> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(domainName)) {
            queryWrapper.lambda().like(DomainInfo::getDomainName, domainName);
        }
        List<DomainInfo> list = domainInfoService.list(queryWrapper);
        List<DomainInfoTree> infoList = new ArrayList<>();
        list.forEach(item -> {
            DomainInfoTree domainInfoVo = getDomainInfo(item);
            infoList.add(domainInfoVo);
        });
        List<DomainInfoTree> domainInfoTrees = BuildTree.buildByRecursive(infoList);
        return ResponseUtil.genSuccessResult(domainInfoTrees);
    }


    @PostMapping("/queryDoc")
    public String queryDoc(String domainId) {
        if (StringUtils.isEmpty(domainId)) {
            return ResponseUtil.genFailString("domainId为空");
        }
        List<ManagerDoc> managerDocList = getDoc(domainId);
        if (CollectionUtils.isEmpty(managerDocList)) {
            return ResponseUtil.genSuccessResult(new ArrayList());
        }
        QueryWrapper<DomainDoc> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DomainDoc::getDomainId, domainId);
        List<DomainDoc> docList = domainDocMapper.selectList(queryWrapper);
        Map<String, List<DomainDoc>> collect = docList.stream().collect(Collectors.groupingBy(DomainDoc::getDocCode));
        List<Map<String, String>> mapList = new ArrayList<>();
        for (ManagerDoc managerDoc : managerDocList) {
            String docCode = managerDoc.getDocCode();
            Map<String, String> map = JSONObject.fromObject(managerDoc);
            String isAuth = "0";
            if (collect.containsKey(docCode)) {
                isAuth = "1";
            }
            map.put("isAuth", isAuth);
            mapList.add(map);
        }
        return ResponseUtil.genSuccessResult(mapList);
    }

    private List<ManagerDoc> getDoc(String domainId) {
        QueryWrapper<DomainInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DomainInfo::getDomainId, domainId);
        DomainInfo domainInfo = domainInfoService.getOne(queryWrapper);
        if (null != domainInfo && StringUtils.isNotEmpty(domainInfo.getParentDomainId())) {
            return docService.selectByDomainId(domainInfo.getParentDomainId());
        } else {
            return docService.list();
        }
    }

    @PostMapping(value = "/updateList", consumes = "application/json")
    public String updateList(@RequestBody JSONObject jsonObject) {
        Map<String, Object> columnMap = new HashMap<>();
        if (!jsonObject.containsKey("domainId")) {
            return ResponseUtil.genFailString("domainId参数未传入!");
        }
        String domainId = jsonObject.getString("domainId");
        if (StringUtils.isEmpty(domainId)) {
            return ResponseUtil.genFailString("domainId为空！");
        }
        columnMap.put("domain_id", domainId);
        domainDocMapper.deleteByMap(columnMap);
        if (!jsonObject.containsKey("docCode")) {
            return ResponseUtil.genSuccessResult(new ArrayList());
        }
        JSONArray docCodeArray = jsonObject.getJSONArray("docCode");
        if (CollectionUtils.isEmpty(docCodeArray)) {
            return ResponseUtil.genSuccessResult(new ArrayList());
        }
        DomainDoc domainDoc = new DomainDoc();
        domainDoc.setDomainId(domainId);
        Object[] docCode = docCodeArray.toArray();
        for (Object code : docCode) {
            domainDoc.setDocCode(String.valueOf(code));
            domainDocMapper.insert(domainDoc);
        }
        return ResponseUtil.genSuccessResult(new ArrayList());
    }


    public DomainInfoTree getDomainInfo(DomainInfo domainInfo) {
        DomainInfoTree domainInfoVo = new DomainInfoTree();
        BeanUtils.copyProperties(domainInfo, domainInfoVo);
        return domainInfoVo;
    }
}
