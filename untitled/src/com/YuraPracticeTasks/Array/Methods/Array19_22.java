package com.YuraPracticeTasks.Array.Methods;

import com.YuraPracticeTasks.Array.FillArrayData;

import java.util.Scanner;

import static com.YuraPracticeTasks.Array.FillArrayData.createArray;


/**
 * Задание 19.22
 * Напишите метод, который принимает два параметра:
 * <p>
 * массив целых чисел М и еще одно целое число Х.
 * Метод возвращает количество ячеек массива М, содержащих значение Х (число появлений Х в М).
 */
public class Array19_22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("size of array: ");
//        int[] arr = new int[scanner.nextInt()];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = (int) (Math.random() * 10);
//        }



        int[] arr = createArray();

        System.out.println(" enter one-digital value: ");
        int value = scanner.nextInt();

        System.out.println(returningValueFromArray(arr, value));

    }

    public static int returningValueFromArray(int[] arr, int value) {

        int counter = 0;

        for (int i = 0; i < arr.length; i++) {


            // System.out.println(i + ": " + arr[i] + " suka - psihanul)  ");

            if (arr[i] == value) {
                counter++;
                //   System.out.print(i + ": " + arr[i] + " ->     ");
                //return counter;
            }
        }
//        System.out.println();
//        System.out.print(" counter is:   " + counter + "      ");

        return counter;
    }
}


