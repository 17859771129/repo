package com.ylz.hf.write.service;

import com.ylz.cdr.common.ResponseBean;
import com.ylz.hf.bean.DocIndex;
import com.ylz.hf.write.vo.HfDocIndexVo;
import net.sf.json.JSONObject;
import org.dom4j.Document;

public interface IHfDocIndexService {

    ResponseBean saveOrUpdateXds(HfDocIndexVo hfDocIndexVo, boolean isInsert, String xml);

    ResponseBean mergeCdaData(Document document, DocIndex hfDocIndex) throws Exception;

    ResponseBean updateEmpi(DocIndex docIndex) throws Exception;

    void syncDocIndex(DocIndex docIndex, JSONObject jsonObject) throws Exception;
}
