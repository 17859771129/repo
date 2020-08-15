package com.ylz.cdr.show.service.impl;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.service.ISsoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service("ssoService")
public class SsoServiceImpl implements ISsoService {

   /* @Value("${sso.url}")
    private String ssoUrl;*/

    @Value("${master.url}")
    private String masterUrl;

    @Value("${redirect.url}")
    private String redirectUrl;

    @Value("${login.check.url}")
    private String loginCheckUrl;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseBean getUserInfo(String token) {
        ResponseBean responseBean = new ResponseBean();
        /*Map<String, Object> map = new HashMap<>();
        map.put("token", token);
        JSONObject jsonObject = HttpRequestUtils.httpPost(ssoUrl, map);

        if (null == jsonObject) {
            responseBean.setMessage("获取用户信息为空！");
            return responseBean;
        }
        if (jsonObject.getInt("code") != 200) {
            responseBean.setMessage("获取用户信息出错！");
            return responseBean;
        }
        JSONObject dataJson = jsonObject.getJSONObject("data");
        String userName = dataJson.getString("username");
        responseBean.setObject(userName);*/

        responseBean.setCode(Constants.SUCCESS_CODE);
        return responseBean;
    }


    public JSONObject getUser(String token) {
        //验证token
        Map<String, String> param = new HashMap<>();
        param.put("xxl_sso_sessionid", token);
        String resultString = restTemplate.postForObject(loginCheckUrl, param, String.class);
        JSONObject resultObject = JSONObject.fromObject(resultString);
        return resultObject;

    }
}
