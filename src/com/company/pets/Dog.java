package com.company.pets;

import com.company.Pet;

/**
 * Created by Anton on 06.11.2016.
 */
public class Dog extends Pet {

    public Dog() {
        setWeight(1500 + Math.random() * 5000);
    }

    public void voice() {
        super.voice();
        System.out.println("Uff");
    }

    @Override
    public String status() {
        return "Dog";
    }

    @Override
    protected void sleep() {
        System.out.println("Rrrr");
    }
}
