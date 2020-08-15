package com.ylz.hf.write.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.ConstantUtil;
import com.ylz.cdr.common.Constants;
import com.ylz.hf.write.vo.HfDocIndexVo;
import com.ylz.log.bean.HfDocLog;
import com.ylz.log.dao.HfDocLogMapper;
import com.ylz.manager.bean.ManagerDoc;
import com.ylz.manager.service.IDocService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service("hfDocLogService")
public class HfDocLogServiceImpl extends ServiceImpl<HfDocLogMapper, HfDocLog> {

    private static final Logger log = LoggerFactory.getLogger(HfDocLogServiceImpl.class);

    @Value("${source.prefix}")
    private String sourcePrefix;
    @Autowired
    private IDocService docService;
    @Autowired
    private FileServiceImpl filService;

    public void save(HfDocIndexVo hfDocIndexVo, String repositoryUniqueId, String xml, String status, String message) throws Exception {
        final HfDocLog hfDocLog = new HfDocLog();
        BeanUtils.copyProperties(hfDocIndexVo, hfDocLog);
        List<ManagerDoc> hfDocList = docService.getHfDocMap().get(hfDocIndexVo.getTitle());
        if (CollectionUtils.isEmpty(hfDocList)) {
            log.error("类型名称为：{}，填入不符合类型字典！", hfDocIndexVo.getTitle());
            throw new Exception("类型不存在！");
        }
        ManagerDoc hfDoc = hfDocList.get(0);
        hfDocLog.setXdsType(hfDoc.getDocCode());
        hfDocLog.setProcStatus(status);
        hfDocLog.setErrorInfo(message);
        hfDocLog.setContent(null);
        String dateString = ConstantUtil.convDateDir(hfDocIndexVo.getCreateTime());
        if (StringUtils.isEmpty(dateString)) {
            throw new Exception("CreateTime字段不符合数据填入要求！");
        }
        String filePath = new StringBuffer()
                .append(sourcePrefix)
                .append(dateString)
                .append("/")
                .append(hfDocLog.getDomainId())
                .append("/")
                .append(hfDocLog.getXdsType())
                .append("/")
                .append(UUID.randomUUID()).append(Constants.XML_SUFFIX).toString();
        filService.uploadStringToFile(xml, filePath);
        hfDocLog.setProcTime(new Date());
        hfDocLog.setProcStatus(status);
        hfDocLog.setFilePath(filePath);
        hfDocLog.setRepositoryUniqueId(repositoryUniqueId);
        this.save(hfDocLog);
    }

}
