package com.fun4g.emailjob.model;

public class TJob {
    private Integer jobId;

    private String jobTitle;

    private String jobDesc;

    private String jobEmailTitle;

    private Integer projectId;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle == null ? null : jobTitle.trim();
    }

    public String getJobDesc() {
        return jobDesc;
    }

    public void setJobDesc(String jobDesc) {
        this.jobDesc = jobDesc == null ? null : jobDesc.trim();
    }

    public String getJobEmailTitle() {
        return jobEmailTitle;
    }

    public void setJobEmailTitle(String jobEmailTitle) {
        this.jobEmailTitle = jobEmailTitle == null ? null : jobEmailTitle.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }
}