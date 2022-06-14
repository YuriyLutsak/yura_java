package com.YuraPracticeTasks.Array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Задание 18.18
 * Напишите класс, который заполняет случайными двузначными числами массив,
 * размер которого при инициализации вводится с клавиатуры.
 * После заполнения класс должен вывести на экран значения массива следующим образом:
 *
 * • в первой строке - значения из первой половины массива, начиная с «начала));
 * • во второй строке - значения из второй половины массива, начиная с «КОНЦЮ).
 */

public class Array1818 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("size of array?");

        Random ran = new Random();

        int [] array = new int[scan.nextInt()];

        int middleOfArray = array.length / 2;

        for (int i = 0; i < array.length; i++) {
            array[i] = ran.nextInt(10,99);
        }

        for (int i = 0; i <= middleOfArray; i++) {

            System.out.print(i + ": " + array[i] + "      ");
        }

        System.out.println();

        for (int i = array.length - 1; i > middleOfArray ; i--) {

            System.out.print(i + ": " + array[i] + "      ");
        }
    }
}
