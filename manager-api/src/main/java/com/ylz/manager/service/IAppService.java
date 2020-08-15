package com.ylz.manager.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerApp;

public interface IAppService {
    ResponseBean pageApp(Integer page, Integer size);

    ResponseBean listApp();

    void updateApp(ManagerApp managerApp);

    void addApp(ManagerApp managerApp);
}
