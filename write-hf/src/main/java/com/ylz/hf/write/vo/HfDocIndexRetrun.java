package com.ylz.hf.write.vo;

import com.ylz.hf.bean.DocIndex;

public class HfDocIndexRetrun {

    private String uniqueId;
    private String repositoryUniqueId;
    private String title;
    private String createTime;
    private String authorName;
    private String patientId;
    private String patientName;
    private String serverName;
    private String episodeId;
    private String startTime;
    private String endTime;
    private String deptName;
    private String admissionName;
    private String admissionType;
    private String diagnosisResult;
    private String docUrl;

    public HfDocIndexRetrun() {
    }

    public HfDocIndexRetrun(DocIndex hfDocIndex, String docUrl) {
        this.uniqueId = hfDocIndex.getUniqueId();
        this.repositoryUniqueId = hfDocIndex.getRepositoryUniqueId();
        this.title = hfDocIndex.getTitle();
        this.createTime = hfDocIndex.getCreateTime();
        this.authorName = hfDocIndex.getAuthorName();
        this.patientId = hfDocIndex.getPatientId();
        this.patientName = hfDocIndex.getPatientName();
        this.serverName = hfDocIndex.getServerName();
        this.episodeId = hfDocIndex.getEpisodeId();
        this.startTime = hfDocIndex.getStartTime();
        this.endTime = hfDocIndex.getEndTime();
        this.deptName = hfDocIndex.getDeptName();
        this.admissionName = hfDocIndex.getAdmissionName();
        this.admissionType = hfDocIndex.getAdmissionType();
        this.diagnosisResult = hfDocIndex.getDiagnosisResult();
        this.docUrl = docUrl + this.repositoryUniqueId;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getRepositoryUniqueId() {
        return repositoryUniqueId;
    }

    public void setRepositoryUniqueId(String repositoryUniqueId) {
        this.repositoryUniqueId = repositoryUniqueId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(String episodeId) {
        this.episodeId = episodeId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getAdmissionName() {
        return admissionName;
    }

    public void setAdmissionName(String admissionName) {
        this.admissionName = admissionName;
    }

    public String getAdmissionType() {
        return admissionType;
    }

    public void setAdmissionType(String admissionType) {
        this.admissionType = admissionType;
    }

    public String getDiagnosisResult() {
        return diagnosisResult;
    }

    public void setDiagnosisResult(String diagnosisResult) {
        this.diagnosisResult = diagnosisResult;
    }

    public String getDocUrl() {
        return docUrl;
    }

    public void setDocUrl(String docUrl) {
        this.docUrl = docUrl;
    }
}