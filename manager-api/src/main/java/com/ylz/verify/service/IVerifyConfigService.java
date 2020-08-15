package com.ylz.verify.service;

import com.ylz.verify.bean.VerifyConfigList;

import java.util.List;

public interface IVerifyConfigService {

    List<VerifyConfigList> getVerifyConfigList(String code);

}
