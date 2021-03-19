package com.aakash;

import java.util.Scanner;

public class InputCalculator {

    public static void inputcacaca() {

        Scanner scanner = new Scanner(System.in);


        int sum = 0;
        long avg = 0;
        int counter = 0;

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                break;
            }
            scanner.nextLine();

        }
        avg = sum / counter;
        System.out.println("SUM = " + sum + " AVG = " + Math.round(avg));
        scanner.close();
    }
}
