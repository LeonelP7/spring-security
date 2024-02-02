package com.example.springsecurity.sercies;

import com.example.springsecurity.dto.JwtAuthenticationResponse;
import com.example.springsecurity.dto.SigninRequest;
import com.example.springsecurity.dto.SingUpRequest;
import com.example.springsecurity.entities.User;

public interface AuthenticationService {
    User singup(SingUpRequest singUpRequest);

    JwtAuthenticationResponse signin(SigninRequest signinRequest);
}
