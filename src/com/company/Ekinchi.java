package com.company;

public class Ekinchi extends Air {

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
        System.out.println("odin");
    }

    public void ekinchimetod(){
        System.out.println("dva");
    }

    public  void uchunchumetod(){
        System.out.println("tri");
    }

    public  void tortunchumetod(){
        System.out.println("chetire");
    }
}
