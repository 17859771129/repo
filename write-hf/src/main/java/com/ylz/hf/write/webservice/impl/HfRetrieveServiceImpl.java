package com.ylz.hf.write.webservice.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.common.CdrUtil;
import com.ylz.cdr.common.Constants;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.write.service.impl.HfDocIndexServiceImpl;
import com.ylz.hf.write.tool.XmlUtil;
import com.ylz.hf.write.vo.HfDocIndexRetrun;
import com.ylz.hf.write.vo.HfRetrieve;
import com.ylz.hf.write.vo.HfRetrieveReturn;
import com.ylz.hf.write.webservice.IHfRetrieveService;
import com.ylz.hf.write.webservice.IHfTemplateService;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.service.IDocService;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class HfRetrieveServiceImpl implements IHfRetrieveService {

    private static final Logger log = LoggerFactory.getLogger(HfMergeServiceImpl.class);
    @Autowired
    private HfDocIndexServiceImpl hfDocIndexService;
    @Value("${domain.id}")
    private String domainId;
    @Value("${doc.url.prefix}")
    private String docUrlPrefix;
    @Autowired
    private IHfTemplateService hfTemplateService;
    @Autowired
    private IDocService docService;

    public String retrieveData(String xml, String returnXmlName) {
        log.debug("接收参数是：{}", xml);
        if (StringUtils.isEmpty(xml)) {
            return "传入参数为空!";
        }
        HfRetrieve hfRetrieve = new HfRetrieve();
        boolean isTrue = XmlUtil.setBeans(hfRetrieve, xml);
        if (!isTrue) {
            return setErrorReturn(hfRetrieve, "注册消息失败!", returnXmlName);
        }
        try {
            if (CdrUtil.isNull(hfRetrieve.getDomainId(), hfRetrieve.getMessageId())) {
                log.error("必填字段为空");
                return setErrorReturn(hfRetrieve, "必填字段为空!", returnXmlName);
            }
            QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
            boolean isNotNull = false;
            if (StringUtils.isNotEmpty(hfRetrieve.getHealthCard())) {
                queryWrapper.lambda().eq(DocIndex::getHealthCard, hfRetrieve.getHealthCard());
                isNotNull = true;
            }
            if (StringUtils.isNotEmpty(hfRetrieve.getIdentityId())) {
                queryWrapper.lambda().eq(DocIndex::getIdentityId, hfRetrieve.getIdentityId());
                isNotNull = true;
            }
            if (StringUtils.isNotEmpty(hfRetrieve.getTitle())) {
                String xdsType = getXdsType(hfRetrieve.getTitle());
                queryWrapper.lambda().eq(DocIndex::getXdsType, xdsType);
                isNotNull = true;
            }
            if (!isNotNull) {
                log.error("传入参数全部为空，请检查参数！");
                return setErrorReturn(hfRetrieve, "传入参数全部为空，请检查参数!", returnXmlName);
            }
            List<DocIndex> docList = hfDocIndexService.list(queryWrapper);
            return setReturn(hfRetrieve, docList, Constants.SUCCESS_STATUS, null, returnXmlName);
        } catch (Exception e) {
            log.error("注册消息失败：{}，{}", e.getMessage(), e);
            return setErrorReturn(hfRetrieve, "注册消息失败!", returnXmlName);
        }
    }

    private String getXdsType(String title) {
        List<ManagerDoc> hfDocList = docService.getHfDocMap().get(title);
        if (CollectionUtils.isEmpty(hfDocList)) {
            log.error("类型不存在！");
            return null;
        }
        ManagerDoc hfDoc = hfDocList.get(0);
        return hfDoc.getDocCode();
    }

    private String setErrorReturn(HfRetrieve hfRetrieve, String errorMessage, String xmlName) {
        return setReturn(hfRetrieve, null, Constants.FAILED_STATUS, errorMessage, xmlName);
    }

    private String setReturn(HfRetrieve hfRetrieve, List<DocIndex> docList, String status, String errorMessage, String xmlName) {
        HfRetrieveReturn hfReturn = setReturnInfo(hfRetrieve, docList, status, errorMessage);
        return hfTemplateService.setReturn(JSONObject.fromObject(hfReturn), xmlName);
    }

    private HfRetrieveReturn setReturnInfo(HfRetrieve hfRetrieve, List<DocIndex> hfDocIndices, String status, String errorMessage) {
        final HfRetrieveReturn hfReturn = new HfRetrieveReturn();
        hfReturn.setStatus(status);
        hfReturn.setSenderId(UUID.randomUUID().toString());
        hfReturn.setSenderDomainId(domainId);
        hfReturn.setReceiveId(hfRetrieve.getMessageId());
        hfReturn.setReceiveDomainId(hfRetrieve.getDomainId());
        if (StringUtils.equals(Constants.FAILED_STATUS, status)) {
            hfReturn.setDetail(errorMessage);
            return hfReturn;
        }
        hfReturn.setDetail("success");
        if (CollectionUtils.isEmpty(hfDocIndices)) {
            return hfReturn;
        }
        List<HfDocIndexRetrun> list = new ArrayList<>();
        for (DocIndex hfDocIndex : hfDocIndices) {
            HfDocIndexRetrun hfDocIndexRetrun = new HfDocIndexRetrun(hfDocIndex, docUrlPrefix);
            list.add(hfDocIndexRetrun);
        }
        hfReturn.setList(list);
        return hfReturn;
    }

}
