package com.aakash;

public class Main {

    public static void main(String[] args) {
        numberToWords(21400);
        System.out.println(reverse(-21400));
        System.out.println(getDigitCount(0));
    }

    public static void numberToWords (int number){

        if (number < 0){
            System.out.println("Invalid Value");
        }
        int reverseNumber = reverse(number);

        for (int i = 0;i < getDigitCount(number); i ++){
         switch (reverseNumber % 10){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case  9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reverseNumber /= 10;
        }

    }

    public static int reverse (int number){

        int reverse = 0;
        int storedNumber = number;

        while (storedNumber != 0){
            int lastDigit = storedNumber % 10;
            reverse *= 10;
            reverse += lastDigit;
            storedNumber /= 10;
        } return reverse;
    }

    public static int getDigitCount (int number){
        if (number < 0){
            return -1;
        }
        int count = 1;
        while (number > 9){
            count++;
            number /= 10;
        } return count;
    }
}
