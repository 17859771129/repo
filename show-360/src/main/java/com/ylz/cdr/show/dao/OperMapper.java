package com.ylz.cdr.show.dao;

import com.ylz.cdr.bean.Hdsd000606;
import com.ylz.cdr.bean.TdyListDiag;
import com.ylz.cdr.show.vo.IndexInfo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface OperMapper {

    List<IndexInfo> getVisitListByPersonId(Map map) throws Exception;

    List<Hdsd000606> getOperByPersonId(Map map) throws Exception;

    int countByPersonId(Map map) throws Exception;

    List<TdyListDiag> getDiagList(Map map) throws Exception;
}