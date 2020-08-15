package com.ylz.cdr.show.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.SurgeryInfo;

import java.util.List;


/**
 * Created by CodeGenerator on 2019/07/03.
 */
public interface ISurgeryRecordService {
    ResponseBean getVisitListByPersonId(String personId, String encounterId);

    ResponseBean getSurgeryRecordsByPersonId(String personId, String encounterId, int page, int size);

    ResponseBean countByPersonId(String personId, String encounterId);
}
