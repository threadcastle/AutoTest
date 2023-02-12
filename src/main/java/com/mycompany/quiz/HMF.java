package com.mycompany.quiz;

public class HMF {


    public static boolean checkSum(int s, int[] arr) {

        boolean r = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j = j + 1) {

                if (s == arr[i] + arr[j]) {
                    r = true;
                    break;


                } else {
                    return r;

                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 8};
        int sum = 9;
        boolean judge = checkSum(sum, array);
        System.out.println(judge);

    }


}
