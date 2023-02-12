package com.mycompany.quiz;

import java.util.Stack;

public class BracketsOrder {

    public static boolean Check(String str) {
        Stack<Character> seq = new Stack<>();

        for (char c : str.toCharArray()) {

            if (c == '(' || c == '{' || c == '[') {
                seq.push(c);
            } else if (c == ')' && !seq.isEmpty() && seq.peek() == '(') {
                seq.pop();
            } else if (c == '}' && !seq.isEmpty() && seq.peek() == '{') {
                seq.pop();
            } else if (c == ']' && !seq.isEmpty() && seq.peek() == '[') {
                seq.pop();
            } else {
                return false;
            }
        }
        return seq.isEmpty();
    }

    public static void main(String[] args) {

        String str1 = "{[]}()";
        String str2 = "{(})";


        System.out.println(Check(str1));
        System.out.println(Check(str2));


    }
}
