package com.mycompany.learn_java;

public class Tesla extends Car {

    private boolean isAutoPilot;

    public Tesla() {
        System.out.println("tesla constructor");
    }

    public Tesla(String color, double price, boolean isAutoPilot) {

        super(color, price);
        this.isAutoPilot = isAutoPilot;
    }

    public static void main(String[] args) {

        //Car c = new Car();
        //Tesla t = new Tesla();
        //t.brake(); //overriding


        Car ct = new Tesla(); // cT is a Tesla  !!!!

        ct.brake(); // brake() is defined as brake in Car But assigned as Tesla !!! output is Tesla !
        //compiling: as Car
        //runtime: as Tesla


        Tesla tesla = (Tesla) ct;


    }

    public void startRemote() {
        System.out.println("starting remote");
    }


    public void brake() {

        System.out.println("braking in tesla");

    }

}
