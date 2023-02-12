package com.mycompany.learn_java;

public class StaticVSNonStatic {

    private static String staticField;
    private String nonStaticField;

    private String privateField;

    String defaultField; // access in the same package

    protected String pField;


    //static {}

    public static void demoStatic() {
        staticField = "something";
        // nonStaticField = .... is not allowed in s static method !!

    }

    public void demoNStatic() {
        // no specific rule

    }

    public void demoNStaticAgain() {
        // no specific rule
        demoStatic();
        demoNStatic();


    }


}
