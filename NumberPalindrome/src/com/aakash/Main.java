package com.aakash;

public class Main {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-707));


    }

    public static boolean isPalindrome (int number){

        if (number < 0){
            number *= -1;
        }

        int reverse = 0;
        int storedNumber = number;

        while (storedNumber > 0){

            int lastDigit = storedNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            storedNumber /= 10;
        }
        if (number == reverse){
            return true;
        } else return false;

    }
}
