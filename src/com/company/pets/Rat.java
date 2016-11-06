package com.company.pets;

import com.company.Pet;

/**
 * Created by Anton on 07.11.2016.
 */
public class Rat extends Pet {
    public Rat() {
        setWeight(100 + Math.random() * 200);
    }

    @Override
    public String status() {
        return "Rat";
    }

    @Override
    protected void sleep() {
        System.out.println("pi-pi-pi");
    }
}
