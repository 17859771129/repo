package com.ylz.cdr.write.pre.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.write.pre.service.IPreConvDataService;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

@Controller
@RequestMapping("/conv")
public class PreConvDataController {

    private static final Logger log = LoggerFactory.getLogger(PreConvDataController.class);

    @Autowired
    public IPreConvDataService preConvDataService;

    @ResponseBody
    @PostMapping(value = "/convData")
    public String convData(HttpServletRequest request) {
        ResponseBean responseBean = new ResponseBean();
        Document document = null;
        try {
            List<String> stringList = IOUtils.readLines(request.getInputStream(), "utf-8");
            StringBuilder builder = new StringBuilder();
            for (String string : stringList) {
                builder.append(string);
            }
            String xml = builder.toString();
            String type = request.getHeader("messageType");
            String messageId = request.getHeader("messageId");
            if (StringUtils.isEmpty(xml)) {
                log.debug("接收到的消息类型为：{}，消息ID为：{}，内容为空!", type, messageId);
                responseBean.setMessage("接收到的消息类型为：" + type + "，消息ID为：" + messageId + "，内容为空!");
                return responseBean.toString();
            }

            log.debug("接收到的消息类型为：{}，消息ID为：{}，内容为：{}", type, messageId, xml);
            document = DocumentHelper.parseText(xml);
            responseBean = preConvDataService.procData(document, type, messageId);
            responseBean.setObject(null);
        } catch (DocumentException e) {
            responseBean.setMessage("XML格式错误！");
            log.error("XML格式错误", e.getMessage(), e);
        } catch (IOException e) {
            responseBean.setMessage("传入参数为空");
            log.error("数据读取错误！", e.getMessage(), e);
        } catch (Exception e) {
            responseBean.setMessage(e.getMessage());
            log.error(e.getMessage(), e);
        } finally {
            if (null != document) {
                document.clearContent();
            }
        }
        return responseBean.toString();
    }


}
