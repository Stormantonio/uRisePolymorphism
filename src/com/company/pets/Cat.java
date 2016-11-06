package com.company.pets;

import com.company.Pet;

/**
 * Created by Anton on 06.11.2016.
 */
public class Cat extends Pet {

    public Cat() {
        setWeight(1000 + Math.random() * 2000);
    }

    public void voice() {
        super.voice();
        System.out.println("Meow");
    }

    @Override
    public String status() {
       return "Cat";
    }

    @Override
    protected void sleep() {
        System.out.println("Mur");
    }
}
