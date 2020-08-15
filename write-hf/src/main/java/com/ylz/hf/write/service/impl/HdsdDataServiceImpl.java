package com.ylz.hf.write.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.Constants;
import com.ylz.common.bean.BaseBean;
import com.ylz.common.service.impl.DataServiceImpl;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.write.service.IHdsdDataService;
import com.ylz.hf.write.tool.XmlMapUtil;
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

        BaseMapper baseDao = dataService.getBaseDao(xdsType);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("unique_id", uniqueId);
        queryWrapper.eq("xds_type", xdsType);
        queryWrapper.eq("domain_id", domainId);
        queryWrapper.eq("xds_version", version == null ? "" : version);
        queryWrapper.ne("status", Constants.ABANDON_STATUS);
        Object hisData = baseDao.selectOne(queryWrapper);
        Class clazz = dataService.getBean(xdsType);
        map.put("empi", empi);
        map.put("encounterId", encounterId);
        String uploadTime = new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
        map.put("uploadTime", uploadTime);
        if (null == hisData) {
            Object insertO = XmlMapUtil.mapToModel(map, clazz);
            baseDao.insert(insertO);
        } else if (StringUtils.equals((String) map.get("status"), Constants.ABANDON_STATUS)) {
            Object insertO = XmlMapUtil.mapToModel(map, clazz);
            baseDao.insert(insertO);
        } else {
            if (hisData instanceof BaseBean) {
                Integer pk = ((BaseBean) hisData).getPk();
                map.put("pk", pk);
                Object insertO = XmlMapUtil.mapToModel(map, clazz);
                UpdateWrapper<BaseBean> queryWrapper1 = new UpdateWrapper<>();
                queryWrapper1.lambda()
                        .eq(BaseBean::getPk, pk);
                baseDao.update(insertO, queryWrapper);
            }
        }
    }

    public void updateEmpi(DocIndex docIndex, String empi, String encounterId) throws Exception {
        UpdateWrapper<BaseBean> updateWrapper = new UpdateWrapper<>();
        updateWrapper
                .set("empi", empi)
                .set("encounter_id", encounterId)
                .set("status", docIndex.getCdaStatus());
        updateWrapper.eq("unique_id", docIndex.getUniqueId())
                .eq("xds_type", docIndex.getXdsType())
                .eq("domain_id", docIndex.getDomainId())
                .eq("xds_version", docIndex.getXdsVersion() == null ? "" : docIndex.getXdsVersion())
                .ne("status", Constants.ABANDON_STATUS);
        ServiceImpl baseService = dataService.getBaseService(docIndex.getXdsType());
        baseService.update(updateWrapper);
    }
}
