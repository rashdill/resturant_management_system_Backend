package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Inventory")  // Specifies the collection in MongoDB
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Inventory {
    @Id
    private String itemID;
    private String itemName;
    private String itemCatogary;
    private String buyDate;
    private String dateOfRemove;
    private double Price;
}
