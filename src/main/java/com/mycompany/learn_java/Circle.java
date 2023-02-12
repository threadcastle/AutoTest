package com.mycompany.learn_java;

public class Circle {

    private double radius;

    public Circle(double r) {

        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double calculateArea() {

        double a = (this.radius) * (this.radius) * 3.1415;
        return a;
    }

}
