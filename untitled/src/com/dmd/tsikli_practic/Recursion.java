package com.dmd.tsikli_practic;

public class Recursion {
    public static void main(String[] args) {
        // 1*2*3*4*5*6 = 6! это факториал шести
        int factorial = factorial(2);
        System.out.println(factorial);
    }

    public static int factorial(int val){
        if (val == 1){
            return 1;
        }
        return val * factorial(val - 1);
    }
}
