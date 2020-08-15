package com.ylz.cdr.show.tool;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;

import java.util.List;

/**
 * 响应结果生成工具
 */
public class ResponseUtil {

    public static ResponseBean genFailResult(String message) {
        return new ResponseBean(Constants.ERROR_CODE, message);
    }

    public static String genFailString(String message) {
        return genFailResult(message).toString();
    }

    public static ResponseBean genSuccessListResult(Integer total, List data) {
        return new ResponseBean(Constants.SUCCESS_CODE, null, data, total);
    }

    public static ResponseBean genSuccessListResult(List data) {
        return new ResponseBean(Constants.SUCCESS_CODE, null, data, data.size());
    }

    public static String genSuccessResult(Integer total, List data) {
        return genSuccessListResult(total, data).toString();
    }

    public static String genSuccessResult(List data) {
        return genSuccessResult(data.size(), data).toString();
    }

    public static ResponseBean genSuccessObjectResult(Object object) {
        return new ResponseBean(Constants.SUCCESS_CODE, null, object);
    }
}
