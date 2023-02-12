package com.mycompany.learn_java;

public class Car {

    protected String color;
    protected double price;


    public Car() {
        System.out.println("car constructor");
    }

    public Car(String color, double price) {
        this.color = color;
        this.price = price;
    }


    public void brake() {
        System.out.println("brake");
    }


    public void accelerate() {
        System.out.println("accelerate");
    }

}
