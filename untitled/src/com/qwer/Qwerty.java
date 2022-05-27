package com.qwer;

import java.util.Scanner;

public class Qwerty {
    public static void main(String[] args) {
        minusCycle();minusCycle();minusCycle();minusCycle();
    }

    public static void minusCycle(){
        // Задание 11.13 Напишите класс, который читает с консоли 2 числа и выводит на экран в строку все числа
        // (в УБЫВАЮЩЕМ порядке) с этого диапазона.
        // Числа должны отделяться друг от друга знаком «пробел».
        // Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт,
        // а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Value1: ");
        int value1 = scanner.nextInt();
        System.out.println("Value2: ");
        int value2 = scanner.nextInt();

        for (int i = value1; i <= value2; i++) {
            System.out.println(i);
        }
    }
}
