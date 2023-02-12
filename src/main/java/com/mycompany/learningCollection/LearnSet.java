package com.mycompany.learningCollection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Consumer;

public class LearnSet {
    public static void main(String[] args) {
        //hashSet, LinkedHashSet, TreeSet;

        Set<String> myset = new HashSet<>();

        myset.add("apple");
        myset.add("o");
        myset.add("c");
        myset.add("apple");

        //the below counts
        myset.add(new String("banana"));

        //the blow does not count! because this is the hash set!
        myset.add(new String("banana"));

        //the blow does not count! because this is the hash set!

        myset.add(new String("apple"));

        System.out.println(myset.size());

        //there is no get

        Iterator<String> iterator = myset.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //lambda

        //void accept(String ele) { logic };
        Consumer<String> myconsumer1 = (ele) -> {
            System.out.println(ele);
        };

        Consumer<String> myconsumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        myset.forEach(myconsumer);
        myset.forEach((element) -> {
            System.out.println(element);
        });


    }
}
