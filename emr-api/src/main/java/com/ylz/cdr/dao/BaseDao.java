package com.ylz.cdr.dao;

import org.apache.ibatis.annotations.Param;

import java.util.Map;

public interface BaseDao<T> {
    int insertByMap(Map<String, Object> map) throws Exception;

    T queryByUniqueId(@Param("docPipelineId") String docPipelineId, @Param("loadType") String loadType,
                      @Param("docDomainId") String docDomainId, @Param("version") String version,
                      @Param("status") String status) throws Exception;

    void updateByPk(Map<String, Object> map) throws Exception;

    void updateEmpiByUniqueId(Map<String, Object> map);
}
