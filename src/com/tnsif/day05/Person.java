package com.tnsif.day05;

public class Person {

    private int id = 101;

    public String name = "Yashaswini";

    protected long phoneNumber = 9876543210L;

    String address = "Mysuru";

    public void display() {

        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Phone : " + phoneNumber);
        System.out.println("Address : " + address);

    }

}