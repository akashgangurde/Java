package com.aakash;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(25,55));


    }

    public static boolean hasSharedDigit(int x,int y) {
        if((x > 99) || (x < 10) || (y > 99) || (y < 10)) {
            return false;
        }else {
            return((x/10 == y/10)||(x/10 == y % 10)||(y/10 == x % 10)||(x%10 == y%10));
        }
    }
}
