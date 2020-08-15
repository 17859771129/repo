package com.ylz.cdr.write.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ylz.cdr.common.HttpRequestUtils;
import com.ylz.cdr.write.service.IPatientService;
import com.ylz.cdr.write.vo.AddPatientBean;
import com.ylz.person.bean.PatientInfo;
import com.ylz.person.dao.PatientInfoMapper;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service("patientService")
public class PatientServiceImpl implements IPatientService {

    private static final Logger log = LoggerFactory.getLogger(PatientServiceImpl.class);

    @Autowired
    private PatientInfoMapper patientInfoMapper;
    @Value("${query.person.url}")
    private String queryPersonUrl;


    public boolean insertData(AddPatientBean patientBean) {
        PatientInfo patientInfo = setPatientInfo(patientBean);
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(PatientInfo::getPatientId, patientInfo.getPatientId())
                .eq(PatientInfo::getPatientDomainId, patientInfo.getPatientDomainId());
        PatientInfo hisPatient = patientInfoMapper.selectOne(queryWrapper);
        if (null == hisPatient) {
            patientInfoMapper.insert(patientInfo);
            return true;
        }
        if (!StringUtils.equals(patientInfo.getGlobalId(), hisPatient.getGlobalId())) {
            log.error("更新前的globaleId是{}，更新后的globaleId是{}", hisPatient.getGlobalId(), patientInfo.getGlobalId());
        }
        patientInfoMapper.update(patientInfo, queryWrapper);
        return true;
    }


    public String getEmpi(String patientId, String patientDomainId) {
        QueryWrapper<PatientInfo> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda()
                .eq(PatientInfo::getPatientId, patientId)
                .eq(PatientInfo::getPatientDomainId, patientDomainId);
        PatientInfo hisPatient = patientInfoMapper.selectOne(queryWrapper);
        if (null != hisPatient) {
            return hisPatient.getGlobalId();
        }
        JSONObject paramJson = new JSONObject();
        paramJson.put("patientId", patientId);
        paramJson.put("patientDomainId", patientDomainId);
        JSONArray jsonArray = query(paramJson, queryPersonUrl);
        if (null == jsonArray || jsonArray.size() == 0) {
            log.error("查询不到患者信息，查询条件为：{}", paramJson);
            return null;
        }
        if (jsonArray.size() > 1) {
            log.error("患者信息多条，查询条件为：{}", paramJson);
            return null;
        }
        AddPatientBean patientBean = (AddPatientBean) JSONObject.toBean(jsonArray.getJSONObject(0), AddPatientBean.class);
        patientBean.setPatientDomainId(patientBean.getSendId());
        insertData(patientBean);
        return patientBean.getGlobalId();

    }

    /**
     * 注册病人信息
     *
     * @param queryJson
     * @return
     */
    public JSONArray query(JSONObject queryJson, String url) {
        String result = HttpRequestUtils.getHttpPostForString(url, queryJson);
        log.debug("url is {},param is {},the return message is {}", url, queryJson, result);
        if (null == result || result.isEmpty()) {
            log.error("远程调用出错,url为{}，参数为{}", url, queryJson);
            log.error("返回值是{}", result);
            return null;
        }
        JSONArray jsonArray = JSONArray.fromObject(result);
        return jsonArray;
    }

    private PatientInfo setPatientInfo(AddPatientBean addPatientBean) {
        PatientInfo patientInfo = new PatientInfo();
        BeanUtils.copyProperties(addPatientBean, patientInfo);
        patientInfo.setTelephone(addPatientBean.getPhoneNumber());
        return patientInfo;
    }


}
