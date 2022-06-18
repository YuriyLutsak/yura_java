package com.YuraPracticeTasks.Array.Methods;

/**
 * я как всегда не понял ничего. я могу сравнивать только рядомстоящие числа по порядку,
 * а вот если они не рядом, а разбросаны, то не могу.((((((((((((
 * <p>
 * Задание 19.20
 * Напишите метод, который получает в качестве параметра массив
 * и проверяет есть ли там повторяющиеся элементы.
 * Если есть - возвращает TRUE
 */

public class Array1920_RapidNumbers {
    public static void main(String[] args) {

        int[] array = {1,2,3, 7 ,4,5,6,7,8,9};

        System.out.println(isHasRapidNumbers(array));
       // arrEnumeration(array);

    }

//    public static void arrEnumeration(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {    // 999
//            System.out.println("beginnig of first for");
//            System.out.println(i + ":  " + arr[i] + "      ");
//            System.out.println("end of first for");
//            System.out.println();
//
//            for (int j = 0; j < arr.length; j++) {
//                System.out.println("beginning of second for");
//                System.out.println(j + ": " + arr[j] + "      ");
//                System.out.println("end of second for");
//                if (arr[i] != arr[j]) {
//                    System.out.print(" not equilse    ");
//                } else {
//                    System.out.println(" equilse     ");
//                }
//            }
//        }
//    }


    public static boolean isHasRapidNumbers(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
//            System.out.println("beginnig of first for");
//            System.out.println(i + ":  " + arr[i] + "      ");
//            System.out.println("end of first for");

            for (int j = 0; j < arr.length; j++) {
//                System.out.println("beginning of second for");
//                System.out.println(j + ": " + arr[j] + "      ");
//                System.out.println("end of second for");
                if (arr[j] == arr[j]) {
                   // System.out.println(" not equilse    ");
                    return false;
                }
//                else {
//                   System.out.println(" equilse");
//                }
            }
        }
        return true;
    }
}
