package com.ylz.manager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.common.tool.MD5Util;
import com.ylz.common.tool.PageParam;
import com.ylz.common.tool.PageUtil;
import com.ylz.log.bean.HfLoginLog;
import com.ylz.log.dao.HfLoginLogMapper;
import com.ylz.manager.bean.ManagerFun;
import com.ylz.manager.bean.ManagerUser;
import com.ylz.manager.bean.UserRole;
import com.ylz.manager.dao.ManagerFunMapper;
import com.ylz.manager.dao.ManagerUserMapper;
import com.ylz.manager.dao.UserRoleMapper;
import com.ylz.manager.service.IUserService;
import com.ylz.manager.vo.UserFunVo;
import com.ylz.manager.vo.UserVo;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl extends ServiceImpl<ManagerUserMapper, ManagerUser> implements IUserService {
    private static final Logger log = LoggerFactory.getLogger(UserServiceImpl.class);

    @Autowired
    private ManagerUserMapper managerUserMapper;
    @Autowired
    private ManagerFunMapper managerFunMapper;
    @Autowired
    private UserRoleMapper userRoleMapper;
    @Autowired
    private HfLoginLogMapper hfLoginLogMapper;

    @Override
    public ResponseBean pageUser(Integer page, Integer size, String userName, Integer roleId) {
        ResponseBean responseBean = new ResponseBean();
        try {
            int count = managerUserMapper.countAll(userName, roleId);
            responseBean.setTotal(count);
            if (count == 0) {
                responseBean.setCode(Constants.SUCCESS_CODE);
                return responseBean;
            }
            PageParam pageParam = new PageParam();
            if (!PageUtil.setFromAndTo(page, size, count, pageParam)) {
                responseBean.setMessage("page or size 传参错误,大于数据存在最大数目！");
                return responseBean;
            }
            List<UserVo> managerUserList = managerUserMapper.queryPage(pageParam, userName, roleId);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(managerUserList)) {
                return responseBean;
            }
            responseBean.setRows(managerUserList);
        } catch (Exception e) {
            log.error("分页查询用户信息出错！", e.getMessage(), e);
            responseBean.setMessage("分页查询用户信息出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean login(String username, String password, boolean isSso) {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<UserVo> managerUserList = managerUserMapper.queryAll(username);
            if (CollectionUtils.isEmpty(managerUserList)) {
                responseBean.setMessage(username + ":用户不存在！");
                return responseBean;
            }
            UserVo managerUser = managerUserList.get(0);
            if (!isSso) {
                String pwd = MD5Util.stringMD5(password);
                if (!StringUtils.equals(pwd, managerUser.getPassword())) {
                    responseBean.setMessage(username + ":密码输入错误！");
                    return responseBean;
                }
            }
            List<ManagerFun> managerFunList = managerFunMapper.queryByRoleId(managerUser.getRoleId());
            UserFunVo userFunVo = new UserFunVo(managerUser);
            userFunVo.setFunList(managerFunList);
            responseBean.setObject(userFunVo);
            responseBean.setCode(Constants.SUCCESS_CODE);
            insertLoginLog(managerUser);
        } catch (Exception e) {
            log.error("查询用户信息出错！", e.getMessage(), e);
            responseBean.setMessage("查询用户信息出错！");
        }
        return responseBean;
    }

    @Override
    public boolean mergeData(ManagerUser user) {
        try {
            QueryWrapper<ManagerUser> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda().like(ManagerUser::getUserName, user.getUserName());
            ManagerUser hisUser = this.getOne(queryWrapper);
            if (null != hisUser) {
                this.update(user, queryWrapper);
            } else {
                this.save(user);
            }
            return true;
        } catch (Exception e) {
            log.error("新增或者修改用户出错，{}，{}", e.getMessage(), e);
        }
        return false;
    }

    private void insertLoginLog(UserVo managerUser) {
        HfLoginLog hfLoginLog = new HfLoginLog();
        hfLoginLog.setUserId(managerUser.getUserName());
        hfLoginLog.setUserName(managerUser.getUserName());
        hfLoginLog.setType("HF");
        hfLoginLog.setLoginTime(new Date());
        hfLoginLogMapper.insert(hfLoginLog);
    }

    @Override
    public ResponseBean listUser(String userName) {
        ResponseBean responseBean = new ResponseBean();
        try {
            List<UserVo> managerUserList = managerUserMapper.queryAll(userName);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(managerUserList)) {
                return responseBean;
            }
            responseBean.setTotal(managerUserList.size());
            responseBean.setRows(managerUserList);
        } catch (Exception e) {
            log.error("查询用户信息出错！", e.getMessage(), e);
            responseBean.setMessage("查询用户信息出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean updateUser(UserVo userVo) {
        ResponseBean responseBean = new ResponseBean();
        String password = userVo.getPassword();
        if (StringUtils.isNotEmpty(password)) {
            String pwd = MD5Util.stringMD5(password);
            userVo.setPassword(pwd);
        }
        try {
            managerUserMapper.updateById(userVo);
            QueryWrapper<UserRole> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda().eq(UserRole::getUserName, userVo.getUserName());
            userRoleMapper.delete(queryWrapper);
            if (0 != userVo.getRoleId()) {
                userRoleMapper.insert(userVo);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("更新用户信息出错！", e.getMessage(), e);
            responseBean.setMessage("更新用户信息出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean addUser(UserVo userVo) {
        ResponseBean responseBean = new ResponseBean();
        try {
            QueryWrapper<ManagerUser> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda().like(ManagerUser::getUserName, userVo.getUserName());
            ManagerUser managerUser = this.getOne(queryWrapper);
            if (null != managerUser) {
                responseBean.setMessage("用户名已经存在！");
                return responseBean;
            }
            String password = userVo.getPassword();
            String pwd = MD5Util.stringMD5(password);
            userVo.setPassword(pwd);
            managerUserMapper.insert(userVo);
            if (0 != userVo.getRoleId()) {
                userRoleMapper.insert(userVo);
            }
            responseBean.setCode(Constants.SUCCESS_CODE);
        } catch (Exception e) {
            log.error("增加用户出错，{}，{}", e.getMessage(), e);
            responseBean.setMessage("用户名已经存在！");
        }
        return responseBean;
    }
}
