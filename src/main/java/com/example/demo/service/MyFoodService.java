package com.example.demo.service;

import com.example.demo.dto.MyFoodDTO;
import com.example.demo.entity.FoodAdmin;
import com.example.demo.entity.MyFood;
import com.example.demo.entity.MyFoodBackup;
import com.example.demo.repo.FoodAdminRepo;
import com.example.demo.repo.MyFoodBackUpRepo;
import com.example.demo.repo.MyFoodRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class MyFoodService {

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private MyFoodBackUpRepo myFoodBackUpRepo;

    @Autowired
    private FoodAdminRepo foodAdminRepo;



    @Autowired
    private MyFoodRepo myFoodRepository;
    public List<MyFood> getUserAllByEmail(String email) {
        return myFoodRepository.findAllByBuyerEmail(email);
    }

    public MyFoodDTO saveMyFood(MyFoodDTO myFoodDTO){
        myFoodBackUpRepo.save(modelMapper.map(myFoodDTO, MyFoodBackup.class));
        foodAdminRepo.save(modelMapper.map(myFoodDTO, FoodAdmin.class));
        myFoodRepository.save(modelMapper.map(myFoodDTO, MyFood.class));
        return myFoodDTO;

    }

    public boolean deleteOrdersById(String Id) {
        myFoodBackUpRepo.deleteById(Id);
        myFoodRepository.deleteById(Id);
        return true;
    }


}
