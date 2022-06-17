package com.YuraPracticeTasks.Array.Methods;

/**
 * Задание 19.13 Напишите метод,
 * который получает в качестве параметра массив и число которым нужно заполнить этот массив.
 */

public class Array1913 {
    public static void main(String[] args) {

        int [] arr = new int[7];
        array(arr, 5);
    }

    public static void array (int [] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;

            System.out.print(i + ": " + arr[i] + "   ");
        }
    }
}
