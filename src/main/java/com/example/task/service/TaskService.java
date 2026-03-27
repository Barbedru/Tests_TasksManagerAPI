package com.example.task.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {

    private List<Task> tasks = new ArrayList<>();

   public Task addTask(String description) {
       Task task = new Task(description);
       tasks.add(task);
       return task;

   }

   public boolean removeTask(int id){
       for (Task t : tasks){
           if (t.getId() == id){
               tasks.remove(t);
               return true;
           }
       }
       return false;
   }

   public List<Task> getTasks(){
       return tasks;
   }

   public boolean completeTask(int id){
       for (Task t : tasks){
           if (t.getId() == id) {
               t.setStatus("Terminé");
               return true;
           }
       }
       return false;
   }
}
