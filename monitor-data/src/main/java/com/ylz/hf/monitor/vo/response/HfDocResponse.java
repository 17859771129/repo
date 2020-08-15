package com.ylz.hf.monitor.vo.response;


/*
 *索引表 返回参数信息
 */

public class HfDocResponse extends BaseResponse {

    private int countNumber;
    private String domainId;

    public int getCountNumber() {
        return countNumber;
    }

    public void setCountNumber(int countNumber) {
        this.countNumber = countNumber;
    }

    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }
}
