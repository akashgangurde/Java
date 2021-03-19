package com.aakash;

import javax.crypto.spec.PSource;

public class BankAccount {

    private int accountNumber;
    private int balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public int getBalance() {
        return balance;
    }

    public  int getAccountNumber(){
        return accountNumber;
    }
    public String getCustomerName(){
        return customerName;
    }
    public String getEmail(){
        return email;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getDeposit(int deposit) {

        this.balance = deposit + this.balance;

        if (this.balance < 0){
            return -1;
        } else {
            return this.balance;
        }

    }

    public int getWithdrawal (int withdrawal) {

        if (this.balance - withdrawal > 0) {
            this.balance = this.balance - withdrawal;
            return this.balance;
        } else {
            System.out.println("Only " + this.balance + " available cannot process request");
            return -1;
        }
    }

}
