package com.example.todo.task;

import com.example.todo.core.Core;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Task extends Core {
    @JsonProperty("name")
    @Column()
    String name;

    @JsonProperty("done")
    @Column()
    Boolean done = Boolean.FALSE;

    public Task(String name) {
        this.name = name;
    }
}
