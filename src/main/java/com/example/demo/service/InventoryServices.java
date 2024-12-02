package com.example.demo.service;

import com.example.demo.config.Encode;
import com.example.demo.dto.EmpDTO;
import com.example.demo.dto.InventoryDTO;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.Emp;
import com.example.demo.entity.Inventory;
import com.example.demo.repo.EmpRepo;
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
public class InventoryServices {
    @Autowired
    private InventoryRepo inventoryRepo;

    @Autowired
    private ModelMapper modelMapper;


    Encode encode=new Encode();

    public InventoryDTO saveInventory(InventoryDTO inventoryDTO){
        inventoryRepo.save(modelMapper.map(inventoryDTO, Inventory.class));
        return inventoryDTO;

    }

    public List<InventoryDTO> getAllInventory()
    {
        List<Inventory>userList=inventoryRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<InventoryDTO>>(){}.getType());
    }

    public InventoryDTO updateInventory(InventoryDTO inventoryDTO){
        inventoryRepo.save(modelMapper.map(inventoryDTO,Inventory.class));
        return  inventoryDTO;
    }

    public boolean deleteInventory(InventoryDTO inventoryDTO){
        inventoryRepo.delete(modelMapper.map(inventoryDTO,Inventory.class));
        return true;
    }

    public Optional<Inventory> getInventoryAllById(String id) {
        return inventoryRepo.findById(id);
    }


    public Optional<Inventory> getInventoryById(String id) {
        Optional<Inventory> userDetail = inventoryRepo.findById(id);
        if (userDetail.isPresent()) {
            Inventory inventory = userDetail.get();
            return Optional.of(inventory);
//            return Optional.ofNullable(user.getPassword());
        } else {
            return Optional.empty();
        }
    }
}
