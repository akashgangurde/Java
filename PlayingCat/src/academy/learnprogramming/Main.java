package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(true,33));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if( summer && (temperature > 24 && temperature < 46)) {
            return true;
        }
        else if( !summer && (temperature > 24 && temperature < 36)) {
            return true;
        }
        else return false;
    }



}
