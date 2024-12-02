package com.example.demo.controller;

import com.example.demo.dto.AllFoodItemsDTO;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.AllFoodItems;
import com.example.demo.service.AllFoodItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v5/AllFood")
@CrossOrigin
public class AllFoodItemsController {
    @Autowired
    private AllFoodItemService allFoodItemService;

    @GetMapping("/getAllFoods")
    public Page<AllFoodItemsDTO> getAllFoods(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {
        return allFoodItemService.getAllFoods(page, size);
    }

    @PostMapping("/saveFoodItem")
    public AllFoodItemsDTO saveItem(@RequestBody AllFoodItemsDTO allFoodItemsDTO) {
        return allFoodItemService.saveAllFood(allFoodItemsDTO);
    }

    @PutMapping("/updateFoodItem")
    public AllFoodItemsDTO updateFoodItem(@RequestBody AllFoodItemsDTO allFoodItemsDTO) {
        return allFoodItemService.updateAllFood(allFoodItemsDTO);
    }

}
