package com.HardInterestingTasks;

import java.util.Scanner;

/**
 * Задание 17.38 Напишите метод, который получает в качестве параметров два значения -координаты (Х и У) точки А.
 * метод возвращает одно из значений 1, 2, 3 или 4 -в зависимости от того, в какой четверти системы координат находится точка.
 * В случае если точка находится на, как минимум, одной из осей координат, метод возвращает -1.
 */
public class qwerty {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" coordinate X: ");
        int valueX = scan.nextInt();
        System.out.println(" coordinate Y: ");
        int valueY = scan.nextInt();
        //System.out.println(quoter(valueX, valueY));
        quoter(valueX, valueY);

    }

    public static int quoter(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("coordinate is in second quoter");
            return 2;
        }

        if (x > 0 && y < 0) {
            System.out.println("coordinate is in third quoter");
            return 3;
        }

        if (x < 0 && y < 0) {
            System.out.println("coordinate is in forth quoter");
            return 4;
        }
        if (x < 0 && y > 0) {
            System.out.println("coordinate is in second quoter");
            return 1;
        }

        return -1;
    }
}
