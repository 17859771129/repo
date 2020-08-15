package com.ylz.manager.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerUser;
import com.ylz.manager.vo.UserVo;

public interface IUserService {
    ResponseBean addUser(UserVo managerUser);

    ResponseBean updateUser(UserVo userVo);

    ResponseBean listUser(String userName);

    ResponseBean pageUser(Integer page, Integer size, String userName, Integer roleId);

    ResponseBean login(String username, String password, boolean isSso);

    boolean mergeData(ManagerUser managerUser);
}
