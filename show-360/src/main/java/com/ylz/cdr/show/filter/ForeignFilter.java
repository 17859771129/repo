package com.ylz.cdr.show.filter;


import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.tool.RedisUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.AntPathMatcher;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class ForeignFilter extends HttpServlet implements Filter {

    private static Logger logger = LoggerFactory.getLogger(ForeignFilter.class);

    @Autowired
    private RedisUtil redisUtil;
    public static final String foreignPaths = "/foreign/*";
    private static final AntPathMatcher antPathMatcher = new AntPathMatcher();

    @Override
    public void init(FilterConfig filterConfig) {
        logger.info("Login Verification init!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        String servletPath = req.getServletPath();
        if (foreignPaths != null && foreignPaths.trim().length() > 0) {
            for (String excludedPath : foreignPaths.split(",")) {
                String uriPattern = excludedPath.trim();
                // 支持ANT表达式
                if (antPathMatcher.match(uriPattern, servletPath)) {
                    // excluded path, allow
                    chain.doFilter(request, response);
                    return;
                }
            }
        }
        ResponseBean responseBean = new ResponseBean();
        responseBean.setCode("50014");
        String tokenId = req.getHeader("token");
        if (StringUtils.isEmpty(tokenId)) {
            res.setContentType("application/json;charset=utf-8");
            responseBean.setMessage("请先登录！");
            res.getWriter().println(responseBean.toString());
            return;
        }
        Object object = redisUtil.get(tokenId);
        if (null == object) {
            res.setContentType("application/json;charset=utf-8");
            responseBean.setMessage("权限验证未通过，请先登录！");
            res.getWriter().println(responseBean.toString());
            return;
        }
        System.out.println("object:" + object);
        ((HttpServletResponse) response).setHeader("userFunVo", (String) object);
        chain.doFilter(request, response);
    }
}


