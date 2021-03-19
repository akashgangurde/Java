package com.aakash;

public class Floor {

    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        if ((this.width < 0) || (this.length < 0)) {
            this.width = 0;
            this.length = 0;
        }
    }

    public double getArea() {
        double area = 0;
        return area = this.width * this.length;
    }

}
