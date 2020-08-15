package com.ylz.cdr.show.dao;

import com.ylz.cdr.lab.bean.LabIndexCompare;
import com.ylz.cdr.show.vo.TestInfoVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabCompareMapper {

    List<LabIndexCompare> queryData(@Param("empi") String empi,
                                    @Param("itemCode") String itemCode,
                                    @Param("itemTypeCode") String itemTypeCode) throws Exception;

    int insertLabIndex(LabIndexCompare labIndexCompare) throws Exception;

    int deleteLabIndex(LabIndexCompare labIndexCompare) throws Exception;
}
