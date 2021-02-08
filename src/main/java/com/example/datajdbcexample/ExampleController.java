package com.example.datajdbcexample;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ExampleController {
    private final PersonRepository personRepository;

    @GetMapping("/")
    Iterable<PersonWithCar> getAllPersonsWithCars() {
        return personRepository.getAllPersonsWithCars();
    }
}
