package com.YuraPracticeTasks.Array.Methods;

/**
 * Задание 19.17
 * Напишите метод, который получает в качестве параметра массив и заполняет его
 * положительными случайными двузначными числами так,
 * чтобы первая и вторая половины массива были идентичными.
 */

public class Array1917 {
    public static void main(String[] args) {
        int[] array = new int[7];
        arr(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void arr(int[] array) {

        int middle = array.length / 2;

        for (int i = 0, j = middle + 1; i < middle; i++, j++) {
            array[i] = (int) ((Math.random() + 1) * 100);
            array[j] = array[i];

            System.out.println(i + ": " + array[i] + "          " + j + ": " + array[j]);
        }

    }
}












