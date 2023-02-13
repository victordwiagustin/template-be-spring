package com.vdaproject.templatebespring.dto;

import lombok.Getter;
import lombok.Setter;

public class UserRegistrationDto {
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
}
