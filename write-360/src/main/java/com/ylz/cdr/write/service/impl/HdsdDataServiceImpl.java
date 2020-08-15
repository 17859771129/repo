package com.ylz.cdr.write.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.bean.BaseBean;
import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.write.tool.XmlMapUtil;
import com.ylz.cdr.write.service.IHdsdDataService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

@Service("hdsdDataService")
public class HdsdDataServiceImpl implements IHdsdDataService {

    @Autowired
    private DataServiceImpl dataService;


    public void procHdsdData(String uniqueId, String xdsType, String domainId,
                             String version, String empi, String encounterId, Map<String, Object> map) throws Exception {

        ServiceImpl baseService = dataService.getBaseService(xdsType);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("doc_pipeline_id", uniqueId);
        queryWrapper.eq("load_type", xdsType);
        queryWrapper.eq("doc_domain_id", domainId);
        queryWrapper.eq("version", version == null ? "" : version);
        queryWrapper.ne("status", Constants.ABANDON_STATUS);
        Object hisData = baseService.getOne(queryWrapper);
        Class clazz = dataService.getBean(xdsType);
        map.put("empi", empi);
        map.put("encounterId", encounterId);
        String uploadTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        map.put("uploadTime", uploadTime);
        if (null == hisData) {
            Object insertO = XmlMapUtil.mapToModel(map, clazz);
            baseService.save(insertO);
        } else if (StringUtils.equals((String) map.get("status"), Constants.ABANDON_STATUS)) {
            Object insertO = XmlMapUtil.mapToModel(map, clazz);
            baseService.save(insertO);
        } else {
            if (hisData instanceof BaseBean) {
                Integer pk = ((BaseBean) hisData).getPk();
                map.put("pk", pk);
                Object insertO = XmlMapUtil.mapToModel(map, clazz);
                UpdateWrapper<BaseBean> queryWrapper1 = new UpdateWrapper<>();
                queryWrapper1.lambda()
                        .eq(BaseBean::getPk, pk);
                baseService.update(insertO, queryWrapper);
            }
        }
    }

    public void updateEmpi(DocIndex docIndex, String empi, String encounterId) throws Exception {
        UpdateWrapper<BaseBean> updateWrapper = new UpdateWrapper<>();
        updateWrapper
                .set("empi", empi)
                .set("encounter_id", encounterId)
                .set("status", docIndex.getProcStatus());
        updateWrapper.eq("doc_pipeline_id", docIndex.getUniqueId())
                .eq("load_type", docIndex.getXdsType())
                .eq("doc_domain_id", docIndex.getDomainId())
                .eq("version", docIndex.getXdsVersion() == null ? "" : docIndex.getXdsVersion())
                .ne("status", Constants.ABANDON_STATUS);
        ServiceImpl baseService = dataService.getBaseService(docIndex.getXdsType());
        baseService.update(updateWrapper);
    }

}
