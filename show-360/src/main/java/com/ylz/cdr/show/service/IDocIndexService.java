package com.ylz.cdr.show.service;

import com.ylz.cdr.common.ResponseBean;

import java.util.Set;


/**
 * Created by CodeGenerator on 2019/07/04.
 */
public interface IDocIndexService {
    ResponseBean getDocumentIndexEncountersByPersonId(String personId, String encounterId);

    ResponseBean getDocInfoListByPersonId(String personId, String encounterId, Set<String> codeList);


    ResponseBean countByPersonId(String personId, String encounterId);

    Set<String> getEncounterId(Set<String> codeList, String globalId);
}
