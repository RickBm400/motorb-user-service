package com.motorb.motorb_user_service.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class UserInputDto {

    @NotNull
    @NotBlank
    public String name;
    public String email;
    public String username;
    public String password;
    public String role;

}
