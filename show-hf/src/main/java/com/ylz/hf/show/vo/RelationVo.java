package com.ylz.hf.show.vo;

import com.ylz.hf.bean.DiseaseHistoryInfo;

import java.util.List;

public class RelationVo {

    private String relationName;
    private String name;
    private List<DiseaseHistoryInfo> diseaseHistoryInfo;

    public RelationVo(String relationName, String name) {
        this.relationName = relationName;
        this.name = name;
    }

    public RelationVo() {
    }

    public String getRelationName() {
        return relationName;
    }

    public void setRelationName(String relationName) {
        this.relationName = relationName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<DiseaseHistoryInfo> getDiseaseHistoryInfo() {
        return diseaseHistoryInfo;
    }

    public void setDiseaseHistoryInfo(List<DiseaseHistoryInfo> diseaseHistoryInfo) {
        this.diseaseHistoryInfo = diseaseHistoryInfo;
    }
}
