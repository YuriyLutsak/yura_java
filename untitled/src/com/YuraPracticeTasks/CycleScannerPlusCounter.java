package com.YuraPracticeTasks;

import java.util.Random;
import java.util.Scanner;

public class CycleScannerPlusCounter {
    public static void main(String[] args) {
        //previousCurrent();
        //random();
 schoolMark();
    }

    public static void schoolMark(){
//        Задание 12.10
//        Контрольная работа считается «провальной»,
//        если более половины учеников получили неудовлетворительные оценки.
//        Напишите класс, который принимает с клавиатуры число учеников в группе,
//        а затем -оценку каждого ученика. Класс должен определить, была ли контрольная «провальной».
//        ПС в класе может быть и 4-5 человек.

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter amount of students: ");
        int amountOfStudents = scanner.nextInt();
        System.out.println("enter first mark: "); //нулевая оценка в цикле будет
        int previousMark = scanner.nextInt();

        int currentMark = 0; // int делаем здесь, чтоб выделтть память и только обращаться к назвагию в дальнейшем, а не выделять память
        int sumMark = 0;
        int counter = 0;

        for (int i = 1; i < amountOfStudents; i++) { // стартуем с единицы т.к. нулевая оценка уже есть выше
            System.out.println("next mark: ");
            currentMark = scanner.nextInt();
            System.out.println("prev: " + previousMark + " current: " + currentMark);

        sumMark = previousMark + currentMark + currentMark;
            counter++;
        previousMark = currentMark;
        }
        System.out.println(sumMark);

















    }

    public static void random(){
 //        Задание 12.5
//        Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25, печатает их,
//        а затем выводит на экран информацию о том, сколько из них были:
//• положительными;
//• четными;
//• однозначными.
//        int random = (int) ((Math.random()) *10);
//
//        for (int i = random; i < 25; i++) {
//            System.out.print(random + " ");
//        }


        Random ran = new Random();
        int counterEven = 0;
        int counterPositive = 0;
        int counterSingle = 0;

        for (int i = 0; i < 3; i++) {
            int random = ran.nextInt(- 25, 25); //8
            System.out.print(random + " ");

            if (random / 10 == 0){
                counterSingle++;
            }

            if (random % 2 == 0) {
                counterEven++;
            }

            if(random >= 0){
                counterPositive++; // почему всегда меньше на одно число?  Потому что на елсе всегда остановка идет и в него не заходит.

            }

            // if - else
            // if - else if
            // if - else if - else
            // if if if if if ....
        }
        System.out.println("\nPositive:  " + counterPositive + " \nEven: " + counterEven + "\nSingle: " + counterSingle);
    }

    public static void previousCurrent(){
        // Задание 12.4
        // Напишите класс, который принимает с клавиатуры 17 целых чисел и выводит на экран информацию о том,
        // сколько из них были больше, чем предыдущее число.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers: in this case its = 17");
        int amount  = scan.nextInt();

        System.out.println("Enter first(previous) number");
        int previous = scan.nextInt();

        int current  = 0;
        int counter = 0;

        for (int i = 1; i < amount; i++) {
            System.out.println("Enter number: ");
            current = scan.nextInt();//
            System.out.println(previous + " - previous " + current + " - current");

            if (current > previous) {
               counter +=9; //оно яблоко выьрал - 9 бубочек передвинул
            }
            previous = current;

        }

        System.out.println(counter + " are bigger then previous");
    }

    public static void evenOdd(){

//        Задание 12.2
//        Напишите класс, который принимает с клавиатуры 15 целых чисел и выводит на экран информацию о том,
//        сколько из них были четными и сколько нечетными.
//        ПС если хочешь не вводить вручную, есть лайфхаки,

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers");
        int amount = scan.nextInt();
        int value = 0;
        int counterEven = 0; // нужно здесь создавать эти переменные
        int counterOdd = 0;


        for (int i = 0; i < amount; i++) {
            System.out.println("Enter value: " + value); // int value = scan.nextInt(); здесь нельзя создавать эти переменные
            value = scan.nextInt();

            if (value > 0){
               // int counterEven = 0;
                counterEven++;

            }else {
              //  int counterOdd = 0;
                counterOdd++;
            }
        }
        System.out.println(counterEven + " is even numbers");
        System.out.println(counterOdd + " is odd numbers");

    }
    public static void counter(){
        //     Напишите класс, который принимает с клавиатуры 10 целых чисел и выводит на экран информацию о том,
        //     сколько из них бьmи положительными.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount numbers");
        int amountNum = scan.nextInt();
        //int temp;
        int counter = 0;

        for (int i = 0; i < amountNum; i++) {
            System.out.println("Enter number");
            int temp = scan.nextInt();

            if (temp > 0){
                counter++;
            }
        }
        System.out.println(counter + " are positive numbers");
    }
}
