package com.ylz.manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.manager.bean.UserRole;
import com.ylz.manager.vo.UserVo;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleMapper extends BaseMapper<UserRole> {

    int insert(UserVo userVo) throws Exception;

}