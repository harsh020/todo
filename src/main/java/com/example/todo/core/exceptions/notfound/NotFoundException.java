package com.example.todo.core.exceptions.notfound;

import com.example.todo.core.exceptions.TodoException;

public class NotFoundException extends TodoException {
    public NotFoundException(String message) {
        super(message);
    }
}
