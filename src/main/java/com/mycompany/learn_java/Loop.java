package com.mycompany.learn_java;

public class Loop {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i = i + 1) {
            System.out.println(i);
        }
        int j = 4;
        while (j < 5) {

            System.out.println(j);
            j++;
        }

        do {
            System.out.println(j);
        } while (j < 4);


    }

}
