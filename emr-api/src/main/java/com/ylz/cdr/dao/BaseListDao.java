package com.ylz.cdr.dao;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BaseListDao<T> {

    void deleteByUniqueId(@Param("docUnique") String uniqueId, @Param("docType") String docType,
                          @Param("docDomainId") String domainId, @Param("docVersion") String version) throws Exception;

    List<T> queryByUniqueId(@Param("docUnique") String uniqueId, @Param("docType") String docType,
                            @Param("docDomainId") String domainId, @Param("docVersion") String version) throws Exception;

    void updateEmpiByUniqueId(@Param("docDomainId") String domainId, @Param("docUnique") String uniqueId,
                              @Param("docType") String xdsType, @Param("docVersion") String xdsVersion,
                              @Param("empi") String empi, @Param("encounterId") String encounterId) throws Exception;

    void insert(@Param("list") List<Map<String, String>> mapList, @Param("docUnique") String uniqueId, @Param("docType") String docType,
                @Param("docDomainId") String domainId, @Param("docVersion") String version, @Param("empi") String empi,
                @Param("encounterId") String encounterId, @Param("diagType") String diagType) throws Exception;

}
