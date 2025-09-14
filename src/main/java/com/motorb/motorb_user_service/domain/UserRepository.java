package com.motorb.motorb_user_service.domain;

public interface UserRepository {
    String getUserString();

    String getUserById();

    void postUser();

    void deleteUser();

    void updateUser();
}
