package com.vdaproject.templatebespring.service;

import com.vdaproject.templatebespring.model.User;
import com.vdaproject.templatebespring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User getUserById(String id) {
        return userRepository.getReferenceById(id);
    }

    // TODO: parameter nya bisa beda ga harus User
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
