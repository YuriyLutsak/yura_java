package com.YuraPracticeTasks.Array;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.15
 * Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры.
 *
 * После заполнения класс должен вывести на экран значения массива следующим образом:
 * • в первой строке - значения из четных ячеек массива;
 *  • во второй строке - значения из нечетных ячеек массива.
 *
 *
 *
 *  Задание 18.16 Напишите класс,
 *  который заполняет случайными двузначными числами массив,
 *  размер которого при инициализации вводится с клавиатуры.
 *  После заполнения класс должен вывести на экран значения массива следующим образом:
 *
 * • в первой строке - четные значения, содержащиеся в массиве;
 * • во второй строке - нечетные значения, содержащиеся в массиве.
 */

public class Array1815 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println(" size massive?");

        int [] arr = new int[scanner.nextInt()];

        for (int i = 0; i < arr.length; i+=2) {
            arr[i] = random.nextInt(10,99);

            System.out.print(i + ": " + arr[i] + " ");

        }
        System.out.println();

        for (int i = 1; i < arr.length; i+=2) {
            arr[i] = random.nextInt(10,99);

            System.out.print(i + ": " + arr[i] + " ");
        }

        System.out.println();
        System.out.println(" task 1816 in here, cause i'm to lazy to right new task fo this  ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10,99);

            if (arr[i] % 2 == 0){
                System.out.print(i + ": " + arr[i] + " ");
            }
        }

        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10,99);
            if (arr[i] % 2 != 0) {
                System.out.print(i + ": " + arr[i] + " ");
            }

        }
    }
}
