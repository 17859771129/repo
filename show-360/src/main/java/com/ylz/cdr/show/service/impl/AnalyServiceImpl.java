package com.ylz.cdr.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.bean.BaseBean;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.json.JsonUtils;
import com.ylz.cdr.show.service.IAnalyService;
import com.ylz.dict.service.IMetaConfigService;
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
        ServiceImpl baseDao = dataService.getBaseService(xdsType);
        QueryWrapper<BaseBean> baseBeanQueryWrapper = new QueryWrapper<>();
        baseBeanQueryWrapper
                .eq("doc_pipeline_id", uniqueId)
                .eq("load_type", xdsType)
                .eq("doc_domain_id", domainId)
                .eq("version", xdsVersion == null ? "" : xdsVersion)
                .eq("status", Constants.SUCCESS_STATUS);
        Object object = baseDao.getOne(baseBeanQueryWrapper);
        if (null == object) {
            return null;
        }
        JSONObject jsonObject = JsonUtils.toJson(object);
        Map<String, String> metaConfigMap = metaConfigService.getListList(xdsType);
        if (null == metaConfigMap) {
            return jsonObject;
        }
        for (String key : metaConfigMap.keySet()) {
            BaseMapper subBaseDao = dataService.getSubBaseDao(key);
            QueryWrapper subBaseBeanQueryWrapper = new QueryWrapper<>();
            subBaseBeanQueryWrapper.eq("doc_unique", uniqueId);
            subBaseBeanQueryWrapper.eq("doc_domain_id", xdsType);
            subBaseBeanQueryWrapper.eq("doc_type", domainId);
            subBaseBeanQueryWrapper.eq("doc_version", xdsVersion == null ? "" : xdsVersion);
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
            case "tdyListCddiag":
                subBaseBeanQueryWrapper.eq("diag_type", "中医病名");
                return;
            case "tdyListCsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "中医证候");
                return;
            case "tdyListCdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "中医诊断");
                return;
            case "tdyListCdcdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "修正诊断-中医诊断");
                return;
            case "tdyListCdwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "修正诊断-西医诊断");
                return;
            case "tdyListIcddiag":
                subBaseBeanQueryWrapper.eq("diag_type", "入院诊断-中医病名");
                return;
            case "tdyListIcsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "入院诊断-中医证候");
                return;
            case "tdyListIcdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "入院诊断-中医诊断");
                return;
            case "tdyListIwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "入院诊断-西医诊断");
                return;
            case "tdyListIdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "入院诊断");
                return;
            case "tdyListWodiag":
                subBaseBeanQueryWrapper.eq("diag_type", "其他西医诊断");
                return;
            case "tdyListDcmdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院中医诊断-主病诊断");
                return;
            case "tdyListDcpdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院中医诊断-主证诊断");
                return;
            case "tdyListDwmdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院西医诊断-主要诊断");
                return;
            case "tdyListDwodiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院西医诊断-其他诊断");
                return;
            case "tdyListDcddiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-中医病名");
                return;
            case "tdyListDcsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-中医证候");
                return;
            case "tdyListDcdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断-中医诊断");
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
            case "tdyListDdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "出院诊断");
                return;
            case "tdyListPdcddiag":
                subBaseBeanQueryWrapper.eq("diag_type", "初步诊断-中医病名");
                return;
            case "tdyListPdcsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "初步诊断-中医证候");
                return;
            case "tdyListPdcdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "初步诊断-中医诊断");
                return;
            case "tdyListPdwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "初步诊断-西医诊断");
                return;
            case "tdyListOper":
                subBaseBeanQueryWrapper.eq("oper_type", "手术");
                return;
            case "tdyListNurse":
                subBaseBeanQueryWrapper.eq("nurse_type", "护理操作");
                return;
            case "tdyListOnurse":
                subBaseBeanQueryWrapper.eq("nurse_type", "护理观察");
                return;
            case "tdyListQoper":
                subBaseBeanQueryWrapper.eq("oper_type", "拟手术");
                return;
            case "tdyListQanes":
                subBaseBeanQueryWrapper.eq("anes_type", "拟麻醉");
                return;
            case "tdyListObdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "术前诊断");
                return;
            case "tdyListOadiag":
                subBaseBeanQueryWrapper.eq("diag_type", "术后诊断");
                return;
            case "tdyListDecdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "死亡诊断-中医诊断");
                return;
            case "tdyListDewdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "死亡诊断-西医诊断");
                return;
            case "tdyListDediag":
                subBaseBeanQueryWrapper.eq("diag_type", "死亡诊断");
                return;
            case "tdyListDiag":
                subBaseBeanQueryWrapper.eq("diag_type", "疾病诊断");
                return;
            case "tdyListPdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "病理诊断");
                return;
            case "tdyListApcddiag":
                subBaseBeanQueryWrapper.eq("diag_type", "目前诊断-中医病名");
                return;
            case "tdyListApcsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "目前诊断-中医证候");
                return;
            case "tdyListApwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "目前诊断-西医诊断");
                return;
            case "tdyListEdcdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "确定诊断-中医诊断");
                return;
            case "tdyListEdwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "确定诊断-西医诊断");
                return;
            case "tdyListSdwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "补充诊断-西医诊断");
                return;
            case "tdyListWdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "西医诊断");
                return;
            case "tdyListIdcddiag":
                subBaseBeanQueryWrapper.eq("diag_type", "鉴别诊断-中医病名");
                return;
            case "tdyListIdcsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "鉴别诊断-中医证候");
                return;
            case "tdyListIdwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "鉴别诊断-西医诊断");
                return;
            case "tdyListCcsdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "门(急)诊诊断-中医证候");
                return;
            case "tdyListCcdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "门(急)诊诊断-中医诊断");
                return;
            case "tdyListCwdiag":
                subBaseBeanQueryWrapper.eq("diag_type", "门(急)诊诊断-西医诊断");
                return;
            case "tdyListCediag":
                subBaseBeanQueryWrapper.eq("diag_type", "门(急)诊诊断");
                return;
            case "tdyListAnes":
                subBaseBeanQueryWrapper.eq("anes_type", "麻醉");
                return;
            default:
                return;
        }
    }

}
