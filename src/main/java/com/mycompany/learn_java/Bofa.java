package com.mycompany.learn_java;

public class Bofa extends MoneyTransaction implements Bank {
    public void demoAbstractMethod() {

        System.out.println("define the abs mtd from abs class");

    }

    public void doTransaction() {
        System.out.println("do transaction from the Bofa(inherit abs) class");
    }

    public void withdraw(double amount) {
        System.out.println("withdraw from BoFa");
    }

    ;

    public void deposit(double amount) {
        System.out.println("deposit from Bofa");
    }

    ;


}
