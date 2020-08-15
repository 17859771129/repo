package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_ANES")
public class TdyListAnes implements Serializable {
    /**
     * This field corresponds to the database table TDY_LIST_ANES
     */
    private static final long serialVersionUID = 1L;
    /**
     * TDY_LIST_ANES.pk
     */
    private Integer pk;
    /**
     * TDY_LIST_ANES.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_ANES.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_ANES.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_ANES.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_ANES.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_ANES.UNDERLYING_DISEASE
     */
    private String underlyingDisease;
    /**
     * TDY_LIST_ANES.OPER_ROOM
     */
    private String operRoom;
    /**
     * TDY_LIST_ANES.OPER_NAME
     */
    private String operName;
    /**
     * TDY_LIST_ANES.OPER_METHOD
     */
    private String operMethod;
    /**
     * TDY_LIST_ANES.OPER_DATE
     */
    private String operDate;
    /**
     * TDY_LIST_ANES.OPER_CODE
     */
    private String operCode;
    /**
     * TDY_LIST_ANES.ANES_SAFETY_SIGN
     */
    private String anesSafetySign;
    /**
     * TDY_LIST_ANES.ANES_MARK
     */
    private String anesMark;
    /**
     * TDY_LIST_ANES.ANES_INFECT
     */
    private String anesInfect;
    /**
     * TDY_LIST_ANES.ANES_CODE
     */
    private String anesCode;
    /**
     * TDY_LIST_ANES.TRACHEAL_CLASSIFY
     */
    private String trachealClassify;
    /**
     * TDY_LIST_ANES.PUNCTURE_PROCESS
     */
    private String punctureProcess;
    /**
     * TDY_LIST_ANES.PRE_ANES_MEDICATION
     */
    private String preAnesMedication;
    /**
     * TDY_LIST_ANES.DRUG_NAME
     */
    private String drugName;
    /**
     * TDY_LIST_ANES.COMPLICATIONS_SIGN
     */
    private String complicationsSign;
    /**
     * TDY_LIST_ANES.BREATH_TYPE_CODE
     */
    private String breathTypeCode;
    /**
     * TDY_LIST_ANES.BREATH_TYPE
     */
    private String breathType;
    /**
     * TDY_LIST_ANES.ASA_CODE
     */
    private String asaCode;
    /**
     * TDY_LIST_ANES.ASA
     */
    private String asa;
    /**
     * TDY_LIST_ANES.APPROPRIATE_ANES
     */
    private String appropriateAnes;
    /**
     * TDY_LIST_ANES.ANES_START_DATE
     */
    private String anesStartDate;
    /**
     * TDY_LIST_ANES.ANES_SIGN_CODE
     */
    private String anesSignCode;
    /**
     * TDY_LIST_ANES.ANES_METHOD_NAME
     */
    private String anesMethodName;
    /**
     * TDY_LIST_ANES.ANES_METHOD_CODE
     */
    private String anesMethodCode;
    /**
     * TDY_LIST_ANES.ANES_EFFECT
     */
    private String anesEffect;
    /**
     * TDY_LIST_ANES.ANES_DESCRIPTION
     */
    private String anesDescription;
    /**
     * TDY_LIST_ANES.ANESPOSTURE
     */
    private String anesposture;
    /**
     * TDY_LIST_ANES.ANES_TYPE
     */
    private String anesType;
    /**
     * TDY_LIST_ANES.empi
     */
    private String empi;
    /**
     * TDY_LIST_ANES.ENCOUNTER_ID
     */
    private String encounterId;

    /**
     * TDY_LIST_ANES.pk
     *
     * @return the value of TDY_LIST_ANES.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * TDY_LIST_ANES.pk
     *
     * @param pk the value for TDY_LIST_ANES.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * TDY_LIST_ANES.doc_unique
     *
     * @return the value of TDY_LIST_ANES.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_ANES.doc_unique
     *
     * @param docUnique the value for TDY_LIST_ANES.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_ANES.doc_domain_id
     *
     * @return the value of TDY_LIST_ANES.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_ANES.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_ANES.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_ANES.doc_version
     *
     * @return the value of TDY_LIST_ANES.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_ANES.doc_version
     *
     * @param docVersion the value for TDY_LIST_ANES.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_ANES.doc_type
     *
     * @return the value of TDY_LIST_ANES.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_ANES.doc_type
     *
     * @param docType the value for TDY_LIST_ANES.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_ANES.delete_flag
     *
     * @return the value of TDY_LIST_ANES.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_ANES.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_ANES.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_ANES.UNDERLYING_DISEASE
     *
     * @return the value of TDY_LIST_ANES.UNDERLYING_DISEASE
     */
    public String getUnderlyingDisease() {
        return underlyingDisease;
    }

    /**
     * TDY_LIST_ANES.UNDERLYING_DISEASE
     *
     * @param underlyingDisease the value for TDY_LIST_ANES.UNDERLYING_DISEASE
     */
    public void setUnderlyingDisease(String underlyingDisease) {
        this.underlyingDisease = underlyingDisease;
    }

    /**
     * TDY_LIST_ANES.OPER_ROOM
     *
     * @return the value of TDY_LIST_ANES.OPER_ROOM
     */
    public String getOperRoom() {
        return operRoom;
    }

    /**
     * TDY_LIST_ANES.OPER_ROOM
     *
     * @param operRoom the value for TDY_LIST_ANES.OPER_ROOM
     */
    public void setOperRoom(String operRoom) {
        this.operRoom = operRoom;
    }

    /**
     * TDY_LIST_ANES.OPER_NAME
     *
     * @return the value of TDY_LIST_ANES.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * TDY_LIST_ANES.OPER_NAME
     *
     * @param operName the value for TDY_LIST_ANES.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }

    /**
     * TDY_LIST_ANES.OPER_METHOD
     *
     * @return the value of TDY_LIST_ANES.OPER_METHOD
     */
    public String getOperMethod() {
        return operMethod;
    }

    /**
     * TDY_LIST_ANES.OPER_METHOD
     *
     * @param operMethod the value for TDY_LIST_ANES.OPER_METHOD
     */
    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod;
    }

    /**
     * TDY_LIST_ANES.OPER_DATE
     *
     * @return the value of TDY_LIST_ANES.OPER_DATE
     */
    public String getOperDate() {
        return operDate;
    }

    /**
     * TDY_LIST_ANES.OPER_DATE
     *
     * @param operDate the value for TDY_LIST_ANES.OPER_DATE
     */
    public void setOperDate(String operDate) {
        this.operDate = operDate;
    }

    /**
     * TDY_LIST_ANES.OPER_CODE
     *
     * @return the value of TDY_LIST_ANES.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * TDY_LIST_ANES.OPER_CODE
     *
     * @param operCode the value for TDY_LIST_ANES.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * TDY_LIST_ANES.ANES_SAFETY_SIGN
     *
     * @return the value of TDY_LIST_ANES.ANES_SAFETY_SIGN
     */
    public String getAnesSafetySign() {
        return anesSafetySign;
    }

    /**
     * TDY_LIST_ANES.ANES_SAFETY_SIGN
     *
     * @param anesSafetySign the value for TDY_LIST_ANES.ANES_SAFETY_SIGN
     */
    public void setAnesSafetySign(String anesSafetySign) {
        this.anesSafetySign = anesSafetySign;
    }

    /**
     * TDY_LIST_ANES.ANES_MARK
     *
     * @return the value of TDY_LIST_ANES.ANES_MARK
     */
    public String getAnesMark() {
        return anesMark;
    }

    /**
     * TDY_LIST_ANES.ANES_MARK
     *
     * @param anesMark the value for TDY_LIST_ANES.ANES_MARK
     */
    public void setAnesMark(String anesMark) {
        this.anesMark = anesMark;
    }

    /**
     * TDY_LIST_ANES.ANES_INFECT
     *
     * @return the value of TDY_LIST_ANES.ANES_INFECT
     */
    public String getAnesInfect() {
        return anesInfect;
    }

    /**
     * TDY_LIST_ANES.ANES_INFECT
     *
     * @param anesInfect the value for TDY_LIST_ANES.ANES_INFECT
     */
    public void setAnesInfect(String anesInfect) {
        this.anesInfect = anesInfect;
    }

    /**
     * TDY_LIST_ANES.ANES_CODE
     *
     * @return the value of TDY_LIST_ANES.ANES_CODE
     */
    public String getAnesCode() {
        return anesCode;
    }

    /**
     * TDY_LIST_ANES.ANES_CODE
     *
     * @param anesCode the value for TDY_LIST_ANES.ANES_CODE
     */
    public void setAnesCode(String anesCode) {
        this.anesCode = anesCode;
    }

    /**
     * TDY_LIST_ANES.TRACHEAL_CLASSIFY
     *
     * @return the value of TDY_LIST_ANES.TRACHEAL_CLASSIFY
     */
    public String getTrachealClassify() {
        return trachealClassify;
    }

    /**
     * TDY_LIST_ANES.TRACHEAL_CLASSIFY
     *
     * @param trachealClassify the value for TDY_LIST_ANES.TRACHEAL_CLASSIFY
     */
    public void setTrachealClassify(String trachealClassify) {
        this.trachealClassify = trachealClassify;
    }

    /**
     * TDY_LIST_ANES.PUNCTURE_PROCESS
     *
     * @return the value of TDY_LIST_ANES.PUNCTURE_PROCESS
     */
    public String getPunctureProcess() {
        return punctureProcess;
    }

    /**
     * TDY_LIST_ANES.PUNCTURE_PROCESS
     *
     * @param punctureProcess the value for TDY_LIST_ANES.PUNCTURE_PROCESS
     */
    public void setPunctureProcess(String punctureProcess) {
        this.punctureProcess = punctureProcess;
    }

    /**
     * TDY_LIST_ANES.PRE_ANES_MEDICATION
     *
     * @return the value of TDY_LIST_ANES.PRE_ANES_MEDICATION
     */
    public String getPreAnesMedication() {
        return preAnesMedication;
    }

    /**
     * TDY_LIST_ANES.PRE_ANES_MEDICATION
     *
     * @param preAnesMedication the value for TDY_LIST_ANES.PRE_ANES_MEDICATION
     */
    public void setPreAnesMedication(String preAnesMedication) {
        this.preAnesMedication = preAnesMedication;
    }

    /**
     * TDY_LIST_ANES.DRUG_NAME
     *
     * @return the value of TDY_LIST_ANES.DRUG_NAME
     */
    public String getDrugName() {
        return drugName;
    }

    /**
     * TDY_LIST_ANES.DRUG_NAME
     *
     * @param drugName the value for TDY_LIST_ANES.DRUG_NAME
     */
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    /**
     * TDY_LIST_ANES.COMPLICATIONS_SIGN
     *
     * @return the value of TDY_LIST_ANES.COMPLICATIONS_SIGN
     */
    public String getComplicationsSign() {
        return complicationsSign;
    }

    /**
     * TDY_LIST_ANES.COMPLICATIONS_SIGN
     *
     * @param complicationsSign the value for TDY_LIST_ANES.COMPLICATIONS_SIGN
     */
    public void setComplicationsSign(String complicationsSign) {
        this.complicationsSign = complicationsSign;
    }

    /**
     * TDY_LIST_ANES.BREATH_TYPE_CODE
     *
     * @return the value of TDY_LIST_ANES.BREATH_TYPE_CODE
     */
    public String getBreathTypeCode() {
        return breathTypeCode;
    }

    /**
     * TDY_LIST_ANES.BREATH_TYPE_CODE
     *
     * @param breathTypeCode the value for TDY_LIST_ANES.BREATH_TYPE_CODE
     */
    public void setBreathTypeCode(String breathTypeCode) {
        this.breathTypeCode = breathTypeCode;
    }

    /**
     * TDY_LIST_ANES.BREATH_TYPE
     *
     * @return the value of TDY_LIST_ANES.BREATH_TYPE
     */
    public String getBreathType() {
        return breathType;
    }

    /**
     * TDY_LIST_ANES.BREATH_TYPE
     *
     * @param breathType the value for TDY_LIST_ANES.BREATH_TYPE
     */
    public void setBreathType(String breathType) {
        this.breathType = breathType;
    }

    /**
     * TDY_LIST_ANES.ASA_CODE
     *
     * @return the value of TDY_LIST_ANES.ASA_CODE
     */
    public String getAsaCode() {
        return asaCode;
    }

    /**
     * TDY_LIST_ANES.ASA_CODE
     *
     * @param asaCode the value for TDY_LIST_ANES.ASA_CODE
     */
    public void setAsaCode(String asaCode) {
        this.asaCode = asaCode;
    }

    /**
     * TDY_LIST_ANES.ASA
     *
     * @return the value of TDY_LIST_ANES.ASA
     */
    public String getAsa() {
        return asa;
    }

    /**
     * TDY_LIST_ANES.ASA
     *
     * @param asa the value for TDY_LIST_ANES.ASA
     */
    public void setAsa(String asa) {
        this.asa = asa;
    }

    /**
     * TDY_LIST_ANES.APPROPRIATE_ANES
     *
     * @return the value of TDY_LIST_ANES.APPROPRIATE_ANES
     */
    public String getAppropriateAnes() {
        return appropriateAnes;
    }

    /**
     * TDY_LIST_ANES.APPROPRIATE_ANES
     *
     * @param appropriateAnes the value for TDY_LIST_ANES.APPROPRIATE_ANES
     */
    public void setAppropriateAnes(String appropriateAnes) {
        this.appropriateAnes = appropriateAnes;
    }

    /**
     * TDY_LIST_ANES.ANES_START_DATE
     *
     * @return the value of TDY_LIST_ANES.ANES_START_DATE
     */
    public String getAnesStartDate() {
        return anesStartDate;
    }

    /**
     * TDY_LIST_ANES.ANES_START_DATE
     *
     * @param anesStartDate the value for TDY_LIST_ANES.ANES_START_DATE
     */
    public void setAnesStartDate(String anesStartDate) {
        this.anesStartDate = anesStartDate;
    }

    /**
     * TDY_LIST_ANES.ANES_SIGN_CODE
     *
     * @return the value of TDY_LIST_ANES.ANES_SIGN_CODE
     */
    public String getAnesSignCode() {
        return anesSignCode;
    }

    /**
     * TDY_LIST_ANES.ANES_SIGN_CODE
     *
     * @param anesSignCode the value for TDY_LIST_ANES.ANES_SIGN_CODE
     */
    public void setAnesSignCode(String anesSignCode) {
        this.anesSignCode = anesSignCode;
    }

    /**
     * TDY_LIST_ANES.ANES_METHOD_NAME
     *
     * @return the value of TDY_LIST_ANES.ANES_METHOD_NAME
     */
    public String getAnesMethodName() {
        return anesMethodName;
    }

    /**
     * TDY_LIST_ANES.ANES_METHOD_NAME
     *
     * @param anesMethodName the value for TDY_LIST_ANES.ANES_METHOD_NAME
     */
    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName;
    }

    /**
     * TDY_LIST_ANES.ANES_METHOD_CODE
     *
     * @return the value of TDY_LIST_ANES.ANES_METHOD_CODE
     */
    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    /**
     * TDY_LIST_ANES.ANES_METHOD_CODE
     *
     * @param anesMethodCode the value for TDY_LIST_ANES.ANES_METHOD_CODE
     */
    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode;
    }

    /**
     * TDY_LIST_ANES.ANES_EFFECT
     *
     * @return the value of TDY_LIST_ANES.ANES_EFFECT
     */
    public String getAnesEffect() {
        return anesEffect;
    }

    /**
     * TDY_LIST_ANES.ANES_EFFECT
     *
     * @param anesEffect the value for TDY_LIST_ANES.ANES_EFFECT
     */
    public void setAnesEffect(String anesEffect) {
        this.anesEffect = anesEffect;
    }

    /**
     * TDY_LIST_ANES.ANES_DESCRIPTION
     *
     * @return the value of TDY_LIST_ANES.ANES_DESCRIPTION
     */
    public String getAnesDescription() {
        return anesDescription;
    }

    /**
     * TDY_LIST_ANES.ANES_DESCRIPTION
     *
     * @param anesDescription the value for TDY_LIST_ANES.ANES_DESCRIPTION
     */
    public void setAnesDescription(String anesDescription) {
        this.anesDescription = anesDescription;
    }

    /**
     * TDY_LIST_ANES.ANESPOSTURE
     *
     * @return the value of TDY_LIST_ANES.ANESPOSTURE
     */
    public String getAnesposture() {
        return anesposture;
    }

    /**
     * TDY_LIST_ANES.ANESPOSTURE
     *
     * @param anesposture the value for TDY_LIST_ANES.ANESPOSTURE
     */
    public void setAnesposture(String anesposture) {
        this.anesposture = anesposture;
    }

    /**
     * TDY_LIST_ANES.ANES_TYPE
     *
     * @return the value of TDY_LIST_ANES.ANES_TYPE
     */
    public String getAnesType() {
        return anesType;
    }

    /**
     * TDY_LIST_ANES.ANES_TYPE
     *
     * @param anesType the value for TDY_LIST_ANES.ANES_TYPE
     */
    public void setAnesType(String anesType) {
        this.anesType = anesType;
    }

    /**
     * TDY_LIST_ANES.empi
     *
     * @return the value of TDY_LIST_ANES.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_ANES.empi
     *
     * @param empi the value for TDY_LIST_ANES.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_ANES.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_ANES.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_ANES.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_ANES.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }
}