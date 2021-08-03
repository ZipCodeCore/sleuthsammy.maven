package com.github.zipcodewilmington.repositories;

import com.example.demoSammy.model.Sammy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SammyRepo extends CrudRepository<Sammy, Long> {
   Iterable<Sammy> findAllByTopping(String topping);
   Iterable<Sammy> getAllByToppingAndBread(String topping, String bread);


}