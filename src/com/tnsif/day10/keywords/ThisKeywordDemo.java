package com.tnsif.day10.keywords;

public class ThisKeywordDemo {

    int id;
    String name;

    ThisKeywordDemo(int id, String name) {

        this.id = id;
        this.name = name;

    }

    void display() {

        System.out.println("ID : " + id);
        System.out.println("Name : " + name);

    }

    public static void main(String[] args) {

        ThisKeywordDemo obj =
                new ThisKeywordDemo(101, "Yashaswini");

        obj.display();

    }

}