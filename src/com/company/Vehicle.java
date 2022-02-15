package com.company;

public abstract class Vehicle {
    private String name;
    private String color;
    private int maxSpeed;
    private String productionDate;

    public Vehicle(String name, String color, int maxSpeed, String productionDate) {
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.productionDate = productionDate;
    }

    public abstract void run();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(String productionDate) {
        this.productionDate = productionDate;
    }
}
