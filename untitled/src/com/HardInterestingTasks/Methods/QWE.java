package com.HardInterestingTasks.Methods;

import java.util.Scanner;

public class QWE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" count of enter nums: ");
        int scanNum = scanner.nextInt();
        int res = 0;
        int tem = 0;
        int div = 10;

        while (scanNum / div != 0) {
            tem = (scanNum / div) % 10;

            res = res * 10 + tem;
            div = div * 10;
        }
        System.out.println(res);
    }


    public static int maxValue() {
        // Задание 17.12
        // Напишите метод, который принимает в качестве параметра целое число
        // и возвращает самую большую цифру в этом числе.

        Scanner scan = new Scanner(System.in);
        System.out.println("value: ");
        int val = scan.nextInt();

        int maxValue = 0;
        int division = 1;
        int temp = 0;

        while (val / division != 0){
            temp = (val / division) % 10;
            division = division * 10;
            System.out.print(temp + " ");

        }

        return maxValue;
    }
}

//            int max = val % 10;  // 59 max = 9
//            int min = val / 10;
//
//            if (min > max){
//                max = min;
//            }
//            System.out.println(max);
//
//                    }

