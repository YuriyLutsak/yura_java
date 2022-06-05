package com.HardInterestingTasks.While;

import java.util.Scanner;

public class SameNumbers {
    public static void main(String[] args) {

    }
    public static void  sameValue(){
        // Задание 15.12
        // Напишите класс, который принимает с клавиатуры целые числа,
        // пока не будут введены с клавиатуры друг за другом два одинаковых числа.
        // Класс должен выводить на экран сумму серии за исключением последнего введенного с клавиатуры значения.

        Scanner scanner = new Scanner(System.in);
        System.out.println("your value: ");

        int valuePrev = scanner.nextInt();
        System.out.println("your next value");
        int valueNext = scanner.nextInt();

        int sum = valuePrev;// valuePrev = valuePrev + valueNext; // 1 2 3 4 4 = 14

        while (valuePrev != valueNext){  // for( ; valuePrev != valueNext; )
            // System.out.println("your next value");
            System.out.println("your next value");
            valuePrev = valueNext;
            valueNext = scanner.nextInt();
            sum += valuePrev; // sum = sum + valueNext;
            // res = valuePrev + valueNext; 0 1 1 2 3 5 8 fibonachi


            // int counter                      int sum/multiply
            //  counter++               sum = sum + number /multiply = multiply * number
            //                          sum += number;
        }
        System.out.println(sum);

    }

}
