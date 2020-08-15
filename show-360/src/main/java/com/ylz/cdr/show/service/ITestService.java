package com.ylz.cdr.show.service;

import com.ylz.cdr.bean.Hdsd000501;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.vo.Hdsd000501Vo;
import com.ylz.cdr.show.vo.IndexInfo;

import java.util.List;


/**
 * Created by CodeGenerator on 2019/07/08.
 */
public interface ITestService {
    ResponseBean getDCLabResultMasterListByPersonId(String personId, String encounterId, String inspectionCategoryCode, int page, int size);

    ResponseBean getLabResultEncounterListByPersonId(String personId, String encounterId, String inspectionCategoryCode);

    ResponseBean count(String personId, String encounterId, String inspectionCategoryCode);

    ResponseBean getPersonData(String personId, String inspectionCategoryCode, String isCompare);
}
