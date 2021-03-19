package com.aakash;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Base Burger", "White Bread", "Chicken");
        hamburger.addAdditions(1);
        hamburger.addAdditions(2);
        hamburger.addAdditions(4);
        hamburger.getTotalPrice();

        HealthyBurger healthyBurger = new HealthyBurger();
        healthyBurger.addAdditions(2);
        healthyBurger.addAdditions(5);
        healthyBurger.addAdditions(6);
        healthyBurger.getTotalPrice();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.getTotalPrice();

    }
}
