package com.example.springsecurity.dto;

import lombok.Data;

@Data
public class SingUpRequest {

    private String firstName;

    private String email;

    private String password;

}
