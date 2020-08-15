package com.ylz.hf.write.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.ConstantUtil;
import com.ylz.cdr.common.Constants;
import com.ylz.hf.write.vo.HfAccess;
import com.ylz.log.bean.HfAccessLog;
import com.ylz.log.dao.HfAccessLogMapper;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service("hfAccessLogService")
public class HfAccessLogServiceImpl extends ServiceImpl<HfAccessLogMapper, HfAccessLog> {

    private static final Logger log = LoggerFactory.getLogger(HfAccessLogServiceImpl.class);

    @Value("${source.prefix}")
    private String sourcePrefix;
    @Autowired
    private FileServiceImpl filService;

    public void save(HfAccess hfAccess, String xml, String status, Date receiveDate) throws Exception {
        final HfAccessLog hfAccessLog = new HfAccessLog();
        BeanUtils.copyProperties(hfAccessLog, hfAccess);
        hfAccessLog.setProcTime(receiveDate);
        String dateString = ConstantUtil.nowDateDir();
        if (StringUtils.isEmpty(dateString)) {
            throw new Exception("CreateTime字段不符合数据填入要求！");
        }
        String filePath = new StringBuffer()
                .append(sourcePrefix)
                .append(dateString)
                .append("/")
                .append(hfAccessLog.getDomainId())
                .append("/")
                .append(UUID.randomUUID()).append(Constants.XML_SUFFIX).toString();
        filService.uploadStringToFile(xml, filePath);
        hfAccessLog.setFilePath(filePath);
        hfAccessLog.setProcTime(new Date());
        hfAccessLog.setProcStatus(status);
        this.save(hfAccessLog);
    }

}
