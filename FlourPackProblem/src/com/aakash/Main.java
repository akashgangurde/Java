package com.aakash;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));

    }

    public static boolean canPack ( int bigCount, int smallCount, int goal){
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0){
            int sum = (bigCount * 5) + smallCount;
            if (sum < goal) {
                return false;
            } else return goal % 5 <= smallCount;
        }
        return false;
    }
}
