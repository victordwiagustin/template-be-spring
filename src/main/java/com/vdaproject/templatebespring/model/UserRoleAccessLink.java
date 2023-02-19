package com.vdaproject.templatebespring.model;

import com.vdaproject.templatebespring.model.base.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class UserRoleAccessLink extends BaseModel {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userRoleId")
    private UserRole userRole;

    @Getter
    @Setter
    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("userAccessId")
    private UserAccess userAccess;
}
