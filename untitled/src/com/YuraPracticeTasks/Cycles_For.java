package com.YuraPracticeTasks;

import java.util.Scanner;

public class Cycles_For {

    public static void main(String[] args) {
      amountNumbers();
    }
    public static void hj(){
       // 14_1 Напишите клас который принимает n целых чисел и выводит самое меньшее и самое большее.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int amount = scanner.nextInt();
        System.out.println("your amount of number is: " + amount);
        int temp = 0;

        for (int i = 0; i < temp; i++) {
            temp = scanner.nextInt();
            System.out.println(temp + " your number");

        }

    }

    public static void pmmk(){
//        Задание 12.10
//        Контрольная работа считается «провальной», если более половины учеников получили неудовлетворительные оценки.
//        Напишите класс, который принимает с клавиатуры число учеников в группе,
//        а затем -оценку каждого ученика.
//        Класс должен определить, была ли контрольная «провальной».
//        ПС в класе может быть и 4-5 человек.
    }


    public static void lskm(){

//        Задание 12.5
//        Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25, печатает их,
//        а затем выводит на экран информацию о том, сколько из них были:
//• положительными;
//• четными;
//• однозначными.

    }

    public static void lsm(){
       // Задание 12.4
        // Напишите класс, который принимает с клавиатуры 17 целых чисел и выводит на экран информацию о том,
        // сколько из них были больше, чем предыдущее число.
        // 1 2 3 4 5 6 7 8 9
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int amountNumbers = scanner.nextInt();//17
        int prev = scanner.nextInt();
        int currant = 0;
        int counter = 0;

        for(int i = 0; i < amountNumbers; i++) {
            currant = scanner.nextInt();

            System.out.println("prev = " + prev + "\ncurrant = " + currant);
            if (currant > prev) {
                counter++;
            }

            prev = currant;
        }

    }


    public static void lm(){
//        Задание 12.2
//        Напишите класс, который принимает с клавиатуры 15 целых чисел и выводит на экран информацию о том,
//        сколько из них были четными и сколько нечетными.
//        ПС если хочешь не вводить вручную, есть лайфхаки,
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int amountNumbers = scanner.nextInt();//3
        int temp;
        int counterEven = 0;
        int counterOdd = 0;

        for (int i = 0; i < amountNumbers; i++) {
            temp = scanner.nextInt();// 5 -10 15
            System.out.println("You input: " + temp);

            if (temp % 2 != 0){
                counterOdd++; // 1 2
            }else {
                counterEven++;
            }

        }

        System.out.println(" " + counterOdd );

    }

    public static void amountNumbers() {
//     Напишите класс, который принимает с клавиатуры 10 целых чисел и выводит на экран информацию о том,
//     сколько из них бьmи положительными.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of numbers: ");
        int amountNumbers = scanner.nextInt();//3
        System.out.println("Enter number");
        int temp;
        int counter = 0;

            for (int i = 0; i < amountNumbers; i++) {
                temp = scanner.nextInt();// 5 -10 15
                System.out.println("You input: " + temp);

                if (temp > 0){
                    counter++; // 1 2
                }
            }
        System.out.println(counter + " positive numbers");
        }






    public static void fortyFifth() {
        // Задание 11.20
        // Напишите класс, который выводит на экран в строку положительные трехзначные числа,
        // делящиеся на 80 с остатком 45 (в возрастающем порядке).
        // Числа должны отделяться друг от друга знаком «пробел».
        // Перед началом и после окончания вывода серии чисел на экран вывода следует вывести текстовые сообщения (по выбору).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value: ");
        int value = scanner.nextInt();

        // 45 125 205 285 365

        for (int i = 45; i < value; i += 80) {

            System.out.print(i + " ");
        }
    }


 public static void seven() {

     //Задание 11.17
     // Напишите класс, который выводит на экран в строку положительные трехзначные числа,
     // заканчивающиеся на 7 (в возрастающем порядке). Числа должны отделяться друг от друга знаком «пробел».

     Scanner scanner = new Scanner(System.in);
     System.out.println("Value: ");
     int value = scanner.nextInt();

     for (int i = 107; i < value; i += 10) {
         System.out.print(i + " ");
     }

//     for (int i = value; i < 1000; i ++) {
//         if (i % 10 == 7)
//         System.out.print(i + " ");
//        }
//     }
 }
 public static void latticeSign(){
    // Задание 11.16.1
     // Напишите класс, который читает с консоли 1 число и
     // выводит на экран в строку все положительные двузначные числа
     // (в возрастающем порядке).
     // Числа должны отделяться друг от друга знаком «пробел».
     // Рядом с числом, которое делится на 4, следует вывести знак «#» (решетка) без пробела между числом и знаком.
     Scanner scanner = new Scanner(System.in);
     System.out.println("Value: ");
     int value = scanner.nextInt();

     for (int i = value; i < 100; i++) {
         if (i % 4 == 0){
             System.out.print(i + "# ");
         } else {
             System.out.print(i + " ");
         }
     }

 }

 public static void oddNumbers(){
     //Задание 11.16 Напишите класс,
     // который читает с консоли 1 число и выводит на экран в строку все положительные не четные числа (в возрастающем порядке)
     // меньше за это число.
     // Числа должны отделяться друг от друга знаком «пробел».
     // Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт,
     // а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
     Scanner scanner = new Scanner(System.in);
     System.out.println("Value: ");
     int value = scanner.nextInt();

     for (int i = 1; i <= value; i+=2) {

         System.out.print(i + " ");
     }

 }
    public static void evenNumbers(){
       // Задание 11.15
        // Напишите класс,
        // который читает с консоли 1 число и выводит на экран в строку все положительные четные числа (в возрастающем порядке)
        // меньше за это число.
        // Числа должны отделяться друг от друга знаком «пробел».
        // Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт,
        // а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value: ");
        int value = scanner.nextInt();// 99

//        if (value % 2 != 0) { для решения от валуе и дальше
//            value++;
//        }

        for (int i = 2; i <= value; i += 2) { // это не правильно, но прикольно
            System.out.print(i + " ");
        }

//        for (int i = 2; i <= value ; i++) {
//            if (i % 2 != 0)
//            System.out.print(i + " ");
//
//        }

    }

    public static void minusCycle(){
       // Задание 11.13 Напишите класс, который читает с консоли 2 числа и выводит на экран в строку все числа
        // (в УБЫВАЮЩЕМ порядке) с этого диапазона.
        // Числа должны отделяться друг от друга знаком «пробел».
        // Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт,
        // а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.

        Scanner scanner = new Scanner(System.in);
        System.out.println( "\n" + "Value1: ");
        int value1 = scanner.nextInt();
        System.out.println("Value2: ");
        int value2 = scanner.nextInt();

        for (int i = value1; i >= value2; i--) {
            System.out.print(i + " ");

        }
        if (value1 < value2 ) {
            for (int j = value2; j >= value1; j--) {
                System.out.print(j + " ");
            }

        }}
    public static void cycles(){
        //        Задание 11.12
//        Напишите класс, который читает с консоли 2 числа и выводит на экран в строку все числа
//        (в возрастающем порядке) с этого диапазона. Числа должны отделяться друг от друга знаком «пробел».
//        Перед началом вывода на экран (в отдельной строке) следует вывести слово Старт,
//        а после окончания вывода чисел (тоже в отдельной строке)-слово Финиш.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Value1: ");
        int value1 = scanner.nextInt();
        System.out.println("Value2: ");
        int value2 = scanner.nextInt();

        for (int i = value1; i <= value2 ; i++) {
            System.out.print(i + " ");
        }
            if (value1 > value2 ){
                for (int j = value2; j <= value1; j++) {
                    System.out.print(j + " ");
                }
            }
        System.out.println("Finish");
    }
    }


