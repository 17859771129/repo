package com.ylz.cdr.show.vo;

import com.ylz.cdr.bean.DocIndex;

import java.util.List;

public class DocInfoReturn extends IndexInfo {

    private List<DocIndex> docInfoList;

    public List<DocIndex> getDocInfoList() {
        return docInfoList;
    }

    public void setDocInfoList(List<DocIndex> docInfoList) {
        this.docInfoList = docInfoList;
    }
}
