package com.ylz.hf.write.webservice.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.common.CdrUtil;
import com.ylz.cdr.common.Constants;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.write.service.impl.FileServiceImpl;
import com.ylz.hf.write.service.impl.HfAccessLogServiceImpl;
import com.ylz.hf.write.service.impl.HfDocIndexServiceImpl;
import com.ylz.hf.write.tool.XmlUtil;
import com.ylz.hf.write.vo.HfAccess;
import com.ylz.hf.write.vo.HfAccessReturn;
import com.ylz.hf.write.webservice.IHfAccessService;
import com.ylz.hf.write.webservice.IHfTemplateService;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class HfAccessServiceImpl implements IHfAccessService {
    private static final Logger log = LoggerFactory.getLogger(HfAccessServiceImpl.class);
    @Autowired
    private HfAccessLogServiceImpl hfAccessLogService;
    @Autowired
    private HfDocIndexServiceImpl hfDocIndexService;
    @Value("${domain.id}")
    private String domainId;
    @Value("${doc.url.prefix}")
    private String docUrlPrefix;
    @Autowired
    private IHfTemplateService hfTemplateService;
    @Autowired
    private FileServiceImpl fileService;

    public String accessData(String xml, String returnXmlName) {
        Date receiveDate = new Date();
        log.debug("接收参数是：{}", xml);
        if (StringUtils.isEmpty(xml)) {
            return "传入参数为空!";
        }
        HfAccess hfAccess = new HfAccess();
        boolean isTrue = XmlUtil.setBeans(hfAccess, xml);
        if (!isTrue) {
            return setErrorReturn(hfAccess, returnXmlName);
        }
        String status = Constants.FAILED_STATUS;
        try {
            if (CdrUtil.isNull(hfAccess.getDomainId(), hfAccess.getMessageId())) {
                log.error("必填字段为空");
                return setErrorReturn(hfAccess, returnXmlName);
            }
            QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
            boolean isNotNull = false;
            if (StringUtils.isNotEmpty(hfAccess.getRepositoryUniqueId())) {
                queryWrapper.lambda().eq(DocIndex::getRepositoryUniqueId, hfAccess.getRepositoryUniqueId());
                isNotNull = true;
            }
            if (StringUtils.isNotEmpty(hfAccess.getUniqueId())) {
                queryWrapper.lambda().eq(DocIndex::getUniqueId, hfAccess.getUniqueId());
                isNotNull = true;
            }
            if (!isNotNull) {
                log.error("传入参数全部为空，请检查参数！");
                return setErrorReturn(hfAccess, returnXmlName);
            }
            DocIndex hfDocIndex = hfDocIndexService.getOne(queryWrapper);
            String content = fileService.getBase64String(hfDocIndex.getCdaPath());
            if (StringUtils.isEmpty(content)) {
                log.error("通过路径：{}，获取文件转base64出错！", hfDocIndex.getCdaPath());
                return setErrorReturn(hfAccess, returnXmlName);
            }
            status = Constants.SUCCESS_STATUS;
            return setReturn(hfAccess, content, returnXmlName, status);
        } catch (Exception e) {
            log.error("注册消息失败：{}，{}", e.getMessage(), e);
            return setErrorReturn(hfAccess, returnXmlName);
        } finally {
            try {
                hfAccessLogService.save(hfAccess, xml, status, receiveDate);
            } catch (Exception e) {
                log.error("数据保存到日志表失败，{}，{}", e.getMessage(), e);
            }
        }
    }

    private String setErrorReturn(HfAccess hfAccess, String xmlName) {
        return setReturn(hfAccess, null, xmlName, Constants.FAILED_STATUS);
    }

    private String setReturn(HfAccess hfAccess, String content, String xmlName, String status) {
        HfAccessReturn hfReturn = setReturnInfo(hfAccess, content, status);
        return hfTemplateService.setReturn(JSONObject.fromObject(hfReturn), xmlName);
    }

    private HfAccessReturn setReturnInfo(HfAccess hfAccess, String content, String result) {
        final HfAccessReturn hfReturn = new HfAccessReturn();
        hfReturn.setStatus(result);
        hfReturn.setSenderId(UUID.randomUUID().toString());
        hfReturn.setSenderDomainId(domainId);
        hfReturn.setReceiveId(hfAccess.getMessageId());
        hfReturn.setReceiveDomainId(hfAccess.getDomainId());
        hfReturn.setRepositoryUniqueId(hfAccess.getRepositoryUniqueId());
        hfReturn.setUniqueId(hfAccess.getUniqueId());
        if (StringUtils.isNotEmpty(content)) {
            hfReturn.setContent(content);
        }
        return hfReturn;
    }
}
