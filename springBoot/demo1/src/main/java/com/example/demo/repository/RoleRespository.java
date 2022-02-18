package com.example.demo.repository;

import com.example.demo.entity.Role;
import com.example.demo.jwt.ERole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRespository extends JpaRepository<Role, Integer> {
    Role findByName(ERole name);
}
