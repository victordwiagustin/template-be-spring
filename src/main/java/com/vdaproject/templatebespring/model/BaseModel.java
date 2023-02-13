package com.vdaproject.templatebespring.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Timestamp;

@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter
    @Setter
    private Timestamp createdDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Getter
    @Setter
    private Timestamp updatedDate;
}
