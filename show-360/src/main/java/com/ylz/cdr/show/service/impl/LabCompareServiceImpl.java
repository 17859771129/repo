package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.lab.bean.LabIndexCompare;
import com.ylz.cdr.lab.bean.LabItemInfo;
import com.ylz.cdr.lab.dao.LabItemInfoMapper;
import com.ylz.cdr.show.dao.LabCompareMapper;
import com.ylz.cdr.show.service.ILabCompareService;
import com.ylz.cdr.show.tool.ResponseUtil;
import com.ylz.cdr.show.vo.LabItemInfoVo;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("labCompareService")
public class LabCompareServiceImpl implements ILabCompareService {

    private static final Logger log = LoggerFactory.getLogger(LabCompareServiceImpl.class);


    @Autowired
    private LabCompareMapper labCompareMapper;

    @Autowired
    private LabItemInfoMapper labItemInfoMapper;

    @Override
    public ResponseBean deleteLabIndex(LabIndexCompare labIndexCompare) {
        ResponseBean responseBean = saveOrUpdate(labIndexCompare);
        if (null != responseBean) {
            return responseBean;
        }
        responseBean = new ResponseBean();
        try {
            labCompareMapper.deleteLabIndex(labIndexCompare);
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("删除检验指标比对数据出错,参数是{}，错误消息是{}，{}", JSONObject.fromObject(labIndexCompare), e.getMessage(), e);
            responseBean.setMessage("删除检验指标比对数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean insertLabIndex(LabIndexCompare labIndexCompare) {
        ResponseBean responseBean = saveOrUpdate(labIndexCompare);
        if (null != responseBean) {
            return responseBean;
        }
        responseBean = new ResponseBean();
        try {
            List<LabIndexCompare> compareList = labCompareMapper.queryData(labIndexCompare.getEmpi(), labIndexCompare.getItemCode(), labIndexCompare.getItemTypeCode());
            if (CollectionUtils.isNotEmpty(compareList)) {
                responseBean.setMessage("指标对比已经添加！");
                return responseBean;
            }
            labCompareMapper.insertLabIndex(labIndexCompare);
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("增加检验指标比对数据出错,参数是{}，错误消息是{}，{}", JSONObject.fromObject(labIndexCompare), e.getMessage(), e);
            responseBean.setMessage("增加检验指标比对数据出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean queryDict(String empi, String itemTypeCode, String isCompare) {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<LabItemInfo> labItemInfos = labItemInfoMapper.queryByUniqueId(itemTypeCode, null);
            if (CollectionUtils.isEmpty(labItemInfos)) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            Map<String, String> map = new HashMap<>();
            if (StringUtils.equals("1", isCompare)) {
                List<LabIndexCompare> labIndexCompareList = labCompareMapper.queryData(empi, null, itemTypeCode);
                if (CollectionUtils.isNotEmpty(labIndexCompareList)) {
                    labIndexCompareList.forEach(labIndexCompare -> {
                        map.put(labIndexCompare.getItemCode(), null);
                    });
                }
            }
            List<LabItemInfoVo> voInfoList = new ArrayList<>();
            labItemInfos.forEach(info -> {
                LabItemInfoVo labItemInfoVo = new LabItemInfoVo();
                BeanUtils.copyProperties(info, labItemInfoVo);
                if (map.containsKey(info.getItemCode())) {
                    labItemInfoVo.setIsCompare("1");
                }
                voInfoList.add(labItemInfoVo);
            });
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setRows(voInfoList);
            responseBean.setTotal(voInfoList.size());
        } catch (Exception e) {
            log.error("查询检验分类字典信息出错,{},{}", e.getMessage(), e);
            responseBean.setMessage("查询检验分类字典信息出错!");
        }
        return responseBean;
    }

    private ResponseBean saveOrUpdate(LabIndexCompare labIndexCompare) {
        if (StringUtils.isEmpty(labIndexCompare.getEmpi())) {
            return ResponseUtil.genFailResult("患者Id不能为空");
        }
        if (StringUtils.isEmpty(labIndexCompare.getItemTypeCode())) {
            return ResponseUtil.genFailResult("患者检验类型编码不能为空");
        }
        if (StringUtils.isEmpty(labIndexCompare.getItemCode())) {
            return ResponseUtil.genFailResult("患者检验项目编码不能为空");
        }
        return null;
    }
}
