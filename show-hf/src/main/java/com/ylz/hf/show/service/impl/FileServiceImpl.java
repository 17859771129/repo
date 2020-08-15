package com.ylz.hf.show.service.impl;

import com.ylz.file.factory.FileFactory;
import com.ylz.file.service.IFileSystemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.File;

@Service("filService")
public class FileServiceImpl {

    private static final Logger log = LoggerFactory.getLogger(FileServiceImpl.class);


    @Autowired
    private FileFactory fileFactory;
    @Value("${storage.code}")
    private String storageCode;
    private IFileSystemService fileSystemService = null;

    @PostConstruct
    public void getFileSystem() {
        if (null == fileSystemService) {
            fileSystemService = fileFactory.getFileSystemService(storageCode);
        }
    }

    public File getFile(String filePath) {
        return fileSystemService.getFile(filePath);
    }
}
