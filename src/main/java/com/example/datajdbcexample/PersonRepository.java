package com.example.datajdbcexample;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<PersonWithCar, Integer> {
    @Query(value = "select person.name as name, " +
            "person.lastname as lastname, " +
            "car.model as model from person, car where person.id = car.owner")
    List<PersonWithCar> getAllPersonsWithCars();
}
