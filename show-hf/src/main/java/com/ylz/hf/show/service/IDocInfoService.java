package com.ylz.hf.show.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.bean.InoculationInfo;
import com.ylz.cda.bean.TdyListDrug;
import com.ylz.cda.bean.TdyListOrder;

public interface IDocInfoService {

    ResponseBean getDocInfo(Integer id, String xdsType, String domainId, String uniqueId, String xdsVersion, String showType);

    IPage<TdyListDrug> getWestInfo(String xdsType, String domainId, String uniqueId, String xdsVersion,
                                   Integer pageNum, Integer size);

    IPage<TdyListOrder> getOrderInfo(String xdsType, String domainId, String uniqueId, String xdsVersion, String type,
                                     Integer pageNum, Integer size);

    IPage<InoculationInfo> getInoculationInfo(String xdsType, String domainId,
                                              String uniqueId, String xdsVersion,
                                              Integer pageNum, Integer size);
}
