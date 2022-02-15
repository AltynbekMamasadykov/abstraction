package com.company;

public class Plane extends Air{
    public Plane(String name, String color, int maxSpeed, String productionDate) {
        super(name, color, maxSpeed, productionDate);
    }

    @Override
    public void start() {

    }

    @Override
    public void finish() {

    }

    @Override
    public void run() {

    }

    public void fly(){
        System.out.println(getName()+" flies");
    }

    public void getInfo(){
        System.out.println("Name: "+getName()+"\n"
                +"Color: "+getColor()+"\n"
                +"Production: "+getProductionDate()+"\n"
                +"Max Speed: "+getMaxSpeed());
    }
}
