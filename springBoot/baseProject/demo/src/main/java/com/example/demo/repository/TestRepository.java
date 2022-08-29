package com.example.demo.repository;

import com.example.demo.entity.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends JpaRepository<Test, Integer> {
    List<Test> findByTest(boolean published);

    List<Test> findByTestContaining(String title);
}
