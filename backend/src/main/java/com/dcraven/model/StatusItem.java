package com.dcraven.model;

import java.util.Date;

public class StatusItem {
    private Long id;
    private String summary;
    private String details;
    private String comments;
    private Date creationDate;
    private Date modificationDate;
    private StatusType status;


    public StatusItem(String summary, String details, StatusType status) {
        this.summary = summary;
        this.details = details;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getModificationDate() {
        return modificationDate;
    }

    public void setModificationDate(Date modificationDate) {
        this.modificationDate = modificationDate;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusItem{" +
                "summary='" + summary + '\'' +
                ", details='" + details + '\'' +
                ", comments='" + comments + '\'' +
                ", creationDate=" + creationDate +
                ", modificationDate=" + modificationDate +
                ", status=" + status +
                '}';
    }
}
