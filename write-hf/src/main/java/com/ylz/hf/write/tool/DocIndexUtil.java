package com.ylz.hf.write.tool;

import com.ylz.hf.bean.DocIndex;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

public class DocIndexUtil {
    private static final Logger log = LoggerFactory.getLogger(DocIndexUtil.class);

    public static void setErrorInfo(DocIndex docIndex, String errorInfo) {
        if (errorInfo.length() > 1000) {
            errorInfo = errorInfo.substring(0, 1000);
        }
        docIndex.setCdaErrorInfo(errorInfo);
        docIndex.setCdaTime(new Date());
        /*docIndex.setErrorTimes(docIndex.getErrorTimes() == null ? 0 : docIndex.getErrorTimes() + 1);*/
        log.error("数据处理失败：文档" + errorInfo);
    }

    public static void setFailedStatus(DocIndex docIndex, String procStatus, String errorMessage, Exception e) {
        setFailedStatus(docIndex, procStatus, errorMessage + e.getMessage());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("PK为：").append(docIndex.getId()).append(",").append(errorMessage).append(e.getMessage());
        log.error(stringBuffer.toString());
        if (null != e) {
            log.error(e.getMessage(), e);
        }
    }

    public static void setFailedStatus(DocIndex docIndex, String procStatus, String errorMessage) {
        docIndex.setCdaStatus(procStatus);
        setErrorInfo(docIndex, errorMessage);
    }
}
