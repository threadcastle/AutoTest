package com.mycompany.learn_java;

public class ControlFlowStatements {
    public static void main(String[] Args) {
        int a = 2;
        int b = 3;
        a = a + 5;
        double res = ((double) a) / 3; // casting
        double convertedToDouble = (double) a;
        System.out.println(convertedToDouble / 3);


        int c = a++;
        int d = ++b;
        System.out.println("value of c is " + c);
        System.out.println("value of d is " + d);


        a *= 2;

        System.out.println(a);

        //a == 2;
        System.out.println(a == 2);

        // Ternary

        String s = a == 2 ? "yes a is true" : "aaaaaaa";
        System.out.println(s);

        String myd = "cowqqq";

        if (myd == "cat") {
            System.out.println("mew mew");
        } else if (myd == "cow") {
            System.out.println("mo mo");
            //System.out.println("myd does not match");
        } else {
            System.out.println("no match");
        }

        switch (myd) {
            case "cat":
                System.out.println("meemee");
                //break
                break;
            case "dog":
                System.out.println("wooo");
                break;
            case "cow":
                System.out.println("moo");
                break;
            default:
                System.out.println("no animal");

        }


    }
}
