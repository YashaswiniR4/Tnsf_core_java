package com.tnsif.day16.assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, balance);

        try {

            System.out.print("Enter Deposit Amount: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter Withdrawal Amount: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);

        } catch (InvalidAmountException | InsufficientFundsException e) {

            System.out.println(e.getMessage());

        } finally {

            System.out.println("\nFinal Account Details");
            account.displayBalance();
            sc.close();

        }

    }
}