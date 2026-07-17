package com.tnsif.day08;

import java.util.Scanner;

public class ScannerDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter your Age : ");
        int age = sc.nextInt();

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);

        sc.close();
    }
}