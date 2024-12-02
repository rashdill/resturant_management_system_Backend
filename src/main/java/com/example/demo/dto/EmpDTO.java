package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class EmpDTO {
    private int id;
    private String name;
    private String email;
    private int age;
    private String phone;
    private String access;

}
