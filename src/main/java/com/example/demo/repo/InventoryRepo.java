package com.example.demo.repo;

import com.example.demo.entity.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepo extends MongoRepository<Inventory,String> {
}
