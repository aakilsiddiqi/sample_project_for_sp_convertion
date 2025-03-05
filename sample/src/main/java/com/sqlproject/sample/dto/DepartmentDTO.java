package com.sqlproject.sample.dto;

public class DepartmentDTO {

    private int deptId;
    private String deptName;
    private String designation;
    private String jobLevel;


    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getJobLevel() {
        return jobLevel;
    }

    public void setJobLevel(String jobLevel) {
        this.jobLevel = jobLevel;
    }

    @Override
    public String toString() {
        return "DepartmentDTO{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", designation='" + designation + '\'' +
                ", jobLevel='" + jobLevel + '\'' +
                '}';
    }
}
