package com.example.demo.dto;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class userDTO {
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
    private String password;
    private String email;
    private boolean confirmed;
    private String confirmationToken;


}
