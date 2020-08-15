package com.ylz.cda.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import com.ylz.common.bean.SubBaseBean;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_OPER")
public class TdyListOper extends SubBaseBean implements Serializable {
    private static final long serialVersionUID = -5801794994984752182L;
    private Integer pk;

    private String docUnique;

    private String docDomainId;

    private String docVersion;

    private String docType;

    private String empi;

    private String encounterId;

    private String deleteFlag;

    private String anesCode;

    private String targetName;

    private String targetCode;

    private String surgicalProgram;

    private String surgeonName;

    private String surgeonCode;

    private String proProcess;

    private String prePreparation;

    private String preparations;

    private String outOperDate;

    private String operSurgical;

    private String operStartDate;

    private String operRoom;

    private String operNum;

    private String operName;

    private String operMethod;

    private String operLevelCode;

    private String operLevel;

    private String operKeyPoint;

    private String operIndication;

    private String operIhgName;

    private String operIhgCode;

    private String operEndDate;

    private String operDuration;

    private String operDate;

    private String operCutName;

    private String operCutCode;

    private String operCode;

    private String needingAttention;

    private String inPathologyMark;

    private String intervention;

    private String contraindication;

    private String assistantIicode;

    private String assistantIi;

    private String assistantIcode;

    private String assistantI;

    private String anesMethodName;

    private String anesMethodCode;

    private String anesthName;

    private String anesthCode;

    private String admitRoomDate;

    private String operType;

    public Integer getPk() {
        return pk;
    }

    public void setPk(Integer pk) {
        this.pk = pk;
    }

    public String getDocUnique() {
        return docUnique;
    }

    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique == null ? null : docUnique.trim();
    }

    public String getDocDomainId() {
        return docDomainId;
    }

    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId == null ? null : docDomainId.trim();
    }

    public String getDocVersion() {
        return docVersion;
    }

    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion == null ? null : docVersion.trim();
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType == null ? null : docType.trim();
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

    public String getAnesCode() {
        return anesCode;
    }

    public void setAnesCode(String anesCode) {
        this.anesCode = anesCode == null ? null : anesCode.trim();
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName == null ? null : targetName.trim();
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode == null ? null : targetCode.trim();
    }

    public String getSurgicalProgram() {
        return surgicalProgram;
    }

    public void setSurgicalProgram(String surgicalProgram) {
        this.surgicalProgram = surgicalProgram == null ? null : surgicalProgram.trim();
    }

    public String getSurgeonName() {
        return surgeonName;
    }

    public void setSurgeonName(String surgeonName) {
        this.surgeonName = surgeonName == null ? null : surgeonName.trim();
    }

    public String getSurgeonCode() {
        return surgeonCode;
    }

    public void setSurgeonCode(String surgeonCode) {
        this.surgeonCode = surgeonCode == null ? null : surgeonCode.trim();
    }

    public String getProProcess() {
        return proProcess;
    }

    public void setProProcess(String proProcess) {
        this.proProcess = proProcess == null ? null : proProcess.trim();
    }

    public String getPrePreparation() {
        return prePreparation;
    }

    public void setPrePreparation(String prePreparation) {
        this.prePreparation = prePreparation == null ? null : prePreparation.trim();
    }

    public String getPreparations() {
        return preparations;
    }

    public void setPreparations(String preparations) {
        this.preparations = preparations == null ? null : preparations.trim();
    }

    public String getOutOperDate() {
        return outOperDate;
    }

    public void setOutOperDate(String outOperDate) {
        this.outOperDate = outOperDate == null ? null : outOperDate.trim();
    }

    public String getOperSurgical() {
        return operSurgical;
    }

    public void setOperSurgical(String operSurgical) {
        this.operSurgical = operSurgical == null ? null : operSurgical.trim();
    }

    public String getOperStartDate() {
        return operStartDate;
    }

    public void setOperStartDate(String operStartDate) {
        this.operStartDate = operStartDate == null ? null : operStartDate.trim();
    }

    public String getOperRoom() {
        return operRoom;
    }

    public void setOperRoom(String operRoom) {
        this.operRoom = operRoom == null ? null : operRoom.trim();
    }

    public String getOperNum() {
        return operNum;
    }

    public void setOperNum(String operNum) {
        this.operNum = operNum == null ? null : operNum.trim();
    }

    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName == null ? null : operName.trim();
    }

    public String getOperMethod() {
        return operMethod;
    }

    public void setOperMethod(String operMethod) {
        this.operMethod = operMethod == null ? null : operMethod.trim();
    }

    public String getOperLevelCode() {
        return operLevelCode;
    }

    public void setOperLevelCode(String operLevelCode) {
        this.operLevelCode = operLevelCode == null ? null : operLevelCode.trim();
    }

    public String getOperLevel() {
        return operLevel;
    }

    public void setOperLevel(String operLevel) {
        this.operLevel = operLevel == null ? null : operLevel.trim();
    }

    public String getOperKeyPoint() {
        return operKeyPoint;
    }

    public void setOperKeyPoint(String operKeyPoint) {
        this.operKeyPoint = operKeyPoint == null ? null : operKeyPoint.trim();
    }

    public String getOperIndication() {
        return operIndication;
    }

    public void setOperIndication(String operIndication) {
        this.operIndication = operIndication == null ? null : operIndication.trim();
    }

    public String getOperIhgName() {
        return operIhgName;
    }

    public void setOperIhgName(String operIhgName) {
        this.operIhgName = operIhgName == null ? null : operIhgName.trim();
    }

    public String getOperIhgCode() {
        return operIhgCode;
    }

    public void setOperIhgCode(String operIhgCode) {
        this.operIhgCode = operIhgCode == null ? null : operIhgCode.trim();
    }

    public String getOperEndDate() {
        return operEndDate;
    }

    public void setOperEndDate(String operEndDate) {
        this.operEndDate = operEndDate == null ? null : operEndDate.trim();
    }

    public String getOperDuration() {
        return operDuration;
    }

    public void setOperDuration(String operDuration) {
        this.operDuration = operDuration == null ? null : operDuration.trim();
    }

    public String getOperDate() {
        return operDate;
    }

    public void setOperDate(String operDate) {
        this.operDate = operDate == null ? null : operDate.trim();
    }

    public String getOperCutName() {
        return operCutName;
    }

    public void setOperCutName(String operCutName) {
        this.operCutName = operCutName == null ? null : operCutName.trim();
    }

    public String getOperCutCode() {
        return operCutCode;
    }

    public void setOperCutCode(String operCutCode) {
        this.operCutCode = operCutCode == null ? null : operCutCode.trim();
    }

    public String getOperCode() {
        return operCode;
    }

    public void setOperCode(String operCode) {
        this.operCode = operCode == null ? null : operCode.trim();
    }

    public String getNeedingAttention() {
        return needingAttention;
    }

    public void setNeedingAttention(String needingAttention) {
        this.needingAttention = needingAttention == null ? null : needingAttention.trim();
    }

    public String getInPathologyMark() {
        return inPathologyMark;
    }

    public void setInPathologyMark(String inPathologyMark) {
        this.inPathologyMark = inPathologyMark == null ? null : inPathologyMark.trim();
    }

    public String getIntervention() {
        return intervention;
    }

    public void setIntervention(String intervention) {
        this.intervention = intervention == null ? null : intervention.trim();
    }

    public String getContraindication() {
        return contraindication;
    }

    public void setContraindication(String contraindication) {
        this.contraindication = contraindication == null ? null : contraindication.trim();
    }

    public String getAssistantIicode() {
        return assistantIicode;
    }

    public void setAssistantIicode(String assistantIicode) {
        this.assistantIicode = assistantIicode == null ? null : assistantIicode.trim();
    }

    public String getAssistantIi() {
        return assistantIi;
    }

    public void setAssistantIi(String assistantIi) {
        this.assistantIi = assistantIi == null ? null : assistantIi.trim();
    }

    public String getAssistantIcode() {
        return assistantIcode;
    }

    public void setAssistantIcode(String assistantIcode) {
        this.assistantIcode = assistantIcode == null ? null : assistantIcode.trim();
    }

    public String getAssistantI() {
        return assistantI;
    }

    public void setAssistantI(String assistantI) {
        this.assistantI = assistantI == null ? null : assistantI.trim();
    }

    public String getAnesMethodName() {
        return anesMethodName;
    }

    public void setAnesMethodName(String anesMethodName) {
        this.anesMethodName = anesMethodName == null ? null : anesMethodName.trim();
    }

    public String getAnesMethodCode() {
        return anesMethodCode;
    }

    public void setAnesMethodCode(String anesMethodCode) {
        this.anesMethodCode = anesMethodCode == null ? null : anesMethodCode.trim();
    }

    public String getAnesthName() {
        return anesthName;
    }

    public void setAnesthName(String anesthName) {
        this.anesthName = anesthName == null ? null : anesthName.trim();
    }

    public String getAnesthCode() {
        return anesthCode;
    }

    public void setAnesthCode(String anesthCode) {
        this.anesthCode = anesthCode == null ? null : anesthCode.trim();
    }

    public String getAdmitRoomDate() {
        return admitRoomDate;
    }

    public void setAdmitRoomDate(String admitRoomDate) {
        this.admitRoomDate = admitRoomDate == null ? null : admitRoomDate.trim();
    }

    public String getOperType() {
        return operType;
    }

    public void setOperType(String operType) {
        this.operType = operType == null ? null : operType.trim();
    }
}