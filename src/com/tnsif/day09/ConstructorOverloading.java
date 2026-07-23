package com.tnsif.day09;

public class ConstructorOverloading {

    int id;
    String name;

    ConstructorOverloading() {

        id = 100;

        name = "Default";

    }

    ConstructorOverloading(int id, String name) {

        this.id = id;

        this.name = name;

    }

    void display() {

        System.out.println("ID : " + id);

        System.out.println("Name : " + name);

    }

    public static void main(String[] args) {

        ConstructorOverloading s1 = new ConstructorOverloading();

        ConstructorOverloading s2 =
                new ConstructorOverloading(201, "Yashaswini");

        s1.display();

        s2.display();

    }

}