package com.aakash;

public class Main {

    public static void main(String[] args) {
        Car porche = new Car();
        Car holden = new Car();
        porche.setModel("911");
        System.out.println("The Model is " + porche.getModel());
    }
}
