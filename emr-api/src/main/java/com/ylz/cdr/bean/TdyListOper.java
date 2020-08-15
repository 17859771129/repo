package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_OPER")
public class TdyListOper implements Serializable {

    private static final long serialVersionUID = -1436185405108056020L;
    /**
     * TDY_LIST_OPER.pk
     */
    private Integer pk;
    /**
     * TDY_LIST_OPER.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_OPER.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_OPER.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_OPER.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_OPER.empi
     */
    private String empi;
    /**
     * TDY_LIST_OPER.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * TDY_LIST_OPER.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_OPER.ANES_CODE
     */
    private String anesCode;
    /**
     * TDY_LIST_OPER.TARGET_NAME
     */
    private String targetName;
    /**
     * TDY_LIST_OPER.TARGET_CODE
     */
    private String targetCode;
    /**
     * TDY_LIST_OPER.SURGICAL_PROGRAM
     */
    private String surgicalProgram;
    /**
     * TDY_LIST_OPER.SURGEON_NAME
     */
    private String surgeonName;
    /**
     * TDY_LIST_OPER.SURGEON_CODE
     */
    private String surgeonCode;
    /**
     * TDY_LIST_OPER.PRO_PROCESS
     */
    private String proProcess;
    /**
     * TDY_LIST_OPER.PRE_PREPARATION
     */
    private String prePreparation;
    /**
     * TDY_LIST_OPER.PREPARATIONS
     */
    private String preparations;
    /**
     * TDY_LIST_OPER.OUT_OPER_DATE
     */
    private String outOperDate;
    /**
     * TDY_LIST_OPER.OPER_SURGICAL
     */
    private String operSurgical;
    /**
     * TDY_LIST_OPER.OPER_START_DATE
     */
    private String operStartDate;
    /**
     * TDY_LIST_OPER.OPER_ROOM
     */
    private String operRoom;
    /**
     * TDY_LIST_OPER.OPER_NUM
     */
    private String operNum;
    /**
     * TDY_LIST_OPER.OPER_NAME
     */
    private String operName;
    /**
     * TDY_LIST_OPER.OPER_METHOD
     */
    private String operMethod;
    /**
     * TDY_LIST_OPER.OPER_LEVEL_CODE
     */
    private String operLevelCode;
    /**
     * TDY_LIST_OPER.OPER_LEVEL
     */
    private String operLevel;
    /**
     * TDY_LIST_OPER.OPER_KEY_POINT
     */
    private String operKeyPoint;
    /**
     * TDY_LIST_OPER.OPER_INDICATION
     */
    private String operIndication;
    /**
     * TDY_LIST_OPER.OPER_IHG_NAME
     */
    private String operIhgName;
    /**
     * TDY_LIST_OPER.OPER_IHG_CODE
     */
    private String operIhgCode;
    /**
     * TDY_LIST_OPER.OPER_END_DATE
     */
    private String operEndDate;
    /**
     * TDY_LIST_OPER.OPER_DURATION
     */
    private String operDuration;
    /**
     * TDY_LIST_OPER.OPER_DATE
     */
    private String operDate;
    /**
     * TDY_LIST_OPER.OPER_CUT_NAME
     */
    private String operCutName;
    /**
     * TDY_LIST_OPER.OPER_CUT_CODE
     */
    private String operCutCode;
    /**
     * TDY_LIST_OPER.OPER_CODE
     */
    private String operCode;
    /**
     * TDY_LIST_OPER.NEEDING_ATTENTION
     */
    private String needingAttention;
    /**
     * TDY_LIST_OPER.IN_PATHOLOGY_MARK
     */
    private String inPathologyMark;
    /**
     * TDY_LIST_OPER.INTERVENTION
     */
    private String intervention;
    /**
     * TDY_LIST_OPER.CONTRAINDICATION
     */
    private String contraindication;
    /**
     * TDY_LIST_OPER.ASSISTANT_IICODE
     */
    private String assistantIicode;
    /**
     * TDY_LIST_OPER.ASSISTANT_II
     */
    private String assistantIi;
    /**
     * TDY_LIST_OPER.ASSISTANT_ICODE
     */
    private String assistantIcode;
    /**
     * TDY_LIST_OPER.ASSISTANT_I
     */
    private String assistantI;
    /**
     * TDY_LIST_OPER.ANES_METHOD_NAME
     */
    private String anesMethodName;
    /**
     * TDY_LIST_OPER.ANES_METHOD_CODE
     */
    private String anesMethodCode;
    /**
     * TDY_LIST_OPER.ANESTH_NAME
     */
    private String anesthName;
    /**
     * TDY_LIST_OPER.ANESTH_CODE
     */
    private String anesthCode;
    /**
     * TDY_LIST_OPER.ADMIT_ROOM_DATE
     */
    private String admitRoomDate;
    /**
     * TDY_LIST_OPER.OPER_TYPE
     */
    private String operType;

    /**
     * TDY_LIST_OPER.pk
     *
     * @return the value of TDY_LIST_OPER.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * TDY_LIST_OPER.pk
     *
     * @param pk the value for TDY_LIST_OPER.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * TDY_LIST_OPER.doc_unique
     *
     * @return the value of TDY_LIST_OPER.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_OPER.doc_unique
     *
     * @param docUnique the value for TDY_LIST_OPER.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_OPER.doc_domain_id
     *
     * @return the value of TDY_LIST_OPER.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_OPER.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_OPER.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_OPER.doc_version
     *
     * @return the value of TDY_LIST_OPER.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_OPER.doc_version
     *
     * @param docVersion the value for TDY_LIST_OPER.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_OPER.doc_type
     *
     * @return the value of TDY_LIST_OPER.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_OPER.doc_type
     *
     * @param docType the value for TDY_LIST_OPER.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_OPER.empi
     *
     * @return the value of TDY_LIST_OPER.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_OPER.empi
     *
     * @param empi the value for TDY_LIST_OPER.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_OPER.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_OPER.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_OPER.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_OPER.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * TDY_LIST_OPER.delete_flag
     *
     * @return the value of TDY_LIST_OPER.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_OPER.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_OPER.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_OPER.ANES_CODE
     *
     * @return the value of TDY_LIST_OPER.ANES_CODE
     */
    public String getAnesCode() {
        return anesCode;
    }

    /**
     * TDY_LIST_OPER.ANES_CODE
     *
     * @param anesCode the value for TDY_LIST_OPER.ANES_CODE
     */
    public void setAnesCode(String anesCode) {
        this.anesCode = anesCode;
    }

    /**
     * TDY_LIST_OPER.TARGET_NAME
     *
     * @return the value of TDY_LIST_OPER.TARGET_NAME
     */
    public String getTargetName() {
        return targetName;
    }

    /**
     * TDY_LIST_OPER.TARGET_NAME
     *
     * @param targetName the value for TDY_LIST_OPER.TARGET_NAME
     */
    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    /**
     * TDY_LIST_OPER.TARGET_CODE
     *
     * @return the value of TDY_LIST_OPER.TARGET_CODE
     */
    public String getTargetCode() {
        return targetCode;
    }

    /**
     * TDY_LIST_OPER.TARGET_CODE
     *
     * @param targetCode the value for TDY_LIST_OPER.TARGET_CODE
     */
    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    /**
     * TDY_LIST_OPER.SURGICAL_PROGRAM
     *
     * @return the value of TDY_LIST_OPER.SURGICAL_PROGRAM
     */
    public String getSurgicalProgram() {
        return surgicalProgram;
    }

    /**
     * TDY_LIST_OPER.SURGICAL_PROGRAM
     *
     * @param surgicalProgram the value for TDY_LIST_OPER.SURGICAL_PROGRAM
     */
    public void setSurgicalProgram(String surgicalProgram) {
        this.surgicalProgram = surgicalProgram;
    }

    /**
     * TDY_LIST_OPER.SURGEON_NAME
     *
     * @return the value of TDY_LIST_OPER.SURGEON_NAME
     */
    public String getSurgeonName() {
        return surgeonName;
    }

    /**
     * TDY_LIST_OPER.SURGEON_NAME
     *
     * @param surgeonName the value for TDY_LIST_OPER.SURGEON_NAME
     */
    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName;
    }

    /**
     * TDY_LIST_OPER.SURGEON_CODE
     *
     * @return the value of TDY_LIST_OPER.SURGEON_CODE
     */
    public String getSurgeonCode() {
        return surgeonCode;
    }

    /**
     * TDY_LIST_OPER.SURGEON_CODE
     *
     * @param surgeonCode the value for TDY_LIST_OPER.SURGEON_CODE
     */
    public void setSurgeonCode(String surgeonCode) {
        this.surgeonCode = surgeonCode;
    }

    /**
     * TDY_LIST_OPER.PRO_PROCESS
     *
     * @return the value of TDY_LIST_OPER.PRO_PROCESS
     */
    public String getProProcess() {
        return proProcess;
    }

    /**
     * TDY_LIST_OPER.PRO_PROCESS
     *
     * @param proProcess the value for TDY_LIST_OPER.PRO_PROCESS
     */
    public void setProProcess(String proProcess) {
        this.proProcess = proProcess;
    }

    /**
     * TDY_LIST_OPER.PRE_PREPARATION
     *
     * @return the value of TDY_LIST_OPER.PRE_PREPARATION
     */
    public String getPrePreparation() {
        return prePreparation;
    }

    /**
     * TDY_LIST_OPER.PRE_PREPARATION
     *
     * @param prePreparation the value for TDY_LIST_OPER.PRE_PREPARATION
     */
    public void setPrePreparation(String prePreparation) {
        this.prePreparation = prePreparation;
    }

    /**
     * TDY_LIST_OPER.PREPARATIONS
     *
     * @return the value of TDY_LIST_OPER.PREPARATIONS
     */
    public String getPreparations() {
        return preparations;
    }

    /**
     * TDY_LIST_OPER.PREPARATIONS
     *
     * @param preparations the value for TDY_LIST_OPER.PREPARATIONS
     */
    public void setPreparations(String preparations) {
        this.preparations = preparations;
    }

    /**
     * TDY_LIST_OPER.OUT_OPER_DATE
     *
     * @return the value of TDY_LIST_OPER.OUT_OPER_DATE
     */
    public String getOutOperDate() {
        return outOperDate;
    }

    /**
     * TDY_LIST_OPER.OUT_OPER_DATE
     *
     * @param outOperDate the value for TDY_LIST_OPER.OUT_OPER_DATE
     */
    public void setOutOperDate(String outOperDate) {
        this.outOperDate = outOperDate;
    }

    /**
     * TDY_LIST_OPER.OPER_SURGICAL
     *
     * @return the value of TDY_LIST_OPER.OPER_SURGICAL
     */
    public String getOperSurgical() {
        return operSurgical;
    }

    /**
     * TDY_LIST_OPER.OPER_SURGICAL
     *
     * @param operSurgical the value for TDY_LIST_OPER.OPER_SURGICAL
     */
    public void setOperSurgical(String operSurgical) {
        this.operSurgical = operSurgical;
    }

    /**
     * TDY_LIST_OPER.OPER_START_DATE
     *
     * @return the value of TDY_LIST_OPER.OPER_START_DATE
     */
    public String getOperStartDate() {
        return operStartDate;
    }

    /**
     * TDY_LIST_OPER.OPER_START_DATE
     *
     * @param operStartDate the value for TDY_LIST_OPER.OPER_START_DATE
     */
    public void setOperStartDate(String operStartDate) {
        this.operStartDate = operStartDate;
    }

    /**
     * TDY_LIST_OPER.OPER_ROOM
     *
     * @return the value of TDY_LIST_OPER.OPER_ROOM
     */
    public String getOperRoom() {
        return operRoom;
    }

    /**
     * TDY_LIST_OPER.OPER_ROOM
     *
     * @param operRoom the value for TDY_LIST_OPER.OPER_ROOM
     */
    public void setOperRoom(String operRoom) {
        this.operRoom = operRoom;
    }

    /**
     * TDY_LIST_OPER.OPER_NUM
     *
     * @return the value of TDY_LIST_OPER.OPER_NUM
     */
    public String getOperNum() {
        return operNum;
    }

    /**
     * TDY_LIST_OPER.OPER_NUM
     *
     * @param operNum the value for TDY_LIST_OPER.OPER_NUM
     */
    public void setOperNum(String operNum) {
        this.operNum = operNum;
    }

    /**
     * TDY_LIST_OPER.OPER_NAME
     *
     * @return the value of TDY_LIST_OPER.OPER_NAME
     */
    public String getOperName() {
        return operName;
    }

    /**
     * TDY_LIST_OPER.OPER_NAME
     *
     * @param operName the value for TDY_LIST_OPER.OPER_NAME
     */
    public void setOperName(String operName) {
        this.operName = operName;
    }

    /**
     * TDY_LIST_OPER.OPER_METHOD
     *
     * @return the value of TDY_LIST_OPER.OPER_METHOD
     */
    public String getOperMethod() {
        return operMethod;
    }

    /**
     * TDY_LIST_OPER.OPER_METHOD
     *
     * @param operMethod the value for TDY_LIST_OPER.OPER_METHOD
     */
    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod;
    }

    /**
     * TDY_LIST_OPER.OPER_LEVEL_CODE
     *
     * @return the value of TDY_LIST_OPER.OPER_LEVEL_CODE
     */
    public String getOperLevelCode() {
        return operLevelCode;
    }

    /**
     * TDY_LIST_OPER.OPER_LEVEL_CODE
     *
     * @param operLevelCode the value for TDY_LIST_OPER.OPER_LEVEL_CODE
     */
    public void setOperLevelCode(String operLevelCode) {
        this.operLevelCode = operLevelCode;
    }

    /**
     * TDY_LIST_OPER.OPER_LEVEL
     *
     * @return the value of TDY_LIST_OPER.OPER_LEVEL
     */
    public String getOperLevel() {
        return operLevel;
    }

    /**
     * TDY_LIST_OPER.OPER_LEVEL
     *
     * @param operLevel the value for TDY_LIST_OPER.OPER_LEVEL
     */
    public void setOperLevel(String operLevel) {
        this.operLevel = operLevel;
    }

    /**
     * TDY_LIST_OPER.OPER_KEY_POINT
     *
     * @return the value of TDY_LIST_OPER.OPER_KEY_POINT
     */
    public String getOperKeyPoint() {
        return operKeyPoint;
    }

    /**
     * TDY_LIST_OPER.OPER_KEY_POINT
     *
     * @param operKeyPoint the value for TDY_LIST_OPER.OPER_KEY_POINT
     */
    public void setOperKeyPoint(String operKeyPoint) {
        this.operKeyPoint = operKeyPoint;
    }

    /**
     * TDY_LIST_OPER.OPER_INDICATION
     *
     * @return the value of TDY_LIST_OPER.OPER_INDICATION
     */
    public String getOperIndication() {
        return operIndication;
    }

    /**
     * TDY_LIST_OPER.OPER_INDICATION
     *
     * @param operIndication the value for TDY_LIST_OPER.OPER_INDICATION
     */
    public void setOperIndication(String operIndication) {
        this.operIndication = operIndication;
    }

    /**
     * TDY_LIST_OPER.OPER_IHG_NAME
     *
     * @return the value of TDY_LIST_OPER.OPER_IHG_NAME
     */
    public String getOperIhgName() {
        return operIhgName;
    }

    /**
     * TDY_LIST_OPER.OPER_IHG_NAME
     *
     * @param operIhgName the value for TDY_LIST_OPER.OPER_IHG_NAME
     */
    public void setOperIhgName(String operIhgName) {
        this.operIhgName = operIhgName;
    }

    /**
     * TDY_LIST_OPER.OPER_IHG_CODE
     *
     * @return the value of TDY_LIST_OPER.OPER_IHG_CODE
     */
    public String getOperIhgCode() {
        return operIhgCode;
    }

    /**
     * TDY_LIST_OPER.OPER_IHG_CODE
     *
     * @param operIhgCode the value for TDY_LIST_OPER.OPER_IHG_CODE
     */
    public void setOperIhgCode(String operIhgCode) {
        this.operIhgCode = operIhgCode;
    }

    /**
     * TDY_LIST_OPER.OPER_END_DATE
     *
     * @return the value of TDY_LIST_OPER.OPER_END_DATE
     */
    public String getOperEndDate() {
        return operEndDate;
    }

    /**
     * TDY_LIST_OPER.OPER_END_DATE
     *
     * @param operEndDate the value for TDY_LIST_OPER.OPER_END_DATE
     */
    public void setOperEndDate(String operEndDate) {
        this.operEndDate = operEndDate;
    }

    /**
     * TDY_LIST_OPER.OPER_DURATION
     *
     * @return the value of TDY_LIST_OPER.OPER_DURATION
     */
    public String getOperDuration() {
        return operDuration;
    }

    /**
     * TDY_LIST_OPER.OPER_DURATION
     *
     * @param operDuration the value for TDY_LIST_OPER.OPER_DURATION
     */
    public void setOperDuration(String operDuration) {
        this.operDuration = operDuration;
    }

    /**
     * TDY_LIST_OPER.OPER_DATE
     *
     * @return the value of TDY_LIST_OPER.OPER_DATE
     */
    public String getOperDate() {
        return operDate;
    }

    /**
     * TDY_LIST_OPER.OPER_DATE
     *
     * @param operDate the value for TDY_LIST_OPER.OPER_DATE
     */
    public void setOperDate(String operDate) {
        this.operDate = operDate;
    }

    /**
     * TDY_LIST_OPER.OPER_CUT_NAME
     *
     * @return the value of TDY_LIST_OPER.OPER_CUT_NAME
     */
    public String getOperCutName() {
        return operCutName;
    }

    /**
     * TDY_LIST_OPER.OPER_CUT_NAME
     *
     * @param operCutName the value for TDY_LIST_OPER.OPER_CUT_NAME
     */
    public void setOperCutName(String operCutName) {
        this.operCutName = operCutName;
    }

    /**
     * TDY_LIST_OPER.OPER_CUT_CODE
     *
     * @return the value of TDY_LIST_OPER.OPER_CUT_CODE
     */
    public String getOperCutCode() {
        return operCutCode;
    }

    /**
     * TDY_LIST_OPER.OPER_CUT_CODE
     *
     * @param operCutCode the value for TDY_LIST_OPER.OPER_CUT_CODE
     */
    public void setOperCutCode(String operCutCode) {
        this.operCutCode = operCutCode;
    }

    /**
     * TDY_LIST_OPER.OPER_CODE
     *
     * @return the value of TDY_LIST_OPER.OPER_CODE
     */
    public String getOperCode() {
        return operCode;
    }

    /**
     * TDY_LIST_OPER.OPER_CODE
     *
     * @param operCode the value for TDY_LIST_OPER.OPER_CODE
     */
    public void setOperCode(String operCode) {
        this.operCode = operCode;
    }

    /**
     * TDY_LIST_OPER.NEEDING_ATTENTION
     *
     * @return the value of TDY_LIST_OPER.NEEDING_ATTENTION
     */
    public String getNeedingAttention() {
        return needingAttention;
    }

    /**
     * TDY_LIST_OPER.NEEDING_ATTENTION
     *
     * @param needingAttention the value for TDY_LIST_OPER.NEEDING_ATTENTION
     */
    public void setNeedingAttention(String needingAttention) {
        this.needingAttention = needingAttention;
    }

    /**
     * TDY_LIST_OPER.IN_PATHOLOGY_MARK
     *
     * @return the value of TDY_LIST_OPER.IN_PATHOLOGY_MARK
     */
    public String getInPathologyMark() {
        return inPathologyMark;
    }

    /**
     * TDY_LIST_OPER.IN_PATHOLOGY_MARK
     *
     * @param inPathologyMark the value for TDY_LIST_OPER.IN_PATHOLOGY_MARK
     */
    public void setInPathologyMark(String inPathologyMark) {
        this.inPathologyMark = inPathologyMark;
    }

    /**
     * TDY_LIST_OPER.INTERVENTION
     *
     * @return the value of TDY_LIST_OPER.INTERVENTION
     */
    public String getIntervention() {
        return intervention;
    }

    /**
     * TDY_LIST_OPER.INTERVENTION
     *
     * @param intervention the value for TDY_LIST_OPER.INTERVENTION
     */
    public void setIntervention(String intervention) {
        this.intervention = intervention;
    }

    /**
     * TDY_LIST_OPER.CONTRAINDICATION
     *
     * @return the value of TDY_LIST_OPER.CONTRAINDICATION
     */
    public String getContraindication() {
        return contraindication;
    }

    /**
     * TDY_LIST_OPER.CONTRAINDICATION
     *
     * @param contraindication the value for TDY_LIST_OPER.CONTRAINDICATION
     */
    public void setContraindication(String contraindication) {
        this.contraindication = contraindication;
    }

    /**
     * TDY_LIST_OPER.ASSISTANT_IICODE
     *
     * @return the value of TDY_LIST_OPER.ASSISTANT_IICODE
     */
    public String getAssistantIicode() {
        return assistantIicode;
    }

    /**
     * TDY_LIST_OPER.ASSISTANT_IICODE
     *
     * @param assistantIicode the value for TDY_LIST_OPER.ASSISTANT_IICODE
     */
    public void setAssistantIicode(String assistantIicode) {
        this.assistantIicode = assistantIicode;
    }

    /**
     * TDY_LIST_OPER.ASSISTANT_II
     *
     * @return the value of TDY_LIST_OPER.ASSISTANT_II
     */
    public String getAssistantIi() {
        return assistantIi;
    }

    /**
     * TDY_LIST_OPER.ASSISTANT_II
     *
     * @param assistantIi the value for TDY_LIST_OPER.ASSISTANT_II
     */
    public void setAssistantIi(String assistantIi) {
        this.assistantIi = assistantIi;
    }

    /**
     * TDY_LIST_OPER.ASSISTANT_ICODE
     *
     * @return the value of TDY_LIST_OPER.ASSISTANT_ICODE
     */
    public String getAssistantIcode() {
        return assistantIcode;
    }

    /**
     * TDY_LIST_OPER.ASSISTANT_ICODE
     *
     * @param assistantIcode the value for TDY_LIST_OPER.ASSISTANT_ICODE
     */
    public void setAssistantIcode(String assistantIcode) {
        this.assistantIcode = assistantIcode;
    }

    /**
     * TDY_LIST_OPER.ASSISTANT_I
     *
     * @return the value of TDY_LIST_OPER.ASSISTANT_I
     */
    public String getAssistantI() {
        return assistantI;
    }

    /**
     * TDY_LIST_OPER.ASSISTANT_I
     *
     * @param assistantI the value for TDY_LIST_OPER.ASSISTANT_I
     */
    public void setAssistantI(String assistantI) {
        this.assistantI = assistantI;
    }

    /**
     * TDY_LIST_OPER.ANES_METHOD_NAME
     *
     * @return the value of TDY_LIST_OPER.ANES_METHOD_NAME
     */
    public String getAnesMethodName() {
        return anesMethodName;
    }

    /**
     * TDY_LIST_OPER.ANES_METHOD_NAME
     *
     * @param anesMethodName the value for TDY_LIST_OPER.ANES_METHOD_NAME
     */
    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName;
    }

    /**
     * TDY_LIST_OPER.ANES_METHOD_CODE
     *
     * @return the value of TDY_LIST_OPER.ANES_METHOD_CODE
     */
    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    /**
     * TDY_LIST_OPER.ANES_METHOD_CODE
     *
     * @param anesMethodCode the value for TDY_LIST_OPER.ANES_METHOD_CODE
     */
    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode;
    }

    /**
     * TDY_LIST_OPER.ANESTH_NAME
     *
     * @return the value of TDY_LIST_OPER.ANESTH_NAME
     */
    public String getAnesthName() {
        return anesthName;
    }

    /**
     * TDY_LIST_OPER.ANESTH_NAME
     *
     * @param anesthName the value for TDY_LIST_OPER.ANESTH_NAME
     */
    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName;
    }

    /**
     * TDY_LIST_OPER.ANESTH_CODE
     *
     * @return the value of TDY_LIST_OPER.ANESTH_CODE
     */
    public String getAnesthCode() {
        return anesthCode;
    }

    /**
     * TDY_LIST_OPER.ANESTH_CODE
     *
     * @param anesthCode the value for TDY_LIST_OPER.ANESTH_CODE
     */
    public void setAnesthCode(String anesthCode) {
        this.anesthCode = anesthCode;
    }

    /**
     * TDY_LIST_OPER.ADMIT_ROOM_DATE
     *
     * @return the value of TDY_LIST_OPER.ADMIT_ROOM_DATE
     */
    public String getAdmitRoomDate() {
        return admitRoomDate;
    }

    /**
     * TDY_LIST_OPER.ADMIT_ROOM_DATE
     *
     * @param admitRoomDate the value for TDY_LIST_OPER.ADMIT_ROOM_DATE
     */
    public void setAdmitRoomDate(String admitRoomDate) {
        this.admitRoomDate = admitRoomDate;
    }

    /**
     * TDY_LIST_OPER.OPER_TYPE
     *
     * @return the value of TDY_LIST_OPER.OPER_TYPE
     */
    public String getOperType() {
        return operType;
    }

    /**
     * TDY_LIST_OPER.OPER_TYPE
     *
     * @param operType the value for TDY_LIST_OPER.OPER_TYPE
     */
    public void setOperType(String operType) {
        this.operType = operType;
    }

}