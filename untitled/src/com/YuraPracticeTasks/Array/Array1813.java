package com.YuraPracticeTasks.Array;

import java.util.Scanner;

/**
 *
 * Задание 18.13
 * Напишите класс, который заполняет массив рядом чисел
 * - 5, 10, 99, -125, 898, 124, 999, 0, 1, 125, 983, 123, -1000, 89, 69, 996, 44, -1, 102, -87.
 *
 *
 * Размер массива при инициализации вводится с клавиатуры. ----- это не нужное условие, Юрец перебрал
 *
 *
 *
 * После заполнения класс должен вывести на экран значения массива в одной строке, начиная с «начала» массива (с первой ячейки).
 */
public class Array1813 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" size of array? ");

        int [] array = new int[scanner.nextInt()];
                            //
        int [] arrayValues = {- 5, 10, 99, -125, 898, 124, 999, 0, 1, 125}; // значение єлемента, по одной бумажечке в каждом ящике

        for (int i = 0; i < array.length; i++) { // i - єто индекс єлемента , номер почтового ящика
            array[i] = arrayValues[i];
            System.out.println(array[i]);
        }

    }
}
