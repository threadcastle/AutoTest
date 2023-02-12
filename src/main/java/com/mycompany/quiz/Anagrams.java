package com.mycompany.quiz;


public class Anagrams {

    static int code = 128;

    public static char[] Convert(String s) {

        char[] s_new = s.toLowerCase().replaceAll(" ", "").toCharArray();
        return s_new;

    }

    public static boolean isAnagram(char[] str1, char[] str2) {

        int[] freq = new int[code];

        if (str1.length != str2.length)
            return false;

        for (int i = 0; i < str1.length; i++) {
            //System.out.println("str1[i] is"+ str1[i]);
            freq[str1[i]]++;
            //System.out.println(freq);
            freq[str2[i]]--;
        }

        for (int i = 0; i < code; i++)
            if (freq[i] != 0) {
                return false;
            }

        return true;
    }

    public static void main(String[] args) {

        String s1 = "abd thy ss LKF";
        String s2 = "thss ylkf d ba";

        char[] str1 = Convert(s1);
        char[] str2 = Convert(s2);

        boolean res = isAnagram(str1, str2);
        System.out.println(s1 + " and " + s2 + " is Anagram: " + res);


    }
}
