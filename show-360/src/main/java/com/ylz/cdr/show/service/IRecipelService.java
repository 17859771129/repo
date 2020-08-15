package com.ylz.cdr.show.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.show.vo.ChineseDrug;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.WestDrug;

import java.util.List;

/**
 * Created by CodeGenerator on 2019/07/04.
 */
public interface IRecipelService {
    ResponseBean getChineseList(String personId, String encounterId, Integer page, Integer size);

    ResponseBean getWestList(String personId, String encounterId, Integer page, Integer size);

    ResponseBean countChineseList(String personId, String encounterId);

    ResponseBean countWestList(String personId, String encounterId);

    ResponseBean getVisitList(String personId, String encounterId);

    ResponseBean countAll(String personId, String encounterId);
}
