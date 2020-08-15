package com.ylz.cdr.show.dao;

import com.ylz.cdr.show.vo.DiagInfo;
import com.ylz.cdr.show.vo.IndexInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DiagMapper {
    List<DiagInfo> getListByPersonId(Map map) throws Exception;

    int countByPersonId(Map map) throws Exception;

    List<IndexInfo> selectVisitList(Map map) throws Exception;

    List<String> selectByPatient(@Param("personId") String personId, @Param("encounterId") String encounterId,
                                 @Param("encounterType") String encounterType) throws Exception;
}