package com.HardInterestingTasks.While;

import java.util.Scanner;

public class WhileIf {
    public static void main(String[] args) {

    }
    public static void evenNumbers(){
        // Задание 15.31 Напишите класс,
        // который принимает с клавиатуры серию целых чисел до тех пор,
        // пока количество четных чисел в серии остается меньше 3.

        Scanner scan = new Scanner(System.in);
        // System.out.println("Your value: ");

        int value  = 0;
        int counter = 0;

        while (counter < 3){
            System.out.println("your next value: ");
            value = scan.nextInt();
            if (value % 2 == 0){
                counter++;
            }
        }
        System.out.println(" ggtyf");

    }
}
