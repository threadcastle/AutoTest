package com.mycompany.learn_java;

public class wolf {
    public static void main(String[] args) {
        //1, can not create object of interface;
        // Bank = new Bank();


        Bofa bofa = new Bofa();


        //3
        Bank b = new Bofa();
        b.withdraw(12);

        MoneyTransaction m = new Bofa();
        m.demoAbstractMethod();
        m.doTransaction();


    }
}
