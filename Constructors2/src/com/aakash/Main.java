package com.aakash;

public class Main {

    public static void main(String[] args) {

//        Account bobsAccount = new Account(); // "12345", 0.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
//        System.out.println(bobsAccount.getNumber());
//        System.out.println(bobsAccount.getBalance());
//
////        bobsAccount.setNumber("12345");
////        bobsAccount.setBalance(0.00);
////        bobsAccount.setCustomerName("Bob Brown");
////        bobsAccount.setCustomerEmailAddress("myemail@bob.com");
////        bobsAccount.setCustomerEmailAddress("(087) 123-4567");
//
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(50);
//        bobsAccount.withdrawal(100);
//
//        bobsAccount.deposit(51);
//        bobsAccount.withdrawal(100);
//
//        Account timsAccount = new Account("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

//        VipCustomer bobsAccount = new VipCustomer();
//        System.out.println("name = " + bobsAccount.getName());
//        System.out.println("credit limit = " + bobsAccount.getCreditLimit());
//        System.out.println("email = " + bobsAccount.getCreditLimit());

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 25000.00);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim", 100.00, "tim@email.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmailAddress());




    }
}
