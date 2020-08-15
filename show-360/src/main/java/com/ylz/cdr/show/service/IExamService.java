package com.ylz.cdr.show.service;

import com.ylz.cdr.bean.Hdsd000502;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.TypeInfo;

import java.util.List;
import java.util.Map;


/**
 * Created by CodeGenerator on 2019/07/05.
 */
public interface IExamService {
    List<TypeInfo> getExamCategorysByPersonIdAndEncounterId(String personId, String encounterId);

    ResponseBean getExamResultsByPersonId(String personId, String encounterId, String categoryCode, int page, int size);

    List<Hdsd000502> getExamResultComparisonByPersonIdAndcategoryCode(String personId, String categoryCode, Integer row);

    List<IndexInfo> getExamEncountersByPersonId(String personId, String encounterId);

    ResponseBean countByPersonId(String personId, String encounterId, String categoryCode);
}
