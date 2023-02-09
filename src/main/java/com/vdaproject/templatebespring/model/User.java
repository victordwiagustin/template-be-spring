package com.vdaproject.templatebespring.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.UUID;

@Entity
public class User implements Serializable {
    private String id;
    private String email;
    private String name;

    public User() {
    }

    @Id
    public String getId() {
//        // FIXME: this looks like bad idea
//        return id == null || id.equals("") ? UUID.randomUUID().toString() : id;
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // TODO: Transient
}
