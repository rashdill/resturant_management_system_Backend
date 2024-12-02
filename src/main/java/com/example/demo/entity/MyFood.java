package com.example.demo.entity;


import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection = "MyFood")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Data
public class MyFood {
    @Id
    private String id;
    private String foodName;
    private String price;
    private int quantity;
    private String buyerName;
    private String buyerEmail;
    private Date buyingDate;
    private String image;
}