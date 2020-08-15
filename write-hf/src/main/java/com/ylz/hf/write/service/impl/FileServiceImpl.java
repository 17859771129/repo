package com.ylz.hf.write.service.impl;

import com.ylz.cdr.common.Base64Util;
import com.ylz.hf.bean.DocIndex;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;

@Service("filService")
public class FileServiceImpl {

    private static final Logger log = LoggerFactory.getLogger(FileServiceImpl.class);

    @Value("${file.path.prefix}")
    private String filePathPrefix;

    public boolean uploadFile(DocIndex hfDocIndexVo, String filePath) {
        String xdsContent = hfDocIndexVo.getContent();
        if (StringUtils.isEmpty(xdsContent)) {
            log.error("文档内容为空！");
            return false;
        }
        String string = Base64Util.decodeToString(xdsContent);
        String file = uploadStringToFile(string, filePath);
        if (StringUtils.isEmpty(file)) {
            return false;
        }
        return true;
    }

    public File getFile(String path) {
        return getFile(path, true);
    }

    public File getFile(String path, boolean addPrefix) {
        String fullPath = path;
        if (addPrefix) {
            fullPath = new StringBuffer().append(filePathPrefix).append(path).toString();
        }
        File file = new File(fullPath);
        return file;
    }

    public String uploadStringToFile(String string, String descPath) {
        String fullPath = new StringBuffer().append(filePathPrefix).append(descPath).toString();
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

    public String getBase64String(String filePath) {
        String fullPath = new StringBuffer().append(filePathPrefix).append(filePath).toString();
        File file = new File(fullPath);
        try {
            byte[] buffer = FileUtils.readFileToByteArray(file);
            return Base64Util.encode(buffer);
        } catch (IOException e) {
            log.error("读取文件出现错误，路径为{}，{}，{}", fullPath, e.getMessage(), e);
        }
        return null;
    }
}
