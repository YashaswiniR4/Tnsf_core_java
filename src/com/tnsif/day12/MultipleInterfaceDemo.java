package com.tnsif.day12;

public class MultipleInterfaceDemo implements A, B {

    @Override
    public void show() {

        System.out.println("Show Method");

    }

    @Override
    public void display() {

        System.out.println("Display Method");

    }

    public static void main(String[] args) {

        MultipleInterfaceDemo obj = new MultipleInterfaceDemo();

        obj.show();
        obj.display();

    }

}