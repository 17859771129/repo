package com.ylz.manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.common.tool.PageParam;
import com.ylz.manager.bean.ManagerUser;
import com.ylz.manager.vo.UserVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerUserMapper extends BaseMapper<ManagerUser> {

    int countAll(@Param("userName") String userName, @Param("roleId") Integer roleId) throws Exception;

    List<UserVo> queryPage(@Param("pageParam") PageParam pageParam, @Param("userName") String userName, @Param("roleId") Integer roleId) throws Exception;

    List<UserVo> queryAll(@Param("userName") String userName) throws Exception;

}