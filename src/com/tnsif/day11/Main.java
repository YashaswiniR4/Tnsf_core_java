//Abstract Class
package com.tnsif.day11;

// Abstract Parent Class
abstract class Animal {

    String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract Method
    abstract void makeSound();

    // Regular Method
    void sleep() {
        System.out.println(name + " is sleeping... Zzz");
    }
}

// Concrete Child Class
class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

    // Implementation of Abstract Method
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

public class Main {

    public static void main(String[] args) {

        Dog myDog = new Dog("Tommy");

        myDog.makeSound();

        myDog.sleep();
    }
}