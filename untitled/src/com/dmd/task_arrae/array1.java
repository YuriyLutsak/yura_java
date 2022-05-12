package com.dmd.task_arrae;

public class array1 {
    public static void main(String[] args) {
        int [] val = {1,-2,3,-11,13};
      //  printArray(val);
      //  printArrayForeach(val);
        printArrayRevers(val); // оттобразить числа в обратном порядке
    }

    public static void printArrayRevers(int[] val){
        for (int i = val.length - 1; i >= 0; i--) {
            System.out.print(val[i] + " ");
        }
        System.out.println();
    }

    public static void printArray (int[] val){
        for (int i = 0; i < val.length; i++) {
            System.out.print(val[i] + " ");
        }
        System.out.println();
    }
    public static void printArrayForeach(int[] val){ // foreach - та же самая функция, только записана по другому
        for (int value : val) { // вызывается   iter
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
