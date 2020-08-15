package com.ylz.hf.write.webservice.impl;

import com.ylz.hf.write.webservice.IHfTemplateService;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import net.sf.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.IOException;

@Service
public class HfTemplateServiceImpl implements IHfTemplateService {

    private static final Logger log = LoggerFactory.getLogger(HfTemplateServiceImpl.class);

    @Autowired
    private Configuration configuration;

    public String setReturn(JSONObject jsonObject, String xmlName) {
        //初始化加载器
        try {
            Template template = configuration.getTemplate(xmlName);
            String content = FreeMarkerTemplateUtils.processTemplateIntoString(template, jsonObject);
            return content;
        } catch (IOException e) {
            log.error("获取文件出错，{}，{}", e.getMessage(), e);
        } catch (TemplateException e) {
            log.error("模板数据获取出错，{}，{}", e.getMessage(), e);
        }
        return null;
    }
}
