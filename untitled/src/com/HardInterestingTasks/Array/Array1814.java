package com.HardInterestingTasks.Array;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

/**
 * Задание 18.14
 * Напишите класс, который заполняет случайными трехзначными числами массив,
 * размер которого при инициализации вводится с клавиатуры.
 * После заполнения класс должен вывести на экран значения массива следующим образом:
 *
 *  • в первой строке -первую половину массива;
 *  • во второй строке -вторую половину массива.
 *
 *   В случае если массив имеет нечетный размер, центральную ячейку следует выводить в первой строке.
 */

public class Array1814 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("size of array?");

        int [] array = new int[scanner.nextInt()];

        //заполняем массив
        for (int i = 0; i < array.length; i++) { // сначала заполняем массив!!!!!!!!!!!!!!!!
            array[i] = random.nextInt(10,99);
        }

        //выводим первую часть l = 5
        int middleOfArray = array.length / 2;

        if (array.length % 2 != 0){
            middleOfArray++; // middleOfArray = middleOfArray + 1;
        }

        for (int i = 0; i < middleOfArray; i++) {

            System.out.print(i + ": " + array[i] + " ");
        }
        System.out.println();

        //выподим вторую часть
        for (int i = middleOfArray; i < array.length; i++) {

            System.out.print(i + ": " + array[i] + " ");
        }

    }

}
