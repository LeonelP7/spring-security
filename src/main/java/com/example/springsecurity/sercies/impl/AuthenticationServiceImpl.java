package com.example.springsecurity.sercies.impl;

import com.example.springsecurity.dto.SingUpRequest;
import com.example.springsecurity.entities.Role;
import com.example.springsecurity.entities.User;
import com.example.springsecurity.repositories.UserRepository;
import com.example.springsecurity.sercies.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public User singup(SingUpRequest singUpRequest){
        User user = new User();

        user.setEmail(singUpRequest.getEmail());
        user.setName(singUpRequest.getFirstName());
        user.setRole(Role.USER);
        user.setPassword(passwordEncoder.encode(singUpRequest.getPassword()));

        return userRepository.save(user);
    }
}
