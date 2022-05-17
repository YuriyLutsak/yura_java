package com.tasksOfYarik;

import java.util.Scanner;

public class qwerty {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");

       /* for (int i = - 25; i <= 25; i++) {
            System.out.println(i);
        }
*/


//        Задание 12.5
//        Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25,
//        печатает их, а затем выводит на экран информацию о том,
//        сколько из них были:
//• положительными;
//• четными;
//• однозначными.


        /*Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");

        for (int i = scan.nextInt(); i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }*/

        /*for (int i = 107; i <= 997; i++) {
            int res = i + 10;
            System.out.print(res + " ");
            }*/

//        for (int i = 107; i <= n; i = i + 10) {
//            System.out.print(i + " ");

        for (int i = 107; i <= 997; i = i + 10 ) {
            System.out.println(i + " ");
        }

        int start = 107;
        int finish = 997;
        int i = start;

        while (start <= finish){

            start = start + 10;
            System.out.print(start + " ");
        }


        }
        /*int q = 107;
        int s = q % 10;
        System.out.println(s);*/
//107 117 127 137

     /*   Задание 11.17 Напишите класс, который выводит на экран в строку положительные трехзначные числа, заканчивающиеся на 7
     (в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».



     Задание 11.15 Напишите класс, который читает с консоли 1 число и выводит на экран в строку
        все положительные четные числа (в возрастающем порядке) меньше за это число.
        Числа должны отдляться друг от друга знаком «пробел». Перед началом вывода на экран (в отдельной строке)
        следует вывести слово Старт, а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.*/



    public static int scanner(int value) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
       // int value = scan.nextInt();
        return value;
    }
}