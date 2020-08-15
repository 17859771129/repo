package com.ylz.hf.write.webservice.impl;

import com.ylz.cdr.common.Base64Util;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.write.service.impl.HfDocIndexServiceImpl;
import com.ylz.hf.write.service.impl.HfDocLogServiceImpl;
import com.ylz.hf.write.tool.XmlUtil;
import com.ylz.hf.write.vo.HfDocIndexVo;
import com.ylz.hf.write.vo.HfReturn;
import com.ylz.hf.write.webservice.IHfMergeService;
import com.ylz.hf.write.webservice.IHfTemplateService;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.service.IDocService;
import com.ylz.verify.bean.VerifyConfigList;
import com.ylz.verify.service.IVerifyConfigService;
import com.ylz.verify.tool.VerifyElement;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HfMergeServiceImpl implements IHfMergeService {


    private static final Logger log = LoggerFactory.getLogger(HfMergeServiceImpl.class);
    @Autowired
    private HfDocIndexServiceImpl hfDocIndexService;
    @Value("${domain.id}")
    private String domainId;
    @Value("${doc.url.prefix}")
    private String docUrlPrefix;
    @Value("${xsd.file.prefix}")
    private String xsdPrefix;
    @Autowired
    private IHfTemplateService hfTemplateService;
    @Autowired
    private HfDocLogServiceImpl hfDocLogService;
    @Autowired
    private IDocService docService;
    @Autowired
    private IVerifyConfigService verifyConfigService;

    /**
     * 处理数据
     *
     * @param xml
     * @param isInsert
     * @return
     */
    public String procData(String xml, boolean isInsert) {
        log.debug("接收参数是：{}", xml);
        if (StringUtils.isEmpty(xml)) {
            return "传入参数为空!";
        }
        HfDocIndexVo hfDocIndexVo = new HfDocIndexVo();
        boolean isTrue = XmlUtil.setBeans(hfDocIndexVo, xml);
        HfReturn hfReturn = null;
        String returnXmlName = "hf-return.xml";
        String status = Constants.FAILED_STATUS;
        if (!isTrue) {
            return setErrorReturn(hfDocIndexVo, "消息解析失败!");
        }
        String errorMessage = null;
        try {
            //非空校验、格式校验
            errorMessage = nonCheck(hfDocIndexVo);
            if (StringUtils.isNotEmpty(errorMessage)) {
                return setErrorReturn(hfDocIndexVo, errorMessage);
            }
            ResponseBean responseBean = hfDocIndexService.saveOrUpdateXds(hfDocIndexVo, isInsert, xml);
            if (Constants.SUCCESS_CODE.equalsIgnoreCase(responseBean.getCode())) {
                status = Constants.SUCCESS_STATUS;
            }
            hfReturn = setReturnInfo(hfDocIndexVo, (String) responseBean.getObject(), status, responseBean.getMessage());
            errorMessage = responseBean.getMessage();
            return hfTemplateService.setReturn(JSONObject.fromObject(hfReturn), returnXmlName);
        } catch (Exception e) {
            log.error("注册消息失败：{}，{}", e.getMessage(), e);
            return setErrorReturn(hfDocIndexVo, "注册消息失败!");
        } finally {
            try {
                String uniqueId = null;
                if (null != hfReturn) {
                    uniqueId = hfReturn.getRepositoryUniqueId();
                }
                hfDocLogService.save(hfDocIndexVo, uniqueId, xml, status, errorMessage);
            } catch (Exception e) {
                log.error("数据保存到日志表失败，{}，{}", e.getMessage(), e);
            }
        }
    }

    /**
     * 判断必填字段是否为空
     *
     * @param hfDocIndexVo
     * @return
     * @throws DocumentException
     */
    private String nonCheck(HfDocIndexVo hfDocIndexVo) throws DocumentException {
        StringBuffer errorMessage = new StringBuffer();
        ManagerDoc hfDoc = null;
        if (StringUtils.isEmpty(hfDocIndexVo.getMessageId())) {
            errorMessage.append("\n请求消息ID为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getDomainId())) {
            errorMessage.append("\n机构域ID为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getPatientId())) {
            errorMessage.append("\n患者标识为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getPatientName())) {
            errorMessage.append("\n患者姓名为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getHealthCard())) {
            errorMessage.append("\n居民健康卡号为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getIdentityId())) {
            errorMessage.append("\n居民身份证号为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getAgencyId())) {
            errorMessage.append("\n机构组织机构代码为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getAgencyName())) {
            errorMessage.append("\n机构名称为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getSubmitTime())) {
            errorMessage.append("\n提交时间为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getUniqueId())) {
            errorMessage.append("\n共享文档注册唯一标识符为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getSourceId())) {
            errorMessage.append("\n源文档ID为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getTitle())) {
            errorMessage.append("\n标题字段为空,");
        } else {
            List<ManagerDoc> hfDocList = docService.getHfDocMap().get(hfDocIndexVo.getTitle());
            if (CollectionUtils.isEmpty(hfDocList)) {
                errorMessage.append("\n").append(hfDocIndexVo.getTitle() + ":类型不存在,");
            }
            hfDoc = hfDocList.get(0);
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getCreateTime())) {
            errorMessage.append("\n创建时间为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getStartTime())) {
            errorMessage.append("\n活动服务开始时间为空,");
        }
        /*if(StringUtils.isEmpty(hfDocIndexVo.getAuthorDept())){
            errorMessage.append("负责人所属科室名称为空,");
        }*/
        if (StringUtils.isEmpty(hfDocIndexVo.getDocId())) {
            errorMessage.append("\n文档ID为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getDocType())) {
            errorMessage.append("\n文档类型为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getContent())) {
            errorMessage.append("\n文档内容为空,");
        } else {
            String xml = Base64Util.decodeToString(hfDocIndexVo.getContent());
            if (null != hfDoc) {
                List<VerifyConfigList> configList = verifyConfigService.getVerifyConfigList(hfDoc.getDocCode());
                String error = VerifyElement.setMetaXml(xml, configList);
                if (StringUtils.isNotEmpty(error)) {
                    errorMessage.append("\n文档内容解析后必填字段为空:");
                    errorMessage.append(error);
                }
            }
            /*ResponseBean responseBean=VerifyTool.verifyCdaData(xsdPrefix,xml);
            if(StringUtils.equals(Constants.ERROR_CODE,responseBean.getCode())){
                errorMessage.append("\n文档结构出错,").append(responseBean.getMessage());
            }*/

        }
        return errorMessage.toString();
    }

    private String setErrorReturn(HfDocIndexVo hfDocIndexVo, String errorMessage) {
        return setErrorReturn(hfDocIndexVo, null, errorMessage, Constants.FAILED_STATUS);
    }

    private String setErrorReturn(HfDocIndexVo hfDocIndexVo, String repositoryUniqueId, String errorMessage, String status) {
        HfReturn hfReturn = setReturnInfo(hfDocIndexVo, repositoryUniqueId, status, errorMessage);
        return hfTemplateService.setReturn(JSONObject.fromObject(hfReturn), "hf-return.xml");
    }

    private HfReturn setReturnInfo(HfDocIndexVo hfDocIndexVo, String repositoryUniqueId, String result, String errorMessage) {
        final HfReturn hfReturn = new HfReturn();
        hfReturn.setStatus(result);
        hfReturn.setSenderId(UUID.randomUUID().toString());
        hfReturn.setSenderDomainId(domainId);
        hfReturn.setReceiveId(hfDocIndexVo.getMessageId());
        hfReturn.setReceiveDomainId(hfDocIndexVo.getDomainId());
        if (StringUtils.equals(Constants.FAILED_STATUS, result)) {
            hfReturn.setDetail(errorMessage);
            return hfReturn;
        }
        hfReturn.setUniqueId(hfDocIndexVo.getUniqueId());
        hfReturn.setRepositoryUniqueId(repositoryUniqueId);
        hfReturn.setTitle(hfDocIndexVo.getTitle());
        hfReturn.setCreateTime(hfDocIndexVo.getCreateTime());
        hfReturn.setAuthorName(hfDocIndexVo.getAuthorName());
        hfReturn.setPatientId(hfDocIndexVo.getPatientId());
        hfReturn.setPatientName(hfDocIndexVo.getPatientName());
        hfReturn.setServerName(hfDocIndexVo.getServerName());
        hfReturn.setEpisodeId(hfDocIndexVo.getEpisodeId());
        hfReturn.setStartTime(hfDocIndexVo.getStartTime());
        hfReturn.setEndTime(hfDocIndexVo.getEndTime());
        hfReturn.setDeptName(hfDocIndexVo.getDeptName());
        hfReturn.setAdmissionName(hfDocIndexVo.getAdmissionName());
        hfReturn.setAdmissionType(hfDocIndexVo.getAdmissionType());
        hfReturn.setDiagnosisResult(hfDocIndexVo.getDiagnosisResult());
        String docUrl = new StringBuilder(docUrlPrefix).append(repositoryUniqueId).toString();
        hfReturn.setDocUrl(docUrl);
        hfReturn.setDetail("success");
        return hfReturn;
    }
}
