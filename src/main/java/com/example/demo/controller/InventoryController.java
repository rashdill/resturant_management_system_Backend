package com.example.demo.controller;

import com.example.demo.dto.InventoryDTO;
import com.example.demo.entity.Inventory;
import com.example.demo.service.InventoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v3/Inventory")
@CrossOrigin
public class InventoryController {
    @Autowired
    private InventoryServices inventoryServices;

    @GetMapping("/getInventory")
    public List<InventoryDTO> getInventory()
    {
        return inventoryServices.getAllInventory();
    }

    @PostMapping("/saveInventory")
    public InventoryDTO saveInventory(@RequestBody InventoryDTO inventoryDTO)
    {
        return inventoryServices.saveInventory(inventoryDTO);
    }

    @PutMapping("/updateInventory")
    public InventoryDTO updateInventory(@RequestBody InventoryDTO inventoryDTO)
    {
        return inventoryServices.updateInventory(inventoryDTO);
    }

    @DeleteMapping("/deleteInventory")
    public boolean deleteInventory(@RequestBody InventoryDTO inventoryDTO)
    {
        return inventoryServices.deleteInventory(inventoryDTO);
    }

    @GetMapping("/all/{id}")
    public Optional<Inventory> getInventoryAllById(@PathVariable String id) {
        return inventoryServices.getInventoryAllById(id);
    }

    @GetMapping("/{id}")
    public Optional<Inventory> getUserById(@PathVariable String id) {
        return inventoryServices.getInventoryById(id);
    }

}
