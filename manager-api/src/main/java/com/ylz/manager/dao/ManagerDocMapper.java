package com.ylz.manager.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ylz.manager.bean.ManagerDoc;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ManagerDocMapper extends BaseMapper<ManagerDoc> {


    @Select("SELECT * FROM manager_doc where doc_code in (select doc_code from domain_doc where domain_id =#{domainId})")
    List<ManagerDoc> selectByDomainId(@Param("domainId") String domainId);



}