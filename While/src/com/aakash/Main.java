package com.aakash;

public class Main {

    public static void main(String[] args) {

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber){
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//            System.out.println("Even number " +number);
//        }


        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " +number);

            evenNumberFound++;
            if (evenNumberFound >= 5){
                break;
            }
        }
        System.out.println("Total even numbers found " +evenNumberFound);

    }

    public static boolean isEvenNumber (int number) {

        if (number % 2 == 0){
            return true;
        } else return false;
    }
}
