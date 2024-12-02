package com.example.demo.service;

import com.example.demo.config.Encode;
import com.example.demo.dto.FoodItemDTO;
import com.example.demo.dto.InventoryDTO;
import com.example.demo.entity.FoodItem;
import com.example.demo.entity.Inventory;
import com.example.demo.repo.FoodItemRepo;
import com.example.demo.repo.InventoryRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FoodItemServices {
    @Autowired
    private FoodItemRepo foodItemRepo;

    @Autowired
    private ModelMapper modelMapper;

    public FoodItemDTO saveFood(FoodItemDTO foodItemDTO){
        foodItemRepo.save(modelMapper.map(foodItemDTO, FoodItem.class));
        return foodItemDTO;

    }

    public List<FoodItemDTO> getAllFood()
    {
        List<FoodItem>userList=foodItemRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<FoodItemDTO>>(){}.getType());
    }

    public FoodItemDTO updateFood(FoodItemDTO foodItemDTO){
        foodItemRepo.save(modelMapper.map(foodItemDTO,FoodItem.class));
        return  foodItemDTO;
    }

    public boolean deleteFood(FoodItemDTO foodItemDTO){
        foodItemRepo.delete(modelMapper.map(foodItemDTO,FoodItem.class));
        return true;
    }

    public Optional<FoodItem> getFoodAllById(String id) {
        return foodItemRepo.findById(id);
    }


    public Optional<FoodItem> getFoodById(String id) {
        Optional<FoodItem> userDetail = foodItemRepo.findById(id);
        if (userDetail.isPresent()) {
            FoodItem foodItem = userDetail.get();
            return Optional.of(foodItem);
//            return Optional.ofNullable(user.getPassword());
        } else {
            return Optional.empty();
        }
    }
}
