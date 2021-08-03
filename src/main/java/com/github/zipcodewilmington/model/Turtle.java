package com.github.zipcodewilmington.model;

import javax.persistence.*;

@Entity
public class Turtle {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name ;
    String weapon;
    public Turtle() {
    }

    public Turtle(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
