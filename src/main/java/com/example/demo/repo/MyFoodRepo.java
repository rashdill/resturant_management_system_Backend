package com.example.demo.repo;

import com.example.demo.entity.MyFood;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MyFoodRepo extends MongoRepository<MyFood,String> {
    List<MyFood> findAllByBuyerEmail(String buyerEmail);

    void deleteByBuyerEmail(String buyerEmail);
}
