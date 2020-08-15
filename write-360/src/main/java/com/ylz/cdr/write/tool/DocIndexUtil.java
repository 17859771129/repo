package com.ylz.cdr.write.tool;

import com.ylz.cdr.bean.DocIndex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DocIndexUtil {
    private static final Logger log = LoggerFactory.getLogger(DocIndexUtil.class);

    public static void setErrorInfo(DocIndex docIndex, String errorInfo) {
        docIndex.setErrorInfo(errorInfo);
        docIndex.setErrorTimes(docIndex.getErrorTimes() == null ? 0 : docIndex.getErrorTimes() + 1);
        log.error("数据处理失败：文档");
    }

    public static void setFailedStatus(DocIndex docIndex, String procStatus, String errorMessage, Exception e) {
        setFailedStatus(docIndex, procStatus, errorMessage);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PK为：").append(docIndex.getPk()).append(",").append(errorMessage);
        log.error(stringBuffer.toString());
        if (null != e) {
            log.error(e.getMessage(), e);
        }
    }

    public static void setFailedStatus(DocIndex docIndex, String procStatus, String errorMessage) {
        docIndex.setProcStatus(procStatus);
        setErrorInfo(docIndex, errorMessage);
    }
}
