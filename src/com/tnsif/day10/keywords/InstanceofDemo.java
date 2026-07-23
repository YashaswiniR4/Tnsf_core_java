package com.tnsif.day10.keywords;

public class InstanceofDemo {

    public static void main(String[] args) {

        Dog d = new Dog("Tommy", "Beagle");

        System.out.println(d instanceof Dog);

        System.out.println(d instanceof Animal);

    }

}