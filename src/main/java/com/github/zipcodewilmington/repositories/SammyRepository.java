package com.github.zipcodewilmington.repositories;


import com.github.zipcodewilmington.model.Sammy;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SammyRepository extends CrudRepository<Sammy, Long> {
   Iterable<Sammy> findAllByTopping(String topping);
   Iterable<Sammy> getAllByToppingAndBread(String topping, String bread);


}