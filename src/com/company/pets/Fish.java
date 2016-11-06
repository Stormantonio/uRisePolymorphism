package com.company.pets;

import com.company.Pet;
import com.company.interfaces.FishInterface;

/**
 * Created by Anton on 06.11.2016.
 */
public class Fish extends Pet implements FishInterface{
    public Fish() {
        setWeight(100 + Math.random() * 3000);
    }

    @Override
    public String status() {
        return "Fish";
    }

    @Override
    protected void sleep() {
        System.out.println("bul-bul-bul");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}
