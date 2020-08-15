package com.ylz.manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.manager.bean.ManagerFun;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerFunMapper extends BaseMapper<ManagerFun> {

    List<ManagerFun> queryByRoleId(@Param("roleId") Integer roleId);
}