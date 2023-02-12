package com.mycompany.learn_java;

import java.util.HashMap;

public class HMF {
    public static boolean checkSum(int s, int[] arr) {

        boolean r = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (s == arr[i] + arr[j]) {
                    r = true;
                    break;

                }
            }
        }
        return r;
    }

    public static boolean findPair(int sum, int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < arr.length; i++) {

            int remain = sum - arr[i];
            if (map.containsKey(remain)) {
                return true;
            }
            map.put(arr[i], i);
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 1, 4, 8};
        int sum = 9;
        boolean judge = checkSum(sum, array);
        boolean j_HMF = findPair(sum, array);

        System.out.println(judge);
        System.out.println(j_HMF);


    }
}


