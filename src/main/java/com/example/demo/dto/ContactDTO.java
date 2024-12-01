package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ContactDTO {

    private Long id;
    private String name;
    private String email;
    private int age;
    private String phone;
    private String address;
    private String city;
    private String zipCode;
    private Long registrarId;
}
