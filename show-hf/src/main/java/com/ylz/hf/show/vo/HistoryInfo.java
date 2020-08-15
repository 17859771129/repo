package com.ylz.hf.show.vo;

import com.ylz.hf.bean.*;

import java.util.List;

public class HistoryInfo {

    private List<AllergyInfo> allergyInfoList;
    private List<DiseaseHistoryInfo> diseaseInfoList;
    private List<FamilyHistoryInfo> familyInfoList;
    private List<OperHistoryInfo> operInfoList;
    private List<BloodHistoryInfo> bloodInfoList;
    private List<InoculationInfo> inoculationInfoList;
    private List<DrugInfo> drugInfoList;

    public List<AllergyInfo> getAllergyInfoList() {
        return allergyInfoList;
    }

    public void setAllergyInfoList(List<AllergyInfo> allergyInfoList) {
        this.allergyInfoList = allergyInfoList;
    }

    public List<DiseaseHistoryInfo> getDiseaseInfoList() {
        return diseaseInfoList;
    }

    public void setDiseaseInfoList(List<DiseaseHistoryInfo> diseaseInfoList) {
        this.diseaseInfoList = diseaseInfoList;
    }

    public List<FamilyHistoryInfo> getFamilyInfoList() {
        return familyInfoList;
    }

    public void setFamilyInfoList(List<FamilyHistoryInfo> familyInfoList) {
        this.familyInfoList = familyInfoList;
    }

    public List<OperHistoryInfo> getOperInfoList() {
        return operInfoList;
    }

    public void setOperInfoList(List<OperHistoryInfo> operInfoList) {
        this.operInfoList = operInfoList;
    }

    public List<BloodHistoryInfo> getBloodInfoList() {
        return bloodInfoList;
    }

    public void setBloodInfoList(List<BloodHistoryInfo> bloodInfoList) {
        this.bloodInfoList = bloodInfoList;
    }

    public List<InoculationInfo> getInoculationInfoList() {
        return inoculationInfoList;
    }

    public void setInoculationInfoList(List<InoculationInfo> inoculationInfoList) {
        this.inoculationInfoList = inoculationInfoList;
    }

    public List<DrugInfo> getDrugInfoList() {
        return drugInfoList;
    }

    public void setDrugInfoList(List<DrugInfo> drugInfoList) {
        this.drugInfoList = drugInfoList;
    }
}
