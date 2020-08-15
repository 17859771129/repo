package com.ylz.manager.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ylz.cdr.common.Constants;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.manager.bean.ManagerRole;
import com.ylz.manager.bean.RoleFun;
import com.ylz.manager.dao.ManagerRoleMapper;
import com.ylz.manager.dao.RoleFunMapper;
import com.ylz.manager.service.IRoleService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class RoleServiceImpl extends ServiceImpl<ManagerRoleMapper, ManagerRole> implements IRoleService {
    private static final Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Resource
    private ManagerRoleMapper managerRoleMapper;

    @Resource
    private RoleFunMapper roleFunMapper;

    @Override
    public ResponseBean pageRole(String enableFlag, Integer pageSize, Integer size) {
        ResponseBean responseBean = new ResponseBean();
        try {
            Page<ManagerRole> page = new Page<>(pageSize, size);
            QueryWrapper<ManagerRole> queryWrapper = new QueryWrapper<>();
            if (StringUtils.isNotEmpty(enableFlag)) {
                queryWrapper.lambda().eq(ManagerRole::getEnableFlag, enableFlag);
            }
            IPage<ManagerRole> iPage = this.page(page, queryWrapper);
            responseBean.setTotal((int) iPage.getTotal());
            responseBean.setCode(Constants.SUCCESS_CODE);
            responseBean.setRows(iPage.getRecords());
        } catch (Exception e) {
            log.error("分页查询角色信息出错！", e.getMessage(), e);
            responseBean.setMessage("分页查询角色信息出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean listRole(String enableFlag) {
        ResponseBean responseBean = new ResponseBean();
        try {
            QueryWrapper<ManagerRole> queryWrapper = new QueryWrapper<>();
            queryWrapper.lambda().eq(ManagerRole::getEnableFlag, enableFlag);
            List<ManagerRole> managerRoleList = this.list(queryWrapper);
            responseBean.setCode(Constants.SUCCESS_CODE);
            if (CollectionUtils.isEmpty(managerRoleList)) {
                return responseBean;
            }
            responseBean.setTotal(managerRoleList.size());
            responseBean.setRows(managerRoleList);
        } catch (Exception e) {
            log.error("查询角色信息出错！", e.getMessage(), e);
            responseBean.setMessage("查询角色信息出错！");
        }
        return responseBean;
    }

    @Override
    public ResponseBean updateRole(ManagerRole managerRole, List<String> funList) {
        this.updateById(managerRole);
        QueryWrapper<RoleFun> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(RoleFun::getRoleId, managerRole.getId());
        roleFunMapper.delete(queryWrapper);
        if (CollectionUtils.isNotEmpty(funList)) {
            roleFunMapper.insertList(funList, managerRole.getId());
        }
        return new ResponseBean(Constants.SUCCESS_CODE, "");
    }

    @Override
    public ResponseBean addRole(ManagerRole role, List<String> funList) {
        role.setCreateTime(new Date());
        managerRoleMapper.insert(role);
        QueryWrapper<RoleFun> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(RoleFun::getRoleId, role.getId());
        roleFunMapper.delete(queryWrapper);
        if (CollectionUtils.isNotEmpty(funList)) {
            roleFunMapper.insertList(funList, role.getId());
        }
        return new ResponseBean(Constants.SUCCESS_CODE, "");
    }
}
