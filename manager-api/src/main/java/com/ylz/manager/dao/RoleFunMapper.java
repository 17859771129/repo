package com.ylz.manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.manager.bean.RoleFun;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleFunMapper extends BaseMapper<RoleFun> {
    void insertList(@Param("funList") List<String> funList, @Param("roleId") Integer id);
}
