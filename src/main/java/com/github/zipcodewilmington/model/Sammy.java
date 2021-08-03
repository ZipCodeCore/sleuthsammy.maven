package com.github.zipcodewilmington.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sammy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String bread = "wheat";
    private String filling;
    private String topping = "swiss";
    private String condiment = "dijon";
    private boolean toasted = false;

    public Sammy(Long id, String bread, String filling, String topping, String condiment, boolean toasted) {
        Id = id;
        this.bread = bread;
        this.filling = filling;
        this.topping = topping;
        this.condiment = condiment;
        this.toasted = toasted;
    }

    public Sammy() {
        this(
                null,
                "wheat",
                null,
                "swiss",
                "dijon",
                false
        );
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getFilling() {
        return filling;
    }

    public void setFilling(String filling) {
        this.filling = filling;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public String getCondiment() {
        return condiment;
    }

    public void setCondiment(String condiment) {
        this.condiment = condiment;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    @Override
    public String toString() {
        try {
            return new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "Sandwich{" +
                    "Id=" + Id +
                    ", bread='" + bread + '\'' +
                    ", filling=" + filling +
                    ", topping='" + topping + '\'' +
                    ", condiment='" + condiment + '\'' +
                    ", toasted=" + toasted +
                    '}';
        }
    }
}
