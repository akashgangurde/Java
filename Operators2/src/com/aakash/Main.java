package com.aakash;

public class Main {

    public static void main(String[] args) {
        unaryOperators(10);
        unaryOperatorEx2(10, 10);
        unaryOperatorEx3(10, 10, true, false);

        arithmeticOperators(10, 5);
        System.out.println(arithmeticOperatorsEx());

        leftShiftOperator();

        rightShiftOperator();

        System.out.println(andOperator(10, 5, 20));

        System.out.println(orOperator(10, 5, 20));

        ternaryOperator(2, 5);

        assignmentOperator();

        addingShort();
    }

    public static void unaryOperators(int x) {
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x--);
        System.out.println(--x);
    }

    public static void unaryOperatorEx2(int a, int b) {
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);
    }

    public static void unaryOperatorEx3(int a, int b, boolean c, boolean d) {
        System.out.println(~a);
        System.out.println(~b);
        System.out.println(!c);
        System.out.println(!d);
    }

    public static void arithmeticOperators(int a, int b) {
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }

    public static int arithmeticOperatorsEx() {
        return 10*10/5+3-1*4/2;
    }

    public static void leftShiftOperator() {
        System.out.println(10 << 2);
        System.out.println(10 << 3);
        System.out.println(20 << 2);
        System.out.println(15 << 4);
    }

    public static void rightShiftOperator() {
        System.out.println(10 >> 2);
        System.out.println(20 >> 2);
        System.out.println(20 >> 3);
    }

    public static void shiftOperatorEx() {
        System.out.println(20 >> 2);
        System.out.println(20 >>> 2);

        System.out.println(-20 >> 2);
        System.out.println(-20 >>> 2);
    }

    public static boolean andOperator(int a, int b, int c) {
        return a < b && a < c;
    }

    public static boolean orOperator(int a, int b, int c) {
        return a > b || a < c;
    }

    public static void ternaryOperator(int a, int b) {
        int min = (a<b)?a:b;
        System.out.println(min);
    }

    public static void assignmentOperator() {
        int a = 10;
        int b = 20;
        a += 4;
        b -= 4;
        System.out.println(a);
        System.out.println(b);

        a *= 2;
        System.out.println(a);

        a /= 2;
        System.out.println(a);
    }

    public static void addingShort() {
        short a = 10;
        short b = 10;

        a = (short) (a + b);

        System.out.println(a);
    }
}
