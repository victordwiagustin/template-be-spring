package com.vdaproject.templatebespring.model;

import com.vdaproject.templatebespring.model.base.BaseModel;
import com.vdaproject.templatebespring.util.DateUtil;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class UserAccess extends BaseModel {
    @Getter
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Getter
    @Setter
    @Column(unique = true)
    private String accessName;

    public UserAccess(String accessName) {
        this.accessName = accessName;
        this.createdDate = DateUtil.now();
    }

}
