package com.ylz.cdr.show.controller;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IAnalyService;
import com.ylz.cdr.show.service.IDocIndexService;
import com.ylz.cdr.show.tool.ResponseUtil;
import com.ylz.file.factory.FileFactory;
import com.ylz.file.service.IFileSystemService;
import net.sf.json.JSONObject;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by CodeGenerator on 2019/07/04.
 */
@RestController
@RequestMapping("/doc")
public class DocIndexController {

    private static final Logger log = LoggerFactory.getLogger(DocIndexController.class);

    @Autowired
    private IDocIndexService docIndexService;
    @Autowired
    private FileFactory fileFactory;
    @Value("${storage.code}")
    private String storageCode;
    @Autowired
    private IAnalyService analyService;

    /**
     * 获取所有就诊信息
     *
     * @param personId
     * @return
     */
    @PostMapping("/getDocumentIndexEncountersByPersonId")
    public String getDocumentIndexEncountersByPersonId(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = docIndexService.getDocumentIndexEncountersByPersonId(personId, encounterId);
        return responseBean.toString();
    }

    /**
     * 根据就诊获取文档
     *
     * @param personId
     * @return
     */
    @PostMapping("/getDocInfoListByPersonId")
    public String getDocInfoListByPersonId(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = docIndexService.getDocInfoListByPersonId(personId, encounterId, null);
        return responseBean.toString();
    }

    @PostMapping("/count")
    public String count(String personId, String encounterId) {
        if (StringUtils.isEmpty(personId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = docIndexService.countByPersonId(personId, encounterId);
        return responseBean.toString();
    }

    /**
     * 根据文档唯一ID获取文档内容
     *
     * @param xdsType
     * @param domainId
     * @param uniqueId
     * @param xdsVersion
     * @return
     */
    @PostMapping("/getDoc")
    public String getDoc(String xdsType, String domainId, String uniqueId, String xdsVersion) {
        if (StringUtils.isEmpty(xdsType) || StringUtils.isEmpty(domainId) || StringUtils.isEmpty(uniqueId)) {
            return ResponseUtil.genFailResult("查询条件不能为空").toString();
        }
        ResponseBean responseBean = new ResponseBean();
        try {
            JSONObject jsonObject = analyService.getData(xdsType, domainId, uniqueId, xdsVersion);
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setObject(jsonObject);
        } catch (Exception e) {
            responseBean.setMessage(e.getMessage());
        }
        return responseBean.toString();
    }

    /**
     * 根据文档路径获取文档内容
     *
     * @param filePath
     * @return
     */
    @PostMapping("/getFile")
    public void getFile(String type, String filePath, HttpServletResponse response) throws IOException {
        if (StringUtils.isEmpty(type)) {
            response.sendError(500, "文件类型为空！");
        }
        if (StringUtils.isEmpty(filePath)) {
            response.sendError(500, "文件路径为空！");
        }
        IFileSystemService fileSystemService = fileFactory.getFileSystemService(storageCode);
        InputStream inputStream = null;
        OutputStream out = null;
        try {
            File file = fileSystemService.getFile(filePath);
            if (!file.exists()) {
                response.sendError(500, "文件不存在！");
            }
            inputStream = fileSystemService.getInputStream(file);
            response.setContentType(getContentType(type) + ";charset=utf-8");
            out = response.getOutputStream();
            //读取文件流
            int len = 0;
            byte[] buffer = new byte[1024 * 10];
            while ((len = inputStream.read(buffer)) != -1) {
                out.write(buffer, 0, len);
            }
            out.flush();
        } catch (IOException e) {
            log.error("读取文件失败,文件路径为：{}", filePath);
            log.error(e.getMessage(), e);
            response.sendError(500, "读取文件失败！");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            response.sendError(500, "类型不存在！");
        } finally {
            IOUtils.closeQuietly(out);
            IOUtils.closeQuietly(inputStream);
        }

    }

    private String getContentType(String type) throws Exception {
        switch (type) {
            case Constants.PDF_TYPE:
                return "application/pdf";
            default:
                throw new Exception("解析类型不存在！");
        }
    }

}
