package com.company;

public class Car extends  Terrestrial{
    public Car(String name, String color, int maxSpeed, String productionDate) {
        super(name, color, maxSpeed, productionDate);
    }


    @Override
    public void start() {
        System.out.println("Start engine Car (Parent class method)");
    }

    @Override
    public void finish() {
        System.out.println("Stop engine Car (Parent class method)");
    }

    @Override
    public void run() {
        System.out.println(" Run Grand Parent class method");
    }
    public void drive(){
        System.out.println("Drive the "+getName());
    }

    public void getInfo(){
        System.out.println("Name: "+getName()+"\n"
                            +"Color: "+getColor()+"\n"
                            +"Production: "+getProductionDate()+"\n"
                            +"Max Speed: "+getMaxSpeed());
    }
}
