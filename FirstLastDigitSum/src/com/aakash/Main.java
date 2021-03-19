package com.aakash;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));

    }

    public static int sumFirstAndLastDigit (int number){

        if (number < 0){
            return -1;
        }

        int sum = 0;
        int lastDigit = number % 10;
        int firstDigit = number;

        while (firstDigit >= 10){

            firstDigit /= 10;

        } return sum = sum + firstDigit + lastDigit;
    }
}
