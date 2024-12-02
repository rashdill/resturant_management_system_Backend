package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Employee")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Emp {

    @Id
    private int id;
    private String name;
    private String email;
    private int age;
    private String phone;
    private String access;

}
