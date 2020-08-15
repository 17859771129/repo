package com.ylz.hf.write.contoller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.common.Constants;
import com.ylz.dict.service.impl.MetaConfigServiceImpl;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.write.service.impl.FileServiceImpl;
import com.ylz.hf.write.service.impl.HfDocIndexServiceImpl;
import com.ylz.verify.service.impl.VerifyConfigServiceImpl;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.File;
import java.io.IOException;

@Controller
@RequestMapping("/get")
public class GetDataController {

    private static final Logger log = LoggerFactory.getLogger(GetDataController.class);

    @Autowired
    private HfDocIndexServiceImpl hfDocIndexService;
    @Autowired
    private FileServiceImpl fileService;

    @Autowired
    private MetaConfigServiceImpl metaConfigService;

    @Autowired
    private VerifyConfigServiceImpl verifyConfigService;

    @ResponseBody
    @GetMapping(value = "/getData/{repositoryUniqueId}", produces = {"application/xml;charset=UTF-8"})
    public String getData(@PathVariable("repositoryUniqueId") String repositoryUniqueId) {
        QueryWrapper<DocIndex> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(DocIndex::getRepositoryUniqueId, repositoryUniqueId)
                .ne(DocIndex::getCdaStatus, Constants.ABANDON_STATUS);
        DocIndex hfDocIndex = hfDocIndexService.getOne(queryWrapper);
        if (null == hfDocIndex) {
            return "<xml>" + repositoryUniqueId + "的数据不存在，请检查参数！</xml>";
        }
        File file = fileService.getFile(hfDocIndex.getCdaPath());
        try {
            return FileUtils.readFileToString(file, "UTF-8");
        } catch (IOException e) {
            log.error("读取文件出错，文件路径为，{}", file.getPath());
            log.error(e.getMessage(), e);
        }
        return "<xml>文件读取错误！</xml>";
    }

    @ResponseBody
    @GetMapping(value = "/updateMetaConfig")
    public String updateMetaConfig() {
        metaConfigService.selectByData();
        metaConfigService.selectListByData();
        return "success";
    }

    @ResponseBody
    @GetMapping(value = "/updateVerifyConfig")
    public String updateVerifyConfig() {
        verifyConfigService.selectByData();
        return "success";
    }
}
