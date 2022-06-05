package com.HardInterestingTasks.While;

import java.util.Scanner;

public class DivisionNumber {
    public static void main(String[] args) {
        amountOfNumbers();

        //quantityOfNumbers();

    }

    public static void quantityOfNumbers() {
//        Задание 15.28 типичная задача для вайла))))
//        Напишите класс, который принимает с клавиатуры целое число и
//        подсчитывает число цифр в нем (количество цифр в числе).
//        Результат подсчета должен быть выведен на экран.
//        Например, для числа 534 на экран будет выведено 3 цифры.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter three-digital value: ");
        int val = scanner.nextInt();//456789
        int counter = 0;
//        int val3 =  val % 10;          // 9      -
//        int val2 =  val / 10 % 10;     // 45678  -
//        int val1 =  val / 100 % 10;    // 4567
//        int val0 =  val / 1000 % 10;   // 456
//        int val01 = val / 10000 % 10;  // 45
//        int val02 = val / 100000 % 10;      // 4
//        int val03 = val / 1000000;     // 0

        while (val != 0) {
            val = val / 10;
            counter++;
        }
        System.out.println(counter);
    }

    public static void amountOfNumbers() {
        // Задание 15.29 Напишите класс, который принимает с клавиатуры целое число и
        // подсчитывает сумму его цифр.
        // Результат подсчета должен быть выведен на экран.
        // Например, для числа 534 на экран будет выведено 12.
        Scanner scan = new Scanner(System.in);

        System.out.println("value? ");
        int inputNum = scan.nextInt(); //  5 4 3

        int division = 1;
        int sum = 0;

        while (inputNum / division != 0) {

            sum = sum + (inputNum / division) % 10;
            division = division * 10;
        }
        System.out.println(sum);
    }


      /* int res1 = (inputNum % 10);
        int res2 = (inputNum / 10) % 10;
        int res3 = (inputNum / 100) % 10;
        int res4 = (inputNum / 1000) % 10;
        int res5 = (inputNum / 10000) % 10;

        System.out.println(res1 + " this is sum" + "res1");
        System.out.println(res2 + " this is sum" + "res2");
        System.out.println(res3 + " this is sum" + "res3");
        System.out.println(res4 + " this is sum" + "res4");
        System.out.println(res5 + " this is sum" + "res5");*/


}
