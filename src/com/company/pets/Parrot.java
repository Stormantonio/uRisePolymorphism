package com.company.pets;

import com.company.Pet;
import com.company.interfaces.Bird;

/**
 * Created by Anton on 06.11.2016.
 */
public class Parrot extends Pet implements Bird {
    public Parrot() {
        setWeight(50 + Math.random() * 250);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Kesha horoshyi");
    }

    @Override
    public String status() {
        return "Parrot";
    }

    @Override
    protected void sleep() {
        System.out.println("zzz");
    }

    @Override
    public void fly() {
        System.out.println("flying");
    }
}
