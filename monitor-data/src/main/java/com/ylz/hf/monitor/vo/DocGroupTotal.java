package com.ylz.hf.monitor.vo;

import java.io.Serializable;

public class DocGroupTotal implements Serializable {
    private static final long serialVersionUID = -7127084391146906996L;
    private String name;
    private String code;
    private int total;

    public DocGroupTotal(String name, String code) {
        this.name = name;
        this.code = code;
        this.total = 0;
    }

    public DocGroupTotal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
