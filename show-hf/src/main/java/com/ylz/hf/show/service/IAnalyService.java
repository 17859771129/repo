package com.ylz.hf.show.service;

import net.sf.json.JSONObject;

public interface IAnalyService {

    JSONObject getData(String xdsType, String domainId, String uniqueId, String xdsVersion) throws Exception;


}
