package com.tasksOfYarik;

import java.util.Scanner;

public class doWhile123 {
    public static void main(String[] args) {

        // Задание 15.7 Напишите класс, который должен принять с клавиатуры значение 123 и вывести на экран сообщение Код принят.
//              Класс будет снова и снова принимать с клавиатуры значения до тех пор, пока не будет введено значение 123.
//              На каждое вводимое с клавиатуры значение, отличное от 123, класс должен выводить сообщение Код неверный, повторите ввод.
//
        Scanner scan = new Scanner(System.in);


        int val = 123;
        do {
            System.out.println("Enter 123");
            val = scan.nextInt();
            if( val == 123){
                System.out.println("cod accepted ");
            }else {
                System.out.println("cod not correct. try again");
            }
        }while (val != 123);


    }
}
