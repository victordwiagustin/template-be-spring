package com.vdaproject.templatebespring.model;

import com.vdaproject.templatebespring.model.base.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.List;

@Entity
public class User extends BaseModel {
    @Getter
    @Setter
    @Id
    private String id;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String fullName;
    @Getter
    @Setter
    private String username;
    @Getter
    @Setter
    private String password;
    @Getter
    @Setter
    private Timestamp registrationDate;

    public User() {
    }

    // TODO: Transient
}
