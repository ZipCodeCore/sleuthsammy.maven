package com.github.zipcodewilmington.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sammy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long Id;
    String bread = "wheat";
    String filling;
    String topping = "swiss";
    String condiment = "dijon";
    boolean toasted = false;

    public Sammy() {
    }

    public Sammy(String bread, String filling, String topping) {
        this.bread = bread;
        this.filling = filling;
        this.topping = topping;
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
