package com.ylz.cdr.show.interceptor;

import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class ResponseBodyAnalysis implements ResponseBodyAdvice {

    public static final List<String> excludedMethod = Arrays.asList("login", "logout", "getPatient");

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter arg1,
                                  MediaType arg2, Class arg3, ServerHttpRequest arg4,
                                  ServerHttpResponse arg5) {
        ResponseBean responseBean = (ResponseBean) JSONObject.toBean(JSONObject.fromObject(body), ResponseBean.class);
        if (StringUtils.equals(responseBean.getCode(), Constants.ERROR_CODE) || StringUtils.equals(responseBean.getCode(), "50014")) {
            return body;
        }
        Object object = responseBean.getObject();
        if (null != object) {
            JSONObject jsonObject = JSONObject.fromObject(object);
            putSenseData(jsonObject);
            responseBean.setObject(jsonObject);
        }
        List listJson = responseBean.getRows();
        JSONArray jsonArray = new JSONArray();
        if (CollectionUtils.isNotEmpty(listJson)) {
            for (Object json : listJson) {
                JSONObject jsonObject = JSONObject.fromObject(json);
                putSenseData(jsonObject);
                jsonArray.add(jsonObject);
            }
            responseBean.setRows(jsonArray);
        }
        return responseBean.toString();
    }

    /**
     * 数据加密展示
     *
     * @param jsonObject
     */
    private void putSenseData(JSONObject jsonObject) {
        if (jsonObject.containsKey("patientName") && !jsonObject.getString("patientName").isEmpty()) {
            String patientName = jsonObject.getString("patientName");
            patientName = getPatientName(patientName);
            jsonObject.put("patientName", patientName);
        }
        if (jsonObject.containsKey("idNum") && !jsonObject.getString("idNum").isEmpty()) {
            String idNum = jsonObject.getString("idNum");
            int length = idNum.length();
            idNum = idNum.substring(0, 3) + "************" + idNum.substring(length - 3, length);
            jsonObject.put("idNum", idNum);
        }
        if (jsonObject.containsKey("identityNo") && !jsonObject.getString("identityNo").isEmpty()) {
            String idNo = jsonObject.getString("identityNo");
            int length = idNo.length();
            idNo = idNo.substring(0, 3) + "************" + idNo.substring(length - 3, length);
            jsonObject.put("identityNo", idNo);
        }
        if (jsonObject.containsKey("idNo") && !jsonObject.getString("idNo").isEmpty()) {
            String idNo = jsonObject.getString("idNo");
            int length = idNo.length();
            idNo = idNo.substring(0, 3) + "************" + idNo.substring(length - 3, length);
            jsonObject.put("idNo", idNo);
        }
        if (jsonObject.containsKey("phoneNo") && !jsonObject.getString("phoneNo").isEmpty()) {
            String telephone = jsonObject.getString("phoneNo");
            if (telephone.length() >= 3) {
                telephone = telephone.substring(0, 3) + "********";
            }
            jsonObject.put("phoneNo", telephone);
        }
        if (jsonObject.containsKey("telephone") && !jsonObject.getString("telephone").isEmpty()) {
            String telephone = jsonObject.getString("telephone");
            if (telephone.length() >= 3) {
                telephone = telephone.substring(0, 3) + "********";
            }
            jsonObject.put("telephone", telephone);
        }
    }

    private String getPatientName(String patientName) {
        int length = patientName.length();
        if (length <= 3) {
            return patientName.substring(0, 1) + "*" + patientName.substring(2, length);
        } else if (length > 3 && length <= 6) {
            return patientName.substring(0, 1) + "**" + patientName.substring(3, length);
        } else if (length > 6) {
            return patientName.substring(0, 2) + "****" + patientName.substring(6, length);
        }
        return null;
    }

    @Override
    public boolean supports(MethodParameter paramMethodParameter, Class arg1) {
        boolean isIntercept = true;
        //不拦截
        Method method = paramMethodParameter.getMethod();
        if (method.getReturnType().isAssignableFrom(String.class)
                && method.getName().startsWith("test")) {
            isIntercept = false;
        }

        //不拦截指定方法
        if (excludedMethod.contains(method.getName())) {
            isIntercept = false;
        }
        return isIntercept;
    }

}