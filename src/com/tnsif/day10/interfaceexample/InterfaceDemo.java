package com.tnsif.day10.interfaceexample;

public class InterfaceDemo implements A, B {

    public void display() {
        System.out.println("Display Method");
    }

    public void show() {
        System.out.println("Show Method");
    }

    public static void main(String[] args) {

        InterfaceDemo obj = new InterfaceDemo();

        obj.display();
        obj.show();

    }

}