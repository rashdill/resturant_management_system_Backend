package com.example.demo.repo;

import com.example.demo.dto.AllFoodItemsDTO;
import com.example.demo.entity.AllFoodItems;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface AllFoodItemsRepo extends MongoRepository<AllFoodItems,String> {

}
