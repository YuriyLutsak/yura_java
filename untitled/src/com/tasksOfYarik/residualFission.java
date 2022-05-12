package com.tasksOfYarik;

import java.util.Scanner;

public class residualFission {
    public static void main(String[] args) {

       // division(); // разница между остаточным делением и обычным (% vs /)
       // unPairNumbers(); // вывод непарных чисел из массива
       // start(); // вывод непарных чисел по заданному диапазону
       // eight(); // разделение двузначного числа на 2 отдельные составляющие (78 = 7 и 8)
    }

    public static void division(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value ");
        float value = scan.nextInt();

        float q = value % 10;
        float q2 = value / 10;
        System.out.println(q + "   " + q2);

    }

    public static void unPairNumbers() {
        int[][] value = {
                {3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13},
                {-1, 0, 2},
                {0, 1, 2, 3, 4, 5, 6,89,32,158,963,7896},
        };

        for (int i = 0; i < value.length; i++) {
            int[] arrayRow = value[i];
            for (int j = 0; j < arrayRow.length; j++) {
                int unPair = arrayRow[j];
                if (unPair % 2 != 0){
                    System.out.print(unPair + " ");
                }
            }System.out.println();
        }
    }
    public static void start(){

        int start = -10;
        int finish = 10;
        for (int res = start; res <= finish; res++) {
            if (res / 2 !=0){
                System.out.println(res);
            }
        }
    }
    public static void eight() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value");
        int num = scan.nextInt();

        int second = num % 10;
        int first = num / 10;
        System.out.println((second * 10) + first);
        int res = (second * 10) + first + 8;
        System.out.println(res);
    }

    }



