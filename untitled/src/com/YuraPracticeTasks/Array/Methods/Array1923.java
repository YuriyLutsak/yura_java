package com.YuraPracticeTasks.Array.Methods;

import java.util.Scanner;

import static com.YuraPracticeTasks.Array.FillArrayData.createArray;

/**
 *
 * Задание 19.23
 * Напишите метод, который принимает два параметра:
 * массив целых чисел М и еще одно целое число Х.
 * Метод проверяет, находится ли число Х в массиве.
 */

public class Array1923 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] array = createArray();

        System.out.println(" value: ");
        int value = scanner.nextInt();

        System.out.println(isContentsValue(array, value));
    }
    public static boolean isContentsValue(int [] arr, int value){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                return true;
            }
        }
        return false;
    }
}
