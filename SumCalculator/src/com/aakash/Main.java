package com.aakash;

public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);

        System.out.println("Addn is " + calculator.getAdditionResult());
        System.out.println("Subtraction is " + calculator.getSubtractionResult());
        System.out.println("Multiplication is " + calculator.getMultiplicationResult());
        System.out.println("Division is " + calculator.getDivisionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("Addn is " + calculator.getAdditionResult());
        System.out.println("Multiplication is " + calculator.getMultiplicationResult());
        System.out.println("Division is " + calculator.getDivisionResult());

    }
}
