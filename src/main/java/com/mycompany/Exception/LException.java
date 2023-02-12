package com.mycompany.Exception;

import java.io.BufferedReader;

public class LException {
    public static void main(String[] args) {
        String[] fruits = {"apple", "guava", "grapes"};

        try {
            System.out.println(fruits[4]);
        }
        /*
            catch(ArrayIndexOutOfBoundsException ae){
            ae.printStackTrace();
            throw new RuntimeException("stop");

        }
         */ catch (Exception e) {
            System.out.println("catch block");
            e.printStackTrace();
        } finally {

            System.out.println("always run");
        }
        System.out.println("sth wrong");

        // tru catch throw throws finally


    }
}
