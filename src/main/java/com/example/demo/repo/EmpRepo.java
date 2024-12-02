package com.example.demo.repo;

import com.example.demo.entity.Emp;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmpRepo extends MongoRepository<Emp,String> {
}
