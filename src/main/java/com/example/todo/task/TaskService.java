package com.example.todo.task;

import com.example.todo.task.exceptions.TaskNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TaskService {
    TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    Task addNewTask(String name) {
        Task task = new Task(name);
        return taskRepository.save(task);
    }

    List<Task> getTasks() {
        return taskRepository.findAll();
    }

    Task getTask(Integer id) {
        try {
            return taskRepository.findById(id).get();
        }
        catch (EntityNotFoundException | NoSuchElementException e) {
            throw new TaskNotFoundException("Task with id: " + id + " does not exists.");
        }
    }

    Task setTaskDone(Integer id) {
        Task task = getTask(id);
        task.setDone(Boolean.TRUE);
        taskRepository.save(task);
        return task;
    }

    Task deleteTask(Integer id) {
        Task task = getTask(id);
        task.setDone(Boolean.FALSE);
        taskRepository.save(task);
        return task;
    }
}
