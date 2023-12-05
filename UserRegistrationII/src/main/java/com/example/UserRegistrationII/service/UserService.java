package com.example.UserRegistrationII.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.UserRegistrationII.dto.UserRegistrationDto;
import com.example.UserRegistrationII.model.User;

public interface UserService extends UserDetailsService {
   User findByEmail(String email);
   User save(UserRegistrationDto registration);
}