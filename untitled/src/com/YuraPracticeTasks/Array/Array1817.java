package com.YuraPracticeTasks.Array;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.17
 * Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры.
 * <p>
 * После заполнения класс должен вывести на экран значения массива следующим образом:
 * <p>
 * в каждой строке выводится значения из двух ячеек,
 * симметрично расположенных по отношению к середине массива.
 * <p>
 * В случае если массив имеет нечетный размер,
 * центральную ячейку следует выводить в отдельной строке.
 * <p>
 * Например, массив 345, 455, 677, 175, 985 выводится на экран следующим образом:
 * 345 и 985
 * 455 и 175
 * 677
 */

public class Array1817 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("size of array?");

        Random ran = new Random();

        int[] array = new int[scan.nextInt()];

        int end = array.length;
        int middle = array.length / 2;


        for (int i = 0, j = end - 1; i < middle; i++, j--) {

            array[j] = ran.nextInt(100, 999);
            array[i] = ran.nextInt(100, 999);
            System.out.print(i + ": " + array[i] + "      ");
            System.out.println(+j + ": " + array[j] + "     ");

        }

        if (end % 2 != 0) {
            //middle++;
            for (int q = middle; middle >= q; q++) {

                array[q] = ran.nextInt(100, 999);
                System.out.print(q + ": " + array[q] + "      ");

            }

        }
    }
}
