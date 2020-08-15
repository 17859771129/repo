package com.ylz.cdr.show.service;

import com.ylz.cdr.common.ResponseBean;

public interface IVisitService {
    ResponseBean queryByData(String personId, int page, int size);

    ResponseBean queryAllByData(String personId, String encounterId);

    ResponseBean queryByData(String personId, int page, int size, String startTime, String encounterId);
}
