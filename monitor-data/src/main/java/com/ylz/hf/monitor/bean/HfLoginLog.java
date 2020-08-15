package com.ylz.hf.monitor.bean;

import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/*
 *  字典表
 */
@TableName("hf_login_log")
public class HfLoginLog {
    private int id;
    private String userId;
    private String userName;
    private String type;
    private Date loginTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}
