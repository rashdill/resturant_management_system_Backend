package com.example.demo.entity;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Food_Items")  // Specifies the collection in MongoDB
@NoArgsConstructor
@AllArgsConstructor
@Data
public class FoodItem {
    @Id
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
