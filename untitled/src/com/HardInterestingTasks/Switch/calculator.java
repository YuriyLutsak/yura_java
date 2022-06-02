package com.HardInterestingTasks.Switch;

import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Your roll?");
        String rol = scan.nextLine();
        System.out.println("Your pass?");
        String pass = scan.nextLine();


        if (rol.equals("Admin") && pass.equals("0000")) {
            System.out.println("Hello, " + rol + ". Enter Nun1");


       // System.out.println("Enter Nun1");
        float num1  = scan.nextFloat();
        System.out.println("Enter Num2");
        float num2 = scan.nextFloat();
        float res;
        System.out.println("Make action");
        String action = scan.nextLine();
        action = scan.nextLine();

        switch(action){
            case "+":
                res = num1 + num2;
                System.out.println("Result: " + res);
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("error. num2 cannot be = 0");
                }   else
                {res = num1 / num2;
                    System.out.println("Result: " + res);
                }
                break;
            default:
                System.out.println("there are only two actions: '+' || '/' ");
        }
    }else {
            System.out.println("Try again ");}
    }



        /* опртимизация swith case без надписи break

        int value = 4;

        switch (value) {
            case 1 -> System.out.println("val == 1");
            case 2, 3 -> System.out.println("val == 2,3");
            case 10 -> System.out.println("val == 10");
            default -> System.out.println("this val doesn't exist");
        }

         */

    }


