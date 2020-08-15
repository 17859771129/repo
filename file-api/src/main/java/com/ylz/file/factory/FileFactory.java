package com.ylz.file.factory;

import com.ylz.file.service.IFileSystemService;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class FileFactory implements ApplicationContextAware {

    private static Map<String, IFileSystemService> fileSystemServiceMap;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, IFileSystemService> mapFile = applicationContext.getBeansOfType(IFileSystemService.class);
        fileSystemServiceMap = new HashMap<>();
        mapFile.forEach((key, value) -> fileSystemServiceMap.put(value.getCode(), value));
    }

    public IFileSystemService getFileSystemService(String code) {
        return fileSystemServiceMap.get(code);
    }
}
