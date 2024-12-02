package com.example.demo.service;

import com.example.demo.dto.AllFoodItemsDTO;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.AllFoodItems;
import com.example.demo.entity.User;
import com.example.demo.repo.AllFoodItemsRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Transactional
public class AllFoodItemService {
    @Autowired
    private AllFoodItemsRepo foodItemRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Page<AllFoodItemsDTO> getAllFoods(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<AllFoodItems> foodItemPage = foodItemRepository.findAll(pageable);

        return foodItemPage.map(AllFootItems -> modelMapper.map(AllFootItems, AllFoodItemsDTO.class));
    }

    public AllFoodItemsDTO saveAllFood(AllFoodItemsDTO foodItemDTO){
        foodItemRepository.save(modelMapper.map(foodItemDTO, AllFoodItems.class));
        return foodItemDTO;

    }

    public AllFoodItemsDTO updateAllFood(AllFoodItemsDTO allFoodItemsDTO){
        foodItemRepository.save(modelMapper.map(allFoodItemsDTO, AllFoodItems.class));
        return  allFoodItemsDTO;
    }



}
