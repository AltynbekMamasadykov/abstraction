package com.company;

public class Main {

    public static void main(String[] args) {
        Air birinchi = new Birinchi();
        birinchi.run();
        birinchi.start();
        ((Birinchi) birinchi).tortunchumetod();
        birinchi.finish();

        Air ekinchi =new Ekinchi();
        ekinchi.run();
        ekinchi.start();
        ((Ekinchi) ekinchi).ekinchimetod();
        ekinchi.finish();

        Air[] uchkandar = {birinchi,ekinchi};



        Aqueous uchunchu = new Uchunchu();
        Aqueous tortunchu = new Tortunchu();

        Aqueous[] suzgondor = {uchunchu,tortunchu};


        Terrestrial beshinchi = new Beshinci();
        Terrestrial altinchi = new Altinchi();

        Terrestrial[] jurgondor = {beshinchi,altinchi};


        Vehicle[] baary = {uchkandar,suzgondor,jurgondor};



    }
}
