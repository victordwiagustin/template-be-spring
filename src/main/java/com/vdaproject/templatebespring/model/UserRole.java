package com.vdaproject.templatebespring.model;

import com.vdaproject.templatebespring.model.base.BaseModel;
import com.vdaproject.templatebespring.util.DateUtil;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
public class UserRole extends BaseModel {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Getter
    @Setter
    @Column(unique = true)
    private String roleName;
    @Getter
    @Setter
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<UserAccess> userAccesses;

    public UserRole() {
    }

    public UserRole(String roleName) {
        this.roleName = roleName;
        this.createdDate = DateUtil.now();
        this.updatedDate = null;
    }
}
