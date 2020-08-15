package com.ylz.hf.monitor.vo.reuqest;


public class HfDocRequest extends BaseRequest {
    private String docCategory;//查询获取院内院外统计信息
    private String startProcTime;
    private String endProcTime;

    public String getDocCategory() {
        return docCategory;
    }

    public void setDocCategory(String docCategory) {
        this.docCategory = docCategory;
    }

    public String getStartProcTime() {
        return startProcTime;
    }

    public void setStartProcTime(String startProcTime) {
        this.startProcTime = startProcTime;
    }

    public String getEndProcTime() {
        return endProcTime;
    }

    public void setEndProcTime(String endProcTime) {
        this.endProcTime = endProcTime;
    }
}
