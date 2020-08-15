package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("HDSD00_14_07")
public class Hdsd001407 extends BaseBean implements Serializable {
    /**
     * This field corresponds to the database table HDSD00_14_07
     */
    private static final long serialVersionUID = 1L;
    /**
     * HDSD00_14_07.upload_time
     */
    private Date uploadTime;
    /**
     * HDSD00_14_07.status
     */
    private String status;
    /**
     * HDSD00_14_07.pk
     */
    private Integer pk;
    /**
     * HDSD00_14_07.empi
     */
    private String empi;
    /**
     * HDSD00_14_07.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * HDSD00_14_07.DOC_DOMAIN_ID
     */
    private String docDomainId;
    /**
     * HDSD00_14_07.WARD_NAME
     */
    private String wardName;
    /**
     * HDSD00_14_07.WARD_ID
     */
    private String wardId;
    /**
     * HDSD00_14_07.WARDS_NAME
     */
    private String wardsName;
    /**
     * HDSD00_14_07.WARDS_ID
     */
    private String wardsId;
    /**
     * HDSD00_14_07.VERSION
     */
    private String version;
    /**
     * HDSD00_14_07.TPC_MNAME
     */
    private String tpcMname;
    /**
     * HDSD00_14_07.TPC_MCODE
     */
    private String tpcMcode;
    /**
     * HDSD00_14_07.TPC_INAME
     */
    private String tpcIname;
    /**
     * HDSD00_14_07.TPC_ICODE
     */
    private String tpcIcode;
    /**
     * HDSD00_14_07.TPC_DNAME
     */
    private String tpcDname;
    /**
     * HDSD00_14_07.TPC_DCODE
     */
    private String tpcDcode;
    /**
     * HDSD00_14_07.RESIDENT_SIGNDATE
     */
    private String residentSigndate;
    /**
     * HDSD00_14_07.RESIDENT_NAME
     */
    private String residentName;
    /**
     * HDSD00_14_07.RESIDENT_CODE
     */
    private String residentCode;
    /**
     * HDSD00_14_07.REPORT_TITLE
     */
    private String reportTitle;
    /**
     * HDSD00_14_07.PATIENT_NAME
     */
    private String patientName;
    /**
     * HDSD00_14_07.PATIENT_TYPE
     */
    private String patientType;
    /**
     * HDSD00_14_07.PATIENT_TYPECODE
     */
    private String patientTypecode;
    /**
     * HDSD00_14_07.VISIT_TIMES
     */
    private String visitTimes;
    /**
     * HDSD00_14_07.VISIT_ID
     */
    private String visitId;
    /**
     * HDSD00_14_07.VISIT_DOMAIN
     */
    private String visitDomain;
    /**
     * HDSD00_14_07.PATIENT_ID
     */
    private String patientId;
    /**
     * HDSD00_14_07.PATIENT_DOMAIN
     */
    private String patientDomain;
    /**
     * HDSD00_14_07.DOC_CUSTODIAN
     */
    private String docCustodian;
    /**
     * HDSD00_14_07.DOC_CUSTODIANCODE
     */
    private String docCustodiancode;
    /**
     * HDSD00_14_07.LOAD_TYPE
     */
    private String loadType;
    /**
     * HDSD00_14_07.HOSPITAL_NAME
     */
    private String hospitalName;
    /**
     * HDSD00_14_07.HOSPITAL_CODE
     */
    private String hospitalCode;
    /**
     * HDSD00_14_07.INPATIENT
     */
    private String inpatient;
    /**
     * HDSD00_14_07.ID_NUM
     */
    private String idNum;
    /**
     * HDSD00_14_07.HOST_NAME
     */
    private String hostName;
    /**
     * HDSD00_14_07.HOST_CONCLUDING
     */
    private String hostConcluding;
    /**
     * HDSD00_14_07.HOST_CODE
     */
    private String hostCode;
    /**
     * HDSD00_14_07.GENDER_CODE
     */
    private String genderCode;
    /**
     * HDSD00_14_07.DOC_WRITING_TIME
     */
    private String docWritingTime;
    /**
     * HDSD00_14_07.DOC_TEMPLATE_OID
     */
    private String docTemplateOid;
    /**
     * HDSD00_14_07.DOC_REGISTR_MODEL
     */
    private String docRegistrModel;
    /**
     * HDSD00_14_07.DOC_PIPELINE_ID
     */
    private String docPipelineId;
    /**
     * HDSD00_14_07.DOC_EFFECTIVE_TIME
     */
    private String docEffectiveTime;
    /**
     * HDSD00_14_07.DOC_CRYPTOGRAPHICCODE
     */
    private String docCryptographiccode;
    /**
     * HDSD00_14_07.DOC_CRYPTOGRAPHIC
     */
    private String docCryptographic;
    /**
     * HDSD00_14_07.DOC_AUTHORCODE
     */
    private String docAuthorcode;
    /**
     * HDSD00_14_07.DOC_AUTHOR
     */
    private String docAuthor;
    /**
     * HDSD00_14_07.DISCUSSION_PLACE
     */
    private String discussionPlace;
    /**
     * HDSD00_14_07.DISCUSSION_LIST
     */
    private String discussionList;
    /**
     * HDSD00_14_07.DIRECT_DEATHCODE
     */
    private String directDeathcode;
    /**
     * HDSD00_14_07.DIRECT_DEATH
     */
    private String directDeath;
    /**
     * HDSD00_14_07.DEPT_NAME
     */
    private String deptName;
    /**
     * HDSD00_14_07.DEPT_CODE
     */
    private String deptCode;
    /**
     * HDSD00_14_07.DEATH_DISCUSSION
     */
    private String deathDiscussion;
    /**
     * HDSD00_14_07.DATEOF_DISCUSSION
     */
    private String dateofDiscussion;
    /**
     * HDSD00_14_07.CHIEF_SIGN_NAME
     */
    private String chiefSignName;
    /**
     * HDSD00_14_07.CHIEF_NAME
     */
    private String chiefName;
    /**
     * HDSD00_14_07.CHIEF_CODE
     */
    private String chiefCode;
    /**
     * HDSD00_14_07.BED_NO
     */
    private String bedNo;
    /**
     * HDSD00_14_07.BED_NAME
     */
    private String bedName;
    /**
     * HDSD00_14_07.ATTENDING_SIGNDATE
     */
    private String attendingSigndate;
    /**
     * HDSD00_14_07.ATTENDING_NAME
     */
    private String attendingName;
    /**
     * HDSD00_14_07.ATTENDING_CODE
     */
    private String attendingCode;
    /**
     * HDSD00_14_07.AGE
     */
    private String age;
    /**
     * HDSD00_14_07.AGE_UNIT
     */
    private String ageUnit;
    /**
     * HDSD00_14_07.VISIT_DATE
     */
    private String visitDate;
    /**
     * HDSD00_14_07.OUT_PATIENT_ID
     */
    private String outPatientId;
    /**
     * HDSD00_14_07.GENDER
     */
    private String gender;

    /**
     * HDSD00_14_07.upload_time
     *
     * @return the value of HDSD00_14_07.upload_time
     */
    public Date getUploadTime() {
        return uploadTime;
    }

    /**
     * HDSD00_14_07.upload_time
     *
     * @param uploadTime the value for HDSD00_14_07.upload_time
     */
    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    /**
     * HDSD00_14_07.status
     *
     * @return the value of HDSD00_14_07.status
     */
    public String getStatus() {
        return status;
    }

    /**
     * HDSD00_14_07.status
     *
     * @param status the value for HDSD00_14_07.status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * HDSD00_14_07.pk
     *
     * @return the value of HDSD00_14_07.pk
     */
    public Integer getPk() {
        return pk;
    }

    /**
     * HDSD00_14_07.pk
     *
     * @param pk the value for HDSD00_14_07.pk
     */
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    /**
     * HDSD00_14_07.empi
     *
     * @return the value of HDSD00_14_07.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * HDSD00_14_07.empi
     *
     * @param empi the value for HDSD00_14_07.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * HDSD00_14_07.ENCOUNTER_ID
     *
     * @return the value of HDSD00_14_07.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * HDSD00_14_07.ENCOUNTER_ID
     *
     * @param encounterId the value for HDSD00_14_07.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * HDSD00_14_07.DOC_DOMAIN_ID
     *
     * @return the value of HDSD00_14_07.DOC_DOMAIN_ID
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * HDSD00_14_07.DOC_DOMAIN_ID
     *
     * @param docDomainId the value for HDSD00_14_07.DOC_DOMAIN_ID
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * HDSD00_14_07.WARD_NAME
     *
     * @return the value of HDSD00_14_07.WARD_NAME
     */
    public String getWardName() {
        return wardName;
    }

    /**
     * HDSD00_14_07.WARD_NAME
     *
     * @param wardName the value for HDSD00_14_07.WARD_NAME
     */
    public void setWardName(String wardName) {
        this.wardName = wardName;
    }

    /**
     * HDSD00_14_07.WARD_ID
     *
     * @return the value of HDSD00_14_07.WARD_ID
     */
    public String getWardId() {
        return wardId;
    }

    /**
     * HDSD00_14_07.WARD_ID
     *
     * @param wardId the value for HDSD00_14_07.WARD_ID
     */
    public void setWardId(String wardId) {
        this.wardId = wardId;
    }

    /**
     * HDSD00_14_07.WARDS_NAME
     *
     * @return the value of HDSD00_14_07.WARDS_NAME
     */
    public String getWardsName() {
        return wardsName;
    }

    /**
     * HDSD00_14_07.WARDS_NAME
     *
     * @param wardsName the value for HDSD00_14_07.WARDS_NAME
     */
    public void setWardsName(String wardsName) {
        this.wardsName = wardsName;
    }

    /**
     * HDSD00_14_07.WARDS_ID
     *
     * @return the value of HDSD00_14_07.WARDS_ID
     */
    public String getWardsId() {
        return wardsId;
    }

    /**
     * HDSD00_14_07.WARDS_ID
     *
     * @param wardsId the value for HDSD00_14_07.WARDS_ID
     */
    public void setWardsId(String wardsId) {
        this.wardsId = wardsId;
    }

    /**
     * HDSD00_14_07.VERSION
     *
     * @return the value of HDSD00_14_07.VERSION
     */
    public String getVersion() {
        return version;
    }

    /**
     * HDSD00_14_07.VERSION
     *
     * @param version the value for HDSD00_14_07.VERSION
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * HDSD00_14_07.TPC_MNAME
     *
     * @return the value of HDSD00_14_07.TPC_MNAME
     */
    public String getTpcMname() {
        return tpcMname;
    }

    /**
     * HDSD00_14_07.TPC_MNAME
     *
     * @param tpcMname the value for HDSD00_14_07.TPC_MNAME
     */
    public void setTpcMname(String tpcMname) {
        this.tpcMname = tpcMname;
    }

    /**
     * HDSD00_14_07.TPC_MCODE
     *
     * @return the value of HDSD00_14_07.TPC_MCODE
     */
    public String getTpcMcode() {
        return tpcMcode;
    }

    /**
     * HDSD00_14_07.TPC_MCODE
     *
     * @param tpcMcode the value for HDSD00_14_07.TPC_MCODE
     */
    public void setTpcMcode(String tpcMcode) {
        this.tpcMcode = tpcMcode;
    }

    /**
     * HDSD00_14_07.TPC_INAME
     *
     * @return the value of HDSD00_14_07.TPC_INAME
     */
    public String getTpcIname() {
        return tpcIname;
    }

    /**
     * HDSD00_14_07.TPC_INAME
     *
     * @param tpcIname the value for HDSD00_14_07.TPC_INAME
     */
    public void setTpcIname(String tpcIname) {
        this.tpcIname = tpcIname;
    }

    /**
     * HDSD00_14_07.TPC_ICODE
     *
     * @return the value of HDSD00_14_07.TPC_ICODE
     */
    public String getTpcIcode() {
        return tpcIcode;
    }

    /**
     * HDSD00_14_07.TPC_ICODE
     *
     * @param tpcIcode the value for HDSD00_14_07.TPC_ICODE
     */
    public void setTpcIcode(String tpcIcode) {
        this.tpcIcode = tpcIcode;
    }

    /**
     * HDSD00_14_07.TPC_DNAME
     *
     * @return the value of HDSD00_14_07.TPC_DNAME
     */
    public String getTpcDname() {
        return tpcDname;
    }

    /**
     * HDSD00_14_07.TPC_DNAME
     *
     * @param tpcDname the value for HDSD00_14_07.TPC_DNAME
     */
    public void setTpcDname(String tpcDname) {
        this.tpcDname = tpcDname;
    }

    /**
     * HDSD00_14_07.TPC_DCODE
     *
     * @return the value of HDSD00_14_07.TPC_DCODE
     */
    public String getTpcDcode() {
        return tpcDcode;
    }

    /**
     * HDSD00_14_07.TPC_DCODE
     *
     * @param tpcDcode the value for HDSD00_14_07.TPC_DCODE
     */
    public void setTpcDcode(String tpcDcode) {
        this.tpcDcode = tpcDcode;
    }

    /**
     * HDSD00_14_07.RESIDENT_SIGNDATE
     *
     * @return the value of HDSD00_14_07.RESIDENT_SIGNDATE
     */
    public String getResidentSigndate() {
        return residentSigndate;
    }

    /**
     * HDSD00_14_07.RESIDENT_SIGNDATE
     *
     * @param residentSigndate the value for HDSD00_14_07.RESIDENT_SIGNDATE
     */
    public void setResidentSigndate(String residentSigndate) {
        this.residentSigndate = residentSigndate;
    }

    /**
     * HDSD00_14_07.RESIDENT_NAME
     *
     * @return the value of HDSD00_14_07.RESIDENT_NAME
     */
    public String getResidentName() {
        return residentName;
    }

    /**
     * HDSD00_14_07.RESIDENT_NAME
     *
     * @param residentName the value for HDSD00_14_07.RESIDENT_NAME
     */
    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    /**
     * HDSD00_14_07.RESIDENT_CODE
     *
     * @return the value of HDSD00_14_07.RESIDENT_CODE
     */
    public String getResidentCode() {
        return residentCode;
    }

    /**
     * HDSD00_14_07.RESIDENT_CODE
     *
     * @param residentCode the value for HDSD00_14_07.RESIDENT_CODE
     */
    public void setResidentCode(String residentCode) {
        this.residentCode = residentCode;
    }

    /**
     * HDSD00_14_07.REPORT_TITLE
     *
     * @return the value of HDSD00_14_07.REPORT_TITLE
     */
    public String getReportTitle() {
        return reportTitle;
    }

    /**
     * HDSD00_14_07.REPORT_TITLE
     *
     * @param reportTitle the value for HDSD00_14_07.REPORT_TITLE
     */
    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    /**
     * HDSD00_14_07.PATIENT_NAME
     *
     * @return the value of HDSD00_14_07.PATIENT_NAME
     */
    public String getPatientName() {
        return patientName;
    }

    /**
     * HDSD00_14_07.PATIENT_NAME
     *
     * @param patientName the value for HDSD00_14_07.PATIENT_NAME
     */
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    /**
     * HDSD00_14_07.PATIENT_TYPE
     *
     * @return the value of HDSD00_14_07.PATIENT_TYPE
     */
    public String getPatientType() {
        return patientType;
    }

    /**
     * HDSD00_14_07.PATIENT_TYPE
     *
     * @param patientType the value for HDSD00_14_07.PATIENT_TYPE
     */
    public void setPatientType(String patientType) {
        this.patientType = patientType;
    }

    /**
     * HDSD00_14_07.PATIENT_TYPECODE
     *
     * @return the value of HDSD00_14_07.PATIENT_TYPECODE
     */
    public String getPatientTypecode() {
        return patientTypecode;
    }

    /**
     * HDSD00_14_07.PATIENT_TYPECODE
     *
     * @param patientTypecode the value for HDSD00_14_07.PATIENT_TYPECODE
     */
    public void setPatientTypecode(String patientTypecode) {
        this.patientTypecode = patientTypecode;
    }

    /**
     * HDSD00_14_07.VISIT_TIMES
     *
     * @return the value of HDSD00_14_07.VISIT_TIMES
     */
    public String getVisitTimes() {
        return visitTimes;
    }

    /**
     * HDSD00_14_07.VISIT_TIMES
     *
     * @param visitTimes the value for HDSD00_14_07.VISIT_TIMES
     */
    public void setVisitTimes(String visitTimes) {
        this.visitTimes = visitTimes;
    }

    /**
     * HDSD00_14_07.VISIT_ID
     *
     * @return the value of HDSD00_14_07.VISIT_ID
     */
    public String getVisitId() {
        return visitId;
    }

    /**
     * HDSD00_14_07.VISIT_ID
     *
     * @param visitId the value for HDSD00_14_07.VISIT_ID
     */
    public void setVisitId(String visitId) {
        this.visitId = visitId;
    }

    /**
     * HDSD00_14_07.VISIT_DOMAIN
     *
     * @return the value of HDSD00_14_07.VISIT_DOMAIN
     */
    public String getVisitDomain() {
        return visitDomain;
    }

    /**
     * HDSD00_14_07.VISIT_DOMAIN
     *
     * @param visitDomain the value for HDSD00_14_07.VISIT_DOMAIN
     */
    public void setVisitDomain(String visitDomain) {
        this.visitDomain = visitDomain;
    }

    /**
     * HDSD00_14_07.PATIENT_ID
     *
     * @return the value of HDSD00_14_07.PATIENT_ID
     */
    public String getPatientId() {
        return patientId;
    }

    /**
     * HDSD00_14_07.PATIENT_ID
     *
     * @param patientId the value for HDSD00_14_07.PATIENT_ID
     */
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    /**
     * HDSD00_14_07.PATIENT_DOMAIN
     *
     * @return the value of HDSD00_14_07.PATIENT_DOMAIN
     */
    public String getPatientDomain() {
        return patientDomain;
    }

    /**
     * HDSD00_14_07.PATIENT_DOMAIN
     *
     * @param patientDomain the value for HDSD00_14_07.PATIENT_DOMAIN
     */
    public void setPatientDomain(String patientDomain) {
        this.patientDomain = patientDomain;
    }

    /**
     * HDSD00_14_07.DOC_CUSTODIAN
     *
     * @return the value of HDSD00_14_07.DOC_CUSTODIAN
     */
    public String getDocCustodian() {
        return docCustodian;
    }

    /**
     * HDSD00_14_07.DOC_CUSTODIAN
     *
     * @param docCustodian the value for HDSD00_14_07.DOC_CUSTODIAN
     */
    public void setDocCustodian(String docCustodian) {
        this.docCustodian = docCustodian;
    }

    /**
     * HDSD00_14_07.DOC_CUSTODIANCODE
     *
     * @return the value of HDSD00_14_07.DOC_CUSTODIANCODE
     */
    public String getDocCustodiancode() {
        return docCustodiancode;
    }

    /**
     * HDSD00_14_07.DOC_CUSTODIANCODE
     *
     * @param docCustodiancode the value for HDSD00_14_07.DOC_CUSTODIANCODE
     */
    public void setDocCustodiancode(String docCustodiancode) {
        this.docCustodiancode = docCustodiancode;
    }

    /**
     * HDSD00_14_07.LOAD_TYPE
     *
     * @return the value of HDSD00_14_07.LOAD_TYPE
     */
    public String getLoadType() {
        return loadType;
    }

    /**
     * HDSD00_14_07.LOAD_TYPE
     *
     * @param loadType the value for HDSD00_14_07.LOAD_TYPE
     */
    public void setLoadType(String loadType) {
        this.loadType = loadType;
    }

    /**
     * HDSD00_14_07.HOSPITAL_NAME
     *
     * @return the value of HDSD00_14_07.HOSPITAL_NAME
     */
    public String getHospitalName() {
        return hospitalName;
    }

    /**
     * HDSD00_14_07.HOSPITAL_NAME
     *
     * @param hospitalName the value for HDSD00_14_07.HOSPITAL_NAME
     */
    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    /**
     * HDSD00_14_07.HOSPITAL_CODE
     *
     * @return the value of HDSD00_14_07.HOSPITAL_CODE
     */
    public String getHospitalCode() {
        return hospitalCode;
    }

    /**
     * HDSD00_14_07.HOSPITAL_CODE
     *
     * @param hospitalCode the value for HDSD00_14_07.HOSPITAL_CODE
     */
    public void setHospitalCode(String hospitalCode) {
        this.hospitalCode = hospitalCode;
    }

    /**
     * HDSD00_14_07.INPATIENT
     *
     * @return the value of HDSD00_14_07.INPATIENT
     */
    public String getInpatient() {
        return inpatient;
    }

    /**
     * HDSD00_14_07.INPATIENT
     *
     * @param inpatient the value for HDSD00_14_07.INPATIENT
     */
    public void setInpatient(String inpatient) {
        this.inpatient = inpatient;
    }

    /**
     * HDSD00_14_07.ID_NUM
     *
     * @return the value of HDSD00_14_07.ID_NUM
     */
    public String getIdNum() {
        return idNum;
    }

    /**
     * HDSD00_14_07.ID_NUM
     *
     * @param idNum the value for HDSD00_14_07.ID_NUM
     */
    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    /**
     * HDSD00_14_07.HOST_NAME
     *
     * @return the value of HDSD00_14_07.HOST_NAME
     */
    public String getHostName() {
        return hostName;
    }

    /**
     * HDSD00_14_07.HOST_NAME
     *
     * @param hostName the value for HDSD00_14_07.HOST_NAME
     */
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    /**
     * HDSD00_14_07.HOST_CONCLUDING
     *
     * @return the value of HDSD00_14_07.HOST_CONCLUDING
     */
    public String getHostConcluding() {
        return hostConcluding;
    }

    /**
     * HDSD00_14_07.HOST_CONCLUDING
     *
     * @param hostConcluding the value for HDSD00_14_07.HOST_CONCLUDING
     */
    public void setHostConcluding(String hostConcluding) {
        this.hostConcluding = hostConcluding;
    }

    /**
     * HDSD00_14_07.HOST_CODE
     *
     * @return the value of HDSD00_14_07.HOST_CODE
     */
    public String getHostCode() {
        return hostCode;
    }

    /**
     * HDSD00_14_07.HOST_CODE
     *
     * @param hostCode the value for HDSD00_14_07.HOST_CODE
     */
    public void setHostCode(String hostCode) {
        this.hostCode = hostCode;
    }

    /**
     * HDSD00_14_07.GENDER_CODE
     *
     * @return the value of HDSD00_14_07.GENDER_CODE
     */
    public String getGenderCode() {
        return genderCode;
    }

    /**
     * HDSD00_14_07.GENDER_CODE
     *
     * @param genderCode the value for HDSD00_14_07.GENDER_CODE
     */
    public void setGenderCode(String genderCode) {
        this.genderCode = genderCode;
    }

    /**
     * HDSD00_14_07.DOC_WRITING_TIME
     *
     * @return the value of HDSD00_14_07.DOC_WRITING_TIME
     */
    public String getDocWritingTime() {
        return docWritingTime;
    }

    /**
     * HDSD00_14_07.DOC_WRITING_TIME
     *
     * @param docWritingTime the value for HDSD00_14_07.DOC_WRITING_TIME
     */
    public void setDocWritingTime(String docWritingTime) {
        this.docWritingTime = docWritingTime;
    }

    /**
     * HDSD00_14_07.DOC_TEMPLATE_OID
     *
     * @return the value of HDSD00_14_07.DOC_TEMPLATE_OID
     */
    public String getDocTemplateOid() {
        return docTemplateOid;
    }

    /**
     * HDSD00_14_07.DOC_TEMPLATE_OID
     *
     * @param docTemplateOid the value for HDSD00_14_07.DOC_TEMPLATE_OID
     */
    public void setDocTemplateOid(String docTemplateOid) {
        this.docTemplateOid = docTemplateOid;
    }

    /**
     * HDSD00_14_07.DOC_REGISTR_MODEL
     *
     * @return the value of HDSD00_14_07.DOC_REGISTR_MODEL
     */
    public String getDocRegistrModel() {
        return docRegistrModel;
    }

    /**
     * HDSD00_14_07.DOC_REGISTR_MODEL
     *
     * @param docRegistrModel the value for HDSD00_14_07.DOC_REGISTR_MODEL
     */
    public void setDocRegistrModel(String docRegistrModel) {
        this.docRegistrModel = docRegistrModel;
    }

    /**
     * HDSD00_14_07.DOC_PIPELINE_ID
     *
     * @return the value of HDSD00_14_07.DOC_PIPELINE_ID
     */
    public String getDocPipelineId() {
        return docPipelineId;
    }

    /**
     * HDSD00_14_07.DOC_PIPELINE_ID
     *
     * @param docPipelineId the value for HDSD00_14_07.DOC_PIPELINE_ID
     */
    public void setDocPipelineId(String docPipelineId) {
        this.docPipelineId = docPipelineId;
    }

    /**
     * HDSD00_14_07.DOC_EFFECTIVE_TIME
     *
     * @return the value of HDSD00_14_07.DOC_EFFECTIVE_TIME
     */
    public String getDocEffectiveTime() {
        return docEffectiveTime;
    }

    /**
     * HDSD00_14_07.DOC_EFFECTIVE_TIME
     *
     * @param docEffectiveTime the value for HDSD00_14_07.DOC_EFFECTIVE_TIME
     */
    public void setDocEffectiveTime(String docEffectiveTime) {
        this.docEffectiveTime = docEffectiveTime;
    }

    /**
     * HDSD00_14_07.DOC_CRYPTOGRAPHICCODE
     *
     * @return the value of HDSD00_14_07.DOC_CRYPTOGRAPHICCODE
     */
    public String getDocCryptographiccode() {
        return docCryptographiccode;
    }

    /**
     * HDSD00_14_07.DOC_CRYPTOGRAPHICCODE
     *
     * @param docCryptographiccode the value for HDSD00_14_07.DOC_CRYPTOGRAPHICCODE
     */
    public void setDocCryptographiccode(String docCryptographiccode) {
        this.docCryptographiccode = docCryptographiccode;
    }

    /**
     * HDSD00_14_07.DOC_CRYPTOGRAPHIC
     *
     * @return the value of HDSD00_14_07.DOC_CRYPTOGRAPHIC
     */
    public String getDocCryptographic() {
        return docCryptographic;
    }

    /**
     * HDSD00_14_07.DOC_CRYPTOGRAPHIC
     *
     * @param docCryptographic the value for HDSD00_14_07.DOC_CRYPTOGRAPHIC
     */
    public void setDocCryptographic(String docCryptographic) {
        this.docCryptographic = docCryptographic;
    }

    /**
     * HDSD00_14_07.DOC_AUTHORCODE
     *
     * @return the value of HDSD00_14_07.DOC_AUTHORCODE
     */
    public String getDocAuthorcode() {
        return docAuthorcode;
    }

    /**
     * HDSD00_14_07.DOC_AUTHORCODE
     *
     * @param docAuthorcode the value for HDSD00_14_07.DOC_AUTHORCODE
     */
    public void setDocAuthorcode(String docAuthorcode) {
        this.docAuthorcode = docAuthorcode;
    }

    /**
     * HDSD00_14_07.DOC_AUTHOR
     *
     * @return the value of HDSD00_14_07.DOC_AUTHOR
     */
    public String getDocAuthor() {
        return docAuthor;
    }

    /**
     * HDSD00_14_07.DOC_AUTHOR
     *
     * @param docAuthor the value for HDSD00_14_07.DOC_AUTHOR
     */
    public void setDocAuthor(String docAuthor) {
        this.docAuthor = docAuthor;
    }

    /**
     * HDSD00_14_07.DISCUSSION_PLACE
     *
     * @return the value of HDSD00_14_07.DISCUSSION_PLACE
     */
    public String getDiscussionPlace() {
        return discussionPlace;
    }

    /**
     * HDSD00_14_07.DISCUSSION_PLACE
     *
     * @param discussionPlace the value for HDSD00_14_07.DISCUSSION_PLACE
     */
    public void setDiscussionPlace(String discussionPlace) {
        this.discussionPlace = discussionPlace;
    }

    /**
     * HDSD00_14_07.DISCUSSION_LIST
     *
     * @return the value of HDSD00_14_07.DISCUSSION_LIST
     */
    public String getDiscussionList() {
        return discussionList;
    }

    /**
     * HDSD00_14_07.DISCUSSION_LIST
     *
     * @param discussionList the value for HDSD00_14_07.DISCUSSION_LIST
     */
    public void setDiscussionList(String discussionList) {
        this.discussionList = discussionList;
    }

    /**
     * HDSD00_14_07.DIRECT_DEATHCODE
     *
     * @return the value of HDSD00_14_07.DIRECT_DEATHCODE
     */
    public String getDirectDeathcode() {
        return directDeathcode;
    }

    /**
     * HDSD00_14_07.DIRECT_DEATHCODE
     *
     * @param directDeathcode the value for HDSD00_14_07.DIRECT_DEATHCODE
     */
    public void setDirectDeathcode(String directDeathcode) {
        this.directDeathcode = directDeathcode;
    }

    /**
     * HDSD00_14_07.DIRECT_DEATH
     *
     * @return the value of HDSD00_14_07.DIRECT_DEATH
     */
    public String getDirectDeath() {
        return directDeath;
    }

    /**
     * HDSD00_14_07.DIRECT_DEATH
     *
     * @param directDeath the value for HDSD00_14_07.DIRECT_DEATH
     */
    public void setDirectDeath(String directDeath) {
        this.directDeath = directDeath;
    }

    /**
     * HDSD00_14_07.DEPT_NAME
     *
     * @return the value of HDSD00_14_07.DEPT_NAME
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * HDSD00_14_07.DEPT_NAME
     *
     * @param deptName the value for HDSD00_14_07.DEPT_NAME
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    /**
     * HDSD00_14_07.DEPT_CODE
     *
     * @return the value of HDSD00_14_07.DEPT_CODE
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * HDSD00_14_07.DEPT_CODE
     *
     * @param deptCode the value for HDSD00_14_07.DEPT_CODE
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    /**
     * HDSD00_14_07.DEATH_DISCUSSION
     *
     * @return the value of HDSD00_14_07.DEATH_DISCUSSION
     */
    public String getDeathDiscussion() {
        return deathDiscussion;
    }

    /**
     * HDSD00_14_07.DEATH_DISCUSSION
     *
     * @param deathDiscussion the value for HDSD00_14_07.DEATH_DISCUSSION
     */
    public void setDeathDiscussion(String deathDiscussion) {
        this.deathDiscussion = deathDiscussion;
    }

    /**
     * HDSD00_14_07.DATEOF_DISCUSSION
     *
     * @return the value of HDSD00_14_07.DATEOF_DISCUSSION
     */
    public String getDateofDiscussion() {
        return dateofDiscussion;
    }

    /**
     * HDSD00_14_07.DATEOF_DISCUSSION
     *
     * @param dateofDiscussion the value for HDSD00_14_07.DATEOF_DISCUSSION
     */
    public void setDateofDiscussion(String dateofDiscussion) {
        this.dateofDiscussion = dateofDiscussion;
    }

    /**
     * HDSD00_14_07.CHIEF_SIGN_NAME
     *
     * @return the value of HDSD00_14_07.CHIEF_SIGN_NAME
     */
    public String getChiefSignName() {
        return chiefSignName;
    }

    /**
     * HDSD00_14_07.CHIEF_SIGN_NAME
     *
     * @param chiefSignName the value for HDSD00_14_07.CHIEF_SIGN_NAME
     */
    public void setChiefSignName(String chiefSignName) {
        this.chiefSignName = chiefSignName;
    }

    /**
     * HDSD00_14_07.CHIEF_NAME
     *
     * @return the value of HDSD00_14_07.CHIEF_NAME
     */
    public String getChiefName() {
        return chiefName;
    }

    /**
     * HDSD00_14_07.CHIEF_NAME
     *
     * @param chiefName the value for HDSD00_14_07.CHIEF_NAME
     */
    public void setChiefName(String chiefName) {
        this.chiefName = chiefName;
    }

    /**
     * HDSD00_14_07.CHIEF_CODE
     *
     * @return the value of HDSD00_14_07.CHIEF_CODE
     */
    public String getChiefCode() {
        return chiefCode;
    }

    /**
     * HDSD00_14_07.CHIEF_CODE
     *
     * @param chiefCode the value for HDSD00_14_07.CHIEF_CODE
     */
    public void setChiefCode(String chiefCode) {
        this.chiefCode = chiefCode;
    }

    /**
     * HDSD00_14_07.BED_NO
     *
     * @return the value of HDSD00_14_07.BED_NO
     */
    public String getBedNo() {
        return bedNo;
    }

    /**
     * HDSD00_14_07.BED_NO
     *
     * @param bedNo the value for HDSD00_14_07.BED_NO
     */
    public void setBedNo(String bedNo) {
        this.bedNo = bedNo;
    }

    /**
     * HDSD00_14_07.BED_NAME
     *
     * @return the value of HDSD00_14_07.BED_NAME
     */
    public String getBedName() {
        return bedName;
    }

    /**
     * HDSD00_14_07.BED_NAME
     *
     * @param bedName the value for HDSD00_14_07.BED_NAME
     */
    public void setBedName(String bedName) {
        this.bedName = bedName;
    }

    /**
     * HDSD00_14_07.ATTENDING_SIGNDATE
     *
     * @return the value of HDSD00_14_07.ATTENDING_SIGNDATE
     */
    public String getAttendingSigndate() {
        return attendingSigndate;
    }

    /**
     * HDSD00_14_07.ATTENDING_SIGNDATE
     *
     * @param attendingSigndate the value for HDSD00_14_07.ATTENDING_SIGNDATE
     */
    public void setAttendingSigndate(String attendingSigndate) {
        this.attendingSigndate = attendingSigndate;
    }

    /**
     * HDSD00_14_07.ATTENDING_NAME
     *
     * @return the value of HDSD00_14_07.ATTENDING_NAME
     */
    public String getAttendingName() {
        return attendingName;
    }

    /**
     * HDSD00_14_07.ATTENDING_NAME
     *
     * @param attendingName the value for HDSD00_14_07.ATTENDING_NAME
     */
    public void setAttendingName(String attendingName) {
        this.attendingName = attendingName;
    }

    /**
     * HDSD00_14_07.ATTENDING_CODE
     *
     * @return the value of HDSD00_14_07.ATTENDING_CODE
     */
    public String getAttendingCode() {
        return attendingCode;
    }

    /**
     * HDSD00_14_07.ATTENDING_CODE
     *
     * @param attendingCode the value for HDSD00_14_07.ATTENDING_CODE
     */
    public void setAttendingCode(String attendingCode) {
        this.attendingCode = attendingCode;
    }

    /**
     * HDSD00_14_07.AGE
     *
     * @return the value of HDSD00_14_07.AGE
     */
    public String getAge() {
        return age;
    }

    /**
     * HDSD00_14_07.AGE
     *
     * @param age the value for HDSD00_14_07.AGE
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * HDSD00_14_07.AGE_UNIT
     *
     * @return the value of HDSD00_14_07.AGE_UNIT
     */
    public String getAgeUnit() {
        return ageUnit;
    }

    /**
     * HDSD00_14_07.AGE_UNIT
     *
     * @param ageUnit the value for HDSD00_14_07.AGE_UNIT
     */
    public void setAgeUnit(String ageUnit) {
        this.ageUnit = ageUnit;
    }

    /**
     * HDSD00_14_07.VISIT_DATE
     *
     * @return the value of HDSD00_14_07.VISIT_DATE
     */
    public String getVisitDate() {
        return visitDate;
    }

    /**
     * HDSD00_14_07.VISIT_DATE
     *
     * @param visitDate the value for HDSD00_14_07.VISIT_DATE
     */
    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
    }

    /**
     * HDSD00_14_07.OUT_PATIENT_ID
     *
     * @return the value of HDSD00_14_07.OUT_PATIENT_ID
     */
    public String getOutPatientId() {
        return outPatientId;
    }

    /**
     * HDSD00_14_07.OUT_PATIENT_ID
     *
     * @param outPatientId the value for HDSD00_14_07.OUT_PATIENT_ID
     */
    public void setOutPatientId(String outPatientId) {
        this.outPatientId = outPatientId;
    }

    /**
     * HDSD00_14_07.GENDER
     *
     * @return the value of HDSD00_14_07.GENDER
     */
    public String getGender() {
        return gender;
    }

    /**
     * HDSD00_14_07.GENDER
     *
     * @param gender the value for HDSD00_14_07.GENDER
     */
    public void setGender(String gender) {
        this.gender = gender;
    }
}