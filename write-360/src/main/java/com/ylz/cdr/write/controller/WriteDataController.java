package com.ylz.cdr.write.controller;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.write.service.ICdaService;
import com.ylz.cdr.write.service.IXdsService;
import net.sf.json.JSONObject;
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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;

@Controller
@RequestMapping("/write")
public class WriteDataController {

    private static final Logger log = LoggerFactory.getLogger(WriteDataController.class);

    @Autowired
    public ICdaService cdaService;

    @Autowired
    private IXdsService xdsService;

    @ResponseBody
    @PostMapping(value = "/live")
    public String live() {
        return "live";
    }


    @ResponseBody
    @PostMapping(value = "/receiveCdaData")
    public String receiveCdaData(HttpServletRequest request) {
        ResponseBean responseBean = new ResponseBean();
        BufferedReader reader = null;
        Document document = null;
        try {
            reader = request.getReader();
            StringBuilder builder = new StringBuilder();
            String line = reader.readLine();
            while (line != null) {
                builder.append(line);
                line = reader.readLine();
            }
            String json = builder.toString();
            if (StringUtils.isEmpty(json)) {
                responseBean.setMessage("传入参数为空");
                return responseBean.toString();
            }
            log.debug("接收到的消息为：{}", json);
            JSONObject jsonObject = JSONObject.fromObject(json);
            String xml = jsonObject.getString("fileContent");
            document = DocumentHelper.parseText(xml);
            String code = jsonObject.getString("xdsType");
            String domainId = jsonObject.getString("domainId");
            String uniqueId = jsonObject.getString("uniqueId");
            String version = jsonObject.getString("version");
            String patientId = jsonObject.getString("patientId");
            if (StringUtils.isEmpty(code) || StringUtils.isEmpty(domainId) || StringUtils.isEmpty(uniqueId)) {
                responseBean.setMessage("必填参数为空，请检查参数！");
                return responseBean.toString();
            }
            responseBean = cdaService.mergeCdaData(document, domainId, code, uniqueId, version, patientId, true);
            if (StringUtils.equals(responseBean.getCode(), Constants.SUCCESS_CODE)) {
                JSONObject returnJson = JSONObject.fromObject(responseBean.getObject());
                if (!returnJson.containsKey("empi") || StringUtils.isEmpty(returnJson.getString("empi"))) {
                    responseBean.setCode(Constants.ERROR_CODE);
                    responseBean.setMessage("EMPI获取失败！");
                }
            }
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
            IOUtils.closeQuietly(reader);
        }
        return responseBean.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/insertHlhtData")
    public String insertHlhtData(@RequestBody(required = false) String xml) {
        log.debug("insertHlht start");
        return procData(xml, false);
    }

    @ResponseBody
    @RequestMapping(value = "/updateHlhtData")
    public String updateHlhtData(@RequestBody(required = false) String xml) {
        log.debug("updateHlht start");
        return procData(xml, false);
    }

    private String procData(String xml, boolean isInsert) {
        log.debug("接收参数是：{}", xml);
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(xml)) {
            responseBean.setMessage("传入参数为空");
            return responseBean.toString();
        }
        return xdsService.procData(xml, isInsert);
    }

}
