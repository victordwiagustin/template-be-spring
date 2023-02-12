package com.vdaproject.templatebespring.controller;

import com.vdaproject.templatebespring.dto.UserDto;
import com.vdaproject.templatebespring.dto.UserRegistrationDto;
import com.vdaproject.templatebespring.model.User;
import com.vdaproject.templatebespring.service.UserService;
import com.vdaproject.templatebespring.util.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/get-all-users")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String userId) {
        try {
            var users = userService.getAllUsers();

            if (users.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/register-user")
    public ResponseEntity<ServiceResponse<UserDto>> registerUser(@RequestBody UserRegistrationDto userRegistrationDTO) {
        try {
            var newSavedUser = userService.registerUser(userRegistrationDTO);
            return new ResponseEntity<>(newSavedUser, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
