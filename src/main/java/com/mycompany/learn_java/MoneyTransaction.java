package com.mycompany.learn_java;

public abstract class MoneyTransaction {

    // no object
    // constrctor is allowed;
    public MoneyTransaction() {
        System.out.println("abs class MT constrcutor");
    }

    public abstract void demoAbstractMethod();

    //implemented logic
    public void doTransaction() {
        System.out.println("do transaction from the abs class");
    }

}
