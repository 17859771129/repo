package com.ylz.cdr.write.service.impl;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.write.tool.XmlMapUtil;
import com.ylz.cdr.write.service.IAnalyService;
import com.ylz.cdr.write.service.IHdsdDataService;
import com.ylz.dict.service.IMetaConfigService;
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
public class AnalyServiceImpl implements IAnalyService {

    private static final Logger log = LoggerFactory.getLogger(AnalyServiceImpl.class);

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
                map.put("docUnique", uniqueId);
                map.put("docType", xdsType);
                map.put("docDomainId", domainId);
                map.put("docVersion", xdsVersion == null ? "" : xdsVersion);
                Class clazz = dataService.getSubBean(subXdsType);
                putInfo(subXdsType, map);
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


    public ResponseBean insertData(Map<String, Object> map, String empi, String encounterId) throws Exception {
        ResponseBean responseBean = new ResponseBean();
        String uniqueId = (String) map.get("docPipelineId");
        String xdsType = (String) map.get("loadType");
        String domainId = (String) map.get("docDomainId");
        String xdsVersion = (String) map.get("version");
        try {
            insertSubData(uniqueId, xdsType, domainId, xdsVersion, empi, encounterId, map);
            hdsdDataService.procHdsdData(uniqueId, xdsType, domainId, xdsVersion, empi, encounterId, map);
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("数据类型为：{},更新插入错误,{},{}", xdsType, e.getMessage(), e);
            throw new Exception("数据类型为：" + xdsType + ",更新插入错误！");
        }
        return responseBean;
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
        deleteMap.put("doc_pipeline_id", uniqueId);
        deleteMap.put("load_type", xdsType);
        deleteMap.put("doc_domain_id", domainId);
        deleteMap.put("version", xdsVersion == null ? "" : xdsVersion);
        return deleteMap;
    }

    @Override
    public void updateEmpi(DocIndex docIndex, String empi, String encounterId) throws Exception {
        hdsdDataService.updateEmpi(docIndex, empi, encounterId);
    }

    private void putInfo(String subXdsType, Map<String, String> map) {
        switch (subXdsType) {
            case "tdyListCddiag":
                map.put("diag_type", "中医病名");
                return;
            case "tdyListCsdiag":
                map.put("diag_type", "中医证候");
                return;
            case "tdyListCdiag":
                map.put("diag_type", "中医诊断");
                return;
            case "tdyListCdcdiag":
                map.put("diag_type", "修正诊断-中医诊断");
                return;
            case "tdyListCdwdiag":
                map.put("diag_type", "修正诊断-西医诊断");
                return;
            case "tdyListIcddiag":
                map.put("diag_type", "入院诊断-中医病名");
                return;
            case "tdyListIcsdiag":
                map.put("diag_type", "入院诊断-中医证候");
                return;
            case "tdyListIcdiag":
                map.put("diag_type", "入院诊断-中医诊断");
                return;
            case "tdyListIwdiag":
                map.put("diag_type", "入院诊断-西医诊断");
                return;
            case "tdyListIdiag":
                map.put("diag_type", "入院诊断");
                return;
            case "tdyListWodiag":
                map.put("diag_type", "其他西医诊断");
                return;
            case "tdyListDcmdiag":
                map.put("diag_type", "出院中医诊断-主病诊断");
                return;
            case "tdyListDcpdiag":
                map.put("diag_type", "出院中医诊断-主证诊断");
                return;
            case "tdyListDwmdiag":
                map.put("diag_type", "出院西医诊断-主要诊断");
                return;
            case "tdyListDwodiag":
                map.put("diag_type", "出院西医诊断-其他诊断");
                return;
            case "tdyListDcddiag":
                map.put("diag_type", "出院诊断-中医病名");
                return;
            case "tdyListDcsdiag":
                map.put("diag_type", "出院诊断-中医证候");
                return;
            case "tdyListDcdiag":
                map.put("diag_type", "出院诊断-中医诊断");
                return;
            case "tdyListDmdiag":
                map.put("diag_type", "出院诊断-主要诊断");
                return;
            case "tdyListDodiag":
                map.put("diag_type", "出院诊断-其他诊断");
                return;
            case "tdyListDwdiag":
                map.put("diag_type", "出院诊断-西医诊断");
                return;
            case "tdyListDdiag":
                map.put("diag_type", "出院诊断");
                return;
            case "tdyListPdcddiag":
                map.put("diag_type", "初步诊断-中医病名");
                return;
            case "tdyListPdcsdiag":
                map.put("diag_type", "初步诊断-中医证候");
                return;
            case "tdyListPdcdiag":
                map.put("diag_type", "初步诊断-中医诊断");
                return;
            case "tdyListPdwdiag":
                map.put("diag_type", "初步诊断-西医诊断");
                return;
            case "tdyListOper":
                map.put("oper_type", "手术");
                return;
            case "tdyListNurse":
                map.put("nurse_type", "护理操作");
                return;
            case "tdyListOnurse":
                map.put("nurse_type", "护理观察");
                return;
            case "tdyListQoper":
                map.put("oper_type", "拟手术");
                return;
            case "tdyListQanes":
                map.put("anes_type", "拟麻醉");
                return;
            case "tdyListObdiag":
                map.put("diag_type", "术前诊断");
                return;
            case "tdyListOadiag":
                map.put("diag_type", "术后诊断");
                return;
            case "tdyListDecdiag":
                map.put("diag_type", "死亡诊断-中医诊断");
                return;
            case "tdyListDewdiag":
                map.put("diag_type", "死亡诊断-西医诊断");
                return;
            case "tdyListDediag":
                map.put("diag_type", "死亡诊断");
                return;
            case "tdyListDiag":
                map.put("diag_type", "疾病诊断");
                return;
            case "tdyListPdiag":
                map.put("diag_type", "病理诊断");
                return;
            case "tdyListApcddiag":
                map.put("diag_type", "目前诊断-中医病名");
                return;
            case "tdyListApcsdiag":
                map.put("diag_type", "目前诊断-中医证候");
                return;
            case "tdyListApwdiag":
                map.put("diag_type", "目前诊断-西医诊断");
                return;
            case "tdyListEdcdiag":
                map.put("diag_type", "确定诊断-中医诊断");
                return;
            case "tdyListEdwdiag":
                map.put("diag_type", "确定诊断-西医诊断");
                return;
            case "tdyListSdwdiag":
                map.put("diag_type", "补充诊断-西医诊断");
                return;
            case "tdyListWdiag":
                map.put("diag_type", "西医诊断");
                return;
            case "tdyListIdcddiag":
                map.put("diag_type", "鉴别诊断-中医病名");
                return;
            case "tdyListIdcsdiag":
                map.put("diag_type", "鉴别诊断-中医证候");
                return;
            case "tdyListIdwdiag":
                map.put("diag_type", "鉴别诊断-西医诊断");
                return;
            case "tdyListCcsdiag":
                map.put("diag_type", "门(急)诊诊断-中医证候");
                return;
            case "tdyListCcdiag":
                map.put("diag_type", "门(急)诊诊断-中医诊断");
                return;
            case "tdyListCwdiag":
                map.put("diag_type", "门(急)诊诊断-西医诊断");
                return;
            case "tdyListCediag":
                map.put("diag_type", "门(急)诊诊断");
                return;
            case "tdyListAnes":
                map.put("anes_type", "麻醉");
                return;
            default:
                return;
        }
    }
}
