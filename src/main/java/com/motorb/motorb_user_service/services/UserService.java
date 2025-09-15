
package com.motorb.motorb_user_service.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.motorb.motorb_user_service.model.UserEntity;
import com.motorb.motorb_user_service.repository.JpaUserRepository;

@Service
public class UserService {

    @Autowired
    private JpaUserRepository userRepository;

    public List<UserEntity> getUserById() {

        List<UserEntity> users = new ArrayList<>();

        UserEntity _user = userRepository
                .save(new UserEntity("Jhon Doe", "rjbm29@gmail.com", "j_doe", "1245", "ADMIN"));

        users.add(_user);

        return users;
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
}
