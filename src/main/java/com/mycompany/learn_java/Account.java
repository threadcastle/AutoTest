package com.mycompany.learn_java;

public class Account implements Bank {

    //instance fields
    private long accNumber; // encapsulate
    private String accHolderName;
    private double accBalance;


    //constructor
    public Account() {
    }

    public Account(long accNum, String accHolderName, double accBalance) {

        accNumber = accNum;
        this.accHolderName = accHolderName;
        this.accBalance = accBalance;
    }


    // overloading constructor, with same name in the same class, but with different signature
    // ! return type does NOT MATTER !!!!!
    /*public Account(){

    }*/


    public void deposit(double money) {

        this.accBalance = this.accBalance + money; //instance field and method only

    }


    public void withdraw(double money) {

        this.accBalance = this.accBalance - money; //instance field and method only

    }

    // there is no return in the Constructor


    public double getAccBalance() {
        return this.accBalance;
    }


    public void setAccBalance(double accBalance) {
        this.accBalance = accBalance;
    }

}
