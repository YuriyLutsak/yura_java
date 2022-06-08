package com.HardInterestingTasks.WorkWithNumber;

import java.util.Scanner;

/**
 * Задание 15.37
 * Напишите клас, который принимает с клавиатуры целое положительное число и
 * выводит на экран факториал этого числа.
 */

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" prevNum of enter nums: ");
        int numFactor = scanner.nextInt();// 5 * 4 * 3 * 2 * 1    1 * 1 * 2 * 3 * 4 * 5

        int factorRes = 1;

        for (int i = 1; i <= numFactor; i++) {
            factorRes = factorRes * i;
        }
        System.out.println(factorRes);

        // --------------------------------------------------

//        int factorRes = 1;
//        int counter = 1;
//
//        while(counter <= numFactor){
//            factorRes = factorRes * counter;
//            counter++;
//        }
//        System.out.println(factorRes);

        // -------------------------------------------------------------


//        int prevNum = numFactor - 1;
//
//
//        while (prevNum > 0) {
//            numFactor = numFactor * prevNum;
//            prevNum--;  // -1 шаг
//
//        }
//        System.out.println(numFactor);
//
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