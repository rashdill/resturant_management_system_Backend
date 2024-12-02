package com.example.demo.dto;

import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class MyFoodDTO {
    private String id;
    private String foodName;
    private String price;
    private int quantity;
    private String buyerName;
    private String buyerEmail;
    private Date buyingDate;
    private String image;
}
