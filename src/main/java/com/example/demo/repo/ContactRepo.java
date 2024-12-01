package com.example.demo.repo;

import com.example.demo.entity.Contact;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ContactRepo extends MongoRepository<Contact,String> {
}
