package com.tasksOfYarik;

import java.util.Objects;
import java.util.Scanner;

public class qwerty {
    public static void main(String[] args) {
//        Задание 15.28 типичная задача для вайла))))
//        Напишите класс, который принимает с клавиатуры целое число и посчитывает число цифр в нем (количество цифр в числе).
//        Результат подсчета должен быть выведен на экран.
//        Например, для числа 534 на экран будет выведено 3 цифры.
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int num1 = num / 10;






        /*
         Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter number: ");
        int inputNum1 = scanner1.nextInt();

        int division1 = 1;
        int sum1 = 0;

        int res = (inputNum1 / division1) % 10;
        sum1 = sum1 + (inputNum1 / division1) % 10;

        System.out.println(res);
        System.out.println(sum1);
*/


       /* Scanner scanner = new Scanner(System.in);
        System.out.println("enter number: ");
        int inputNum = scanner.nextInt();

        int division = 1;
        int sum = 0;

        while (inputNum / division != 0) {             // (inpun != 0)
            sum = sum + (inputNum / division) % 10;    // sum += inputNum % 10;
            division = division * 10;                  // inputNum /= 10;
        }
        System.out.println(sum);

        sum();*/


    }



      /*int res1 = (inputNum % 10);
        int res2 = (inputNum / 10) % 10;
        int res3 = (inputNum / 100) % 10;
        int res4 = (inputNum / 1000) % 10;
        int res5 = (inputNum / 10000) % 10;

        System.out.println(res1 + " this is sum" + "res1");
        System.out.println(res2 + " this is sum" + "res2");
        System.out.println(res3 + " this is sum" + "res3");
        System.out.println(res4 + " this is sum" + "res4");
        System.out.println(res5 + " this is sum" + "res5");*/


    public static void sum2() {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("enter number: ");
        int inputNum1 = scanner1.nextInt();

        int res2 = inputNum1 % 10;
        int res3 = inputNum1 / 10;
        System.out.println(inputNum1 % 10);
        System.out.println(inputNum1 / 10);


    }






    public static void sum (){
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter value");
    int inputNum = scan.nextInt();

    int res1 = (inputNum % 10);
    int res2 = (inputNum / 10) % 10;
    int res3 = (inputNum / 100) % 10;
    int res4 = (inputNum / 1000) % 10;
    int res5 = (inputNum / 10000) % 10;

        System.out.println(res1 + " this is sum" + " res1");
        System.out.println(res2 + " this is sum" + " res2");
        System.out.println(res3 + " this is sum" + " res3");
        System.out.println(res4 + " this is sum" + " res4");
        System.out.println(res5 + " this is sum" + " res5");}

}


// (число /10) % 10



















// Задание 15.7 Напишите класс, который должен принять с клавиатуры значение 123 и вывести на экран сообщение Код принят.
//              Класс будет снова и снова принимать с клавиатуры значения до тех пор, пока не будет введено значение 123.
//              На каждое вводимое с клавиатуры значение, отличное от 123, класс должен выводить сообщение Код неверный, повторите ввод.
//

      /*  Scanner scan = new Scanner(System.in);
//        System.out.println("Enter 123");
//        int value = scan.nextInt();

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
    }*/


       /* int value4;
        do {
            System.out.println("Enter 123");
            value4 = scan.nextInt();
            System.out.println( "cod not correct. try again" );

        } while (value4 != 123) ;
            System.out.println("cod accepted ");
        */
/*
        if (Objects.equals(value, 123)){
            System.out.println("cod accepted " + "Enter 123");
            int value2 = scan.nextInt();
        }
        else {
            System.out.println("cod not correct. try again");
            int value3 = scan.nextInt();
        }


            switch (value) {
                case 123 -> System.out.println( "cod accepted " + "Enter 123");
                default -> System.out.println( "cod not correct. try again");
            }
            int value2 = scan.nextInt();
        }*/


      //  }}}