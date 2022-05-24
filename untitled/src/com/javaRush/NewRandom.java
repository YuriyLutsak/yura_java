
package com.javaRush;
import java.util.Random;
import java.util.Scanner;

public class NewRandom {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i < 10; i++) {
           // System.out.println(random.nextInt(6) + 1);
        }

        //Задание 10.1
        // Напишите класс, который генерирует и выводит на экран случайное целое чисlo
        // из диапазона положительных двузначных чисел.

        int min1 = 100;
        int min2 = 900;
        int randomNum = (int) ((Math.random() * min1 - 13));
       // System.out.println(randomNum);



        Random random1 = new Random();
        for (int i = 0; i < 1; i++) {
            int qw = random1.nextInt(99) + 1;
           // System.out.println(qw);
        }


            int qwe = (int) (Math.random());
          //  System.out.println(qwe);

        int a = 10;
        int b = 99;
        int res = (int) (Math.random() + 6) * a + b - 18;

        System.out.println(res);
        }













        //     Задание 10.1
        //     Напишите класс, который генерирует и выводит на экран
        //     случайное целое чисел из диапазона положительных двузначных чисел.

        //  res = 0.00000000000001 => 0.99999999  ||  0.234365238762436423 * 10 = 23 + min(10) = 33

      /*  int min = 10;
        int max = 99;
        int range = max - min + 1;
        int randomNumber = (int) (Math.random() * range) + min;

        System.out.println(randomNumber);*/

      /*  Random ranNum = new Random();
        for (int i = 10; i < 100; i++) {
           int num = ranNum.nextInt(90) + 10;
            System.out.println(num);
        }*/
    }



