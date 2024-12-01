package com.example.demo.repo;

import com.example.demo.entity.FoodItem;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FoodItemRepo extends MongoRepository<FoodItem,String> {
}
