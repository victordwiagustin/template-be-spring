package com.vdaproject.templatebespring.dto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

public class UserDto {
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
    private Timestamp registrationDate;

}
