package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserService extends UserDetailsService{
    Boolean checkExistUsername(String username);
    Boolean checkExistEmail(String email);
}
