package com.ylz.hf.write.task;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ylz.cdr.common.Base64Util;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.write.kafka.KafkaServiceImpl;
import com.ylz.hf.write.service.ISyncDataService;
import com.ylz.hf.write.service.impl.FileServiceImpl;
import com.ylz.hf.write.service.impl.HfDocIndexServiceImpl;
import com.ylz.hf.write.service.impl.HfDocLogServiceImpl;
import com.ylz.hf.write.tool.DocIndexUtil;
import com.ylz.hf.write.tool.XmlUtil;
import com.ylz.hf.write.vo.HfDocIndexVo;
import com.ylz.log.bean.HfDocLog;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.service.IDocService;
import com.ylz.verify.bean.VerifyConfigList;
import com.ylz.verify.service.IVerifyConfigService;
import com.ylz.verify.tool.VerifyElement;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Component
public class ReSplitTask {
    private static final Logger log = LoggerFactory.getLogger(ReSplitTask.class);
    @Autowired
    public HfDocIndexServiceImpl hfDocIndexService;

    @Autowired
    public HfDocLogServiceImpl hfDocLogService;

    @Autowired
    private FileServiceImpl fileService;

    @Autowired
    private ISyncDataService syncDataService;

    @Value("${is.open}")
    private String isOpen;
    @Value("${is.empi.open}")
    private String isEmpiOpen;
    @Value("${is.retry.open}")
    private String isRetryOpen;
    @Value("${is.sync.open}")
    private String isSyncOpen;
    @Value("${xsd.file.prefix}")
    private String xsdPrefix;
    @Autowired
    private IDocService docService;
    @Autowired
    private IVerifyConfigService verifyConfigService;
    @Autowired
    private KafkaServiceImpl kafkaService;

    @Value("${split.status}")
    private String status;
    private List<String> statusList;
    @Value("${update.empi.type}")
    private String updateEmpiType;
    @Value("${sync.data.type}")
    private String syncType;

    @PostConstruct
    private List<String> getStatus() {
        if (CollectionUtils.isEmpty(statusList)) {
            statusList = Arrays.asList(status.split(","));
        }
        return statusList;
    }

    @Scheduled(cron = "0/10 * * * * *")
    public void splitData() {
        if (!Boolean.parseBoolean(isOpen)) {
            return;
        }
        log.info("do ReSplitTask!");
        QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .in(DocIndex::getCdaStatus, statusList)
                .isNotNull(DocIndex::getCdaPath);
        IPage<DocIndex> page = new Page<>(0, 50);//参数一是当前页，参数二是每页个数
        IPage<DocIndex> pageList = hfDocIndexService.page(page, queryWrapper);
        List<DocIndex> docIndexList = pageList.getRecords();
        if (CollectionUtils.isEmpty(docIndexList)) {
            log.info("文件全部拆分完成");
            return;
        }
        for (DocIndex docIndex : docIndexList) {
            FileInputStream inputStream = null;
            try {
                String cdaPath = docIndex.getCdaPath();
                File file = fileService.getFile(cdaPath);
                inputStream = FileUtils.openInputStream(file);
                Document document = new SAXReader().read(inputStream);
                ResponseBean responseBean = hfDocIndexService.mergeCdaData(document, docIndex);
                if (!StringUtils.equals(responseBean.getCode(), Constants.SUCCESS_CODE)) {
                    DocIndexUtil.setFailedStatus(docIndex, Constants.FAILED_STATUS, responseBean.getMessage());
                }
                kafkaService.sendToKafka(docIndex.getXdsType(), FileUtils.readFileToString(file, "UTF-8"));
            } catch (Exception e) {
                DocIndexUtil.setFailedStatus(docIndex, Constants.FAILED_STATUS, "文件全部拆分完成出错!", e);
            } finally {
                IOUtils.closeQuietly(inputStream);
            }
            hfDocIndexService.updateById(docIndex);
        }
    }

    @Scheduled(cron = "0/10 * * * * *")
    public void updateEmpi() {
        if (!Boolean.parseBoolean(isEmpiOpen)) {
            return;
        }
        log.info("do updateEmpiTask!");
        QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
        if (StringUtils.isNotEmpty(updateEmpiType)) {
            queryWrapper.lambda()
                    .eq(DocIndex::getXdsType, updateEmpiType);
        }
        queryWrapper.lambda()
                .eq(DocIndex::getCdaStatus, Constants.EMPI_ERROR_STATUS)
                .isNull(DocIndex::getCdaTime);
        //.apply("cda_time <= DATE_SUB({0}, INTERVAL 5 HOUR) or cda_time is null", new Date());
        IPage<DocIndex> page = new Page<>(0, 50);//参数一是当前页，参数二是每页个数
        IPage<DocIndex> pageList = hfDocIndexService.page(page, queryWrapper);
        List<DocIndex> docIndexList = pageList.getRecords();
        if (CollectionUtils.isEmpty(docIndexList)) {
            log.info("EMPI全部更新完成");
            return;
        }
        for (DocIndex docIndex : docIndexList) {
            try {
                ResponseBean responseBean = hfDocIndexService.updateEmpi(docIndex);
                if (!StringUtils.equals(responseBean.getCode(), Constants.SUCCESS_CODE)) {
                    DocIndexUtil.setFailedStatus(docIndex, Constants.FAILED_STATUS, responseBean.getMessage());
                }
            } catch (Exception e) {
                log.error("更新EMPI出错，", e.getMessage(), e);
                DocIndexUtil.setFailedStatus(docIndex, Constants.FAILED_STATUS, e.getMessage());
            }
            hfDocIndexService.updateById(docIndex);
        }
    }

    @Scheduled(cron = "0/10 * * * * *")
    public void retryData() {
        if (!Boolean.parseBoolean(isRetryOpen)) {
            return;
        }
        log.info("do retryDataTask!");
        QueryWrapper<HfDocLog> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(HfDocLog::getRetryStatus, Constants.START_STATUS)
                .isNull(HfDocLog::getRetryTime)
                .orderByAsc(HfDocLog::getProcTime);
        IPage<HfDocLog> page = new Page<>(0, 10);//参数一是当前页，参数二是每页个数
        IPage<HfDocLog> pageList = hfDocLogService.page(page, queryWrapper);
        List<HfDocLog> hfDocLogList = pageList.getRecords();
        if (CollectionUtils.isEmpty(hfDocLogList)) {
            log.info("日志重试完成");
            return;
        }
        for (HfDocLog hfDocLog : hfDocLogList) {
            UpdateWrapper<HfDocLog> updateWrapper = new UpdateWrapper<>();
            updateWrapper.lambda().set(HfDocLog::getRetryTime, new Date());
            String message = null;
            try {
                String content = FileUtils.readFileToString(fileService.getFile(hfDocLog.getFilePath()), "UTF-8");
                HfDocIndexVo hfDocIndexVo = new HfDocIndexVo();
                boolean isTrue = XmlUtil.setBeans(hfDocIndexVo, content);
                if (!isTrue) {
                    log.error("消息解析失败!");
                    updateWrapper.lambda().set(HfDocLog::getErrorInfo, "消息解析出错!").set(HfDocLog::getRetryStatus, Constants.FAILED_STATUS).eq(HfDocLog::getId, hfDocLog.getId());
                    hfDocLogService.update(updateWrapper);
                    continue;
                }
                message = nonCheck(hfDocIndexVo);
                if (StringUtils.isNotEmpty(message)) {
                    log.error(message);
                    if (message.length() > 1000) {
                        message = message.substring(0, 999);
                    }
                    updateWrapper.lambda().set(HfDocLog::getErrorInfo, message).set(HfDocLog::getRetryStatus, Constants.FAILED_STATUS).eq(HfDocLog::getId, hfDocLog.getId());
                    hfDocLogService.update(updateWrapper);
                    continue;
                }
                ResponseBean responseBean = hfDocIndexService.saveOrUpdateXds(hfDocIndexVo, true, content);
                if (Constants.SUCCESS_CODE.equalsIgnoreCase(responseBean.getCode())) {
                    updateWrapper.lambda().set(HfDocLog::getErrorInfo, "")
                            .set(HfDocLog::getRetryStatus, Constants.SUCCESS_STATUS)
                            .eq(HfDocLog::getId, hfDocLog.getId());
                    hfDocLogService.update(updateWrapper);
                    continue;
                }
                message = responseBean.getMessage();
            } catch (Exception e) {
                log.error("重试日志数据出错，", e.getMessage(), e);
                message = e.getMessage();
            }
            if (message.length() > 1000) {
                message = message.substring(0, 999);
            }
            updateWrapper.lambda().set(HfDocLog::getErrorInfo, message).set(HfDocLog::getRetryStatus, Constants.FAILED_STATUS).eq(HfDocLog::getId, hfDocLog.getId());
            hfDocLogService.update(updateWrapper);
        }
    }

    private String nonCheck(HfDocIndexVo hfDocIndexVo) throws DocumentException {
        StringBuffer errorMessage = new StringBuffer();
        ManagerDoc hfDoc = null;
        if (StringUtils.isEmpty(hfDocIndexVo.getMessageId())) {
            errorMessage.append("请求消息ID为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getDomainId())) {
            errorMessage.append("机构域ID为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getPatientId())) {
            errorMessage.append("患者标识为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getPatientName())) {
            errorMessage.append("患者姓名为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getHealthCard())) {
            errorMessage.append("居民健康卡号为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getIdentityId())) {
            errorMessage.append("居民身份证号为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getAgencyId())) {
            errorMessage.append("机构组织机构代码为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getAgencyName())) {
            errorMessage.append("机构名称为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getSubmitTime())) {
            errorMessage.append("提交时间为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getUniqueId())) {
            errorMessage.append("共享文档注册唯一标识符为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getSourceId())) {
            errorMessage.append("源文档ID为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getTitle())) {
            errorMessage.append("标题字段为空,");
        } else {
            List<ManagerDoc> hfDocList = docService.getHfDocMap().get(hfDocIndexVo.getTitle());
            if (CollectionUtils.isEmpty(hfDocList)) {
                errorMessage.append("").append(hfDocIndexVo.getTitle() + ":类型不存在,");
            }
            hfDoc = hfDocList.get(0);
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getCreateTime())) {
            errorMessage.append("创建时间为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getStartTime())) {
            errorMessage.append("活动服务开始时间为空,");
        }
        /*if(StringUtils.isEmpty(hfDocIndexVo.getAuthorDept())){
            errorMessage.append("负责人所属科室名称为空,");
        }*/
        if (StringUtils.isEmpty(hfDocIndexVo.getDocId())) {
            errorMessage.append("文档ID为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getDocType())) {
            errorMessage.append("文档类型为空,");
        }
        if (StringUtils.isEmpty(hfDocIndexVo.getContent())) {
            errorMessage.append("文档内容为空,");
        } else {
            String xml = Base64Util.decodeToString(hfDocIndexVo.getContent());
            if (null != hfDoc) {
                List<VerifyConfigList> configList = verifyConfigService.getVerifyConfigList(hfDoc.getDocCode());
                String error = VerifyElement.setMetaXml(xml, configList);
                if (StringUtils.isNotEmpty(error)) {
                    errorMessage.append("文档内容解析后必填字段为空:");
                    errorMessage.append(error);
                }
            }
            /*ResponseBean responseBean=VerifyTool.verifyCdaData(xsdPrefix,xml);
            if(StringUtils.equals(Constants.ERROR_CODE,responseBean.getCode())){
                errorMessage.append("文档结构出错,").append(responseBean.getMessage());
            }*/

        }
        return errorMessage.toString();
    }

    @Scheduled(cron = "0/10 * * * * *")
    public void syncDoc() throws Exception {
        if (!Boolean.parseBoolean(isSyncOpen)) {
            return;
        }
        if (StringUtils.isNotEmpty(syncType)) {
            syncDataService.syncAppointDoc(syncType);
        } else {
            syncDataService.syncAllDoc();
        }
    }
}
