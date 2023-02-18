package com.vdaproject.templatebespring.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.vdaproject.templatebespring.dto.UserDto;
import com.vdaproject.templatebespring.dto.UserRegistrationDto;
import com.vdaproject.templatebespring.dto.UserRoleDto;
import com.vdaproject.templatebespring.model.User;
import com.vdaproject.templatebespring.model.UserRole;
import com.vdaproject.templatebespring.service.UserManagementService;
import com.vdaproject.templatebespring.util.ServiceResponse;
import netscape.javascript.JSObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserManagementService userManagementService;

    @GetMapping("/get-all-users")
    public ResponseEntity<List<User>> getAllUsers(@RequestParam(required = false) String userId) {
        try {
            var users = userManagementService.getAllUsers();

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
            var result = userManagementService.registerUser(userRegistrationDTO);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/add-user-role")
    public ResponseEntity<ServiceResponse<UserRole>> addUserRole(@RequestBody UserRoleDto userRoleDto) {
        try {
            var result = userManagementService.addUserRole(userRoleDto.getRoleName());
            return new ResponseEntity<>(result, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
