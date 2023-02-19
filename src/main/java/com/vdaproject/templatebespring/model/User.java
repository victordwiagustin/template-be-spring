package com.vdaproject.templatebespring.model;

import com.vdaproject.templatebespring.model.base.BaseModel;
import jakarta.persistence.*;
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
    @Getter
    @Setter
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<UserRole> userRoles;

    public User() {
    }

    // TODO: Transient
}
