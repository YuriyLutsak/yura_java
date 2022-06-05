package com.YuraPracticeTasks.While;

import java.util.Scanner;

public class While155 {

    public static void main(String[] args) {
//thousand();
//codExcepted();
// suma();
       // counter();
      // sameValue(); //  не могу решить !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//quantityOfNumbers();
amountOfNumbers();
        //evenNumbers();
       // backwardNum();
    }

    public static void backwardNum(){
//        Задание 15.35 УУУУХХХХПОДГОРИТ))))
//        Напишите класс, который принимает с клавиатуры целое положительное число
//        и строит из него число с обратным порядком цифр.
//        Новое значение следует вывести на экран.


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







    public static void amountOfNumbers(){
       // Задание 15.29 Напишите класс, который принимает с клавиатуры целое число и
        // подсчитывает сумму его цифр.
        // Результат подсчета должен быть выведен на экран.
        // Например, для числа 534 на экран будет выведено 12.
        Scanner scan = new Scanner(System.in);
        System.out.println("value? ");

        int value  = scan.nextInt(); //  5 4 3
        int sum = 0;

        while (value != 0){
            value = value / 10;


            sum = value + value;
        }
        System.out.println(sum);


















    }

    public static void quantityOfNumbers(){
//        Задание 15.28 типичная задача для вайла))))
//        Напишите класс, который принимает с клавиатуры целое число и
//        подсчитывает число цифр в нем (количество цифр в числе).
//        Результат подсчета должен быть выведен на экран.
//        Например, для числа 534 на экран будет выведено 3 цифры.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter three-digital value: ");
        int val = scanner.nextInt();//456789
        int counter = 0;
//        int val3 =  val % 10;          // 9      -
//        int val2 =  val / 10 % 10;     // 45678  -
//        int val1 =  val / 100 % 10;    // 4567
//        int val0 =  val / 1000 % 10;   // 456
//        int val01 = val / 10000 % 10;  // 45
//        int val02 = val / 100000 % 10;      // 4
//        int val03 = val / 1000000;     // 0

        while (val != 0){
            val = val / 10;
            counter++;
        }
        System.out.println(counter);
    }

    public static void  sameValue(){
       // Задание 15.12
        // Напишите класс, который принимает с клавиатуры целые числа,
        // пока не будут введены с клавиатуры друг за другом два одинаковых числа.
        // Класс должен выводить на экран сумму серии за исключением последнего введенного с клавиатуры значения.

        Scanner scanner = new Scanner(System.in);
        System.out.println("your value: ");

        int valuePrev = scanner.nextInt();
        System.out.println("your next value");
        int valueNext = scanner.nextInt();

        int sum = valuePrev;// valuePrev = valuePrev + valueNext; // 1 2 3 4 4 = 14

        while (valuePrev != valueNext){  // for( ; valuePrev != valueNext; )
            // System.out.println("your next value");
            System.out.println("your next value");
            valuePrev = valueNext;
            valueNext = scanner.nextInt();
            sum += valuePrev; // sum = sum + valueNext;
            // res = valuePrev + valueNext; 0 1 1 2 3 5 8 fibonachi


            // int counter                      int sum/multiply
            //  counter++               sum = sum + number /multiply = multiply * number
            //                          sum += number;
        }
        System.out.println(sum);

    }

    public static void counter(){
        //Напишите класс,
        // который принимает с клавиатуры число для переменной Х,
        // а затем дополнительную серию чисел, каждое из которых используется для уменьшения значения переменной Х.
        // Ввод чисел должен производиться до тех пор, пока значение переменной Х остается положительным.

        Scanner scanner = new Scanner(System.in);
        System.out.println("your value:");

        int value = scanner.nextInt();

        while (value >= 0){
            System.out.print (value + " ");
            value--;
           // System.out.print ("\n" + value + " ");
        }
       // System.out.print ("\n" + value + " ");
    }


    public static void suma(){
//        Задание 15.8
//        Напишите класс, который принимает с клавиатуры значения,
//        пока их сумма остается меньше 150.
//        По окончании ввода следует вывести на экран
//        информацию о количестве введенных значений и их сумме.

        Scanner scan = new Scanner(System.in);

        int value = 0;
        int counter = 0;
        int res = 0;

        while (res < 150){
            System.out.println(" your value: ");
            value = scan.nextInt();

            res  += value; //  res = res + value;
            counter++; // counter += 1
        }
        System.out.println(counter + ", res = " + res);
    }

    public static void thousand(){
        //Задание 15.5
        // Напишите класс, который принимает с клавиатуры числа,
        // пока не будет введено значение 999.
        // Класс должен подсчитать, сколько значений было введено с клавиатуры (не считая значения 999),
        // и вывести эту информацию на экран.
        Scanner scan= new Scanner(System.in);
        int value = 0;
        int counter = 0;

        do {System.out.println("your value: ");
            value = scan.nextInt();

            counter++;

        } while (value != 999);
        System.out.println(counter);

    }

    public static void codExcepted(){
        //Задание 15.7
        // Напишите класс, который должен принять с клавиатуры значение 123
        // и вывести на экран сообщение Код принят.
        // Класс будет снова и снова принимать с клавиатуры значения до тех пор,
        // пока не будет введено значение 123.
        // На каждое вводимое с клавиатуры значение, отличное от 123,
        // класс должен выводить сообщение Код неверный, повторите ввод.

        Scanner scanner = new Scanner(System.in);

        int wrongedCode = 0;

 //       System.out.println(" enter number 123: ");
//        while (wrongedCode != 123) {
//               wrongedCode = scanner.nextInt();
//
//               if (wrongedCode != 123){
//            System.out.println(" wrong code, try again");}
//        }
//
//        System.out.println(" cod excepted.");

// second option

        do {
            System.out.println("your number: ");
            if (scanner.hasNextInt()) {
                wrongedCode = scanner.nextInt();
            }

           if (wrongedCode != 123){
            System.out.println(" wrong code, try again");
           }
        }
        while (wrongedCode != 123);
        System.out.println(" cod excepted.");
    }

}
