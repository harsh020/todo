package com.example.todo.task;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TaskDTO {
    @JsonProperty("name")
    public String name;
}
