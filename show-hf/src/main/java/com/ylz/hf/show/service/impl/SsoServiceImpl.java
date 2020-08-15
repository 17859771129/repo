package com.ylz.hf.show.service.impl;

import com.ylz.hf.show.service.ISsoService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service("ssoService")
public class SsoServiceImpl implements ISsoService {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${master.url}")
    private String masterUrl;

    @Value("${redirect.url}")
    private String redirectUrl;

    @Value("${login.check.url}")
    private String loginCheckUrl;

    public JSONObject getUser(String token) {
        //验证token
        Map<String, String> param = new HashMap<>();
        param.put("xxl_sso_sessionid", token);
        String resultString = restTemplate.postForObject(loginCheckUrl, param, String.class);
        JSONObject resultObject = JSONObject.fromObject(resultString);
        return resultObject;

    }
}
