package com.example.demotransaction.repository;

import com.example.demotransaction.entity.TransactLog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactLogRepository extends JpaRepository<TransactLog, Long> {
}
