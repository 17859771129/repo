package com.ylz.cdr.lab.dao;

import com.ylz.cdr.lab.bean.LabItemInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabItemInfoMapper {
    int insert(LabItemInfo labItemInfo) throws Exception;

    List<LabItemInfo> queryByUniqueId(@Param("itemTypeCode") String itemTypeCode,
                                      @Param("itemCode") String itemCode) throws Exception;
}
