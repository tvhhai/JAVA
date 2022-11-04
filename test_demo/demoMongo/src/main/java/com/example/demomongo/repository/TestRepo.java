package com.example.demomongo.repository;

import com.example.demomongo.entity.Test;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends MongoRepository<Test, String> {
}
