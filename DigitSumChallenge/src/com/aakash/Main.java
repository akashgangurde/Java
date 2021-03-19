package com.aakash;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(55));


    }

    public static int sumDigits (int number){


        if (number >= 10) {
            int number1 = number % 10;
            int number2 = number1 % 10;
            int number3 = number2 % 10;
            number = number1 + number2 + number3;
            return number;


        } else return -1;
    }
}
