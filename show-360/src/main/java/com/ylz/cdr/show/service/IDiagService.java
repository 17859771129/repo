package com.ylz.cdr.show.service;

import com.ylz.cdr.bean.TdyListDiag;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.vo.DiagInfo;
import com.ylz.cdr.show.vo.IndexInfo;

import java.util.List;


/**
 * Created by CodeGenerator on 2019/07/02.
 */
public interface IDiagService {
    ResponseBean getListByPersonId(String personId, String encounterId, Integer page, Integer size);

    ResponseBean countByPersonId(String personId, String encounterId);

    ResponseBean selectVisitList(String personId, String encounterId);
}
