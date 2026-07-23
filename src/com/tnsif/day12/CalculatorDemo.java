package com.tnsif.day12;

public class CalculatorDemo implements Calculator {

    @Override
    public void calculate() {

        System.out.println("Calculation Done");

    }

    public static void main(String[] args) {

        CalculatorDemo obj = new CalculatorDemo();

        obj.calculate();

    }

}