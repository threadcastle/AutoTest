package com.mycompany.learn_java;

import java.sql.SQLOutput;

public class LearningMethod {
    public static void main(String[] args) {
        int myRes = addTwoNumbers(2, 3);
        System.out.println(myRes);
        //System.out.println(myRes +"===="+ myRes1);
    }

    public static int addTwoNumbers(int a, int b) {
        int res = a + b;
        return res;

    }

    public static int Large(int a, int b) {
        int res = a > b ? a : b;
        return res;

    }


}

//Methods: reusable line of code:

