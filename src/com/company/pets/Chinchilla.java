package com.company.pets;

import com.company.Pet;

/**
 * Created by Anton on 07.11.2016.
 */
public class Chinchilla extends Pet {
    public Chinchilla() {
        setWeight(300 + Math.random() * 200);
    }

    @Override

    public String status() {
        return "Chinchilla";
    }

    @Override
    protected void sleep() {
        System.out.println("fiu-fiu-fiu");
    }
}
