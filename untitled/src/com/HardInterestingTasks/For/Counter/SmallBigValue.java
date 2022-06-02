package com.HardInterestingTasks.For.Counter;

import java.util.Scanner;

public class SmallBigValue {
    public static void main(String[] args) {
        smallBigValue();
    }
    // Напишите клас который принимает n целых чисел и выводит самое меньшее и самое большее.
    public static void smallBigValue(){
        Scanner scan = new Scanner(System.in);

        int tempValue;
        int maxValue = 0;
        int minValue = 0;

        System.out.println( "for get result push any kay.\n enter first value: " );

        for (int i = 0; scan.hasNextInt(); i++) {   // hasNextInt();это вопрос - соответствует ли вводимое числу?
            System.out.println(" enter next value: ");
            tempValue = scan.nextInt();

            if (tempValue > maxValue){
                maxValue = tempValue;
            }

            if (tempValue < minValue){
                minValue = tempValue;
            }
        }
        System.out.println("minValue is: " + minValue + " maxValue is: " + maxValue);
    }

}
/*


    // minusCycle();minusCycle();minusCycle();minusCycle();


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
*/
