package com.tnsif.day13.assignment;

public class Main {

    public static void main(String[] args) {

        AirIndia airIndia = new AirIndia(5, 2500);
        KingFisher kingFisher = new KingFisher(5, 2500);
        Indigo indigo = new Indigo(5, 2500);

        System.out.printf("AirIndia Amount : %.2f%n", airIndia.calculateAmount());
        System.out.printf("KingFisher Amount : %.2f%n", kingFisher.calculateAmount());
        System.out.printf("Indigo Amount : %.2f%n", indigo.calculateAmount());
    }
}
