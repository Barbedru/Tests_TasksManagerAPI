package com.example.task.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskServiceTests {

    private TaskService taskService;

    @BeforeEach
    void setUp() {
        taskService = new TaskService();
    }

    // --- addTask ---

    @Test
    void addTask_should_add_task_to_list() {
        int initialSize = taskService.getTasks().size();
        taskService.addTask("Ma tâche");
        assertEquals(initialSize + 1, taskService.getTasks().size());
    }

    @Test
    void addTask_should_return_task_with_correct_description() {
        Task task = taskService.addTask("Ma tâche");
        assertEquals("Ma tâche", task.getDescription());
    }

    @Test
    void addTask_should_return_task_with_status_en_cours() {
        Task task = taskService.addTask("Ma tâche");
        assertEquals("En cours", task.getStatus());
    }

    // --- getTasks ---

    @Test
    void getTasks_should_return_tasks() {
        assertNotNull(taskService.getTasks());
    }

    @Test
    void getTasks_should_reflect_added_tasks() {
        int initialSize = taskService.getTasks().size();
        taskService.addTask("Tâche 1");
        taskService.addTask("Tâche 2");
        assertEquals(initialSize + 2, taskService.getTasks().size());
    }

    // --- removeTask ---

    @Test
    void removeTask_should_return_true_when_task_exists() {
        Task task = taskService.addTask("Ma tâche");
        assertTrue(taskService.removeTask(task.getId()));
    }

    @Test
    void removeTask_should_remove_task_from_list() {
        int initialSize = taskService.getTasks().size();
        Task task = taskService.addTask("Ma tâche");
        taskService.removeTask(task.getId());
        assertEquals(initialSize, taskService.getTasks().size());
    }

    @Test
    void removeTask_should_return_false_when_task_not_found() {
        assertFalse(taskService.removeTask(-1));
    }

    // --- completeTask ---

    @Test
    void completeTask_should_return_true_when_task_exists() {
        Task task = taskService.addTask("Ma tâche");
        assertTrue(taskService.completeTask(task.getId()));
    }

    @Test
    void completeTask_should_set_status_to_termine() {
        Task task = taskService.addTask("Ma tâche");
        taskService.completeTask(task.getId());
        assertEquals("Terminé", task.getStatus());
    }

    @Test
    void completeTask_should_return_false_when_task_not_found() {
        assertFalse(taskService.completeTask(-1));
    }
}
