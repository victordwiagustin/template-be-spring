package com.vdaproject.templatebespring.service;

import com.vdaproject.templatebespring.model.User;

import java.util.List;

public interface UserService {
    User getUserById(String id);
    User saveUser(User user);
    List<User> getAllUsers();
}
