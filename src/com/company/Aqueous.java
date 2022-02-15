package com.company;

public abstract class Aqueous extends Vehicle{
    public Aqueous(String name, String color, int maxSpeed, String productionDate) {
        super(name, color, maxSpeed, productionDate);
    }

    public abstract void start();
    public abstract void finish();
}
