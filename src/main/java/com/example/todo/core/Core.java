package com.example.todo.core;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;


@MappedSuperclass
public abstract class Core {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public Integer id;

    @CreationTimestamp
    public Date created;

    @UpdateTimestamp
    public Date modified;

    public Boolean is_active = Boolean.TRUE;

    void setId(Integer id) {
        this.id = id;
    }

    Integer getId(Integer id) {
        return this.id;
    }
}
