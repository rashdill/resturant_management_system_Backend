package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class FoodItemDTO {
    private String foodName;
    private String image;
    private String category;
    private int quantity;
    private double price;
    private String userName;
    private String userEmail;
    private String country;
    private String shortDescription;
    private String description;
    private int count;

}
