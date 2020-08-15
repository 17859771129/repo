package com.ylz.cdr.write.dao;

import com.ylz.cdr.bean.DocIndex;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocIndexCdrMapper {
    DocIndex queryByUniqueId(@Param("uniqueId") String uniqueId, @Param("domainId") String domainId,
                             @Param("xdsType") String xdsType, @Param("xdsVersion") String xdsVersion) throws Exception;

    void abandonData(@Param("pk") Integer pk, @Param("xdsStatus") String abandonStatus) throws Exception;

    void insert(DocIndex xdsInfo) throws Exception;

    List<DocIndex> queryByStatus(@Param("list") List<String> status) throws Exception;

    void updateStatus(DocIndex docIndex) throws Exception;

    void update(DocIndex docIndex) throws Exception;

    List<DocIndex> querySyncData(@Param("tableName") String tableName, @Param("status") String status) throws Exception;
}