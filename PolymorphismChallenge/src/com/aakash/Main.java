package com.aakash;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, boolean engine, int cylinders, int wheels) {
        this.name = name;
        this.engine = true;
        this.cylinders = cylinders;
        this.wheels = 4;
    }

    public void startEngine() {
        System.out.println("Car.startEngine called");
    }

    public void accelerate() {
        System.out.println("Car.accelerate() called");
    }

    public void brake() {
        System.out.println("Car.brake() called");
    }

    public String getName() {
        return name;
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }
}

class Ferrari extends Car {

    public Ferrari(boolean engine, int wheels) {
        super("Ferrari", engine, 12, wheels);
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Ferrari.startEngine() called");
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}

public class Main {

    public static void main(String[] args) {

        Ferrari

    }
}
