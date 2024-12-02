package com.example.demo.repo;

import com.example.demo.entity.MyFoodBackup;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MyFoodBackUpRepo extends MongoRepository<MyFoodBackup,String> {
    void deleteByBuyerEmail(String buyerEmail);
}
