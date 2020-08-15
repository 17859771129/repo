package com.ylz.cdr.show.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.cdr.lab.bean.LabIndexCompare;
import com.ylz.cdr.show.vo.TestInfoVo;

public interface ILabCompareService {
    ResponseBean deleteLabIndex(LabIndexCompare labIndexCompare);

    ResponseBean insertLabIndex(LabIndexCompare labIndexCompare);

    ResponseBean queryDict(String empi, String itemTypeCode, String isCompare);
}
