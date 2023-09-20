package com.taskManagement.model;

import java.sql.Date;

public class TaskModel {
    private long id;
    private String title, description;
    private int taskStatus;
    private String employeeEmail;
    private Date creationDate;

    public TaskModel(String title, String description, int taskStatus, String employeeEmail) {
        this.title = title;
        this.description = description;
        this.taskStatus = taskStatus;
        this.employeeEmail = employeeEmail;
    }

    @Override
    public String toString() {
        return "TaskModel{" +
                "\nid : " + id +
                "\n title = '" + title + '\'' +
                "\n description = '" + description + '\'' +
                "\n taskStatus = " + taskStatus +
                "\n employeeEmail = '" + employeeEmail + '\'' +
                '}';
    }
}
