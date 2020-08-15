package com.ylz.hf.monitor.service;

import com.ylz.hf.monitor.vo.response.HfDocResponse;
import com.ylz.hf.monitor.vo.reuqest.HfDocRequest;

public interface HfLoginLogService {
    HfDocResponse getCountDocCategoriesByType(HfDocRequest hfDocRequest);
}
