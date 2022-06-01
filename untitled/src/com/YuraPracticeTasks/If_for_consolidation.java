package com.YuraPracticeTasks;

import java.util.Scanner;

public class If_for_consolidation {

    public static void main(String[] args) {
//        Считай с клавіатури число.
//        Если оно четное, выведи соответствующую надпись. Если не четное тоже.
//        Также если число не четное выведи на экран сотвецтвующую надпись если оно
//        делиться на 3,
//        также если делиться на 5.
//        Потом если число отрицательное выведи соответствующую надпись.
//        И выясни делиться ли это отрицательное число на 8.
//        Дальше выясни и выведи на экран однозначное ли число.
whatIsNumber();
whatIsNumber();
        whatIsNumber();
        whatIsNumber();
        whatIsNumber();
        whatIsNumber();
        whatIsNumber();
        whatIsNumber();

    }
    public static void whatIsNumber(){
        Scanner scan = new Scanner(System.in);
        System.out.println("your value: ");
        int value = scan.nextInt();

        if (value % 2 == 0){
            System.out.println(value +  " value is even.");
        } else {
            System.out.println(value  + " value is odd ");

            if (value % 3 == 0){
                System.out.print(" plus divide by 3 ");
            }

            if (value % 5 == 0){
                System.out.print( " plus divide by 5 ");
            }
        }

        if (value < 0){
            System.out.println( value + " is negative ");

            if (value % 8 == 0) {
                System.out.println(" plus divide by 8");
            }
        }

        if (value / 10 == 0){
            System.out.println(value + " single digit ");
        } else {
            System.out.println(value + " two-digit ");
        }
    }

}
