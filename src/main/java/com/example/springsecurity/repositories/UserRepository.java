package com.example.springsecurity.repositories;

import com.example.springsecurity.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
