package com.ylz.hf.monitor.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.vo.reuqest.HfAccessLogRequest;
import com.ylz.hf.monitor.vo.reuqest.HfAccessLogRequestPage;

public interface HfAccessLogService {

    ResponseBean getHfAccessLogDTOListPage(HfAccessLogRequestPage hfAccessLogRequestPage);


    ResponseBean getHfDocLogAvgTime(HfAccessLogRequest HfAccessLogRequest);
}
