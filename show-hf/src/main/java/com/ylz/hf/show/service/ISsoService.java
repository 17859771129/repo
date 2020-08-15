package com.ylz.hf.show.service;

import net.sf.json.JSONObject;

public interface ISsoService {

    JSONObject getUser(String tokenId);
}
