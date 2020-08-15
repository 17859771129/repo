package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_DRUG")
public class TdyListDrug extends SubBaseBean implements Serializable {
    private static final long serialVersionUID = 8037320291368168986L;
    private Integer pk;

    private String uniqueId;

    private String domainId;

    private String xdsVersion;

    private String xdsType;

    private String empi;

    private String encounterId;

    private String deleteFlag;

    private String tcmPieces;

    private String tcmNumTablets;

    private String tcmMethod;

    private String tcmDrugUse;

    private String drugCmTypeCode;

    private String drugCmType;

    private String recipelRemark;

    private String recipelDays;

    private String pdrugGroup;

    private String pcategoryName;

    private String pcategoryCode;

    private String orderContent;

    private String drugUsage;

    private String drugSubdoseUnit;

    private String drugSubdose;

    private String drugSpecific;

    private String drugPathwayCode;

    private String drugPathway;

    private String drugName;

    private String drugFrequencyUnit;

    private String drugFrequencyCode;

    private String drugFrequency;

    private String drugDostCode;

    private String drugDoseName;

    private String drugCode;

    private String drugsTotalUnit;

    private String drugsTotal;

    private String decoctMethod;

    private String drugAdrs;

    private String medicalCode;

    private String inoperMedical;

    private String preMedication;


    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    @Override
    public String getUniqueId() {
        return uniqueId;
    }

    @Override
    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    @Override
    public String getDomainId() {
        return domainId;
    }

    @Override
    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    @Override
    public String getXdsVersion() {
        return xdsVersion;
    }

    @Override
    public void setXdsVersion(String xdsVersion) {
        this.xdsVersion = xdsVersion;
    }

    @Override
    public String getXdsType() {
        return xdsType;
    }

    @Override
    public void setXdsType(String xdsType) {
        this.xdsType = xdsType;
    }

    public String getEmpi() {
        return empi;
    }

    public void setEmpi(String empi) {
        this.empi = empi == null ? null : empi.trim();
    }

    public String getEncounterId() {
        return encounterId;
    }

    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId == null ? null : encounterId.trim();
    }

    public String getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag == null ? null : deleteFlag.trim();
    }

    public String getTcmPieces() {
        return tcmPieces;
    }

    public void setTcmPieces(String tcmPieces) {
        this.tcmPieces = tcmPieces == null ? null : tcmPieces.trim();
    }

    public String getTcmNumTablets() {
        return tcmNumTablets;
    }

    public void setTcmNumTablets(String tcmNumTablets) {
        this.tcmNumTablets = tcmNumTablets == null ? null : tcmNumTablets.trim();
    }

    public String getTcmMethod() {
        return tcmMethod;
    }

    public void setTcmMethod(String tcmMethod) {
        this.tcmMethod = tcmMethod == null ? null : tcmMethod.trim();
    }

    public String getTcmDrugUse() {
        return tcmDrugUse;
    }

    public void setTcmDrugUse(String tcmDrugUse) {
        this.tcmDrugUse = tcmDrugUse == null ? null : tcmDrugUse.trim();
    }

    public String getDrugCmTypeCode() {
        return drugCmTypeCode;
    }

    public void setDrugCmTypeCode(String drugCmTypeCode) {
        this.drugCmTypeCode = drugCmTypeCode == null ? null : drugCmTypeCode.trim();
    }

    public String getDrugCmType() {
        return drugCmType;
    }

    public void setDrugCmType(String drugCmType) {
        this.drugCmType = drugCmType == null ? null : drugCmType.trim();
    }

    public String getRecipelRemark() {
        return recipelRemark;
    }

    public void setRecipelRemark(String recipelRemark) {
        this.recipelRemark = recipelRemark == null ? null : recipelRemark.trim();
    }

    public String getRecipelDays() {
        return recipelDays;
    }

    public void setRecipelDays(String recipelDays) {
        this.recipelDays = recipelDays == null ? null : recipelDays.trim();
    }

    public String getPdrugGroup() {
        return pdrugGroup;
    }

    public void setPdrugGroup(String pdrugGroup) {
        this.pdrugGroup = pdrugGroup == null ? null : pdrugGroup.trim();
    }

    public String getPcategoryName() {
        return pcategoryName;
    }

    public void setPcategoryName(String pcategoryName) {
        this.pcategoryName = pcategoryName == null ? null : pcategoryName.trim();
    }

    public String getPcategoryCode() {
        return pcategoryCode;
    }

    public void setPcategoryCode(String pcategoryCode) {
        this.pcategoryCode = pcategoryCode == null ? null : pcategoryCode.trim();
    }

    public String getOrderContent() {
        return orderContent;
    }

    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent == null ? null : orderContent.trim();
    }

    public String getDrugUsage() {
        return drugUsage;
    }

    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage == null ? null : drugUsage.trim();
    }

    public String getDrugSubdoseUnit() {
        return drugSubdoseUnit;
    }

    public void setDrugSubdoseUnit(String drugSubdoseUnit) {
        this.drugSubdoseUnit = drugSubdoseUnit == null ? null : drugSubdoseUnit.trim();
    }

    public String getDrugSubdose() {
        return drugSubdose;
    }

    public void setDrugSubdose(String drugSubdose) {
        this.drugSubdose = drugSubdose == null ? null : drugSubdose.trim();
    }

    public String getDrugSpecific() {
        return drugSpecific;
    }

    public void setDrugSpecific(String drugSpecific) {
        this.drugSpecific = drugSpecific == null ? null : drugSpecific.trim();
    }

    public String getDrugPathwayCode() {
        return drugPathwayCode;
    }

    public void setDrugPathwayCode(String drugPathwayCode) {
        this.drugPathwayCode = drugPathwayCode == null ? null : drugPathwayCode.trim();
    }

    public String getDrugPathway() {
        return drugPathway;
    }

    public void setDrugPathway(String drugPathway) {
        this.drugPathway = drugPathway == null ? null : drugPathway.trim();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName == null ? null : drugName.trim();
    }

    public String getDrugFrequencyUnit() {
        return drugFrequencyUnit;
    }

    public void setDrugFrequencyUnit(String drugFrequencyUnit) {
        this.drugFrequencyUnit = drugFrequencyUnit == null ? null : drugFrequencyUnit.trim();
    }

    public String getDrugFrequencyCode() {
        return drugFrequencyCode;
    }

    public void setDrugFrequencyCode(String drugFrequencyCode) {
        this.drugFrequencyCode = drugFrequencyCode == null ? null : drugFrequencyCode.trim();
    }

    public String getDrugFrequency() {
        return drugFrequency;
    }

    public void setDrugFrequency(String drugFrequency) {
        this.drugFrequency = drugFrequency == null ? null : drugFrequency.trim();
    }

    public String getDrugDostCode() {
        return drugDostCode;
    }

    public void setDrugDostCode(String drugDostCode) {
        this.drugDostCode = drugDostCode == null ? null : drugDostCode.trim();
    }

    public String getDrugDoseName() {
        return drugDoseName;
    }

    public void setDrugDoseName(String drugDoseName) {
        this.drugDoseName = drugDoseName == null ? null : drugDoseName.trim();
    }

    public String getDrugCode() {
        return drugCode;
    }

    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode == null ? null : drugCode.trim();
    }

    public String getDrugsTotalUnit() {
        return drugsTotalUnit;
    }

    public void setDrugsTotalUnit(String drugsTotalUnit) {
        this.drugsTotalUnit = drugsTotalUnit == null ? null : drugsTotalUnit.trim();
    }

    public String getDrugsTotal() {
        return drugsTotal;
    }

    public void setDrugsTotal(String drugsTotal) {
        this.drugsTotal = drugsTotal == null ? null : drugsTotal.trim();
    }

    public String getDecoctMethod() {
        return decoctMethod;
    }

    public void setDecoctMethod(String decoctMethod) {
        this.decoctMethod = decoctMethod == null ? null : decoctMethod.trim();
    }

    public String getDrugAdrs() {
        return drugAdrs;
    }

    public void setDrugAdrs(String drugAdrs) {
        this.drugAdrs = drugAdrs == null ? null : drugAdrs.trim();
    }

    public String getMedicalCode() {
        return medicalCode;
    }

    public void setMedicalCode(String medicalCode) {
        this.medicalCode = medicalCode == null ? null : medicalCode.trim();
    }

    public String getInoperMedical() {
        return inoperMedical;
    }

    public void setInoperMedical(String inoperMedical) {
        this.inoperMedical = inoperMedical == null ? null : inoperMedical.trim();
    }

    public String getPreMedication() {
        return preMedication;
    }

    public void setPreMedication(String preMedication) {
        this.preMedication = preMedication == null ? null : preMedication.trim();
    }
}