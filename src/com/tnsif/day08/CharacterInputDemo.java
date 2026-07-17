package com.tnsif.day08;

import java.util.Scanner;

public class CharacterInputDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character : ");

        char ch = sc.next().charAt(0);

        System.out.println("Character : " + ch);

        sc.close();
    }
}