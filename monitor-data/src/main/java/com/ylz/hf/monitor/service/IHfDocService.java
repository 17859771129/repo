package com.ylz.hf.monitor.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.monitor.bean.HfDoc;
import com.ylz.hf.monitor.vo.response.HfDocResponse;
import com.ylz.hf.monitor.vo.reuqest.HfDocRequest;

import java.util.List;

public interface IHfDocService {
    ResponseBean getHfDocs();

    HfDocResponse getCountDocCategoriesByInterval(HfDocRequest hfDocRequest);

    HfDocResponse getCountCategoryByServe(HfDocRequest hfDocRequest);

    ResponseBean getCountDocCategoriesTops(HfDocRequest hfDocRequest);

    List<HfDoc> getByCategory(String docCategory);


}
