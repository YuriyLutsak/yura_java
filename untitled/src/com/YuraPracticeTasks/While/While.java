package com.YuraPracticeTasks.While;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
bigLittle();
    }
    //14_1
    // Напишите клас который принимает n целых чисел и выводит самое меньшее и самое большее. Первое значение гарантированно целое число.
    //Test case:
    //15 125 128 16 8 99 -> min = 8 max = 128
    //-48 -99 -125 -12   -> min = -125 max = -12
    public static void bigLittle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println( "in finish for result push any kay.\nyour value: ");
        int temp = 0;
        //int minVal = Integer.MIN_VALUE;
        int minVal = scanner.nextInt();
        int maxVal = minVal;

//         scanner.hasNextInt() //если е сть какая либо проверка по типу hasNext.. , то она делается первой в независимомсти от места в коде
//         scanner.nextInt();// просто забирает число с консоли
//         scanner.nextInt()


        System.out.println("your value: ");              //2  - 15
         while(scanner.hasNextInt()) {
             System.out.println("your value: ");
             temp = scanner.nextInt();//2 15


             if (minVal > temp) {
                 minVal = temp;
             }

             if (maxVal < temp) {
                 maxVal = temp;
             }
         }

        System.out.println(minVal + " " + maxVal);


       //int test = 0;
//        System.out.println("next -> " + test);
//        test = scanner.nextInt();
//        System.out.println("next -> " + test);
//
//        System.out.println("------------------------");
//
//        test = 0;
//        System.out.println("has -> " + test);
//        scanner.hasNextInt();
//        System.out.println("has -> " + test);
//        System.out.println("1******");
//        System.out.println("next -> " + test);
//        test = scanner.nextInt();
//        System.out.println("next -> " + test);
//
//        System.out.println("------------------------");
//
//        test = 0;
//        System.out.println("has -> " + test);
//        scanner.hasNextInt();
//        System.out.println("has -> " + test);
//        System.out.println("1******");
//        System.out.println("has -> " + test);
//        scanner.hasNextInt();
//        System.out.println("has -> " + test);
//        System.out.println("2******");
//        System.out.println("has -> " + test);
//        scanner.hasNextInt();
//        System.out.println("has -> " + test);
//        System.out.println("3******");
//        System.out.println("next -> " + test);
//        test = scanner.nextInt();
//        System.out.println("next -> " + test);
//        System.out.println("------------------------");
//
//        test = 0;
//        System.out.println("next -> " + test);
//        test = scanner.nextInt();
//        System.out.println("next -> " + test);
//        System.out.println("has -> " + test);
//        scanner.hasNextInt();
//        System.out.println("has -> " + test);
//
//        System.out.println("------------------------");

//        test = 0;
//        System.out.println("has -> " + test);
//        scanner.hasNextInt();
//        System.out.println("has -> " + test);
//        System.out.println("next -> " + test);
//        test = scanner.nextInt();
//        System.out.println("next -> " + test);
//        System.out.println("has -> " + test);
//        scanner.hasNextInt();
//        System.out.println("has -> " + test);

    }
}