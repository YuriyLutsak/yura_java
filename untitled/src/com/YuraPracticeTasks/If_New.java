package com.YuraPracticeTasks;

import java.util.Scanner;

public class If_New {
    public static void main(String[] args) {

       /* char number = 'a';
        int n = number;
        System.out.println(number);   // => a
        System.out.println("number"); // строка
        System.out.println(n);        // => вывод цифрового значения
*/

triangle();
        triangle();
        triangle();

        triangle();
        triangle();
        triangle();
        triangle();
        triangle();
        triangle();

    }
public static void symbol(){
//    Задание 9.35
//    (Тут есть нюансы по работе с char, можем обговорить).
//    Напишите класс, который читает с клавиатуры символ и проверяет,
//    является ли введенный символ буквой латинского алфавита.
//    По результатам проверки следует вывести на экран соответствующее сообщение.

    Scanner Scanner = new Scanner(System.in);
    System.out.println("Your value? ");
    char decimal = Scanner.next().charAt(0);

    int n = decimal;
    System.out.println(n + " " + decimal);
    // A - 65 , Z - 90 ;  ||   a - 97 , z - 122.

    if (decimal >= 65 && decimal <= 90 || decimal >= 97 && decimal <= 122){
        System.out.println(" your value is equals of letter from latin alphabet");
    }else {
        System.out.println("not"); // table asci
    }
}

    public static void triangle (){
//        Задание 9.7 (отличная задача на все знание про if)
//
//        Напишите класс, который принимает с клавиатуры два числа,
//        которые должны быть значениями двух нижних (у основания) углов в треугольнике.

//        Класс должен определять, о каком из следующих типов треугольников идет речь:
//        остроугольный, тупоугольный, прямоугольный, равнобедренный, равносторонний
//        (возможно, что треугольник относится сразу к двум типам).
//        В случае если введенные с клавиатуры данные (или хотя бы одно из них) не могут быть углами треугольника,
//        следует вывести на экран сообщение Ошибочные данные.
//
//        PS. сума углов треугольника равна 180 градусов.
//        тупоугольный  если нижний угол больше 90 градусов,
//        остроугольный - каждый нижний меньше 90 градусов,
//        равнобедренный если 2 угла равны,
//        равносторонний если все углы равны.

        // какой вид триугольника и является ли он равнобедренным

        Scanner scan = new Scanner(System.in);
        System.out.println("Your first value? ");
        int value = scan.nextInt();
        System.out.println("Your second value? ");
        int value2 = scan.nextInt();
        int value3 = 180 - value - value2;


        if (value + value2 >= 180) {
            System.out.println(" mistake data");
        } else {

            if (value == 90 || value2 ==90 || value3 == 90) {
                System.out.print("priamougolnii, ");
            } else if (value > 90 || value2 > 90 || value3 > 90) {
                System.out.print("tupouholnii, ");
            } else {
                System.out.print("ostrouhol, ");

                if (value == value2 && value == value3 && value2 == value3) {
                    System.out.println("ravnostoronnii");
                    return;
                }
            }

            if (value == value2 || value2 == value3 || value == value3) {
                System.out.println("ravnobedrenii");
            } else {
                System.out.println("raznostoronnii");
            }
        }


    }

    public static void flor (){
//        Задание 9.5*  уже решал. ща еще раз по памяти.
//        (тут вродь как без составного ифа, но задачка со звездочеойю. На пошевелить мозгами)
//
//        На каждом этаже многоэтажного дома расположены три квартиры;
//        счет квартир идет слева направо. Например, на первом этаже квартира No 1 расположена слева,
//        квартира No 2 -в центре, квартира No 3 -справа, и так далее. Напишите класс,
//        который принимает с клавиатуры номер квартиры и выводит на экран следующую информацию:
//        на каком этаже она расположена, и какое место (слева, справа или в центре) она занимает на этом этаже.
        Scanner scan = new Scanner(System.in);
        System.out.println("Your flat number ");
        int flat = scan.nextInt();

        int florNum = flat / 3; // как найти этаж мне Ярик подсказал. Остальное сам. гы!

        if (flat % 3 == 0){
            System.out.println("this flat is right,");
            System.out.println(" flor number is: " + florNum);
        }

        else if (flat % 3 == 1) {
            System.out.println("this flat is left");
            int florNum2 = florNum + 1;
            System.out.println(" flor number is: " + florNum2);
        }

        else {
            int florNum3 = florNum + 1;
            System.out.println("this flat is middle");
            System.out.println(" flor number is: " + florNum3);
        }




//        7 8 9
//        4 5 6
//        1 2 3
    }


    public static void biggerLess() {

        //  Задание 8.15
        //  Напишите класс, который принимает с клавиатуры двузначное положительное число и проверяет,
        //  какая из его двух цифр является большей.
        //  В соответствии с результатом проверки надо вывести на экран соответствующее текстовое сообщение.
        //  Не следует выводить на экран никакого сообщения, если число составлено из одинаковых цифр.
        Scanner scan = new Scanner(System.in);
        System.out.println("Your two-digital value? ");
        int value = scan.nextInt();

        int val1 = value % 10;
        int val2 = value / 10;

        if (val1 == val2){}
        else if(val1 < val2){
            System.out.println(" first value is bigger then second");
        }else {
            System.out.println(" second value is bigger then first");
        }

    }

    public static void increase() {

        //  Задание 7.11
        //  Напишите класс, который принимает с клавиатуры два различных числа.
        //Класс должен вывести на экран эти числа в порядке возрастания -в одной строке, а в другой -их же, но в порядке убывания.

        Scanner scan = new Scanner(System.in);
        System.out.println("Your first value? ");
        int value = scan.nextInt();
        System.out.println("Your second value? ");
        int value2 = scan.nextInt();

        if (value < value2){
            System.out.println(value + " " + value2);
            System.out.println(value2 + " " + value);
        } else if (value == value2) {
            System.out.println(" value is equal");
        } else {
            System.out.println(value2 + " " + value);
            System.out.println(value + " " + value2);
        }

    }
public static void division() {
//    Задание 6.11.1 (моя задача)
//    Напишите класс, который принимает с клавиатуры одно целое число.
//    Если оно делиться на 2 выведи "Делиться на 2".
//    Если оно делиться на 3 выведи "Делиться на 3".
//    Если оно делиться на 4 выведи "Делиться на 4".
//    Если число делиться на несколько этих чисел, выведи соответствующие надписи.
    Scanner scan = new Scanner(System.in);
    System.out.println("Your value? ");
    int value = scan.nextInt();

    if  (value == 2 && value / 2 == 1){
        System.out.println( value + " division on 2");
    }
    else if (value == 3 && value % 3 == 0 || value % 3 == 0){
        System.out.println(" division on 3");
    }
    else if (value == 4 && value % 4 == 0){
        System.out.println(" division on 4");
    }
    else if (value % 2 != 0) {
        System.out.println("has not division on 2 and 4 without remainder");
    } else {
        System.out.println(" has division on 2 and 4");
    }


}
    public static void incorrect(){

//    Задание 6.11
//    Напишите класс, который принимает с клавиатуры два целых числа и, если оба имеют одинаковый знак,
//    на экран выводится сообщение Один и тот же знак, а если разный, то на экран выводится сообщение Разные знаки.
//    Если же хотя бы одно из чисел равно О, выводится сообщение Некорректно.
        Scanner scan = new Scanner(System.in);
        System.out.println("Your first value? ");
        int value = scan.nextInt();
        System.out.println("Your second value? ");
        int value2 = scan.nextInt();

        if (value == 0 || value2 == 0){
            System.out.println("Incorrect");
        } else if (value > 0 && value2 > 0 || value < 0 && value2 < 0) {
            System.out.println( "the same sign ");
        }else {
            System.out.println("different sign "); }


    }

    public static void positiveNegativeVal() {
//    Задание 6.6
//    Напишите класс, который принимает с клавиатуры целое число и выводит на экран одно из следующих сообщений:
//    Положительное, или Отрицательное, или Ноль, в зависимости от значения числа.
  //      Задание 6.7
//    Напишите класс, который принимает с клавиатуры целое положительное число и,
//    если оно как минимум трехзначное и положительное, уменьшает его на 1.


        Scanner scan = new Scanner(System.in);
        System.out.println("Your value? ");
        int value = scan.nextInt();

        if (value == 0) {
            System.out.println(value);
        } else if (value > 0 && value > 99) {
            int res = value - 1;
            System.out.println("Positive " + value + " " + " decrease by 1 = " + res);
        }else{
            System.out.println("Negative " + value);
        }
    }

}
