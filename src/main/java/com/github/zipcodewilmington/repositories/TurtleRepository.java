package com.github.zipcodewilmington.repositories;

import com.example.demoSammy.model.Turtle;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TurtleRepository extends CrudRepository<Turtle, Long> {
    List<Turtle> readAllByName(String name);
    Iterable<Turtle> getAllByIdAndNameIgnoreCase(Long id, String name);
    Iterable<Turtle> findAllByWeapon(String weapon);

    Turtle findByIdAndName(Long id, String name);

    @Query("Select t from Turtle t where t.name = ?1 and t.id = ?2")
    Turtle findATurtleByTheNameIGiveIt(String name, Long id);


}
