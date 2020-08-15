package com.ylz.cdr.show.controller.foreign;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.IAnalyService;
import com.ylz.cdr.show.service.IDomainDocService;
import com.ylz.cdr.show.service.impl.DocIndexServiceImpl;
import com.ylz.cdr.show.tool.RedisUtil;
import com.ylz.cdr.show.tool.ResponseUtil;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.dao.PatientVisitMapper;
import com.ylz.person.service.impl.PatientInfoServiceImpl;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/foreign")
public class ForeignController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private PatientVisitMapper patientVisitMapper;

    @Autowired
    private PatientInfoServiceImpl patientInfoService;

    @Autowired
    private IDomainDocService docmainDocService;

    @Autowired
    private DocIndexServiceImpl docIndexService;

    @Autowired
    private IAnalyService analyService;

    /**
     * 获取就诊列表接口
     *
     * @param token
     * @param readDomainId
     * @param identifyId
     * @return
     */
    @PostMapping("/queryVisit")
    public String queryVisit(String token, String readDomainId, String identifyId) {
        if (StringUtils.isEmpty(token)) {
            return ResponseUtil.genFailString("token不能为空");
        }
        if (StringUtils.isEmpty(readDomainId)) {
            return ResponseUtil.genFailString("readDomainId不能为空");
        }
        if (StringUtils.isEmpty(identifyId)) {
            return ResponseUtil.genFailString("identifyId不能为空");
        }
        Object objct = redisUtil.get(token);
        if (null == objct) {
            return ResponseUtil.genFailString("tokenId：" + token + "已失效或传入错误！");
        }
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(PatientInfo::getIdentityNo, identifyId);
        PatientInfo patientInfo = patientInfoService.getOne(queryWrapper);
        if (null == patientInfo) {
            return ResponseUtil.genFailString("identifyId为" + identifyId + "不存在！");
        }
        Set<String> codeList = docmainDocService.getDocCodeList(readDomainId);
        if (CollectionUtils.isEmpty(codeList)) {
            return ResponseUtil.genSuccessResult(new ArrayList());
        }
        Set<String> encounterSet = docIndexService.getEncounterId(codeList, patientInfo.getGlobalId());
        if (CollectionUtils.isEmpty(encounterSet)) {
            return ResponseUtil.genSuccessResult(new ArrayList());
        }
        List<Map<String, Object>> visitByPersonId = patientVisitMapper.getVisitByPersonId(patientInfo.getGlobalId(), encounterSet);
        return ResponseUtil.genSuccessResult(visitByPersonId);
    }


    /**
     * 获取调阅文档类型接口
     *
     * @param token
     * @param readDomainId
     * @param encounterId
     * @param globalId
     * @return
     */
    @PostMapping("/queryDocIndex")
    public String queryDocIndex(String token, String readDomainId, String encounterId, String globalId) {
        if (StringUtils.isEmpty(token)) {
            return ResponseUtil.genFailString("token不能为空");
        }
        if (StringUtils.isEmpty(readDomainId)) {
            return ResponseUtil.genFailString("readDomainId不能为空");
        }
        if (StringUtils.isEmpty(encounterId)) {
            return ResponseUtil.genFailString("encounterId不能为空");
        }
        if (StringUtils.isEmpty(globalId)) {
            return ResponseUtil.genFailString("globalId不能为空");
        }
        Object objct = redisUtil.get(token);
        if (null == objct) {
            return ResponseUtil.genFailString("tokenId：" + token + "已失效或传入错误！");
        }
        Set<String> codeList = docmainDocService.getDocCodeList(readDomainId);
        if (CollectionUtils.isEmpty(codeList)) {
            return ResponseUtil.genSuccessResult(new ArrayList());
        }
        return docIndexService.getDocInfoListByPersonId(globalId, encounterId, codeList).toString();
    }

    /**
     * 获取调阅文档类型接口
     *
     * @param token
     * @param readDomainId
     * @param uniqueId
     * @param domainId
     * @param xdsType
     * @param xdsVersion
     * @return
     */
    @PostMapping(value = "/queryDocInfo")
    public String queryDocInfo(String token, String readDomainId, String uniqueId, String domainId, String xdsType, String xdsVersion) {
        if (StringUtils.isEmpty(token)) {
            return ResponseUtil.genFailString("token不能为空");
        }
        if (StringUtils.isEmpty(readDomainId)) {
            return ResponseUtil.genFailString("readDomainId不能为空");
        }
        if (StringUtils.isEmpty(uniqueId)) {
            return ResponseUtil.genFailString("uniqueId不能为空");
        }
        if (StringUtils.isEmpty(xdsType)) {
            return ResponseUtil.genFailString("xdsType不能为空");
        }
        if (StringUtils.isEmpty(domainId)) {
            return ResponseUtil.genFailString("domainId不能为空");
        }
        Object objct = redisUtil.get(token);
        if (null == objct) {
            return ResponseUtil.genFailString("tokenId：" + token + "已失效或传入错误！");
        }
        Set<String> codeList = docmainDocService.getDocCodeList(readDomainId);
        if (CollectionUtils.isEmpty(codeList)) {
            return ResponseUtil.genSuccessResult(new ArrayList());
        }
        if (!codeList.contains(xdsType)) {
            return ResponseUtil.genFailString("系统对于类型为" + xdsType + "的数据没有权限！");
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


}
