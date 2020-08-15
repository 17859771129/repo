package com.ylz.cdr.write.service.impl;

import com.xmltool.impl.XmlLoader;
import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.common.*;
import com.ylz.cdr.write.dao.DocIndexCdrMapper;
import com.ylz.cdr.write.service.IXdsService;
import com.ylz.cdr.write.vo.XdsInfoString;
import com.ylz.cdr.write.vo.XdsReturn;
import com.ylz.file.factory.FileFactory;
import com.ylz.file.service.IFileSystemService;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.Date;
import java.util.UUID;

@Service("xdsService")
public class XdsServiceImpl implements IXdsService {
    private static final Logger log = LoggerFactory.getLogger(XdsServiceImpl.class);

    @Autowired
    private DocIndexCdrMapper docIndexCdrMapper;
    @Autowired
    private FileFactory fileFactory;
    @Value("${storage.code}")
    private String storageCode;
    @Value("${source.prefix}")
    private String sourcePrefix;
    @Value("${cda.prefix}")
    private String cdaPrefix;
    @Value("${file.path.prefix}")
    private String filePathPrefix;
    @Autowired
    private ResourceLoader resourceLoader;

    @Override
    public ResponseBean saveOrUpdateXds(XdsInfoString xdsInfoString, boolean isInsert, String sourceXml) {
        ResponseBean responseBean = new ResponseBean();
        try {
            DocIndex docIndex = setDocIndex(xdsInfoString);
            String xdsPath = new StringBuffer().append(sourcePrefix).append(docIndex.getDomainId()).append("/").append(docIndex.getXdsType()).append("/").
                    append(docIndex.getDomainId()).append("_").
                    append(docIndex.getXdsType()).append("_").
                    append(docIndex.getXdsVersion()).append("_").
                    append(docIndex.getUniqueId()).append(Constants.XML_SUFFIX).toString();
            String cdaPath = xdsPath.replace(sourcePrefix, cdaPrefix);
            DocIndex hisXdsInfo = docIndexCdrMapper.queryByUniqueId(docIndex.getUniqueId(), docIndex.getDomainId(), docIndex.getXdsType(), docIndex.getXdsVersion());
            if (!procHisGate(hisXdsInfo, isInsert)) {
                String errorMessage = "更新文档不存在!";
                if (isInsert) {
                    errorMessage = "文档已经注册!";
                }
                responseBean.setMessage(errorMessage);
                return responseBean;
            }
            Boolean isSuccess = uploadFile(xdsInfoString.getXdsContent(), cdaPath);
            if (!isSuccess) {
                responseBean.setMessage("CDA文档上传出错！");
                return responseBean;
            }
            IFileSystemService fileSystemService = fileFactory.getFileSystemService(storageCode);
            String returnPath = fileSystemService.uploadStringToFile(sourceXml, xdsPath);
            if (StringUtils.isEmpty(returnPath)) {
                responseBean.setMessage("源文件上传出错！");
                return responseBean;
            }
            docIndex.setFilePath(xdsPath);
            docIndex.setCdaPath(cdaPath);
            docIndex.setProcStatus(Constants.START_STATUS);
            docIndex.setSyncStatus(Constants.CDA_BEGIN_STATUS);
            docIndexCdrMapper.insert(docIndex);
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("数据库操作出错！", e.getMessage(), e);
            responseBean.setMessage("数据库操作出错！");
        }
        return responseBean;
    }

    private DocIndex setDocIndex(XdsInfoString xdsInfoString) {
        DocIndex docIndex = new DocIndex();
        BeanUtils.copyProperties(xdsInfoString, docIndex);
        docIndex.setXdsName(docIndex.getXdsNode());
        return docIndex;
    }

    /**
     * 处理数据
     *
     * @param xml
     * @param isInsert
     * @return
     */
    public String procData(String xml, boolean isInsert) {
        XdsInfoString xdsInfoString = new XdsInfoString();
        InputStream inputStream = null;
        try {
            xml = xml.replace("\n", "");
            final XmlLoader xmlLoader = new XmlLoader();
            xmlLoader.setBeans(xdsInfoString);
            inputStream = IOUtils.toInputStream(xml, "UTF-8");
            xmlLoader.load(inputStream);
            if (CdrUtil.isNull(xdsInfoString.getCreateTime(), xdsInfoString.getDomainId(), xdsInfoString.getUniqueId(),
                    xdsInfoString.getXdsType(), xdsInfoString.getXdsNode(),
                    xdsInfoString.getEffectiveTime(), xdsInfoString.getXdsContent(),
                    xdsInfoString.getCustodianCode(), xdsInfoString.getCustodianName(),
                    xdsInfoString.getPatientId(), xdsInfoString.getPatientName()
                   /* ,xdsInfoString.getHospitalName(),xdsInfoString.getHospitalCode(),
                   xdsInfoString.getVisitTime(),xdsInfoString.getXdsCreater(),
                   xdsInfoString.getXdsCreaterSign(),xdsInfoString.getDeptCode(),xdsInfoString.getIdentifyNo() */
            )) {
                log.error("必填字段为空");
                return setReturn(xdsInfoString, Constants.FAILED_STATUS, "必填字段为空!");
            }
            if (StringUtils.isEmpty(xdsInfoString.getClincId()) && StringUtils.isEmpty(xdsInfoString.getInpatientId())) {
                log.error("门诊号或者住院号字段为空");
                return setReturn(xdsInfoString, Constants.FAILED_STATUS, "门诊号或者住院号字段为空!");
            }
            ResponseBean responseBean = saveOrUpdateXds(xdsInfoString, isInsert, xml);
            if (StringUtils.equals(Constants.SUCCESS_CODE, responseBean.getCode())) {
                return setReturn(xdsInfoString, Constants.SUCCESS_STATUS, null);
            } else {
                return setReturn(xdsInfoString, Constants.FAILED_STATUS, responseBean.getMessage());
            }
        } catch (IOException e) {
            log.error("注册消息失败：{}，{}", e.getMessage(), e);
            return setReturn(xdsInfoString, Constants.FAILED_STATUS, "注册消息失败!");
        } catch (DocumentException e) {
            log.error("注册消息失败：{}，{}", e.getMessage(), e);
            return setReturn(xdsInfoString, Constants.FAILED_STATUS, "注册消息失败!");
        } finally {
            IOUtils.closeQuietly(inputStream);
        }
    }

    private String setReturn(XdsInfoString xdsInfo, String result, String errorMessage) {
        //初始化加载器
        final XmlLoader xmlLoader = new XmlLoader();
        final XdsReturn xdsReturn = new XdsReturn();
        xdsReturn.setMessageId(UUID.randomUUID().toString());
        xdsReturn.setMessageCreateTime(ConstantUtil.FORMAT.format(new Date()));
        xdsReturn.setResult(result);
        xdsReturn.setResultDesc(errorMessage);
        xdsReturn.setRequestId(xdsInfo.getMessageId());
        xmlLoader.setTemplate(xdsReturn);
        Document document = null;
        try {
            document = xmlLoader.load(resourceLoader.getResource("classpath:xds/xds-return.xml").getInputStream());
            return document.getRootElement().asXML();
        } catch (DocumentException e) {
            log.error("xds register return error,the error is {},{}", e.getMessage(), e);
        } catch (IOException e) {
            log.error("xds register return error,the error is {},{}", e.getMessage(), e);
        } finally {
            if (null != document) {
                document.clearContent();
            }
        }
        return null;
    }

    /**
     * 处理历史数据
     *
     * @param hisXdsInfo
     */
    /*private boolean procHisGate(DocIndex hisXdsInfo, boolean isInsert) throws Exception {
        if (isInsert) {
            if (null == hisXdsInfo) {
                return true;
            } else {
                return false;
            }
        } else {
            if (null == hisXdsInfo) {
                return false;
            }
            //conv_path设置为空，proc_status,file_path
            docIndexCdrMapper.abandonData(hisXdsInfo.getPk(), Constants.ABANDON_STATUS);
            return true;
        }
    }*/
    private boolean procHisGate(DocIndex hisXdsInfo, boolean isInsert) throws Exception {
        if (null == hisXdsInfo) {
            return true;
        }
        //conv_path设置为空，proc_status,file_path
        docIndexCdrMapper.abandonData(hisXdsInfo.getPk(), Constants.ABANDON_STATUS);
        return true;
    }

    public boolean uploadFile(String xdsContent, String filePath) {
        if (StringUtils.isEmpty(xdsContent)) {
            log.error("文档内容为空！");
            return false;
        }
        String string = Base64Util.decodeToString(xdsContent, "GBK");
        String fullpath = new StringBuffer().append(filePathPrefix).append(filePath).toString();
        String file = uploadStringToFile(string, fullpath);
        if (StringUtils.isEmpty(file)) {
            return false;
        }
        return true;
    }

    public String uploadStringToFile(String string, String fullPath) {
        File file = new File(fullPath);
        if (!file.exists()) {
            file.getParentFile().mkdirs();
        }
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            byte[] byteString = string.getBytes("UTF-8");
            inputStream = new ByteArrayInputStream(byteString);
            outputStream = new FileOutputStream(file);
            IOUtils.copy(inputStream, outputStream);
            return fullPath;
        } catch (IOException e) {
            log.error("复制文件出现错误，{}，{}", e.getMessage(), e);
        } finally {
            IOUtils.closeQuietly(outputStream);
            IOUtils.closeQuietly(inputStream);
        }
        return null;
    }
}
