package com.ylz.cdr.write.task;

import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.write.service.ICdaService;
import com.ylz.cdr.write.service.IDocIndexService;
import com.ylz.cdr.write.service.IManagerDocService;
import com.ylz.cdr.write.service.ISyncDataService;
import com.ylz.cdr.write.tool.DocIndexUtil;
import com.ylz.cdr.write.vo.VisitVo;
import com.ylz.file.factory.FileFactory;
import com.ylz.file.service.IFileSystemService;
import com.ylz.manager.bean.ManagerDoc;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.io.SAXReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ReSplitTask {
    private static final Logger log = LoggerFactory.getLogger(ReSplitTask.class);

    @Value("${split.status}")
    private String status;
    @Autowired
    public ICdaService cdaService;
    @Autowired
    private IDocIndexService docIndexService;
    @Value("${storage.code}")
    private String storageCode;
    @Value("${sync.code}")
    private String docCode;

    @Value("${is.split.open}")
    private String isSplitOpen;

    @Value("${is.sync.open}")
    private String isSyncOpen;

    @Value("${is.empi.open}")
    private String isEmpiOpen;

    @Autowired
    private FileFactory fileFactory;
    @Autowired
    private IManagerDocService managerDocService;
    @Autowired
    private ISyncDataService syncDataService;

    private List<String> statusList;

    @PostConstruct
    private List<String> getStatus() {
        if (CollectionUtils.isEmpty(statusList)) {
            statusList = Arrays.asList(status.split(","));
        }
        return statusList;
    }

    @Scheduled(cron = "0/20 * * * * *")
    public void splitData() throws Exception {
        if (!Boolean.parseBoolean(isSplitOpen)) {
            return;
        }
        log.info("do ReSplitTask!");
        List<DocIndex> docIndexList = docIndexService.queryByStatus(statusList);
        if (CollectionUtils.isEmpty(docIndexList)) {
            log.info("文件全部拆分完成");
            return;
        }
        for (DocIndex docIndex : docIndexList) {
            FileInputStream inputStream = null;
            try {
                String cdaPath = docIndex.getCdaPath();
                IFileSystemService fileSystemService = fileFactory.getFileSystemService(storageCode);
                inputStream = FileUtils.openInputStream(fileSystemService.getFile(cdaPath, true));
                Document document = new SAXReader().read(inputStream);
                ResponseBean responseBean = cdaService.mergeCdaData(document, docIndex.getDomainId(), docIndex.getXdsType(),
                        docIndex.getUniqueId(), docIndex.getXdsVersion(), docIndex.getPatientId(), false);
                if (StringUtils.equals(responseBean.getCode(), Constants.SUCCESS_CODE)) {
                    JSONObject jsonObject = JSONObject.fromObject(responseBean.getObject());
                    if (jsonObject.containsKey("empi") && StringUtils.isNotEmpty(jsonObject.getString("empi"))) {
                        docIndex.setEmpi(jsonObject.getString("empi"));
                        docIndex.setEncounterId(jsonObject.getString("encounterId"));
                        docIndex.setProcStatus(Constants.SUCCESS_STATUS);
                    } else {
                        DocIndexUtil.setFailedStatus(docIndex, Constants.EMPI_ERROR_STATUS, "EMPI注册失败！");
                    }
                } else {
                    DocIndexUtil.setFailedStatus(docIndex, Constants.FAILED_STATUS, responseBean.getMessage());
                }
            } catch (Exception e) {
                DocIndexUtil.setFailedStatus(docIndex, Constants.FAILED_STATUS, "文件全部拆分完成出错!", e);
            } finally {
                IOUtils.closeQuietly(inputStream);
            }
            docIndexService.updateStatus(docIndex);
        }
    }

    @Scheduled(cron = "0/10 * * * * *")
    public void syncDoc() throws Exception {
        if (!Boolean.parseBoolean(isSyncOpen)) {
            return;
        }
        if (StringUtils.isNotEmpty(docCode)) {
            syncDataService.syncAppointDoc(docCode);
        } else {
            syncDataService.syncAllDoc();
        }
    }

    /*@Scheduled(cron = "0/20 * * * * *")*/
    public void updateEmpi() throws Exception {
        if (!Boolean.parseBoolean(isEmpiOpen)) {
            return;
        }
        //更新EMPI,状态为EE
        List<String> list = new ArrayList<>();
        list.add(Constants.EMPI_ERROR_STATUS);
        List<DocIndex> docIndexList = docIndexService.queryByStatus(list);
        if (CollectionUtils.isEmpty(docIndexList)) {
            log.info("EMPI获取失败的数据不存在");
            return;
        }
        for (DocIndex docIndex : docIndexList) {
            VisitVo visitVo = new VisitVo(Constants.EMPI_ERROR_STATUS);
            String code = docIndex.getXdsType();
            List<ManagerDoc> managerDocList = managerDocService.getManagerDocMap().get(code);
            try {
                visitVo = docIndexService.queryEmpi(docIndex);
                if (CollectionUtils.isEmpty(managerDocList)) {
                    log.info("类型为：{}，不存在解析表！", code);
                } else {
                    docIndexService.updateProcInfoByPk(visitVo, docIndex);
                }
            } catch (Exception e) {
                visitVo.setProcStatus(Constants.FAILED_STATUS);
                DocIndexUtil.setFailedStatus(docIndex, Constants.FAILED_STATUS, e.getMessage(), e);
            }
            docIndexService.updateStatus(docIndex);
        }
    }


}
