package com.ylz.hf.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.hf.bean.DocIndex;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DocIndexMapper extends BaseMapper<DocIndex> {
    List<Map<String, String>> queryIndex(@Param("globalId") String globalId,
                                         @Param("xdsType") String xdsType,
                                         @Param("startTime") String startTime,
                                         @Param("endTime") String endTime,
                                         @Param("agencyName") String agencyName,
                                         @Param("visitDept") String visitDept);


}