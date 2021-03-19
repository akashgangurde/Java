package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Min Value = " +myMinFloatValue);
        System.out.println("Float Max Value = " +myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Min Value = " +myMinDoubleValue);
        System.out.println("Double Max Value = " +myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d /3d;
        System.out.println("myIntValue = " +myIntValue);
        System.out.println("myFloatValue = " +myFloatValue);
        System.out.println("MydoubleValue = "+myDoubleValue);

        double pounds = 200d;
        double eqKilograms = 200d * 0.45359237d;
        System.out.println("pounds to kg = " + eqKilograms);

    }
}
