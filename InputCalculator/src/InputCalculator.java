import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }
    public static void inputThenPrintSumAndAverage(){

        Scanner scanner = new Scanner (System.in);
        int number = 0 ;
        double  sum = 0;
        double avg = 0;
        int count = 0;

        while(true){
            boolean hasInt = scanner.hasNextInt();
            if(hasInt){
                number = scanner.nextInt();
                sum += number;
                count++;
            }else{
                break;
            }
        }
        scanner.nextLine();
        avg = (sum / count);

        System.out.println("SUM = "+ Math.round(sum) +" AVG = "+ Math.round(avg) );
        scanner.close();
    }
}
