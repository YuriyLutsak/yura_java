package com.tasksOfYarik;

import java.util.Scanner;

public class positiveValue {

    public static void main(String[] args) {

//        Задание 12.5
//        Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25,
//        печатает их, а затем выводит на экран информацию о том,
//        сколько из них были:
//• положительными;
//• четными;
//• однозначными.



        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter range nums start: ");
        int numberMin = scanner.nextInt();
        System.out.println(" enter range nums finish: ");
        int numberMax = scanner.nextInt();

        System.out.println(" how match we do: ");
        int counter = scanner.nextInt();

        int counterPozNum = 0;
        int counterEvenNum = 0;
        int counterOneNum = 0;
        int counterOutNum = 0;
        int number;

        for (int i = 0; i < counter; i++) {

            System.out.println(i + 1 + " enter num :  ");
            number = scanner.nextInt();

            if (number < numberMin || number > numberMax) {
                counterOutNum++;
                continue;
            }
            if (number >= 0) {
                counterPozNum++;
            }
            if (number % 2 == 0) {
                counterEvenNum++;
            }
            if (number > -10 && 10 > number) {
                counterOneNum++;
            }
        }
        System.out.println(counterPozNum + "   " + "num is pozitiv");
        System.out.println(counterEvenNum + "   " + "num is even %2");
        System.out.println(counterOneNum + "   " + "num is equivalent");
        System.out.println(counterOutNum + "   " + "num is out rules");
    }
}

     /*   Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");

        for (int i = - 25; i <= 25; i++) {
          //  System.out.println(i);
            if (i > 0){
               // System.out.println("Positive values: " + i);
            }
            if (i % 2 == 0){
               // System.out.println(i);
            }
            if (i )
           // int positiveValue =
        }
    }
}
*/


// x = i > 0
//int count = 0, num = 123456;
//for (num != 0; num /= 10){
//        ++count
//        System.out.println("Number of digits: " + count); }
