package com.YuraPracticeTasks;

import java.util.Random;

public class RandomExamination {

    public static void main(String[] args) {



      //  Задание 10.1
        //  Напишите класс, который генерирует и выводит на экран
        //  случайное целое чисел из диапазона положительных двузначных чисел.

       /* int min = 10;
        int max = 99;
        int res = (int) ((Math.random() * min) + max);
        System.out.println(res);

        for (int i = 0; i < 1; i++) { // фор используем для количества выводимых чисел
            int num2 = (int) (Math.random() * 10); //  обязательно в скобках
            System.out.println(num2);
            // System.out.println((int) (Math.random() * 10)); // это же самое тоько без фора в одну строчку
        }

        Random ran = new Random();
        int num = ran.nextInt(99) + 1;
        System.out.println(num);*/

        //Задание 10.2
        // Напишите класс, который генерирует и выводит на экран случайное целое чисел из диапазона положительных
        // и отрицательных двузначных чисел.

        int res2 = (int) (Math.random() * 100);
        if (res2 < 10){
            int resMinus = (int) (Math.random() * - 100);
            System.out.println(resMinus);
        }else {
            System.out.println(res2);}

    }




 /*
         for (double i = 0; i < 1; i++) {
            double num1 = Math.random() * 10;
            System.out.println(num1);
            System.out.println(Math.random() * 10);
        }

        int min = 10;
        int max = 99;
        int res = (int) ((Math.random() * min) + max);
        System.out.println(res);

         for (int i = 0; i < 1; i++) { // фор используем для количества выводимых чисел
            int num2 = (int) (Math.random() * 10); //  обязательно в скобках
            System.out.println(num2);
            // System.out.println((int) (Math.random() * 10)); // это же самое тоько без фора в одну строчку
        }

        Random ran = new Random();
        int num = ran.nextInt(99) + 1;
        System.out.println(num);



        for (int i = 0; i < 1 ; i++) {
            int num3 = (int) (Math.random() * - 100);
            System.out.println(num3);
        }
        for (int i = 0; i < 1; i++) {
            int num4 = (int) (Math.random() * 100);
            System.out.println(num4);
        }



        Random random1 = new Random();
        for (int i = 0; i < 1; i++) {
            System.out.println(random1.nextInt(99) - 10);
        }*/


    public static void randomMinusPlus (){
        int res2 = (int) (Math.random() * 100);
        if (res2 < 10){
            int resMinus = (int) (Math.random() * - 100);
            System.out.println(resMinus);
        }else {
            System.out.println(res2);}

    }

}
