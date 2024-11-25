package com.example.demo.controller;

import com.example.demo.config.Encode;
import com.example.demo.dto.userDTO;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.transaction.Transactional;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    Encode encode=new Encode();

//    mailController mail=new mailController();


    @PostMapping("/saveUser")
    public userDTO saveUser(@RequestBody userDTO userdto)
    {
            return userService.saveUSer(userdto);
    }

    


}
