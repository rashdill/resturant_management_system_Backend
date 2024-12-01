package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")  // Specifies the collection in MongoDB
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {

    @Id
    private String userName;

    private String firstName;
    private String lastName;
    private String address;
    private String area;
    private String city;
    private String pinCode;
    private String phonenNmber;
    private String monileNo;
    private String notes;
    private String email;
    private String password;
    private double weight;
    private double height;
    private String confirmationToken;
    private boolean confirmed;
}