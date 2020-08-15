package com.ylz.file.service;

import java.io.*;

public interface IFileSystemService {

    /**
     * 查询交通方式编码
     *
     * @return 编码
     */
    String getCode();

    String uploadToFile(InputStream inputStream, String filePath);

    boolean uploadToFile(String sourcePath, String descPath);

    String uploadStringToFile(String string, String descPath) throws UnsupportedEncodingException;

    InputStreamReader getInputStream(String path) throws IOException;

    InputStreamReader getInputStream(String path, String charset) throws IOException;

    InputStream getInputStream(File file) throws IOException;

    File getFile(String path);

    File getFile(String path, boolean addPrefix);

    String getBase64String(String filePath);

    String uploadBase64ToFile(String base64String, String filePath);
}
