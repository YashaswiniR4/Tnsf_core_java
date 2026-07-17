package com.tnsif.day02;

public class OOPDemo {

    public static void main(String[] args) {

        Car c = new Car();

        System.out.println("Brand : " + c.brand);
        System.out.println("Color : " + c.color);

        c.start();
        c.stop();
    }
}