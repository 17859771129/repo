package com.ylz.hf.show.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ylz.cda.bean.TdyListDrug;
import com.ylz.cda.bean.TdyListOrder;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.bean.InoculationInfo;
import com.ylz.hf.show.service.IDocInfoService;
import com.ylz.hf.show.service.impl.FileServiceImpl;
import com.ylz.hf.show.service.impl.HfDocIndexServiceImpl;
import com.ylz.hf.show.vo.HfDocIndexVo;
import com.ylz.manager.service.IDocService;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

@Controller
@RequestMapping("/hfDoc")
public class HfDocController {

    private static final Logger log = LoggerFactory.getLogger(HfDocController.class);

    @Autowired
    private HfDocIndexServiceImpl hfDocIndexService;

    @Autowired
    private IDocService docService;

    @Autowired
    private IDocInfoService docInfoService;

    @Autowired
    private FileServiceImpl fileService;

    /**
     * 查询索引信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/reset", method = RequestMethod.GET)
    public String reset() {
        ResponseBean responseBean = new ResponseBean();
        docService.reset();
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }

    /**
     * 查询档案索引信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getHfIndex", method = RequestMethod.POST)
    public ResponseBean getHfIndex(String globalId, String xdsType,
                                   String encounterId,
                                   String startTime,
                                   String endTime,
                                   String agencyName) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean;
        }
        List<HfDocIndexVo> hfDocIndexVoList = hfDocIndexService.queryIndex(globalId, xdsType, startTime, endTime, agencyName);
        responseBean.setRows(hfDocIndexVoList);
        responseBean.setTotal(hfDocIndexVoList.size());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }

    /**
     * 查询电子病历索引信息
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getCdaIndex", method = RequestMethod.POST)
    public String getCdaIndex(String globalId, String xdsType,
                              String encounterId,
                              String startTime,
                              String endTime,
                              String agencyName,
                              String visitDept) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(globalId)) {
            responseBean.setMessage("患者唯一ID为空,请检查参数！");
            return responseBean.toString();
        }
        if (StringUtils.isEmpty(startTime)) {
            startTime = Constants.START_TIME;
        }
        List<HfDocIndexVo> hfDocIndexVoList = hfDocIndexService.queryCdaIndex(globalId, xdsType, startTime, endTime, agencyName, visitDept);
        responseBean.setRows(hfDocIndexVoList);
        responseBean.setTotal(hfDocIndexVoList.size());
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean.toString();
    }

    /**
     * 西药处方信息获取
     *
     * @param xdsType
     * @param domainId
     * @param uniqueId
     * @param xdsVersion
     * @return
     */
    @ResponseBody
    @PostMapping("/getWestInfo")
    public ResponseBean getWestInfo(String xdsType, String domainId, String uniqueId, String xdsVersion,
                                    @RequestParam(defaultValue = "1")
                                            Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(xdsType) || StringUtils.isEmpty(domainId) || StringUtils.isEmpty(uniqueId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        IPage<TdyListDrug> westInfo = docInfoService.getWestInfo(xdsType, domainId, uniqueId, xdsVersion, page, size);
        if (westInfo.getTotal() > 0) {
            responseBean.setTotal((int) westInfo.getTotal());
            responseBean.setRows(westInfo.getRecords());
        }
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
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
    @ResponseBody
    @PostMapping("/getOrderInfo")
    public ResponseBean getOrderInfo(String xdsType, String domainId,
                                     String uniqueId, String xdsVersion, String type,
                                     @RequestParam(defaultValue = "1")
                                             Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(xdsType) || StringUtils.isEmpty(domainId) || StringUtils.isEmpty(uniqueId) || StringUtils.isEmpty(type)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        IPage<TdyListOrder> westInfo = docInfoService.getOrderInfo(xdsType, domainId, uniqueId, xdsVersion, type, page, size);
        if (westInfo.getTotal() > 0) {
            responseBean.setTotal((int) westInfo.getTotal());
            responseBean.setRows(westInfo.getRecords());
        }
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
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
    @ResponseBody
    @PostMapping("/getInoculationInfo")
    public ResponseBean getInoculationInfo(String xdsType, String domainId,
                                           String uniqueId, String xdsVersion,
                                           @RequestParam(defaultValue = "1")
                                                   Integer page, @RequestParam(defaultValue = "10") Integer size) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(xdsType) || StringUtils.isEmpty(domainId) || StringUtils.isEmpty(uniqueId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean;
        }
        IPage<InoculationInfo> westInfo = docInfoService.getInoculationInfo(xdsType, domainId, uniqueId, xdsVersion, page, size);
        if (westInfo.getTotal() > 0) {
            responseBean.setTotal((int) westInfo.getTotal());
            responseBean.setRows(westInfo.getRecords());
        }
        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
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
    @ResponseBody
    @PostMapping("/getDoc")
    public String getDoc(Integer id, String xdsType, String domainId, String uniqueId, String xdsVersion, String type) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(xdsType) || StringUtils.isEmpty(domainId) || StringUtils.isEmpty(uniqueId)) {
            responseBean.setMessage("查询条件不能为空");
            return responseBean.toString();
        }
        responseBean = docInfoService.getDocInfo(id, xdsType, domainId, uniqueId, xdsVersion, type);
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
            return;
        }
        if (StringUtils.isEmpty(filePath)) {
            response.sendError(500, "文件路径为空！");
            return;
        }
        InputStream inputStream = null;
        OutputStream out = null;
        try {
            File file = fileService.getFile(filePath);
            if (!file.exists()) {
                response.sendError(500, "文件不存在！");
                return;
            }
            inputStream = FileUtils.openInputStream(file);
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
            case "HTML":
                return "text/html";
            case "CDA":
                return "text/xml";
            default:
                throw new Exception("解析类型不存在！");
        }
    }


}
