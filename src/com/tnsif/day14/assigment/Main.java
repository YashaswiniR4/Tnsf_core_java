package com.tnsif.day14.assigment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read event details
        String input = sc.nextLine();

        String[] data = input.split(",");

        int seats = Integer.parseInt(data[2]);

        TicketBooking obj1 = new TicketBooking(data[0], data[1], seats);

        // Read payment choice
        int choice = sc.nextInt();

        if (choice == 1) {

            double amount = sc.nextDouble();
            obj1.makePayment(amount);

        } else if (choice == 2) {

            double amount = sc.nextDouble();
            String walletNumber = sc.next();
            obj1.makePayment(walletNumber, amount);

        } else if (choice == 3) {

            String name = sc.next();
            double amount = sc.nextDouble();
            String creditCard = sc.next();
            String ccv = sc.next();

            obj1.makePayment(creditCard, ccv, name, amount);

        } else {

            System.out.println("Invalid Choice");

        }

        sc.close();
    }
}