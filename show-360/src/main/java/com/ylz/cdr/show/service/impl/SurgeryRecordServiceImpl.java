package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.bean.Hdsd000606;
import com.ylz.cdr.bean.TdyListDiag;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.dao.OperMapper;
import com.ylz.cdr.show.service.ISurgeryRecordService;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.SurgeryInfo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.beans.BeanCopier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/03.
 */
@Service
@Transactional
public class SurgeryRecordServiceImpl implements ISurgeryRecordService {

    private static final Logger log = LoggerFactory.getLogger(SurgeryRecordServiceImpl.class);
    @Resource
    private OperMapper operMapper;

    @Override
    public ResponseBean getVisitListByPersonId(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            List<IndexInfo> list = operMapper.getVisitListByPersonId(map);
            if (CollectionUtils.isNotEmpty(list)) {
                responseBean.setRows(list);
                responseBean.setTotal(list.size());
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
            return responseBean;
        } catch (Exception e) {
            log.error("获取手术索引数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取手术索引数据出错！");
        }
        return responseBean;
    }

    public ResponseBean getSurgeryRecordsByPersonId(String personId, String encounterId, int page, int size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            Map map = new HashMap();
            map.put("personId", personId);
            map.put("encounterId", encounterId);
            int count = operMapper.countByPersonId(map);
            if (count == 0) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            responseBean.setTotal(count);
            int from = 0;
            if (page > 0) {
                from = (page - 1) * size;
                if ((from >= count) && (count != 0)) {
                    responseBean.setMessage("page or size 传参错误,大于数据存在最大数目！");
                    return responseBean;
                }
            }
            map.put("from", from);
            map.put("size", size);
            List<Hdsd000606> hdsd000606List = operMapper.getOperByPersonId(map);
            List<SurgeryInfo> surgeryInfoList = new ArrayList<>();
            for (Hdsd000606 hdsd000606 : hdsd000606List) {
                Map<String, String> mapParam = new HashMap<>();
                mapParam.put("docDomain", hdsd000606.getDocDomainId());
                mapParam.put("docUnique", hdsd000606.getDocPipelineId());
                mapParam.put("docType", hdsd000606.getLoadType());
                mapParam.put("docVersion", hdsd000606.getVersion());
                SurgeryInfo surgeryInfo = new SurgeryInfo();
                final BeanCopier copier = BeanCopier.create(Hdsd000606.class, SurgeryInfo.class, false);
                copier.copy(hdsd000606, surgeryInfo, null);
                List<TdyListDiag> diagList = operMapper.getDiagList(mapParam);
                diagList.forEach(tdyListDiag -> {
                    if (StringUtils.equals(tdyListDiag.getDiagType(), "术前诊断")) {
                        surgeryInfo.setDiagCodeBefore(tdyListDiag.getDiagCode());
                        surgeryInfo.setDiagNameBefore(tdyListDiag.getDiagName());
                    }
                    if (StringUtils.equals(tdyListDiag.getDiagType(), "术后诊断")) {
                        surgeryInfo.setDiagCodeAfter(tdyListDiag.getDiagCode());
                        surgeryInfo.setDiagNameAfter(tdyListDiag.getDiagName());
                    }
                });
                surgeryInfoList.add(surgeryInfo);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isNotEmpty(surgeryInfoList)) {
                responseBean.setRows(surgeryInfoList);
            }
        } catch (Exception e) {
            log.error("获取手术数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("获取手术数据出错！");
        }

        return responseBean;
    }

    @Override
    public ResponseBean countByPersonId(String personId, String encounterId) {
        Map map = new HashMap();
        map.put("personId", personId);
        map.put("encounterId", encounterId);
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = operMapper.countByPersonId(map);
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setTotal(count);
            return responseBean;
        } catch (Exception e) {
            log.error("统计手术数据出错！");
            log.error(e.getMessage(), e);
            responseBean.setMessage("统计手术数据出错！");
        }
        return responseBean;
    }
}
