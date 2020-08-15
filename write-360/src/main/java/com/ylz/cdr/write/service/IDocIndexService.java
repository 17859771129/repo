package com.ylz.cdr.write.service;

import com.ylz.cdr.bean.DocIndex;
import com.ylz.cdr.write.vo.VisitVo;

import java.util.List;
import java.util.Map;

public interface IDocIndexService {

    String saveOrUpdate(Map<String, Object> map, String empi, String encounterId, String xml, boolean isCda);

    VisitVo syncDocIndex(String tableName, String docCode, DocIndex docIndex) throws Exception;

    VisitVo queryEmpi(DocIndex docIndex) throws Exception;

    List<DocIndex> queryByStatus(List<String> status) throws Exception;

    void updateStatus(DocIndex docIndex) throws Exception;

    List<DocIndex> querySyncData(String tableName, String syncStatus) throws Exception;

    void updateProcInfoByPk(VisitVo visitVo, DocIndex docIndex) throws Exception;
}
