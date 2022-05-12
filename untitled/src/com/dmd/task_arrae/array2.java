package com.dmd.task_arrae;

public class array2 {
    public static void main(String[] args) {
        int [] val = new int[100];
        fillArray(val);
        array1.printArray(val);

    }
    public static void fillArray(int[] val){
        int currentIndex = 0;
        for (int currentVal = 1; currentIndex < val.length; currentVal++) {
            if (currentVal % 17 == 0 || currentVal % 13 == 0){
            val[currentIndex] = currentVal;
            currentIndex++;}
        }

    }
}
