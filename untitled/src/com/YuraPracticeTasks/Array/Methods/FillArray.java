package com.YuraPracticeTasks.Array.Methods;

/**
 * Задание 19.6
 * Напишите метод, который получает в качестве параметра массив и выводит на экран
 * содержащиеся в нем значения в одну строку через пробел между значениями.
 */

public class FillArray {
    public static void main(String[] args) {

        array();
        System.out.println();

        int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

        array2(arr);
    }

    // first option
    public static void array2(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": " + array[i] + "    ");
        }
    }

    // second option
    public static int[] array() {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < array.length; i++) {
            System.out.print(i + ": " + array[i] + "    ");
        }
        return array;
    }
}
