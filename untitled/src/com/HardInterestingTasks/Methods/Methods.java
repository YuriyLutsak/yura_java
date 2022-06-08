package com.HardInterestingTasks.Methods;

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(" Value?");
        int value = scan.nextInt();
        System.out.println("Value 2 ?");
        int value2 = scan.nextInt();

    }

    //  Задание 17.9
    //  Напишите метод, который получает в качестве параметра два числа (А и В)
    //  и выводит на экран все четные числа из диапазона А ... В.
    public static void evenNumbers (int value, int value2){

        for (int i = value; i <= value2; i++) {
            if (i % 2 == 0)
            System.out.print(i + " ");
        }
    }

    //        Задание 17.8
//        Напишите метод, который принимает в качестве параметра число и возвращает:
//• -1 -в случае если число отрицательное;
//• 0 -в случае если число равно 0;
// • 1 -в случае если число положительное.
public static int info2(int value){

        if (value < 0) {
            System.out.println("NEGATIVE");
            return -1;
        }

        if (value > 0) {
            System.out.println("POSITIVE");
            return  1;

        }
        return 0;
}
    public static int info (int value){

        if (value > 0) return +1;
        if (value < 0) return -1;

        return 0;
    }

   public static String value (int value){

        if(value < 0) return "negative";
        if(value > 0) return "positive";

        return "0";
    }

    private static int getMax(int num1, int nam2) {
        int max = 0;

        if(num1 > nam2) max = num1;
        else max = nam2;

        return max;
    }
}
