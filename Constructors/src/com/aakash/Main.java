package com.aakash;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1);
        bankAccount.setBalance(1000);
        bankAccount.setCustomerName("Mark");
        bankAccount.setEmail("mark.mark.com");
        bankAccount.setPhoneNumber(55555555);
        System.out.println("balance = " +bankAccount.getBalance());
        bankAccount.getDeposit(100);
        System.out.println("balance = " + bankAccount.getBalance());
        bankAccount.getWithdrawal(200);
        System.out.println("balance = " + bankAccount.getBalance());
        bankAccount.getWithdrawal(2000);



    }
}
