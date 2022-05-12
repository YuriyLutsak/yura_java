package com.dmd.tasks;

public class Functions {
    public static void main(String[] args) {
        int val = 5;
        int val2 = 10;
        int res = getMaxVal(val, val2);
        System.out.println("Result: " + res);

    }
    public static int getMaxVal(int val, int val2){
        if (val > val2){
            return val;
        }else
            return val2;
    }
}
