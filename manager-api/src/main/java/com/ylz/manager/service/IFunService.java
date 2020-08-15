package com.ylz.manager.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerFun;

public interface IFunService {
    ResponseBean pageFun(Integer page, Integer size);

    ResponseBean listFun();

    void updateFun(ManagerFun managerFun);

    void addFun(ManagerFun managerFun);
}
