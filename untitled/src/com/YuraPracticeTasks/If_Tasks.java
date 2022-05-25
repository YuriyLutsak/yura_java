package com.YuraPracticeTasks;

import java.util.Scanner;

public class If_Tasks {
    public static void main(String[] args) {
     /* Задание 6.6 Напишите класс, который принимает с клавиатуры целое число и выводит на экран
        одно из следующих сообщений: Положительное, или Отрицательное, или Ноль, -в зависимости от значения числа.
 */

      /*  Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value = scan.nextInt();

        if (value > 0){
            System.out.println(" Positive value: " + value);
        } else if (value < 0) {
            System.out.println(" Negative value: " + value);
        } else {
            System.out.println(value);
        }*/


//   Задание 6.7
//   Напишите класс, который принимает с клавиатуры целое положительное число и,
//   если оно как минимум трехзначное и положительное, уменьшает его на 1.
//
    /*Scanner scan1 = new Scanner(System.in);
        System.out.println("Enter value: ");
        int value1 = scan1.nextInt();

        if (value1 > 99){
            int res = value1 - 1;
            System.out.println("Three-digital is always subtracts one value " + res);
        }else {
            System.out.println(value1);
        }*/

        /*
         * Задание 6.11
         * Напишите класс, который принимает с клавиатуры два целых числа и,
         * если оба имеют одинаковый знак, на экран выводится сообщение Один
         * и тот же знак, а если разный, то на экран выводится сообщение Разные знаки.
         * Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
         *
         *
         * Задание 6.11 - сойдет, но я бы по другому решил.
         * Я бы проверил сначала на ноль, потом на одинаковые знаки, в елсе бы оставил разные.
         * Это помогло бы не писать одну сложную для понимания конструкцию. но код должен работать.
         */
/*

        Scanner scan2 = new Scanner(System.in);
        System.out.println(" Enter value 1: ");
        int val1 = scan2.nextInt();
        System.out.println(" Enter value 2: ");
        int val2 = scan2.nextInt();


        if (val1 < 0 && val2 < 0 || val1 > 0 && val2 > 0) {
            System.out.println(" Two of values has the SAME sign " + val1 + ", " + val2);
        } else if (val1 < 0 && val2 > 0 || val1 > 0 && val2 < 0) {
            System.out.println(" Two of values has DIFFERENT sign " + val1 + ", " + val2);
        } else {
            System.out.println("Uncorrect, one of the value is zero");
        }
*/

        /*
         * Задание 7.11 Напишите класс, который принимает с клавиатуры два различных числа.
         * Класс должен вывести на экран эти числа в порядке возрастания в одной строке,
         * а в другой их же, но в порядке убывания.
         *
         *
         * Задание 7.11 - намудрил что-то.
         * у тебя есть 2 варианта либа они стоят правильно, либо печатаешь наоборот.
         * А у тебя во втором ифе что-то не то происходит.
           вот тебе тест кейс. первое число 2, второе 1. должно вывести 1 2
         */

/*

        Scanner scan3 = new Scanner(System.in);
        System.out.println(" Enter value 1: ");
        int val11 = scan3.nextInt();
        System.out.println(" Enter value 2: ");
        int val22 = scan3.nextInt();

*/





       /* if (val11 < val22 || val11 > val22){
            System.out.println(val11 + " " + val22 + "\n" + val22 + " " + val11);
        }
        else if(val11 <= 0 && val22 <= 0){
            System.out.println(val22 + " " + val11 + "\n" + val11 + " " + val22);
        }*/
/*
 * Задание 8.15 Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
  какая из его двух цифр является большей.
  В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
  Не следует выводить на экран ни какого сообщения, если число составлено из одинаковых цифр.
     */

        Scanner scan4 = new Scanner(System.in);
        System.out.println(" Enter two-digital value: ");
        int val111 = scan4.nextInt();

        int res1 = val111 / 10;
        int res2 = val111 % 10;

        if(res1 > res2){
            System.out.println(res1 + " is bigger then " + res2);
        } else {
            System.out.println(res1 + " is less then " + res2);
        }



        /* Задание 9.14 Определим «текстовую форму оценки» следующим образом: 1 или 2 -«неудовлетворительно», 3  -«удовлетворительно»,
         * 4  -«хорошо», 5  -«ОТЛИЧНО». Напишите класс, который принимает с клавиатуры целое число и, если оно соответствует оценке,
         * выводит на экран соответствующую «текстовую форму оценки». В случае если число не является оценкой, следует вывести на
         * экран соответствующее текстовое сообщение.
         */

       /* Scanner scan5 = new Scanner(System.in);
        System.out.println(" Enter grade value: ");
        int grade = scan5.nextInt();

        switch (grade) {
            case 1, 2 -> System.out.println(" Your grade is: " + grade + " its unsatisfactory");
            case 3 -> System.out.println(" Your grade is: " + grade + " its satisfactory");
            case 4 -> System.out.println(" Your grade is: " + grade + " its good");
            case 5 -> System.out.println(" Your grade is: " + grade + " its excellent ");
            default -> System.out.println("this is not a grade, just value");
        }*/

        /* Задание 9.15 Напишите класс, который принимает с клавиатуры целое число, которое должно означать порядковый номер месяца.
         * В случае если полученное значение действительно соответствует порядковому номеру одного из месяцев,
         * следует вывести сезон (лето, осень, зима, весна), к которому относится месяц. В случае если введенное значение
         * не является порядковым номером месяца, следует вывести на экран соответствующее текстовое сообщение.
         */
/*

        Scanner scan5 = new Scanner(System.in);
        System.out.println(" Enter month number: ");
        int month = scan5.nextInt();

        switch (month) {
            case 12,1,2 -> System.out.println("winter");
            case 3,4,5 -> System.out.println("spring");
            case 6,7,8 -> System.out.println("summer");
            case 9,10,11 -> System.out.println("autumn");
            default -> System.out.println("this number is not much any month");
        }
    }
*/
scan2();
scan2();
scan2();

        scan2();
        scan2();
        scan2();
    }

        public static void scan() {
            Scanner scan2 = new Scanner(System.in);
            System.out.println(" Enter value 1: ");
            int val1 = scan2.nextInt();
            System.out.println(" Enter value 2: ");
            int val2 = scan2.nextInt();

            if (val1 == 0 || val2 == 0){
                System.out.println("incorrect");
            } else if (val1 < 0 && val2 < 0 || val1 > 0 && val2 > 0) {
                System.out.println(val1 +  " and " + val2 + " has same sign");
            } else {
                System.out.println(val1 +  " and " + val2 + " has different sign");
            }
        }

        public static void scan2(){
            Scanner scan3 = new Scanner(System.in);
            System.out.println(" Enter value 1: ");
            int val11 = scan3.nextInt();
            System.out.println(" Enter value 2: ");
            int val22 = scan3.nextInt();


//           у тебя есть 2 варианта либo они стоят правильно, либо печатаешь наоборот.
//         * А у тебя во втором ифе что-то не то происходит.
//           вот тебе тест кейс. первое число 2, второе 1. должно вывести 1 2


            /*if (val11 <= 0 || val22 <= 0){
                System.out.println(val22 + " " + val11 + "\n" + val11 + " " + val22);
            }else if (){
                System.out.println(val11 + " " + val22  + "\n" + val22 + " " + val11);

            }
            else if (val11 > val22){
                System.out.println(val22 + " " + val11 + "\n" + val11 + " " + val22);
            }else {
                System.out.println(val11 + " " + val22  + "\n" + val22 + " " + val11);
            }*/






            if (val11 <= val22){
                System.out.println(val11 + " " + val22 + "\n" + val22 + " " + val11);
            } else {
                System.out.println(val22 + " " + val11 + "\n" + val11 + " " + val22);
            }
        }
    }

