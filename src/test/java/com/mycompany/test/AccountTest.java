package com.mycompany.test;

import com.mycompany.learn_java.Account;


public class AccountTest {
    public static void main(String[] args) {


        Account deepthi = new Account(2343431, "Deepthi Y", 1000); // Account() constructor

        // new Account(): Object

        deepthi.deposit(1000);
        double accBalance = deepthi.getAccBalance();
        System.out.println(accBalance);

        Account sony = new Account(473892, "Sony T", 2000);
        sony.deposit(1000);


    }
}
