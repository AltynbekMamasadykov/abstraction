package com.company;

public class Ship extends Aqueous{
    public Ship(String name, String color, int maxSpeed, String productionDate) {
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

    public void sail(){
        System.out.println(getName()+" sails");
    }

    public void getInfo(){
        System.out.println("Name: "+getName()+"\n"
                +"Color: "+getColor()+"\n"
                +"Production: "+getProductionDate()+"\n"
                +"Max Speed: "+getMaxSpeed());
    }
}
