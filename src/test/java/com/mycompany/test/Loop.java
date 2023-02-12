package com.mycompany.test;

public class Loop {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            String a = "";
            for (int j = 1; j <= i; j++) {
                a = a + Integer.toString(j);
            }
            System.out.println(a);
        }


    }

}
