package com.example.demo.repo;

import com.example.demo.entity.FoodAdmin;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodAdminRepo extends MongoRepository<FoodAdmin,String> {
}
