package com.motorb.motorb_user_service.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.motorb.motorb_user_service.dto.UserInputDto;
import com.motorb.motorb_user_service.model.UserEntity;
import com.motorb.motorb_user_service.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserEntity> getUserName() {
        return userService.getUserById();
    }

    @PostMapping()
    public ResponseEntity<UserEntity> setNewUser(@Valid @RequestBody UserInputDto entity) {
        try {
            throw new Exception("Simulated exception");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

}