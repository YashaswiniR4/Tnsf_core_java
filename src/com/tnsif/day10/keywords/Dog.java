package com.tnsif.day10.keywords;

public class Dog extends Animal {

    String breed;

    Dog(String name, String breed) {

        super(name);

        this.breed = breed;

    }

    void showDetails() {

        display();

        System.out.println("Breed : " + breed);

    }

}