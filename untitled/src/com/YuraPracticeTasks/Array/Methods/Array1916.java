package com.YuraPracticeTasks.Array.Methods;

/**
 * Задание 19.16 Любопытненько)
 *
 *
 * ТУТ БЛЯХА МУХА Я СОВСЕМ ГОРЖУСЬ СОБОЙ))))))))))))))))))))))))))))))
 * АЖ ПОШЕЛ КУРИТЬ И СДЕЛАЛ СЕБЕ КОФИЮ
 *
 *
 *  Напишите метод,
 *  который получает в качестве параметра массив  *
 *  и заполняет его положительными случайными двузначными числами так,
 *  чтобы значение первого элемента было равно значению последнего,
 *  значение второго элемента было равно значению предпоследнего и так далее
 */

public class Array1916 {
    public static void main(String[] args) {

        int[] arr = new int [7];
        array(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void array(int[] arr){

        int middle = arr.length / 2; // [1, 2, 5, 7, 7, 5, 2, 1]

        int middleOdd = middle + 1;

        for (int i = 0, j =  arr.length - 1; i < middle; i++, j--) {
            arr[i] = (int) ((Math.random() + 1) * 100);
            arr[j] = arr[i];

            System.out.println(i + ": " + arr[i] + " = " + j + ": " + arr[i] + " " );

        }
        if (middle % 2 != 0){
            //arr[middle] = (int) ((Math.random() + 1) * 100);
            System.out.println(middle + ": " + arr[middleOdd]);
        }
    }
}
