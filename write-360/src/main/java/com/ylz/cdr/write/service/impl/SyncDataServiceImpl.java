package com.ylz.cdr.write.service.impl;

import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.write.service.IDocIndexService;
import com.ylz.cdr.write.service.IManagerDocService;
import com.ylz.cdr.write.service.ISyncDataService;
import com.ylz.cdr.write.tool.DocIndexUtil;
import com.ylz.cdr.write.vo.VisitVo;
import com.ylz.manager.bean.ManagerDoc;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("syncDataService")
public class SyncDataServiceImpl implements ISyncDataService {

    private static final Logger log = LoggerFactory.getLogger(SyncDataServiceImpl.class);
    @Autowired
    private IManagerDocService managerDocService;
    @Autowired
    private IDocIndexService docIndexService;

    @Value("${sync.status}")
    private String syncStatus;

    public void syncAllDoc() throws Exception {
        //HDSD插入数据到DOC_INDEX,状态为AS/AE
        if (CollectionUtils.isEmpty(managerDocService.getManagerDocList())) {
            log.info("文档类型为空，请检查文档类型配置！");
            return;
        }
        for (ManagerDoc managerDoc : managerDocService.getManagerDocList()) {
            String tableName = managerDoc.getDocTable();
            String docCode = managerDoc.getDocCode();
            syncData(docCode, tableName);
        }
    }

    public void syncAppointDoc(String docCode) throws Exception {
        List<ManagerDoc> managerDocList = managerDocService.getManagerDocMap().get(docCode);
        if (CollectionUtils.isEmpty(managerDocList)) {
            log.error("文件类型为：{},不存在！", docCode);
            return;
        }
        String tableName = managerDocService.getManagerDocMap().get(docCode).get(0).getDocTable();
        syncData(docCode, tableName);
    }

    private void syncData(String docCode, String tableName) throws Exception {
        List<DocIndex> docIndexList = docIndexService.querySyncData(tableName, syncStatus);
        for (DocIndex docIndex : docIndexList) {
            VisitVo visitVo = new VisitVo(Constants.EMPI_ERROR_STATUS);
            try {
                visitVo = docIndexService.syncDocIndex(tableName, docCode, docIndex);
            } catch (Exception e) {
                visitVo.setProcStatus(Constants.FAILED_STATUS);
                DocIndexUtil.setFailedStatus(docIndex, Constants.FAILED_STATUS, e.getMessage(), e);
            }
            docIndexService.updateProcInfoByPk(visitVo, docIndex);
        }
    }

}
