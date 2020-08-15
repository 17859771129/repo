package com.ylz.hf.show.controller;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.service.IUserService;
import com.ylz.manager.vo.UserVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @PostMapping("/addUser")
    public String addUser(UserVo userVo) {
        ResponseBean responseBean = new ResponseBean();
        if (StringUtils.isEmpty(userVo.getUserName())) {
            responseBean.setMessage("用户名为空！");
            return responseBean.toString();
        }
        if (StringUtils.isEmpty(userVo.getPassword())) {
            responseBean.setMessage("密码为空！");
            return responseBean.toString();
        }
        responseBean = userService.addUser(userVo);
        return responseBean.toString();
    }

    @PostMapping("/updateUser")
    public String updateUser(UserVo userVo) {
        ResponseBean responseBean = userService.updateUser(userVo);
        return responseBean.toString();
    }

    @PostMapping("/listUser")
    public String listUser(String userName) {
        ResponseBean responseBean = userService.listUser(userName);
        return responseBean.toString();
    }

    @PostMapping("/pageUser")
    public String pageUser(@RequestParam(defaultValue = "1")
                                   Integer page, @RequestParam(defaultValue = "10") Integer size,
                           @RequestParam(required = false) String userName, @RequestParam(required = false) Integer roleId) {
        ResponseBean responseBean = userService.pageUser(page, size, userName, roleId);
        return responseBean.toString();
    }

}
