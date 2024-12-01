package com.example.demo.service;


import com.example.demo.config.Encode;
import com.example.demo.dto.EmpDTO;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.Emp;
import com.example.demo.entity.User;
import com.example.demo.repo.EmpRepo;
import com.example.demo.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class EmpService {
    @Autowired
    private EmpRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;


    Encode encode=new Encode();

    public EmpDTO saveUSer(EmpDTO userdto){
        userRepo.save(modelMapper.map(userdto, Emp.class));
        return userdto;

    }

    public List<EmpDTO> getAllusers()
    {
        List<Emp>userList=userRepo.findAll();
        return modelMapper.map(userList,new TypeToken<List<EmpDTO>>(){}.getType());
    }

    public EmpDTO updateUser(EmpDTO userdto){
        userRepo.save(modelMapper.map(userdto,Emp.class));
        return  userdto;
    }

    public boolean deleteUser(EmpDTO userdto){
        userRepo.delete(modelMapper.map(userdto,Emp.class));
        return true;
    }

    public Optional<Emp> getUserAllById(String id) {
        return userRepo.findById(id);
    }


//    public Optional<String> getUserById(String id) {
//        Optional<Emp> userDetail=userRepo.findById(id);
//        if (userDetail.isPresent()) {
//            Emp user = userDetail.get();
//            return Optional.ofNullable(user.getPassword());
//        } else {
//            return Optional.empty();
//        }
//    }
//    public Optional<String> logIn(String id, String password) {
//
//        Optional<Emp> userOptional = userRepo.findById(id);
//
//
//        if (userOptional.isPresent()) {
//            Emp user = userOptional.get();
//            if (user.getPassword().equals(password)) {
//
//                return Optional.of("User logged in: " + user.getName());
//            } else {
//
//                return Optional.of("Invalid password for user");
//            }
//        } else {
//
//            return Optional.of("User not found for ID");
//        }
//    }
}
