package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_08_05")
public class Hdsd000805 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_08_05
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_08_05.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_08_05.status
     */
    private String status;
    /**
     * HDSD00_08_05.pk
     */
    private Integer pk;
    /**
     * HDSD00_08_05.empi
     */
    private String empi;
    /**
     * HDSD00_08_05.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_08_05.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_08_05.WEIGHT
     */
    private String weight;
    /**
     * HDSD00_08_05.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_08_05.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_08_05.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_08_05.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_08_05.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_08_05.VERSION
     */
    private String version;
    /**
     * HDSD00_08_05.SKIN_EXAM
     */
    private String skinExam;
    /**
     * HDSD00_08_05.SHIPPER_SIGNDATE
     */
    private String shipperSigndate;
    /**
     * HDSD00_08_05.SHIPPER_NAME
     */
    private String shipperName;
    /**
     * HDSD00_08_05.SHIPPER_CODE
     */
    private String shipperCode;
    /**
     * HDSD00_08_05.SCRUB_NAME_BC
     */
    private String scrubNameBc;
    /**
     * HDSD00_08_05.SCRUB_NAME_AO
     */
    private String scrubNameAo;
    /**
     * HDSD00_08_05.SCRUB_NAME_AC
     */
    private String scrubNameAc;
    /**
     * HDSD00_08_05.SCRUB_DATE_BC
     */
    private String scrubDateBc;
    /**
     * HDSD00_08_05.SCRUB_DATE_AO
     */
    private String scrubDateAo;
    /**
     * HDSD00_08_05.SCRUB_DATE_AC
     */
    private String scrubDateAc;
    /**
     * HDSD00_08_05.SCRUB_CODE_BC
     */
    private String scrubCodeBc;
    /**
     * HDSD00_08_05.SCRUB_CODE_AO
     */
    private String scrubCodeAo;
    /**
     * HDSD00_08_05.SCRUB_CODE_AC
     */
    private String scrubCodeAc;
    /**
     * HDSD00_08_05.RH_GROUP
     */
    private String rhGroup;
    /**
     * HDSD00_08_05.RH_CODE
     */
    private String rhCode;
    /**
     * HDSD00_08_05.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_08_05.PREOPERATIVE_COUNTING_MARK
     */
    private String preoperativeCountingMark;
    /**
     * HDSD00_08_05.PATROL_SIGNDATE
     */
    private String patrolSigndate;
    /**
     * HDSD00_08_05.PATROL_NAME_BC
     */
    private String patrolNameBc;
    /**
     * HDSD00_08_05.PATROL_NAME_AO
     */
    private String patrolNameAo;
    /**
     * HDSD00_08_05.PATROL_NAME_AC
     */
    private String patrolNameAc;
    /**
     * HDSD00_08_05.PATROL_NAME
     */
    private String patrolName;
    /**
     * HDSD00_08_05.PATROL_DATE_BC
     */
    private String patrolDateBc;
    /**
     * HDSD00_08_05.PATROL_DATE_AO
     */
    private String patrolDateAo;
    /**
     * HDSD00_08_05.PATROL_DATE_AC
     */
    private String patrolDateAc;
    /**
     * HDSD00_08_05.PATROL_CODE_BC
     */
    private String patrolCodeBc;
    /**
     * HDSD00_08_05.PATROL_CODE_AO
     */
    private String patrolCodeAo;
    /**
     * HDSD00_08_05.PATROL_CODE_AC
     */
    private String patrolCodeAc;
    /**
     * HDSD00_08_05.PATROL_CODE
     */
    private String patrolCode;
    /**
     * HDSD00_08_05.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_08_05.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_08_05.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_08_05.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_08_05.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_08_05.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_08_05.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_08_05.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_08_05.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_08_05.OPER_GOOD_BC
     */
    private String operGoodBc;
    /**
     * HDSD00_08_05.OPER_GOOD_AO
     */
    private String operGoodAo;
    /**
     * HDSD00_08_05.OPER_GOOD_AC
     */
    private String operGoodAc;
    /**
     * HDSD00_08_05.NURSING_TYPECODE
     */
    private String nursingTypecode;
    /**
     * HDSD00_08_05.NURSING_TYPE
     */
    private String nursingType;
    /**
     * HDSD00_08_05.NURSING_GRADECODE
     */
    private String nursingGradecode;
    /**
     * HDSD00_08_05.NURSING_GRADE
     */
    private String nursingGrade;
    /**
     * HDSD00_08_05.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_08_05.INSTRUMENT_SIGNDATE
     */
    private String instrumentSigndate;
    /**
     * HDSD00_08_05.INSTRUMENT_NAME
     */
    private String instrumentName;
    /**
     * HDSD00_08_05.INSTRUMENT_CODE
     */
    private String instrumentCode;
    /**
     * HDSD00_08_05.INSTITUTIONAL_INCODE
     */
    private String institutionalIncode;
    /**
     * HDSD00_08_05.INSTITUTIONAL_IN
     */
    private String institutionalIn;
    /**
     * HDSD00_08_05.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_08_05.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_08_05.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_08_05.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_08_05.HANDOVER_NURSE_SIGNDATE
     */
    private String handoverNurseSigndate;
    /**
     * HDSD00_08_05.HANDOVER_NURSECODE
     */
    private String handoverNursecode;
    /**
     * HDSD00_08_05.HANDOVER_NURSE
     */
    private String handoverNurse;
    /**
     * HDSD00_08_05.HANDOVER_DATE
     */
    private String handoverDate;
    /**
     * HDSD00_08_05.HANDOVER_CHECKUP
     */
    private String handoverCheckup;
    /**
     * HDSD00_08_05.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_08_05.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_08_05.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_08_05.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_08_05.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_08_05.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_08_05.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_08_05.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_08_05.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_08_05.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_08_05.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_08_05.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_08_05.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_08_05.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_08_05.BEFORE_CHECK_MARK
     */
    private String beforeCheckMark;
    /**
     * HDSD00_08_05.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_08_05.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_08_05.ALLERGY_HISTORY_MARK
     */
    private String allergyHistoryMark;
    /**
     * HDSD00_08_05.ALLERGY_HISTORY
     */
    private String allergyHistory;
    /**
     * HDSD00_08_05.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_08_05.AGE
     */
    private String age;
    /**
     * HDSD00_08_05.AFTER_CHECK_MARK
     */
    private String afterCheckMark;
    /**
     * HDSD00_08_05.ABO_CODE
     */
    private String aboCode;
    /**
     * HDSD00_08_05.ABO
     */
    private String abo;
    /**
     * HDSD00_08_05.GENDER
     */
    private String gender;

    /**
     * HDSD00_08_05.upload_time
     *
     * @return the value of HDSD00_08_05.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_08_05.upload_time
     *
     * @param uploadTime the value for HDSD00_08_05.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_08_05.status
     *
     * @return the value of HDSD00_08_05.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_08_05.status
     *
     * @param status the value for HDSD00_08_05.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_08_05.pk
     *
     * @return the value of HDSD00_08_05.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_08_05.pk
     *
     * @param pk the value for HDSD00_08_05.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_08_05.empi
     *
     * @return the value of HDSD00_08_05.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_08_05.empi
     *
     * @param empi the value for HDSD00_08_05.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_08_05.ENCOUNTER_ID
     *
     * @return the value of HDSD00_08_05.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_08_05.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_08_05.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_08_05.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_08_05.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_08_05.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_08_05.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_08_05.WEIGHT
     *
     * @return the value of HDSD00_08_05.WEIGHT
     */
    public String getWeight() {
        return weight;
    }

    /**
     * HDSD00_08_05.WEIGHT
     *
     * @param weight the value for HDSD00_08_05.WEIGHT
     */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /**
     * HDSD00_08_05.WARD_NAME
     *
     * @return the value of HDSD00_08_05.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_08_05.WARD_NAME
     *
     * @param wardName the value for HDSD00_08_05.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_08_05.WARD_ID
     *
     * @return the value of HDSD00_08_05.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_08_05.WARD_ID
     *
     * @param wardId the value for HDSD00_08_05.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_08_05.WARDS_NAME
     *
     * @return the value of HDSD00_08_05.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_08_05.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_08_05.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_08_05.WARDS_ID
     *
     * @return the value of HDSD00_08_05.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_08_05.WARDS_ID
     *
     * @param wardsId the value for HDSD00_08_05.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_08_05.VISIT_DATE
     *
     * @return the value of HDSD00_08_05.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_08_05.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_08_05.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_08_05.VERSION
     *
     * @return the value of HDSD00_08_05.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_08_05.VERSION
     *
     * @param version the value for HDSD00_08_05.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_08_05.SKIN_EXAM
     *
     * @return the value of HDSD00_08_05.SKIN_EXAM
     */
    public String getSkinExam() {
        return skinExam;
    }

    /**
     * HDSD00_08_05.SKIN_EXAM
     *
     * @param skinExam the value for HDSD00_08_05.SKIN_EXAM
     */
    public void setSkinExam(String skinExam) {
        this.skinExam = skinExam;
    }

    /**
     * HDSD00_08_05.SHIPPER_SIGNDATE
     *
     * @return the value of HDSD00_08_05.SHIPPER_SIGNDATE
     */
    public String getShipperSigndate() {
        return shipperSigndate;
    }

    /**
     * HDSD00_08_05.SHIPPER_SIGNDATE
     *
     * @param shipperSigndate the value for HDSD00_08_05.SHIPPER_SIGNDATE
     */
    public void setShipperSigndate(String shipperSigndate) {
        this.shipperSigndate = shipperSigndate;
    }

    /**
     * HDSD00_08_05.SHIPPER_NAME
     *
     * @return the value of HDSD00_08_05.SHIPPER_NAME
     */
    public String getShipperName() {
        return shipperName;
    }

    /**
     * HDSD00_08_05.SHIPPER_NAME
     *
     * @param shipperName the value for HDSD00_08_05.SHIPPER_NAME
     */
    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    /**
     * HDSD00_08_05.SHIPPER_CODE
     *
     * @return the value of HDSD00_08_05.SHIPPER_CODE
     */
    public String getShipperCode() {
        return shipperCode;
    }

    /**
     * HDSD00_08_05.SHIPPER_CODE
     *
     * @param shipperCode the value for HDSD00_08_05.SHIPPER_CODE
     */
    public void setShipperCode(String shipperCode) {
        this.shipperCode = shipperCode;
    }

    /**
     * HDSD00_08_05.SCRUB_NAME_BC
     *
     * @return the value of HDSD00_08_05.SCRUB_NAME_BC
     */
    public String getScrubNameBc() {
        return scrubNameBc;
    }

    /**
     * HDSD00_08_05.SCRUB_NAME_BC
     *
     * @param scrubNameBc the value for HDSD00_08_05.SCRUB_NAME_BC
     */
    public void setScrubNameBc(String scrubNameBc) {
        this.scrubNameBc = scrubNameBc;
    }

    /**
     * HDSD00_08_05.SCRUB_NAME_AO
     *
     * @return the value of HDSD00_08_05.SCRUB_NAME_AO
     */
    public String getScrubNameAo() {
        return scrubNameAo;
    }

    /**
     * HDSD00_08_05.SCRUB_NAME_AO
     *
     * @param scrubNameAo the value for HDSD00_08_05.SCRUB_NAME_AO
     */
    public void setScrubNameAo(String scrubNameAo) {
        this.scrubNameAo = scrubNameAo;
    }

    /**
     * HDSD00_08_05.SCRUB_NAME_AC
     *
     * @return the value of HDSD00_08_05.SCRUB_NAME_AC
     */
    public String getScrubNameAc() {
        return scrubNameAc;
    }

    /**
     * HDSD00_08_05.SCRUB_NAME_AC
     *
     * @param scrubNameAc the value for HDSD00_08_05.SCRUB_NAME_AC
     */
    public void setScrubNameAc(String scrubNameAc) {
        this.scrubNameAc = scrubNameAc;
    }

    /**
     * HDSD00_08_05.SCRUB_DATE_BC
     *
     * @return the value of HDSD00_08_05.SCRUB_DATE_BC
     */
    public String getScrubDateBc() {
        return scrubDateBc;
    }

    /**
     * HDSD00_08_05.SCRUB_DATE_BC
     *
     * @param scrubDateBc the value for HDSD00_08_05.SCRUB_DATE_BC
     */
    public void setScrubDateBc(String scrubDateBc) {
        this.scrubDateBc = scrubDateBc;
    }

    /**
     * HDSD00_08_05.SCRUB_DATE_AO
     *
     * @return the value of HDSD00_08_05.SCRUB_DATE_AO
     */
    public String getScrubDateAo() {
        return scrubDateAo;
    }

    /**
     * HDSD00_08_05.SCRUB_DATE_AO
     *
     * @param scrubDateAo the value for HDSD00_08_05.SCRUB_DATE_AO
     */
    public void setScrubDateAo(String scrubDateAo) {
        this.scrubDateAo = scrubDateAo;
    }

    /**
     * HDSD00_08_05.SCRUB_DATE_AC
     *
     * @return the value of HDSD00_08_05.SCRUB_DATE_AC
     */
    public String getScrubDateAc() {
        return scrubDateAc;
    }

    /**
     * HDSD00_08_05.SCRUB_DATE_AC
     *
     * @param scrubDateAc the value for HDSD00_08_05.SCRUB_DATE_AC
     */
    public void setScrubDateAc(String scrubDateAc) {
        this.scrubDateAc = scrubDateAc;
    }

    /**
     * HDSD00_08_05.SCRUB_CODE_BC
     *
     * @return the value of HDSD00_08_05.SCRUB_CODE_BC
     */
    public String getScrubCodeBc() {
        return scrubCodeBc;
    }

    /**
     * HDSD00_08_05.SCRUB_CODE_BC
     *
     * @param scrubCodeBc the value for HDSD00_08_05.SCRUB_CODE_BC
     */
    public void setScrubCodeBc(String scrubCodeBc) {
        this.scrubCodeBc = scrubCodeBc;
    }

    /**
     * HDSD00_08_05.SCRUB_CODE_AO
     *
     * @return the value of HDSD00_08_05.SCRUB_CODE_AO
     */
    public String getScrubCodeAo() {
        return scrubCodeAo;
    }

    /**
     * HDSD00_08_05.SCRUB_CODE_AO
     *
     * @param scrubCodeAo the value for HDSD00_08_05.SCRUB_CODE_AO
     */
    public void setScrubCodeAo(String scrubCodeAo) {
        this.scrubCodeAo = scrubCodeAo;
    }

    /**
     * HDSD00_08_05.SCRUB_CODE_AC
     *
     * @return the value of HDSD00_08_05.SCRUB_CODE_AC
     */
    public String getScrubCodeAc() {
        return scrubCodeAc;
    }

    /**
     * HDSD00_08_05.SCRUB_CODE_AC
     *
     * @param scrubCodeAc the value for HDSD00_08_05.SCRUB_CODE_AC
     */
    public void setScrubCodeAc(String scrubCodeAc) {
        this.scrubCodeAc = scrubCodeAc;
    }

    /**
     * HDSD00_08_05.RH_GROUP
     *
     * @return the value of HDSD00_08_05.RH_GROUP
     */
    public String getRhGroup() {
        return rhGroup;
    }

    /**
     * HDSD00_08_05.RH_GROUP
     *
     * @param rhGroup the value for HDSD00_08_05.RH_GROUP
     */
    public void setRhGroup(String rhGroup) {
        this.rhGroup = rhGroup;
    }

    /**
     * HDSD00_08_05.RH_CODE
     *
     * @return the value of HDSD00_08_05.RH_CODE
     */
    public String getRhCode() {
        return rhCode;
    }

    /**
     * HDSD00_08_05.RH_CODE
     *
     * @param rhCode the value for HDSD00_08_05.RH_CODE
     */
    public void setRhCode(String rhCode) {
        this.rhCode = rhCode;
    }

    /**
     * HDSD00_08_05.REPORT_TITLE
     *
     * @return the value of HDSD00_08_05.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_08_05.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_08_05.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_08_05.PREOPERATIVE_COUNTING_MARK
     *
     * @return the value of HDSD00_08_05.PREOPERATIVE_COUNTING_MARK
     */
    public String getPreoperativeCountingMark() {
        return preoperativeCountingMark;
    }

    /**
     * HDSD00_08_05.PREOPERATIVE_COUNTING_MARK
     *
     * @param preoperativeCountingMark the value for HDSD00_08_05.PREOPERATIVE_COUNTING_MARK
     */
    public void setPreoperativeCountingMark(String preoperativeCountingMark) {
        this.preoperativeCountingMark = preoperativeCountingMark;
    }

    /**
     * HDSD00_08_05.PATROL_SIGNDATE
     *
     * @return the value of HDSD00_08_05.PATROL_SIGNDATE
     */
    public String getPatrolSigndate() {
        return patrolSigndate;
    }

    /**
     * HDSD00_08_05.PATROL_SIGNDATE
     *
     * @param patrolSigndate the value for HDSD00_08_05.PATROL_SIGNDATE
     */
    public void setPatrolSigndate(String patrolSigndate) {
        this.patrolSigndate = patrolSigndate;
    }

    /**
     * HDSD00_08_05.PATROL_NAME_BC
     *
     * @return the value of HDSD00_08_05.PATROL_NAME_BC
     */
    public String getPatrolNameBc() {
        return patrolNameBc;
    }

    /**
     * HDSD00_08_05.PATROL_NAME_BC
     *
     * @param patrolNameBc the value for HDSD00_08_05.PATROL_NAME_BC
     */
    public void setPatrolNameBc(String patrolNameBc) {
        this.patrolNameBc = patrolNameBc;
    }

    /**
     * HDSD00_08_05.PATROL_NAME_AO
     *
     * @return the value of HDSD00_08_05.PATROL_NAME_AO
     */
    public String getPatrolNameAo() {
        return patrolNameAo;
    }

    /**
     * HDSD00_08_05.PATROL_NAME_AO
     *
     * @param patrolNameAo the value for HDSD00_08_05.PATROL_NAME_AO
     */
    public void setPatrolNameAo(String patrolNameAo) {
        this.patrolNameAo = patrolNameAo;
    }

    /**
     * HDSD00_08_05.PATROL_NAME_AC
     *
     * @return the value of HDSD00_08_05.PATROL_NAME_AC
     */
    public String getPatrolNameAc() {
        return patrolNameAc;
    }

    /**
     * HDSD00_08_05.PATROL_NAME_AC
     *
     * @param patrolNameAc the value for HDSD00_08_05.PATROL_NAME_AC
     */
    public void setPatrolNameAc(String patrolNameAc) {
        this.patrolNameAc = patrolNameAc;
    }

    /**
     * HDSD00_08_05.PATROL_NAME
     *
     * @return the value of HDSD00_08_05.PATROL_NAME
     */
    public String getPatrolName() {
        return patrolName;
    }

    /**
     * HDSD00_08_05.PATROL_NAME
     *
     * @param patrolName the value for HDSD00_08_05.PATROL_NAME
     */
    public void setPatrolName(String patrolName) {
        this.patrolName = patrolName;
    }

    /**
     * HDSD00_08_05.PATROL_DATE_BC
     *
     * @return the value of HDSD00_08_05.PATROL_DATE_BC
     */
    public String getPatrolDateBc() {
        return patrolDateBc;
    }

    /**
     * HDSD00_08_05.PATROL_DATE_BC
     *
     * @param patrolDateBc the value for HDSD00_08_05.PATROL_DATE_BC
     */
    public void setPatrolDateBc(String patrolDateBc) {
        this.patrolDateBc = patrolDateBc;
    }

    /**
     * HDSD00_08_05.PATROL_DATE_AO
     *
     * @return the value of HDSD00_08_05.PATROL_DATE_AO
     */
    public String getPatrolDateAo() {
        return patrolDateAo;
    }

    /**
     * HDSD00_08_05.PATROL_DATE_AO
     *
     * @param patrolDateAo the value for HDSD00_08_05.PATROL_DATE_AO
     */
    public void setPatrolDateAo(String patrolDateAo) {
        this.patrolDateAo = patrolDateAo;
    }

    /**
     * HDSD00_08_05.PATROL_DATE_AC
     *
     * @return the value of HDSD00_08_05.PATROL_DATE_AC
     */
    public String getPatrolDateAc() {
        return patrolDateAc;
    }

    /**
     * HDSD00_08_05.PATROL_DATE_AC
     *
     * @param patrolDateAc the value for HDSD00_08_05.PATROL_DATE_AC
     */
    public void setPatrolDateAc(String patrolDateAc) {
        this.patrolDateAc = patrolDateAc;
    }

    /**
     * HDSD00_08_05.PATROL_CODE_BC
     *
     * @return the value of HDSD00_08_05.PATROL_CODE_BC
     */
    public String getPatrolCodeBc() {
        return patrolCodeBc;
    }

    /**
     * HDSD00_08_05.PATROL_CODE_BC
     *
     * @param patrolCodeBc the value for HDSD00_08_05.PATROL_CODE_BC
     */
    public void setPatrolCodeBc(String patrolCodeBc) {
        this.patrolCodeBc = patrolCodeBc;
    }

    /**
     * HDSD00_08_05.PATROL_CODE_AO
     *
     * @return the value of HDSD00_08_05.PATROL_CODE_AO
     */
    public String getPatrolCodeAo() {
        return patrolCodeAo;
    }

    /**
     * HDSD00_08_05.PATROL_CODE_AO
     *
     * @param patrolCodeAo the value for HDSD00_08_05.PATROL_CODE_AO
     */
    public void setPatrolCodeAo(String patrolCodeAo) {
        this.patrolCodeAo = patrolCodeAo;
    }

    /**
     * HDSD00_08_05.PATROL_CODE_AC
     *
     * @return the value of HDSD00_08_05.PATROL_CODE_AC
     */
    public String getPatrolCodeAc() {
        return patrolCodeAc;
    }

    /**
     * HDSD00_08_05.PATROL_CODE_AC
     *
     * @param patrolCodeAc the value for HDSD00_08_05.PATROL_CODE_AC
     */
    public void setPatrolCodeAc(String patrolCodeAc) {
        this.patrolCodeAc = patrolCodeAc;
    }

    /**
     * HDSD00_08_05.PATROL_CODE
     *
     * @return the value of HDSD00_08_05.PATROL_CODE
     */
    public String getPatrolCode() {
        return patrolCode;
    }

    /**
     * HDSD00_08_05.PATROL_CODE
     *
     * @param patrolCode the value for HDSD00_08_05.PATROL_CODE
     */
    public void setPatrolCode(String patrolCode) {
        this.patrolCode = patrolCode;
    }

    /**
     * HDSD00_08_05.PATIENT_NAME
     *
     * @return the value of HDSD00_08_05.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_08_05.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_08_05.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_08_05.PATIENT_TYPE
     *
     * @return the value of HDSD00_08_05.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_08_05.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_08_05.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_08_05.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_08_05.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_08_05.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_08_05.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_08_05.VISIT_TIMES
     *
     * @return the value of HDSD00_08_05.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_08_05.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_08_05.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_08_05.VISIT_ID
     *
     * @return the value of HDSD00_08_05.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_08_05.VISIT_ID
     *
     * @param visitId the value for HDSD00_08_05.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_08_05.VISIT_DOMAIN
     *
     * @return the value of HDSD00_08_05.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_08_05.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_08_05.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_08_05.PATIENT_ID
     *
     * @return the value of HDSD00_08_05.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_08_05.PATIENT_ID
     *
     * @param patientId the value for HDSD00_08_05.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_08_05.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_08_05.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_08_05.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_08_05.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_08_05.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_08_05.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_08_05.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_08_05.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_08_05.OPER_GOOD_BC
     *
     * @return the value of HDSD00_08_05.OPER_GOOD_BC
     */
    public String getOperGoodBc() {
        return operGoodBc;
    }

    /**
     * HDSD00_08_05.OPER_GOOD_BC
     *
     * @param operGoodBc the value for HDSD00_08_05.OPER_GOOD_BC
     */
    public void setOperGoodBc(String operGoodBc) {
        this.operGoodBc = operGoodBc;
    }

    /**
     * HDSD00_08_05.OPER_GOOD_AO
     *
     * @return the value of HDSD00_08_05.OPER_GOOD_AO
     */
    public String getOperGoodAo() {
        return operGoodAo;
    }

    /**
     * HDSD00_08_05.OPER_GOOD_AO
     *
     * @param operGoodAo the value for HDSD00_08_05.OPER_GOOD_AO
     */
    public void setOperGoodAo(String operGoodAo) {
        this.operGoodAo = operGoodAo;
    }

    /**
     * HDSD00_08_05.OPER_GOOD_AC
     *
     * @return the value of HDSD00_08_05.OPER_GOOD_AC
     */
    public String getOperGoodAc() {
        return operGoodAc;
    }

    /**
     * HDSD00_08_05.OPER_GOOD_AC
     *
     * @param operGoodAc the value for HDSD00_08_05.OPER_GOOD_AC
     */
    public void setOperGoodAc(String operGoodAc) {
        this.operGoodAc = operGoodAc;
    }

    /**
     * HDSD00_08_05.NURSING_TYPECODE
     *
     * @return the value of HDSD00_08_05.NURSING_TYPECODE
     */
    public String getNursingTypecode() {
        return nursingTypecode;
    }

    /**
     * HDSD00_08_05.NURSING_TYPECODE
     *
     * @param nursingTypecode the value for HDSD00_08_05.NURSING_TYPECODE
     */
    public void setNursingTypecode(String nursingTypecode) {
        this.nursingTypecode = nursingTypecode;
    }

    /**
     * HDSD00_08_05.NURSING_TYPE
     *
     * @return the value of HDSD00_08_05.NURSING_TYPE
     */
    public String getNursingType() {
        return nursingType;
    }

    /**
     * HDSD00_08_05.NURSING_TYPE
     *
     * @param nursingType the value for HDSD00_08_05.NURSING_TYPE
     */
    public void setNursingType(String nursingType) {
        this.nursingType = nursingType;
    }

    /**
     * HDSD00_08_05.NURSING_GRADECODE
     *
     * @return the value of HDSD00_08_05.NURSING_GRADECODE
     */
    public String getNursingGradecode() {
        return nursingGradecode;
    }

    /**
     * HDSD00_08_05.NURSING_GRADECODE
     *
     * @param nursingGradecode the value for HDSD00_08_05.NURSING_GRADECODE
     */
    public void setNursingGradecode(String nursingGradecode) {
        this.nursingGradecode = nursingGradecode;
    }

    /**
     * HDSD00_08_05.NURSING_GRADE
     *
     * @return the value of HDSD00_08_05.NURSING_GRADE
     */
    public String getNursingGrade() {
        return nursingGrade;
    }

    /**
     * HDSD00_08_05.NURSING_GRADE
     *
     * @param nursingGrade the value for HDSD00_08_05.NURSING_GRADE
     */
    public void setNursingGrade(String nursingGrade) {
        this.nursingGrade = nursingGrade;
    }

    /**
     * HDSD00_08_05.LOAD_TYPE
     *
     * @return the value of HDSD00_08_05.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_08_05.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_08_05.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_08_05.INSTRUMENT_SIGNDATE
     *
     * @return the value of HDSD00_08_05.INSTRUMENT_SIGNDATE
     */
    public String getInstrumentSigndate() {
        return instrumentSigndate;
    }

    /**
     * HDSD00_08_05.INSTRUMENT_SIGNDATE
     *
     * @param instrumentSigndate the value for HDSD00_08_05.INSTRUMENT_SIGNDATE
     */
    public void setInstrumentSigndate(String instrumentSigndate) {
        this.instrumentSigndate = instrumentSigndate;
    }

    /**
     * HDSD00_08_05.INSTRUMENT_NAME
     *
     * @return the value of HDSD00_08_05.INSTRUMENT_NAME
     */
    public String getInstrumentName() {
        return instrumentName;
    }

    /**
     * HDSD00_08_05.INSTRUMENT_NAME
     *
     * @param instrumentName the value for HDSD00_08_05.INSTRUMENT_NAME
     */
    public void setInstrumentName(String instrumentName) {
        this.instrumentName = instrumentName;
    }

    /**
     * HDSD00_08_05.INSTRUMENT_CODE
     *
     * @return the value of HDSD00_08_05.INSTRUMENT_CODE
     */
    public String getInstrumentCode() {
        return instrumentCode;
    }

    /**
     * HDSD00_08_05.INSTRUMENT_CODE
     *
     * @param instrumentCode the value for HDSD00_08_05.INSTRUMENT_CODE
     */
    public void setInstrumentCode(String instrumentCode) {
        this.instrumentCode = instrumentCode;
    }

    /**
     * HDSD00_08_05.INSTITUTIONAL_INCODE
     *
     * @return the value of HDSD00_08_05.INSTITUTIONAL_INCODE
     */
    public String getInstitutionalIncode() {
        return institutionalIncode;
    }

    /**
     * HDSD00_08_05.INSTITUTIONAL_INCODE
     *
     * @param institutionalIncode the value for HDSD00_08_05.INSTITUTIONAL_INCODE
     */
    public void setInstitutionalIncode(String institutionalIncode) {
        this.institutionalIncode = institutionalIncode;
    }

    /**
     * HDSD00_08_05.INSTITUTIONAL_IN
     *
     * @return the value of HDSD00_08_05.INSTITUTIONAL_IN
     */
    public String getInstitutionalIn() {
        return institutionalIn;
    }

    /**
     * HDSD00_08_05.INSTITUTIONAL_IN
     *
     * @param institutionalIn the value for HDSD00_08_05.INSTITUTIONAL_IN
     */
    public void setInstitutionalIn(String institutionalIn) {
        this.institutionalIn = institutionalIn;
    }

    /**
     * HDSD00_08_05.INPATIENT
     *
     * @return the value of HDSD00_08_05.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_08_05.INPATIENT
     *
     * @param inpatient the value for HDSD00_08_05.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_08_05.ID_NUM
     *
     * @return the value of HDSD00_08_05.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_08_05.ID_NUM
     *
     * @param idNum the value for HDSD00_08_05.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_08_05.HOSPITAL_NAME
     *
     * @return the value of HDSD00_08_05.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_08_05.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_08_05.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_08_05.HOSPITAL_CODE
     *
     * @return the value of HDSD00_08_05.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_08_05.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_08_05.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_08_05.HANDOVER_NURSE_SIGNDATE
     *
     * @return the value of HDSD00_08_05.HANDOVER_NURSE_SIGNDATE
     */
    public String getHandoverNurseSigndate() {
        return handoverNurseSigndate;
    }

    /**
     * HDSD00_08_05.HANDOVER_NURSE_SIGNDATE
     *
     * @param handoverNurseSigndate the value for HDSD00_08_05.HANDOVER_NURSE_SIGNDATE
     */
    public void setHandoverNurseSigndate(String handoverNurseSigndate) {
        this.handoverNurseSigndate = handoverNurseSigndate;
    }

    /**
     * HDSD00_08_05.HANDOVER_NURSECODE
     *
     * @return the value of HDSD00_08_05.HANDOVER_NURSECODE
     */
    public String getHandoverNursecode() {
        return handoverNursecode;
    }

    /**
     * HDSD00_08_05.HANDOVER_NURSECODE
     *
     * @param handoverNursecode the value for HDSD00_08_05.HANDOVER_NURSECODE
     */
    public void setHandoverNursecode(String handoverNursecode) {
        this.handoverNursecode = handoverNursecode;
    }

    /**
     * HDSD00_08_05.HANDOVER_NURSE
     *
     * @return the value of HDSD00_08_05.HANDOVER_NURSE
     */
    public String getHandoverNurse() {
        return handoverNurse;
    }

    /**
     * HDSD00_08_05.HANDOVER_NURSE
     *
     * @param handoverNurse the value for HDSD00_08_05.HANDOVER_NURSE
     */
    public void setHandoverNurse(String handoverNurse) {
        this.handoverNurse = handoverNurse;
    }

    /**
     * HDSD00_08_05.HANDOVER_DATE
     *
     * @return the value of HDSD00_08_05.HANDOVER_DATE
     */
    public String getHandoverDate() {
        return handoverDate;
    }

    /**
     * HDSD00_08_05.HANDOVER_DATE
     *
     * @param handoverDate the value for HDSD00_08_05.HANDOVER_DATE
     */
    public void setHandoverDate(String handoverDate) {
        this.handoverDate = handoverDate;
    }

    /**
     * HDSD00_08_05.HANDOVER_CHECKUP
     *
     * @return the value of HDSD00_08_05.HANDOVER_CHECKUP
     */
    public String getHandoverCheckup() {
        return handoverCheckup;
    }

    /**
     * HDSD00_08_05.HANDOVER_CHECKUP
     *
     * @param handoverCheckup the value for HDSD00_08_05.HANDOVER_CHECKUP
     */
    public void setHandoverCheckup(String handoverCheckup) {
        this.handoverCheckup = handoverCheckup;
    }

    /**
     * HDSD00_08_05.GENDER_CODE
     *
     * @return the value of HDSD00_08_05.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_08_05.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_08_05.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_08_05.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_08_05.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_08_05.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_08_05.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_08_05.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_08_05.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_08_05.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_08_05.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_08_05.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_08_05.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_08_05.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_08_05.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_08_05.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_08_05.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_08_05.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_08_05.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_08_05.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_08_05.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_08_05.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_08_05.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_08_05.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_08_05.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_08_05.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_08_05.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_08_05.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_08_05.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_08_05.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_08_05.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_08_05.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_08_05.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_08_05.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_08_05.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_08_05.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_08_05.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_08_05.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_08_05.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_08_05.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_08_05.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_08_05.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_08_05.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_08_05.DOC_AUTHOR
     *
     * @return the value of HDSD00_08_05.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_08_05.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_08_05.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_08_05.DEPT_NAME
     *
     * @return the value of HDSD00_08_05.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_08_05.DEPT_NAME
     *
     * @param deptName the value for HDSD00_08_05.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_08_05.DEPT_CODE
     *
     * @return the value of HDSD00_08_05.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_08_05.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_08_05.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_08_05.BEFORE_CHECK_MARK
     *
     * @return the value of HDSD00_08_05.BEFORE_CHECK_MARK
     */
    public String getBeforeCheckMark() {
        return beforeCheckMark;
    }

    /**
     * HDSD00_08_05.BEFORE_CHECK_MARK
     *
     * @param beforeCheckMark the value for HDSD00_08_05.BEFORE_CHECK_MARK
     */
    public void setBeforeCheckMark(String beforeCheckMark) {
        this.beforeCheckMark = beforeCheckMark;
    }

    /**
     * HDSD00_08_05.BED_NO
     *
     * @return the value of HDSD00_08_05.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_08_05.BED_NO
     *
     * @param bedNo the value for HDSD00_08_05.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_08_05.BED_NAME
     *
     * @return the value of HDSD00_08_05.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_08_05.BED_NAME
     *
     * @param bedName the value for HDSD00_08_05.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_08_05.ALLERGY_HISTORY_MARK
     *
     * @return the value of HDSD00_08_05.ALLERGY_HISTORY_MARK
     */
    public String getAllergyHistoryMark() {
        return allergyHistoryMark;
    }

    /**
     * HDSD00_08_05.ALLERGY_HISTORY_MARK
     *
     * @param allergyHistoryMark the value for HDSD00_08_05.ALLERGY_HISTORY_MARK
     */
    public void setAllergyHistoryMark(String allergyHistoryMark) {
        this.allergyHistoryMark = allergyHistoryMark;
    }

    /**
     * HDSD00_08_05.ALLERGY_HISTORY
     *
     * @return the value of HDSD00_08_05.ALLERGY_HISTORY
     */
    public String getAllergyHistory() {
        return allergyHistory;
    }

    /**
     * HDSD00_08_05.ALLERGY_HISTORY
     *
     * @param allergyHistory the value for HDSD00_08_05.ALLERGY_HISTORY
     */
    public void setAllergyHistory(String allergyHistory) {
        this.allergyHistory = allergyHistory;
    }

    /**
     * HDSD00_08_05.AGE_UNIT
     *
     * @return the value of HDSD00_08_05.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_08_05.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_08_05.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_08_05.AGE
     *
     * @return the value of HDSD00_08_05.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_08_05.AGE
     *
     * @param age the value for HDSD00_08_05.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_08_05.AFTER_CHECK_MARK
     *
     * @return the value of HDSD00_08_05.AFTER_CHECK_MARK
     */
    public String getAfterCheckMark() {
        return afterCheckMark;
    }

    /**
     * HDSD00_08_05.AFTER_CHECK_MARK
     *
     * @param afterCheckMark the value for HDSD00_08_05.AFTER_CHECK_MARK
     */
    public void setAfterCheckMark(String afterCheckMark) {
        this.afterCheckMark = afterCheckMark;
    }

    /**
     * HDSD00_08_05.ABO_CODE
     *
     * @return the value of HDSD00_08_05.ABO_CODE
     */
    public String getAboCode() {
        return aboCode;
    }

    /**
     * HDSD00_08_05.ABO_CODE
     *
     * @param aboCode the value for HDSD00_08_05.ABO_CODE
     */
    public void setAboCode(String aboCode) {
        this.aboCode = aboCode;
    }

    /**
     * HDSD00_08_05.ABO
     *
     * @return the value of HDSD00_08_05.ABO
     */
    public String getAbo() {
        return abo;
    }

    /**
     * HDSD00_08_05.ABO
     *
     * @param abo the value for HDSD00_08_05.ABO
     */
    public void setAbo(String abo) {
        this.abo = abo;
    }

    /**
     * HDSD00_08_05.GENDER
     *
     * @return the value of HDSD00_08_05.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_08_05.GENDER
     *
     * @param gender the value for HDSD00_08_05.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}