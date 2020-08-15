package com.ylz.hf.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.json.JsonUtils;
import com.ylz.common.bean.BaseBean;
import com.ylz.common.service.impl.DataServiceImpl;
import com.ylz.dict.service.IMetaConfigService;
import com.ylz.hf.show.service.IAnalyService;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AnalyServiceImpl implements IAnalyService {
    private static final Logger log = LoggerFactory.getLogger(AnalyServiceImpl.class);
    @Autowired
    private DataServiceImpl dataService;
    @Autowired
    private IMetaConfigService metaConfigService;

    @Override
    public JSONObject getData(String xdsType, String domainId, String uniqueId, String xdsVersion) throws Exception {
        BaseMapper baseDao = dataService.getBaseDao(xdsType);
        QueryWrapper<BaseBean> baseBeanQueryWrapper = new QueryWrapper<>();
        baseBeanQueryWrapper
                .eq("unique_id", uniqueId)
                .eq("xds_type", xdsType)
                .eq("domain_id", domainId)
                .eq("xds_version", xdsVersion == null ? "" : xdsVersion)
                .eq("status", Constants.SUCCESS_STATUS);
        Object object = baseDao.selectOne(baseBeanQueryWrapper);
        if (null == object) {
            return null;
        }
        JSONObject jsonObject = JsonUtils.toJson(object);
        Map<String, String> metaConfigMap = metaConfigService.getListList(xdsType);
        log.debug("xdsType:{},list为{}", xdsType, JSONObject.fromObject(metaConfigMap).toString());
        if (null == metaConfigMap) {
            return jsonObject;
        }
        QueryWrapper subBaseBeanQueryWrapper = new QueryWrapper<>();
        subBaseBeanQueryWrapper.eq("unique_id", uniqueId);
        subBaseBeanQueryWrapper.eq("xds_type", xdsType);
        subBaseBeanQueryWrapper.eq("domain_id", domainId);
        subBaseBeanQueryWrapper.eq("xds_version", xdsVersion == null ? "" : xdsVersion);
        for (String key : metaConfigMap.keySet()) {
            BaseMapper subBaseDao = dataService.getSubBaseDao(key);
            putDiagInfo(key, subBaseBeanQueryWrapper);
            List list = subBaseDao.selectList(subBaseBeanQueryWrapper);
            if (CollectionUtils.isNotEmpty(list)) {
                jsonObject.put(key, JsonUtils.toJsonString(list));
            }
        }
        return jsonObject;
    }

    private void putDiagInfo(String subXdsType, QueryWrapper subBaseBeanQueryWrapper) {
        switch (subXdsType) {
            case "tdyListCediag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-中医证候");
                return;
            case "tdyListDcddiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-中医病名");
                return;
            case "tdyListDcsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-中医证候");
                return;
            case "tdyListDiag":
                subBaseBeanQueryWrapper.eq("diag_type", "疾病诊断");
                return;
            case "tdyListDmdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-主要诊断");
                return;
            case "tdyListDodiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-其他诊断");
                return;
            case "tdyListDwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-西医诊断");
                return;
            case "tdyListEdcdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "确定诊断-中医诊断");
                return;
            case "tdyListEdwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "确定诊断-西医诊断");
                return;
            case "tdyListIwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "入院诊断-西医诊断");
                return;
            case "tdyListIcddiag":
                subBaseBeanQueryWrapper.eq("diag_type", "入院诊断-中医病名");
                return;
            case "tdyListIcsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "入院诊断-中医证候");
                return;
            case "tdyListPdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "病理诊断");
                return;
            case "tdyListNurse":
                subBaseBeanQueryWrapper.eq("nurse_type", "护理操作");
                return;
            case "tdyListOnurse":
                subBaseBeanQueryWrapper.eq("nurse_type", "护理观察");
                return;
            default:
                return;
        }
    }


}
