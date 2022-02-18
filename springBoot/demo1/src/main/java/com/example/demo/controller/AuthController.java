package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    AuthenticationManager authenticationManager;



    @GetMapping("/")
    public String home() {
        return null;
    }

    @GetMapping("/user")
    public String user() {
        return null;
    }

    @GetMapping("/admin")
    public String admin() {
        return null;
    }


}
