package com.ylz.hf.monitor.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.vo.reuqest.HfDocLogRequestPage;

public interface HfDocLogService {

    ResponseBean getHfDocLogPages(HfDocLogRequestPage hfDocLogRequestPage);
}
