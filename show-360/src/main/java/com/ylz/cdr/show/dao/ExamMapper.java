package com.ylz.cdr.show.dao;

import com.ylz.cdr.bean.Hdsd000502;
import com.ylz.cdr.show.vo.ExamInfo;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.TypeInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamMapper {

    List<IndexInfo> getExamEncountersByPersonId(@Param("encounterId") String encounterId, @Param("personId") String personId) throws Exception;

    List<Hdsd000502> getExamResultComparisonByPersonIdAndcategoryCode(@Param("categoryCode") String categoryCode,
                                                                      @Param("personId") String personId,
                                                                      @Param("row") Integer row) throws Exception;

    List<ExamInfo> getExamResultsByPersonId(@Param("encounterId") String encounterId,
                                            @Param("personId") String personId,
                                            @Param("categoryCode") String categoryCode,
                                            @Param("from") int from,
                                            @Param("size") int size) throws Exception;

    List<TypeInfo> getExamCategorysByPersonIdAndEncounterId(@Param("encounterId") String encounterId,
                                                            @Param("personId") String personId) throws Exception;

    int countByPersonId(@Param("personId") String personId, @Param("encounterId") String encounterId, @Param("categoryCode") String categoryCode) throws Exception;
}