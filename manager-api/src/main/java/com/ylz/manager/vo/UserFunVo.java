package com.ylz.manager.vo;


import com.ylz.manager.bean.ManagerFun;

import java.util.List;

public class UserFunVo extends UserVo {
    private List<ManagerFun> funList;
    private String token;

    public UserFunVo(UserVo userVo) {
        this.setAge(userVo.getAge());
        this.setRoleId(userVo.getRoleId());
        this.setRoleName(userVo.getRoleName());
        this.setId(userVo.getId());
        this.setUserName(userVo.getUserName());
        this.setRealName(userVo.getRealName());
        this.setEmail(userVo.getEmail());
        this.setPhone(userVo.getPhone());
        this.setAge(userVo.getAge());
        this.setBirthday(userVo.getBirthday());
        this.setDeptCode(userVo.getDeptCode());
    }

    public UserFunVo() {
    }

    public List<ManagerFun> getFunList() {
        return funList;
    }

    public void setFunList(List<ManagerFun> funList) {
        this.funList = funList;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
