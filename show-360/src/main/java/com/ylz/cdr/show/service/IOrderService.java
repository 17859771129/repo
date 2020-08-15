package com.ylz.cdr.show.service;

import com.ylz.cdr.common.ResponseBean;


/**
 * Created by CodeGenerator on 2019/07/02.
 */
public interface IOrderService {
    ResponseBean getInpatEncounterListByPersonId(String personId, String encounterId);

    ResponseBean getOrderInpatListByPersonId(String personId, String encounterId, Integer isDrug, Integer isMedicine, Integer page, Integer size);

    ResponseBean getOrderInpatListByPersonIdCount(String personId, String encounterId, Integer isDrug, Integer isMedicine);

    ResponseBean getOrderCategoryByPersonIdOrEncounterId(String personId, String encounterId);
}
