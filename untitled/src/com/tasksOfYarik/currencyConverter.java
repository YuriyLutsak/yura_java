package com.tasksOfYarik;

import java.util.Scanner;

public class currencyConverter {
    public static void main(String[] args) {

        showRes();
        pairUnpairValue();
        differentSign();

        timeOfYearIf();
        timeOfYearSwitch();

    }

    public static float summa(){

        Scanner scan = new Scanner(System.in);

        System.out.println("Summa in dollars?");
        float dollar = scan.nextFloat();
        System.out.println("Course of bank in hryvnas?");
        float course = scan.nextFloat();

        float resSumm =  dollar * course;

        return resSumm;
    }
    public static void showRes(){

        System.out.println("Convertation to hryvnas is: " + summa());
    }

    public static void pairUnpairValue(){

    Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");

    int value = scan.nextInt();

        if (value % 2 == 0){
        System.out.println("pair");
    }
        else{
        System.out.println("unPair");
    }
        if (value==0){
        System.out.println("zero");
    }
}
public static void differentSign() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter value 1: ");
    int value1 = scan.nextInt();
    System.out.println("Enter value 2: ");
    int value2 = scan.nextInt();

    if (value2 > 0 && value1 > 0 || value2 < 0 && value1 < 0) {
        System.out.println("the same sign");
    } else if (value2 == 0 || value1 == 0) {
        System.out.println("uncorrected");
    } else {
        System.out.println("different sign ");
    }
}

public static void ascendingOrder(){
    //       Задание 7.11 Напишите класс, который принимает с клавиатуры два различных числа.
//               * Класс должен вывести на экран эти числа в порядке возрастания в одной строке,
//               * а в другой их же, но в порядке убывания.
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter value 1: ");
    int value1 = scan.nextInt();
    System.out.println("Enter value 2: ");
    int value2 = scan.nextInt();

    int resB = value1 % value2;
    if (resB == 0 || resB != 0) {
        System.out.println(value2 +" "+ value1);
        System.out.println(value1 +" "+ value2);
    }
}
    public static void timeOfYearSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of month");
        int month = scanner.nextInt();

        switch (month){
            case 1,2,12 -> System.out.println("winter");
            case 3,4,5 -> System.out.println("spring");
            case 6,7,8 -> System.out.println("summer");
            case 9,10,11 -> System.out.println("autumn");
            default -> System.out.println("such month is doesn't exist");
        }
    }

    public static void timeOfYearIf(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value: ");
        int month = scan.nextInt();


        if (month <= 0 || month > 12){
            System.out.println("error");
        }
        else if (month <= 2 || month == 12) {
            System.out.println("winter");
        }
        else if (month <= 5 && month > 2) {
            System.out.println("spring");
        }
        else if (month <= 8 && month > 5) {
            System.out.println("summer");
        }
        else if (month <= 11 && month >8) {
            System.out.println("autumn");
        }
    }

}

