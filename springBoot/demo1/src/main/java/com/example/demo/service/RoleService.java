package com.example.demo.service;

import com.example.demo.entity.Role;
import com.example.demo.jwt.ERole;

import java.util.Optional;

public interface RoleService {
    Optional<Role> findByName(ERole name);

}
