package com.example.springsecurity.controller;

import com.example.springsecurity.dto.JwtAuthenticationResponse;
import com.example.springsecurity.dto.RefreshTokenRequest;
import com.example.springsecurity.dto.SigninRequest;
import com.example.springsecurity.dto.SingUpRequest;
import com.example.springsecurity.entities.User;
import com.example.springsecurity.sercies.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SingUpRequest singUpRequest){
        return ResponseEntity.ok(authenticationService.singup(singUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest signinRequest){
        return ResponseEntity.ok(authenticationService.signin(signinRequest));
    }

    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> refresh(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
}
