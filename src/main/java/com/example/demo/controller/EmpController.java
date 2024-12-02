package com.example.demo.controller;


import com.example.demo.config.Encode;
import com.example.demo.dto.EmpDTO;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.Emp;
import com.example.demo.entity.User;
import com.example.demo.service.EmpService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v2/employee")
@CrossOrigin
public class EmpController {
    @Autowired
    private EmpService userService;
    Encode encode=new Encode();


    @GetMapping("/getEmployee")
    public List<EmpDTO> getEmployee()
    {
        return userService.getAllusers();
    }

    @PostMapping("/saveEmployee")
    public EmpDTO saveEmployee(@RequestBody EmpDTO userdto)
    {
        return userService.saveUSer(userdto);
    }

    @PutMapping("/updateEmployee")
    public EmpDTO updateEmployee(@RequestBody EmpDTO userdto)
    {
        return userService.updateUser(userdto);
    }

    @DeleteMapping("/deleteEmployee")
    public boolean deleteEmployee(@RequestBody EmpDTO userdto)
    {
        return userService.deleteUser(userdto);
    }

    @GetMapping("/all/{id}")
    public Optional<Emp> getUserAllById(@PathVariable String id) {
        return userService.getUserAllById(id);
    }

}
