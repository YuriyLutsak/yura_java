package com.HardInterestingTasks.Methods;

import java.util.Scanner;

/**
 * // Задание 17.12
 * // Напишите метод, который принимает в качестве параметра целое число
 * // и возвращает самую большую цифру в этом числе.
 */
public class BiggerValueInNumber {
    public static void main(String[] args) {
        System.out.println(maxValue());
//maxValue();
    }

    public static int maxValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("value: ");
        int val = scan.nextInt();

        int maxValue = 1;
        int division = 1;
        int temp = 0;

        while (val / division != 0) {
            temp = (val / division) % 10;
            division = division * 10;
            // System.out.print(temp + " ");

            if (temp > maxValue) {
                maxValue = temp;
                //  System.out.println("\n " + maxValue);
            }
        }
        return maxValue;
    }
}
