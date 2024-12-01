package com.example.demo.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class InventoryDTO {
    private String itemID;
    private String itemName;
    private String itemCatogary;
    private String buyDate;
    private String dateOfRemove;
    private double Price;

}
