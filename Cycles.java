package com.tasksFromMentors;

/**
 * Цикл while:
 * У метод приходить число яке більше ніж 0, потрібно вивести усі числа починаючи з 0 до цього числа включно.
 * <p>
 * Цикл for:
 * Дані два цілих числа int a та int b .
 * Потрібно вивести числа від a до b включно, у порядку зростання, якщо a < b, або у порядку зменшення якщо a > b.
 */

public class Cycles {
    public static void main(String[] args) {

       // fromNullToNumber(5);
//        betweenNumbers(5,10);
//        betweenNumbers(10,5);


    }

    protected static void fromNullToNumber(int number) {
        int num = 0;
        while (num <= number) System.out.println(num++);
    }

    protected static void betweenNumbers(int a, int b) {
        if (a < b) {
            for (int i = a; i <= b; i++) {
                System.out.print(i + ", ");
            }
            System.out.println();
        } else
            for (int i = a; i >= b; i--) {
            System.out.print(i + ", ");

        }
    }
}
