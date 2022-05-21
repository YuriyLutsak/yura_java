package com.YuraPracticeTasks;

import java.util.Scanner;

public class NewTaskUnknown {
    public static void main(String[] args) {
//centimeter();
//currencyExchange();
//  scoreUnderCover();
        backwardPlusNum();





    }

    public static void backwardPlusNum(){
//        Задание 4.7
//                Напишите класс, который принимает с клавиатуры целое положительное двузначное число.
//                Затем следует построить новое значение, составленное из цифр числа, введенного с клавиатуры, но в обратном порядке.
//                После этого новое значение следует увеличить на 8, и окончательный результат вывести на экран.
//                То есть для числа 37 следует построить число 73 и вывести на экран 81.

        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter two-digital value: ");
        int val = scanner.nextInt();

        int val1 = val / 10;
        int val2 = val % 10;
        int back = val2 * 10 + val1;
        System.out.println(back);
        int res = back + 8;
        System.out.println(res);



    }

    public static void divisionValue (){
//       Задание 4.2
//       ОХ ДОЛГО Я ЭТО ВЫВОДИЛ!!!!!!!!!
//       Напишите класс, который принимает с клавиатуры целое положительное трехзначное число
//       и выводит на экран его цифры, разделенные знаком «пробел».

        //  И обратном порядке. соединил я пару задачь, SORYAN))


        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter three-digital value: ");
        int val = scanner.nextInt();

        int val1 = val / 100;
        int val2 = val / 10 % 10;
        int val3 = val % 10;

        System.out.println(val1 + " " + val2 + " " + val3);
        System.out.println(val3 + " " + val2 + " " + val1);

//        Задание 4.6
//        Напишите класс, который принимает с клавиатуры целое положительное трехзначное число
//        и выводит его на экран в «полном виде»:
//        например, для числа 364 это будет выглядеть как 300+60+4.

        int val100 = val - val % 100;
       // int val011 = (val - val100) % 10;                   это моя логика,
        //int val010 = val011 - val / 10;                     я ее специально не удалял
        int val001 = val % 10;
        int vall = (val % 100) - (val % 10);

        System.out.println(val100 + " + " + vall + " + " + val001 );



    }

    public static void scoreUnderCover (){
//        Задание 3.9
//        Компания по продаже минеральной воды проводит конкурс «Балл под крышкой»:
//        на внутренней стороне пробок, которыми закрыты бутылки, выпускаемые компанией, напечатаны призовые баллы.
//        Есть пробки, «равные» 10 баллам, есть -100, есть -1000.
//        Напишите класс, который принимает с клавиатуры три числа,означающие количество пробок каждого типа, собранных Васей,
//        и выводит на экран общее количество баллов, которые Вася получил.

        Scanner scan  = new Scanner(System.in);
        System.out.println(" enter amount of cork, which has 10 points: ");
        int cork10 = scan.nextInt();
        System.out.println(" enter amount of cork, which has 100 points: ");
        int cork100 = scan.nextInt();
        System.out.println(" enter amount of cork, which has 1000 points: ");
        int cork1000 = scan.nextInt();


        int score1 = 10 * cork10;
        int score2 = 100 * cork100;
        int score3 = 1000 * cork1000;

        int result = score1 + score2 + score3;

        System.out.println(result + " - your balls");

    }
    public static void  currencyExchange(){
//        Задание 3.4 Для пересчета суммы в одной валюте -в сумму в другой валюте (например, между суммой в гривнах и этой же суммой,
//                 но в евро) используется так называемый «банковский курс»:
//                  числовой коэффициент, показывающий, чему равна единица одной валюты в единицах другой.
//                Напишите класс, который принимает с клавиатуры два числа: первое -сумму в одной валюте (например, в долларах),
//                и второе -«банковский курс». Класс должен подсчитать и вывести на экран сумму во второй валюте.

        Scanner scan  = new Scanner(System.in);
        System.out.println(" enter sum in your currency: ");
        float sumCurrency = scan.nextFloat();
        System.out.println(" enter bank course: ");
        float currencyExchange = scan.nextFloat();
        float sumExchange = sumCurrency * currencyExchange;
        System.out.println(" sum Exchange is: " + sumExchange);
    }

public static void centimeter(){
    //        Задание 3.2 Во многих странах для измерения небольших размеров используется не только единица длины «сантиметр»,
//        но и такая единица, как «дюйм>> (1дюйм = 2.54 сантиметра).
//        Напишите класс, который принимает с клавиатуры значение, равное размеру в сантиметрах,
//        и затем подсчитывает и выводит на экран это же значение, но в дюймах.

    Scanner scan  = new Scanner(System.in);
    System.out.println(" enter value with centimeter: ");
    double centimeter = scan.nextDouble();

    double resInch = centimeter * 2.54;
    System.out.println(" in " + centimeter + " is " + resInch + " inch");
}

}
