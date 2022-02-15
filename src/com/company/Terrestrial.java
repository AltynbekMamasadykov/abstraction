package com.company;

public  abstract class Terrestrial extends Vehicle{

    public Terrestrial(String name, String color, int maxSpeed, String productionDate) {
        super(name, color, maxSpeed, productionDate);
    }


    public abstract void start();
    public abstract void finish();
}
