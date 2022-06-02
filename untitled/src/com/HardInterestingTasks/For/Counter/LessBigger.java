package com.HardInterestingTasks.For.Counter;

import java.util.Scanner;

public class LessBigger {
    public static void main(String[] args) {

    }
    public static void previousCurrent() {
        // Задание 12.4
        // Напишите класс, который принимает с клавиатуры 17 целых чисел и выводит на экран информацию о том,
        // сколько из них были больше, чем предыдущее число.

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of numbers: in this case its = 17");
        int amount = scan.nextInt();

        System.out.println("Enter first (previous) number");
        int previous = scan.nextInt();

        int current = 0;
        int counter = 0;

        for (int i = 1; i < amount; i++) {
            System.out.println("Enter number: ");
            current = scan.nextInt();//
            System.out.println(previous + " - previous " + current + " - current");

            if (current > previous) {  //true
                counter++; //оно яблоко выьрал - 9 бубочек передвинул  // counter =counter +1  идет кака датчик движения
            }
            previous = current;

        }

        System.out.println(counter + " are bigger then previous");
    }

}
