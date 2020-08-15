package com.ylz.cdr.show.dao;

import com.ylz.cdr.bean.Hdsd000501;
import com.ylz.cdr.show.vo.Hdsd000501Vo;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.TestCompareVo;
import com.ylz.cdr.show.vo.TypeInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface TestMapper {

    int countByPersonId(@Param("personId") String personId, @Param("encounterId") String encounterId,
                        @Param("inspectionCategoryCode") String inspectionCategoryCode) throws Exception;

    List<IndexInfo> getLabResultEncounterListByPersonId(@Param("personId") String personId,
                                                        @Param("encounterId") String encounterId,
                                                        @Param("inspectionCategoryCode") String inspectionCategoryCode) throws Exception;

    List<Hdsd000501Vo> getDCLabResultMasterListByPersonId(Map map) throws Exception;

    List<Hdsd000501> getLabResultCategoryByPersonId(Map map) throws Exception;

    List<TypeInfo> countCategory(@Param("personId") String personId,
                                 @Param("encounterId") String encounterId,
                                 @Param("inspectionCategoryCode") String inspectionCategoryCode) throws Exception;

    List<TestCompareVo> getListByPersonIdAndCode(@Param("personId") String personId,
                                                 @Param("inspectionCategoryCode") String inspectionCategoryCode) throws Exception;
}