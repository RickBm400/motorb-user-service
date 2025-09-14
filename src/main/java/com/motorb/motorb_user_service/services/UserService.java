
package com.motorb.motorb_user_service.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motorb.motorb_user_service.repository.UserRepositoryJpa;

@Service
public class UserService {

    @Autowired
    private UserRepositoryJpa userRepository;

    public String getUserById() {
        return userRepository.getUserById();
    }
}
