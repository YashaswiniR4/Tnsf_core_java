package com.tnsif.day06;

public class Person {

    private int id;

    public String name;

    protected long phoneNumber;

    String address;

    public void display() {

        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phoneNumber);
        System.out.println("Address : " + address);

    }

}