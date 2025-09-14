package com.motorb.motorb_user_service.repository;

import org.springframework.stereotype.Repository;

import com.motorb.motorb_user_service.domain.UserRepository;

@Repository
public class UserRepositoryJpa implements UserRepository {

    @Override
    public String getUserString() {
        return "get user string repository";
    }

    @Override
    public String getUserById() {
        return "get repository user id dddd";
    }

    @Override
    public void postUser() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void deleteUser() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void updateUser() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
