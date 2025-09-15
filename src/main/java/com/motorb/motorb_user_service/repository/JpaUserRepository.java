package com.motorb.motorb_user_service.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.motorb.motorb_user_service.model.UserEntity;

public interface JpaUserRepository extends JpaRepository<UserEntity, UUID> {

}
