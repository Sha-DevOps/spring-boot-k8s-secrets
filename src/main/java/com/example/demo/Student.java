package com.example.demo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Student {

    @Id
    private String studentId = UUID.randomUUID().toString();
    private String studentName;
    private String street;
    private String city;
    private String country;
    private String pincode;
}


