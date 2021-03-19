package com.aakash;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of 125 is " +sumDigit(125));
        System.out.println("The sum of -125 is " +sumDigit(-125));
        System.out.println("The sum of 4 is " +sumDigit(4));
        System.out.println("The sum of 32123 is " +sumDigit(32123));
    }

    public static int sumDigit (int number){

        if (number < 10){
            return -1;
        }

        int sum = 0;

        while (number > 0){
        //Extract the least significant number

        int digit = number % 10;
        sum += digit;

        //Drop least significant digit
        number /= 10;
        } return sum;
    }
}
