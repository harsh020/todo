package com.example.todo.response;

import lombok.Getter;

@Getter
public class ErrorResponse {
    String message;

    private ErrorResponse(String message) {
        this.message = message;
    }

    public static ErrorResponse from(Exception e) {
        return new ErrorResponse(e.getMessage());
    }
}
