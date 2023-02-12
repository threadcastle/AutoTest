package com.mycompany.quiz;

public class StepN {
    public static boolean isStepNum(int n) {

        int pre = -1;
        while (n > 0) {
            int cur = n % 10;

            if (pre != -1) {
                if (Math.abs(cur - pre) != 1)
                    return false;
            }
            n /= 10;
            pre = cur;
        }
        return true;
    }


    public static void findStepN(int n, int m) {
        for (int i = n; i <= m; i++)
            if (isStepNum(i))
                System.out.print(i + " ");
    }

    public static void main(String args[]) {
        int n = 0, m = 200;
        findStepN(n, m);
    }

}






