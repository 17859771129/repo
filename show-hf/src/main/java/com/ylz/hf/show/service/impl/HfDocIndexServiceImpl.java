package com.ylz.hf.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.Constants;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.dao.DocIndexMapper;
import com.ylz.hf.show.vo.HfDocIndexVo;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service("hfDocIndexService")
public class HfDocIndexServiceImpl extends ServiceImpl<DocIndexMapper, DocIndex> {

    @Autowired
    private DocIndexMapper hfDocIndexMapper;

    public List<HfDocIndexVo> queryIndex(String globalId, String xdsType, String startTime, String endTime, String agencyName) {
        QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(DocIndex::getXdsType, xdsType)
                .eq(DocIndex::getGlobalId, globalId)
                .eq(DocIndex::getCdaStatus, Constants.SUCCESS_STATUS);
        if (StringUtils.isNotEmpty(startTime)) {
            queryWrapper.lambda()
                    .like(DocIndex::getAgencyName, agencyName);
        }
        if (StringUtils.isNotEmpty(startTime)) {
            queryWrapper.lambda()
                    .le(DocIndex::getStartTime, startTime);
        }
        if (StringUtils.isNotEmpty(endTime)) {
            queryWrapper.lambda()
                    .gt(DocIndex::getStartTime, startTime);
        }
        queryWrapper.lambda()
                .orderByDesc(DocIndex::getStartTime);
        List<DocIndex> hfDocIndexList = this.list(queryWrapper);
        List<HfDocIndexVo> list = setHfDocInde(hfDocIndexList);
        return list;
    }

    private List<HfDocIndexVo> setHfDocInde(List<DocIndex> hfDocIndexList) {
        List<HfDocIndexVo> list = new ArrayList<>();
        hfDocIndexList.forEach(hfDocIndex -> {
            HfDocIndexVo hfDocIndexVo = new HfDocIndexVo();
            BeanUtils.copyProperties(hfDocIndex, hfDocIndexVo);
            hfDocIndexVo.setVisitTime(hfDocIndex.getStartTime());
            list.add(hfDocIndexVo);
        });
        return list;
    }


    public List<HfDocIndexVo> queryCdaIndex(String globalId, String xdsType, String startTime, String endTime, String agencyName, String visitDept) {
        List<Map<String, String>> hfDocIndexList = hfDocIndexMapper.queryIndex(globalId, xdsType, startTime, endTime, agencyName, visitDept);
        List<HfDocIndexVo> list = new ArrayList<>();
        hfDocIndexList.forEach(map -> {
            JSONObject jsonObject = JSONObject.fromObject(map);
            HfDocIndexVo hfDocIndexVo = (HfDocIndexVo) JSONObject.toBean(jsonObject, HfDocIndexVo.class);
            list.add(hfDocIndexVo);
        });
        return list;
    }
}
