package com.YuraPracticeTasks.Array;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Задание 18.12
 * Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры.
 * После заполнения класс должен вывести на экран значения массива в одной строке,
 * начиная с «начала» массива (с первой ячейки).
 */
public class Array1812 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("size of array? ");

        Random ran = new Random();

        int [] array = new int[scan.nextInt()];       //        int sizeOfArray  = scan.nextInt();
                                                      //        int [] array =  new int [sizeOfArray];

        for (int i = 0; i < array.length; i++) {

            array[i] = ran.nextInt(100,999); // array[i] - обращение к массиву, что в него кладем!!!!!!!!!!!!!!!!!!
            System.out.print( i + "; " + array[i] + " ");

        }
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }


    }
}
