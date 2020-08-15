package com.ylz.cdr.show.vo;

import com.ylz.cdr.bean.Hdsd000501;
import com.ylz.cdr.bean.TdyListTest;

import java.io.Serializable;
import java.util.List;

public class Hdsd000501Vo extends Hdsd000501 implements Serializable {
    private static final long serialVersionUID = -1050024557047785262L;
    private List<TdyListTest> tdyListTestList;

    public List<TdyListTest> getTdyListTestList() {
        return tdyListTestList;
    }

    public void setTdyListTestList(List<TdyListTest> tdyListTestList) {
        this.tdyListTestList = tdyListTestList;
    }
}