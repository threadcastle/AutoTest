package com.mycompany.learningCollection;

import com.mycompany.learn_java.Account;

public class LearnArray {

    public static void main(String[] args) {
        //Array

        String a[] = {"adfs", "qq"};

        Account[] myAccount = {new Account(), new Account()};

        String[] fruits = {"apple", "grapes", "banana"};

        System.out.println(fruits.length);
        System.out.println(fruits[1]);

        fruits[1] = "cherry";

        StringBuffer sbr = new StringBuffer("guava");
        sbr.append("apple");
        String mys = sbr.toString();

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }


        String[] test = {"apple", "mango", "Strawberry"};
        int leng = test.length;

        for (int i = 0; i < leng / 2; i++) {

            String t = test[i];

            test[i] = test[leng - i - 1];

            test[leng - i - 1] = t;

        }
        for (int i = 0; i < leng; i++) {
            System.out.println(test[i]);

        }


    }
}
