package com.motorb.motorb_user_service.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserInputDto {

    @NotNull
    @NotBlank
    public String name;

    @Email
    @NotNull
    @NotBlank
    public String email;

    @NotBlank
    @NotNull
    public String username;

    @NotBlank
    @NotNull
    public String password;

    @NotBlank
    @NotNull
    public String role;

}
