package com.example.datajdbcexample;

import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class PersonWithCar {
    private String name;
    private String lastname;
    private String model;
}
