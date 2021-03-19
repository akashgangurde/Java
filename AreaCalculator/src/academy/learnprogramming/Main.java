package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        area(5.0);
        area(5.0, 4.0);

    }

    public static double area(double radius){
        if (radius < 0) {
            return -1.0D;
        }

        double areaOfCircle = Math.PI * radius * radius;

        System.out.println(areaOfCircle + " ");
        return areaOfCircle;
    }

    public static double area(double x, double y) {

        if(x < 0 || y < 0) {
            return -1.0D;
        }

        double areaOfTriangle = x * y;
        System.out.println(areaOfTriangle + " ");
        return  areaOfTriangle;
    }



}
