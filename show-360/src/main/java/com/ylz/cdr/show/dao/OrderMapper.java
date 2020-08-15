package com.ylz.cdr.show.dao;

import com.ylz.cdr.bean.Hdsd001501;
import com.ylz.cdr.bean.TdyListOrder;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OrderMapper {

    List<Hdsd001501> getInpatEncounterListByPersonId(Map map) throws Exception;

    List<TdyListOrder> getOrderInpatListByPersonId(Map map) throws Exception;

    int getOrderInpatListByPersonIdCount(Map map) throws Exception;

    /**
     * 未实现
     *
     * @param map
     * @return
     */
    List<Hdsd001501> getOrderCategoryByPersonIdOrEncounterId(Map map) throws Exception;
}