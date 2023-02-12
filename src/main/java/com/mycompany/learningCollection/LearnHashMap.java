package com.mycompany.learningCollection;

import java.util.HashMap;

public class LearnHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mmap = new HashMap<>();

        mmap.put("one", 1);
        mmap.put("two", 2);

        System.out.println(mmap.get("one"));


    }
}
