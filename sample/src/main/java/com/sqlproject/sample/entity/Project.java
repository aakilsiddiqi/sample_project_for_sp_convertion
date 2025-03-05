package com.sqlproject.sample.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project {

    @Id
    private int projectId;

    private String projectName;
    private String clientName;


    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }


}
