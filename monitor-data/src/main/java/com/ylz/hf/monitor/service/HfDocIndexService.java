package com.ylz.hf.monitor.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.vo.response.HfDocIndexResponse;
import com.ylz.hf.monitor.vo.reuqest.HfDocIndexRequest;

public interface HfDocIndexService {
    HfDocIndexResponse getHfDocIndexDTOByEntity(HfDocIndexRequest hfDocIndexRequest);

    ResponseBean getTotal(String docCategory, String startTime);

    ResponseBean getGroupTotal(String docCategory, String startTime);
}
