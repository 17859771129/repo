package com.ylz.cdr.show.dao;

import com.ylz.cdr.show.vo.ChineseDrug;
import com.ylz.cdr.show.vo.IndexInfo;
import com.ylz.cdr.show.vo.WestDrug;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface DrugMapper {
    List<WestDrug> getWestListByPersonId(Map map) throws Exception;

    List<ChineseDrug> getChineseListByPersonId(Map map) throws Exception;

    int countChinese(Map map) throws Exception;

    int countWest(Map map) throws Exception;

    List<IndexInfo> getVisitByPersonId(Map map) throws Exception;
}