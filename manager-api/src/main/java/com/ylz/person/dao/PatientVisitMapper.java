package com.ylz.person.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.person.bean.PatientVisit;
import com.ylz.person.vo.VisitView;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Repository
public interface PatientVisitMapper extends BaseMapper<PatientVisit> {
    int countByPersonId(@Param("globalId") String personId, @Param("startTime") String startTime,
                        @Param("encounterId") String encounterId) throws Exception;

    List<VisitView> pageByPersonId(@Param("globalId") String personId,
                                   @Param("from") int from, @Param("size") int size,
                                   @Param("startTime") String startTime, @Param("encounterId") String encounterId) throws Exception;

    List<Map<String, Object>> getVisitByPersonId(@Param("globalId") String personId, @Param("encounterIdSet") Set<String> encounterId);
}
