package com.ylz.manager.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("manager_doc")
public class ManagerDoc implements Serializable {
    private static final long serialVersionUID = 3782366643202235204L;
    @TableId(value = "id")
    private Integer id;

    private String docCode;

    private String docEn;

    private String docCn;

    private String docCategory;

    private String enableFlag;

    private Integer sort;

    private String docTable;

    private String showType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
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