package com.example.task.service;

import java.util.UUID;

public class Task {

    private String id;
    private String description;
    private String status;

    public void Task(String id, String description, String status){
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.status = status;
    }

    public String getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public String getStatus(){
        return status;
    }

    public void seStatus(String status){
        this.status = status;
    }
}

