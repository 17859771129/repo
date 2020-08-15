package com.ylz.hf.show.controller;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.common.tool.MD5Util;
import com.ylz.hf.show.service.ISsoService;
import com.ylz.hf.show.tool.RedisUtil;
import com.ylz.manager.service.IUserService;
import com.ylz.manager.vo.UserFunVo;
import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    public Logger logger = LogManager.getLogger(LoginController.class);

    @Value("${session.effective.hours:1}")
    private String sessionTime;
    @Autowired
    private IUserService userService;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private ISsoService ssoService;

    @Value("${master.url}")
    private String masterUrl;

    @Value("${redirect.url}")
    private String redirectUrl;

    @Value("${login.check.url}")
    private String loginCheckUrl;


    private String isLogin(String tokenId, boolean isSso) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(tokenId)) {
            responseBean.setMessage("token信息为空！");
            return responseBean.toString();
        }
        Object object = redisUtil.get(tokenId);
        if (null == object) {
            if (isSso) {
                JSONObject jsonObject = ssoService.getUser(tokenId);
                if (StringUtils.equals(jsonObject.getString("status"), "error")) {
                    responseBean.setCode("50014");
                    responseBean.setObject("redirect:" + masterUrl + "/login" + "?redirect_url=" + redirectUrl);
                    return responseBean.toString();
                }
                JSONObject messageJson = JSONObject.fromObject(jsonObject.getString("message"));
                responseBean = login(messageJson.getString("username"), null, true, tokenId);
                return responseBean.toString();
            }
            responseBean.setMessage("用户没有登录！");
            return responseBean.toString();
        }
        redisUtil.setHours(tokenId, object, Integer.valueOf(sessionTime));
        UserFunVo userFunVo = (UserFunVo) JSONObject.toBean(JSONObject.fromObject(object), UserFunVo.class);
        responseBean.setCode(Constants.SUCCESS_CODE);
        responseBean.setObject(userFunVo);
        return responseBean.toString();
    }

    @GetMapping({"/login"})
    public String login(HttpServletRequest request, String token) {
        logger.info("GET请求登录");
        if (StringUtils.isEmpty(token)) {
            String tokenId = request.getHeader("token");
            if (StringUtils.isNotEmpty(tokenId)) {
                ResponseBean responseBean = new ResponseBean();
                responseBean.setCode("50014");
                responseBean.setMessage("token为空！");
                return responseBean.toString();
            }
            return isLogin(tokenId, false);
        }
        return isLogin(token, true);
    }

    @PostMapping(value = "/login")
    public String loginPost(String username, String password) {
        logger.info("POST请求登录");
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isBlank(username)) {
            responseBean.setMessage("用户名不能为空");
            return responseBean.toString();
        } else if (StringUtils.isBlank(password)) {
            responseBean.setMessage("密码不能为空！");
            return responseBean.toString();
        }
        responseBean = login(username, password, false, null);
        return responseBean.toString();
    }

    private ResponseBean login(String username, String password, boolean isSso, String tokenId) {
        ResponseBean responseBean = userService.login(username, password, isSso);
        if (!StringUtils.equals(responseBean.getCode(), Constants.SUCCESS_CODE)) {
            return responseBean;
        }
        UserFunVo userFunVo = (UserFunVo) responseBean.getObject();
        tokenId = MD5Util.stringMD5("360_" + userFunVo.getUserName() + "_" + userFunVo.getRoleId());
        userFunVo.setToken(tokenId);
        redisUtil.setHours(tokenId, JSONObject.fromObject(userFunVo).toString(), Integer.valueOf(sessionTime));
        responseBean.setObject(userFunVo);
        return responseBean;
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        logger.info("POST请求登录");
        String tokenId = request.getHeader("token");
        ResponseBean responseBean = new ResponseBean();
        responseBean.setCode(Constants.SUCCESS_CODE);
        if (StringUtils.isEmpty(tokenId)) {
            responseBean.setObject("redirect:" + masterUrl + "/login" + "?redirect_url=" + redirectUrl);
            return responseBean.toString();
        }
        redisUtil.del(tokenId);
        responseBean.setObject("redirect:" + masterUrl + "/logout" + "?xxl_sso_sessionid=" + tokenId + "&redirect_url=" + redirectUrl);
        return responseBean.toString();
    }
}
