package com.example.demo.controller;


import com.example.demo.dto.FoodItemDTO;
import com.example.demo.dto.InventoryDTO;
import com.example.demo.entity.FoodItem;
import com.example.demo.entity.Inventory;
import com.example.demo.service.FoodItemServices;
import com.example.demo.service.InventoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v4/Food")
@CrossOrigin
public class FoodController {
    @Autowired
    private FoodItemServices inventoryServices;

    @GetMapping("/getFood")
    public List<FoodItemDTO> getFood()
    {
        return inventoryServices.getAllFood();
    }

    @PostMapping("/saveFood")
    public FoodItemDTO saveFood(@RequestBody FoodItemDTO inventoryDTO)
    {
        return inventoryServices.saveFood(inventoryDTO);
    }

    @PutMapping("/updateFood")
    public FoodItemDTO updateFood(@RequestBody FoodItemDTO inventoryDTO)
    {
        return inventoryServices.updateFood(inventoryDTO);
    }

    @DeleteMapping("/deleteFood")
    public boolean deleteFood(@RequestBody FoodItemDTO inventoryDTO)
    {
        return inventoryServices.deleteFood(inventoryDTO);
    }

    @GetMapping("/all/{id}")
    public Optional<FoodItem> getInventoryAllById(@PathVariable String id) {
        return inventoryServices.getFoodAllById(id);
    }

    @GetMapping("/{id}")
    public Optional<FoodItem> getUserById(@PathVariable String id) {
        return inventoryServices.getFoodById(id);
    }

}
