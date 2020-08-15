package com.ylz.hf.monitor.bean;

import com.baomidou.mybatisplus.annotation.TableName;

/*
 *  字典表
 */
@TableName("manager_doc")
public class HfDoc {
    private String docCode;
    private String docEn;
    private String docCn;
    private String docCategory;
    private String enableFlag;
    private String sort;
    private String docTable;
    private String showType;//数据默认展示类型

    public String getDocCode() {
        return docCode;
    }

    public void setDocCode(String docCode) {
        this.docCode = docCode;
    }

    public String getDocEn() {
        return docEn;
    }

    public void setDocEn(String docEn) {
        this.docEn = docEn;
    }

    public String getDocCn() {
        return docCn;
    }

    public void setDocCn(String docCn) {
        this.docCn = docCn;
    }

    public String getDocCategory() {
        return docCategory;
    }

    public void setDocCategory(String docCategory) {
        this.docCategory = docCategory;
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public String getDocTable() {
        return docTable;
    }

    public void setDocTable(String docTable) {
        this.docTable = docTable;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }
}
