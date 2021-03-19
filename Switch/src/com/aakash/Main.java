package com.aakash;

public class Main {

    public static void main(String[] args) {
//        int value =3;
//        if(value == 1){
//            System.out.println("Value was 1");
//        } else if (value == 2){
//            System.out.println("Value was 2");
//        } else{
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 6;
        switch (switchValue){
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was either 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1, 2, 3, 4 or 5");
                break;
        }

        char charValue = 'D';
        switch (charValue){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(charValue + " was found");
                break;
            default:
                System.out.println("A, B, C, D or E not found");
                break;
        }

        String month = "JuNE";
        switch (month.toUpperCase()){
            case "January":
                System.out.println("Jan");
            case "JUNE":
                System.out.println("June");
                break;
            default:
                System.out.println("Not Sure");
                break;
        }
    }
}
