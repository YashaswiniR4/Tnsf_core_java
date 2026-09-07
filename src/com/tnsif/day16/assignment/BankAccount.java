package com.tnsif.day16.assignment;

public class BankAccount {

    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }

        balance += amount;
        System.out.println("Amount deposited successfully.");
    }

    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientFundsException {

        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }

        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance.");
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully.");
    }

    public void displayBalance() {
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance : " + balance);
    }
}