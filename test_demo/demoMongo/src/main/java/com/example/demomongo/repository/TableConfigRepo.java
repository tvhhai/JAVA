package com.example.demomongo.repository;

import com.example.demomongo.entity.TableConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TableConfigRepo extends MongoRepository<TableConfig, String> {
    TableConfig findByTableId(String TableId);
}
