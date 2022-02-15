package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("BMW","white",200,"2022");

        Ship ship1 = new Ship("Titanic","black",120,"1936");

        Plane plane1 = new Plane("F16","grey",1650,"2015");


        Vehicle[] vehicles = {car1,ship1,plane1};

        for (Vehicle vehicle:vehicles) {
            if(vehicle instanceof Car){
                ((Car) vehicle).drive();
                ((Car) vehicle).getInfo();
            }else if (vehicle instanceof Ship){
                ((Ship) vehicle).sail();
                ((Ship) vehicle).getInfo();
            }else if (vehicle instanceof Plane){
                ((Plane) vehicle).fly();
                ((Plane) vehicle).getInfo();
            }
        }
    }
}
