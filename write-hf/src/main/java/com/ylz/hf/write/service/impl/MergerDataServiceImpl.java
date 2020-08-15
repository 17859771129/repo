package com.ylz.hf.write.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.cdr.common.Constants;
import com.ylz.common.service.impl.DataServiceImpl;
import com.ylz.dict.service.IMetaConfigService;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.write.service.IAnalyService;
import com.ylz.hf.write.service.IHdsdDataService;
import com.ylz.hf.write.tool.XmlMapUtil;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("analyService")
public class MergerDataServiceImpl implements IAnalyService {
    private static final Logger log = LoggerFactory.getLogger(MergerDataServiceImpl.class);

    @Autowired
    private DataServiceImpl dataService;
    @Autowired
    private IHdsdDataService hdsdDataService;
    @Autowired
    private IMetaConfigService metaConfigService;
    @Autowired
    private SqlSessionTemplate sqlSessionTemplate;

    public void batchInsert(List<Map<String, String>> listMap,
                            String uniqueId, String xdsType, String domainId, String xdsVersion,
                            String empi, String encounterId, String subXdsType,
                            BaseMapper baseMapper) throws Exception {
        SqlSession session = sqlSessionTemplate.getSqlSessionFactory().openSession(ExecutorType.BATCH, false);
        try {
            for (int i = 0; i < listMap.size(); i++) {
                Map<String, String> map = listMap.get(i);
                map.put("empi", empi);
                map.put("encounterId", encounterId);
                map.put("uniqueId", uniqueId);
                map.put("xdsType", xdsType);
                map.put("domainId", domainId);
                map.put("xdsVersion", xdsVersion == null ? "" : xdsVersion);
                Class clazz = dataService.getSubBean(subXdsType);
                putDiagInfo(subXdsType, map);
                Object insertO = XmlMapUtil.mapToModel(map, clazz);
                baseMapper.insert(insertO);
                if (i % 1000 == 999 || i == listMap.size() - 1) {
                    session.commit();
                    session.clearCache();
                }
            }
        } catch (Exception e) {
            session.rollback();
            log.error("类型为：{},子类型为{},数据插入错误，错误信息为，{}，{}", xdsType, subXdsType, e.getMessage(), e);
            throw new Exception("类型为：" + xdsType + ",子类型为" + subXdsType + ",数据插入错误!");
        } finally {
            session.close();
        }
    }

    private void putDiagInfo(String subXdsType, Map<String, String> map) {
        switch (subXdsType) {
            case "tdyListCediag":
                map.put("diagType", "出院诊断-中医证候");
                return;
            case "tdyListDcddiag":
                map.put("diagType", "出院诊断-中医病名");
                return;
            case "tdyListDcsdiag":
                map.put("diagType", "出院诊断-中医证候");
                return;
            case "tdyListDiag":
                map.put("diagType", "疾病诊断");
                return;
            case "tdyListDmdiag":
                map.put("diagType", "出院诊断-主要诊断");
                return;
            case "tdyListDodiag":
                map.put("diagType", "出院诊断-其他诊断");
                return;
            case "tdyListDwdiag":
                map.put("diagType", "出院诊断-西医诊断");
                return;
            case "tdyListEdcdiag":
                map.put("diagType", "确定诊断-中医诊断");
                return;
            case "tdyListEdwdiag":
                map.put("diagType", "确定诊断-西医诊断");
                return;
            case "tdyListIwdiag":
                map.put("diagType", "入院诊断-西医诊断");
                return;
            case "tdyListIcddiag":
                map.put("diagType", "入院诊断-中医病名");
                return;
            case "tdyListIcsdiag":
                map.put("diagType", "入院诊断-中医证候");
                return;
            case "tdyListPdiag":
                map.put("diagType", "病理诊断");
                return;
            case "tdyListNurse":
                map.put("nurseType", "护理操作");
                return;
            case "tdyListOnurse":
                map.put("nurseType", "护理观察");
                return;
            default:
                return;
        }
    }

    public void insertData(Map<String, Object> map, String empi, String encounterId) throws Exception {
        String uniqueId = (String) map.get("uniqueId");
        String xdsType = (String) map.get("xdsType");
        String domainId = (String) map.get("domainId");
        String xdsVersion = (String) map.get("xdsVersion");
        try {
            insertSubData(uniqueId, xdsType, domainId, xdsVersion, empi, encounterId, map);
            hdsdDataService.procHdsdData(uniqueId, xdsType, domainId, xdsVersion, empi, encounterId, map);
        } catch (Exception e) {
            log.error("数据类型为：{},更新插入错误,{},{}", xdsType, e.getMessage(), e);
            throw new Exception("数据类型为：" + xdsType + ",更新插入错误！");
        }

    }


    public Object getData(String uniqueId, String xdsType, String domainId, String version) throws Exception {
        try {
            QueryWrapper queryWrapper = new QueryWrapper();
            queryWrapper.eq("unique_id", uniqueId);
            queryWrapper.eq("xds_type", xdsType);
            queryWrapper.eq("domain_id", domainId);
            queryWrapper.eq("xds_version", version == null ? "" : version);
            queryWrapper.ne("status", Constants.ABANDON_STATUS);
            BaseMapper baseDao = dataService.getBaseDao(xdsType);
            Object hisData = baseDao.selectOne(queryWrapper);
            return hisData;
        } catch (Exception e) {
            log.error("数据类型为：{},更新插入错误,{},{}", xdsType, e.getMessage(), e);
            throw new Exception("数据类型为：" + xdsType + ",读取错误！");
        }
    }

    @Override
    public List querySyncData(String xdsType, String syncStatus) throws Exception {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("status", syncStatus);
        IPage page = new Page(0, 50);
        BaseMapper baseDao = dataService.getBaseDao(xdsType);
        IPage iPage = baseDao.selectPage(page, queryWrapper);
        List list = iPage.getRecords();
        return list;
    }

    private void insertSubData(String uniqueId, String xdsType, String domainId, String xdsVersion, String empi, String encounterId, Map<String, Object> map) throws Exception {
        Map<String, String> metaConfigMap = metaConfigService.getListList(xdsType);
        if (null == metaConfigMap) {
            return;
        }
        Map<String, String> deleteMap = setDeleteMap(uniqueId, xdsType, domainId, xdsVersion);
        for (String key : metaConfigMap.keySet()) {
            BaseMapper subBaseDao = dataService.getSubBaseDao(key);
            String isFill = metaConfigMap.get(key);
            if (StringUtils.equals(isFill, "1")) {
                if (!map.containsKey(key)) {
                    throw new Exception("不存在" + key + "数据！");
                }
                subBaseDao.deleteByMap(deleteMap);
                List<Map<String, String>> mapList = (List<Map<String, String>>) map.get(key);
                batchInsert(mapList, uniqueId, xdsType, domainId, xdsVersion, empi, encounterId, key, subBaseDao);
            } else {
                subBaseDao.deleteByMap(deleteMap);
                if (map.containsKey(key)) {
                    List<Map<String, String>> mapList = (List<Map<String, String>>) map.get(key);
                    batchInsert(mapList, uniqueId, xdsType, domainId, xdsVersion, empi, encounterId, key, subBaseDao);
                }
            }
            map.remove(key);
        }

    }

    private Map<String, String> setDeleteMap(String uniqueId, String xdsType, String domainId, String xdsVersion) {
        Map<String, String> deleteMap = new HashMap<>();
        deleteMap.put("unique_id", uniqueId);
        deleteMap.put("xds_type", xdsType);
        deleteMap.put("domain_id", domainId);
        deleteMap.put("xds_version", xdsVersion == null ? "" : xdsVersion);
        return deleteMap;
    }

    @Override
    public void updateEmpi(DocIndex docIndex, String empi, String encounterId) throws Exception {
        hdsdDataService.updateEmpi(docIndex, empi, encounterId);
    }

}
