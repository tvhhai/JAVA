package com.example.demotransaction.repository;

import com.example.demotransaction.entity.AllLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllLogRepository extends JpaRepository<AllLog, Long> {
}
