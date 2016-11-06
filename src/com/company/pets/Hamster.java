package com.company.pets;

import com.company.Pet;

/**
 * Created by Anton on 07.11.2016.
 */
public class Hamster extends Pet {
    public Hamster() {
        setWeight(50 + Math.random() * 100);
    }

    @Override
    public String status() {
        return "Hamster";
    }

    @Override
    protected void sleep() {
        System.out.println("fr-fr-fr");
    }
}
