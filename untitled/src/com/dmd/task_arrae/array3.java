package com.dmd.task_arrae;

public class array3 {
    public static void main(String[] args) {
        int [][] val1 = {
                {1,2,3},
                {4,5,6},
                {8,9},
        };
        int [][] val2 = {
                {1,2,3},
                {4,5,6},
                {8,9},
        };
        System.out.println(equals(val1, val2));
    }
    public static boolean equals(int[][] val1, int[][] val2){
        if (val1.length != val2.length){
            return false;
        }
        for (int i = 0; i < val1.length; i++) {
            int[] row1 = val1[i];
            int[] row2 = val2[i];
            if (row1.length != row2.length){
                return false;
            }
            for (int j = 0; j < row1.length; j++) {
                if (row1[j] != row2[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
