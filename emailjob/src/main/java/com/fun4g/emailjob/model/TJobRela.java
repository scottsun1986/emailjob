package com.fun4g.emailjob.model;

public class TJobRela {
    private Integer id;

    private Integer jobId;

    private String email;

    private Boolean isDistributor;

    private Boolean hasDistributed;

    private String extractCode;

    private Boolean hasConfirmed;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Boolean getIsDistributor() {
        return isDistributor;
    }

    public void setIsDistributor(Boolean isDistributor) {
        this.isDistributor = isDistributor;
    }

    public Boolean getHasDistributed() {
        return hasDistributed;
    }

    public void setHasDistributed(Boolean hasDistributed) {
        this.hasDistributed = hasDistributed;
    }

    public String getExtractCode() {
        return extractCode;
    }

    public void setExtractCode(String extractCode) {
        this.extractCode = extractCode == null ? null : extractCode.trim();
    }

    public Boolean getHasConfirmed() {
        return hasConfirmed;
    }

    public void setHasConfirmed(Boolean hasConfirmed) {
        this.hasConfirmed = hasConfirmed;
    }
}