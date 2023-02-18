package com.vdaproject.templatebespring.model.base;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @Getter
    @Setter
    protected Timestamp createdDate;

    @Getter
    @Setter
    protected Timestamp updatedDate;
}
