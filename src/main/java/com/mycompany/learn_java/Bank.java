package com.mycompany.learn_java;

public interface Bank {

    public static final int INITIAL_DEPOSIT = 25;

    //methods are abstract;
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);

    public default String getAccountHolderName() {
        return "";
    }
}
