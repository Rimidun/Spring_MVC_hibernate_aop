package com.spring.mvc_hibernate_aop.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name = "heroes_dota")
public class HeroesDota {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Size(min = 2, max = 50, message = "name must be min 2 symbol")
    @Column(name = "name")
    private String name;
    @Column(name = "race")
    private String race;
    @Column(name = "attribute")
    private String attribute;
    @Column(name = "damage")
    private int damage;

    public HeroesDota() {
    }

    public HeroesDota(String name, String race, String attribute, int damage) {
        this.name = name;
        this.race = race;
        this.attribute = attribute;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "HeroesDota{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", race='" + race + '\'' +
                ", attribute='" + attribute + '\'' +
                ", damage=" + damage +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
