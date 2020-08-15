package com.ylz.cdr.show.service;

import com.ylz.cdr.common.ResponseBean;
import net.sf.json.JSONObject;

public interface ISsoService {

    ResponseBean getUserInfo(String token);

    JSONObject getUser(String token);
}
