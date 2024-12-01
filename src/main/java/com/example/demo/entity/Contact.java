package com.example.demo.entity;

import jakarta.persistence.Id;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contact")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class Contact {

    @Id
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
