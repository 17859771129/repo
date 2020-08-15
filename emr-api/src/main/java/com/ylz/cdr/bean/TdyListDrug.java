package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_DRUG")
public class TdyListDrug implements Serializable {
    /**
     * This field corresponds to the database table TDY_LIST_DRUG
     */
    private static final long serialVersionUID = 1L;
    /**
     * TDY_LIST_DRUG.pk
     */
    private Integer pk;
    /**
     * TDY_LIST_DRUG.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_DRUG.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_DRUG.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_DRUG.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_DRUG.empi
     */
    private String empi;
    /**
     * TDY_LIST_DRUG.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * TDY_LIST_DRUG.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_DRUG.TCM_PIECES
     */
    private String tcmPieces;
    /**
     * TDY_LIST_DRUG.TCM_NUM_TABLETS
     */
    private String tcmNumTablets;
    /**
     * TDY_LIST_DRUG.TCM_METHOD
     */
    private String tcmMethod;
    /**
     * TDY_LIST_DRUG.TCM_DRUG_USE
     */
    private String tcmDrugUse;
    /**
     * TDY_LIST_DRUG.DRUG_CM_TYPE_CODE
     */
    private String drugCmTypeCode;
    /**
     * TDY_LIST_DRUG.DRUG_CM_TYPE
     */
    private String drugCmType;
    /**
     * TDY_LIST_DRUG.RECIPEL_REMARK
     */
    private String recipelRemark;
    /**
     * TDY_LIST_DRUG.RECIPEL_DAYS
     */
    private String recipelDays;
    /**
     * TDY_LIST_DRUG.PDRUG_GROUP
     */
    private String pdrugGroup;
    /**
     * TDY_LIST_DRUG.PCATEGORY_NAME
     */
    private String pcategoryName;
    /**
     * TDY_LIST_DRUG.PCATEGORY_CODE
     */
    private String pcategoryCode;
    /**
     * TDY_LIST_DRUG.ORDER_CONTENT
     */
    private String orderContent;
    /**
     * TDY_LIST_DRUG.DRUG_USAGE
     */
    private String drugUsage;
    /**
     * TDY_LIST_DRUG.DRUG_SUBDOSE_UNIT
     */
    private String drugSubdoseUnit;
    /**
     * TDY_LIST_DRUG.DRUG_SUBDOSE
     */
    private String drugSubdose;
    /**
     * TDY_LIST_DRUG.DRUG_SPECIFIC
     */
    private String drugSpecific;
    /**
     * TDY_LIST_DRUG.DRUG_PATHWAY_CODE
     */
    private String drugPathwayCode;
    /**
     * TDY_LIST_DRUG.DRUG_PATHWAY
     */
    private String drugPathway;
    /**
     * TDY_LIST_DRUG.DRUG_NAME
     */
    private String drugName;
    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY_UNIT
     */
    private String drugFrequencyUnit;
    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY_CODE
     */
    private String drugFrequencyCode;
    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY
     */
    private String drugFrequency;
    /**
     * TDY_LIST_DRUG.DRUG_DOST_CODE
     */
    private String drugDostCode;
    /**
     * TDY_LIST_DRUG.DRUG_DOSE_NAME
     */
    private String drugDoseName;
    /**
     * TDY_LIST_DRUG.DRUG_CODE
     */
    private String drugCode;
    /**
     * TDY_LIST_DRUG.DRUGS_TOTAL_UNIT
     */
    private String drugsTotalUnit;
    /**
     * TDY_LIST_DRUG.DRUGS_TOTAL
     */
    private String drugsTotal;
    /**
     * TDY_LIST_DRUG.DECOCT_METHOD
     */
    private String decoctMethod;
    /**
     * TDY_LIST_DRUG.DRUG_ADRS
     */
    private String drugAdrs;
    /**
     * TDY_LIST_DRUG.MEDICAL_CODE
     */
    private String medicalCode;
    /**
     * TDY_LIST_DRUG.INOPER_MEDICAL
     */
    private String inoperMedical;
    /**
     * TDY_LIST_DRUG.PRE_MEDICATION
     */
    private String preMedication;

    /**
     * TDY_LIST_DRUG.pk
     *
     * @return the value of TDY_LIST_DRUG.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * TDY_LIST_DRUG.pk
     *
     * @param pk the value for TDY_LIST_DRUG.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * TDY_LIST_DRUG.doc_unique
     *
     * @return the value of TDY_LIST_DRUG.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_DRUG.doc_unique
     *
     * @param docUnique the value for TDY_LIST_DRUG.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_DRUG.doc_domain_id
     *
     * @return the value of TDY_LIST_DRUG.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_DRUG.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_DRUG.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_DRUG.doc_version
     *
     * @return the value of TDY_LIST_DRUG.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_DRUG.doc_version
     *
     * @param docVersion the value for TDY_LIST_DRUG.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_DRUG.doc_type
     *
     * @return the value of TDY_LIST_DRUG.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_DRUG.doc_type
     *
     * @param docType the value for TDY_LIST_DRUG.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_DRUG.empi
     *
     * @return the value of TDY_LIST_DRUG.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_DRUG.empi
     *
     * @param empi the value for TDY_LIST_DRUG.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_DRUG.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_DRUG.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_DRUG.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_DRUG.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * TDY_LIST_DRUG.delete_flag
     *
     * @return the value of TDY_LIST_DRUG.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_DRUG.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_DRUG.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_DRUG.TCM_PIECES
     *
     * @return the value of TDY_LIST_DRUG.TCM_PIECES
     */
    public String getTcmPieces() {
        return tcmPieces;
    }

    /**
     * TDY_LIST_DRUG.TCM_PIECES
     *
     * @param tcmPieces the value for TDY_LIST_DRUG.TCM_PIECES
     */
    public void setTcmPieces(String tcmPieces) {
        this.tcmPieces = tcmPieces;
    }

    /**
     * TDY_LIST_DRUG.TCM_NUM_TABLETS
     *
     * @return the value of TDY_LIST_DRUG.TCM_NUM_TABLETS
     */
    public String getTcmNumTablets() {
        return tcmNumTablets;
    }

    /**
     * TDY_LIST_DRUG.TCM_NUM_TABLETS
     *
     * @param tcmNumTablets the value for TDY_LIST_DRUG.TCM_NUM_TABLETS
     */
    public void setTcmNumTablets(String tcmNumTablets) {
        this.tcmNumTablets = tcmNumTablets;
    }

    /**
     * TDY_LIST_DRUG.TCM_METHOD
     *
     * @return the value of TDY_LIST_DRUG.TCM_METHOD
     */
    public String getTcmMethod() {
        return tcmMethod;
    }

    /**
     * TDY_LIST_DRUG.TCM_METHOD
     *
     * @param tcmMethod the value for TDY_LIST_DRUG.TCM_METHOD
     */
    public void setTcmMethod(String tcmMethod) {
        this.tcmMethod = tcmMethod;
    }

    /**
     * TDY_LIST_DRUG.TCM_DRUG_USE
     *
     * @return the value of TDY_LIST_DRUG.TCM_DRUG_USE
     */
    public String getTcmDrugUse() {
        return tcmDrugUse;
    }

    /**
     * TDY_LIST_DRUG.TCM_DRUG_USE
     *
     * @param tcmDrugUse the value for TDY_LIST_DRUG.TCM_DRUG_USE
     */
    public void setTcmDrugUse(String tcmDrugUse) {
        this.tcmDrugUse = tcmDrugUse;
    }

    /**
     * TDY_LIST_DRUG.DRUG_CM_TYPE_CODE
     *
     * @return the value of TDY_LIST_DRUG.DRUG_CM_TYPE_CODE
     */
    public String getDrugCmTypeCode() {
        return drugCmTypeCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_CM_TYPE_CODE
     *
     * @param drugCmTypeCode the value for TDY_LIST_DRUG.DRUG_CM_TYPE_CODE
     */
    public void setDrugCmTypeCode(String drugCmTypeCode) {
        this.drugCmTypeCode = drugCmTypeCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_CM_TYPE
     *
     * @return the value of TDY_LIST_DRUG.DRUG_CM_TYPE
     */
    public String getDrugCmType() {
        return drugCmType;
    }

    /**
     * TDY_LIST_DRUG.DRUG_CM_TYPE
     *
     * @param drugCmType the value for TDY_LIST_DRUG.DRUG_CM_TYPE
     */
    public void setDrugCmType(String drugCmType) {
        this.drugCmType = drugCmType;
    }

    /**
     * TDY_LIST_DRUG.RECIPEL_REMARK
     *
     * @return the value of TDY_LIST_DRUG.RECIPEL_REMARK
     */
    public String getRecipelRemark() {
        return recipelRemark;
    }

    /**
     * TDY_LIST_DRUG.RECIPEL_REMARK
     *
     * @param recipelRemark the value for TDY_LIST_DRUG.RECIPEL_REMARK
     */
    public void setRecipelRemark(String recipelRemark) {
        this.recipelRemark = recipelRemark;
    }

    /**
     * TDY_LIST_DRUG.RECIPEL_DAYS
     *
     * @return the value of TDY_LIST_DRUG.RECIPEL_DAYS
     */
    public String getRecipelDays() {
        return recipelDays;
    }

    /**
     * TDY_LIST_DRUG.RECIPEL_DAYS
     *
     * @param recipelDays the value for TDY_LIST_DRUG.RECIPEL_DAYS
     */
    public void setRecipelDays(String recipelDays) {
        this.recipelDays = recipelDays;
    }

    /**
     * TDY_LIST_DRUG.PDRUG_GROUP
     *
     * @return the value of TDY_LIST_DRUG.PDRUG_GROUP
     */
    public String getPdrugGroup() {
        return pdrugGroup;
    }

    /**
     * TDY_LIST_DRUG.PDRUG_GROUP
     *
     * @param pdrugGroup the value for TDY_LIST_DRUG.PDRUG_GROUP
     */
    public void setPdrugGroup(String pdrugGroup) {
        this.pdrugGroup = pdrugGroup;
    }

    /**
     * TDY_LIST_DRUG.PCATEGORY_NAME
     *
     * @return the value of TDY_LIST_DRUG.PCATEGORY_NAME
     */
    public String getPcategoryName() {
        return pcategoryName;
    }

    /**
     * TDY_LIST_DRUG.PCATEGORY_NAME
     *
     * @param pcategoryName the value for TDY_LIST_DRUG.PCATEGORY_NAME
     */
    public void setPcategoryName(String pcategoryName) {
        this.pcategoryName = pcategoryName;
    }

    /**
     * TDY_LIST_DRUG.PCATEGORY_CODE
     *
     * @return the value of TDY_LIST_DRUG.PCATEGORY_CODE
     */
    public String getPcategoryCode() {
        return pcategoryCode;
    }

    /**
     * TDY_LIST_DRUG.PCATEGORY_CODE
     *
     * @param pcategoryCode the value for TDY_LIST_DRUG.PCATEGORY_CODE
     */
    public void setPcategoryCode(String pcategoryCode) {
        this.pcategoryCode = pcategoryCode;
    }

    /**
     * TDY_LIST_DRUG.ORDER_CONTENT
     *
     * @return the value of TDY_LIST_DRUG.ORDER_CONTENT
     */
    public String getOrderContent() {
        return orderContent;
    }

    /**
     * TDY_LIST_DRUG.ORDER_CONTENT
     *
     * @param orderContent the value for TDY_LIST_DRUG.ORDER_CONTENT
     */
    public void setOrderContent(String orderContent) {
        this.orderContent = orderContent;
    }

    /**
     * TDY_LIST_DRUG.DRUG_USAGE
     *
     * @return the value of TDY_LIST_DRUG.DRUG_USAGE
     */
    public String getDrugUsage() {
        return drugUsage;
    }

    /**
     * TDY_LIST_DRUG.DRUG_USAGE
     *
     * @param drugUsage the value for TDY_LIST_DRUG.DRUG_USAGE
     */
    public void setDrugUsage(String drugUsage) {
        this.drugUsage = drugUsage;
    }

    /**
     * TDY_LIST_DRUG.DRUG_SUBDOSE_UNIT
     *
     * @return the value of TDY_LIST_DRUG.DRUG_SUBDOSE_UNIT
     */
    public String getDrugSubdoseUnit() {
        return drugSubdoseUnit;
    }

    /**
     * TDY_LIST_DRUG.DRUG_SUBDOSE_UNIT
     *
     * @param drugSubdoseUnit the value for TDY_LIST_DRUG.DRUG_SUBDOSE_UNIT
     */
    public void setDrugSubdoseUnit(String drugSubdoseUnit) {
        this.drugSubdoseUnit = drugSubdoseUnit;
    }

    /**
     * TDY_LIST_DRUG.DRUG_SUBDOSE
     *
     * @return the value of TDY_LIST_DRUG.DRUG_SUBDOSE
     */
    public String getDrugSubdose() {
        return drugSubdose;
    }

    /**
     * TDY_LIST_DRUG.DRUG_SUBDOSE
     *
     * @param drugSubdose the value for TDY_LIST_DRUG.DRUG_SUBDOSE
     */
    public void setDrugSubdose(String drugSubdose) {
        this.drugSubdose = drugSubdose;
    }

    /**
     * TDY_LIST_DRUG.DRUG_SPECIFIC
     *
     * @return the value of TDY_LIST_DRUG.DRUG_SPECIFIC
     */
    public String getDrugSpecific() {
        return drugSpecific;
    }

    /**
     * TDY_LIST_DRUG.DRUG_SPECIFIC
     *
     * @param drugSpecific the value for TDY_LIST_DRUG.DRUG_SPECIFIC
     */
    public void setDrugSpecific(String drugSpecific) {
        this.drugSpecific = drugSpecific;
    }

    /**
     * TDY_LIST_DRUG.DRUG_PATHWAY_CODE
     *
     * @return the value of TDY_LIST_DRUG.DRUG_PATHWAY_CODE
     */
    public String getDrugPathwayCode() {
        return drugPathwayCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_PATHWAY_CODE
     *
     * @param drugPathwayCode the value for TDY_LIST_DRUG.DRUG_PATHWAY_CODE
     */
    public void setDrugPathwayCode(String drugPathwayCode) {
        this.drugPathwayCode = drugPathwayCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_PATHWAY
     *
     * @return the value of TDY_LIST_DRUG.DRUG_PATHWAY
     */
    public String getDrugPathway() {
        return drugPathway;
    }

    /**
     * TDY_LIST_DRUG.DRUG_PATHWAY
     *
     * @param drugPathway the value for TDY_LIST_DRUG.DRUG_PATHWAY
     */
    public void setDrugPathway(String drugPathway) {
        this.drugPathway = drugPathway;
    }

    /**
     * TDY_LIST_DRUG.DRUG_NAME
     *
     * @return the value of TDY_LIST_DRUG.DRUG_NAME
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * TDY_LIST_DRUG.DRUG_NAME
     *
     * @param drugName the value for TDY_LIST_DRUG.DRUG_NAME
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY_UNIT
     *
     * @return the value of TDY_LIST_DRUG.DRUG_FREQUENCY_UNIT
     */
    public String getDrugFrequencyUnit() {
        return drugFrequencyUnit;
    }

    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY_UNIT
     *
     * @param drugFrequencyUnit the value for TDY_LIST_DRUG.DRUG_FREQUENCY_UNIT
     */
    public void setDrugFrequencyUnit(String drugFrequencyUnit) {
        this.drugFrequencyUnit = drugFrequencyUnit;
    }

    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY_CODE
     *
     * @return the value of TDY_LIST_DRUG.DRUG_FREQUENCY_CODE
     */
    public String getDrugFrequencyCode() {
        return drugFrequencyCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY_CODE
     *
     * @param drugFrequencyCode the value for TDY_LIST_DRUG.DRUG_FREQUENCY_CODE
     */
    public void setDrugFrequencyCode(String drugFrequencyCode) {
        this.drugFrequencyCode = drugFrequencyCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY
     *
     * @return the value of TDY_LIST_DRUG.DRUG_FREQUENCY
     */
    public String getDrugFrequency() {
        return drugFrequency;
    }

    /**
     * TDY_LIST_DRUG.DRUG_FREQUENCY
     *
     * @param drugFrequency the value for TDY_LIST_DRUG.DRUG_FREQUENCY
     */
    public void setDrugFrequency(String drugFrequency) {
        this.drugFrequency = drugFrequency;
    }

    /**
     * TDY_LIST_DRUG.DRUG_DOST_CODE
     *
     * @return the value of TDY_LIST_DRUG.DRUG_DOST_CODE
     */
    public String getDrugDostCode() {
        return drugDostCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_DOST_CODE
     *
     * @param drugDostCode the value for TDY_LIST_DRUG.DRUG_DOST_CODE
     */
    public void setDrugDostCode(String drugDostCode) {
        this.drugDostCode = drugDostCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_DOSE_NAME
     *
     * @return the value of TDY_LIST_DRUG.DRUG_DOSE_NAME
     */
    public String getDrugDoseName() {
        return drugDoseName;
    }

    /**
     * TDY_LIST_DRUG.DRUG_DOSE_NAME
     *
     * @param drugDoseName the value for TDY_LIST_DRUG.DRUG_DOSE_NAME
     */
    public void setDrugDoseName(String drugDoseName) {
        this.drugDoseName = drugDoseName;
    }

    /**
     * TDY_LIST_DRUG.DRUG_CODE
     *
     * @return the value of TDY_LIST_DRUG.DRUG_CODE
     */
    public String getDrugCode() {
        return drugCode;
    }

    /**
     * TDY_LIST_DRUG.DRUG_CODE
     *
     * @param drugCode the value for TDY_LIST_DRUG.DRUG_CODE
     */
    public void setDrugCode(String drugCode) {
        this.drugCode = drugCode;
    }

    /**
     * TDY_LIST_DRUG.DRUGS_TOTAL_UNIT
     *
     * @return the value of TDY_LIST_DRUG.DRUGS_TOTAL_UNIT
     */
    public String getDrugsTotalUnit() {
        return drugsTotalUnit;
    }

    /**
     * TDY_LIST_DRUG.DRUGS_TOTAL_UNIT
     *
     * @param drugsTotalUnit the value for TDY_LIST_DRUG.DRUGS_TOTAL_UNIT
     */
    public void setDrugsTotalUnit(String drugsTotalUnit) {
        this.drugsTotalUnit = drugsTotalUnit;
    }

    /**
     * TDY_LIST_DRUG.DRUGS_TOTAL
     *
     * @return the value of TDY_LIST_DRUG.DRUGS_TOTAL
     */
    public String getDrugsTotal() {
        return drugsTotal;
    }

    /**
     * TDY_LIST_DRUG.DRUGS_TOTAL
     *
     * @param drugsTotal the value for TDY_LIST_DRUG.DRUGS_TOTAL
     */
    public void setDrugsTotal(String drugsTotal) {
        this.drugsTotal = drugsTotal;
    }

    /**
     * TDY_LIST_DRUG.DECOCT_METHOD
     *
     * @return the value of TDY_LIST_DRUG.DECOCT_METHOD
     */
    public String getDecoctMethod() {
        return decoctMethod;
    }

    /**
     * TDY_LIST_DRUG.DECOCT_METHOD
     *
     * @param decoctMethod the value for TDY_LIST_DRUG.DECOCT_METHOD
     */
    public void setDecoctMethod(String decoctMethod) {
        this.decoctMethod = decoctMethod;
    }

    /**
     * TDY_LIST_DRUG.DRUG_ADRS
     *
     * @return the value of TDY_LIST_DRUG.DRUG_ADRS
     */
    public String getDrugAdrs() {
        return drugAdrs;
    }

    /**
     * TDY_LIST_DRUG.DRUG_ADRS
     *
     * @param drugAdrs the value for TDY_LIST_DRUG.DRUG_ADRS
     */
    public void setDrugAdrs(String drugAdrs) {
        this.drugAdrs = drugAdrs;
    }

    /**
     * TDY_LIST_DRUG.MEDICAL_CODE
     *
     * @return the value of TDY_LIST_DRUG.MEDICAL_CODE
     */
    public String getMedicalCode() {
        return medicalCode;
    }

    /**
     * TDY_LIST_DRUG.MEDICAL_CODE
     *
     * @param medicalCode the value for TDY_LIST_DRUG.MEDICAL_CODE
     */
    public void setMedicalCode(String medicalCode) {
        this.medicalCode = medicalCode;
    }

    /**
     * TDY_LIST_DRUG.INOPER_MEDICAL
     *
     * @return the value of TDY_LIST_DRUG.INOPER_MEDICAL
     */
    public String getInoperMedical() {
        return inoperMedical;
    }

    /**
     * TDY_LIST_DRUG.INOPER_MEDICAL
     *
     * @param inoperMedical the value for TDY_LIST_DRUG.INOPER_MEDICAL
     */
    public void setInoperMedical(String inoperMedical) {
        this.inoperMedical = inoperMedical;
    }

    /**
     * TDY_LIST_DRUG.PRE_MEDICATION
     *
     * @return the value of TDY_LIST_DRUG.PRE_MEDICATION
     */
    public String getPreMedication() {
        return preMedication;
    }

    /**
     * TDY_LIST_DRUG.PRE_MEDICATION
     *
     * @param preMedication the value for TDY_LIST_DRUG.PRE_MEDICATION
     */
    public void setPreMedication(String preMedication) {
        this.preMedication = preMedication;
    }
}