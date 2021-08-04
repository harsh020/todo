package com.example.todo.task.exceptions;

import com.example.todo.core.exceptions.notfound.NotFoundException;

public class TaskNotFoundException extends NotFoundException {
    public TaskNotFoundException(String message) {
        super(message);
    }
}
