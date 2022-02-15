package com.company;

public abstract class Air extends Vehicle {

    public Air(String name, String color, int maxSpeed, String productionDate) {
        super(name, color, maxSpeed, productionDate);
    }

    public abstract void start();
    public abstract void finish();
}
