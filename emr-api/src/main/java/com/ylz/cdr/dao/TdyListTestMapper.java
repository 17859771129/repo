package com.ylz.cdr.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.cdr.bean.TdyListTest;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TdyListTestMapper extends BaseMapper<TdyListTest> {
}