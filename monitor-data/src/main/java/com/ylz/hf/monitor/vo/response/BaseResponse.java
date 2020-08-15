package com.ylz.hf.monitor.vo.response;

import java.io.Serializable;

public class BaseResponse implements Serializable {
    private String code;
    private String message;
    private static final long serialVersionUID = -3518052268701541168L;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
