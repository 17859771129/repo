package com.ylz.manager.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerRole;

import java.util.List;

public interface IRoleService {
    ResponseBean pageRole(String enableFlag, Integer page, Integer size);

    ResponseBean listRole(String enableFlag);

    ResponseBean updateRole(ManagerRole managerRole, List<String> funList);

    ResponseBean addRole(ManagerRole role, List<String> funList);
}
