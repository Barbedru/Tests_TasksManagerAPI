package com.example.task.service;

public class Task {

    private static int next_id = 0;

    private int id;
    private String description;
    private String status;

    public Task(String description) {
        this.id = ++Task.next_id ;
        this.description = description;
        this.status = "En cours";
    }

    public int getId(){
        return id;
    }
    public String getDescription(){
        return description;
    }
    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}

