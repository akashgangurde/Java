package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if (score < 5000 && score > 1000) {
//            System.out.println("Your score was 5000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less than 1000");
//        }
//        else {
//            System.out.println("Got here");
//        }

        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            final  += 10000;
            System.out.println("Tour final score was " +finalscore);
        }

//        boolean newGameOver = true;
//        int score2 = 10000;
//        int levelCompleted2 = 8;
//        int bonus2 = 200;
//
//        if (newGameOver) {
//            int finalscore = score2 + (levelCompleted2 * bonus2);
//            System.out.println("Your Final score was " +finalscore);
//        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalscore = score + (levelCompleted * bonus);
            System.out.println("Tour final score was " +finalscore);
        }



    }
}
