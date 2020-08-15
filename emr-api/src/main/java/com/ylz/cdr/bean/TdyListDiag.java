package com.ylz.cdr.bean;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("TDY_LIST_DIAG")
public class TdyListDiag implements Serializable {
    /**
     * This field corresponds to the database table TDY_LIST_DIAG
     */
    private static final long serialVersionUID = 1L;
    /**
     * TDY_LIST_DIAG.id
     */
    private Integer id;
    /**
     * TDY_LIST_DIAG.doc_unique
     */
    private String docUnique;
    /**
     * TDY_LIST_DIAG.doc_domain_id
     */
    private String docDomainId;
    /**
     * TDY_LIST_DIAG.doc_version
     */
    private String docVersion;
    /**
     * TDY_LIST_DIAG.doc_type
     */
    private String docType;
    /**
     * TDY_LIST_DIAG.empi
     */
    private String empi;
    /**
     * TDY_LIST_DIAG.ENCOUNTER_ID
     */
    private String encounterId;
    /**
     * TDY_LIST_DIAG.delete_flag
     */
    private String deleteFlag;
    /**
     * TDY_LIST_DIAG.diag_code
     */
    private String diagCode;
    /**
     * TDY_LIST_DIAG.diag_name
     */
    private String diagName;
    /**
     * TDY_LIST_DIAG.diag_outcome_code
     */
    private String diagOutcomeCode;
    /**
     * TDY_LIST_DIAG.diag_outcome_name
     */
    private String diagOutcomeName;
    /**
     * TDY_LIST_DIAG.DIAG_TYPE
     */
    private String diagType;
    /**
     * TDY_LIST_DIAG.diag_sname
     */
    private String diagSname;
    /**
     * TDY_LIST_DIAG.diag_scode
     */
    private String diagScode;
    /**
     * TDY_LIST_DIAG.ADMISSION_CODE
     */
    private String admissionCode;
    /**
     * TDY_LIST_DIAG.ADMISSION_NAME
     */
    private String admissionName;
    /**
     * TDY_LIST_DIAG.DIAG_DATE
     */
    private String diagDate;
    /**
     * TDY_LIST_DIAG.DIAG_INSTITUTION
     */
    private String diagInstitution;
    /**
     * TDY_LIST_DIAG.DIAG_ORDER
     */
    private String diagOrder;
    /**
     * TDY_LIST_DIAG.DIAG_POST
     */
    private String diagPost;
    /**
     * TDY_LIST_DIAG.PATHOLOGICAL_ID
     */
    private String pathologicalId;

    /*private String deptName;
    private String deptCode;
    private String doctorName;
    private String doctorCode;
    private String infectFlag;
    private String mainDiag;
    private String diagTypecode;*/

    /**
     * TDY_LIST_DIAG.id
     *
     * @return the value of TDY_LIST_DIAG.id
     */
    public Integer getId() {
        return id;
    }

    /**
     * TDY_LIST_DIAG.id
     *
     * @param id the value for TDY_LIST_DIAG.id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * TDY_LIST_DIAG.doc_unique
     *
     * @return the value of TDY_LIST_DIAG.doc_unique
     */
    public String getDocUnique() {
        return docUnique;
    }

    /**
     * TDY_LIST_DIAG.doc_unique
     *
     * @param docUnique the value for TDY_LIST_DIAG.doc_unique
     */
    public void setDocUnique(String docUnique) {
        this.docUnique = docUnique;
    }

    /**
     * TDY_LIST_DIAG.doc_domain_id
     *
     * @return the value of TDY_LIST_DIAG.doc_domain_id
     */
    public String getDocDomainId() {
        return docDomainId;
    }

    /**
     * TDY_LIST_DIAG.doc_domain_id
     *
     * @param docDomainId the value for TDY_LIST_DIAG.doc_domain_id
     */
    public void setDocDomainId(String docDomainId) {
        this.docDomainId = docDomainId;
    }

    /**
     * TDY_LIST_DIAG.doc_version
     *
     * @return the value of TDY_LIST_DIAG.doc_version
     */
    public String getDocVersion() {
        return docVersion;
    }

    /**
     * TDY_LIST_DIAG.doc_version
     *
     * @param docVersion the value for TDY_LIST_DIAG.doc_version
     */
    public void setDocVersion(String docVersion) {
        this.docVersion = docVersion;
    }

    /**
     * TDY_LIST_DIAG.doc_type
     *
     * @return the value of TDY_LIST_DIAG.doc_type
     */
    public String getDocType() {
        return docType;
    }

    /**
     * TDY_LIST_DIAG.doc_type
     *
     * @param docType the value for TDY_LIST_DIAG.doc_type
     */
    public void setDocType(String docType) {
        this.docType = docType;
    }

    /**
     * TDY_LIST_DIAG.empi
     *
     * @return the value of TDY_LIST_DIAG.empi
     */
    public String getEmpi() {
        return empi;
    }

    /**
     * TDY_LIST_DIAG.empi
     *
     * @param empi the value for TDY_LIST_DIAG.empi
     */
    public void setEmpi(String empi) {
        this.empi = empi;
    }

    /**
     * TDY_LIST_DIAG.ENCOUNTER_ID
     *
     * @return the value of TDY_LIST_DIAG.ENCOUNTER_ID
     */
    public String getEncounterId() {
        return encounterId;
    }

    /**
     * TDY_LIST_DIAG.ENCOUNTER_ID
     *
     * @param encounterId the value for TDY_LIST_DIAG.ENCOUNTER_ID
     */
    public void setEncounterId(String encounterId) {
        this.encounterId = encounterId;
    }

    /**
     * TDY_LIST_DIAG.delete_flag
     *
     * @return the value of TDY_LIST_DIAG.delete_flag
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * TDY_LIST_DIAG.delete_flag
     *
     * @param deleteFlag the value for TDY_LIST_DIAG.delete_flag
     */
    public void setDeleteFlag(String deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    /**
     * TDY_LIST_DIAG.diag_code
     *
     * @return the value of TDY_LIST_DIAG.diag_code
     */
    public String getDiagCode() {
        return diagCode;
    }

    /**
     * TDY_LIST_DIAG.diag_code
     *
     * @param diagCode the value for TDY_LIST_DIAG.diag_code
     */
    public void setDiagCode(String diagCode) {
        this.diagCode = diagCode;
    }

    /**
     * TDY_LIST_DIAG.diag_name
     *
     * @return the value of TDY_LIST_DIAG.diag_name
     */
    public String getDiagName() {
        return diagName;
    }

    /**
     * TDY_LIST_DIAG.diag_name
     *
     * @param diagName the value for TDY_LIST_DIAG.diag_name
     */
    public void setDiagName(String diagName) {
        this.diagName = diagName;
    }

    /**
     * TDY_LIST_DIAG.diag_outcome_code
     *
     * @return the value of TDY_LIST_DIAG.diag_outcome_code
     */
    public String getDiagOutcomeCode() {
        return diagOutcomeCode;
    }

    /**
     * TDY_LIST_DIAG.diag_outcome_code
     *
     * @param diagOutcomeCode the value for TDY_LIST_DIAG.diag_outcome_code
     */
    public void setDiagOutcomeCode(String diagOutcomeCode) {
        this.diagOutcomeCode = diagOutcomeCode;
    }

    /**
     * TDY_LIST_DIAG.diag_outcome_name
     *
     * @return the value of TDY_LIST_DIAG.diag_outcome_name
     */
    public String getDiagOutcomeName() {
        return diagOutcomeName;
    }

    /**
     * TDY_LIST_DIAG.diag_outcome_name
     *
     * @param diagOutcomeName the value for TDY_LIST_DIAG.diag_outcome_name
     */
    public void setDiagOutcomeName(String diagOutcomeName) {
        this.diagOutcomeName = diagOutcomeName;
    }

    /**
     * TDY_LIST_DIAG.DIAG_TYPE
     *
     * @return the value of TDY_LIST_DIAG.DIAG_TYPE
     */
    public String getDiagType() {
        return diagType;
    }

    /**
     * TDY_LIST_DIAG.DIAG_TYPE
     *
     * @param diagType the value for TDY_LIST_DIAG.DIAG_TYPE
     */
    public void setDiagType(String diagType) {
        this.diagType = diagType;
    }

    /**
     * TDY_LIST_DIAG.diag_sname
     *
     * @return the value of TDY_LIST_DIAG.diag_sname
     */
    public String getDiagSname() {
        return diagSname;
    }

    /**
     * TDY_LIST_DIAG.diag_sname
     *
     * @param diagSname the value for TDY_LIST_DIAG.diag_sname
     */
    public void setDiagSname(String diagSname) {
        this.diagSname = diagSname;
    }

    /**
     * TDY_LIST_DIAG.diag_scode
     *
     * @return the value of TDY_LIST_DIAG.diag_scode
     */
    public String getDiagScode() {
        return diagScode;
    }

    /**
     * TDY_LIST_DIAG.diag_scode
     *
     * @param diagScode the value for TDY_LIST_DIAG.diag_scode
     */
    public void setDiagScode(String diagScode) {
        this.diagScode = diagScode;
    }

    /**
     * TDY_LIST_DIAG.ADMISSION_CODE
     *
     * @return the value of TDY_LIST_DIAG.ADMISSION_CODE
     */
    public String getAdmissionCode() {
        return admissionCode;
    }

    /**
     * TDY_LIST_DIAG.ADMISSION_CODE
     *
     * @param admissionCode the value for TDY_LIST_DIAG.ADMISSION_CODE
     */
    public void setAdmissionCode(String admissionCode) {
        this.admissionCode = admissionCode;
    }

    /**
     * TDY_LIST_DIAG.ADMISSION_NAME
     *
     * @return the value of TDY_LIST_DIAG.ADMISSION_NAME
     */
    public String getAdmissionName() {
        return admissionName;
    }

    /**
     * TDY_LIST_DIAG.ADMISSION_NAME
     *
     * @param admissionName the value for TDY_LIST_DIAG.ADMISSION_NAME
     */
    public void setAdmissionName(String admissionName) {
        this.admissionName = admissionName;
    }

    /**
     * TDY_LIST_DIAG.DIAG_DATE
     *
     * @return the value of TDY_LIST_DIAG.DIAG_DATE
     */
    public String getDiagDate() {
        return diagDate;
    }

    /**
     * TDY_LIST_DIAG.DIAG_DATE
     *
     * @param diagDate the value for TDY_LIST_DIAG.DIAG_DATE
     */
    public void setDiagDate(String diagDate) {
        this.diagDate = diagDate;
    }

    /**
     * TDY_LIST_DIAG.DIAG_INSTITUTION
     *
     * @return the value of TDY_LIST_DIAG.DIAG_INSTITUTION
     */
    public String getDiagInstitution() {
        return diagInstitution;
    }

    /**
     * TDY_LIST_DIAG.DIAG_INSTITUTION
     *
     * @param diagInstitution the value for TDY_LIST_DIAG.DIAG_INSTITUTION
     */
    public void setDiagInstitution(String diagInstitution) {
        this.diagInstitution = diagInstitution;
    }

    /**
     * TDY_LIST_DIAG.DIAG_ORDER
     *
     * @return the value of TDY_LIST_DIAG.DIAG_ORDER
     */
    public String getDiagOrder() {
        return diagOrder;
    }

    /**
     * TDY_LIST_DIAG.DIAG_ORDER
     *
     * @param diagOrder the value for TDY_LIST_DIAG.DIAG_ORDER
     */
    public void setDiagOrder(String diagOrder) {
        this.diagOrder = diagOrder;
    }

    /**
     * TDY_LIST_DIAG.DIAG_POST
     *
     * @return the value of TDY_LIST_DIAG.DIAG_POST
     */
    public String getDiagPost() {
        return diagPost;
    }

    /**
     * TDY_LIST_DIAG.DIAG_POST
     *
     * @param diagPost the value for TDY_LIST_DIAG.DIAG_POST
     */
    public void setDiagPost(String diagPost) {
        this.diagPost = diagPost;
    }

    /**
     * TDY_LIST_DIAG.PATHOLOGICAL_ID
     *
     * @return the value of TDY_LIST_DIAG.PATHOLOGICAL_ID
     */
    public String getPathologicalId() {
        return pathologicalId;
    }

    /**
     * TDY_LIST_DIAG.PATHOLOGICAL_ID
     *
     * @param pathologicalId the value for TDY_LIST_DIAG.PATHOLOGICAL_ID
     */
    public void setPathologicalId(String pathologicalId) {
        this.pathologicalId = pathologicalId;
    }

    /*public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getInfectFlag() {
        return infectFlag;
    }

    public void setInfectFlag(String infectFlag) {
        this.infectFlag = infectFlag;
    }

    public String getMainDiag() {
        return mainDiag;
    }

    public void setMainDiag(String mainDiag) {
        this.mainDiag = mainDiag;
    }

    public String getDiagTypecode() {
        return diagTypecode;
    }

    public void setDiagTypecode(String diagTypecode) {
        this.diagTypecode = diagTypecode;
    }*/
}