package com.example.task.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskTests {

    @Test
    void task_should_have_correct_description() {
        Task task = new Task("Ma tâche");
        assertEquals("Ma tâche", task.getDescription());
    }

    @Test
    void task_default_status_should_be_en_cours() {
        Task task = new Task("Ma tâche");
        assertEquals("En cours", task.getStatus());
    }

    @Test
    void two_tasks_should_have_different_ids() {
        Task task1 = new Task("Tâche 1");
        Task task2 = new Task("Tâche 2");
        assertNotEquals(task1.getId(), task2.getId());
    }

    @Test
    void setStatus_should_update_status() {
        Task task = new Task("Ma tâche");
        task.setStatus("Terminé");
        assertEquals("Terminé", task.getStatus());
    }
}