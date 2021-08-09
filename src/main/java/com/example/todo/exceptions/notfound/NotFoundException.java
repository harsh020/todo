package com.example.todo.exceptions.notfound;

import com.example.todo.exceptions.TodoException;

public class NotFoundException extends TodoException {
    public NotFoundException(String message) {
        super(message);
    }
}
