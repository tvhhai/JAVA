package com.example.demo.service.impl;

import com.example.demo.entity.Role;
import com.example.demo.jwt.ERole;
import com.example.demo.repository.RoleRespository;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoleImpl implements RoleService {
    @Autowired //inject bean
    private RoleRespository roleRespository;

    @Override
    public Optional<Role> findByName(ERole name) {
        return Optional.ofNullable(roleRespository.findByName(name));
    }
}
