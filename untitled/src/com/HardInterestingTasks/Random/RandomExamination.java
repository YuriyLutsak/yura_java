package com.HardInterestingTasks.Random;

import java.util.Random;

public class RandomExamination {
    public static void main(String[] args) {

    }
    public static void dice(){ // эмитация игрального кубика
        Random random = new Random();
        for (int i = 0; i < 100; i++) { // 10 количество раз
            System.out.print(random.nextInt(6) + 1 + " "); // + 1 чтоб стартовало с единицы. потому что стартует с нуля. 6 диапазон
        }
    }


    public static void randomWithoutMath(){
        //  Задание 10.1
        //  Напишите класс, который генерирует и выводит на экран
        //  случайное целое чисел из диапазона положительных двузначных чисел.

        Random ran = new Random();
        int num = ran.nextInt(99) + 1;
        System.out.println(num);

    }

    public static void randomMath() {
        //  Задание 10.1
        //  Напишите класс, который генерирует и выводит на экран
        //  случайное целое чисел из диапазона положительных двузначных чисел.

        int min = 10;
        int max = 99;
        int res = (int) ((Math.random() * min) + max);
        System.out.println(res);

        for (int i = 0; i < 1; i++) { // фор используем для количества выводимых чисел
            int num2 = (int) (Math.random() * 10); //  обязательно в скобках
            System.out.println(num2);

            // System.out.println((int) (Math.random() * 10)); // это же самое тоько без фора в одну строчку
        }

    }

    public static void randomTwoDigital() {
        //Задание 10.2
        // Напишите класс, который генерирует и выводит на экран случайное целое чисел из диапазона положительных
        // и отрицательных двузначных чисел.

        int res2 = (int) (Math.random() * 100);
        if (res2 < 10) {
            int resMinus = (int) (Math.random() * -100);
            System.out.println(resMinus);
        } else {
            System.out.println(res2);
        }

    }
    public static void random(){
        //Задание 12.5
//        Напишите класс, который генерирует 15 целых чисел в интервале от -25 до 25, печатает их,
//        а затем выводит на экран информацию о том, сколько из них были:
//• положительными;
//• четными;
//• однозначными.


        Random ran = new Random();
        int counterEven = 0;
        int counterPositive = 0;
        int counterSingle = 0;

        for (int i = 0; i < 3; i++) {
            int random = ran.nextInt(- 25, 25);
            System.out.print(random + " ");
            if (random / 10 == 0){
                counterSingle++;
            }
            if (random % 2 == 0) {
                counterEven++;
            }

            if(random >= 0){
                counterPositive++;
            }
        }
        System.out.println("\nPositive:  " + counterPositive + " \nEven: " + counterEven + "\nSingle: " + counterSingle);

    }


}