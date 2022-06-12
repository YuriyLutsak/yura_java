package com.HardInterestingTasks.WorkWithNumber;

import java.util.Scanner;

/**
 * Задача1. Напиши программу которая высчитывает положительные числа Фибоначчи
 * (не сложно, погугли что такое числа Фибоначчи). Используй любой удобный цыкл.
 * Например я указываю 6е число Фибоначчи, на экран должно вывести 8.
 * PS используй инт, мы не будем высчитывать 100е число Фибоначчи.
 * <p>
 * f0 = 0 + 0 = 0
 * f1= 0 + 1 = 1
 * f2= 0 + 1 = 1
 * f3= 1 + 1 = 2
 * f4= 1 + 2 = 3
 * f5= 2 + 3 = 5
 * f6= 3 + 5 = 8
 * f7= 5 + 8 = 13
 * f8= 8 + 13 = 21
 * f9= 13 + 21 = 34
 * f10= 21 + 34 = 55
 */

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" enter  num : ");
        int n = scanner.nextInt();

        int f0 = 1;
        int f1 = 1;
        int fTemp;

        System.out.print(f0 + " " + f1 + " ");

        for (int i = 3; i <= n; i++) {
            fTemp = f0 + f1;
            System.out.print(fTemp + " ");
            f0 = f1;
            f1 = fTemp;
        }
        System.out.println();
    }
}