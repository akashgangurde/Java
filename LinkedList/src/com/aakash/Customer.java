package com.aakash;

public class Customer {

    private String name;
    private double balance;

    public Customer(String namel, double balance) {
        this.name = namel;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setNamel(String namel) {
        this.name = namel;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
