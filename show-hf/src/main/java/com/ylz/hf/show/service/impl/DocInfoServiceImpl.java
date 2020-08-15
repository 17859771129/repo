package com.ylz.hf.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.cda.bean.TdyListDrug;
import com.ylz.cda.dao.TdyListDrugMapper;
import com.ylz.cda.dao.TdyListOrderMapper;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.bean.InoculationInfo;
import com.ylz.hf.dao.InoculationInfoMapper;
import com.ylz.hf.show.service.IAnalyService;
import com.ylz.hf.show.service.IDocInfoService;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.service.IDocService;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocInfoServiceImpl implements IDocInfoService {

    private static final Logger log = LoggerFactory.getLogger(DocInfoServiceImpl.class);

    @Autowired
    private IDocService docService;

    @Autowired
    private HfDocIndexServiceImpl hfDocIndexService;

    @Autowired
    private IAnalyService analyService;

    @Autowired
    private TdyListDrugMapper tdyListDrugMapper;

    @Autowired
    private TdyListOrderMapper tdyListOrderMapper;

    @Autowired
    private InoculationInfoMapper inoculationInfoMapper;

    @Override
    public ResponseBean getDocInfo(Integer id, String xdsType, String domainId, String uniqueId, String xdsVersion, String showType) {
        ResponseBean responseBean = new ResponseBean();
        try {
            if (StringUtils.equals(showType, "CDA")) {
                return getCdaInfo(xdsType, domainId, uniqueId, xdsVersion);
            }
            if (StringUtils.isEmpty(showType)) {
                List<ManagerDoc> hfDocList = docService.getTypeMap().get(xdsType);
                if (CollectionUtils.isNotEmpty(hfDocList)) {
                    showType = hfDocList.get(0).getShowType();
                }
            }
            if (StringUtils.isNotEmpty(showType)) {
                String showPath = getShowPath(id, showType);
                if (StringUtils.isEmpty(showPath)) {
                    log.error("数据ID为：{}，默认展示类型为：{},文件路径不存在！", id, showType);
                    responseBean.setMessage("默认展示类型为：" + showType + ",文件路径不存在！");
                    return responseBean;
                }
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("type", showType);
                jsonObject.put("filePath", showPath);
                responseBean.setCode(Constants.SUCCESS_CODE);
                responseBean.setObject(jsonObject);
                return responseBean;
            }
            return getCdaInfo(xdsType, domainId, uniqueId, xdsVersion);
        } catch (Exception e) {
            log.error("查询DOC数据出错,{},{}", e.getMessage(), e);
            responseBean.setMessage("查询DOC数据出错");
            return responseBean;
        }
    }

    @Override
    public IPage<TdyListDrug> getWestInfo(String xdsType, String domainId,
                                          String uniqueId, String xdsVersion,
                                          Integer pageNum, Integer size) {
        QueryWrapper<TdyListDrug> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(TdyListDrug::getDomainId, domainId)
                .eq(TdyListDrug::getXdsType, xdsType)
                .eq(TdyListDrug::getUniqueId, uniqueId)
                .eq(TdyListDrug::getXdsVersion, xdsVersion);
        IPage<TdyListDrug> page = new Page<>(pageNum, size);
        IPage<TdyListDrug> pageInfo = tdyListDrugMapper.selectPage(page, queryWrapper);
        return pageInfo;
    }

    @Override
    public IPage<com.ylz.cda.bean.TdyListOrder> getOrderInfo(String xdsType, String domainId,
                                                             String uniqueId, String xdsVersion, String type,
                                                             Integer pageNum, Integer size) {
        QueryWrapper<com.ylz.cda.bean.TdyListOrder> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(com.ylz.cda.bean.TdyListOrder::getDomainId, domainId)
                .eq(com.ylz.cda.bean.TdyListOrder::getXdsType, xdsType)
                .eq(com.ylz.cda.bean.TdyListOrder::getUniqueId, uniqueId)
                .eq(com.ylz.cda.bean.TdyListOrder::getXdsVersion, xdsVersion);
        if (StringUtils.isEmpty(type) || StringUtils.equals("药品", type)) {
            queryWrapper.lambda().eq(com.ylz.cda.bean.TdyListOrder::getOrderType, "用药类医嘱");
        } else {
            queryWrapper.lambda().ne(com.ylz.cda.bean.TdyListOrder::getOrderType, "用药类医嘱");
        }
        IPage<com.ylz.cda.bean.TdyListOrder> page = new Page<>(pageNum, size);
        IPage<com.ylz.cda.bean.TdyListOrder> pageInfo = tdyListOrderMapper.selectPage(page, queryWrapper);
        return pageInfo;
    }

    @Override
    public IPage<InoculationInfo> getInoculationInfo(String xdsType, String domainId,
                                                     String uniqueId, String xdsVersion,
                                                     Integer pageNum, Integer size) {
        QueryWrapper<InoculationInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(InoculationInfo::getDomainId, domainId)
                .eq(InoculationInfo::getXdsType, xdsType)
                .eq(InoculationInfo::getUniqueId, uniqueId)
                .eq(InoculationInfo::getXdsVersion, xdsVersion);
        IPage<InoculationInfo> page = new Page<>(pageNum, size);
        IPage<InoculationInfo> pageInfo = inoculationInfoMapper.selectPage(page, queryWrapper);
        return pageInfo;
    }

    private ResponseBean getCdaInfo(String xdsType, String domainId, String uniqueId, String xdsVersion) throws Exception {
        ResponseBean responseBean = new ResponseBean();
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", "");
        JSONObject cdaJson = analyService.getData(xdsType, domainId, uniqueId, xdsVersion);
        if (null == cdaJson) {
            log.error("CDA拆分数据为空，参数为");
            responseBean.setMessage("数据为空！");
            return responseBean;
        }
        jsonObject.put("content", cdaJson);
        responseBean.setCode(Constants.SUCCESS_CODE);
        responseBean.setObject(jsonObject);
        return responseBean;
    }

    private String getShowPath(Integer id, String showType) {
        if (StringUtils.isEmpty(showType)) {
            return null;
        }
        DocIndex hfDocIndex = hfDocIndexService.getById(id);
        switch (showType) {
            case "PDF":
                return hfDocIndex.getPdfPath();
            case "HTML":
                return hfDocIndex.getHtmlPath();
            case "XML":
                return hfDocIndex.getCdaPath();
            default:
                return null;
        }
    }
}
