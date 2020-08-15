package com.ylz.file.service.impl;

import com.ylz.cdr.common.Base64Util;
import com.ylz.file.service.IFileSystemService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.*;

@Service("fileSystemService")
public class FileSystemServiceImpl implements IFileSystemService {
    private static final Logger log = LoggerFactory.getLogger(FileSystemServiceImpl.class);

    @Value("${file.path.prefix}")
    private String filePathPrefix;

    @Override
    public String getCode() {
        return "LOCAL";
    }

    @Override
    public String uploadToFile(InputStream inputStream, String filePath) {
        String fullPath = new StringBuffer().append(filePathPrefix).append(filePath).toString();
        try {
            FileUtils.copyInputStreamToFile(inputStream, new File(fullPath));
            return fullPath;
        } catch (IOException e) {
            log.error("复制文件出现错误，{}，{}", e.getMessage(), e);
        }
        return null;
    }

    @Override
    public boolean uploadToFile(String sourcePath, String descPath) {
        try {
            FileUtils.copyFile(new File(sourcePath), new File(descPath));
            return true;
        } catch (IOException e) {
            log.error("复制文件出现错误，{}，{}", e.getMessage(), e);
        }
        return false;
    }

    @Override
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

    @Override
    public String uploadBase64ToFile(String base64String, String filePath) {
        if (StringUtils.isEmpty(base64String)) {
            log.error("BASE64内容内容为空！");
            return null;
        }
        String xdsContentByte = Base64Util.decodeToString(base64String);
        try (OutputStream outs = new FileOutputStream(new File(filePath), true);
             OutputStreamWriter out = new OutputStreamWriter(outs, "UTF-8")) {
            out.write(xdsContentByte);
        } catch (IOException e) {
            log.error("上传文件出错，{}，{}", e.getMessage(), e);
        }
        return null;
    }


    @Override
    public InputStreamReader getInputStream(String path) throws IOException {
        return getInputStream(path, "GB2312");
    }

    @Override
    public InputStreamReader getInputStream(String path, String charset) throws IOException {
        File file = getFile(path);
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    @Override
    public InputStream getInputStream(File file) throws IOException {
        if (file.exists()) {
            InputStream inputStream = FileUtils.openInputStream(file);
            return inputStream;
        } else {
            throw new FileNotFoundException("文件：" + file.getPath() + ",不存在！");
        }
    }

    @Override
    public File getFile(String path) {
        File file = new File(path);
        return file;
    }

    @Override
    public File getFile(String path, boolean addPrefix) {
        String fullPath = path;
        if (addPrefix) {
            fullPath = new StringBuffer().append(filePathPrefix).append(path).toString();
        }
        return getFile(fullPath);
    }

    @Override
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
