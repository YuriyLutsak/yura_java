package com.YuraPracticeTasks.Array.Methods;

/**
 * я как всегда не понял ничего. я могу сравнивать только рядомстоящие числа по порядку,
 * а вот если они не рядом, а разбросаны, то не могу.((((((((((((
 *
 * Задание 19.20
 * Напишите метод, который получает в качестве параметра массив
 * и проверяет есть ли там повторяющиеся элементы.
 * Если есть - возвращает TRUE
 */
rggrr

public class Array1920_RapidNumbers {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 2, 8, 9};
        System.out.println(isHasRapidNumbers(array));
    }
    public static boolean isHasRapidNumbers(int[] arr) {

        for (int i = 1; i < arr.length; i++) {

            if (arr[i - 1] == arr[i]) {

                return true;
            }
        }
        return false;
    }
}