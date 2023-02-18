package com.vdaproject.templatebespring.service;

import com.vdaproject.templatebespring.dto.UserDto;
import com.vdaproject.templatebespring.dto.UserRegistrationDto;
import com.vdaproject.templatebespring.model.UserRole;
import com.vdaproject.templatebespring.model.User;
import com.vdaproject.templatebespring.util.ServiceResponse;

import java.util.List;

public interface UserManagementService {
    List<User> getAllUsers();
    ServiceResponse<UserDto> registerUser(UserRegistrationDto userRegistrationDto);
    ServiceResponse<UserRole> addUserRole(String roleName);
}
