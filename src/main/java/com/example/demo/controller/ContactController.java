package com.example.demo.controller;


import com.example.demo.config.Encode;
import com.example.demo.dto.ContactDTO;
import com.example.demo.dto.EmpDTO;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.Contact;
import com.example.demo.entity.Emp;
import com.example.demo.entity.User;
import com.example.demo.service.ContactServices;
import com.example.demo.service.EmpService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v2/Contact")
@CrossOrigin
public class ContactController {
    @Autowired
    private ContactServices userService;
    Encode encode=new Encode();


    @GetMapping("/getContact")
    public List<ContactDTO> getEmployee()
    {
        return userService.getAllusers();
    }

    @PostMapping("/saveContact")
    public ContactDTO saveEmployee(@RequestBody ContactDTO userdto)
    {
        return userService.saveUSer(userdto);
    }

    @PutMapping("/updateContact")
    public ContactDTO updateEmployee(@RequestBody ContactDTO userdto)
    {
        return userService.updateUser(userdto);
    }

    @DeleteMapping("/deleteContact")
    public boolean deleteEmployee(@RequestBody ContactDTO userdto)
    {
        return userService.deleteUser(userdto);
    }

    @GetMapping("/all/{id}")
    public Optional<Contact> getUserAllById(@PathVariable String id) {
        return userService.getUserAllById(id);
    }

}
