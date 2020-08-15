package com.ylz.cdr.show.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.dao.DocIndexMapper;
import com.ylz.cdr.show.service.IDocIndexService;
import com.ylz.person.dao.PatientVisitMapper;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;


/**
 * Created by CodeGenerator on 2019/07/04.
 */
@Service
@Transactional
public class DocIndexServiceImpl extends ServiceImpl<DocIndexMapper, DocIndex> implements IDocIndexService {

    private static final Logger log = LoggerFactory.getLogger(DocIndexServiceImpl.class);
    @Resource
    private DocIndexMapper docIndexMapper;
    @Resource
    private PatientVisitMapper patientVisitMapper;


    public ResponseBean getDocumentIndexEncountersByPersonId(String personId, String encounterId) {
        ResponseBean responseBean = new ResponseBean();
        try {
            Set<String> encounterIdSet = new HashSet<>();
            if (StringUtils.isEmpty(encounterId)) {
                encounterIdSet = getEncounterId(null, personId);
            } else {
                encounterIdSet.add(encounterId);
            }
            List<Map<String, Object>> list = patientVisitMapper.getVisitByPersonId(personId, encounterIdSet);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
                responseBean.setTotal(list.size());
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("获取所有就诊信息数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取所有就诊信息数据出现错误");
        }
        return responseBean;
    }

    @Override
    public ResponseBean getDocInfoListByPersonId(String personId, String encounterId, Set<String> codeList) {
        ResponseBean responseBean = new ResponseBean();
        try {
            Set<String> encounterIdSet = new HashSet<>();
            if (StringUtils.isEmpty(encounterId)) {
                encounterIdSet = getEncounterId(null, personId);
            } else {
                encounterIdSet.add(encounterId);
            }
            List<Map<String, Object>> indexInfoList = patientVisitMapper.getVisitByPersonId(personId, encounterIdSet);
            List<Map<String, Object>> docInfoReturnList = new ArrayList<>();
            for (Map<String, Object> indexInfo : indexInfoList) {
                QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
                queryWrapper.lambda().select(DocIndex::getVisitTime,
                        DocIndex::getXdsType,
                        DocIndex::getXdsName,
                        DocIndex::getFilePath,
                        DocIndex::getDomainId,
                        DocIndex::getUniqueId,
                        DocIndex::getXdsVersion);
                if (StringUtils.isNotEmpty(encounterId)) {
                    queryWrapper.lambda().eq(DocIndex::getEncounterId, encounterId);
                }
                if (CollectionUtils.isNotEmpty(codeList)) {
                    queryWrapper.lambda()
                            .in(DocIndex::getXdsType, codeList);
                }
                queryWrapper.lambda().eq(DocIndex::getEmpi, personId)
                        .eq(DocIndex::getProcStatus, Constants.SUCCESS_STATUS)
                        .orderByDesc(DocIndex::getVisitTime);
                List<DocIndex> docInfoList = this.list(queryWrapper);
                indexInfo.put("docInfoList", docInfoList);
                docInfoReturnList.add(indexInfo);
            }
            if (CollectionUtils.isNotEmpty(docInfoReturnList)) {
                responseBean.setRows(docInfoReturnList);
                responseBean.setTotal(docInfoReturnList.size());
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("获取所有文书索引信息数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取所有文书索引信息数据出现错误");
        }
        return responseBean;
    }


    @Override
    public ResponseBean countByPersonId(String personId, String encounterId) {
        ResponseBean responseBean = new ResponseBean();
        try {
            QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
            if (StringUtils.isNotEmpty(encounterId)) {
                queryWrapper.lambda().eq(DocIndex::getEncounterId, encounterId);
            }
            queryWrapper.lambda().eq(DocIndex::getEmpi, personId)
                    .eq(DocIndex::getProcStatus, Constants.SUCCESS_STATUS);
            int count = this.count(queryWrapper);
            responseBean.setTotal(count);
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("统计病历文书数据出现错误！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计病历文书数据出现错误");
        }
        return responseBean;
    }

    @Override
    public Set<String> getEncounterId(Set<String> codeList, String globalId) {
        QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
        if (CollectionUtils.isNotEmpty(codeList)) {
            queryWrapper.lambda()
                    .in(DocIndex::getXdsType, codeList);
        }
        queryWrapper.lambda()
                .eq(DocIndex::getProcStatus, Constants.SUCCESS_STATUS)
                .eq(DocIndex::getSyncStatus, Constants.CDA_SYNC_STATUS)
                .eq(DocIndex::getEmpi, globalId);
        List<DocIndex> list = this.list(queryWrapper);
        Set<String> encounterList = new HashSet<>();
        if (CollectionUtils.isEmpty(list)) {
            return encounterList;
        }
        list.forEach(docIndex -> {
            encounterList.add(docIndex.getEncounterId());
        });
        return encounterList;
    }
}

