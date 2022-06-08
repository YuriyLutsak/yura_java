package com.HardInterestingTasks;

import java.util.Scanner;

/**
 * Задание 15.37
 * Напишите клас, который принимает с клавиатуры целое положительное число и
 * выводит на экран факториал этого числа.
 */

public class Quoter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int numFactor = scanner.nextInt();
        int count = numFactor - 1;

        for (int i = numFactor; i > 0 ; i--) {
            numFactor = numFactor * count;
            count--;
        }
        System.out.println(numFactor);
    }
}















/**
 * 1!=1
 * 2!=2
 * 3!=6
 * 4!=24
 * 5!=120
 * 6!=720
 * 7!=5040
 * fact(m) = n * n-1 * n-2 * n-3....
 * fact(5) = 1 * 2 * 3 * 4 * 5
 * 001         3    2
 * int res = fact * i; = 6
 */