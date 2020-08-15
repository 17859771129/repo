package com.ylz.manager.vo;


import com.ylz.manager.bean.ManagerFun;
import com.ylz.manager.bean.ManagerRole;

import java.util.List;

public class RoleVo extends ManagerRole {

    private static final long serialVersionUID = 1527216227014285284L;

    private List<ManagerFun> funList;

    public List<ManagerFun> getFunList() {
        return funList;
    }

    public void setFunList(List<ManagerFun> funList) {
        this.funList = funList;
    }
}
