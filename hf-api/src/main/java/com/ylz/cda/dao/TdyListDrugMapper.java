package com.ylz.cda.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.cda.bean.TdyListDrug;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TdyListDrugMapper extends BaseMapper<TdyListDrug> {


    List<Map<String, String>> queryInfo(@Param("empi") String globalId, @Param("startTime") String startTime, @Param("page") Integer page, @Param("size") Integer size);

    int count(@Param("empi") String globalId, @Param("startTime") String startTime);
}