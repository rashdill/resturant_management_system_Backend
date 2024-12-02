package com.example.demo.controller;

import com.example.demo.dto.MyFoodDTO;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.MyFood;
import com.example.demo.service.MyFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/order")
@CrossOrigin
public class MyFoodController {

    @Autowired
    private MyFoodService myFoodService;

    @GetMapping("/orders/{email}")
    public List<MyFood> getUserAllById(@PathVariable String email) {
        return myFoodService.getUserAllByEmail(email);
    }

    @PostMapping("/saveMyFood")
    public MyFoodDTO saveUser(@RequestBody MyFoodDTO myFoodDTO)
    {
        return myFoodService.saveMyFood(myFoodDTO);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String, Object>> deleteOrderById(@PathVariable String id) {
        boolean isDeleted = myFoodService.deleteOrdersById(id);

        Map<String, Object> response = new HashMap<>();
        if (isDeleted) {
            response.put("deletedCount", 1);
            response.put("message", "Order deleted successfully.");
        } else {
            response.put("deletedCount", 0);
            response.put("message", "No order found with ID " + id + ".");
        }

        return ResponseEntity.ok(response);
    }

}
