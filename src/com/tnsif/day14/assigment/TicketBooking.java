package com.tnsif.day14.assigment;

public class TicketBooking {

    private String stageEvent;
    private String customer;
    private int noOfSeats;

    // Default Constructor
    public TicketBooking() {
        super();
    }

    // Parameterized Constructor
    public TicketBooking(String stageEvent, String customer, int noOfSeats) {
        super();
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and Setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Cash Payment
    public void makePayment(Double amount) {
        System.out.println("Stage Event : " + stageEvent);
        System.out.println("Customer : " + customer);
        System.out.println("No of Seats : " + noOfSeats);
        System.out.println("Amount " + amount + " paid in cash");
    }

    // Wallet Payment
    public void makePayment(String walletNumber, Double amount) {
        System.out.println("Stage Event : " + stageEvent);
        System.out.println("Customer : " + customer);
        System.out.println("No of Seats : " + noOfSeats);
        System.out.println("Amount " + amount + " paid using wallet number : " + walletNumber);
    }

    // Credit Card Payment
    public void makePayment(String creditCard, String ccv, String name, Double amount) {
        System.out.println("Stage Event : " + stageEvent);
        System.out.println("Customer : " + customer);
        System.out.println("No of Seats : " + noOfSeats);
        System.out.println("Holder Name : " + name);
        System.out.println("Credit Card : " + creditCard);
        System.out.println("CCV : " + ccv);
        System.out.println("Amount " + amount + " paid using credit card");
    }
}