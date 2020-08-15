package com.ylz.cdr.lab.dao;

import com.ylz.cdr.lab.bean.LabItemTypeInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LabItemTypeInfoMapper {
    int insert(LabItemTypeInfo labItemInfo) throws Exception;

    List<LabItemTypeInfo> queryByItemTypeCode(String itemTypeCode) throws Exception;
}
