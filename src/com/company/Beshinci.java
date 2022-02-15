package com.company;

public class Beshinci extends  Terrestrial{
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
        System.out.println("one");
    }

    public void ekinchimetod(){
        System.out.println("two");
    }

    public  void uchunchumetod(){System.out.println("three");}

    public  void tortunchumetod(){
        System.out.println("four");
    }
}
