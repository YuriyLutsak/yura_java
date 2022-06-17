package com.YuraPracticeTasks.Array.Methods;

import java.util.Random;

/**
 * Задание 19.7
 * Напишите метод, который получает в качестве параметра массив и заполняет его случайными числами
 * в диапазоне О ... 99. (масив должен быть на 100 елемментов).
 * <p>
 * ПС: тут кстати впервые встречаэться работа с ссылочными типами. Можно обговорить.
 * Гуглить прийдеться, ну если не долго, то не понятно.
 */

public class Array197 {
    public static void main(String[] args) {
        // Random ran = new Random();

        int[] arr = new int[100];
        array(arr);

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(i + ": " + arr[i] + "   ");
//        }
    }

    public static void array(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (int) ((Math.random() + 1) * 100);

            System.out.println(i + ": " + arr[i] + "   ");
        }
    }

}
