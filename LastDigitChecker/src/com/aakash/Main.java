package com.aakash;

public class Main {

    public static void main(String[] args) {

        System.out.println(hasSameLastDigit(22,12,45));
        System.out.println(isValid(1000));

    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){

        if ((number1 < 10 || number1 >999) || (number2 < 10 || number2 > 999) || (number3 < 10 || number3 >999)){
            return false;
        }
        else  return ((number1 % 10 == number2 % 10) || (number1 % 10 == number3 %10) || (number2 % 10 == number3 % 10));

    }

    public static boolean isValid (int number4){

        if ((number4 < 10 || number4 >1000)){
            return false;
        } else return true;
    }
}
