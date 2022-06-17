package com.YuraPracticeTasks.Array;

import java.util.Scanner;

/**
 *
 * Задание 19.22
 * Напишите метод, который принимает два параметра:
 * массив целых чисел М и еще одно целое число Х.
 * Метод возвращает количество ячеек массива М, содержащих значение Х
 * (число появлений Х в М).
 */
public class Array1922 {
    public static void main(String[] args) {

        int[] arr = new int[3];
        int value = 0;

        System.out.println(array(arr, value));

    }

    public static int array(int[] arr, int value){
        Scanner scan  = new Scanner(System.in);
        System.out.println(" value in array");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
            arr[i] = value;
        }

        System.out.println("value your: ");
        value = scan.nextInt();


        return arr[value];
    }
}
