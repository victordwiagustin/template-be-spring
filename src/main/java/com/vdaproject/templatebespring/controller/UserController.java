package com.vdaproject.templatebespring.controller;

import com.vdaproject.templatebespring.dto.UserRegistrationDTO;
import com.vdaproject.templatebespring.model.User;
import com.vdaproject.templatebespring.service.UserService;
import com.vdaproject.templatebespring.util.DTOMapper;
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

    @Autowired
    private DTOMapper dtoMapper;

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
    public ResponseEntity<User> registerUser(@RequestBody UserRegistrationDTO userRegistrationDTO) {
        try {
            // TODO: change saveUser parameter from User to UserRegistrationDTO
            // TODO: validation exist, username criteria, etc
            // TODO: response object DTO -> hide the password + wrapped by object payload
            var user = dtoMapper.convertDtoToUser(userRegistrationDTO);
            var savedUser = userService.saveUser(user);
            return new ResponseEntity<>(savedUser, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
