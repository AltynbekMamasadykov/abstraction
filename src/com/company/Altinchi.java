package com.company;

public class Altinchi extends Terrestrial{
    @Override
    public void start() {
        System.out.println("start kil");

    }

    @Override
    public void finish() {
        System.out.println("finish kil");
    }

    @Override
    public void run() {
        System.out.println("ishte");
    }

    public void birinchimetod(){
        System.out.println("einz");
    }

    public void ekinchimetod(){
        System.out.println("zwei");
    }

    public  void uchunchumetod(){
        System.out.println("drei");
    }

    public  void tortunchumetod(){
        System.out.println("vier");
    }
}
