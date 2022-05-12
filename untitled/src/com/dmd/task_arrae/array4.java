package com.dmd.task_arrae;

public class array4 {
    public static void main(String[] args) {
// find index of val: 0 1 2 3 4 5 6  7
         int[] val = {2,2,1,5,6,4,10,3};
        System.out.println("min index: " + findMinIndex(val));
        System.out.println("max index: " + findMaxIndex(val));
        System.out.println(sumBetween(val));
    }

     public static int sumBetween(int[] val){
        int minIndex = findMinIndex(val);
        int maxIndex = findMaxIndex(val);

        if (minIndex > maxIndex){
            int temp = minIndex;
            minIndex = maxIndex;
            maxIndex = temp;
        }


        int result = 0;
         for (int i = minIndex ++; i < maxIndex; i++) {
             result += val[i];
         }
         return result;
     }

    public static int findMinIndex(int[] val){
        int minIndex = 0;
        int minVal = val[minIndex];
        for (int i = 0; i < val.length; i++) {
            if (minVal > val[i]){
                minVal = val[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    public static int findMaxIndex(int[] val){
        int maxIndex = 0;
        int maxVal = val[maxIndex];
        for (int i = 0; i < val.length; i++) {
            if (maxVal < val[i]){
                maxVal = val[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}


























