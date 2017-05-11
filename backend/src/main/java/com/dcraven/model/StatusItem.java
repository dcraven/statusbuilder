package com.dcraven.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "StatusItems")
public class StatusItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String summary;

    private String details;
    private String comments;

    @NotNull
    private Date creationDate;

    @NotNull
    private Date modificationDate;

    @NotNull
    private StatusType status;


    public StatusItem(String summary, String details, StatusType status) {
        this.summary = summary;
        this.details = details;
        this.status = status;
        this.creationDate = new Date();
        this.modificationDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
        this.modificationDate = new Date();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
        this.modificationDate = new Date();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
        this.modificationDate = new Date();
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
        this.modificationDate = new Date();
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
        this.modificationDate = new Date();
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
        this.modificationDate = new Date();
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
