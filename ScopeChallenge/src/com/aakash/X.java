package com.aakash;

import java.util.Scanner;

public class X {

    Scanner scanner = new Scanner(System.in);
    private int x;

    public X() {
        System.out.println("Enter the value of x");
        this.x = scanner.nextInt();
        scanner.nextLine();
        System.out.println("X created, x = " + this.x);
    }

    public void x() {

        for (int x = 0; x <= 12; x++) {
            System.out.println(this.x + " times " + x + " is " + x * this.x);
        }
    }
}
