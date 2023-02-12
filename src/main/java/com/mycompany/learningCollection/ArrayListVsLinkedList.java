package com.mycompany.learningCollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListVsLinkedList {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("grapes");
        fruits.add("oranges");

        int size = fruits.size();
        //System.out.println(fruits.get(0) + "size = "+size);

        LinkedList<String> llfruits = new LinkedList<>();
        llfruits.add("guava");
        llfruits.add("mango");
        llfruits.add("cherry");


        //System.out.println(llfruits.get(0) + "==" + llfruits.size());

        long StartListTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            fruits.add(0, "mango");

        }

        long endTimeList = System.currentTimeMillis();
        System.out.println("total time list = " + (endTimeList - StartListTime));


        long StartLinkedTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            llfruits.add(0, "mango");

        }

        long endTimeLinked = System.currentTimeMillis();
        System.out.println("total time linkedlist = " + (endTimeLinked - StartLinkedTime));

        // linkedList_[name], add([index], object), get(), remove(), how the runtime


    }
}
